---
title: Class CompositeGridConfig
second_title: Aspose.OMR för .NET API-referens
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig klass. Grid element. Producera en mängd bubblor. Varje fylld bubbla representerar en symbol i sammansatt värde Alla markerade symboler kommer att sammanfogas till ett enda värde
type: docs
weight: 120
url: /sv/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

Grid element. Producera en mängd bubblor. Varje fylld bubbla representerar en symbol i sammansatt värde Alla markerade symboler kommer att sammanfogas till ett enda värde

```csharp
public class CompositeGridConfig : BaseConfig
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | Default_Constructor |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | Typen av en bubbla |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | När element är ritat i flera kolumner - representera position. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | Antal kolumner i rutnätet. Varje kolumn representerar en symbol i resultatet value Beloppet måste vara lika med[`ExtraRow`](./extrarow/) antal kolumner |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | Ska namnet på detta rutnät visas |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | Kolumnspecifika värden som kommer att placeras ovanpå standardvärden -[`Values`](./values/) . Presenteras som tvådimensionell array. Första - raden. Andra - kolumn. Varje sträng representerar text inuti bubblan. om strängen är null kommer ingen bubbla att placeras. Antalet kolumner måste vara lika med[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | Rutnätsjustering, anger var rutnätet ska ritas på sidan |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | Rutnätsorientering: horisontell eller vertikal. Indikerar hur underordnade element ska placeras |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | Fyrkantig kantfärg |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | Fyrkantig kantstorlek |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | Indikerar vilken typ av element som ska ritas i början av rutnätet |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | Namn på rutnät. Används som identifierare i recognition |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | Beskriv rotation av Grid-elementet runt sin egen axel. "90" - rotera CompositeGrid 90 grader "-90" - rotera ComopositeGrid till -90 grader |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | Typ av omr-element. Obligatoriskt fält för JSON-serialisering. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | Samling av strängar som kommer att beskriva möjliga symboler i varje kolumn. Kolumnspecifika värden placeras i[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | Rutnät X-position på sidan, åsidosätter alignment |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | Rutnät Y-position på sidan, åsidosätter alignment |

## Fält

| namn | Beskrivning |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | Storleken på en bubbla |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | Marginalen mellan lines |

### Se även

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* namnutrymme [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* hopsättning [Aspose.OMR](../../)


