---
title: "Aspose::Page::XPS::XpsModel::XpsContentElement sınıfı"
linktitle: "XpsContentElement"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsContentElement sınıfı. C++'da XPS içerik öğelerinin (Canvas, Path ve Glyphs) özelliklerini kapsar."
type: docs
weight: 700
url: /tr/cpp/aspose.page.xps.xpsmodel/xpscontentelement/
---
## XpsContentElement class


[XPS](../../aspose.page.xps/) içerik öğelerinin özelliklerini kapsar: Canvas, Path ve Glyphs.

```cpp
class XpsContentElement : public Aspose::Page::XPS::XpsModel::XpsHyperlinkElement
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Clip](./get_clip/)() | Elemanın render edilen bölgesini sınırlayan yol geometrisi örneğini döndürür/ayarlar. |
| [get_Opacity](./get_opacity/)() const | Elemanın tekdüze şeffaflığını tanımlayan değeri döndürür/ayarlar. |
| [get_OpacityMask](./get_opacitymask/)() | Elemanın Opacity niteliği gibi uygulanan, ancak elemanın farklı bölgeleri için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı döndürür/ayarlar. |
| [get_RenderTransform](./get_rendertransform/)() | Elemanın ve varsa tüm alt öğelerin tüm öznitelikleri için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini döndürür/ayarlar. |
| [set_Clip](./set_clip/)(System::SharedPtr\<XpsPathGeometry\>) | Elemanın render edilen bölgesini sınırlayan yol geometrisi örneğini döndürür/ayarlar. |
| [set_Opacity](./set_opacity/)(float) | Elemanın tekdüze şeffaflığını tanımlayan değeri döndürür/ayarlar. |
| [set_OpacityMask](./set_opacitymask/)(System::SharedPtr\<XpsBrush\>) | Elemanın Opacity niteliği gibi uygulanan, ancak elemanın farklı bölgeleri için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı döndürür/ayarlar. |
| [set_RenderTransform](./set_rendertransform/)(System::SharedPtr\<XpsMatrix\>) | Elemanın ve varsa tüm alt öğelerin tüm öznitelikleri için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini döndürür/ayarlar. |
## Ayrıca Bakınız

* Class [XpsHyperlinkElement](../xpshyperlinkelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
