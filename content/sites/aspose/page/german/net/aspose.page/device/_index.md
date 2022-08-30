---
title: Device
second_title: Aspose.Page für .NET-API-Referenz
description: Diese Klasse kapselt das Rendern des Dokuments auf einem abstrakten Gerät. Das Rendern des Dokuments erfolgt Seite für Seite.
type: docs
weight: 20
url: /de/net/aspose.page/device/
---
## Device class

Diese Klasse kapselt das Rendern des Dokuments auf einem abstrakten Gerät. Das Rendern des Dokuments erfolgt Seite für Seite.

```csharp
public abstract class Device
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Device](device)(Size) | Initialisiert[`Device`](../device) mit einer Seitengröße. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [Background](../../aspose.page/device/background) { get; set; } | Gibt den aktuellen Hintergrund der Seite zurück oder gibt ihn an. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Gibt die aktuelle Zeichentransformation zurück oder gibt sie an. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Gibt den Ersteller der resultierenden Geräteausgabe zurück oder gibt ihn an. |
| virtual [Font](../../aspose.page/device/font) { get; set; } | Gibt die aktuelle Schriftart zurück oder gibt sie an. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Gibt an, ob das Gerät den direkten RGB-Modus verwendet, also RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Gibt an, ob diese Instanz der Aspose.Page-Bibliothek lizenziert ist. |
| virtual [Opacity](../../aspose.page/device/opacity) { get; set; } | Gibt die aktuelle Opazität zurück oder gibt sie an. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Gibt die aktuelle Deckkraftmaske zurück oder gibt sie an. |
| virtual [Paint](../../aspose.page/device/paint) { get; set; } | Gibt die aktuelle Farbe zurück oder gibt sie an. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Geräteeigenschaften einschließlich Metadaten. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions) { set; } | Optionen zum Verwalten des Rendering-Prozesses. |
| virtual [Size](../../aspose.page/device/size) { get; set; } | Gibt eine Größe der Seite zurück oder gibt sie an. |
| virtual [Stroke](../../aspose.page/device/stroke) { get; set; } | Gibt den aktuellen Hub zurück oder gibt ihn an. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Gibt den aktuellen Textwiedergabemodus zurück oder gibt ihn an. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Gibt die aktuelle Textstrichbreite zurück oder gibt sie an. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| virtual [Create](../../aspose.page/device/create)() | Erstellt eine Kopie dieses Geräts. |
| virtual [Dispose](../../aspose.page/device/dispose)() | Entsorgt das Gerät. |
| virtual [Draw](../../aspose.page/device/draw)(GraphicsPath) | Zeichnet einen Pfad. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Zeichnet einen Bogen. |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | Zeichnet ein Bild mit zugewiesener Transformation und Hintergrund. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Zeichnet ein Liniensegment. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Zeichnet ein Oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon)(double[], double[], int) | Zeichnet ein Polygon. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon_1)(int[], int[], int) | Zeichnet ein Polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline)(double[], double[], int) | Zeichnet eine Polylinie. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline_1)(int[], int[], int) | Zeichnet eine Polylinie. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Zeichnet ein Rechteck. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Zeichnet ein rundes Rechteck. |
| virtual [DrawString](../../aspose.page/device/drawstring)(string, double, double) | Zeichnet eine Zeichenfolge an einem bestimmten Punkt. |
| virtual [EndDocument](../../aspose.page/device/enddocument)() | Macht die notwendige Vorbereitung des Geräts, nachdem das Dokument gerendert wurde. |
| virtual [Fill](../../aspose.page/device/fill)(GraphicsPath) | Füllt einen Pfad. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Füllt einen Bogen. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Füllt ein Oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon)(double[], double[], int) | Füllt ein Polygon. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon_1)(int[], int[], int) | Füllt ein Polygon. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Füllt ein Rechteck. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Füllt ein rundes Rechteck. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | Ruft einen Wert der String-Eigenschaft ab. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | Ruft einen Wert der Farbeigenschaft ab. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | Ruft einen Wert der Double-Eigenschaft ab. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | Ruft einen Wert der ganzzahligen Eigenschaft ab. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | Ruft einen Wert der Randeigenschaft ab. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | Ruft einen Wert der Rechteckeigenschaft ab. |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Ruft einen Wert der Größeneigenschaft ab. |
| virtual [GetTransform](../../aspose.page/device/gettransform)() | Ruft die aktuelle Transformation ab. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Initialisiert den Clip des Geräts. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Ruft einen Wert der booleschen Eigenschaft ab. |
| virtual [ReNew](../../aspose.page/device/renew)() | Gerät für das gesamte Dokument in den Ausgangszustand zurücksetzen. Wird zum Zurücksetzen des Ausgabestroms verwendet. |
| virtual [Reset](../../aspose.page/device/reset)() | Das Gerät für eine Seite in den Ausgangszustand zurücksetzen. |
| virtual [Rotate](../../aspose.page/device/rotate#rotate)(double) | Dreht die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf. Drehen mit einem positiven Winkel Theta dreht Punkte auf der positiven x-Achse in Richtung der positiven y-Achse. |
| virtual [Rotate](../../aspose.page/device/rotate#rotate_1)(double, double, double) | Dreht die aktuelle Transformationsmatrix um einen Punkt. |
| virtual [Scale](../../aspose.page/device/scale)(double, double) | Skaliert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| virtual [SetClip](../../aspose.page/device/setclip)(GraphicsPath) | Gibt den Clip des Geräts an. |
| virtual [SetTransform](../../aspose.page/device/settransform)(Matrix) | Gibt die aktuelle Transformation an. |
| virtual [Shear](../../aspose.page/device/shear)(double, double) | Schert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| virtual [StartDocument](../../aspose.page/device/startdocument)() | Macht die notwendige Vorbereitung des Geräts, bevor mit dem Rendern des Dokuments begonnen wird. |
| override [ToString](../../aspose.page/device/tostring)() | Gibt den Namen des Gerätetyps zurück. |
| virtual [Transform](../../aspose.page/device/transform)(Matrix) | Transformiert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf |
| virtual [Translate](../../aspose.page/device/translate)(double, double) | Übersetzt die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | schreibt einen Kommentar. |

## Felder

| Name | Beschreibung |
| --- | --- |
| static [VERSION](../../aspose.page/device/version) | Aktuelle Geräteversion. |

### Siehe auch

* namensraum [Aspose.Page](../../aspose.page)
* Montage [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
