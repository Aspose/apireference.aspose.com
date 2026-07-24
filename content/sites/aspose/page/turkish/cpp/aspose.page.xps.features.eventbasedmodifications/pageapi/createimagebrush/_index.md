---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush yöntemi. C++'ta yeni bir görüntü fırçası oluşturur."
type: docs
weight: 1100
url: /tr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Yeni bir görüntü fırçası oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| görüntü | System::SharedPtr\<XpsModel::XpsImage\> | Bir görüntü kaynağı. |
| viewbox | System::Drawing::RectangleF | Fırçanın kaynak içeriğinin konumu ve boyutları. |
| görünüm alanı | System::Drawing::RectangleF | Fırçanın uygulandığı bölgeyi doldurmak için (muhtemelen tekrar tekrar) uygulanan ana fırça döşemesinin bulunduğu koordinat uzayındaki bölge. |

### ReturnValue

Yeni görüntü fırçası.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Yeni bir görüntü fırçası oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| imagePath | System::String | Fırça döşemesi olarak kullanılacak görüntünün yolu. |
| viewbox | System::Drawing::RectangleF | Fırçanın kaynak içeriğinin konumu ve boyutları. |
| görünüm alanı | System::Drawing::RectangleF | Fırçanın uygulandığı bölgeyi doldurmak için (muhtemelen tekrar tekrar) uygulanan ana fırça döşemesinin bulunduğu koordinat uzayındaki bölge. |

### ReturnValue

Yeni görüntü fırçası.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
