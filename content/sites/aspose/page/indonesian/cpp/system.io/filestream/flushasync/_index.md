---
title: "System::IO::FileStream::FlushAsync metode"
linktitle: "FlushAsync"
second_title: "Aspose.Page untuk C++"
description: "System::IO::FileStream::FlushAsync metode. Secara asynchronous menghapus semua buffer untuk aliran ini, menyebabkan semua data yang dibuffer ditulis ke perangkat yang mendasarinya, dan memantau permintaan pembatalan dalam C++."
type: docs
weight: 500
url: /id/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Secara asinkron membersihkan semua buffer untuk aliran ini, menyebabkan data yang di-buffer ditulis ke perangkat dasar, dan memantau permintaan pembatalan.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Token untuk memantau permintaan pembatalan. |

### ReturnValue

Sebuah tugas yang mewakili operasi flush asinkron.

## Lihat Juga

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
