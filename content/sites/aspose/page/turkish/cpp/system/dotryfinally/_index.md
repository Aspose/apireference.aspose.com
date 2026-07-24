---
title: "System::DoTryFinally yöntemi"
linktitle: "DoTryFinally"
second_title: "Aspose.Page için C++"
description: "System::DoTryFinally yöntemi. C#'nin try[-catch]-finally ifadesinin davranışını taklit eden tek fonksiyon. Çevirmen'in finally_statement_as_lambda seçeneği true olarak ayarlandığında C#'nin try[-catch]-finally ifadesinin çevirisi, bu yöntemin C++'da çağrılması şeklinde yapılır."
type: docs
weight: 16500
url: /tr/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


C#'nin try[-catch]-finally ifadesinin davranışını taklit eden tek fonksiyon. Çevirmen'in finally_statement_as_lambda seçeneği true olarak ayarlandığında C#'nin try[-catch]-finally ifadesi, bu yöntemin çağrılması şeklinde çevrilir.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Açıklama |
| --- | --- |
| T | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin türü |
| F | Emüle edilen try[-catch]-finally ifadesinin finally kısmını uygulayan fonksiyon nesnesinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| tryBlock | T\&& | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmının uygulanmasını içeren gövdeye sahip fonksiyon nesnesi |
| finallyBlock | F\&& | Emüle edilen try[-catch]-finally ifadesinin finally kısmının uygulanmasını içeren gövdeye sahip fonksiyon nesnesi |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


C#'nin try[-catch]-finally ifadesinin davranışını taklit eden tek fonksiyon. Çevirmen'in finally_statement_as_lambda seçeneği true olarak ayarlandığında C#'nin try[-catch]-finally ifadesi, bu yöntemin çağrılması şeklinde çevrilir. Bu aşırı yükleme, try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin dönüş değerinin bool olduğu durumu ele alır.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Açıklama |
| --- | --- |
| T | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin türü |
| F | Emüle edilen try[-catch]-finally ifadesinin finally kısmını uygulayan fonksiyon nesnesinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| tryBlock | T\&& | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmının uygulanmasını içeren gövdeye sahip fonksiyon nesnesi |
| finallyBlock | F\&& | Emüle edilen try[-catch]-finally ifadesinin finally kısmının uygulanmasını içeren gövdeye sahip fonksiyon nesnesi |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


C#'ın try[-catch]-finally ifadesinin davranışını taklit eden tek fonksiyon. Çevirmen seçeneği finally_statement_as_lambda true olarak ayarlandığında C#'ın try[-catch]-finally ifadesi bu yöntemin çağrısına çevrilir. Bu aşırı yük, try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin dönüş değerinin bool& olduğu durumları ele alır.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Açıklama |
| --- | --- |
| T | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin türü |
| F | Emüle edilen try[-catch]-finally ifadesinin finally kısmını uygulayan fonksiyon nesnesinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| tryBlock | T\&& | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmının uygulanmasını içeren gövdeye sahip fonksiyon nesnesi |
| finallyBlock | F\&& | Emüle edilen try[-catch]-finally ifadesinin finally kısmının uygulanmasını içeren gövdeye sahip fonksiyon nesnesi |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
