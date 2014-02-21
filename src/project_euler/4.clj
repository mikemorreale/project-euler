(defn get-digit [n i]
  (nth (str n) i))

(defn palindrome? [n]
  (if (or (and (= (count (seq (str n))), 5) (= (get-digit n 0) (get-digit n 4)) (= (get-digit n 1) (get-digit n 3)))
          (and (= (count (seq (str n))), 6) (= (get-digit n 0) (get-digit n 5)) (= (get-digit n 1) (get-digit n 4)) (= (get-digit n 2) (get-digit n 3))))
    n
    0))

(apply max (map palindrome? (map #(reduce * %) (for [i (range 100 999) j (range 100 999)] (vector i j)))))
