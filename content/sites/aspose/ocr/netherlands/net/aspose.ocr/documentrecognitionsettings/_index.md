---
title: Class DocumentRecognitionSettings
second_title: Aspose.OCR voor .NET API-referentie
description: Aspose.OCR.DocumentRecognitionSettings klas. Instellingen voor de pdfherkenning. Bevat elementen waarmee het herkenningsproces kan worden aangepast.
type: docs
weight: 70
url: /nl/net/aspose.ocr/documentrecognitionsettings/
---
## DocumentRecognitionSettings class

Instellingen voor de pdf-herkenning. Bevat elementen waarmee het herkenningsproces kan worden aangepast.

```csharp
public class DocumentRecognitionSettings : BaseRecognitionSettings
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [DocumentRecognitionSettings](documentrecognitionsettings/#constructor)(int, int) | Initialiseert een nieuw exemplaar van het`DocumentRecognitionSettings` klasse met een korte set eigenschappen. |
| [DocumentRecognitionSettings](documentrecognitionsettings/#constructor_1)(int, int, Language, bool, bool, int) | Initialiseert een nieuw exemplaar van het`DocumentRecognitionSettings`klasse met volledige set eigenschappen. |

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
| [PagesNumber](../../aspose.ocr/documentrecognitionsettings/pagesnumber/) { get; set; } | Stel het aantal pagina's in voor herkenning van een pdf-bestand met meerdere pagina's. |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Maakt het mogelijk om de afbeelding voor OCR voor te bereiden door voorbewerkingsmethoden aan te passen. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Krijgt of stelt hoek in graden in voor beeldrotatie.  Als u deze waarde instelt, wordt de[`AutoSkew`](../baserecognitionsettings/autoskew/) eigenschap, zodat automatische schuintecorrectie niet wordt toegepast. Standaard nul. |
| [StartPage](../../aspose.ocr/documentrecognitionsettings/startpage/) { get; set; } | Stel de eerste pagina in voor herkenning. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Haalt het aantal threads voor verwerking op of stelt het in. Standaard betekent 0 dat de afbeelding wordt verwerkt met het aantal threads dat gelijk is aan uw aantal processors. ThreadsCount = 1 betekent dat de afbeelding wordt verwerkt in de hoofdthread. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Krijgt of stelt een aangepaste drempelwaarde in voor binarisatie van afbeeldingen. Bereik van 1 tot 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Hiermee kunt u aanvullende algoritmen gebruiken, specifiek voor herkenning van kleine lettertypen. Nuttig voor afbeeldingen met kleine tekens. |

### Zie ook

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* naamruimte [Aspose.OCR](../../aspose.ocr/)
* montage [Aspose.OCR](../../)


