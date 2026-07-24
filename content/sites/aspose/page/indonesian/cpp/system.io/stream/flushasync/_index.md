---
title: "System::IO::Stream::FlushAsync metode"
linktitle: "FlushAsync"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Stream::FlushAsync metode. Secara asinkron mengosongkan semua buffer untuk stream ini, menyebabkan semua data yang di-buffer ditulis ke perangkat dasar, dan memantau permintaan pembatalan dalam C++."
type: docs
weight: 900
url: /id/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Secara asinkron membersihkan semua buffer untuk aliran ini, menyebabkan data yang di-buffer ditulis ke perangkat dasar, dan memantau permintaan pembatalan.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Sebuah tugas yang mewakili operasi flush asinkron.

## Lihat Juga

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Secara asinkron membersihkan semua buffer untuk aliran ini, menyebabkan data yang di-buffer ditulis ke perangkat dasar, dan memantau permintaan pembatalan.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Token untuk memantau permintaan pembatalan. |

### ReturnValue

Sebuah tugas yang mewakili operasi flush asinkron.

## Lihat Juga

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
