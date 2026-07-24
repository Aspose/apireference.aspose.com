---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure metodo"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure metodo. Crea una nuova figura di percorso in C++."
type: docs
weight: 1500
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


Crea una nuova figura di percorso.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Il punto di partenza per il primo segmento della figura del percorso. |
| isClosed | bool | Specifica se il percorso è chiuso. Se impostato su true, il tratto è disegnato \"closed\", cioè l'ultimo punto dell'ultimo segmento della figura del percorso è collegato al punto specificato nell'attributo StartPoint; altrimenti il tratto è disegnato \"open\" e l'ultimo punto non è collegato al punto di partenza. Applicabile solo se la figura del percorso è utilizzata in un elemento Path che specifica un tratto. |

### ReturnValue

Nuova figura del percorso.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Crea una nuova figura di percorso.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Il punto di partenza per il primo segmento della figura del percorso. |
| segmenti | System::SharedPtr\\<System::Collections::Generic::List\\<System::SharedPtr\\<XpsModel::XpsPathSegment\\>\\>\\> | Elenco di segmenti del percorso. |
| isClosed | bool | Specifica se il percorso è chiuso. Se impostato su true, il tratto è disegnato \"closed\", cioè l'ultimo punto dell'ultimo segmento della figura del percorso è collegato al punto specificato nell'attributo StartPoint; altrimenti il tratto è disegnato \"open\" e l'ultimo punto non è collegato al punto di partenza. Applicabile solo se la figura del percorso è utilizzata in un elemento Path che specifica un tratto. |

### ReturnValue

Nuova figura del percorso.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
