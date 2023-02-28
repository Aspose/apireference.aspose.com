---
title: Class RecognitionSettings
second_title: Aspose.OCR för .NET API-referens
description: Aspose.OCR.RecognitionSettings klass. Inställningar för bildigenkänning. Innehåller element som gör det möjligt att anpassa igenkänningsprocessen.
type: docs
weight: 240
url: /sv/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

Inställningar för bildigenkänning. Innehåller element som gör det möjligt att anpassa igenkänningsprocessen.

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | Initierar en ny instans av`RecognitionSettings`klass med fullständig uppsättning egenskaper. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | Tillåtna teckenuppsättningar. Bestämmer vilken typ av tecken som tillåts för igenkänningsresultat. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Gör det möjligt att använda en extra kontrastkorrigeringsalgoritm för bilden före igenkänning. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Möjliggör användningen av ytterligare ett neuralt nätverk för att förbättra bilden - reducera brus. Användbart för bilder med skanningsartefakter, distorsion, fläckar, flare, gradienter, främmande element. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Hämtar eller ställer in en flagga som indikerar om automatisk snedställningskorrigering ska vara aktiverad. Aktiverad (true) som standard. |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Gör det möjligt att välja det optimala läget för dokumenttypområden: dokument, foto, vanlig text, kolumn, bild. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Ställer in svartlista för igenkänningssymboler. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | Hämtar eller ställer in språket som används för OCR.  Bestämmer alfabetet som används under igenkänning. Flerspråkigt som standard. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Tillåter att känna igen text i tabellerna (regioner omgivna linjer). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Gör det möjligt att förbereda bilden för OCR genom att justera förbehandlingsmetoder. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | Hämtar eller ställer in listan över textområden för bearbetning.  Gör det möjligt att manuellt specificera områden med text för mer exakt igenkänning. Om anpassade områden är inställdaDetectAreas och!:AutoSkew egenskaper kommer att ignoreras.  Inaktiverar DetectAreas och AutoSkew. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | Ställer in en rad bildigenkänning. Inaktiverad (falsk) som standard. Inaktivera alla bearbetningssteg som är associerade med uppdelning i rader. Ställ in denna parameter på true om din bild bara innehåller en rad. Inaktiverar RecognitionAreas-inställningarna så att alla områdesinställningar ignoreras. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Hämtar eller ställer in vinkel i grader för bildrotation.  Om du ställer in detta värde inaktiveras[`AutoSkew`](../baserecognitionsettings/autoskew/) egenskap, så att automatisk skevningskorrigering inte tillämpas. Noll som standard. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Hämtar eller ställer in antalet trådar för bearbetning. Som standard betyder 0 att bilden kommer att bearbetas med antalet trådar lika med ditt antal processorer. ThreadsCount = 1 betyder att bilden kommer att bearbetas i huvudtråden. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Hämtar eller ställer in anpassat tröskelvärde för bildbinarisering. Intervall från 1 till 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Låter dig använda ytterligare algoritmer specifikt för igenkänning av små teckensnitt. Användbart för bilder med små tecken. |

### Se även

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* namnutrymme [Aspose.OCR](../../aspose.ocr/)
* hopsättning [Aspose.OCR](../../)


