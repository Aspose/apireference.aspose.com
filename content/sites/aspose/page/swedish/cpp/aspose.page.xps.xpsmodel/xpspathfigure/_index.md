---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure klass"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure klass. Klass som kapslar in PathFigure-elementets egenskaper. Detta element består av en uppsättning av en eller flera linje- eller kurvsegment i C++."
type: docs
weight: 3100
url: /sv/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


Klass som kapslar in PathFigure-elementfunktioner. Detta element består av en uppsättning av en eller flera linje- eller kurvsegment.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() | Klonar detta path figure. |
| [get_IsClosed](./get_isclosed/)() const | Returnerar/ställer in värdet som indikerar om path figure är stängd. |
| [get_IsFilled](./get_isfilled/)() const | Returnerar/ställer in värdet som indikerar om path figure används vid beräkning av området för den omgivande path geometry. |
| [get_Segments](./get_segments/)() | Returnera lista över underordnade path segment. |
| [get_StartPoint](./get_startpoint/)() const | Returnerar/ställer in startpunkten för det första segmentet av path figure. |
| [set_IsClosed](./set_isclosed/)(bool) | Returnerar/ställer in värdet som indikerar om path figure är stängd. |
| [set_IsFilled](./set_isfilled/)(bool) | Returnerar/ställer in värdet som indikerar om path figure används vid beräkning av området för den omgivande path geometry. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | Returnerar/ställer in startpunkten för det första segmentet av path figure. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ställ in n:te mallargumentet som en svag pekare (istället för delad). Tillåter att byta pekare i behållare till svagt läge. |
## Se även

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
