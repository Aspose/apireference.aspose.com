---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry sınıfı"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry sınıfı. PathGeometry özelliği öğesinin özelliklerini kapsayan sınıf. Bu öğe, C++'ta Figures özniteliğiyle veya bir alt PathFigure öğesiyle belirtilen bir dizi yol figürü içerir."
type: docs
weight: 3200
url: /tr/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


PathGeometry özellik öğesi özelliklerini kapsayan sınıf. Bu öğe, Figures özniteliğiyle ya da bir çocuk PathFigure öğesiyle belirtilen bir dizi yol figürünü içerir.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Son yol figürünün alt segmentler listesine bir yol segmenti ekler. |
| [Clone](./clone/)() | Bu yol geometrisini klonlar. |
| [get_FillRule](./get_fillrule/)() const | Geometrik şekillerin kesişen alanlarının bir bölge oluşturmak için nasıl birleştirileceğini belirten değeri döndürür/ayarlar. |
| [get_PathFigures](./get_pathfigures/)() | Alt yol figürlerinin listesini döndürür. |
| [get_Transform](./get_transform/)() override | Doldurma, kırpma veya kenarlama için kullanılmadan önce yol geometrisinin tüm alt ve türemiş öğelerine uygulanan yerel matris dönüşümünü oluşturan affine dönüşüm matrisini döndürür/ayarlar. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | *index* konumunda, son yol figürünün alt segmentler listesine bir yol segmenti ekler. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Son yol figürünün alt segmentler listesinden bir yol segmenti kaldırır. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | *index* konumunda, son yol figürünün alt segmentler listesinden bir yol segmenti kaldırır. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Geometrik şekillerin kesişen alanlarının bir bölge oluşturmak için nasıl birleştirileceğini belirten değeri döndürür/ayarlar. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Doldurma, kırpma veya kenarlama için kullanılmadan önce yol geometrisinin tüm alt ve türemiş öğelerine uygulanan yerel matris dönüşümünü oluşturan affine dönüşüm matrisini döndürür/ayarlar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |
## Ayrıca Bakınız

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
