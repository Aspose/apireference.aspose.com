---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs clase"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs clase. Clase que encapsula las características del elemento Glyphs. Este elemento representa una secuencia de texto uniformemente formateado de una sola fuente. Proporciona la información necesaria para una renderización precisa y admite funciones de búsqueda y selección en los consumidores de visualización en C++."
type: docs
weight: 1500
url: /es/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Clase que encapsula características del elemento Glyphs. Este elemento representa una secuencia de texto con formato uniforme de una sola fuente. Proporciona la información necesaria para un renderizado preciso y admite funciones de búsqueda y selección en los consumidores de visualización.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() | Clonar estos glifos. |
| [get_BidiLevel](./get_bidilevel/)() const | Devuelve/establece el valor que especifica el nivel de anidamiento bidireccional del algoritmo Unicode. Los valores pares implican un diseño de izquierda a derecha, los valores impares implican un diseño de derecha a izquierda. El diseño de derecha a izquierda coloca el origen de la secuencia en el lado derecho del primer glifo, con anchos de avance positivos (que representan avances hacia la izquierda) que colocan los glifos subsiguientes a la izquierda del glifo anterior. |
| [get_Fill](./get_fill/)() | Devuelve/establece el pincel utilizado para rellenar la forma de los glifos renderizados. |
| [get_Font](./get_font/)() | Devuelve el recurso de fuente para la fuente **TrueType** utilizada para componer el texto de los elementos. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | Devuelve/establece el tamaño de la fuente en unidades de la superficie de dibujo, expresado como un número de punto flotante en unidades del espacio de coordenadas efectivo. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | Devuelve/establece el valor que indica que un glifo está girado de lado, con el origen definido como el centro superior del glifo sin girar. |
| [get_OriginX](./get_originx/)() const | Devuelve/establece la coordenada x del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |
| [get_OriginY](./get_originy/)() const | Devuelve/establece la coordenada y del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |
| [get_StyleSimulations](./get_stylesimulations/)() const | Devuelve/establece el valor que especifica una simulación de estilo. |
| [get_UnicodeString](./get_unicodestring/)() const | Devuelve/establece la cadena de texto renderizada por el elemento Glyphs. El texto se especifica como puntos de código Unicode. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Devuelve/establece el valor que especifica el nivel de anidamiento bidireccional del algoritmo Unicode. Los valores pares implican un diseño de izquierda a derecha, los valores impares implican un diseño de derecha a izquierda. El diseño de derecha a izquierda coloca el origen de la secuencia en el lado derecho del primer glifo, con anchos de avance positivos (que representan avances hacia la izquierda) que colocan los glifos subsiguientes a la izquierda del glifo anterior. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Devuelve/establece el pincel utilizado para rellenar la forma de los glifos renderizados. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | Devuelve/establece el tamaño de la fuente en unidades de la superficie de dibujo, expresado como un número de punto flotante en unidades del espacio de coordenadas efectivo. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | Devuelve/establece el valor que indica que un glifo está girado de lado, con el origen definido como el centro superior del glifo sin girar. |
| [set_OriginX](./set_originx/)(float) | Devuelve/establece la coordenada x del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |
| [set_OriginY](./set_originy/)(float) | Devuelve/establece la coordenada y del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | Devuelve/establece el valor que especifica una simulación de estilo. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Devuelve/establece la cadena de texto renderizada por el elemento Glyphs. El texto se especifica como puntos de código Unicode. |
## Ver también

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
