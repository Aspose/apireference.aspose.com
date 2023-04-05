---
title: Class PsSaveOptions
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.EPS.Device.PsSaveOptions klass. Den här klassen innehåller alternativ som krävs för att hantera processen för att konvertera dokument till PostScript PS eller Encapsulated PostScript EPS fil.
type: docs
weight: 80
url: /sv/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

Den här klassen innehåller alternativ som krävs för att hantera processen för att konvertera dokument till PostScript (PS) eller Encapsulated PostScript (EPS) fil.

```csharp
public class PsSaveOptions : SaveOptions
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | Initierar en ny instans av`PsSaveOptions` klass med standardvärden för flaggor!:SuppressErrors (sant) och!:Debug (falskt). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | Initierar en ny instans av`PsSaveOptions` klass med standardvärden för flagga!:Debug (falskt). |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Anger ytterligare mappar där omvandlaren ska hitta teckensnitt för inmatningsdokument. Standardmapp är standardtypsnittsmapp där OS hittar teckensnitt för interna behov. |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | Bakgrundsfärgen. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Anger om felsökningsinformation måste skrivas ut till standardutgångsström eller inte. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | Indikerar om använda teckensnitt ska bäddas in i PS-dokument. |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | En typ av teckensnitt för att bädda in teckensnitt i PS-dokument. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Returnerar en lista över undertryckta konverteringsfel If!:SuppressErrors är sant. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kvalitetskategorin anger komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre siffra som anges, desto högre komprimering och därför lägre kvalitet på bilden. 0 värde ger lägsta bildkvalitet, medan 100 ger högsta. |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | Sidans marginaler. |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | Storleken på sidan. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | Sparningsformatet för den resulterande filen. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Anger om fel måste undertryckas eller inte. Om sanna undertryckta fel läggs till i[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Om falskt kommer det första felet att avsluta programmet. |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | Indikerar om bakgrunden är genomskinlig. |

### Se även

* class [SaveOptions](../../aspose.page/saveoptions/)
* namnutrymme [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* hopsättning [Aspose.Page](../../)


