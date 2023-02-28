---
title: Class IDCardRecognitionSettings
second_title: Aspose.OCR för .NET API-referens
description: Aspose.OCR.IDCardRecognitionSettings klass. Inställningar för IDkortsigenkänning. Innehåller element som gör det möjligt att anpassa igenkänningsprocessen.
type: docs
weight: 90
url: /sv/net/aspose.ocr/idcardrecognitionsettings/
---
## IDCardRecognitionSettings class

Inställningar för ID-kortsigenkänning. Innehåller element som gör det möjligt att anpassa igenkänningsprocessen.

```csharp
public class IDCardRecognitionSettings : ReceiptRecognitionSettings
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [IDCardRecognitionSettings](idcardrecognitionsettings/)(Language) | Initierar en ny instans av`IDCardRecognitionSettings`klass med fullständig uppsättning egenskaper. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/receiptrecognitionsettings/allowedcharacters/) { get; set; } | Tillåtna teckenuppsättningar. Bestämmer vilken typ av tecken som tillåts för igenkänningsresultat. |
| [AutoSkew](../../aspose.ocr/receiptrecognitionsettings/autoskew/) { set; } | Hämtar eller ställer in en flagga som indikerar om automatisk snedställningskorrigering ska vara aktiverad. Aktiverad (true) som standard. |
| [IgnoredCharacters](../../aspose.ocr/receiptrecognitionsettings/ignoredcharacters/) { get; set; } | Ställer in svartlista för igenkänningssymboler. |
| [Language](../../aspose.ocr/receiptrecognitionsettings/language/) { set; } | Hämtar eller ställer in språket som används för OCR.  Bestämmer alfabetet som används under igenkänning. Flerspråkigt som standard. |
| [PreprocessingFilters](../../aspose.ocr/receiptrecognitionsettings/preprocessingfilters/) { get; set; } | Gör det möjligt att förbereda bilden för OCR genom att justera förbehandlingsmetoder. |
| [ThreadsCount](../../aspose.ocr/receiptrecognitionsettings/threadscount/) { set; } | Hämtar eller ställer in antalet trådar för bearbetning. Som standard betyder 0 att bilden kommer att bearbetas med antalet trådar lika med ditt antal processorer. ThreadsCount = 1 betyder att bilden kommer att bearbetas i huvudtråden. |

### Se även

* class [ReceiptRecognitionSettings](../receiptrecognitionsettings/)
* namnutrymme [Aspose.OCR](../../aspose.ocr/)
* hopsättning [Aspose.OCR](../../)


