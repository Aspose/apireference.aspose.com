---
title: Class CompositeGridConfig
second_title: Aspose.OMR untuk Referensi .NET API
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig kelas. Grid element. Menghasilkan susunan gelembung. Setiap gelembung yang terisi mewakili satu simbol dalam nilai gabungan Semua simbol yang ditandai akan digabungkan menjadi satu nilai
type: docs
weight: 120
url: /id/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

Grid element. Menghasilkan susunan gelembung. Setiap gelembung yang terisi mewakili satu simbol dalam nilai gabungan Semua simbol yang ditandai akan digabungkan menjadi satu nilai

```csharp
public class CompositeGridConfig : BaseConfig
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | Konstruktor default. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | Jenis gelembung |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | Saat elemen digambar dalam induk multi-kolom - mewakili posisi. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | Jumlah kolom di dalam kisi. Setiap kolom mewakili simbol tunggal dalam hasil nilai Jumlah harus sama dengan[`ExtraRow`](./extrarow/) jumlah kolom |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | Haruskah nama Kotak ini ditampilkan |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | Nilai khusus kolom yang akan ditempatkan di atas nilai default -[`Values`](./values/) . Disajikan sebagai array dua dimensi. Pertama - baris. Kedua - kolom. Setiap string mewakili teks di dalam gelembung. jika string nol, tidak ada gelembung yang akan ditempatkan. Jumlah kolom harus sama dengan[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | Perataan kisi, menunjukkan di mana kisi harus digambar pada halaman |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | Orientasi kisi: horizontal atau vertikal. Menunjukkan bagaimana elemen anak harus diposisikan |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | Warna batas persegi |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | Ukuran batas persegi |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | Menunjukkan jenis elemen yang akan digambar di awal grid |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | Nama kisi. Digunakan sebagai pengenal di recognition |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | Jelaskan rotasi elemen Grid di sekitar porosnya sendiri. "90" - putar CompositeGrid 90 derajat "-90" - putar ComopositeGrid ke -90 derajat |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | Jenis elemen omr. Kolom wajib diisi untuk serialisasi JSON. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | Kumpulan string yang akan menjelaskan kemungkinan simbol di setiap kolom. Nilai khusus kolom ditempatkan di[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | Posisi Kisi X pada halaman, menimpa perataan |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | Posisi Kisi Y pada halaman, mengesampingkan perataan |

## Bidang

| Nama | Keterangan |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | Ukuran gelembung |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | Margin antar garis |

### Lihat juga

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* ruang nama [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* perakitan [Aspose.OMR](../../)


