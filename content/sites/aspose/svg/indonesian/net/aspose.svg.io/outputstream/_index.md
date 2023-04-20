---
title: Class OutputStream
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.IO.OutputStream kelas. Aliran pengganti membungkus aliran keluaran nyata dan mengontrol akses ke sana. OutputStream berisi data URI yang menjelaskan lokasi aliran keluaran.
type: docs
weight: 1980
url: /id/net/aspose.svg.io/outputstream/
---
## OutputStream class

Aliran pengganti membungkus aliran keluaran nyata dan mengontrol akses ke sana. `OutputStream` berisi data URI yang menjelaskan lokasi aliran keluaran.

```csharp
public class OutputStream : Stream
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [OutputStream](outputstream/)(Stream, string) | Menginisialisasi instance baru dari`OutputStream` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| override [CanRead](../../aspose.svg.io/outputstream/canread/) { get; } | Mendapat nilai yang menunjukkan apakah aliran keluaran yang dibungkus mendukung pembacaan. |
| override [CanSeek](../../aspose.svg.io/outputstream/canseek/) { get; } | Mendapat nilai yang menunjukkan apakah aliran output yang dibungkus mendukung pencarian. |
| override [CanWrite](../../aspose.svg.io/outputstream/canwrite/) { get; } | Mendapat nilai yang menunjukkan apakah aliran keluaran yang dibungkus mendukung penulisan. |
| override [Length](../../aspose.svg.io/outputstream/length/) { get; } | Mendapat panjang aliran output yang dibungkus dalam byte. |
| override [Position](../../aspose.svg.io/outputstream/position/) { get; set; } | Mendapat atau menyetel posisi dalam aliran keluaran yang dibungkus. |
| [Uri](../../aspose.svg.io/outputstream/uri/) { get; } | Mendapatkan URI lokasi streaming. |

## Metode

| Nama | Keterangan |
| --- | --- |
| override [Close](../../aspose.svg.io/outputstream/close/)() | Menutup aliran output yang dibungkus dan aliran saat ini. |
| override [Flush](../../aspose.svg.io/outputstream/flush/)() | Menghapus semua buffer untuk aliran output yang dibungkus dan menyebabkan data buffer apa pun ditulis ke perangkat yang mendasarinya. |
| override [Read](../../aspose.svg.io/outputstream/read/)(byte[], int, int) | Membaca urutan byte dari aliran keluaran yang dibungkus dan memajukan posisi dalam aliran dengan jumlah byte yang dibaca. |
| override [Seek](../../aspose.svg.io/outputstream/seek/)(long, SeekOrigin) | Mengatur posisi dalam aliran keluaran yang dibungkus. |
| override [SetLength](../../aspose.svg.io/outputstream/setlength/)(long) | Mengatur panjang aliran keluaran yang dibungkus. |
| override [Write](../../aspose.svg.io/outputstream/write/)(byte[], int, int) | Menulis urutan byte ke aliran keluaran yang dibungkus dan memajukan posisi saat ini dalam aliran ini dengan jumlah byte yang ditulis. |

### Lihat juga

* ruang nama [Aspose.Svg.IO](../../aspose.svg.io/)
* perakitan [Aspose.SVG](../../)


