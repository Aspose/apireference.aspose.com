---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Page untuk C++"
description: "System::Globalization::DateTimeStyles enum. Menentukan opsi pemformatan tanggal dan waktu. Bit flag dalam C++."
type: docs
weight: 3500
url: /id/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


Mendefinisikan opsi pemformatan tanggal dan waktu. Bit flag.

```cpp
enum class DateTimeStyles : int32_t
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| None | 0 | Default. |
| AllowLeadingWhite | 1 | Abaikan spasi putih di awal. |
| AllowTrailingWhite | 2 | Abaikan spasi putih di akhir. |
| AllowInnerWhite | 4 | Abaikan spasi putih di dalam. |
| AllowWhiteSpaces | n/a | Abaikan semua spasi putih. |
| NoCurrentDateDefault | 8 | Saat mem-parsing string tanggal/waktu, jika semua tahun/bulan/hari tidak ada, tetapkan tanggal default menjadi 0001/1/1, alih-alih tahun/bulan/hari saat ini. |
| AdjustToUniversal | 16 | Saat mem-parsing string tanggal/waktu, jika ada penentu zona waktu (\"GMT\",\"Z\",\"+xxxx\", \"-xxxx\"), kami akan menyesuaikan waktu yang diparse berdasarkan GMT. |
| AssumeLocal | 32 | Jika tidak ada zona waktu yang diberikan, gunakan zona waktu lokal. |
| AssumeUniversal | 64 | Jika tidak ada zona waktu yang diberikan, gunakan UTC. |
| RoundtripKind | 128 | Coba mempertahankan apakah input tidak ditentukan, lokal, atau UTC. |

## Lihat Juga

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
