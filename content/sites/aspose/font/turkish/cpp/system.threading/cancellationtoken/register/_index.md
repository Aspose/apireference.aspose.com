---
title: "System::Threading::CancellationToken::Register yöntemi"
linktitle: "Kaydet"
second_title: "Aspose.Font için C++"
description: "System::Threading::CancellationToken::Register yöntemi. İptal talep edildiğinde çağrılacak bir geri aramayı kaydeder C++'ta."
type: docs
weight: 400
url: /tr/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


İptalin istendiğinde çağrılacak bir geri arama (callback) kaydeder.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| callback | const Action<>\& | İptal talep edildiğinde yürütülecek [Action<>](../../../system/action/). |

### ReturnValue

Geri aramayı kayıttan çıkarmak için kullanılabilecek bir [CancellationTokenRegistration](../../cancellationtokenregistration/) nesnesi.
## Açıklamalar



İptal zaten talep edilmişse, geri arama hemen çağrılacaktır.

## Ayrıca Bakınız

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
