---
title: RecognitionResult.Save
second_title: Aspose.OCR untuk .NET API Referensi
description: RecognitionResult metode. Menyimpan dokumen sebagai teks biasa PDF atau Dokumen Microsoft Word.
type: docs
weight: 130
url: /id/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

Menyimpan dokumen sebagai teks biasa, PDF atau Dokumen Microsoft Word.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| fullFileName | String | Nama file dengan jalur untuk menyimpan hasil pengenalan dalam format yang dipilih. |
| saveFormat | SaveFormat | Format dokumen (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Tetapkan benar untuk memperbaiki kata yang salah eja jika Anda memilikinya di hasil pengenalan Anda. |
| language | SpellCheckLanguage | Kamus untuk pemeriksaan ejaan (opsional). |
| dictionaryPath | String | Opsional. Jalur lengkap ke kamus pengguna dalam format .txt. Formatnya adalah [kata - spasi - frekuensi(angka)]. Contoh: 23135851162\nitu 3400031103\n |

### Lihat juga

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* ruang nama [Aspose.OCR](../../recognitionresult/)
* perakitan [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

Menyimpan dokumen sebagai teks biasa, PDF atau Dokumen Microsoft Word.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream untuk menyimpan hasil pengenalan dalam format yang dipilih. |
| saveFormat | SaveFormat | Format dokumen (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Tetapkan benar untuk memperbaiki kata yang salah eja jika Anda memilikinya di hasil pengenalan Anda. |
| language | SpellCheckLanguage | Kamus untuk pemeriksaan ejaan (opsional). |
| dictionaryPath | String | Opsional. Jalur lengkap ke kamus pengguna dalam format .txt. Formatnya adalah [kata - spasi - frekuensi(angka)]. Contoh: 23135851162\nitu 3400031103\n |

### Lihat juga

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* ruang nama [Aspose.OCR](../../recognitionresult/)
* perakitan [Aspose.OCR](../../../)


