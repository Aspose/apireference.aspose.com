---
title: "Clase Aspose::Page::XPS::XpsModel::XpsPathGeometry"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::XPS::XpsModel::XpsPathGeometry. Clase que encapsula las características del elemento de la propiedad PathGeometry. Este elemento contiene un conjunto de figuras de ruta especificadas ya sea con el atributo Figures o con un elemento hijo PathFigure en C++."
type: docs
weight: 3200
url: /es/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Clase que encapsula características del elemento de propiedad PathGeometry. Este elemento contiene un conjunto de figuras de ruta especificadas ya sea con el atributo Figures o con un elemento hijo PathFigure.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Métodos

| Método | Descripción |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Agrega un segmento de ruta a la lista de segmentos hijos de la última figura de ruta. |
| [Clone](./clone/)() | Clona esta geometría de ruta. |
| [get_FillRule](./get_fillrule/)() const | Devuelve/establece el valor que especifica cómo se combinan las áreas intersectadas de formas geométricas para formar una región. |
| [get_PathFigures](./get_pathfigures/)() | Devuelve la lista de figuras de ruta hijas. |
| [get_Transform](./get_transform/)() override | Devuelve/establece la matriz de transformación afín que establece la transformación matricial local que se aplica a todos los elementos hijos y descendientes de la geometría de ruta antes de que se use para rellenar, recortar o trazar. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Inserta un segmento de ruta en la lista de segmentos hijos de la última figura de ruta en la posición *index*. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Elimina un segmento de ruta de la lista de segmentos hijos de la última figura de ruta. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Elimina un segmento de ruta de la lista de segmentos hijos de la última figura de ruta en la posición *index*. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Devuelve/establece el valor que especifica cómo se combinan las áreas intersectadas de formas geométricas para formar una región. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Devuelve/establece la matriz de transformación afín que establece la transformación matricial local que se aplica a todos los elementos hijos y descendientes de la geometría de ruta antes de que se use para rellenar, recortar o trazar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Establece el n‑ésimo argumento de plantilla como un puntero débil (en lugar de compartido). Permite cambiar los punteros en contenedores al modo débil. |
## Ver también

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
