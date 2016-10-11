(ns reveal.slides)

(def slide-1
  [:section
   [:h1 "Clojure Script"]
   [:h3 "(Or the other end)"]
   [:p "presentation Based on "
    [:a {:href "https://github.com/n2o/reveal-cljs/"} "reveal-cljs"]]])

(def slide-2
  [:section
   [:section
    [:h2 "Pick your constraits"]]
   [:section
    [:h2 "Want types?"]
    [:p "Check out " [:a {:href "https://github.com/clojure/core.typed"} "core.typed"]]]
   [:section
    [:h2 "Or maybe Contracts"]
    [:p "Included"]
    [:pre
     [:code
"(defn a-cool-func
    [with params]
    {:pre (fn [&args] (= (count args) 2))}
    (str  params))"]]]
   [:section
    [:h2 "Or almost types"]
    [:p "Check out " [:a {:href "https://github.com/plumatic/schema"} "Prismatic/schema"]]]])

(def slide-3
  [:section
   [:section
    [:h2 "make code your medum"] ]
   [:section
    [:h2 "Responsive reload tooling"]
    [:p "Check out " [:a {:href "https://github.com/bhauman/lein-figwheel"} "figwheel"]]]
   [:section
    [:h2 "Code as a workspace"]
    [:p "demo"]]
   [:section
    [:h2 "Powerful interactive testing"]
    [:p "Check out " [:a {:href "http://rigsomelight.com/devcards/#!/devdemos.core"} "devcards"]]]])

(def slide-4
  [:section
   [:section
    [:h2 "Incredible community"]]
   [:section
    [:h3 "Clojure is a lisp"]
    [:p "For some reason people who like to think about CS flock to LISPs"]]
   [:section
    [:h3 "This is great"]
    [:p "They build simple, powerful tools"]]
   [:section
    [:h3 "Core.Spec"]]
   [:section
    [:h3 "re-frame"]]])

(def slide-5
  [:section
   [:section
    [:h2 "Learn it!"]]
   [:section
    [:h2 "start small"]
    [:p [:a {:href "http://clojurescriptkoans.com/"} "The koans"]]]
   [:section
    [:h2 "Grab a good book"]
    [:p [:a {:href "http://www.braveclojure.com/"} "Clojure for the brave and true"]]]
   [:section
    [:h2 "Grab a deep book"]
    [:p [:a {:href "https://www.manning.com/books/the-joy-of-clojure-second-edition"} "The Joy of Clojure, Second Edition"]]]])

(def slide-6
  [:section
   [:section
     [:h2 "Thank you!"]]])
(defn all
  "Add here all slides you want to see in your presentation."
  []
  [slide-1
   slide-2
   slide-3
   slide-4
   slide-5
   slide-6])




(comment
  (.next js/Reveal)


  (.prev js/Reveal)

  )
