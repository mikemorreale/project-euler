(loop [n 600851475143 factor 2]
  (if (= n 1)
    factor
    (if (zero? (mod n factor))
      (recur (/ n factor) factor)
      (recur n (+ factor 1)))))
