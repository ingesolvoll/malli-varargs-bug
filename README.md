# Malli bug reproduction

## Reproduction steps

1. Start the app
    ```console
    npx shadow-cljs watch app
    ```
2. Open [http://localhost:8020](http://localhost:8020).
3. Open the browser console
4. Observe the error `Uncaught Error: 1 is not ISeqable`

I suspect this is because we are replacing the original var using `set!`
in the instrumentation. `1` in this case seems to be bound to the 
`& args` of the instrumentation wrapper.
