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



;; Numbers
(+)    ;=> returns 0
(+ 2) ;=> returns 2

(- 10 5)
;=> 5
(* 3 10 10)
;=> 300
(> 5 2)
;=> true
(>= 5 5)
;=> true
(< 5 2)
;=> false
(= 5 2)
;=> false


;Division may surprise you:
(/ 22 7)
;=> 22/7
;As you can see, Clojure has a built-in ratio type.
;If what you actually want is decimal division, use a floating-point literal for
;the dividend:
(/ 22.0 7)
;=> 3.142857142857143

;=>If you want to stick to integers, you can get the integer quotient and remainder
;=>with quot and rem:
(quot 22 7)
;=> 3
(rem 22 7)
;=> 1


