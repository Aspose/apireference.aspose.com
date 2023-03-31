---
title: Class CompositeGridConfig
second_title: Aspose.OMR voor .NET API-referentie
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig klas. Rasterelement. Produceer een reeks bubbels. Elke gevulde bel vertegenwoordigt één symbool in samengestelde waarde Alle gemarkeerde symbolen worden samengevoegd tot enkele waarde
type: docs
weight: 120
url: /nl/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

Rasterelement. Produceer een reeks bubbels. Elke gevulde bel vertegenwoordigt één symbool in samengestelde waarde Alle gemarkeerde symbolen worden samengevoegd tot enkele waarde

```csharp
public class CompositeGridConfig : BaseConfig
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | De standaard constructeur. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | Het type bubbel |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | Wanneer element wordt getekend in ouder met meerdere kolommen - vertegenwoordig positie. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | Aantal kolommen binnen raster. Elke kolom vertegenwoordigt een enkel symbool in het resultaat value Bedrag moet gelijk zijn aan[`ExtraRow`](./extrarow/) aantal kolommen |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | Moet de naam van dit raster worden weergegeven |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | Kolomspecifieke waarden die bovenop de standaardwaarden worden geplaatst -[`Values`](./values/) . Gepresenteerd als tweedimensionale array. Eerste rij. Tweede - kolom. Elke tekenreeks vertegenwoordigt tekst binnen de ballon. als de tekenreeks null is, wordt er geen ballon geplaatst. Aantal kolommen moet gelijk zijn aan[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | Rasteruitlijning, geeft aan waar het raster moet worden getekend op de pagina |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | Rasteroriëntatie: horizontaal of verticaal. Geeft aan hoe onderliggende elementen moeten worden gepositioneerd |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | Kleur vierkante rand |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | Grootte vierkante rand |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | Geeft aan welk type element moet worden getekend aan het begin van het raster |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | Naam van raster. Gebruikt als identifier in recognition |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | Beschrijf de rotatie van het Grid-element rond zijn eigen as. "90" - draai CompositeGrid 90 graden "-90" - roteer CompositeGrid tot -90 graden |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | Type omr-element. Verplicht veld voor JSON-serialisatie. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | Verzameling strings die mogelijke symbolen in elke kolom beschrijven. Kolomspecifieke waarden worden geplaatst in[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | Raster X-positie op pagina, heft de uitlijning op |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | Raster Y-positie op pagina, heft de uitlijning op |

## Velden

| Naam | Beschrijving |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | De grootte van een bubbel |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | De marge tussen lijnen |

### Zie ook

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* naamruimte [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* montage [Aspose.OMR](../../)


