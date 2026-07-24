---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure class"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure class. Klasse die de kenmerken van het PathFigure‑element incapsuleert. Dit element bestaat uit een reeks van één of meer lijn‑ of krommesegmenten in C++."
type: docs
weight: 3100
url: /nl/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


Klasse die PathFigure-elementeigenschappen incapsuleert. Dit element bestaat uit een reeks van één of meer lijn- of krommesegmenten.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Kloont deze padfiguur. |
| [get_IsClosed](./get_isclosed/)() const | Geeft de waarde terug/stelt de waarde in die aangeeft of de padfiguur gesloten is. |
| [get_IsFilled](./get_isfilled/)() const | Geeft de waarde terug/stelt de waarde in die aangeeft of de padfiguur wordt gebruikt bij het berekenen van het gebied van de omvattende padgeometrie. |
| [get_Segments](./get_segments/)() | Retourneer lijst van onderliggende padsegmenten. |
| [get_StartPoint](./get_startpoint/)() const | Geeft het startpunt terug/stelt het startpunt in voor het eerste segment van de padfiguur. |
| [set_IsClosed](./set_isclosed/)(bool) | Geeft de waarde terug/stelt de waarde in die aangeeft of de padfiguur gesloten is. |
| [set_IsFilled](./set_isfilled/)(bool) | Geeft de waarde terug/stelt de waarde in die aangeeft of de padfiguur wordt gebruikt bij het berekenen van het gebied van de omvattende padgeometrie. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | Geeft het startpunt terug/stelt het startpunt in voor het eerste segment van de padfiguur. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |
## Zie ook

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
