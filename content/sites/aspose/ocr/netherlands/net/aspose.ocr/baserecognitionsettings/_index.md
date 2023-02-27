---
title: Class BaseRecognitionSettings
second_title: Aspose.OCR voor .NET API-referentie
description: Aspose.OCR.BaseRecognitionSettings klas. Instellingen voor de beeldherkenning. Bevat elementen waarmee het herkenningsproces kan worden aangepast.
type: docs
weight: 30
url: /nl/net/aspose.ocr/baserecognitionsettings/
---
## BaseRecognitionSettings class

Instellingen voor de beeldherkenning. Bevat elementen waarmee het herkenningsproces kan worden aangepast.

```csharp
public class BaseRecognitionSettings
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [BaseRecognitionSettings](baserecognitionsettings/)(Language, bool, float, int) | Initialiseert een nieuw exemplaar van het[`RecognitionSettings`](../recognitionsettings/)klasse met volledige set eigenschappen. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | Toegestane tekens ingesteld. Bepaalt het type tekens dat is toegestaan voor het herkenningsresultaat. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Maakt het gebruik van een extra algoritme voor contrastcorrectie mogelijk voor de afbeelding vóór herkenning. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Maakt het gebruik van een extra neuraal netwerk mogelijk om het beeld te verbeteren - ruis verminderen. Nuttig voor afbeeldingen met scanartefacten, vervorming, vlekken, fakkels, verlopen, vreemde elementen. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Hiermee wordt een vlag opgehaald of ingesteld die aangeeft of automatische correctie van scheve afbeeldingen moet worden ingeschakeld. Standaard ingeschakeld (true). |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Hiermee kunt u de optimale modus selecteren voor documenttypegebieden: document, foto, platte tekst, kolom, afbeelding. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Stelt zwarte lijst in voor herkenningssymbolen. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | Hiermee wordt de taal gebruikt voor OCR opgehaald of ingesteld.  Bepaalt het alfabet dat wordt gebruikt tijdens de herkenning. Standaard meertalig. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Maakt het mogelijk om tekst in de tabellen te herkennen (regio's omringd door lijnen). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Maakt het mogelijk om de afbeelding voor OCR voor te bereiden door voorbewerkingsmethoden aan te passen. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Krijgt of stelt hoek in graden in voor beeldrotatie.  Als u deze waarde instelt, wordt de[`AutoSkew`](./autoskew/) eigenschap, zodat automatische schuintecorrectie niet wordt toegepast. Standaard nul. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Haalt het aantal threads voor verwerking op of stelt het in. Standaard betekent 0 dat de afbeelding wordt verwerkt met het aantal threads dat gelijk is aan uw aantal processors. ThreadsCount = 1 betekent dat de afbeelding wordt verwerkt in de hoofdthread. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Krijgt of stelt een aangepaste drempelwaarde in voor binarisatie van afbeeldingen. Bereik van 1 tot 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Hiermee kunt u aanvullende algoritmen gebruiken, specifiek voor herkenning van kleine lettertypen. Nuttig voor afbeeldingen met kleine tekens. |

### Zie ook

* naamruimte [Aspose.OCR](../../aspose.ocr/)
* montage [Aspose.OCR](../../)


