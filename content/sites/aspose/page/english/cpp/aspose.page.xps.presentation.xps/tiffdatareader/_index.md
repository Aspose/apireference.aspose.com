---
title: Aspose::Page::XPS::Presentation::Xps::TiffDataReader class
linktitle: TiffDataReader
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Presentation::Xps::TiffDataReader class. Class is used to read data from TIFF image file directory (IFD). It helps to read TIFF resolution and check TIFF conformance in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


Class is used to read data from TIFF image file directory (IFD). It helps to read TIFF resolution and check TIFF conformance.

```cpp
class TiffDataReader : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | Returns Tiff image height. If height is 0, returns default value (100). |
| [get_ImageWidth](./get_imagewidth/)() | Returns Tiff image width. If width is 0, returns default value (100). |
| [get_ImageXResolution](./get_imagexresolution/)() const | Returns Tiff image X resolution. |
| [get_ImageYResolution](./get_imageyresolution/)() const | Returns Tiff image Y resolution. |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | Returns true if TIFF image conforms [XPS](../../aspose.page.xps/) specification and can be inserted into [XPS](../../aspose.page.xps/) document as is. |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | Documentation for the format is in Aspose.Words\Doc. |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | Initializes a new instance of the [TiffDataReader](./) class. |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | Initializes a new instance of the [TiffDataReader](./) class. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
