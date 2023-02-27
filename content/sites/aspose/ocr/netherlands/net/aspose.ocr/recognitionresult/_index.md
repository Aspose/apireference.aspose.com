---
title: Class RecognitionResult
second_title: Aspose.OCR voor .NET API-referentie
description: Aspose.OCR.RecognitionResult klas. De resultaten van de beeldherkenning. Bevat elementen met herkenningsinformatie en methoden voor het exporteren van resultaten.
type: docs
weight: 220
url: /nl/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

De resultaten van de beeldherkenning. Bevat elementen met herkenningsinformatie en methoden voor het exporteren van resultaten.

```csharp
public class RecognitionResult
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | Krijgt of stelt afbeelding in voor pdf-creatie. |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | Krijgt coördinaten van rechthoeken. |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | Haalt lijstherkenningsresultaten op van een lijst met gebieden (rechthoeken). |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | Een set tekens gevonden door het herkenningsalgoritme en gerangschikt in aflopende volgorde van waarschijnlijkheid. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | Krijgt een lijst met herkenningsresultaten met een lijst met rijen (rechthoeken). |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | Krijgt herkenningsresultaat in één string. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | Krijgt scheve hoek. |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | Krijgt een lijst met waarschuwingsberichten die niet-kritieke fouten beschrijven die tijdens het genereren zijn verschenen. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | Vorm JSON-tekenreeks met herkenningsresultaten. |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | Corrigeert tekst (vervangt verkeerd gespelde woorden). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | Zoek de verkeerd gespelde woorden met voorgestelde spelling voor een bepaalde invoertekst. |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | Formulier XML-string met herkenningsresultaten. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | Slaat het document op als platte tekst, PDF of Microsoft Word-document. |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | Slaat het document op als platte tekst, PDF of Microsoft Word-document. |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | Om het volledige resultaat van herkende fragmenten (lijnen) te voltooien. |

## Andere leden

| Naam | Beschrijving |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | Herkende tekst uit rij met rijcoördinaten. |

### Zie ook

* naamruimte [Aspose.OCR](../../aspose.ocr/)
* montage [Aspose.OCR](../../)


