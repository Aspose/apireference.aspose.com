---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource metodu"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Font için C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource metodu. Sağlanan tokenlerden herhangi biri iptal edildiğinde iptal edilen bağlı bir token kaynağı oluşturur."
type: docs
weight: 600
url: /tr/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


Sağlanan belirteçlerden herhangi biri iptal edildiğinde iptal olan bağlı bir belirteç kaynağı oluşturur.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| token1 | const CancellationToken\& | İzlenecek ilk iptal tokeni. |
| token2 | const CancellationToken\& | İzlenecek ikinci iptal tokeni. |

### ReturnValue

Giriş tokenlerinden herhangi biri iptal edildiğinde iptal olacak yeni token kaynağı.
## Açıklamalar



Dönen kaynak, giriş tokenlerinden herhangi biri zaten iptal edilmişse hemen iptal olur.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
