---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader klass"
linktitle: "TiffDataReader"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader klass. Klassen används för att läsa data från TIFF-bildens filkatalog (IFD). Den hjälper till att läsa TIFF-upplösning och kontrollera TIFF-överensstämmelse i C++."
type: docs
weight: 100
url: /sv/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


Klassen används för att läsa data från TIFF-bildfilskatalog (IFD). Den hjälper till att läsa TIFF-upplösning och kontrollera TIFF-överensstämmelse.

```cpp
class TiffDataReader : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | Returnerar TIFF-bildens höjd. Om höjden är 0 returneras standardvärdet (100). |
| [get_ImageWidth](./get_imagewidth/)() | Returnerar TIFF-bildens bredd. Om bredden är 0 returneras standardvärdet (100). |
| [get_ImageXResolution](./get_imagexresolution/)() const | Returnerar TIFF-bildens X-upplösning. |
| [get_ImageYResolution](./get_imageyresolution/)() const | Returnerar TIFF-bildens Y-upplösning. |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | Returnerar true om TIFF-bilden följer [XPS](../../aspose.page.xps/) specifikationen och kan infogas i ett [XPS](../../aspose.page.xps/) dokument som den är. |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | Dokumentation för formatet finns i Aspose.Words\\Doc. |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | Initierar en ny instans av klassen [TiffDataReader](./). |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | Initierar en ny instans av klassen [TiffDataReader](./). |
## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
