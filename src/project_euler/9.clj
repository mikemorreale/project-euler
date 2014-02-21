(ns project-euler.core
  (:require [clojure.math.numeric-tower :as math]))

(let [triplet (for [a (range 1 1000)
                    b (range 1 1000)
                    :when (< (+ a b) 1000)]
  (let [c (- 1000 (+ a b))]
    (if (= (+ (math/expt a 2) (math/expt b 2)) (math/expt c 2)) (* a b c))))]
  (first (distinct (keep identity triplet))))
