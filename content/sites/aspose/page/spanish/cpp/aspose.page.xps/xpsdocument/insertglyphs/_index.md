---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs método"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs método. Inserta nuevos glifos en la página activa en la posición de índice en C++."
type: docs
weight: 4400
url: /es/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Inserta nuevos glifos en la página activa en la posición *index*.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int32_t | Posición en la que se deben insertar los nuevos glifos. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) recurso. |
| fontSize | float | [Font](../../../aspose.page.font/) tamaño. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | System::String | String a imprimir. |

### ReturnValue

Glifos insertados.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Inserta nuevos glifos en la página activa en la posición *index*.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int32_t | Posición en la que se deben insertar los nuevos glifos. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) familia. |
| fontSize | float | [Font](../../../aspose.page.font/) tamaño. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) estilo. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | System::String | String a imprimir. |

### ReturnValue

Glifos insertados.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
