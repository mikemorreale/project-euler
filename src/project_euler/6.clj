(ns project-euler.core
  (:require [clojure.math.numeric-tower :as math]))

(defn square-of-sum [n]
  (math/expt (/ (* n (+ n 1)) 2) 2))

(defn sum-of-squares [n]
  (/ (* (* n (+ n 1)) (+ (* 2 n) 1)) 6))

(- (square-of-sum 100) (sum-of-squares 100))
