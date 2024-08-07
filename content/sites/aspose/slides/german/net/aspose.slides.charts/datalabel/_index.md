---
title: DataLabel
second_title: Aspose.Slides für .NET-API-Referenz
description: Repräsentiert eine Serienbeschriftung.
type: docs
weight: 1430
url: /de/net/aspose.slides.charts/datalabel/
---
## DataLabel class

Repräsentiert eine Serienbeschriftung.

```csharp
public class DataLabel : IDataLabel
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [DataLabel](datalabel)(IChartDataPoint) | Erstellt eine neue Instanz der DataLabel-Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [ActualHeight](../../aspose.slides.charts/datalabel/actualheight) { get; } | Gibt die tatsächliche Höhe des Diagrammelements an. Rufen Sie zuvor die Methode IChart.ValidateChartLayout() auf, um die tatsächlichen Werte zu erhalten. LesenSingle . |
| [ActualWidth](../../aspose.slides.charts/datalabel/actualwidth) { get; } | Gibt die tatsächliche Breite des Diagrammelements an. Rufen Sie zuvor die Methode IChart.ValidateChartLayout() auf, um die tatsächlichen Werte zu erhalten. LesenSingle . |
| [ActualX](../../aspose.slides.charts/datalabel/actualx) { get; } | Gibt die tatsächliche x-Position (links) des Diagrammelements relativ zur linken oberen Ecke des Diagramms an. Rufen Sie zuvor die Methode IChart.ValidateChartLayout() auf, um die tatsächlichen Werte zu erhalten. LesenSingle . |
| [ActualY](../../aspose.slides.charts/datalabel/actualy) { get; } | Gibt die tatsächliche Oberkante des Diagrammelements relativ zur linken oberen Ecke des Diagramms an. Rufen Sie zuvor die Methode IChart.ValidateChartLayout() auf, um die tatsächlichen Werte zu erhalten. LesenSingle . |
| [Bottom](../../aspose.slides.charts/datalabel/bottom) { get; } | Unten. SchreibgeschütztSingle . |
| [Chart](../../aspose.slides.charts/datalabel/chart) { get; } | Gibt das übergeordnete Diagramm zurück. Schreibgeschützt[`IChart`](../ichart) . |
| [DataLabelFormat](../../aspose.slides.charts/datalabel/datalabelformat) { get; } | Gibt das Datenbeschriftungsformat zurück. Schreibgeschützt[`IDataLabelFormat`](../idatalabelformat) . |
| [Height](../../aspose.slides.charts/datalabel/height) { get; set; } | Gibt die Höhe eines Titels als Bruchteil der Höhe des Diagramms zurück oder legt sie fest. Lesen/SchreibenSingle . |
| [IsVisible](../../aspose.slides.charts/datalabel/isvisible) { get; } | False bedeutet, dass das Datenlabel nicht sichtbar ist (und daher sind alle Show*-Flags (ShowValue, ...) falsch). Read-onlyBoolean . |
| [Right](../../aspose.slides.charts/datalabel/right) { get; } | Richtig. SchreibgeschütztSingle . |
| [TextFormat](../../aspose.slides.charts/datalabel/textformat) { get; } | Gibt das Textformat zurück. Schreibgeschützt[`IChartTextFormat`](../icharttextformat) . |
| [TextFrameForOverriding](../../aspose.slides.charts/datalabel/textframeforoverriding) { get; } | Kann einen reich formatierten Text enthalten. Wenn diese Eigenschaft nicht null ist, überschreibt dieser formatierte Textwert den automatisch generierten Text der Datenbeschriftung. Automatisch generierter Text der Datenbeschriftung bedeutet Text, der von den Eigenschaften ShowSeriesName, ShowValue, ... verwaltet und mit dem TextFormatManager formatiert wird .TextFormat-Eigenschaft. Schreibgeschützt[`ITextFrame`](../../aspose.slides/itextframe) . |
| [ValueFromCell](../../aspose.slides.charts/datalabel/valuefromcell) { get; set; } | Ruft Arbeitsmappen-Datenzelle ab oder legt sie fest. Wird angewendet, wenn die Eigenschaft IDataLabelFormat.ShowLabelValueFromCell gleich true ist. |
| [Width](../../aspose.slides.charts/datalabel/width) { get; set; } | Gibt die Breite eines Titels als Bruchteil der Breite des Diagramms zurück oder legt sie fest. Lesen/SchreibenSingle . |
| [X](../../aspose.slides.charts/datalabel/x) { get; set; } | Gibt die x-Koordinate eines Titels als Bruchteil der Breite des Diagramms zurück oder legt sie fest. Lesen/SchreibenSingle . |
| [Y](../../aspose.slides.charts/datalabel/y) { get; set; } | Gibt die y-Koordinate eines Titels als Bruchteil der Höhe des Diagramms zurück oder legt sie fest. Lesen/SchreibenSingle . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AddTextFrameForOverriding](../../aspose.slides.charts/datalabel/addtextframeforoverriding)(string) | Initialisiere TextFrameForOverriding mit dem Text im Parameter "text". Wenn TextFrameForOverriding bereits initialisiert ist, dann ändere einfach seinen Text. |
| [GetActualLabelText](../../aspose.slides.charts/datalabel/getactuallabeltext)() | Gibt den tatsächlichen Beschriftungstext basierend auf den DataLabelFormat-Einstellungen oder dem TextFrameForOverriding.Text-Wert zurück. |
| [Hide](../../aspose.slides.charts/datalabel/hide)() | Datenbeschriftung unsichtbar machen, indem alle Show*-Flags (ShowValue, ...) auf false gesetzt werden. IsVisible ist danach false. |

### Siehe auch

* interface [IDataLabel](../idatalabel)
* namensraum [Aspose.Slides.Charts](../../aspose.slides.charts)
* Montage [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
