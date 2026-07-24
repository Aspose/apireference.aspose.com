---
title: "System::Threading::CancellationToken::Register yöntemi"
linktitle: "Register"
second_title: "Aspose.Page için C++"
description: "System::Threading::CancellationToken::Register yöntemi. C++'ta iptal istendiğinde çağrılacak bir geri aramayı kaydeder."
type: docs
weight: 400
url: /tr/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


İptal istendiğinde çağrılacak bir geri çağırma kaydeder.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| callback | const Action<>\& | İptal istendiğinde yürütülecek [Action<>](../../../system/action/) |

### ReturnValue

Geri aramayı kayıttan çıkarmak için kullanılabilecek bir [CancellationTokenRegistration](../../cancellationtokenregistration/) nesnesi.
## Açıklamalar



İptal zaten istenmişse, geri arama hemen çağrılacaktır.

## Ayrıca Bakınız

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
