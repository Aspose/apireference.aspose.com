---
title: "Clase System::Drawing::Imaging::ImageFormat"
linktitle: "ImageFormat"
second_title: "Aspose.Page para C++"
description: "Clase System::Drawing::Imaging::ImageFormat. Representa el formato de archivo de una imagen. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1100
url: /es/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Representa el formato de archivo de una imagen. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class ImageFormat : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Determina si los formatos de imagen representados por los objetos actual y especificado son iguales. |
| static [get_Bmp](./get_bmp/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato de imagen bitmap. |
| static [get_Emf](./get_emf/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato de metafile mejorado. |
| static [get_Exif](./get_exif/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato Exchangeable [Image](../../system.drawing/image/) File (Exif). |
| static [get_Gif](./get_gif/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato de imagen [Graphics](../../system.drawing/graphics/) Interchange Format (GIF). |
| [get_Guid](./get_guid/)() const | Devuelve el GUID asociado con el formato de imagen representado por el objeto actual. |
| static [get_Icon](./get_icon/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato de imagen de ícono [Windows](../../system.windows/). |
| static [get_Jpeg](./get_jpeg/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato de imagen Joint Photographic Experts Group (JPEG). |
| static [get_MemoryBmp](./get_memorybmp/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato de un bitmap en memoria. |
| static [get_Png](./get_png/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato de imagen W3C Portable Network [Graphics](../../system.drawing/graphics/) (PNG). |
| static [get_Tiff](./get_tiff/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato de imagen Tagged [Image](../../system.drawing/image/) File Format (TIFF). |
| static [get_Wmf](./get_wmf/)() | Devuelve un puntero compartido a un objeto [ImageFormat](./) que representa el formato de imagen de metafile [Windows](../../system.windows/) (WMF). |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Construye una instancia de la clase [ImageFormat](./) que representa un formato de imagen asociado con el GUID especificado. |
| virtual [ToString](./tostring/)() const | Convierte este objeto [ImageFormat](./) a una cadena legible por humanos. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
