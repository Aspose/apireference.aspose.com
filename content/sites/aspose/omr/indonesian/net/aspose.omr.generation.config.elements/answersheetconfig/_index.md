---
title: Class AnswerSheetConfig
second_title: Aspose.OMR untuk Referensi .NET API
description: Aspose.OMR.Generation.Config.Elements.AnswerSheetConfig kelas. Mewakili elemen Lembar Jawaban. Memungkinkan penambahan kotak pilihan yang dikelompokkan dalam kolom dan baris. Gunakan lembar jawaban jika Anda ingin memasukkan banyak pertanyaan dalam satu halaman karena letaknya berdekatan.
type: docs
weight: 90
url: /id/net/aspose.omr.generation.config.elements/answersheetconfig/
---
## AnswerSheetConfig class

Mewakili elemen Lembar Jawaban. Memungkinkan penambahan kotak pilihan yang dikelompokkan dalam kolom dan baris. Gunakan lembar jawaban jika Anda ingin memasukkan banyak pertanyaan dalam satu halaman karena letaknya berdekatan.

```csharp
public class AnswerSheetConfig : BaseConfig
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [AnswerSheetConfig](answersheetconfig/)() | Konstruktor default. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AnswersCount](../../aspose.omr.generation.config.elements/answersheetconfig/answerscount/) { get; set; } | Jumlah pilihan jawaban untuk setiap soal pada lembar jawaban. |
| [AnswersValues](../../aspose.omr.generation.config.elements/answersheetconfig/answersvalues/) { get; set; } | Setiap nilai mewakili simbol di dalam gelembung. Harus memiliki jumlah yang sama dengan[`AnswersCount`](./answerscount/) Contoh: string baru[] {"A", "B", "C", "D"} Contoh: string baru[] {"1", "2", "3", "4"} |
| [BubbleType](../../aspose.omr.generation.config.elements/answersheetconfig/bubbletype/) { get; set; } | Jenis gelembung |
| [Column](../../aspose.omr.generation.config.elements/answersheetconfig/column/) { get; set; } | Menunjukkan di kolom mana untuk menggambar sheet |
| [ColumnsCount](../../aspose.omr.generation.config.elements/answersheetconfig/columnscount/) { get; set; } | Mengatur jumlah kolom yang akan digambar. |
| [ElementsCount](../../aspose.omr.generation.config.elements/answersheetconfig/elementscount/) { get; set; } | Menentukan jumlah total soal pada lembar jawaban. |
| override [Name](../../aspose.omr.generation.config.elements/answersheetconfig/name/) { get; set; } | Nama lembar jawaban |
| [StartId](../../aspose.omr.generation.config.elements/answersheetconfig/startid/) { get; set; } | Indeks awal penomoran soal |
| override [Type](../../aspose.omr.generation.config.elements/answersheetconfig/type/) { get; set; } | Jenis elemen omr. Kolom wajib diisi untuk serialisasi JSON. |
| [VerticalMargin](../../aspose.omr.generation.config.elements/answersheetconfig/verticalmargin/) { get; set; } | Batas vertikal lembar jawaban. Diatur dalam piksel. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/answersheetconfig/bubblesize/) | Ukuran gelembung |

### Lihat juga

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* ruang nama [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* perakitan [Aspose.OMR](../../)


