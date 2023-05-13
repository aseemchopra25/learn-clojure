(ns learn-clojure.core)

(def foo 
  (let [l "light"] (println (str "Let there be " l "!"))))

(defn -main []
  foo)
