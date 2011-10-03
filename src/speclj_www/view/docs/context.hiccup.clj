[:h3 "context"]

[:div {:id "comp_box"}
  [:p "Adds extra description to tests. Used to help group related tests together so that the reader of the test file can quickly identify what tests cover what functionality."]

  [:code "(context \"I/O Tests\"<br />
		&nbsp;&nbsp;(it \"tests the input of prompt\"<br />
			&nbsp;&nbsp;&nbsp;&nbsp;(should= \"13\" <br />
			&nbsp;&nbsp;&nbsp;&nbsp;(with-in-str \"13\" (prompt \"Enter input: \"))))<br />
	<br />
		(it \"tests the output of prompt\"<br />
			&nbsp;&nbsp;(should= \"Where is my money?\n\"<br />
				&nbsp;&nbsp;&nbsp;&nbsp;(with-out-str (with-in-str \"10\"<br />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(prompt \"Where is my money?\"))))))"]]