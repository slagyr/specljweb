(ns speclj_www.view.view-helpers-spec
  (:require [speclj.core :refer :all]
            [speclj_www.view.view-helpers :refer :all]))

(describe "view_helpers_spec.clj"

    (it "spec components"
      (should= true (> (count speclj-components) 15))
      (doseq [name speclj-components]
        (should-not= true (.startsWith name "-"))
        (should-not= true (.startsWith name "*")))
      )


    )