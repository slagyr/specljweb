[:h3 "tags"]

[:div {:id "comp_box"}
  [:p "Add tags to wrap related tests.  Values passed will be converted into keywords."]

  [:code "(describe \"I/O Tests\"<br />
    &nbsp;&nbsp;(tags :unit)
    &nbsp;&nbsp;&nbsp;&nbsp; ;tests contained here
    )"]

  [:p "Tags can be filtered at runtime using the -t flag. In the example below, only the tests wrapped in the unit tag will be run."]

  [:code "lein spec -t unit"]

  [:p "To specify certain tests to exclude, prepend the tag name with ~."]

  [:code "lein spec -t ~unit"]]
