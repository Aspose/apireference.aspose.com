---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure metod"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure metod. Skapar en ny banfigur i C++."
type: docs
weight: 1500
url: /sv/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


Skapar en ny sökvägsfigur.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Startpunkten för det första segmentet i sökvägsfiguren. |
| isClosed | bool | Anger om sökvägen är sluten. Om den är satt till true ritas strecket som "slutet", det vill säga att den sista punkten i det sista segmentet av sökvägsfiguren är kopplad till punkten som anges i attributet StartPoint, annars ritas strecket som "öppet", och den sista punkten är inte kopplad till startpunkten. Endast tillämpligt om sökvägsfiguren används i ett Path‑element som specificerar ett streck. |

### ReturnValue

Ny sökvägsfigur.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Skapar en ny sökvägsfigur.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Startpunkten för det första segmentet i sökvägsfiguren. |
| segment | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | Lista över sökvägssegment. |
| isClosed | bool | Anger om sökvägen är sluten. Om den är satt till true ritas strecket som "slutet", det vill säga att den sista punkten i det sista segmentet av sökvägsfiguren är kopplad till punkten som anges i attributet StartPoint, annars ritas strecket som "öppet", och den sista punkten är inte kopplad till startpunkten. Endast tillämpligt om sökvägsfiguren används i ett Path‑element som specificerar ett streck. |

### ReturnValue

Ny sökvägsfigur.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
