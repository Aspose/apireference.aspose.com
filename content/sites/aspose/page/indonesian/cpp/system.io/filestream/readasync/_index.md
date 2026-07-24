---
title: "System::IO::FileStream::ReadAsync metode"
linktitle: "ReadAsync"
second_title: "Aspose.Page untuk C++"
description: "System::IO::FileStream::ReadAsync metode. Membaca secara asynchronous urutan byte dari aliran saat ini, memajukan posisi dalam aliran sebesar jumlah byte yang dibaca, dan memantau permintaan pembatalan dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


Secara asinkron membaca urutan byte dari aliran saat ini, memajukan posisi dalam aliran sebesar jumlah byte yang dibaca, dan memantau permintaan pembatalan.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
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
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
