---
title: RecognitionResult.Save
second_title: Aspose.OCR for .NET API Referansı
description: RecognitionResult yöntem. Belgeyi düz metin PDF veya Microsoft Word Belgesi olarak kaydeder.
type: docs
weight: 130
url: /tr/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

Belgeyi düz metin, PDF veya Microsoft Word Belgesi olarak kaydeder.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullFileName | String | Tanıma sonucunu seçilen formatta kaydetmek için yolu olan dosya adı. |
| saveFormat | SaveFormat | Belge formatı (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Tanıma sonucunuzda böyle bir hata olması durumunda yanlış yazılmış sözcükleri düzeltmek için true olarak ayarlayın. |
| language | SpellCheckLanguage | Yazım denetimi için sözlük (isteğe bağlı). |
| dictionaryPath | String | İsteğe bağlı olarak. .txt biçiminde kullanıcı sözlüğüne giden tam yol. Biçim [kelime - boşluk - frekans(sayı)]. Örnek: 23135851162\nyani 3400031103\n |

### Ayrıca bakınız

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* ad alanı [Aspose.OCR](../../recognitionresult/)
* toplantı [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

Belgeyi düz metin, PDF veya Microsoft Word Belgesi olarak kaydeder.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | Tanıma sonucunu seçilen biçimde kaydetmek için MemoryStream. |
| saveFormat | SaveFormat | Belge formatı (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Tanıma sonucunuzda böyle bir hata olması durumunda yanlış yazılmış sözcükleri düzeltmek için true olarak ayarlayın. |
| language | SpellCheckLanguage | Yazım denetimi için sözlük (isteğe bağlı). |
| dictionaryPath | String | İsteğe bağlı olarak. .txt biçiminde kullanıcı sözlüğüne giden tam yol. Biçim [kelime - boşluk - frekans(sayı)]. Örnek: 23135851162\nyani 3400031103\n |

### Ayrıca bakınız

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* ad alanı [Aspose.OCR](../../recognitionresult/)
* toplantı [Aspose.OCR](../../../)


