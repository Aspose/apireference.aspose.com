---
title: "System::IO::FileStream::FlushAsync metodu"
linktitle: "FlushAsync"
second_title: "Aspose.Font için C++"
description: "System::IO::FileStream::FlushAsync metodu. Bu akış için tüm tamponları asenkron olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve C++'da iptal isteklerini izler."
type: docs
weight: 500
url: /tr/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Bu akış için tüm tamponları asenkron olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve iptal isteklerini izler.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | İptal isteklerini izlemek için kullanılan token. |

### ReturnValue

Asenkron temizleme işlemini temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
