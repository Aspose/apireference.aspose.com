---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure Methode"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure Methode. Erstellt eine neue Pfadfigur in C++."
type: docs
weight: 1500
url: /de/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


Erstellt eine neue Pfadfigur.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Der Startpunkt für das erste Segment der Pfadfigur. |
| isClosed | bool | Gibt an, ob der Pfad geschlossen ist. Wenn auf true gesetzt, wird die Kontur "geschlossen" gezeichnet, das heißt, der letzte Punkt im letzten Segment der Pfadfigur wird mit dem im Attribut StartPoint angegebenen Punkt verbunden; andernfalls wird die Kontur "offen" gezeichnet und der letzte Punkt ist nicht mit dem Startpunkt verbunden. Nur anwendbar, wenn die Pfadfigur in einem Path-Element verwendet wird, das eine Kontur angibt. |

### ReturnValue

Neue Pfadfigur.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Erstellt eine neue Pfadfigur.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Der Startpunkt für das erste Segment der Pfadfigur. |
| Segmente | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | Liste von Pfadsegmenten. |
| isClosed | bool | Gibt an, ob der Pfad geschlossen ist. Wenn auf true gesetzt, wird die Kontur "geschlossen" gezeichnet, das heißt, der letzte Punkt im letzten Segment der Pfadfigur wird mit dem im Attribut StartPoint angegebenen Punkt verbunden; andernfalls wird die Kontur "offen" gezeichnet und der letzte Punkt ist nicht mit dem Startpunkt verbunden. Nur anwendbar, wenn die Pfadfigur in einem Path-Element verwendet wird, das eine Kontur angibt. |

### ReturnValue

Neue Pfadfigur.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
