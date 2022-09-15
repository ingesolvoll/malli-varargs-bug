(ns starter.function)

(defn my-function-good
      {:malli/schema [:=> [:cat :int] :any]}
      [x]
      (prn "X is " x)
      123)

(defn my-function-bad
      {:malli/schema [:=> [:cat :int [:* :any]] :any]}
      [x & args]
      (prn "X is " x " args are " args)
      123)
