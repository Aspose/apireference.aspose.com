---
title: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush metodu"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush metodu. C++'ta yeni bir görsel fırça oluşturur."
type: docs
weight: 2900
url: /tr/cpp/aspose.page.xps/xpsdocument/createvisualbrush/
---
## XpsDocument::CreateVisualBrush method


Yeni bir görsel fırça oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::XpsDocument::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | Bu [XPS](../../) öğesi (Canvas, Path veya Glyphs) Visual özelliği için görsel fırça. |
| viewbox | System::Drawing::RectangleF | Fırçanın kaynak içeriğinin konumu ve boyutları. |
| görünüm alanı | System::Drawing::RectangleF | Fırçanın uygulandığı bölgeyi doldurmak için (muhtemelen tekrar tekrar) uygulanan ana fırça döşemesinin bulunduğu koordinat uzayındaki bölge. |

### ReturnValue

Yeni görsel fırça.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
