---
title: "System::IO::FileStream::FlushAsync method"
linktitle: "FlushAsync"
second_title: "Aspose.Page için C++"
description: "System::IO::FileStream::FlushAsync method. Bu akış için tüm tamponları asenkron olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve C++'da iptal isteklerini izler."
type: docs
weight: 500
url: /tr/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Bu akış için tüm tamponları asenkron olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve iptal isteklerini izler.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | İptal isteklerini izlemek için token. |

### ReturnValue

Eşzamansız temizleme işlemini temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
