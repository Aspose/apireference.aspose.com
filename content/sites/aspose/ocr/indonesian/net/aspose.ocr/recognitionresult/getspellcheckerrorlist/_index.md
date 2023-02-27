---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR untuk .NET API Referensi
description: RecognitionResult metode. Temukan kata yang salah eja dengan ejaan yang disarankan untuk teks masukan tertentu.
type: docs
weight: 110
url: /id/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

Temukan kata yang salah eja dengan ejaan yang disarankan untuk teks masukan tertentu.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| language | SpellCheckLanguage | Kamus untuk digunakan. |
| dictionaryPath | String | Opsional. Path lengkap ke kamus pengguna (kamus frekuensi). Format file kamus: File teks biasa dalam pengkodean UTF-8. Kata dan Frekuensi Kata dipisahkan oleh spasi atau tab. Secara default, kata diharapkan di kolom pertama dan frekuensi di kolom kedua. Setiap kata- pasangan frekuensi dalam baris terpisah. Baris didefinisikan sebagai urutan karakter yang diikuti oleh umpan baris ("\n"), carriage return ("\r"), atau carriage return yang segera diikuti oleh line feed ("\r\n"). Setiap kata diharapkan menggunakan huruf kecil. |

### Nilai Pengembalian

Daftar objek SpellCheckError yang mewakili kata yang salah eja dengan daftar menyarankan ejaan yang benar untuk setiap kata yang salah eja, dan dengan jarak edit.

### Lihat juga

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* ruang nama [Aspose.OCR](../../recognitionresult/)
* perakitan [Aspose.OCR](../../../)


