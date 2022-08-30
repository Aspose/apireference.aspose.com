---
title: ImageDevice
second_title: Aspose.Page für .NET-API-Referenz
description: Klasse die Bildkompositionsgerät einkapselt.
type: docs
weight: 290
url: /de/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Klasse, die Bildkompositionsgerät einkapselt.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [ImageDevice](imagedevice#constructor)() | Erstellt die neue Instanz. |
| [ImageDevice](imagedevice#constructor_1)(Size) | Erstellt die neue Instanz mit der angegebenen Mediengröße. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background) { get; set; } | Holt/setzt die Hintergrundfarbe. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Gibt die aktuelle Zeichentransformation zurück oder gibt sie an. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Gibt den Ersteller der resultierenden Geräteausgabe zurück oder gibt ihn an. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber) { get; } | Gibt die absolute Nummer der aktuellen Seite innerhalb des Dokuments zurück. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber) { get; } | Gibt die relative Nummer der aktuellen Seite innerhalb der aktuellen Partition zurück. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font) { get; set; } | Holt/setzt die aktuelle Schriftart. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Gibt an, ob das Gerät den direkten RGB-Modus verwendet, also RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Gibt an, ob diese Instanz der Aspose.Page-Bibliothek lizenziert ist. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity) { get; set; } | Ruft die Deckkraft ab/legt sie fest. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask) { get; set; } | Liest/setzt den Pinsel für die Deckkraftmaske. Die Maske wird über Paint oder Strike angewendet. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint) { get; set; } | Holt/setzt den Pinsel zum Füllen von Pfaden. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Geräteeigenschaften einschließlich Metadaten. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result) { get; } | Gibt die Byte-Arrays der resultierenden Bilder zurück. Die erste Dimension ist für innere Dokumente und die zweite für Seiten innerhalb innerer Dokumente. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions) { set; } | Initialisiert Speicheroptionen. |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size) { get; set; } | Ruft die Mediengröße des Geräts ab/legt sie fest. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke) { get; set; } | Liest/setzt den Strich zum Zeichnen von Pfaden. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Gibt den aktuellen Textwiedergabemodus zurück oder gibt ihn an. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Gibt die aktuelle Textstrichbreite zurück oder gibt sie an. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage)() | Führt die Seite aus. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition)() | Dokumentpartition abgeschlossen. |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create)() | Erstellt eine neue Instanz des Geräts basierend auf dieser Geräteinstanz. Schreibt diesen Gerätegrafikzustand, dh erstelltApsCanvas Instanz(en) mit entsprechenden RenderTransform- und Clip-Eigenschaften. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose)() | Verwirft diese Geräteinstanz. Schließt den Grafikzustand dieser Geräteinstanz ab, , dh schaltet den APS-Erstellungskontext auf den umApsCanvas des Levels höher als der Grafikzustand des Geräts this ApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw)(GraphicsPath) | Zeichnet den angegebenen Pfad. |
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
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring)(string, double, double) | Zeichnet einen String an der angegebenen Position. |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument)() | Erfüllt das Dokument. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill)(GraphicsPath) | Füllt den angegebenen Pfad. |
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
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform)() | Gibt die aktuelle Transformationsmatrix zurück. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Initialisiert den Clip des Geräts. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers)() | Initialisiert die Anzahl der auszugebenden Seiten. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Ruft einen Wert der booleschen Eigenschaft ab. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage#openpage_1)(string) | Beginnt eine neue Seite mit dem angegebenen Titel. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage#openpage)(float, float) | Beginnt eine neue Seite mit der angegebenen Breite und Höhe. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition)() | Startet eine neue Dokumentpartition. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew)() | Setzt die Geräte in den Ausgangszustand. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset)() | Setzt das Gerät zurück. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate#rotate)(double) | Wendet eine Drehung im Uhrzeigersinn um den Ursprung auf die aktuelle Transformationsmatrix an. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Dreht die aktuelle Transformationsmatrix um einen Punkt. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale)(double, double) | Wendet den angegebenen Skalierungsvektor auf die aktuelle Transformationsmatrix an. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip)(GraphicsPath) | Fügt den angegebenen Pfad zum aktuellen Clip-Pfad hinzu. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform)(Matrix) | Legt die aktuelle Transformationsmatrix fest. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear)(double, double) | Wendet den angegebenen Schervektor auf die aktuelle Transformationsmatrix an. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument)() | Startet das Dokument. |
| override [ToString](../../aspose.page/device/tostring)() | Gibt den Namen des Gerätetyps zurück. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform)(Matrix) | Multipliziert die aktuelle Transformationsmatrix mit der angegebenenMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate)(double, double) | Wendet den angegebenen Translationsvektor auf die aktuelle Transformationsmatrix an. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters)(IMultiPageDevice) | Aktualisiert die aktuellen Seitenparameter. |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | schreibt einen Kommentar. |

### Siehe auch

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* namensraum [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image)
* Montage [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
