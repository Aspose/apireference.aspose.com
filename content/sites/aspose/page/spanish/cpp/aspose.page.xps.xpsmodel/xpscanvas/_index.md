---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas clase"
linktitle: "XpsCanvas"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas clase. Clase que encapsula las características del elemento Canvas. Este elemento agrupa elementos juntos. Por ejemplo, los elementos Glyphs y Path pueden agruparse en un canvas para ser identificados como una unidad (como destino de hipervínculo) o para aplicar un valor de propiedad compuesto a cada elemento hijo y ancestro en C++."
type: docs
weight: 500
url: /es/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Clase que encapsula las características del elemento Canvas. Este elemento agrupa elementos juntos. Por ejemplo, los elementos Glyphs y Path pueden agruparse en un canvas para ser identificados como una unidad (como destino de hipervínculo) o para aplicar un valor de propiedad compuesto a cada elemento hijo y ancestro.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(T) | Agrega un elemento a la lista de hijos de este canvas. |
| [AddCanvas](./addcanvas/)() | Agrega un nuevo canvas a la lista de hijos de este canvas. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Agrega nuevos glyphs a la lista de hijos de este canvas. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Agrega un nuevo path a la lista de hijos de este canvas. |
| [Clone](./clone/)() | Clona este canvas. |
| [get_EdgeMode](./get_edgemode/)() const | Devuelve/establece el valor que controla cómo se renderizan los bordes de los paths dentro del canvas. |
| [Insert](./insert/)(int32_t, T) | Inserta un elemento en la lista de hijos de este canvas en la posición *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Inserta un nuevo canvas en la lista de hijos de este canvas en la posición *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Inserta nuevos glyphs en la lista de hijos de este canvas en la posición *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Inserta un nuevo path en la lista de hijos de este canvas en la posición *index*. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Devuelve/establece el valor que controla cómo se renderizan los bordes de los paths dentro del canvas. |
## Ver también

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
