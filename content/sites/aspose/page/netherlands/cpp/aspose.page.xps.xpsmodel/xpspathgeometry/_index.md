---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry class"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry class. Klasse die de eigenschappen van het PathGeometry‑element omvat. Dit element bevat een reeks padfiguren gespecificeerd ofwel met het Figures‑attribuut of met een onderliggend PathFigure‑element in C++."
type: docs
weight: 3200
url: /nl/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Klasse die PathGeometry-eigenschapselementeigenschappen incapsuleert. Dit element bevat een reeks padfiguren gespecificeerd met het Figures-attribuut of met een onderliggend PathFigure-element.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Voegt een padsegment toe aan de lijst met onderliggende segmenten van de laatste padfiguur. |
| [Clone](./clone/)() | Kloont deze padgeometrie. |
| [get_FillRule](./get_fillrule/)() const | Retourneert/instelt de waarde die aangeeft hoe de overlappende gebieden van geometrische vormen worden gecombineerd om een regio te vormen. |
| [get_PathFigures](./get_pathfigures/)() | Retourneert een lijst met onderliggende padfiguren. |
| [get_Transform](./get_transform/)() override | Retourneert/instelt de affiene transformatiematrix die de lokale matrixtransformatie vastlegt die wordt toegepast op alle onderliggende en afgeleide elementen van de padgeometrie voordat deze wordt gebruikt voor vullen, bijsnijden of tekenen. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Voegt een padsegment in de lijst met onderliggende segmenten van de laatste padfiguur in op *index* positie. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Verwijdert een padsegment uit de lijst met onderliggende segmenten van de laatste padfiguur. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Verwijdert een padsegment uit de lijst met onderliggende segmenten van de laatste padfiguur op *index* positie. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Retourneert/instelt de waarde die aangeeft hoe de overlappende gebieden van geometrische vormen worden gecombineerd om een regio te vormen. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Retourneert/instelt de affiene transformatiematrix die de lokale matrixtransformatie vastlegt die wordt toegepast op alle onderliggende en afgeleide elementen van de padgeometrie voordat deze wordt gebruikt voor vullen, bijsnijden of tekenen. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |
## Zie ook

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
