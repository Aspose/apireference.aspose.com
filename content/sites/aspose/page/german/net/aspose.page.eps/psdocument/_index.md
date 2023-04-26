---
title: Class PsDocument
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.EPS.PsDocument klas. Diese Klasse kapselt PS/EPSDokumente.
type: docs
weight: 140
url: /de/net/aspose.page.eps/psdocument/
---
## PsDocument class

Diese Klasse kapselt PS/EPS-Dokumente.

```csharp
public sealed class PsDocument : Document
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Initialisiert`PsDocument` mit einem Strom von PS/EPS-Datei. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Initialisiert leer`PsDocument` mit initialisierter Seite. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Initialisiert leer`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Initialisiert leer`PsDocument` wenn die Anzahl der Postscript-Dokumentseiten im Voraus bekannt ist. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Gibt die Anzahl der Seiten im resultierenden PDF-Dokument zurück. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Fügt Clip zum aktuellen Grafikstatus hinzu. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Fügt einen Clip zum aktuellen Grafikstatus hinzu und schreibt dann den "newpath"-Operator. Es ist notwendig, den Zusammenfluss dieses Beschneidungspfads und einiger nachfolgender Pfade, wie z. |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Fügt dem aktuellen Grafikstatus ein beschneidendes Rechteck hinzu. |
| [ClipText](../../aspose.page.eps/psdocument/cliptext/)(string, Font, float, float) |  |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Aktuelle Seite vervollständigen. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Zeichne einen beliebigen Pfad. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Maskiertes Bild zeichnen. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Bild zeichnen. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Transformiertes Bild mit Hintergrund zeichnen. |
| [DrawTransparentImage](../../aspose.page.eps/psdocument/drawtransparentimage/)(Bitmap, Matrix, int) | Transformiertes transparentes Bild zeichnen. Wenn das Bild keinen Alphakanal hat, wird es undurchsichtig gezeichnet image |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Füllen Sie einen beliebigen Pfad. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, DrFont, float, float, Brush, Pen) | Fügt eine Textzeichenfolge hinzu, indem das Innere von Glyphen gefüllt und Glyphenkonturen gezeichnet werden. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_3)(string, Font, float, float, Brush, Pen) | Fügt eine Textzeichenfolge hinzu, indem das Innere von Glyphen gefüllt und Glyphenkonturen gezeichnet werden. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, float[], DrFont, float, float, Brush, Pen) | Fügt eine Textzeichenfolge hinzu, indem das Innere von Glyphen gefüllt und Glyphenkonturen gezeichnet werden. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_2)(string, float[], Font, float, float, Brush, Pen) | Fügt eine Textzeichenfolge hinzu, indem das Innere von Glyphen gefüllt und Glyphenkonturen gezeichnet werden. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, DrFont, float, float) | Fügt eine Textzeichenfolge hinzu, indem das Innere mit Glyphen gefüllt wird. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_6)(string, Font, float, float) | Fügt eine Textzeichenfolge hinzu, indem das Innere mit Glyphen gefüllt wird. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, DrFont, float, float, Brush) | Fügt eine Textzeichenfolge hinzu, indem das Innere mit Glyphen gefüllt wird. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_2)(string, float[], DrFont, float, float) | Fügt eine Textzeichenfolge hinzu, indem das Innere mit Glyphen gefüllt wird. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_4)(string, float[], Font, float, float) | Fügt eine Textzeichenfolge hinzu, indem das Innere mit Glyphen gefüllt wird. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_7)(string, Font, float, float, Brush) | Fügt eine Textzeichenfolge hinzu, indem das Innere mit Glyphen gefüllt wird. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_3)(string, float[], DrFont, float, float, Brush) | Fügt eine Textzeichenfolge hinzu, indem das Innere mit Glyphen gefüllt wird. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_5)(string, float[], Font, float, float, Brush) | Fügt eine Textzeichenfolge hinzu, indem das Innere mit Glyphen gefüllt wird. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Ruft Farbe des aktuellen Grafikstatus ab. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Ruft den Strich des aktuellen Grafikstatus ab. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Liest die PS/EPS-Datei und extrahiert XmpMetdata, falls bereits vorhanden, oder fügt neue hinzu, falls noch nicht vorhanden. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | Führt PS/EPS-Dateien auf einem Gerät zusammen. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage_1)(string) | Erstellt eine neue Seite mit der Größe des Dokuments und macht sie zur aktuellen Seite. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage)(float, float) | Erstellt eine neue Seite und macht sie zur aktuellen. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, DrFont, float, float) | Fügt eine Textzeichenfolge hinzu, indem Glyphenkonturen gezeichnet werden. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_6)(string, Font, float, float) | Fügt eine Textzeichenfolge hinzu, indem Glyphenkonturen gezeichnet werden. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, DrFont, float, float, Pen) | Fügt eine Textzeichenfolge hinzu, indem Glyphenkonturen gezeichnet werden. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_2)(string, float[], DrFont, float, float) | Fügt eine Textzeichenfolge hinzu, indem Glyphenkonturen gezeichnet werden. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_4)(string, float[], Font, float, float) | Fügt eine Textzeichenfolge hinzu, indem Glyphenkonturen gezeichnet werden. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_7)(string, Font, float, float, Pen) | Fügt eine Textzeichenfolge hinzu, indem Glyphenkonturen gezeichnet werden. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_3)(string, float[], DrFont, float, float, Pen) | Fügt eine Textzeichenfolge hinzu, indem Glyphenkonturen gezeichnet werden. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_5)(string, float[], Font, float, float, Pen) | Fügt eine Textzeichenfolge hinzu, indem Glyphenkonturen gezeichnet werden. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate_1)(float) | Fügt dem aktuellen Grafikzustand eine Drehung gegen den Uhrzeigersinn um den Ursprung hinzu (aktuelle Matrix drehen). |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate)(int) | Fügt dem aktuellen Grafikzustand eine Drehung gegen den Uhrzeigersinn um den Ursprung hinzu (aktuelle Matrix drehen). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Saves gegeben`PsDocument`als EPS-Datei. Diese Methode wird nur verwendet, wenn PsDocument von Grund auf neu erstellt wurde. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | Saves gegeben`PsDocument` als EPS-Datei. Diese Methode wird nur nach dem Aktualisieren von XMP-Metadaten verwendet. Sie speichert die anfängliche EPS-Datei mit aktualisierten vorhandenen Metadaten oder eine neue, die beim Aufrufen der GetMetadata-Methode erstellt wird. Im letzten Fall werden alle erforderlichen PostScript-Codes und EPS-Kommentare hinzugefügt. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | Speichert PS/EPS-Datei auf einem Gerät. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Fügt dem aktuellen Grafikstatus eine Skalierung hinzu (aktuelle Matrix skalieren). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Setzt Seitengeräteparameter (siehe PostScript-Spezifikation des Operators "setpagedevice"). Dazu können Seitengröße und -farbe etc. gehören. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Legt die Seitengröße fest. Verwenden Sie zum Erstellen von Seiten mit unterschiedlichen Größen in einem Dokument[`SetPageDevice`](./setpagedevice/) Methode direkt nach dieser Methode. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Versetzt die Farbe in den aktuellen Grafikstatus. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Legt den Strich im aktuellen Grafikstatus fest. |
| [SetTransform](../../aspose.page.eps/psdocument/settransform/)(Matrix) | Aktuelle Transformation auf diese setzen. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Fügt dem aktuellen Grafikzustand eine Schertransformation hinzu (Scherstrommatrix). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Fügt dem aktuellen Grafikstatus eine Transformation hinzu (verkettet diese Matrix mit der aktuellen). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Fügt Übersetzung zum aktuellen Grafikstatus hinzu (übersetzt aktuelle Matrix). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Schreibt das Wiederherstellen des aktuellen Grafikzustands (siehe PostScript-Spezifikation zum Operator "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Schreibt Speichern des aktuellen Grafikzustands (Siehe PostScript-Spezifikation zum Operator "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Speichert Bitmap-Objekt im EPS-Ausgabestrom. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Speichert Bitmap-Objekt in EPS-Datei. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Speichert PNG-/JPEG-/TIFF-/BMP-/GIF-/EMF-Bilder aus dem Eingabestream in den EPS-Ausgabestream. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Speichert PNG/JPEG/TIFF/BMP/GIF/EMF-Bild aus Datei in EPS-Datei. |

### Siehe auch

* class [Document](../../aspose.page/document/)
* namensraum [Aspose.Page.EPS](../../aspose.page.eps/)
* Montage [Aspose.Page](../../)


