---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page için C++"
description: "System::Threading::CancellationTokenRegistration sınıfı. C++'de bir iptal belirteci geri çağırması için kaydı temsil eder."
type: docs
weight: 300
url: /tr/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


Bir iptal belirteci geri çağrısı için kaydı temsil eder.

```cpp
class CancellationTokenRegistration
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Dispose](./dispose/)() | Kayıtı iptal eder ve geri çağırmayı ilişkili [CancellationTokenSource](../cancellationtokensource/) üzerinden kaldırır. Bu yöntemi çağırdıktan sonra, kayıtlı geri çağırma, ilişkili [CancellationTokenSource](../cancellationtokensource/) iptal edildiğinde artık tetiklenmez. |
## Açıklamalar


Bu sınıf, bir iptal belirtecinden geri çağırmanın kaydını kaldırmaya izin verir. İptal edildiğinde, geri çağırmayı ilişkili [CancellationTokenSource](../cancellationtokensource/) üzerinden kaldırır.
Bu sınıf doğrudan oluşturulmamalıdır - [CancellationToken](../cancellationtoken/) kayıt yöntemleri tarafından döndürülür.

## Ayrıca Bakınız

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
