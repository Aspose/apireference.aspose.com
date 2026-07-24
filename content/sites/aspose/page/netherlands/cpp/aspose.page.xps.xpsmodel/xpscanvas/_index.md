---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas klasse"
linktitle: "XpsCanvas"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas klasse. Klasse die Canvas-elementeigenschappen inkapselt. Dit element groepeert elementen samen. Bijvoorbeeld, Glyphs- en Path-elementen kunnen in een canvas worden gegroepeerd om als één eenheid te worden geïdentificeerd (als een hyperlinkbestemming) of om een samengestelde eigenschapswaarde toe te passen op elk kind- en voorouderelement in C++."
type: docs
weight: 500
url: /nl/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Klasse die Canvas-elementeigenschappen incapsuleert. Dit element groepeert elementen samen. Bijvoorbeeld, Glyphs- en Path-elementen kunnen in een canvas worden gegroepeerd om als een eenheid te worden geïdentificeerd (als een hyperlinkbestemming) of om een samengestelde eigenschapswaarde toe te passen op elk kind- en voorouderelement.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(T) | Voegt een element toe aan de kindlijst van dit canvas. |
| [AddCanvas](./addcanvas/)() | Voegt een nieuw canvas toe aan de kindlijst van dit canvas. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Voegt nieuwe glyphs toe aan de kindlijst van dit canvas. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Voegt een nieuw pad toe aan de kindlijst van dit canvas. |
| [Clone](./clone/)() | Kloont dit canvas. |
| [get_EdgeMode](./get_edgemode/)() const | Retourneert/zet de waarde die bepaalt hoe de randen van paden binnen het canvas worden gerenderd. |
| [Insert](./insert/)(int32_t, T) | Voegt een element in de kindlijst van dit canvas in op positie *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Voegt een nieuw canvas in de kindlijst van dit canvas in op positie *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Voegt nieuwe glyphs in de kindlijst van dit canvas in op positie *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Voegt een nieuw pad toe aan de kindlijst van dit canvas op de *index* positie. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Retourneert/zet de waarde die bepaalt hoe de randen van paden binnen het canvas worden gerenderd. |
## Zie ook

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
