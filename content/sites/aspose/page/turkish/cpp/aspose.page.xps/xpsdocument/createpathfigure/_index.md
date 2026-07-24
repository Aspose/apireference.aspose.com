---
title: "Aspose::Page::XPS::XpsDocument::CreatePathFigure metodu"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePathFigure metodu. C++'ta yeni bir yol figürü oluşturur."
type: docs
weight: 2200
url: /tr/cpp/aspose.page.xps/xpsdocument/createpathfigure/
---
## XpsDocument::CreatePathFigure(System::Drawing::PointF, bool) method


Yeni bir yol şekli oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::XpsDocument::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Yol figürünün ilk segmenti için başlangıç noktası. |
| isClosed | bool | Yolun kapalı olup olmadığını belirtir. true olarak ayarlanırsa, çizgi "kapalı" olarak çizilir, yani yol figürünün son segmentindeki son nokta StartPoint özniteliğinde belirtilen nokta ile bağlanır; aksi takdirde çizgi "açık" olarak çizilir ve son nokta başlangıç noktasına bağlanmaz. Yalnızca yol figürü bir stroke belirten Path öğesinde kullanıldığında uygulanır. |

### ReturnValue

Yeni yol figürü.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Yeni bir yol şekli oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::XpsDocument::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Yol figürünün ilk segmenti için başlangıç noktası. |
| segmentler | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | Yol segmentlerinin listesi. |
| isClosed | bool | Yolun kapalı olup olmadığını belirtir. true olarak ayarlanırsa, çizgi "kapalı" olarak çizilir, yani yol figürünün son segmentindeki son nokta StartPoint özniteliğinde belirtilen nokta ile bağlanır; aksi takdirde çizgi "açık" olarak çizilir ve son nokta başlangıç noktasına bağlanmaz. Yalnızca yol figürü bir stroke belirten Path öğesinde kullanıldığında uygulanır. |

### ReturnValue

Yeni yol figürü.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
