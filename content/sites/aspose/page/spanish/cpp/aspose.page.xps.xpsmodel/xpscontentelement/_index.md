---
title: "Aspose::Page::XPS::XpsModel::XpsContentElement class"
linktitle: "XpsContentElement"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsModel::XpsContentElement class. Incapsula características de los elementos de contenido XPS: Canvas, Path y Glyphs en C++."
type: docs
weight: 700
url: /es/cpp/aspose.page.xps.xpsmodel/xpscontentelement/
---
## XpsContentElement class


Incapsula características de los elementos de contenido [XPS](../../aspose.page.xps/): Canvas, Path y Glyphs.

```cpp
class XpsContentElement : public Aspose::Page::XPS::XpsModel::XpsHyperlinkElement
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Clip](./get_clip/)() | Devuelve/establece la instancia de geometría de ruta que limita la región renderizada del elemento. |
| [get_Opacity](./get_opacity/)() const | Devuelve/establece el valor que define la transparencia uniforme del elemento. |
| [get_OpacityMask](./get_opacitymask/)() | Devuelve/establece el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permitiendo diferentes valores alfa para distintas áreas del elemento. |
| [get_RenderTransform](./get_rendertransform/)() | Devuelve/establece la matriz de transformación afín que establece un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
| [set_Clip](./set_clip/)(System::SharedPtr\<XpsPathGeometry\>) | Devuelve/establece la instancia de geometría de ruta que limita la región renderizada del elemento. |
| [set_Opacity](./set_opacity/)(float) | Devuelve/establece el valor que define la transparencia uniforme del elemento. |
| [set_OpacityMask](./set_opacitymask/)(System::SharedPtr\<XpsBrush\>) | Devuelve/establece el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permitiendo diferentes valores alfa para distintas áreas del elemento. |
| [set_RenderTransform](./set_rendertransform/)(System::SharedPtr\<XpsMatrix\>) | Devuelve/establece la matriz de transformación afín que establece un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
## Ver también

* Class [XpsHyperlinkElement](../xpshyperlinkelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
