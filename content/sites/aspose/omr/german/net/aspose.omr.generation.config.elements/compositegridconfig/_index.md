---
title: Class CompositeGridConfig
second_title: Aspose.OMR für .NET-API-Referenz
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig klas. Gitterelement. Erzeuge eine Reihe von Blasen. Jede gefüllte Blase stellt ein Symbol im zusammengesetzten Wert dar. Alle markierten Symbole werden zu einem einzigen Wert verkettet.
type: docs
weight: 120
url: /de/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

Gitterelement. Erzeuge eine Reihe von Blasen. Jede gefüllte Blase stellt ein Symbol im zusammengesetzten Wert dar. Alle markierten Symbole werden zu einem einzigen Wert verkettet.

```csharp
public class CompositeGridConfig : BaseConfig
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | Default_Constructor |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | Die Art einer Blase |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | Wenn das Element in einem mehrspaltigen übergeordneten Element gezeichnet wird - Position darstellen. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | Anzahl der Spalten innerhalb des Rasters. Jede Spalte repräsentiert ein einzelnes Symbol im Ergebnis value Der Betrag muss gleich sein[`ExtraRow`](./extrarow/) Anzahl Spalten |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | Soll der Name dieses Grids angezeigt werden |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | Spaltenspezifische Werte, die über die Standardwerte gesetzt werden -[`Values`](./values/) . Dargestellt als zweidimensionales Array. Erste - Zeile. Zweite - Spalte. Jede Zeichenkette repräsentiert Text innerhalb der Blase. wenn die Zeichenkette null ist, wird keine Blase platziert. Die Anzahl der Spalten muss gleich sein[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | Rasterausrichtung, gibt an, wo das Raster auf Seite gezeichnet werden soll |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | Gitterausrichtung: horizontal oder vertikal. Gibt an, wie untergeordnete Elemente positioniert werden sollen |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | Quadratische Rahmenfarbe |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | Quadratische Rahmengröße |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | Gibt an, welche Art von Element am Anfang des Rasters gezeichnet werden soll |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | Name des Rasters. Wird als Identifikator in Recognition verwendet |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | Beschreibt die Rotation des Grid-Elements um seine eigene Achse. "90" - CompositeGrid um 90 Grad drehen "-90" - ComopositeGrid um -90 Grad drehen |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | Art des Omr-Elements. Erforderliches Feld für die JSON-Serialisierung. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | Sammlung von Zeichenfolgen, die mögliche Symbole in jeder Spalte beschreiben. Spaltenspezifische Werte werden eingefügt[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | X-Position des Rasters auf der Seite, überschreibt die Ausrichtung |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | Raster-Y-Position auf Seite, überschreibt die Ausrichtung |

## Felder

| Name | Beschreibung |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | Die Größe einer Blase |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | Der Rand zwischen Zeilen |

### Siehe auch

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* namensraum [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* Montage [Aspose.OMR](../../)


