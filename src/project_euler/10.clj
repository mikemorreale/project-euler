(loop [primes [] n 2]
  (if (< n 2000000)
    (recur 
      (if (empty? (filter #(zero? (mod n %)) primes))
        (conj primes n)
        primes)
      (+ n 1))
  	(reduce + primes)))
