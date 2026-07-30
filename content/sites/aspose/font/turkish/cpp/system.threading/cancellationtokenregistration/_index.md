---
title: "System::Threading::CancellationTokenRegistration sınıfı"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Font için C++"
description: "System::Threading::CancellationTokenRegistration sınıfı. C++'de bir iptal belirteci geri araması için kaydı temsil eder."
type: docs
weight: 300
url: /tr/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


İptal belirteci geri çağrısı için bir kaydı temsil eder.

```cpp
class CancellationTokenRegistration
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Dispose](./dispose/)() | Kayıt iptal edilir ve geri arama, ilişkili [CancellationTokenSource](../cancellationtokensource/) üzerinden kaldırılır. Bu yöntem çağrıldıktan sonra, ilişkili [CancellationTokenSource](../cancellationtokensource/) iptal edildiğinde kayıtlı geri arama artık tetiklenmez. |
## Açıklamalar


Bu sınıf, bir iptal belirtecinden geri aramayı kayıttan çıkarmayı sağlar. İptal edildiğinde, geri aramayı ilişkili [CancellationTokenSource](../cancellationtokensource/) üzerinden kaldırır.
Bu sınıf doğrudan oluşturulmamalıdır - [CancellationToken](../cancellationtoken/) kayıt yöntemleri tarafından döndürülür.

## Ayrıca Bakınız

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
