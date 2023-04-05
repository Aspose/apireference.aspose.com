---
title: Class ImageSaveOptions
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.EPS.Device.ImageSaveOptions klas. Deze klasse bevat opties die nodig zijn voor het beheren van het beeldopslagproces.
type: docs
weight: 50
url: /nl/net/aspose.page.eps.device/imagesaveoptions/
---
## ImageSaveOptions class

Deze klasse bevat opties die nodig zijn voor het beheren van het beeldopslagproces.

```csharp
public class ImageSaveOptions : SaveOptions
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [ImageSaveOptions](imagesaveoptions/#constructor)() | Initialiseert een nieuw exemplaar van het`ImageSaveOptions` klasse met standaardwaarden voor vlaggen!:SuppressErrors (waar) en!:Debug (niet waar). |
| [ImageSaveOptions](imagesaveoptions/#constructor_1)(bool) | Initialiseert een nieuw exemplaar van het`ImageSaveOptions` with standaardwaarde voor vlag!:Debug (niet waar). |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specificeert extra mappen waar de converter lettertypen voor invoerdocument moet vinden. Standaardmap is standaardlettertypenmap waar het besturingssysteem lettertypen vindt voor interne behoeften. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specificeert of foutopsporingsinformatie moet worden afgedrukt naar de standaarduitvoerstroom of niet. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Retourneert een lijst met onderdrukte conversiefouten If!:SuppressErrors is waar. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | De categorie Kwaliteit specificeert het compressieniveau voor een afbeelding. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. 0 waarde resulteert in beeld van de laagste kwaliteit, terwijl 100 resulteert in hoogste. |
| [Resolution](../../aspose.page.eps.device/imagesaveoptions/resolution/) { get; set; } | Krijgt/stelt de beeldresolutie in. |
| [SmoothingMode](../../aspose.page.eps.device/imagesaveoptions/smoothingmode/) { get; set; } | Krijgt/stelt de afvlakkingsmodus in voor het renderen van afbeeldingen. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specificeert of fouten moeten worden onderdrukt of niet. Als waar onderdrukte fouten worden toegevoegd aan[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Indien false zal de eerste fout het programma beëindigen. |

### Zie ook

* class [SaveOptions](../../aspose.page/saveoptions/)
* naamruimte [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* montage [Aspose.Page](../../)


