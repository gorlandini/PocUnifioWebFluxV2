# 🚀 Performance Comparison: WebFlux vs Traditional Spring

> This project was created as part of a proof-of-concept to evaluate performance and scalability in modern backend applications.

This project demonstrates a simple performance comparison between two approaches:

- **Spring WebFlux (reactive, non-blocking)**
- **Spring MVC (traditional, blocking)**

The goal was to understand how each one behaves under load.

---

# 📊 Test Summary

The tests were executed using Apache JMeter with the same conditions for both versions.

## Results

### ✅ Reactive Application (Spring WebFlux)

- Average response time: **5 ms**
- Throughput: **~948 requests/second**
- Stable performance under load

---

### ⚠️ Blocking Application (Spring MVC)

- Average response time: **983 ms**
- Throughput: **~409 requests/second**
- High variation in response times under load

---

### 📸 Performance Evidence (JMeter)

> Results obtained under the same load conditions.

<img width="1340" height="806" alt="comparison3" src="https://github.com/user-attachments/assets/e2ebeafd-47fb-43e4-b89b-1f2db3c84728" />


---

# 🔍 Key Insight

Even under the same test conditions, the reactive approach (WebFlux) significantly outperformed the traditional blocking model.

👉 This shows that:

> **How the application handles concurrency can have a major impact on performance.**

---

# 💡 Why This Matters

- Applications with many simultaneous users benefit from reactive architectures
- Blocking models can become slower under heavy load due to thread limitations
- Performance should be validated with real tests, not assumptions

---

# 🧪 Tools Used

- Spring Boot
- Spring WebFlux
- Spring MVC
- Apache JMeter
- H2 Database

---

# 📌 Conclusion

This project highlights the importance of choosing the right architecture based on scalability needs and demonstrates a data-driven approach to decision making.
