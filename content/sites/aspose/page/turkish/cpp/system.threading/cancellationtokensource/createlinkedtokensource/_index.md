---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource yöntemi"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Page için C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource yöntemi. C++'ta sağlanan belirteçlerden herhangi biri iptal edildiğinde iptal olan bir bağlı belirteç kaynağı oluşturur."
type: docs
weight: 600
url: /tr/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


Sağlanan belirteçlerden herhangi biri iptal edildiğinde iptal olan bağlı bir belirteç kaynağı oluşturur.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| token1 | const CancellationToken\& | İzlenecek ilk iptal belirteci. |
| token2 | const CancellationToken\& | İzlenecek ikinci iptal belirteci. |

### ReturnValue

Herhangi bir giriş belirteci iptal edildiğinde iptal olacak yeni bir belirteç kaynağı.
## Açıklamalar



Döndürülen kaynak, herhangi bir giriş belirteci zaten iptal edilmişse hemen iptal olur.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
