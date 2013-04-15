[:h3 "with!"]

[:div {:id "comp_box"}

  [:p "Immediately dereferenced verision of with component."]
  [:pre [:code "
  (describe \"with!\"
    (def non-lazy-calls (atom 0))
    (with! with-bang-example
           (swap! non-lazy-calls inc))

    (it \"has been deref'ed upon instantiation\"
      (should= 1 @non-lazy-calls))

    (it \"has been reset and deref'ed, not lazy\"
      (should= 2 @non-lazy-calls)))
  "]]]
