(ns clojure-noob.core)

(defn vowel-indices [word]
  (vec (keep-indexed  (fn [index item]
                        (when (> (.indexOf "aeiouy" (clojure.string/lower-case (str item))) -1)
                          (inc index))) word)))
(fn [arr totalcount]
  (loop [arr arr innercount 0]
    (if (= totalcount innercount)
      (first arr)
      (recur (rest arr) (inc innercount)))))
(fn tester [arr]
  (reduce (fn [prev curr]
            (inc prev))
          0
          arr))

(tester "hello")
(counter '(4 5 6 7) 2)
(last [1 2 3])
; (defn reverser [arr]
;   (loop [arr arr]
;     (if (= (count arr) 1)
;       (first arr)
;       (conj [(last arr)] (recur (pop arr))))))
(into [4] [3 2 1])
(fn [arr]
  (reduce (fn [prev curr]
            (into [curr] prev))
          []
          arr))
(reduce conj () [1 2 3 4 5])
(conj 1 2)
(mod 2 2)
(filter (fn [val] (not (= (mod val 2) 0))) [1 2 3])
(filter odd? [1 2 3])

(defn fibfinder [counter]
  (loop [arr [1 1]]
    (if (= counter (count arr))
      arr
      (recur (concat arr [(+ (last arr) (nth arr (- (count arr) 2)))])))))
(fibfinder 3)
