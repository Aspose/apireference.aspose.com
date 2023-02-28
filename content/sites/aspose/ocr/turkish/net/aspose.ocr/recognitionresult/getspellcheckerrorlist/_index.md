---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR for .NET API Referansı
description: RecognitionResult yöntem. Belirli bir giriş metni için önerilen yazımlarla yanlış yazılmış sözcükleri bulun.
type: docs
weight: 110
url: /tr/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

Belirli bir giriş metni için önerilen yazımlarla yanlış yazılmış sözcükleri bulun.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| language | SpellCheckLanguage | Kullanılacak sözlük. |
| dictionaryPath | String | İsteğe bağlı olarak. Kullanıcı sözlüğüne (sıklık sözlüğü) giden tam yol. Sözlük dosyası formatı: UTF-8 kodlamasında düz metin dosyası. Sözcük ve Sözcük Sıklığı boşluk veya sekmeyle ayrılır. Varsayılan olarak, sözcük ilk sütunda ve sıklık ikinci sütunda beklenir. Her sözcük- frekans çifti ayrı bir satırda.Bir satır, bir satır besleme ("\n"), bir satır başı ("\r"), veya bir satır başı ve hemen ardından bir satır başı tarafından takip edilen bir karakter dizisi olarak tanımlanır ("\r\n"). Her kelimenin küçük harf olması beklenir. |

### Geri dönüş değeri

Listelerle birlikte yanlış yazılmış sözcükleri temsil eden SpellCheckError nesnesinin bir listesi, yanlış yazılmış her sözcük için önerilen doğru yazımları, ve düzenleme mesafesiyle birlikte.

### Ayrıca bakınız

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* ad alanı [Aspose.OCR](../../recognitionresult/)
* toplantı [Aspose.OCR](../../../)


