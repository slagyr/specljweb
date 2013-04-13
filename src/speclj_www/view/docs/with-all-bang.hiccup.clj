[:h3 "with-all!"]

[:div {:id "comp_box"}

  [:p "Non-lazy version of with-all"]

  [:pre [:code "
  (describe \"with-all!\"
    (def non-lazy-with-all-calls (atom 0))
    (with-all! with-bang-example
           (swap! non-lazy-with-all-calls inc))

    (it \"has been deref'ed upon instantiation\"
      (should= 1 @non-lazy-with-all-calls))

    (it \"has not been reset and deref'ed\"
      (should= 1 @non-lazy-with-all-calls)))
  "]]]
