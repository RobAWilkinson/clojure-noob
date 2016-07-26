(ns clojure-noob.core)

;2
(defn add100 "adds 100" [num]
  (+ num 100))
(add100 2)

; ex 3
(defn dec-maker [num]
  (fn [arg] (- arg num)))
(def dec9 (dec-maker 9))
(dec9 10)

;ex 4

(defn mapset "doc-string" [func arg]
  (set (map func arg)))
(mapset inc [1 4 2])
(defmacro backwards
  [form]
  (reverse form))
(backwards (" backwards" " am " "I" str))
