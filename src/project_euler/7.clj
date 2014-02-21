(loop [primes [] n 2]
  (if (= 10001 (count primes))
    (get primes 10000)
    (recur 
      (if (empty? (filter #(zero? (mod n %)) primes))
        (conj primes n)
        primes)
      (+ n 1))))
