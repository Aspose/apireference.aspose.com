---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader Klasse"
linktitle: "TiffDataReader"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader Klasse. Die Klasse wird verwendet, um Daten aus dem TIFF-Bilddateiverzeichnis (IFD) zu lesen. Sie hilft, die TIFF-Auflösung zu lesen und die TIFF-Konformität in C++ zu prüfen."
type: docs
weight: 100
url: /de/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


Die Klasse wird verwendet, um Daten aus dem TIFF-Bilddateiverzeichnis (IFD) zu lesen. Sie hilft, die TIFF-Auflösung zu lesen und die TIFF-Konformität zu prüfen.

```cpp
class TiffDataReader : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | Gibt die TIFF-Bildhöhe zurück. Wenn die Höhe 0 ist, wird der Standardwert (100) zurückgegeben. |
| [get_ImageWidth](./get_imagewidth/)() | Gibt die TIFF-Bildbreite zurück. Wenn die Breite 0 ist, wird der Standardwert (100) zurückgegeben. |
| [get_ImageXResolution](./get_imagexresolution/)() const | Gibt die X-Auflösung des TIFF-Bildes zurück. |
| [get_ImageYResolution](./get_imageyresolution/)() const | Gibt die Y-Auflösung des TIFF-Bildes zurück. |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | Gibt true zurück, wenn das TIFF-Bild der [XPS](../../aspose.page.xps/) Spezifikation entspricht und unverändert in ein [XPS](../../aspose.page.xps/) Dokument eingefügt werden kann. |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | Die Dokumentation für das Format befindet sich in Aspose.Words\\Doc. |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | Initialisiert eine neue Instanz der Klasse [TiffDataReader](./). |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | Initialisiert eine neue Instanz der Klasse [TiffDataReader](./). |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
