(defn triangular-number
  [n]
  (reduce + (range 1 (+ n 1))))

(defn triangular-numbers
  ([] (triangular-numbers 1))
  ([n] (cons (triangular-number n) (lazy-seq (triangular-numbers (inc n))))))

(defn divisor-count
  [n]
  (inc (count (keep #(if (zero? %) %) (map #(mod n %) (range 1 (+ (/ n 2) 1)))))))

(first (filter #(> (divisor-count %) 500) (triangular-numbers)))
