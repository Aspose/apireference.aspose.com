---
title: "Aspose::Page::XPS::XpsModel::XpsContentElement‑klass"
linktitle: "XpsContentElement"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsContentElement‑klass. Inkapslar funktioner hos XPS‑innehållselement: Canvas, Path och Glyphs i C++."
type: docs
weight: 700
url: /sv/cpp/aspose.page.xps.xpsmodel/xpscontentelement/
---
## XpsContentElement class


Inkapslar funktioner hos [XPS](../../aspose.page.xps/) innehållselement: Canvas, Path och Glyphs.

```cpp
class XpsContentElement : public Aspose::Page::XPS::XpsModel::XpsHyperlinkElement
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Clip](./get_clip/)() | Returnerar/sätter path‑geometri‑instansen som begränsar det renderade området för elementet. |
| [get_Opacity](./get_opacity/)() const | Returnerar/sätter värdet som definierar elementets enhetliga transparens. |
| [get_OpacityMask](./get_opacitymask/)() | Returnerar/sätter penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [get_RenderTransform](./get_rendertransform/)() | Returnerar/sätter den affina transformationsmatrisen som etablerar ett nytt koordinatsystem för alla attribut hos elementet och för alla underordnade element (om några). |
| [set_Clip](./set_clip/)(System::SharedPtr\<XpsPathGeometry\>) | Returnerar/sätter path‑geometri‑instansen som begränsar det renderade området för elementet. |
| [set_Opacity](./set_opacity/)(float) | Returnerar/sätter värdet som definierar elementets enhetliga transparens. |
| [set_OpacityMask](./set_opacitymask/)(System::SharedPtr\<XpsBrush\>) | Returnerar/sätter penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [set_RenderTransform](./set_rendertransform/)(System::SharedPtr\<XpsMatrix\>) | Returnerar/sätter den affina transformationsmatrisen som etablerar ett nytt koordinatsystem för alla attribut hos elementet och för alla underordnade element (om några). |
## Se även

* Class [XpsHyperlinkElement](../xpshyperlinkelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
