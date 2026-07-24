---
title: "System::Threading::Tasks::ResultValueTask sınıfı"
linktitle: "ResultValueTask"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::ResultValueTask sınıfı. Doğrudan bir sonuç değeri ya da C++'ta bir ResultTask<T> sarmalayan hibrit görev benzeri bir türü temsil eder."
type: docs
weight: 200
url: /tr/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


Doğrudan bir sonuç değeri ya da bir [ResultTask<T>](../resulttask/) sarmalayan hibrit görev benzeri bir türü temsil eder.

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Parameter | Açıklama |
| --- | --- |
| T | Görev tarafından üretilen sonucun türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AsTask](./astask/)() const | Bu [ResultValueTask](./) öğesini [ResultTask<T>](../resulttask/) için paylaşımlı bir işaretçiye dönüştürür. |
| [ConfigureAwait](./configureawait/)(bool) const | Bu görev için bir awaiter yapılandırır. |
| [Equals](./equals/)(ResultValueTask) override | Bu örneğin başka bir [ResultValueTask](./) örneğine eşit olup olmadığını belirler. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bu örneğin başka bir nesneye eşit olup olmadığını belirler. |
| [get_IsCanceled](./get_iscanceled/)() const | Görevin iptal edilmesi nedeniyle tamamlanıp tamamlanmadığını gösteren bir değer alır. |
| [get_IsCompleted](./get_iscompleted/)() const | Görevin tamamlanıp tamamlanmadığını gösteren bir değer alır. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Görevin başarıyla tamamlanıp tamamlanmadığını gösteren bir değer alır. |
| [get_IsFaulted](./get_isfaulted/)() const | Görevin işlenmemiş bir istisna nedeniyle tamamlanıp tamamlanmadığını gösteren bir değer alır. |
| [get_Result](./get_result/)() const | Tamamlanmış görevin sonucunu alır. |
| [GetAwaiter](./getawaiter/)() const | Bu görev için await ifadelerini destekleyecek bir awaiter alır. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | [ResultValueTask](./) için eşitsizlik operatörü. |
| [operator==](./operator==/)(const ResultValueTask\&) const | [ResultValueTask](./) için eşitlik operatörü. |
| [ResultValueTask](./resultvaluetask/)() | Boş, başlatılmamış bir [ResultValueTask](./) oluşturur. |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Belirtilen sonuçla tamamlanmış bir [ResultValueTask](./) oluşturur. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Bir [ResultTask<T>](../resulttask/) paylaşımlı işaretçisinden bir [ResultValueTask](./) oluşturur. |
## Açıklamalar


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Ayrıca Bakınız

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
