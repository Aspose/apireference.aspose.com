---
title: "Aspose::Page::EPS::PsDocument Klasse"
linktitle: "PsDocument"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument Klasse. Diese Klasse kapselt PS/EPS‑Dokumente in C++."
type: docs
weight: 700
url: /de/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Diese Klasse kapselt PS/EPS‑Dokumente.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Fügt dem aktuellen Grafikzustand einen Clip hinzu. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Fügt dem aktuellen Grafikzustand einen Clip hinzu und schreibt dann den Operator "newpath". Dies ist notwendig, um die Konvergenz dieses Clipping‑Pfads und einiger nachfolgender Pfade, wie z. B. Glyphen, die mit dem Operator "charpath" umrissen werden, zu vermeiden. |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Fügt dem aktuellen Grafikzustand ein Clipping‑Rechteck hinzu. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Fügt einen Clip aus einer Kontur des angegebenen Textes in der angegebenen Schriftart hinzu. |
| [ClosePage](./closepage/)() | Vervollständige die aktuelle Seite. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Konvertiert Type‑1‑Schriftart zu **TrueType**. Der Name der konvertierten TTF‑Schrift wird derselbe sein wie die Eingabe‑Type‑1‑Schrift mit der Erweiterung ".ttf". Die TTF‑Datei wird im zugewiesenen Ausgabeverzeichnis gespeichert. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Konvertiert Type‑3‑Schriftart zu **TrueType**. Der Name der konvertierten TTF‑Schrift wird derselbe sein wie die Eingabe‑Type‑3‑Schriftdatei mit der Erweiterung ".ttf". Die TTF‑Datei wird im zugewiesenen Ausgabeverzeichnis gespeichert. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Konvertiert Type‑3‑Schriftart in **TrueType**‑Stream. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Schneidet das angegebene [PsDocument](./) als [EPS](../)‑Datei zu. Es speichert die ursprüngliche [EPS](../)‑Datei mit aktualisiertem vorhandenen %BoundingBox oder erstellt ein neues. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Schneidet das angegebene [PsDocument](./) als [EPS](../)‑Datei zu. Es speichert die ursprüngliche [EPS](../)‑Datei mit aktualisiertem vorhandenen %BoundingBox oder erstellt ein neues. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Zeichne einen beliebigen Pfad. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Zeichnet einen Bogen. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Zeichnet maskiertes Bild. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Zeichnet Bild. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Zeichnet ein transformiertes Bild mit Hintergrund. |
| [DrawLine](./drawline/)(double, double, double, double) | Zeichnet ein Liniensegment. |
| [DrawOval](./drawoval/)(double, double, double, double) | Zeichnet ein Oval. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Zeichnet ein Polygon. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Zeichnet ein Poligone. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Zeichnet eine Polylinie. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Zeichnet eine Polylinie. |
| [DrawRect](./drawrect/)(double, double, double, double) | Zeichnet ein Rechteck. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Zeichnet ein abgerundetes Rechteck. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Zeichnet ein transformiertes transparentes Bild. Wenn das Bild keinen Alpha channel hat, wird es als undurchsichtiges Bild gezeichnet. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Liest die [EPS](../)-Datei und extrahiert die Begrenzungsbox des [EPS](../)-Bildes aus dem %BoundingBox‑Kommentar oder die Grenzen für die Standardseitengröße (0, 0, 595, 842), falls sie nicht existiert. |
| [ExtractEpsSize](./extractepssize/)() | Liest die [EPS](../)-Datei und extrahiert die Größe des [EPS](../)-Bildes aus dem %BoundingBox‑Kommentar oder die Standardseitengröße (595, 842), falls sie nicht existiert. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Extrahiert Text aus einer PS‑Datei. Der Text kann nur extrahiert werden, wenn er mit einer Type‑42‑Schriftart (**TrueType**) oder einer Type‑0‑Schriftart mit Type‑42‑Schriften in ihrer Vektor‑Karte geschrieben wurde. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Füllt einen beliebigen Pfad. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Füllt einen Bogen. |
| [FillOval](./filloval/)(double, double, double, double) | Füllt ein Oval. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Füllt ein Poligone. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Füllt ein Poligone. |
| [FillRect](./fillrect/)(double, double, double, double) | Füllt ein Rechteck. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Füllt ein abgerundetes Rechteck. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt wird. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt wird. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt wird. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt wird. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt wird. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt wird. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt wird. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt wird. |
| [get_InputStream](./get_inputstream/)() | Initialisiert [PsDocument](./) mit einem Stream und Laderoptionen. |
| [get_NumberOfPages](./get_numberofpages/)() const | Gibt die Anzahl der Seiten im resultierenden PDF‑Dokument zurück. |
| [GetPaint](./getpaint/)() | Erhält die Farbe des aktuellen Grafikzustands. |
| [GetStroke](./getstroke/)() | Setzt den Strich im aktuellen Grafikzustand. |
| [GetXmpMetadata](./getxmpmetadata/)() | Liest die PS/EPS‑Datei und extrahiert XmpMetdata, falls es bereits existiert, oder fügt ein neues hinzu, falls es nicht existiert. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Führt PS/EPS‑Dateien zu einem Gerät zusammen. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Führt PS/EPS‑Dateien zu einem Gerät zusammen. |
| [OpenPage](./openpage/)(float, float) | Erstellt eine neue Seite und macht sie zur aktuellen. |
| [OpenPage](./openpage/)(System::String) | Erstellt eine neue Seite mit der Dokumentgröße und macht sie zur aktuellen. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Fügt eine Textzeichenfolge hinzu, indem die Konturen von Glyphen gezeichnet werden. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Fügt eine Textzeichenfolge hinzu, indem die Konturen von Glyphen gezeichnet werden. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Fügt eine Textzeichenfolge hinzu, indem die Konturen von Glyphen gezeichnet werden. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Fügt eine Textzeichenfolge hinzu, indem die Konturen von Glyphen gezeichnet werden. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Fügt eine Textzeichenfolge hinzu, indem die Konturen von Glyphen gezeichnet werden. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Fügt eine Textzeichenfolge hinzu, indem die Konturen von Glyphen gezeichnet werden. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Fügt eine Textzeichenfolge hinzu, indem die Konturen von Glyphen gezeichnet werden. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Fügt eine Textzeichenfolge hinzu, indem die Konturen von Glyphen gezeichnet werden. |
| [PsDocument](./psdocument/)() | Initialisiert ein leeres [PsDocument](./). Dieser Konstruktor wird nur für zusätzliche Vorgänge verwendet, die nicht mit PostScript-Dateien zusammenhängen, zum Beispiel zum Konvertieren von Schriftarten. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Initialisiert ein leeres [PsDocument](./) mit einer initialisierten Seite. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Initialisiert ein leeres [PsDocument](./) mit einer initialisierten Seite. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initialisiert ein leeres [PsDocument](./). |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initialisiert ein leeres [PsDocument](./). |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initialisiert ein leeres [PsDocument](./), wenn die Anzahl der [Postscript](../../aspose.page.eps.postscript/)-Dokumentseiten im Voraus bekannt ist. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initialisiert ein leeres [PsDocument](./), wenn die Anzahl der [Postscript](../../aspose.page.eps.postscript/)-Dokumentseiten im Voraus bekannt ist. |
| [PsDocument](./psdocument/)(System::String) | Initialisiert [PsDocument](./) mit einer Eingabe‑PS/EPS‑Datei. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Initialisiert [PsDocument](./) mit einem Stream einer PS/EPS‑Datei. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Ändert die Größe des angegebenen [PsDocument](./) als [EPS](../)-Datei. Diese Methode wird nur nach dem Extrahieren der [EPS](../)-Größe verwendet. Sie speichert die ursprüngliche [EPS](../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hDas Ausgabeverzeichnis, in dem die Bilddatei gespeichert wird.e mit aktualisiertem vorhandenen %BoundingBox oder ein neues wird erstellt. Die [Page](../../aspose.page/) Transformationsmatrix wird ebenfalls gesetzt. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Ändert die Größe des angegebenen [PsDocument](./) als [EPS](../)-Datei. Diese Methode wird nur nach dem Extrahieren der [EPS](../)-Größe verwendet. Sie speichert die ursprüngliche [EPS](../)-Datei mit aktualisiertem vorhandenen %BoundingBox oder erstellt ein neues. Die [Page](../../aspose.page/)-Transformationsmatrix wird ebenfalls gesetzt. |
| [Rotate](./rotate/)(float) | Fügt eine Drehung gegen den Uhrzeigersinn um den Ursprung zum aktuellen Grafikstatus hinzu (drehe aktuelle Matrix). |
| [Rotate](./rotate/)(int32_t) | Fügt eine Drehung gegen den Uhrzeigersinn um den Ursprung zum aktuellen Grafikstatus hinzu (drehe aktuelle Matrix). |
| [Save](./save/)(System::String) | Speichert das angegebene [PsDocument](./) als [EPS](../)-Datei. Diese Methode wird nur nach dem Aktualisieren der [XMP](../../aspose.page.eps.xmp/)-Metadaten verwendet. Sie speichert die ursprüngliche [EPS](../)-Datei mit aktualisierten vorhandenen Metadaten oder erstellt eine neue, während die GetMetadata‑Methode aufgerufen wird. Im letzten Fall werden alle erforderlichen PostScript‑Code und [EPS](../)-Kommentare hinzugefügt. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Speichert das angegebene [PsDocument](./) in den Stream. Diese Methode wird nur nach dem Aktualisieren der [XMP](../../aspose.page.eps.xmp/)-Metadaten verwendet. Sie speichert die ursprüngliche [EPS](../)-Datei mit aktualisierten vorhandenen Metadaten oder erstellt eine neue, während die GetMetadata‑Methode aufgerufen wird. Im letzten Fall werden alle erforderlichen PostScript‑Code und [EPS](../)-Kommentare hinzugefügt. |
| [Save](./save/)() | Speichert das angegebene [PsDocument](./) als PS- oder [EPS](../)-Datei. Diese Methode wird nur verwendet, wenn [PsDocument](./) von Grund auf neu erstellt wurde. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Speichert die PS/EPS‑Datei als Bilddatei. Das Ausgabeverzeichnis und der Dateiname entsprechen denen der Eingabe‑PS‑Datei. Die Dateierweiterung entspricht dem Bildformat im Parameter "options". Wenn das Dokument mit einem Stream initialisiert wurde, der kein FileStream ist, wird die Bilddatei im aktuellen Ordner mit einer Standard‑Dateinamen‑Vorlage gespeichert. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | Speichert die PS/EPS‑Datei als Bilddatei im angegebenen Verzeichnis mit dem angegebenen Dateinamen. Die Dateierweiterung entspricht dem Bildformat im Parameter "options". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Speichert die PS/EPS‑Datei in Bild‑Byte‑Arrays. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Speichert die PS/EPS‑Datei als PDF‑Datei. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Speichert die PS/EPS‑Datei in einen PDF‑Stream. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Speichert ein PNG/JPEG/TIFF/BMP/GIF/EMF‑Bild aus dem Eingabestream in den [EPS](../)-Ausgabestream. |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Speichert ein PNG/JPEG/TIFF/BMP/GIF/EMF‑Bild aus einer Datei in eine [EPS](../)-Datei. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Speichert das Bitmap‑Objekt in einer [EPS](../)-Datei. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Speichert das Bitmap‑Objekt in einen [EPS](../)-Ausgabestream. |
| [Scale](./scale/)(float, float) | Fügt dem aktuellen Grafikstatus eine Skalierung hinzu (skaliere aktuelle Matrix). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Initialisiert [PsDocument](./) mit einem Stream und Laderoptionen. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Setzt Seiten‑Geräteparameter (siehe Operator "setpagedevice" in der PostScript‑Spezifikation). Dazu können Seitengröße, Farbe usw. gehören. |
| [SetPageSize](./setpagesize/)(float, float) | Setzt die Seitengröße. Um in einem Dokument Seiten mit unterschiedlichen Größen zu erstellen, verwenden Sie die Methode [SetPageDevice](./setpagedevice/) direkt nach dieser Methode. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Setzt die Farbe im aktuellen Grafikzustand. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Setzt den Strich im aktuellen Grafikzustand. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Setzt die aktuelle Transformation auf diese. |
| [Shear](./shear/)(float, float) | Dreht den aktuellen Grafikzustand gegen den Uhrzeigersinn um einen Punkt. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Fügt dem aktuellen Grafikzustand eine Transformation hinzu (verknüpft diese Matrix mit der aktuellen). |
| [Translate](./translate/)(float, float) | Fügt dem aktuellen Grafikzustand eine Verschiebung hinzu (verschiebt die aktuelle Matrix). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Schreibt das Wiederherstellen des aktuellen Grafikzustands (Siehe PostScript-Spezifikation zum Operator "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Schreibt das Speichern des aktuellen Grafikzustands (Siehe PostScript-Spezifikation zum Operator "gsave"). |
## Siehe auch

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
