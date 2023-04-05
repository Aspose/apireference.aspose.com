---
title: Class PdfDevice
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.EPS.Device.PdfDevice klas. Diese Klasse kapselt das Rendern von Dokumenten in PDF.
type: docs
weight: 60
url: /de/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Diese Klasse kapselt das Rendern von Dokumenten in PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Initialisiert eine neue Instanz von`PdfDevice` mit Ausgabestrom. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Initialisiert eine neue Instanz von`PdfDevice`mit Ausgabestrom und vorgegebener Größe einer Seite. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Gibt den aktuellen Hintergrund der Seite zurück oder gibt ihn an. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Gibt die aktuelle Zeichentransformation zurück oder gibt sie an. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Gibt den Ersteller der resultierenden Geräteausgabe zurück oder gibt ihn an. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Aktuelle Seitenzahl. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | Gibt die aktuelle Schriftart an. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Gibt an, ob das Gerät den direkten RGB-Modus verwendet, also RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Gibt an, ob diese Instanz der Aspose.Page-Bibliothek lizenziert ist. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Gibt die aktuelle Opazität zurück oder gibt sie an. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Gibt die aktuelle Deckkraftmaske zurück oder gibt sie an. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Gibt einen Ausgabestream an oder gibt ihn zurück. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | Gibt die aktuelle Farbe zurück oder gibt sie an. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Geräteeigenschaften einschließlich Metadaten. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Optionen zum Verwalten des Rendering-Prozesses. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Gibt eine Größe der Seite zurück oder gibt sie an. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | Gibt den aktuellen Hub zurück oder gibt ihn an. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Gibt den aktuellen Textwiedergabemodus zurück oder gibt ihn an. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Gibt die aktuelle Textstrichbreite zurück oder gibt sie an. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Macht die notwendige Vorbereitung des Geräts, nachdem die Seite gerendert wurde. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | Erstellt eine Kopie dieses Geräts. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | Gibt den Grafikkontext frei. Wenn bei der Erstellung restoreOnDispose wahr war, wird writeGraphicsRestore() aufgerufen. |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | Zeichnet einen Pfad. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Zeichnet einen Bogen. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | Zeichnet ein Bild mit zugewiesener Transformation und Hintergrund. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Zeichnet ein Liniensegment. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Zeichnet ein Oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Zeichnet ein Polygon. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Zeichnet ein Polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Zeichnet eine Polylinie. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Zeichnet eine Polylinie. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Zeichnet ein Rechteck. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Zeichnet ein rundes Rechteck. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | Zeichnet eine Zeichenfolge an einem bestimmten Punkt. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | Macht die notwendige Vorbereitung des Geräts, nachdem das Dokument gerendert wurde. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | Füllt einen Pfad. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Füllt einen Bogen. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Füllt ein Oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Füllt ein Polygon. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Füllt ein Polygon. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Füllt ein Rechteck. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Füllt ein rundes Rechteck. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Ruft einen Wert der String-Eigenschaft ab. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Ruft einen Wert der Farbeigenschaft ab. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Ruft einen Wert der Double-Eigenschaft ab. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Ruft einen Wert der ganzzahligen Eigenschaft ab. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Ruft einen Wert der Randeigenschaft ab. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Ruft einen Wert der Rechteckeigenschaft ab. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Ruft einen Wert der Größeneigenschaft ab. |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | Ruft die aktuelle Transformation ab. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | Initialisiert den Clip des Geräts. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Initialisiert die Anzahl der auszugebenden Seiten. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Ruft einen Wert der booleschen Eigenschaft ab. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Macht die notwendige Vorbereitung des Geräts vor dem Rendern der Seite. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Macht die notwendige Vorbereitung des Geräts vor jeder Seitenwiedergabe. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | Gerät für das gesamte Dokument in den Ausgangszustand zurücksetzen. Wird zum Zurücksetzen des Ausgabestroms verwendet. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | Wenn Seitengeräteparameter eingestellt werden, ermöglicht diese Methode, den Schreibstrom an den Anfang der Seite zurückzugeben. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Dreht die aktuelle Transformation um die Z-Achse. Ruft writeTransform(Transform) auf. Drehen mit einem positiven Winkel Theta dreht Punkte auf der positiven x-Achse in Richtung der positiven y-Achse. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Dreht die aktuelle Transformationsmatrix um einen Punkt. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | Skaliert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | Gibt den Clip des Geräts an. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | Gibt die aktuelle Transformation an. Da die meisten Ausgabeformate diese Funktionalität nicht implementieren, wird die inverse Transformation der currentTransform berechnet und mit der zu setzenden Transformation multipliziert. Das Ergebnis wird dann durch einen Aufruf an writeTransform(Transform). weitergeleitet. |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | Schert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | Macht die notwendige Vorbereitung des Geräts, bevor mit dem Rendern des Dokuments begonnen wird. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Gibt den Namen des Gerätetyps zurück. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | Transformiert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | Übersetzt die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Aktualisiert Seitenparameter von anderen mehrseitigen Geräten. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | schreibt einen Kommentar. |

## Felder

| Name | Beschreibung |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | Eigenschaftswert "Autor". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | Eigenschaftsschlüssel "Hintergrund". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | Eigenschaftsschlüssel "Hintergrundfarbe". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | Eigenschaftsschlüssel "Komprimieren". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | Eigenschaftsschlüssel "Schriftart in Dokument einbetten". |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | Eigenschaftsschlüssel "Welche Schriftart wird zum Einbetten verwendet". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | Eigenschaftswert "Fehler ausgeben". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | Eigenschaftswert "Warnungen ausgeben". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | Eigenschaftsschlüssel "Inhalt an Seite anpassen". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | Eigenschaftswert "Keywords". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | Eigenschaftsschlüssel "Orientierung". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | Eigenschaftsschlüssel "Seitenränder". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | Eigenschaftsschlüssel "Seitengröße". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | Eigenschaftswert "Betreff". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | Eigenschaftswert "Titel". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | "Transparenter" Eigenschaftsschlüssel. |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | Eigenschaftsschlüssel "Version". |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | Eigenschaftswert "Version von Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | Eigenschaftsschlüssel "Format von Bildern". |

### Siehe auch

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* namensraum [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* Montage [Aspose.Page](../../)


