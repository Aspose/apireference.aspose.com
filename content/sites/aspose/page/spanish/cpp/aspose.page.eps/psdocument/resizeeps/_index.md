---
title: "Aspose::Page::EPS::PsDocument::ResizeEps método"
linktitle: "ResizeEps"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps método. Cambia el tamaño del PsDocument dado como archivo EPS. Este método se usa solo después de extraer el tamaño del EPS. Guarda el archivo EPS inicial con el %BoundingBox existente actualizado o se creará uno nuevo. La matriz de transformación de la página también se establecerá en C++."
type: docs
weight: 4000
url: /es/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Redimensiona el [PsDocument](../) como archivo [EPS](../../). Este método se usa solo después de extraer el tamaño del [EPS](../../). Guarda el archivo [EPS](../../) con el %BoundingBox existente actualizado o se creará uno nuevo. También se establecerá la matriz de transformación del [Page](../../../aspose.page/).

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Flujo del archivo [EPS](../../) de salida. |
| newSizeInUnits | System::Drawing::SizeF | Nuevo tamaño de la imagen [EPS](../../) en unidades asignadas. |
| unidades | Unidades | Las unidades del nuevo tamaño. Pueden ser puntos, pulgadas, milímetros, centímetros y porcentajes del tamaño inicial. |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Redimensiona el [PsDocument](../) como archivo [EPS](../../). Este método se usa solo después de extraer el tamaño del [EPS](../../). Guarda el archivo [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hEl directorio de salida donde se guardará el archivo de imagen.e con el %BoundingBox existente actualizado o se creará uno nuevo. También se establecerá la matriz de transformación del [Page](../../../aspose.page/).

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outEpsFilePath | System::String | La ruta del archivo [EPS](../../) de salida. |
| newSizeInUnits | System::Drawing::SizeF | Nuevo tamaño de la imagen [EPS](../../) en unidades asignadas. |
| unidades | Unidades | Las unidades del nuevo tamaño. Pueden ser puntos, pulgadas, milímetros, centímetros y porcentajes del tamaño inicial. |

## Ver también

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
