---
title: Class RecognitionResult
second_title: Aspose.OCR untuk .NET API Referensi
description: Aspose.OCR.RecognitionResult kelas. Hasil pengenalan gambar. Berisi elemen dengan informasi pengenalan dan metode untuk ekspor hasil.
type: docs
weight: 220
url: /id/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

Hasil pengenalan gambar. Berisi elemen dengan informasi pengenalan dan metode untuk ekspor hasil.

```csharp
public class RecognitionResult
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | Mendapat atau menyetel gambar untuk pembuatan pdf. |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | Mendapat koordinat persegi panjang. |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | Mendapat hasil pengenalan daftar dari daftar area (Persegi Panjang). |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | Satu set karakter yang ditemukan oleh algoritma pengenalan dan disusun dalam urutan probabilitas yang menurun. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | Mendapat daftar hasil pengenalan dengan daftar baris (Persegi Panjang). |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | Mendapat hasil pengenalan dalam satu string. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | Mendapat sudut miring. |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | Mendapat daftar pesan peringatan yang menjelaskan kesalahan tidak kritis yang muncul selama pembuatan. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | Bentuk string JSON dengan hasil pengenalan. |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | Memperbaiki teks (mengganti kata yang salah eja). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | Temukan kata yang salah eja dengan ejaan yang disarankan untuk teks masukan tertentu. |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | Membentuk string XML dengan hasil pengenalan. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | Menyimpan dokumen sebagai teks biasa, PDF atau Dokumen Microsoft Word. |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | Menyimpan dokumen sebagai teks biasa, PDF atau Dokumen Microsoft Word. |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | Untuk menyelesaikan hasil lengkap dari fragmen (baris) yang dikenali. |

## Anggota lainnya

| Nama | Keterangan |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | Teks yang dikenali dari baris dengan koordinat baris. |

### Lihat juga

* ruang nama [Aspose.OCR](../../aspose.ocr/)
* perakitan [Aspose.OCR](../../)


