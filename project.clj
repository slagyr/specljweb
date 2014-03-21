(defproject speclj_www "1.0.0"
  :description "Speclj's Documentation Website"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [joodo "2.0.0"]
                 [speclj "2.9.1"]]
  :dev-dependencies [[speclj "2.9.1"]]
  :test-paths ["spec/"]
  :java-source-paths ["src/"]
  :min-lein-version "2.0.0"
  :plugins [[speclj "2.9.1"]
            [lein-ring "0.8.8"]]
  :ring {:handler speclj_www.core/app}
  )
