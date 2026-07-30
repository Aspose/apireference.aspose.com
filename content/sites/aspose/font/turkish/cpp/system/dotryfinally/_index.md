---
title: "System::DoTryFinally yöntemi"
linktitle: "DenemeSonundaYap"
second_title: "Aspose.Font için C++"
description: "System::DoTryFinally yöntemi. C#''s try[-catch]-finally ifadesinin davranışını taklit eden tek fonksiyon. Çevirmen''in finally_statement_as_lambda seçeneği true olarak ayarlandığında C#''s try[-catch]-finally ifadesinin çevirisi, bu yöntemin C++'da çağrılması şeklinde yapılır."
type: docs
weight: 16600
url: /tr/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


Tek fonksiyon, C#'s try[-catch]-finally ifadesinin davranışını taklit eder. Çevirmen'in finally_statement_as_lambda seçeneği true olarak ayarlandığında C#'s try[-catch]-finally ifadesinin çevirisi, bu yöntemin çağrılması şeklinde yapılır.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parametre | Açıklama |
| --- | --- |
| T | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin türü |
| F | Emüle edilen try[-catch]-finally ifadesinin finally kısmını uygulayan fonksiyon nesnesinin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tryBlock | T\&& | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmının uygulamasını içeren gövdeye sahip fonksiyon nesnesi |
| finallyBlock | F\&& | Emüle edilen try[-catch]-finally ifadesinin finally bölümünün uygulanmasını içeren gövdeye sahip fonksiyon nesnesi |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


C#'ın try[-catch]-finally ifadesinin davranışını taklit eden tek fonksiyon. Çevirmen seçeneği finally_statement_as_lambda true olarak ayarlandığında C#'ın try[-catch]-finally ifadesinin çevirisi bu yöntemin çağrısına dönüştürülür. Bu aşırı yükleme, try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin dönüş değerinin bool olduğu durumu ele alır.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parametre | Açıklama |
| --- | --- |
| T | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin türü |
| F | Emüle edilen try[-catch]-finally ifadesinin finally kısmını uygulayan fonksiyon nesnesinin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tryBlock | T\&& | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmının uygulamasını içeren gövdeye sahip fonksiyon nesnesi |
| finallyBlock | F\&& | Emüle edilen try[-catch]-finally ifadesinin finally bölümünün uygulanmasını içeren gövdeye sahip fonksiyon nesnesi |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


C#'ın try[-catch]-finally ifadesinin davranışını taklit eden tek fonksiyon. Çevirmen seçeneği finally_statement_as_lambda true olarak ayarlandığında C#'ın try[-catch]-finally ifadesinin çevirisi bu yöntemin çağrısına dönüştürülür. Bu aşırı yükleme, try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin dönüş değerinin bool& olduğu durumu ele alır.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parametre | Açıklama |
| --- | --- |
| T | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmını uygulayan fonksiyon nesnesinin türü |
| F | Emüle edilen try[-catch]-finally ifadesinin finally kısmını uygulayan fonksiyon nesnesinin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tryBlock | T\&& | Emüle edilen try[-catch]-finally ifadesinin try[-catch] kısmının uygulamasını içeren gövdeye sahip fonksiyon nesnesi |
| finallyBlock | F\&& | Emüle edilen try[-catch]-finally ifadesinin finally bölümünün uygulanmasını içeren gövdeye sahip fonksiyon nesnesi |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
