---
title: "Aspose::Page::Plugins::XpsConverterToImageOptions clase"
linktitle: "XpsConverterToImageOptions"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::Plugins::XpsConverterToImageOptions clase. Representa las opciones del convertidor de XPS a Imagen para el plugin XpsConverter en C++."
type: docs
weight: 2100
url: /es/cpp/aspose.page.plugins/xpsconvertertoimageoptions/
---
## XpsConverterToImageOptions class


Representa las opciones del convertidor de [XPS](../../aspose.page.xps/) a Imagen para el plugin [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterToImageOptions : public Aspose::Page::Plugins::XpsConverterOptions
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_ImageFormat](./get_imageformat/)() const | Obtiene/establece el tipo de imagen. |
| [get_OperationName](./get_operationname/)() override | Devuelve el nombre de la operación. |
| [get_PageNumbers](./get_pagenumbers/)() const | Obtiene/establece la matriz de números de páginas en el documento [XPS](../../aspose.page.xps/) a convertir. Si no se establece, se convertirán todas las páginas. |
| [get_Resolution](./get_resolution/)() const | Obtiene/establece la resolución de la imagen. |
| [get_Size](./get_size/)() const | Obtiene/establece el tamaño de la imagen resultante. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Obtiene/establece el modo de suavizado para la renderización de la imagen. |
| [set_ImageFormat](./set_imageformat/)(Aspose::Page::Drawing::Imaging::ImageFormat) | Obtiene/establece el tipo de imagen. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) | Obtiene/establece la matriz de números de páginas en el documento [XPS](../../aspose.page.xps/) a convertir. Si no se establece, se convertirán todas las páginas. |
| [set_Resolution](./set_resolution/)(float) | Obtiene/establece la resolución de la imagen. |
| [set_Size](./set_size/)(System::Drawing::Size) | Obtiene/establece el tamaño de la imagen resultante. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Nullable\<System::Drawing::Drawing2D::SmoothingMode\>) | Obtiene/establece el modo de suavizado para la renderización de la imagen. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)() | Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](./) con opciones predeterminadas. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat) | Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](./) con formato de imagen. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(System::Drawing::Size) | Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](./) con un tamaño de la imagen resultante. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat, System::Drawing::Size) | Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](./) con formato de imagen y un tamaño de la imagen resultante. |
## Ver también

* Class [XpsConverterOptions](../xpsconverteroptions/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
