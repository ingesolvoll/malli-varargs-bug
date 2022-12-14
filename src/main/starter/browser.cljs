(ns starter.browser
  (:require [malli.dev.cljs :as md]
            [starter.function :as sf]))

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
      (md/start!)
      (js/console.log "start")
      (js/setTimeout #(sf/my-function-good 1)
                     500)
      (js/setTimeout #(sf/my-function-bad 1)
                     1000))

(defn init []
      ;; init is called ONCE when the page loads
      ;; this is called in the index.html and must be exported
      ;; so it is available even in :advanced release builds
      (js/console.log "init")
      (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
      (js/console.log "stop"))
