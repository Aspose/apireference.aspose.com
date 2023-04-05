---
title: Class PdfSaveOptions
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.EPS.Device.PdfSaveOptions klass. Den här klassen innehåller in och utströmmar och andra alternativ som är nödvändiga för att hantera konverteringsprocessen.
type: docs
weight: 70
url: /sv/net/aspose.page.eps.device/pdfsaveoptions/
---
## PdfSaveOptions class

Den här klassen innehåller in- och utströmmar och andra alternativ som är nödvändiga för att hantera konverteringsprocessen.

```csharp
public class PdfSaveOptions : SaveOptions
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/#constructor)() | Initierar en ny instans av`PdfSaveOptions` klass med standardvärden för flaggor!:SuppressErrors (sant) och!:Debug (falskt). |
| [PdfSaveOptions](pdfsaveoptions/#constructor_1)(bool) | Initierar en ny instans av`PdfSaveOptions` klass med standardvärden för flagga!:Debug (falskt). |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Anger ytterligare mappar där omvandlaren ska hitta teckensnitt för inmatningsdokument. Standardmapp är standardtypsnittsmapp där OS hittar teckensnitt för interna behov. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Anger om felsökningsinformation måste skrivas ut till standardutgångsström eller inte. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Returnerar en lista över undertryckta konverteringsfel If!:SuppressErrors är sant. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kvalitetskategorin anger komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre siffra som anges, desto högre komprimering och därför lägre kvalitet på bilden. 0 värde ger lägsta bildkvalitet, medan 100 ger högsta. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Anger om fel måste undertryckas eller inte. Om sanna undertryckta fel läggs till i[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Om falskt kommer det första felet att avsluta programmet. |

### Se även

* class [SaveOptions](../../aspose.page/saveoptions/)
* namnutrymme [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* hopsättning [Aspose.Page](../../)


