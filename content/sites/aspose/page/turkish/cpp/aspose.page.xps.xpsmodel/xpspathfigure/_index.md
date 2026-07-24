---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure sınıf"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure sınıf. PathFigure öğe özelliklerini kapsayan sınıf. Bu öğe, C++'da bir veya daha fazla çizgi ya da eğri segmentinden oluşan bir küme içerir."
type: docs
weight: 3100
url: /tr/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


PathFigure öğesi özelliklerini kapsayan sınıf. Bu öğe bir veya daha fazla çizgi ya da eğri segmentinden oluşur.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Bu yol figürünü kopyalar. |
| [get_IsClosed](./get_isclosed/)() const | Yol figürünün kapalı olup olmadığını gösteren değeri alır/ayar. |
| [get_IsFilled](./get_isfilled/)() const | Yol figürünün, içinde bulunduğu yol geometrisinin alanını hesaplarken kullanılıp kullanılmadığını gösteren değeri alır/ayar. |
| [get_Segments](./get_segments/)() | Alt yol segmentlerinin listesini döndür. |
| [get_StartPoint](./get_startpoint/)() const | Yol figürünün ilk segmenti için başlangıç noktasını alır/ayar. |
| [set_IsClosed](./set_isclosed/)(bool) | Yol figürünün kapalı olup olmadığını gösteren değeri alır/ayar. |
| [set_IsFilled](./set_isfilled/)(bool) | Yol figürünün, içinde bulunduğu yol geometrisinin alanını hesaplarken kullanılıp kullanılmadığını gösteren değeri alır/ayar. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | Yol figürünün ilk segmenti için başlangıç noktasını alır/ayar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |
## Ayrıca Bakınız

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
