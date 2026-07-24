---
title: "System::IO::Stream::ReadAsync method"
linktitle: "ReadAsync"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Stream::ReadAsync method. Membaca secara asinkron urutan byte dari aliran saat ini, memajukan posisi dalam aliran sebesar jumlah byte yang dibaca, dan memantau permintaan pembatalan dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.io/stream/readasync/
---
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Secara asinkron membaca urutan byte dari aliran saat ini, memajukan posisi dalam aliran sebesar jumlah byte yang dibaca, dan memantau permintaan pembatalan.

```cpp
RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array byte untuk menulis byte yang dibaca ke dalamnya. |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan. |
| count | int32_t | Jumlah byte yang akan dibaca. |

### ReturnValue

Tugas yang mewakili operasi baca asinkron. Nilai parameter TResult berisi total jumlah byte yang dibaca ke dalam buffer. Nilai hasil dapat lebih kecil dari jumlah byte yang diminta jika jumlah byte yang tersedia saat ini kurang dari jumlah yang diminta, atau dapat menjadi 0 (nol) jika akhir aliran telah tercapai.

## Lihat Juga

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Secara asinkron membaca urutan byte dari aliran saat ini, memajukan posisi dalam aliran sebesar jumlah byte yang dibaca, dan memantau permintaan pembatalan.

```cpp
virtual RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array byte untuk menulis byte yang dibaca ke dalamnya. |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan. |
| count | int32_t | Jumlah byte yang akan dibaca. |
| cancellationToken | const Threading::CancellationToken\& | Token untuk memantau permintaan pembatalan. |

### ReturnValue

Tugas yang mewakili operasi baca asinkron. Nilai parameter TResult berisi total jumlah byte yang dibaca ke dalam buffer. Nilai hasil dapat lebih kecil dari jumlah byte yang diminta jika jumlah byte yang tersedia saat ini kurang dari jumlah yang diminta, atau dapat menjadi 0 (nol) jika akhir aliran telah tercapai.

## Lihat Juga

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
