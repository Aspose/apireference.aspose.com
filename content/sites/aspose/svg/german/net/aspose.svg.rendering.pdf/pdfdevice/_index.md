---
title: PdfDevice
second_title: Aspose.SVG für .NET-API-Referenz
description: Stellt das Rendern in ein PDFDokument dar.
type: docs
weight: 2900
url: /de/net/aspose.svg.rendering.pdf/pdfdevice/
---
## PdfDevice class

Stellt das Rendern in ein PDF-Dokument dar.

```csharp
public class PdfDevice : Device<PdfGraphicContext, PdfRenderingOptions>
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(ICreateStreamProvider) | Initialisiert eine neue Instanz von[`PdfDevice`](../pdfdevice) Klasse. |
| [PdfDevice](pdfdevice#constructor_4)(Stream) | Initialisiert eine neue Instanz von[`PdfDevice`](../pdfdevice) Klasse. |
| [PdfDevice](pdfdevice#constructor_5)(string) | Initialisiert eine neue Instanz von[`PdfDevice`](../pdfdevice) Klasse. |
| [PdfDevice](pdfdevice#constructor_1)(PdfRenderingOptions, ICreateStreamProvider) | Initialisiert eine neue Instanz von[`PdfDevice`](../pdfdevice) Klasse nach Rendering-Optionen und Stream-Provider. |
| [PdfDevice](pdfdevice#constructor_2)(PdfRenderingOptions, Stream) | Initialisiert eine neue Instanz von[`PdfDevice`](../pdfdevice) Klasse nach Rendering-Optionen und Ausgabestream. |
| [PdfDevice](pdfdevice#constructor_3)(PdfRenderingOptions, string) | Initialisiert eine neue Instanz von[`PdfDevice`](../pdfdevice) Klasse nach Rendering-Optionen und Name der Ausgabedatei. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext) { get; } |  |
| [Options](../../aspose.svg.rendering/device`2/options) { get; } |  |

## Methoden

