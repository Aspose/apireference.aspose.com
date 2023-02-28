---
title: Class RecognitionResult
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: Aspose.OCR.RecognitionResult कक्ष. छव पहचन के परणम में पहचन जनकर और परणम नर्यत के तरकं के सथ तत्व शमल हैं
type: docs
weight: 220
url: /hi/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

छवि पहचान के परिणाम। में पहचान जानकारी और परिणाम निर्यात के तरीकों के साथ तत्व शामिल हैं।

```csharp
public class RecognitionResult
```

## गुण

| नाम | विवरण |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | पीडीएफ निर्माण के लिए छवि प्राप्त या सेट करता है। |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | आयत निर्देशांक प्राप्त करता है। |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | क्षेत्रों की सूची (आयत) के सूची पहचान परिणाम प्राप्त करता है। |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | वर्णों का एक सेट पहचान एल्गोरिथम द्वारा पाया गया और संभाव्यता के अवरोही क्रम में व्यवस्थित किया गया। |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | पंक्तियों (आयत) की सूची के साथ मान्यता परिणामों की एक सूची प्राप्त करता है। |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | एक स्ट्रिंग में मान्यता परिणाम प्राप्त करता है। |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | तिरछा कोण हो जाता है। |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | जनरेशन के दौरान दिखाई देने वाले गैर-महत्वपूर्ण दोषों का वर्णन करने वाले चेतावनी संदेशों की सूची प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | पहचान परिणामों के साथ फॉर्म JSON स्ट्रिंग। |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | पाठ को ठीक करता है (गलत वर्तनी वाले शब्दों को बदलता है)। |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | दिए गए इनपुट टेक्स्ट के लिए गलत वर्तनी वाले शब्दों को सुझाई गई वर्तनी के साथ खोजें। |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | मान्यता परिणामों के साथ फॉर्म एक्सएमएल स्ट्रिंग। |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | दस्तावेज़ को सादे पाठ, PDF या Microsoft Word दस्तावेज़ के रूप में सहेजता है। |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | दस्तावेज़ को सादे पाठ, PDF या Microsoft Word दस्तावेज़ के रूप में सहेजता है। |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | पहचाने गए अंशों (रेखाओं) से पूरा परिणाम पूरा करने के लिए। |

## अन्य सदस्य

| नाम | विवरण |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | पंक्ति निर्देशांक के साथ पंक्ति से पहचाना गया पाठ। |

### यह सभी देखें

* नाम स्थान [Aspose.OCR](../../aspose.ocr/)
* सभा [Aspose.OCR](../../)


