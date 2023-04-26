---
title: Class PdfSaveOptions
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.Presentation.Pdf.PdfSaveOptions klas. Klasse voor opslagopties voor XPSalsPDF.
type: docs
weight: 450
url: /nl/net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class

Klasse voor opslagopties voor XPS-als-PDF.

```csharp
public class PdfSaveOptions : SaveOptions
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | Creëert een nieuw exemplaar van opties. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specificeert extra mappen waar de converter lettertypen voor invoerdocument moet vinden. Standaardmap is standaardlettertypenmap waar het besturingssysteem lettertypen vindt voor interne behoeften. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specificeert of foutopsporingsinformatie moet worden afgedrukt naar de standaarduitvoerstroom of niet. |
| [EncryptionDetails](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/encryptiondetails/) { get; set; } | Verkrijgt of stelt coderingsdetails in. Indien niet ingesteld, wordt er geen codering uitgevoerd. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Retourneert een lijst met onderdrukte conversiefouten If!:SuppressErrors is waar. |
| [ImageCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/imagecompression/) { get; set; } | Specificeert het compressietype dat moet worden gebruikt voor alle afbeeldingen in het document. Standaard isAuto . |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | De categorie Kwaliteit specificeert het compressieniveau voor een afbeelding. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. 0 waarde resulteert in beeld van de laagste kwaliteit, terwijl 100 resulteert in hoogste. |
| [OutlineTreeExpansionLevel](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeexpansionlevel/) { get; set; } | Specificeert tot welk niveau het documentoverzicht moet worden uitgevouwen wanneer het PDF-bestand wordt geopend in een viewer. 1 - alleen de overzichtsitems op het eerste niveau worden getoond, 2 - alleen de overzichtsitems op het eerste en tweede niveau worden getoond, en enzovoort. Standaard is 1. |
| [OutlineTreeHeight](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeheight/) { get; set; } | Specificeert de hoogte van de omtrekstructuur van het document die moet worden opgeslagen. 0 - de omtrekstructuur wordt niet geconverteerd, 1 - alleen de overzichtsitems op het eerste niveau worden geconverteerd, enzovoort. Standaard is 10. |
| [PageNumbers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/pagenumbers/) { get; set; } | Haalt/stelt de reeks van aantallen te converteren pagina's op. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specificeert of fouten moeten worden onderdrukt of niet. Als waar onderdrukte fouten worden toegevoegd aan[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Indien false zal de eerste fout het programma beëindigen. |
| [TextCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/textcompression/) { get; set; } | Specificeert het compressietype dat moet worden gebruikt voor alle inhoudsstromen behalve afbeeldingen. Standaard isFlate . |

### Zie ook

* class [SaveOptions](../../aspose.page/saveoptions/)
* naamruimte [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* montage [Aspose.Page](../../)