| Name | Beschreibung |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.pdf/pdfdevice/addrect)(RectangleF) | Hängt ein Rechteck als vollständigen Teilpfad an den aktuellen Pfad an. |
| override [BeginDocument](../../aspose.svg.rendering.pdf/pdfdevice/begindocument)(Document) | Beginnt mit der Wiedergabe des Dokuments. |
| override [BeginElement](../../aspose.svg.rendering.pdf/pdfdevice/beginelement)(Element, RectangleF) | Beginnt mit dem Rendern des Elements. |
| override [BeginPage](../../aspose.svg.rendering.pdf/pdfdevice/beginpage)(SizeF) | Beginnt mit dem Rendern der neuen Seite. |
| override [Clip](../../aspose.svg.rendering.pdf/pdfdevice/clip)(FillMode) | Ändert den aktuellen Beschneidungspfad, indem er ihn mit dem aktuellen Pfad schneidet, wobei die FillMode-Regel verwendet wird, um den zu füllenden Bereich zu bestimmen. Diese Methode beendet den aktuellen Pfad. |
| override [ClosePath](../../aspose.svg.rendering.pdf/pdfdevice/closepath)() | Schließt den aktuellen Unterpfad durch Anhängen eines geraden Liniensegments vom aktuellen Punkt an den Startpunkt des Unterpfads. Wenn der aktuelle Unterpfad bereits geschlossen ist, tut "ClosePath" nichts. Dieser Operator beendet den aktuellen Unterpfad. Das Anhängen eines weiteren Segments an den aktuellen Pfad beginnt einen neuen Unterpfad, , selbst wenn das neue Segment an dem Endpunkt beginnt, der von der „ClosePath“-Methode erreicht wird. |
| override [CubicBezierTo](../../aspose.svg.rendering.pdf/pdfdevice/cubicbezierto)(PointF, PointF, PointF) | Hängt eine kubische Bézier-Kurve an den aktuellen Pfad an. Die Kurve erstreckt sich vom aktuellen Punkt bis zum Punkt pt2, , wobei pt1 und pt2 als Bézier-Kontrollpunkte verwendet werden. Der neue aktuelle Punkt ist pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose)() |  |
| override [DrawImage](../../aspose.svg.rendering.pdf/pdfdevice/drawimage)(byte[], ImageType, RectangleF) | Zeichnet das angegebene Bild. |
| override [EndDocument](../../aspose.svg.rendering.pdf/pdfdevice/enddocument)() | Beendet das Rendern des Dokuments. |
| override [EndElement](../../aspose.svg.rendering.pdf/pdfdevice/endelement)(Element) | Beendet das Rendern des Elements. |
| override [EndPage](../../aspose.svg.rendering.pdf/pdfdevice/endpage)() | Beendet das Rendern der aktuellen Seite. |
| override [Fill](../../aspose.svg.rendering.pdf/pdfdevice/fill)(FillMode) | Füllt den gesamten vom aktuellen Pfad eingeschlossenen Bereich. Wenn der Pfad aus mehreren getrennten Teilpfaden besteht, füllt er das Innere aller Teilpfade aus, zusammen betrachtet. Diese Methode beendet den aktuellen Pfad. |
| override [FillText](../../aspose.svg.rendering.pdf/pdfdevice/filltext)(string, PointF) | Füllt die angegebene Textzeichenfolge an der angegebenen Stelle aus. |
| override [Flush](../../aspose.svg.rendering.pdf/pdfdevice/flush)() | Flusht alle Daten in den Ausgabestream. |
| override [LineTo](../../aspose.svg.rendering.pdf/pdfdevice/lineto)(PointF) | Hängt ein gerades Liniensegment vom aktuellen Punkt an den Punkt (pt) an. Der neue aktuelle Punkt ist pt. |
| override [MoveTo](../../aspose.svg.rendering.pdf/pdfdevice/moveto)(PointF) | Beginnt einen neuen Teilpfad, indem der aktuelle Punkt auf die Koordinaten des Parameters pt verschoben wird, wobei alle Verbindungsliniensegmente weggelassen werden. Wenn die vorherige Pfadkonstruktionsmethode im aktuellen Pfad auch "MoveTo" war, überschreibt das neue "MoveTo" sie; keine Spur der vorherigen "MoveTo"-Operation bleibt im Pfad. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/restoregraphiccontext)() | Stellt den gesamten Grafikkontext auf seinen früheren Wert wieder her, indem er vom Stapel entfernt wird. |
| override [SaveGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/savegraphiccontext)() | Schiebt eine Kopie des gesamten Grafikkontexts auf den Stack. |
| override [Stroke](../../aspose.svg.rendering.pdf/pdfdevice/stroke)() | Zeichnet eine Linie entlang des aktuellen Pfads. Die strichlierte Linie folgt jedem geraden oder gekrümmten Segment im Pfad, zentriert auf dem Segment mit parallelen Seiten dazu. Jeder der Teilpfade des Pfades wird separat behandelt. Diese Methode beendet den aktuellen Pfad. |
| override [StrokeAndFill](../../aspose.svg.rendering.pdf/pdfdevice/strokeandfill)(FillMode) | Striche und aktuellen Pfad füllen. Diese Methode beendet aktuellen Pfad. |
| override [StrokeText](../../aspose.svg.rendering.pdf/pdfdevice/stroketext)(string, PointF) | Zeichnet die angegebene Textzeichenfolge an der angegebenen Position. |

## Andere Mitglieder

| Name | Beschreibung |
| --- | --- |
| class [PdfGraphicContext](pdfdevice.pdfgraphiccontext) | Enthält aktuelle Grafiksteuerungsparameter für das PdfDevice. Diese Parameter definieren den globalen Rahmen, in dem die Grafikoperatoren ausgeführt werden. |

### Siehe auch

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2)
* class [PdfGraphicContext](../pdfdevice.pdfgraphiccontext)
* class [PdfRenderingOptions](../pdfrenderingoptions)
* namensraum [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf)
* Montage [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
