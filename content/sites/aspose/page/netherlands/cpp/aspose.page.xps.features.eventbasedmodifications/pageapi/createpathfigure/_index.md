---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure method"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure method. Maakt een nieuw padfiguur aan in C++."
type: docs
weight: 1500
url: /nl/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


Maakt een nieuwe padfiguur.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Het startpunt voor het eerste segment van de padfiguur. |
| isClosed | bool | Specificeert of het pad gesloten is. Als ingesteld op true, wordt de lijn "gesloten" getekend, dat wil zeggen dat het laatste punt in het laatste segment van de padfiguur wordt verbonden met het punt dat is opgegeven in het StartPoint-attribuut; anders wordt de lijn "open" getekend en wordt het laatste punt niet verbonden met het startpunt. Alleen toepasbaar als de padfiguur wordt gebruikt in een Path-element dat een lijn specificeert. |

### ReturnValue

Nieuwe padfiguur.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Maakt een nieuwe padfiguur.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Het startpunt voor het eerste segment van de padfiguur. |
| segmenten | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | Lijst met padsegmenten. |
| isClosed | bool | Specificeert of het pad gesloten is. Als ingesteld op true, wordt de lijn "gesloten" getekend, dat wil zeggen dat het laatste punt in het laatste segment van de padfiguur wordt verbonden met het punt dat is opgegeven in het StartPoint-attribuut; anders wordt de lijn "open" getekend en wordt het laatste punt niet verbonden met het startpunt. Alleen toepasbaar als de padfiguur wordt gebruikt in een Path-element dat een lijn specificeert. |

### ReturnValue

Nieuwe padfiguur.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
