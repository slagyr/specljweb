[:h3 "around"]

[:div {:id "comp_box"}
  [:p "Declares a function that will be invoked around each characteristic of the containing describe scope. The characteristic will be passed in and the around function is responsible for invoking it."]

  [:code "(declare *the-answer*) ; outside of a describe<br />
    <br />
    (around [it]<br />
    &nbsp;&nbsp;(binding [*the-answer* 42]<br />
    &nbsp;&nbsp;&nbsp;&nbsp;(it)))<br />
    <br />
    (it \"knows the answer\"<br />
    &nbsp;&nbsp;(should= 42 *the-answer*))"]]