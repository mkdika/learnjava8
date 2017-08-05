package com.mkdika.learnjava8.concurrent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 *
 * @author unicorn10
 */
public class Java8FutureApi {

    private static final String URL_PATH = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css";
    private final ExecutorService pool = Executors.newFixedThreadPool(1);

    public static void main(String[] args) throws MalformedURLException, InterruptedException, IOException, ExecutionException {
        Java8FutureApi future = new Java8FutureApi();

        // with blocking API
        long p1 = System.currentTimeMillis();
        System.out.println(future.startDownloadingBlocking(new URL(URL_PATH)));
        long p2 = System.currentTimeMillis();
        System.out.println("BLOCKING DONE! " + (p2 - p1) + " msecs.");
        
        System.out.println("");

        // With assync Future API        
        long p3 = System.currentTimeMillis();
        final Future<String> contentsFuture = future.startDownloadingFuture(new URL(URL_PATH));
        while (!contentsFuture.isDone()) {
            // here u can do other computation while waiting for download.
        }
        System.out.println(contentsFuture.get());
        long p4 = System.currentTimeMillis();
        System.out.println("FUTURE DONE! " + (p4 - p3) + " msecs.");
    }

    public Future<String> startDownloadingFuture(final URL url) throws IOException {
        return pool.submit(() -> {
            try (InputStream input = url.openStream()) {
                return new BufferedReader(new InputStreamReader(input)).lines()
                        .parallel().collect(Collectors.joining("\n"));

            }
        });
    }

    public String startDownloadingBlocking(final URL url) throws IOException {
        try (InputStream input = url.openStream()) {
            return new BufferedReader(new InputStreamReader(input)).lines()
                    .parallel().collect(Collectors.joining("\n"));
        }
    }
}
