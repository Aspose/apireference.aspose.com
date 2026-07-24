---
title: "Clase Aspose::Page::XPS::XpsModel::XpsPathFigure"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::XPS::XpsModel::XpsPathFigure. Clase que encapsula las características del elemento PathFigure. Este elemento está compuesto por un conjunto de uno o más segmentos de línea o curva en C++."
type: docs
weight: 3100
url: /es/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


Clase que encapsula características del elemento PathFigure. Este elemento está compuesto por un conjunto de uno o más segmentos de línea o curva.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() | Clona esta figura de ruta. |
| [get_IsClosed](./get_isclosed/)() const | Devuelve/establece el valor que indica si la figura de ruta está cerrada. |
| [get_IsFilled](./get_isfilled/)() const | Devuelve/establece el valor que indica si la figura de ruta se utiliza para calcular el área de la geometría de ruta contenedora. |
| [get_Segments](./get_segments/)() | Devuelve la lista de segmentos de ruta hijos. |
| [get_StartPoint](./get_startpoint/)() const | Devuelve/establece el punto de inicio del primer segmento de la figura de ruta. |
| [set_IsClosed](./set_isclosed/)(bool) | Devuelve/establece el valor que indica si la figura de ruta está cerrada. |
| [set_IsFilled](./set_isfilled/)(bool) | Devuelve/establece el valor que indica si la figura de ruta se utiliza para calcular el área de la geometría de ruta contenedora. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | Devuelve/establece el punto de inicio del primer segmento de la figura de ruta. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Establece el n‑ésimo argumento de plantilla como un puntero débil (en lugar de compartido). Permite cambiar los punteros en contenedores al modo débil. |
## Ver también

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
