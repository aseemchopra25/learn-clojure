(ns learn-clojure.core)

(def foo 
  (let [l "light"] (println (str "Let there be " l "!"))))

(def foo2
(let [d "darkness"] (println (str "Let there also be " d "!"))))

(defn -main []
  foo
  foo2)
