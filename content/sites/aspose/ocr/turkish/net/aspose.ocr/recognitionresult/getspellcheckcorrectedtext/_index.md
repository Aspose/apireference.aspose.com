---
title: RecognitionResult.GetSpellCheckCorrectedText
second_title: Aspose.OCR for .NET API Referansı
description: RecognitionResult yöntem. Metni düzeltir yanlış yazılmış sözcükleri değiştirir.
type: docs
weight: 100
url: /tr/net/aspose.ocr/recognitionresult/getspellcheckcorrectedtext/
---
## RecognitionResult.GetSpellCheckCorrectedText method

Metni düzeltir (yanlış yazılmış sözcükleri değiştirir).

```csharp
public string GetSpellCheckCorrectedText(SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| language | SpellCheckLanguage | Kullanılacak sözlük. |
| dictionaryPath | String | İsteğe bağlı olarak. Kullanıcı sözlüğüne (sıklık sözlüğü) giden tam yol. Sözlük dosyası formatı: UTF-8 kodlamasında düz metin dosyası. Sözcük ve Sözcük Sıklığı boşluk veya sekmeyle ayrılır. Varsayılan olarak, sözcük ilk sütunda ve sıklık ikinci sütunda beklenir. Her sözcük- frekans çifti ayrı bir satırda.Bir satır, bir satır besleme ("\n"), bir satır başı ("\r"), veya bir satır başı ve hemen ardından bir satır başı tarafından takip edilen bir karakter dizisi olarak tanımlanır ("\r\n"). Her kelimenin küçük harf olması beklenir. |

### Geri dönüş değeri

Değiştirilen sözcüklerle metin.

### Ayrıca bakınız

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* ad alanı [Aspose.OCR](../../recognitionresult/)
* toplantı [Aspose.OCR](../../../)


