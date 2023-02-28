---
title: Class RecognitionResult
second_title: Aspose.OCR for .NET API Referansı
description: Aspose.OCR.RecognitionResult sınıf. Görüntü tanımanın sonuçları. Tanıma bilgileri ve sonuç dışa aktarma yöntemleri içeren öğeler içerir.
type: docs
weight: 220
url: /tr/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

Görüntü tanımanın sonuçları. Tanıma bilgileri ve sonuç dışa aktarma yöntemleri içeren öğeler içerir.

```csharp
public class RecognitionResult
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | PDF oluşturma için görüntüyü alır veya ayarlar. |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | Dikdörtgen koordinatlarını alır. |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | Bir alan listesinin (Dikdörtgenler) liste tanıma sonuçlarını alır. |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | Tanıma algoritması tarafından bulunan ve azalan olasılık sırasına göre düzenlenmiş bir dizi karakter. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | Bir satır listesiyle (Dikdörtgenler) tanıma sonuçlarının bir listesini alır. |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | Bir dizide tanıma sonucunu alır. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | Eğim açısını alır. |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | Üretim sırasında ortaya çıkan kritik olmayan hataları açıklayan uyarı mesajlarının listesini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | Tanıma sonuçlarıyla birlikte Form JSON dizesi. |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | Metni düzeltir (yanlış yazılmış sözcükleri değiştirir). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | Belirli bir giriş metni için önerilen yazımlarla yanlış yazılmış sözcükleri bulun. |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | Tanıma sonuçlarıyla Form XML dizesi. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | Belgeyi düz metin, PDF veya Microsoft Word Belgesi olarak kaydeder. |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | Belgeyi düz metin, PDF veya Microsoft Word Belgesi olarak kaydeder. |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | Tanınan parçalardan (çizgilerden) tam sonucu tamamlamak için. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | Satır koordinatlarıyla satırdan tanınan metin. |

### Ayrıca bakınız

* ad alanı [Aspose.OCR](../../aspose.ocr/)
* toplantı [Aspose.OCR](../../)


