---
title: "Método System::Drawing::Graphics::MeasureCharacterRanges"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Page para C++"
description: "Método System::Drawing::Graphics::MeasureCharacterRanges. Devuelve una matriz de regiones, cada una de las cuales delimita posiciones de caracteres en la cadena especificada en C++."
type: docs
weight: 6400
url: /es/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


Devuelve una matriz de regiones, cada una de las cuales delimita posiciones de caracteres en la cadena especificada.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | const System::String\& | La cadena a medir |
| fuente | const SharedPtr\<Font\>\& | La fuente utilizada durante la medición de la cadena |
| layoutRect | RectangleF | El rectángulo de diseño utilizado durante la medición de la cadena |
| stringFormat | const SharedPtr\<StringFormat\>\& | El formato de cadena, contiene los rangos de caracteres a medir |

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
