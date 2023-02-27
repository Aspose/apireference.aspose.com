---
title: AsposeOcr.CorrectSpelling
second_title: Aspose.OCR untuk .NET API Referensi
description: AsposeOcr metode. Memperbaiki teks mengganti kata yang salah eja.
type: docs
weight: 60
url: /id/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

Memperbaiki teks (mengganti kata yang salah eja).

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| text | String | Teks untuk koreksi. |
| language | SpellCheckLanguage | Kamus untuk digunakan. |
| dictionaryPath | String | Opsional. Path lengkap ke kamus pengguna (kamus frekuensi). Format file kamus: File teks biasa dalam pengkodean UTF-8. Kata dan Frekuensi Kata dipisahkan oleh spasi atau tab. Secara default, kata diharapkan di kolom pertama dan frekuensi di kolom kedua. Setiap kata- pasangan frekuensi dalam baris terpisah. Baris didefinisikan sebagai urutan karakter yang diikuti oleh umpan baris ("\n"), carriage return ("\r"), atau carriage return yang segera diikuti oleh line feed ("\r\n"). Setiap kata diharapkan menggunakan huruf kecil. |

### Nilai Pengembalian

Teks dengan kata yang diganti.

### Lihat juga

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)


