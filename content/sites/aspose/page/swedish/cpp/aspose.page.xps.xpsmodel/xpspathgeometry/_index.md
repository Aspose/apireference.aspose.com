---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry klass"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry klass. Klass som kapslar in egenskaps‑elementfunktioner för PathGeometry. Detta element innehåller en uppsättning path‑figurer som antingen specificeras med attributet Figures eller med ett underordnat PathFigure‑element i C++."
type: docs
weight: 3200
url: /sv/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Klass som kapslar in PathGeometry-egenskapselementfunktioner. Detta element innehåller en uppsättning path-figurer som anges antingen med attributet Figures eller med ett barn-PathFigure-element.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Lägger till ett path‑segment i listan över undersegment för den sista path‑figuren. |
| [Clone](./clone/)() | Klonar denna path‑geometri. |
| [get_FillRule](./get_fillrule/)() const | Returnerar/sätter värdet som specificerar hur de skärande områdena för geometriska former kombineras för att bilda en region. |
| [get_PathFigures](./get_pathfigures/)() | Returnerar lista över underordnade path‑figurer. |
| [get_Transform](./get_transform/)() override | Returnerar/sätter den affina transformationsmatrisen som etablerar den lokala matrisomvandlingen som tillämpas på alla under‑ och avkommande element i path‑geometrin innan den används för fyllning, beskärning eller konturering. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Infogar ett path‑segment i listan över undersegment för den sista path‑figuren på *index*‑position. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Tar bort ett path‑segment från listan över undersegment för den sista path‑figuren. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Tar bort ett path‑segment från listan över undersegment för den sista path‑figuren på *index*‑position. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Returnerar/sätter värdet som specificerar hur de skärande områdena för geometriska former kombineras för att bilda en region. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Returnerar/sätter den affina transformationsmatrisen som etablerar den lokala matrisomvandlingen som tillämpas på alla under‑ och avkommande element i path‑geometrin innan den används för fyllning, beskärning eller konturering. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ställ in n:te mallargumentet som en svag pekare (istället för delad). Tillåter att byta pekare i behållare till svagt läge. |
## Se även

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
