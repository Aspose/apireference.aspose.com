---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas klass"
linktitle: "XpsCanvas"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas klass. Klass som kapslar in Canvas-elementfunktioner. Detta element grupperar element tillsammans. Till exempel kan Glyphs- och Path-element grupperas i en canvas för att identifieras som en enhet (som en hyperlänkmål) eller för att tillämpa ett sammansatt egenskapsvärde på varje barn- och förfaderelement i C++."
type: docs
weight: 500
url: /sv/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Klass som kapslar in Canvas-elementfunktioner. Detta element grupperar element tillsammans. Till exempel kan Glyphs- och Path-element grupperas i en canvas för att identifieras som en enhet (som en hyperlänkmål) eller för att tillämpa ett sammansatt egenskapsvärde på varje barn- och förfaderelement.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(T) | Lägger till ett element i den här canvasens barnlista. |
| [AddCanvas](./addcanvas/)() | Lägger till en ny canvas i den här canvasens barnlista. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Lägger till nya glyphs i den här canvasens barnlista. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Lägger till en ny path i den här canvasens barnlista. |
| [Clone](./clone/)() | Klonar denna canvas. |
| [get_EdgeMode](./get_edgemode/)() const | Returnerar/sätter värdet som styr hur kanterna på path‑element inom canvasen renderas. |
| [Insert](./insert/)(int32_t, T) | Infogar ett element i den här canvasens barnlista på *index* position. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Infogar en ny canvas i den här canvasens barnlista på *index* position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Infogar nya glyphs i den här canvasens barnlista på *index* position. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Infogar en ny path i den här canvasens barnlista på *index* position. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Returnerar/sätter värdet som styr hur kanterna på path‑element inom canvasen renderas. |
## Se även

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
