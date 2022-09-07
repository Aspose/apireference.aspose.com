---
title: ImageDevice
second_title: Aspose.Page für .NET-API-Referenz
description: Diese Klasse kapselt das Rendern eines Dokuments in ein Bild.
type: docs
weight: 40
url: /de/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Diese Klasse kapselt das Rendern eines Dokuments in ein Bild.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [ImageDevice](imagedevice#constructor)() | Initialisiert eine neue Instanz von[`ImageDevice`](../imagedevice) . |
| [ImageDevice](imagedevice#constructor_1)(ImageFormat) | Initialisiert eine neue Instanz von[`ImageDevice`](../imagedevice) mit vorgegebenem Bildformat. |
| [ImageDevice](imagedevice#constructor_2)(Size) | Initialisiert eine neue Instanz von[`ImageDevice`](../imagedevice) mit angegebener Seitengröße. |
| [ImageDevice](imagedevice#constructor_3)(Size, ImageFormat) | Initialisiert eine neue Instanz von[`ImageDevice`](../imagedevice)mit angegebener Seitengröße und Bildformat. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background) { get; set; } | Gibt an, ob das Gerät den direkten RGB-Modus verwendet, also RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm) { get; set; } | Gibt die aktuelle Zeichentransformation zurück oder gibt sie an. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator) { get; set; } | Gibt den Ersteller der resultierenden Geräteausgabe zurück oder gibt ihn an. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber) { get; } | Aktuelle Seitenzahl. |
| override [Font](../../aspose.page.eps.device/imagedevice/font) { get; set; } | Gibt die aktuelle Schriftart zurück oder gibt sie an. |
| [Format](../../aspose.page.eps.device/imagedevice/format) { get; } | Bildformat. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes) { get; } | Gibt resultierende Bilder in Byte zurück, ein Byte-Array für eine Seite. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb) { get; } | Gibt an, ob das Gerät den direkten RGB-Modus verwendet, also RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Gibt an, ob diese Instanz der Aspose.Page-Bibliothek lizenziert ist. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity) { get; set; } | Gibt den aktuellen Hintergrund der Seite zurück oder gibt ihn an. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Gibt die aktuelle Deckkraftmaske zurück oder gibt sie an. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint) { get; set; } | Gibt die aktuelle Farbe zurück oder gibt sie an. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Geräteeigenschaften einschließlich Metadaten. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions) { set; } | Optionen zum Verwalten des Rendering-Prozesses. |
| override [Size](../../aspose.page.eps.device/imagedevice/size) { get; set; } | Gibt eine Größe der Seite zurück oder gibt sie an. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke) { get; set; } | Gibt den aktuellen Hub zurück oder gibt ihn an. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode) { get; set; } | Gibt den aktuellen Textwiedergabemodus zurück oder gibt ihn an. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth) { get; set; } | Gibt die aktuelle Textstrichbreite zurück oder gibt sie an. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage)() | Macht die notwendige Vorbereitung des Geräts, nachdem die Seite gerendert wurde. |
| override [Create](../../aspose.page.eps.device/imagedevice/create)() | Erstellt eine Kopie dieses Geräts. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose)() | Entsorgt das Gerät. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw)(GraphicsPath) | Zeichnet einen Pfad. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Zeichnet einen Bogen. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage)(Bitmap, Matrix, Color) | Zeichnet ein Bild mit zugewiesener Transformation und Hintergrund. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Zeichnet ein Liniensegment. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Zeichnet ein Oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Zeichnet ein Polygon. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Zeichnet ein Polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Zeichnet eine Polylinie. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Zeichnet eine Polylinie. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Zeichnet ein Rechteck. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Zeichnet ein rundes Rechteck. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring)(string, double, double) | Zeichnet eine Zeichenfolge an einem bestimmten Punkt. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument)() | Macht die notwendige Vorbereitung des Geräts, nachdem das Dokument gerendert wurde. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill)(GraphicsPath) | Füllt einen Pfad. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Füllt einen Bogen. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Füllt ein Oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Füllt ein Polygon. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Füllt ein Polygon. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Füllt ein Rechteck. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Füllt ein rundes Rechteck. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty#getproperty)(string) | Ruft einen Wert der String-Eigenschaft ab. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor#getpropertycolor)(string) | Ruft einen Wert der Farbeigenschaft ab. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble#getpropertydouble)(string) | Ruft einen Wert der Double-Eigenschaft ab. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint#getpropertyint)(string) | Ruft einen Wert der ganzzahligen Eigenschaft ab. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins#getpropertymargins)(string) | Ruft einen Wert der Eigenschaft margins ab. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle#getpropertyrectangle)(string) | Ruft einen Wert der Rechteckeigenschaft ab. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize#getpropertysize)(string) | Ruft einen Wert der Größeneigenschaft ab. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform)() | Ruft die aktuelle Transformation ab. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip)() | Initialisiert einen Clip des Geräts. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers)() | Initialisiert die Anzahl der auszugebenden Seiten. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty#isproperty)(string) | Ruft einen Wert der booleschen Eigenschaft ab. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage_1)(string) | Macht die notwendige Vorbereitung des Geräts vor dem Rendern der Seite. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage)(float, float) | Macht die notwendige Vorbereitung des Geräts vor jeder Seitenwiedergabe. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew)() | Gerät für gesamtes Dokument auf Ausgangszustand zurücksetzen. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset)() | Das Gerät für eine Seite in den Ausgangszustand zurücksetzen. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate#rotate)(double) | Rotation der aktuellen Transformationsmatrix um die Z-Achse. Ruft writeTransform(Transform) auf. Drehen mit einem positiven Winkel Theta dreht Punkte auf der positiven x-Achse in Richtung der positiven y-Achse. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Dreht die aktuelle Transformationsmatrix um einen Punkt. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale)(double, double) | Skaliert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip)(GraphicsPath) | Clipform. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform)(Matrix) | Gibt die aktuelle Transformation an. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear)(double, double) | Schert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument)() | Macht die notwendige Vorbereitung des Geräts, bevor mit dem Rendern des Dokuments begonnen wird. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring)() | Gibt den Namen des Gerätetyps zurück. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform)(Matrix) | Transformiert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate)(double, double) | Übersetzt die aktuelle Transformationsmatrix. Ruft writeTransform(Transform). auf |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters)(IMultiPageDevice) | Aktualisiert Seitenparameter von anderen mehrseitigen Geräten. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment)(string) | schreibt einen Kommentar. |

## Felder

| Name | Beschreibung |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background) | Eigenschaftsschlüssel "Hintergrund". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color) | Eigenschaftsschlüssel "Hintergrundfarbe". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts) | Eigenschaftsschlüssel "Schriftart in Dokument einbetten". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors) | Eigenschaftswert "Fehler ausgeben". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings) | Eigenschaftswert "Warnungen ausgeben". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page) | Eigenschaftsschlüssel "Inhalt an Seite anpassen". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation) | Eigenschaftsschlüssel "Orientierung". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins) | Eigenschaftsschlüssel "Seitenränder". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size) | Eigenschaftsschlüssel "Seitengröße". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer) | Eigenschaftswert "Produzent". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent) | "Transparenter" Eigenschaftsschlüssel. |

### Siehe auch

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* namensraum [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* Montage [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
