---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure método"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure método. Crea una nueva figura de ruta en C++."
type: docs
weight: 1500
url: /es/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


Crea una nueva figura de ruta.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | El punto de partida del primer segmento de la figura de ruta. |
| isClosed | bool | Especifica si la ruta está cerrada. Si se establece en true, el trazo se dibuja "closed", es decir, el último punto del último segmento de la figura de ruta se conecta con el punto especificado en el atributo StartPoint; de lo contrario, el trazo se dibuja "open" y el último punto no se conecta al punto de inicio. Solo es aplicable si la figura de ruta se usa en un elemento Path que especifica un trazo. |

### ReturnValue

Nueva figura de ruta.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Crea una nueva figura de ruta.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | El punto de partida del primer segmento de la figura de ruta. |
| segments | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | Lista de segmentos de ruta. |
| isClosed | bool | Especifica si la ruta está cerrada. Si se establece en true, el trazo se dibuja "closed", es decir, el último punto del último segmento de la figura de ruta se conecta con el punto especificado en el atributo StartPoint; de lo contrario, el trazo se dibuja "open" y el último punto no se conecta al punto de inicio. Solo es aplicable si la figura de ruta se usa en un elemento Path que especifica un trazo. |

### ReturnValue

Nueva figura de ruta.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
