(ns learn-clojure.core)

(defn say-hello
  "Takes name argument and says hello to the name"
  [name]
  (println (str "Hello, " name))
  (let [l "light"
        d "darkness"]
    (println (str "Let there be " l))
    (println (str "Let there also be " d))))

(defn -main []
  (say-hello "Aseem")
  )
