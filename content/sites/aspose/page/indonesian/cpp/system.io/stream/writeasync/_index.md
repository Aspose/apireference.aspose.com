---
title: "System::IO::Stream::WriteAsync metode"
linktitle: "WriteAsync"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Stream::WriteAsync metode. Secara asinkron menulis urutan byte ke aliran saat ini, memajukan posisi saat ini dalam aliran ini sebanyak jumlah byte yang ditulis, dan memantau permintaan pembatalan dalam C++."
type: docs
weight: 2700
url: /id/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Secara asinkron menulis urutan byte ke aliran saat ini, memajukan posisi saat ini dalam aliran ini sebesar jumlah byte yang ditulis, dan memantau permintaan pembatalan.

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array yang berisi byte untuk ditulis. |
| offset | int32_t | Indeks berbasis 0 dari elemen dalam **buffer** tempat subrentang yang akan ditulis dimulai. |
| count | int32_t | Jumlah elemen dalam subrentang yang akan ditulis. |

### ReturnValue

Tugas yang mewakili operasi penulisan asinkron.

## Lihat Juga

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Secara asinkron menulis urutan byte ke aliran saat ini, memajukan posisi saat ini dalam aliran ini sebesar jumlah byte yang ditulis, dan memantau permintaan pembatalan.

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array yang berisi byte untuk ditulis. |
| offset | int32_t | Indeks berbasis 0 dari elemen dalam **buffer** tempat subrentang yang akan ditulis dimulai. |
| count | int32_t | Jumlah elemen dalam subrentang yang akan ditulis. |
| cancellationToken | const Threading::CancellationToken\& | Token untuk memantau permintaan pembatalan. |

### ReturnValue

Tugas yang mewakili operasi penulisan asinkron.

## Lihat Juga

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
