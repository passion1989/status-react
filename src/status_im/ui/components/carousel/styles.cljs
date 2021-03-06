(ns status-im.ui.components.carousel.styles)

(def scroll-view-container
  {:flex 1})

(defn content-container [gap]
  {:padding-left  (quot gap 2)
   :padding-right (quot gap 2)})

(defn page [index count page-width gap]
  (let [margin        (quot gap 2)
        left-spacing  (if (zero? index) gap 0)
        right-spacing (if (and (= index (dec count))
                               (> count 1))
                        gap 0)]
    {:width           page-width
     :justify-content :center
     :margin-left     (+ margin left-spacing)
     :margin-right    (+ margin right-spacing)}))
