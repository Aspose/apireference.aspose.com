---
title: Class SaveOptions
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.SaveOptions klas. Deze klasse bevat opties die nodig zijn voor het beheer van het conversieproces.
type: docs
weight: 300
url: /nl/net/aspose.page/saveoptions/
---
## SaveOptions class

Deze klasse bevat opties die nodig zijn voor het beheer van het conversieproces.

```csharp
public abstract class SaveOptions
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [SaveOptions](saveoptions/#constructor)() | Initialiseert een nieuw exemplaar van het`SaveOptions` klasse met standaardwaarden voor vlaggen!:SuppressErrors (waar) en[`Debug`](./debug/) (niet waar). |
| [SaveOptions](saveoptions/#constructor_1)(bool) | Initialiseert een nieuw exemplaar van het`SaveOptions` klasse met standaardwaarde voor vlag[`Debug`](./debug/) (niet waar). |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specificeert extra mappen waar de converter lettertypen voor invoerdocument moet vinden. Standaardmap is standaardlettertypenmap waar het besturingssysteem lettertypen vindt voor interne behoeften. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specificeert of foutopsporingsinformatie moet worden afgedrukt naar de standaarduitvoerstroom of niet. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Retourneert een lijst met onderdrukte conversiefouten If!:SuppressErrors is waar. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | De categorie Kwaliteit specificeert het compressieniveau voor een afbeelding. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. 0 waarde resulteert in beeld van de laagste kwaliteit, terwijl 100 resulteert in hoogste. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specificeert of fouten moeten worden onderdrukt of niet. Als waar onderdrukte fouten worden toegevoegd aan[`Exceptions`](./exceptions/) list. Indien false zal de eerste fout het programma beëindigen. |

### Zie ook

* naamruimte [Aspose.Page](../../aspose.page/)
* montage [Aspose.Page](../../)


