---
title: "Aspose::Page::XPS::XpsModel::XpsPath class"
linktitle: "XpsPath"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath class. Klasse die de kenmerken van het Path‑element omvat. Dit element is de enige manier om vectorafbeeldingen en afbeeldingen toe te voegen aan een vaste pagina. Het definieert één enkele vectorafbeelding die op een pagina wordt gerenderd in C++."
type: docs
weight: 3000
url: /nl/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Klasse die Path-elementeigenschappen incapsuleert. Dit element is de enige manier om vectorafbeeldingen en afbeeldingen toe te voegen aan een vaste pagina. Het definieert een enkele vectorafbeelding die op een pagina moet worden gerenderd.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Kopieert dit pad. |
| [get_Data](./get_data/)() | Retourneert/instelt de geometrie van het pad. |
| [get_Fill](./get_fill/)() | Retourneert/instelt de penseel die wordt gebruikt om de geometrie te schilderen die is opgegeven door de Data‑eigenschap van het pad. |
| [get_Stroke](./get_stroke/)() | Retourneert/instelt de penseel die wordt gebruikt om de stroke te tekenen. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | Retourneert/instelt de array die de lengte van streepjes en onderbrekingen van de omtrek‑stroke specificeert. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | Retourneert/instelt de waarde die aangeeft hoe de uiteinden van elk streepje worden getekend. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | Retourneert/instelt het startpunt voor het herhalen van het dash‑array‑patroon. Als deze waarde wordt weggelaten, wordt het dash‑array uitgelijnd met de oorsprong van de stroke. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | Retourneert/instelt de waarde die de vorm van het einde van de laatste dash in een stroke definieert. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | Retourneert/instelt de waarde die de vorm van het begin van de eerste dash in een stroke definieert. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | Retourneert/instelt de verhouding tussen de maximale miter‑lengte en de helft van de stroke‑dikte. Deze waarde is alleen van belang als het **StrokeLineJoin**‑attribuut **Miter** specificeert. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | Retourneert/instelt de waarde die de vorm van het begin van de eerste dash in een stroke definieert. |
| [get_StrokeThickness](./get_strokethickness/)() const | Retourneert/instelt de dikte van een stroke, in eenheden van de effectieve coördinatenruimte (inclusief de render‑transformatie van het pad). De stroke wordt getekend bovenop de grens van de geometrie die is opgegeven door de Data‑eigenschap van het Path‑element. De helft van de StrokeThickness strekt zich uit buiten de geometrie die door de Data‑eigenschap is opgegeven en de andere helft strekt zich uit binnen de geometrie. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | Retourneert/instelt de geometrie van het pad. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Retourneert/instelt de penseel die wordt gebruikt om de geometrie te schilderen die is opgegeven door de Data‑eigenschap van het pad. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | Retourneert/instelt de penseel die wordt gebruikt om de stroke te tekenen. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | Retourneert/instelt de array die de lengte van streepjes en onderbrekingen van de omtrek‑stroke specificeert. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | Retourneert/instelt de waarde die aangeeft hoe de uiteinden van elk streepje worden getekend. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | Retourneert/instelt het startpunt voor het herhalen van het dash‑array‑patroon. Als deze waarde wordt weggelaten, wordt het dash‑array uitgelijnd met de oorsprong van de stroke. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | Retourneert/instelt de waarde die de vorm van het einde van de laatste dash in een stroke definieert. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | Retourneert/instelt de waarde die de vorm van het begin van de eerste dash in een stroke definieert. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | Retourneert/instelt de verhouding tussen de maximale miter‑lengte en de helft van de stroke‑dikte. Deze waarde is alleen van belang als het **StrokeLineJoin**‑attribuut **Miter** specificeert. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | Retourneert/instelt de waarde die de vorm van het begin van de eerste dash in een stroke definieert. |
| [set_StrokeThickness](./set_strokethickness/)(float) | Retourneert/instelt de dikte van een stroke, in eenheden van de effectieve coördinatenruimte (inclusief de render‑transformatie van het pad). De stroke wordt getekend bovenop de grens van de geometrie die is opgegeven door de Data‑eigenschap van het Path‑element. De helft van de StrokeThickness strekt zich uit buiten de geometrie die door de Data‑eigenschap is opgegeven en de andere helft strekt zich uit binnen de geometrie. |
## Zie ook

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
