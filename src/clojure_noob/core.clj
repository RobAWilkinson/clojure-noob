(ns clojure-noob.core
  (require [clojure.reflect :as reflect])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot"))
(nil? false)
(nil? true)

(or false nil :large_I_mean_venti :why_cant_I_just_say_large)
(or (= 0 1) (= "yes" "no"))
(defn error-message
  [severity]
  (str "OH GOD ITS A DISASTER WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED"
         "DOOMED")))
(error-message :mild)
(error-message :strong)
(def hashy
  {:name
   {:first "Charlie"
    :last "McFishwish"}})

(println (get-in hashy [:name :first]))
(nth '(1 2 3 4) 1)
(println #{"kurt" 20 :icicle})
; After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.

; You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.

; Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.

; Write a code that gives out the total amount for different days(d).
(defn rental-car-cost [d]
  (- (* 40 d)
     (if (> d 6)
       50
       (if (> d 2)
         20
         0))))
(rental-car-cost 8)

; We want to know the index of the vowels in a given word, for example, there are two vowels in the word super (the second and fourth letters).

; So given a string "super", we should return a list of [2, 4].

; Some examples:
; Mmmm  => []
; Super => [2,4]
; Apple => [1,5]
; YoMama -> [1,2,4,6]
; NOTE: Vowels in this context refers to English Language Vowels - a e i o u y

; NOTE: this is indexed from [1..n] (not zero indexed!)
(defn vowel-indices [word]
  (vec (keep-indexed  (fn [index item]
                        (when (> (.indexOf "aeiou" (clojure.string/lower-case (str item))) -1)
                          (inc index))) word)))
(let [vowels ["a" "e" "i" "o" "u"]]
  (map #(contains? vowels %) (seq "amm")))

(vowel-indices "super")
(.indexOf "su" "u")
