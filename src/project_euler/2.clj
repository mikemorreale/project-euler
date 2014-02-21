(loop [sum 0
	     n1 1
	     n2 1]
  (if (< n1 4000000)
    (recur (if (even? n1) (+ sum n1) sum) n2 (+ n1 n2))
  sum))
