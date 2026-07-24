---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs class"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs class. Klasse die de kenmerken van het Glyphs-element incapsuleert. Dit element vertegenwoordigt een reeks uniform opgemaakte tekst uit één lettertype. Het biedt de informatie die nodig is voor nauwkeurige weergave en ondersteunt zoek- en selectiefuncties in weergave-consumenten in C++."
type: docs
weight: 1500
url: /nl/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Klasse die Glyphs-elementeigenschappen incapsuleert. Dit element vertegenwoordigt een reeks uniform opgemaakte tekst van één lettertype. Het biedt de nodige informatie voor nauwkeurige weergave en ondersteunt zoek- en selectiefuncties in weergaveconsumenten.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Kloon deze glyphs. |
| [get_BidiLevel](./get_bidilevel/)() const | Geeft/zet de waarde die het Unicode-algoritme‑niveau voor bidirectionele nesting specificeert. Even waarden impliceren een lay-out van links‑naar‑rechts, oneven waarden impliceren een lay-out van rechts‑naar‑links. Een lay-out van rechts‑naar‑links plaatst de beginpositie van de reeks aan de rechterkant van het eerste glyph, waarbij positieve voortschrijdende breedtes (die naar links gaan) de volgende glyphs links van het vorige glyph plaatsen. |
| [get_Fill](./get_fill/)() | Geeft/zet de penseel die wordt gebruikt om de vorm van de gerenderde glyphs te vullen. |
| [get_Font](./get_font/)() | Geeft font‑resource voor het **TrueType**‑lettertype dat wordt gebruikt om de tekst van elementen te zetten. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | Geeft/zet de lettergrootte in eenheden van het tekenoppervlak, uitgedrukt als een float in eenheden van de effectieve coördinatenruimte. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | Geeft/zet de waarde die aangeeft dat een glyph op zijn kant is gedraaid, waarbij de oorsprong wordt gedefinieerd als het bovenste midden van het niet‑gedraaide glyph. |
| [get_OriginX](./get_originx/)() const | Geeft/zet de x‑coördinaat van het eerste glyph in de reeks, in eenheden van de effectieve coördinatenruimte. |
| [get_OriginY](./get_originy/)() const | Geeft/zet de y‑coördinaat van het eerste glyph in de reeks, in eenheden van de effectieve coördinatenruimte. |
| [get_StyleSimulations](./get_stylesimulations/)() const | Geeft/zet de waarde die een stijl‑simulatie specificeert. |
| [get_UnicodeString](./get_unicodestring/)() const | Geeft/zet de tekenreeks van tekst die door het Glyphs‑element wordt gerenderd. De tekst wordt gespecificeerd als Unicode‑codepunten. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Geeft/zet de waarde die het Unicode-algoritme‑niveau voor bidirectionele nesting specificeert. Even waarden impliceren een lay-out van links‑naar‑rechts, oneven waarden impliceren een lay-out van rechts‑naar‑links. Een lay-out van rechts‑naar‑links plaatst de beginpositie van de reeks aan de rechterkant van het eerste glyph, waarbij positieve voortschrijdende breedtes (die naar links gaan) de volgende glyphs links van het vorige glyph plaatsen. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Geeft/zet de penseel die wordt gebruikt om de vorm van de gerenderde glyphs te vullen. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | Geeft/zet de lettergrootte in eenheden van het tekenoppervlak, uitgedrukt als een float in eenheden van de effectieve coördinatenruimte. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | Geeft/zet de waarde die aangeeft dat een glyph op zijn kant is gedraaid, waarbij de oorsprong wordt gedefinieerd als het bovenste midden van het niet‑gedraaide glyph. |
| [set_OriginX](./set_originx/)(float) | Geeft/zet de x‑coördinaat van het eerste glyph in de reeks, in eenheden van de effectieve coördinatenruimte. |
| [set_OriginY](./set_originy/)(float) | Geeft/zet de y‑coördinaat van het eerste glyph in de reeks, in eenheden van de effectieve coördinatenruimte. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | Geeft/zet de waarde die een stijl‑simulatie specificeert. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Geeft/zet de tekenreeks van tekst die door het Glyphs‑element wordt gerenderd. De tekst wordt gespecificeerd als Unicode‑codepunten. |
## Zie ook

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
