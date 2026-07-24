---
title: "System::IO::Stream::FlushAsync yöntemi"
linktitle: "FlushAsync"
second_title: "Aspose.Page için C++"
description: "System::IO::Stream::FlushAsync yöntemi. Bu akış için tüm tamponları eşzamansız olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve C++'ta iptal isteklerini izler."
type: docs
weight: 900
url: /tr/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Bu akış için tüm tamponları asenkron olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve iptal isteklerini izler.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Eşzamansız temizleme işlemini temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Bu akış için tüm tamponları asenkron olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve iptal isteklerini izler.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | İptal isteklerini izlemek için token. |

### ReturnValue

Eşzamansız temizleme işlemini temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
