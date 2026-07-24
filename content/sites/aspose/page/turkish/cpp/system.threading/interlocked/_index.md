---
title: "System::Threading::Interlocked sınıfı"
linktitle: "Interlocked"
second_title: "Aspose.Page için C++"
description: "System::Threading::Interlocked sınıfı. İş parçacığı güvenli işlemler için API sağlar. Bu, örnek hizmeti olmayan statik bir türdür. C++'ta hiçbir şekilde onun örneklerini oluşturmayın."
type: docs
weight: 600
url: /tr/cpp/system.threading/interlocked/
---
## Interlocked class


İş parçacığı güvenli işlemler için API sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Hiçbir şekilde onun örneklerini oluşturmayınız.

```cpp
class Interlocked
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | Değeri atomik olarak artırır. |
| static [Add](./add/)(int64_t\&, int64_t) | Değeri atomik olarak artırır. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Değişken üzerindeki değeri karşılaştırmalı değiştirir: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve saklanan değer beklenenle eşleşiyorsa yeni değeri depolar. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Değişken üzerindeki değeri karşılaştırmalı değiştirir: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve saklanan değer beklenenle eşleşiyorsa yeni değeri depolar. Henüz uygulanmadı. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | Değişken üzerindeki değeri karşılaştırmalı değiştirir: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve saklanan değer beklenenle eşleşiyorsa yeni değeri depolar. |
| static [Decrement](./decrement/)(int32_t\&) | Değeri atomik olarak azaltır. |
| static [Decrement](./decrement/)(int64_t\&) | Değeri atomik olarak azaltır. |
| static [Exchange](./exchange/)(T\&, T) | Değişken üzerindeki değeri değiştirir: yeni değeri depolar ve depolanmadan hemen önce değişkenin sahip olduğu değeri döndürür. |
| static [Exchange](./exchange/)(T\&, T) | Değişken üzerindeki değeri değiştirir: yeni değeri depolar ve depolanmadan hemen önce değişkenin sahip olduğu değeri döndürür. Henüz uygulanmadı. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | Değeri atomik olarak değiştir-ekle prosedürüyle artırır. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | Değeri atomik olarak değiştir-ekle prosedürüyle artırır. |
| static [Increment](./increment/)(int32_t\&) | Değeri atomik olarak artırır. |
| static [Increment](./increment/)(int64_t\&) | Değeri atomik olarak artırır. |
| static [Read](./read/)(int64_t\&) | 64 bitlik bir değeri döndürür, atomik bir işlem olarak yüklenir. |
## Ayrıca Bakınız

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
