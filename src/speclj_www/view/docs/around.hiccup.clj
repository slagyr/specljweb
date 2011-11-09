[:h3 "around"]

[:div {:id "comp_box"}
  [:p (:doc (meta #'around))]

  [:code "(declare *the-answer*) ; outside of a describe<br />
    <br />
    (around [it]<br />
    &nbsp;&nbsp;(binding [*the-answer* 42]<br />
    &nbsp;&nbsp;&nbsp;&nbsp;(it)))<br />
    <br />
    (it \"knows the answer\"<br />
    &nbsp;&nbsp;(should= 42 *the-answer*))"]]