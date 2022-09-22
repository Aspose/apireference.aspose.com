---
title: System.Drawing.Imaging
second_title: Aspose.Drawing für .NET-API-Referenz
description: DieImaging Namespace bietet erweiterte GDIImagingFunktionen. Grundlegende Grafikfunktionen werden von der bereitgestelltDrawing Namensraum.
type: docs
weight: 40
url: /de/net/system.drawing.imaging/
---
DieImaging Namespace bietet erweiterte GDI+-Imaging-Funktionen. Grundlegende Grafikfunktionen werden von der bereitgestelltDrawing Namensraum.

## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [BitmapData](./bitmapdata) | Gibt die Attribute eines Bitmap-Bildes an. DasBitmapData Klasse wird von the verwendetLockBits undUnlockBits Methoden derBitmap Klasse. Nicht vererbbar. |
| [ColorMap](./colormap) | Definiert eine Karte zum Konvertieren von Farben. Mehrere Methoden derImageAttributes Klasse adjust Bildfarben mithilfe einer Farbumwandlungstabelle, die ein Array von istColorMap Strukturen. Nicht vererbbar. |
| [ColorMatrix](./colormatrix) | Definiert eine 5 x 5-Matrix, die die Koordinaten für den RGBA-Raum enthält. Mehrere Methoden derImageAttributes Klasse passt Bildfarben mithilfe einer Farbmatrix an. Diese Klasse kann nicht vererbt werden. |
| [ColorPalette](./colorpalette) | Definiert ein Array von Farben, die eine Farbpalette bilden. Die Farben sind 32-Bit-ARGB-Farben. Nicht vererbbar. |
| [Encoder](./encoder) | EinEncoder -Objekt kapselt eine global eindeutige Kennung (GUID) ein, die die Kategorie eines Bildcodiererparameters identifiziert. |
| [EncoderParameter](./encoderparameter) | Wird verwendet, um einen Wert oder ein Array von Werten an einen Bildcodierer zu übergeben. |
| [EncoderParameters](./encoderparameters) | Kapselt ein Array vonEncoderParameter Objekte. |
| [FrameDimension](./framedimension) | Stellt Eigenschaften bereit, die die Rahmenabmessungen eines Bildes abrufen. Nicht vererbbar. |
| [ImageAttributes](./imageattributes) | Enthält Informationen darüber, wie Bitmap- und Metadateifarben während des Renderns manipuliert werden. |
| [ImageCodecInfo](./imagecodecinfo) | DieImageCodecInfo Die Klasse stellt die notwendigen Speicherelemente und Methoden bereit, um alle relevanten Informationen über die installierten Bildcodierer und -decodierer (als Codecs bezeichnet) abzurufen . Nicht vererbbar. |
| [ImageFormat](./imageformat) | Gibt das Dateiformat des Bildes an. Nicht vererbbar. |
| [Metafile](./metafile) | Definiert eine Grafik-Metadatei. Eine Metadatei enthält Datensätze, die eine Folge von Grafikoperationen beschreiben , die aufgezeichnet (konstruiert) und wiedergegeben (angezeigt) werden können. Diese Klasse ist nicht vererbbar. |
| [MetafileHeader](./metafileheader) | Enthält Attribute eines zugehörigenMetafile . Nicht vererbbar. |
| [MetaHeader](./metaheader) | Enthält Informationen zu einer Metadatei im Windows-Format (WMF). |
| [NamespaceDoc](./namespacedoc) | DieImaging Namespace bietet erweiterte GDI+-Imaging-Funktionen. Grundlegende Grafikfunktionen werden von der bereitgestelltDrawing Namensraum. |
| [PlayRecordCallback](./playrecordcallback) | Dieser Delegat wird nicht verwendet. Ein Beispiel für das Aufzählen der Datensätze einer Metadatei finden Sie unter[`EnumerateMetafile`](../system.drawing/graphics/enumeratemetafile) . |
| [PropertyItem](./propertyitem) | Kapselt eine Metadateneigenschaft, die in eine Bilddatei aufgenommen werden soll. Nicht vererbbar. |
| [WmfPlaceableFileHeader](./wmfplaceablefileheader) | Definiert eine platzierbare Metadatei. Nicht vererbbar. |
## Aufzählung

| Aufzählung | Beschreibung |
| --- | --- |
| [ColorAdjustType](./coloradjusttype) | Gibt an, welche GDI+-Objekte Farbanpassungsinformationen verwenden. |
| [ColorChannelFlag](./colorchannelflag) | Gibt einzelne Kanäle im CMYK-Farbraum (Cyan, Magenta, Gelb, Schwarz) an. Diese Aufzählung wird von der verwendet[`SetOutputChannel`](../system.drawing.imaging/imageattributes/setoutputchannel) Methoden. |
| [ColorMatrixFlag](./colormatrixflag) | Gibt die Typen von Bildern und Farben an, die von den Farb- und Graustufenanpassungseinstellungen von beeinflusst werdenImageAttributes . |
| [EmfPlusRecordType](./emfplusrecordtype) | Gibt die Methoden an, die für die Verwendung mit einer Metadatei zum Lesen und Schreiben von Grafikbefehlen verfügbar sind. |
| [EmfType](./emftype) | Gibt die Art der Datensätze an, die in einer EMF-Datei (Enhanced Metafile) abgelegt werden. Diese Aufzählung wird von mehreren Konstruktoren in der verwendetMetafile Klasse. |
| [EncoderValue](./encodervalue) | Wird verwendet, um den Parameterwert anzugeben, der an einen JPEG- oder TIFF-Bildcodierer übergeben wird, wenn verwendet wirdEncoderParameters) oderEncoderParameters) Methoden. |
| [ImageFlags](./imageflags) | Gibt die Attribute der Pixeldaten an, die in einer enthalten sind[`Image`](../system.drawing/image) Objekt. Die Flags-Eigenschaft gibt ein Mitglied dieser Aufzählung zurück. Diese Aufzählung hat ein FlagsAttribute-Attribut, das eine bitweise Kombination ihrer Mitgliedswerte ermöglicht. |
| [ImageLockMode](./imagelockmode) | Gibt Flags an, die an den flags-Parameter von übergeben werden[`LockBits`](../system.drawing/bitmap/lockbits) Methode. Die[`LockBits`](../system.drawing/bitmap/lockbits) -Methode sperrt einen Teil eines Bildes , sodass Sie die Pixeldaten lesen oder schreiben können. |
| [MetafileFrameUnit](./metafileframeunit) | Gibt die Maßeinheit für das Rechteck an, das zur Größe und Positionierung einer Metadatei verwendet wird. Dies wird während der Erstellung der angegebenMetafile Objekt. |
| [MetafileType](./metafiletype) | Gibt Typen von Metadateien an. |
| [PixelFormat](./pixelformat) | Gibt das Format der Farbdaten für jedes Pixel im Bild an. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
