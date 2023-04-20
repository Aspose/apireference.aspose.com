---
title: Interface IMediaList
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.Css.IMediaList antarmuka. Antarmuka MediaList menyediakan abstraksi kumpulan media yang dipesan tanpa menentukan atau membatasi bagaimana kumpulan ini diimplementasikan. Daftar kosong sama dengan daftar yang berisi media all.
type: docs
weight: 730
url: /id/net/aspose.svg.dom.css/imedialist/
---
## IMediaList interface

Antarmuka MediaList menyediakan abstraksi kumpulan media yang dipesan, tanpa menentukan atau membatasi bagaimana kumpulan ini diimplementasikan. Daftar kosong sama dengan daftar yang berisi media "all".

```csharp
public interface IMediaList : IEnumerable<string>
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Item](../../aspose.svg.dom.css/imedialist/item/) { get; } | Mengembalikan indexth dalam daftar. Jika indeks lebih besar dari atau sama dengan jumlah media dalam daftar, ini mengembalikan null. Indeks media. |
| [Length](../../aspose.svg.dom.css/imedialist/length/) { get; } | Jumlah media dalam daftar. Rentang media yang valid adalah 0 hingga panjang-1 inklusif. |
| [MediaText](../../aspose.svg.dom.css/imedialist/mediatext/) { get; } | Representasi tekstual yang dapat diuraikan dari daftar media. Ini adalah daftar media yang dipisahkan koma. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AppendMedium](../../aspose.svg.dom.css/imedialist/appendmedium/)(string) | Menambahkan medium newMedium ke akhir daftar. Jika media baru sudah digunakan, maka dihapus terlebih dahulu. |
| [DeleteMedium](../../aspose.svg.dom.css/imedialist/deletemedium/)(string) | Menghapus media yang ditunjukkan oleh media lama dari daftar. |

### Lihat juga

* ruang nama [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* perakitan [Aspose.SVG](../../)


