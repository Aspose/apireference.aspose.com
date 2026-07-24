---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader clase"
linktitle: "TiffDataReader"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader clase. La clase se usa para leer datos del directorio de archivos de imagen TIFF (IFD). Ayuda a leer la resolución TIFF y a comprobar la conformidad TIFF en C++."
type: docs
weight: 100
url: /es/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


La clase se usa para leer datos del directorio de archivos de imagen TIFF (IFD). Ayuda a leer la resolución TIFF y a comprobar la conformidad TIFF.

```cpp
class TiffDataReader : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | Devuelve la altura de la imagen Tiff. Si la altura es 0, devuelve el valor predeterminado (100). |
| [get_ImageWidth](./get_imagewidth/)() | Devuelve el ancho de la imagen Tiff. Si el ancho es 0, devuelve el valor predeterminado (100). |
| [get_ImageXResolution](./get_imagexresolution/)() const | Devuelve la resolución X de la imagen Tiff. |
| [get_ImageYResolution](./get_imageyresolution/)() const | Devuelve la resolución Y de la imagen Tiff. |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | Devuelve true si la imagen TIFF cumple la especificación [XPS](../../aspose.page.xps/) y puede insertarse en un documento [XPS](../../aspose.page.xps/) tal como está. |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | La documentación del formato está en Aspose.Words\\Doc. |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | Inicializa una nueva instancia de la clase [TiffDataReader](./). |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | Inicializa una nueva instancia de la clase [TiffDataReader](./). |
## Ver también

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
