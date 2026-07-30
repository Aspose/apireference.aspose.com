---
title: "System::Threading::Interlocked sınıfı"
linktitle: "Interlocked"
second_title: "Aspose.Font için C++"
description: "System::Threading::Interlocked sınıfı. İş parçacığı güvenli işlemler için API sağlar. Bu, örnek hizmeti olmayan statik bir türdür. C++'ta hiçbir şekilde onun örneklerini oluşturmayın."
type: docs
weight: 600
url: /tr/cpp/system.threading/interlocked/
---
## Interlocked class


İş parçacığı güvenli işlemler için API sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Herhangi bir şekilde onun örneklerini asla oluşturmamalısınız.

```cpp
class Interlocked
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | Değeri atomik olarak artırır. |
| static [Add](./add/)(int64_t\&, int64_t) | Değeri atomik olarak artırır. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Değişken üzerindeki karşılaştırma-değişim değeri: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve yalnızca saklanan değer beklenenle eşleşiyorsa yeni değeri depolar. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Değişken üzerindeki karşılaştırma-değişim değeri: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve yalnızca saklanan değer beklenenle eşleşiyorsa yeni değeri depolar. Uygulanmadı. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | Değişken üzerindeki karşılaştırma-değişim değeri: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve yalnızca saklanan değer beklenenle eşleşiyorsa yeni değeri depolar. |
| static [Decrement](./decrement/)(int32_t\&) | Değeri atomik olarak azaltır. |
| static [Decrement](./decrement/)(int64_t\&) | Değeri atomik olarak azaltır. |
| static [Exchange](./exchange/)(T\&, T) | Değişken üzerindeki değer değişimi: yeni değeri depolar ve depolamadan hemen önce değişkenin sahip olduğu değeri döndürür. |
| static [Exchange](./exchange/)(T\&, T) | Değişken üzerindeki değer değişimi: yeni değeri depolar ve depolamadan hemen önce değişkenin sahip olduğu değeri döndürür. Uygulanmadı. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | Değeri atomik olarak artırır, değişim-ekleme prosedürü aracılığıyla. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | Değeri atomik olarak artırır, değişim-ekleme prosedürü aracılığıyla. |
| static [Increment](./increment/)(int32_t\&) | Değeri atomik olarak artırır. |
| static [Increment](./increment/)(int64_t\&) | Değeri atomik olarak artırır. |
| static [Read](./read/)(int64_t\&) | 64 bitlik bir değer döndürür, atomik bir işlem olarak yüklenir. |
## Ayrıca Bakınız

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
