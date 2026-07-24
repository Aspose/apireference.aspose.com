---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs método"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs método. Inserta nuevos glifos en la lista de hijos de este canvas''s en la posición índice en C++."
type: docs
weight: 900
url: /es/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


Inserta nuevos glyphs en la lista de hijos de este canvas en la posición *index*.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int32_t | Posición en la que se deben insertar los nuevos glifos. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) familia. |
| fontSize | float | [Font](../../../aspose.page.font/) tamaño. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) estilo. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada T de origen de los glifos. |
| unicodeString | System::String | String a imprimir. |

### ReturnValue

Glifos añadidos.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
