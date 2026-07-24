---
title: "metode System::Threading::CancellationTokenSource::CreateLinkedTokenSource"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource metode. Membuat sumber token terhubung yang dibatalkan ketika salah satu token yang diberikan dibatalkan dalam C++."
type: docs
weight: 600
url: /id/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


Membuat sumber token tertaut yang dibatalkan ketika salah satu token yang diberikan dibatalkan.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| token1 | const CancellationToken\& | Token pembatalan pertama untuk dipantau. |
| token2 | const CancellationToken\& | Token pembatalan kedua untuk dipantau. |

### ReturnValue

Sumber token baru yang akan dibatalkan ketika salah satu token masukan dibatalkan.
## Catatan



Sumber yang dikembalikan akan segera dibatalkan jika salah satu token masukan sudah dibatalkan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
