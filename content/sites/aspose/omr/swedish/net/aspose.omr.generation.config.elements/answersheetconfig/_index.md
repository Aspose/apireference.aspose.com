---
title: Class AnswerSheetConfig
second_title: Aspose.OMR för .NET API-referens
description: Aspose.OMR.Generation.Config.Elements.AnswerSheetConfig klass. Representerar AnswerSheetelement. Det gör det möjligt att lägga till valrutor grupperade i kolumner och rader. Använd svarsbladet om du vill få plats med många frågor på en sida eftersom de ligger nära varandra.
type: docs
weight: 90
url: /sv/net/aspose.omr.generation.config.elements/answersheetconfig/
---
## AnswerSheetConfig class

Representerar AnswerSheet-element. Det gör det möjligt att lägga till valrutor grupperade i kolumner och rader. Använd svarsbladet om du vill få plats med många frågor på en sida eftersom de ligger nära varandra.

```csharp
public class AnswerSheetConfig : BaseConfig
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [AnswerSheetConfig](answersheetconfig/)() | Default_Constructor |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AnswersCount](../../aspose.omr.generation.config.elements/answersheetconfig/answerscount/) { get; set; } | Antalet svarsalternativ för varje fråga i svarsbladet. |
| [AnswersValues](../../aspose.omr.generation.config.elements/answersheetconfig/answersvalues/) { get; set; } | Varje värde representerar symbol inuti bubblan. Måste ha samma antal som[`AnswersCount`](./answerscount/) Exempel: ny sträng[] {"A", "B", "C", "D"} Exempel: ny sträng[] {"1", "2", "3", "4"} |
| [BubbleType](../../aspose.omr.generation.config.elements/answersheetconfig/bubbletype/) { get; set; } | Typen av en bubbla |
| [Column](../../aspose.omr.generation.config.elements/answersheetconfig/column/) { get; set; } | Indikerar i vilken kolumn ark ska ritas |
| [ColumnsCount](../../aspose.omr.generation.config.elements/answersheetconfig/columnscount/) { get; set; } | Anger antalet kolumner som ska ritas. |
| [ElementsCount](../../aspose.omr.generation.config.elements/answersheetconfig/elementscount/) { get; set; } | Bestämmer det totala antalet frågor i svarsbladet. |
| override [Name](../../aspose.omr.generation.config.elements/answersheetconfig/name/) { get; set; } | Namn på svarsblad |
| [StartId](../../aspose.omr.generation.config.elements/answersheetconfig/startid/) { get; set; } | Startindex för frågorna numbering |
| override [Type](../../aspose.omr.generation.config.elements/answersheetconfig/type/) { get; set; } | Typ av omr-element. Obligatoriskt fält för JSON-serialisering. |
| [VerticalMargin](../../aspose.omr.generation.config.elements/answersheetconfig/verticalmargin/) { get; set; } | Vertikal marginal på svarsbladet. Ange i pixlar. |

## Fält

| namn | Beskrivning |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/answersheetconfig/bubblesize/) | Storleken på en bubbla |

### Se även

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* namnutrymme [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* hopsättning [Aspose.OMR](../../)


