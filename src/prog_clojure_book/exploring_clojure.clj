(ns pro-clojure-book.exploring-clojure)

;;como citado em clojure nao existe instrucoes, apenas expressoes
;;(expressoes retornam valores) e esses valores podem ser usados e aninhados em outras expressoes
(+ 2 3)

(+ 2 3 4)

(+ 2 (+ 3 4))

(+ 2 (+ 3 (+ 4 5)))

(+ 2 (+ 3 (+ 4 (+ 5 6))))

(+ 2 (+ 3 (+ 4 (+ 5 (+ 6 7)))))


(let [x 2
      y 3]
  (+ x y))

(let [x (+ 2 3)]
  x)



;;refer: "Clojure programs. In Clojure,
;; there are no statements, only expressions that can be nested in mostly arbitrary ways.
;; When evaluated, every expression returns a value
;; Miller, Stuart, Breda (2018) p19 Programming Clojure 3th Edition.
