---
title: PdfDevice
second_title: Aspose.Page für .NET-API-Referenz
description: Klasse die Bildkompositionsgerät einkapselt.
type: docs
weight: 340
url: /de/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Klasse, die Bildkompositionsgerät einkapselt.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(Stream) | Erstellt die neue Instanz. |
| [PdfDevice](pdfdevice#constructor_1)(Stream, Size) | Erstellt die neue Instanz mit der angegebenen Mediengröße. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background) { get; set; } | Holt/setzt die Hintergrundfarbe. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Gibt die aktuelle Zeichentransformation zurück oder gibt sie an. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Gibt den Ersteller der resultierenden Geräteausgabe zurück oder gibt ihn an. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber) { get; } | Gibt die absolute Nummer der aktuellen Seite innerhalb des Dokuments zurück. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber) { get; } | Gibt die Nummer der aktuellen Seite innerhalb der aktuellen Partition zurück. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font) { get; set; } | Holt/setzt die aktuelle Schriftart. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Gibt an, ob das Gerät den direkten RGB-Modus verwendet, also RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Gibt an, ob diese Instanz der Aspose.Page-Bibliothek lizenziert ist. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity) { get; set; } | Ruft die Deckkraft ab/legt sie fest. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask) { get; set; } | Liest/setzt den Pinsel für die Deckkraftmaske. Die Maske wird über Paint oder Strike angewendet. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint) { get; set; } | Holt/setzt den Pinsel zum Füllen von Pfaden. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Geräteeigenschaften einschließlich Metadaten. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions) { set; } | Initialisiert Speicheroptionen. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size) { get; set; } | Ruft die Mediengröße des Geräts ab/legt sie fest. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke) { get; set; } | Liest/setzt den Strich zum Zeichnen von Pfaden. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Gibt den aktuellen Textwiedergabemodus zurück oder gibt ihn an. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Gibt die aktuelle Textstrichbreite zurück oder gibt sie an. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline)(int, string) | Fügt ein Gliederungselement mit dem letzten Objekt als Ziel hinzu. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline_1)(PointF, int, string) | Fügt ein Gliederungselement mit dem Ursprungspunkt als Ziel hinzu. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage)() | Führt die Seite aus. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition)() | Dokumentpartition abgeschlossen. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create)() | Erstellt eine neue Instanz des Geräts basierend auf dieser Geräteinstanz. Schreibt diesen Gerätegrafikzustand, dh erstelltApsCanvas Instanz(en) mit entsprechenden RenderTransform- und Clip-Eigenschaften. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose)() | Verwirft diese Geräteinstanz. Schließt den Grafikzustand dieser Geräteinstanz ab, , dh schaltet den APS-Erstellungskontext auf den umApsCanvas des Levels höher als der Grafikzustand des Geräts this ApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw)(GraphicsPath) | Zeichnet den angegebenen Pfad. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Zeichnet einen Bogen. |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | Zeichnet ein Bild mit zugewiesener Transformation und Hintergrund. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Zeichnet ein Liniensegment. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Zeichnet ein Oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Zeichnet ein Polygon. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Zeichnet ein Polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Zeichnet eine Polylinie. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Zeichnet eine Polylinie. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Zeichnet ein Rechteck. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Zeichnet ein rundes Rechteck. |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring)(string, double, double) | Zeichnet einen String an der angegebenen Position. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument)() | Erfüllt das Dokument. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill)(GraphicsPath) | Füllt den angegebenen Pfad. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Füllt einen Bogen. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Füllt ein Oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Füllt ein Polygon. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Füllt ein Polygon. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Füllt ein Rechteck. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Füllt ein rundes Rechteck. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | Ruft einen Wert der String-Eigenschaft ab. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | Ruft einen Wert der Farbeigenschaft ab. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | Ruft einen Wert der Double-Eigenschaft ab. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | Ruft einen Wert der ganzzahligen Eigenschaft ab. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | Ruft einen Wert der Randeigenschaft ab. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | Ruft einen Wert der Rechteckeigenschaft ab. |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Ruft einen Wert der Größeneigenschaft ab. |
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform)() | Gibt die aktuelle Transformationsmatrix zurück. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Initialisiert den Clip des Geräts. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers)() | Initialisiert die Anzahl der auszugebenden Seiten. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Ruft einen Wert der booleschen Eigenschaft ab. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage_1)(string) | Beginnt eine neue Seite mit dem angegebenen Titel. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage)(float, float) | Beginnt eine neue Seite mit der angegebenen Breite und Höhe. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition)() | Startet eine neue Dokumentpartition. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew)() | Setzt die Geräte in den Ausgangszustand. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset)() | Setzt das Gerät zurück. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate#rotate)(double) | Wendet eine Drehung im Uhrzeigersinn um den Ursprung auf die aktuelle Transformationsmatrix an. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Dreht die aktuelle Transformationsmatrix um einen Punkt. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale)(double, double) | Wendet den angegebenen Skalierungsvektor auf die aktuelle Transformationsmatrix an. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip)(GraphicsPath) | Fügt den angegebenen Pfad zum aktuellen Clip-Pfad hinzu. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget)(int) | Legt den Hyperlink mit einer Seitenzahl als Ziel fest. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget_1)(string) | Legt den Hyperlink mit einem externen URI als Ziel fest. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform)(Matrix) | Legt die aktuelle Transformationsmatrix fest. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear)(double, double) | Wendet den angegebenen Schervektor auf die aktuelle Transformationsmatrix an. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument)() | Startet das Dokument. |
| override [ToString](../../aspose.page/device/tostring)() | Gibt den Namen des Gerätetyps zurück. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform)(Matrix) | Multipliziert die aktuelle Transformationsmatrix mit der angegebenenMatrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate)(double, double) | Wendet den angegebenen Translationsvektor auf die aktuelle Transformationsmatrix an. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters)(IMultiPageDevice) | Aktualisiert die aktuellen Seitenparameter. |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | schreibt einen Kommentar. |

### Siehe auch

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* namensraum [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf)
* Montage [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
