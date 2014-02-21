(ns project-euler.core
  (:gen-class))

(defn -main
  [& args]
  (println "Use \"(solve n)\" to print the solution to a Project Euler problem."))

(defn solve
  [n]
  (load-file (str "src/project_euler/" n ".clj")))
