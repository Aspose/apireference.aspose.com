---
title: RecognitionResult.GetSpellCheckCorrectedText
second_title: Aspose.OCR untuk .NET API Referensi
description: RecognitionResult metode. Memperbaiki teks mengganti kata yang salah eja.
type: docs
weight: 100
url: /id/net/aspose.ocr/recognitionresult/getspellcheckcorrectedtext/
---
## RecognitionResult.GetSpellCheckCorrectedText method

Memperbaiki teks (mengganti kata yang salah eja).

```csharp
public string GetSpellCheckCorrectedText(SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| language | SpellCheckLanguage | Kamus untuk digunakan. |
| dictionaryPath | String | Opsional. Path lengkap ke kamus pengguna (kamus frekuensi). Format file kamus: File teks biasa dalam pengkodean UTF-8. Kata dan Frekuensi Kata dipisahkan oleh spasi atau tab. Secara default, kata diharapkan di kolom pertama dan frekuensi di kolom kedua. Setiap kata- pasangan frekuensi dalam baris terpisah. Baris didefinisikan sebagai urutan karakter yang diikuti oleh umpan baris ("\n"), carriage return ("\r"), atau carriage return yang segera diikuti oleh line feed ("\r\n"). Setiap kata diharapkan menggunakan huruf kecil. |

### Nilai Pengembalian

Teks dengan kata yang diganti.

### Lihat juga

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* ruang nama [Aspose.OCR](../../recognitionresult/)
* perakitan [Aspose.OCR](../../../)


