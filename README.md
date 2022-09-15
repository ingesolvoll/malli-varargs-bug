# Malli bug reproduction

## Reproduction steps

1. Start the app
    ```console
    npx shadow-cljs watch app
    ```
2. Open [http://localhost:8020](http://localhost:8020).
3. Open the browser console
4. Observe no schema error
5. Uncomment the Malli schema in `starter.function/my-function`
6. Observe a schema error
7. Comment out the Malli schema in `starter.function/my-function`
8. Observe that after hot-loading, the function is still instrumented and throws errors
9. Reload the browser (or open the same URL in a different browser)
10. Observe that `my-function` is still instrumented, even after reloading the browser
