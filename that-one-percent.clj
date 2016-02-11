(defn sum-month [m]
  (->> (range (+ m 1))
    (reduce +)))

(defn safadeza [day month year]
  (+ (sum-month month)
    (* (/ year 100)
      (- 50 day))))

(defn anjo [saf]
  (- 100 saf))

(defn wesley-safadao [day month year]
  (let [saf (safadeza day month year)
        angel (anjo saf)]
    (println
      (str "Você é "
        (float saf) "% safado e " (float angel) "% anjo"))))

(wesley-safadao 14 10 84)
