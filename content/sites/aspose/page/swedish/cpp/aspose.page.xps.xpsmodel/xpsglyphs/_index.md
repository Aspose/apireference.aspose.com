---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs klass"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs klass. Klass som kapslar in funktioner för Glyphs-elementet. Detta element representerar en sekvens av enhetligt formaterad text från ett enda typsnitt. Det tillhandahåller information som behövs för korrekt rendering och stödjer sök- och markeringsfunktioner i visningsklienter i C++."
type: docs
weight: 1500
url: /sv/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Klass som kapslar in Glyphs-elementfunktioner. Detta element representerar en sekvens av enhetligt formaterad text från ett enda teckensnitt. Det tillhandahåller information som behövs för exakt rendering och stödjer sök- och markeringsfunktioner i visningsprogram.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() | Klona dessa glyfer. |
| [get_BidiLevel](./get_bidilevel/)() const | Returnerar/sätter värdet som specificerar Unicode-algoritmens bidi-nestningsnivå. Jämna värden innebär vänster-till-höger layout, udda värden innebär höger-till-vänster layout. Höger-till-vänster layout placerar sekvensens ursprung på högra sidan av den första glyfen, med positiva framstegsbredder (som representerar framsteg åt vänster) som placerar efterföljande glyfer till vänster om föregående glyf. |
| [get_Fill](./get_fill/)() | Returnerar/sätter penseln som används för att fylla formen på de renderade glyferna. |
| [get_Font](./get_font/)() | Returnerar typsnittresurs för **TrueType**-typsnittet som används för att sätta elementens text. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | Returnerar/sätter typsnittsstorleken i enheter för ritningsytan, uttryckt som ett flyttal i enheter av det effektiva koordinatrymmet. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | Returnerar/anger värdet som indikerar att en glyf är vriden på sidan, där ursprunget definieras som den övre mitten av den icke-vridna glyfen. |
| [get_OriginX](./get_originx/)() const | Returnerar/anger x-koordinaten för den första glyfen i sekvensen, i enheter av det effektiva koordinatrymmet. |
| [get_OriginY](./get_originy/)() const | Returnerar/anger y-koordinaten för den första glyfen i sekvensen, i enheter av det effektiva koordinatrymmet. |
| [get_StyleSimulations](./get_stylesimulations/)() const | Returnerar/anger värdet som specificerar en stil-simulation. |
| [get_UnicodeString](./get_unicodestring/)() const | Returnerar/anger textsträngen som renderas av Glyphs-elementet. Texten specificeras som Unicode-kodpunkter. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Returnerar/sätter värdet som specificerar Unicode-algoritmens bidi-nestningsnivå. Jämna värden innebär vänster-till-höger layout, udda värden innebär höger-till-vänster layout. Höger-till-vänster layout placerar sekvensens ursprung på högra sidan av den första glyfen, med positiva framstegsbredder (som representerar framsteg åt vänster) som placerar efterföljande glyfer till vänster om föregående glyf. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Returnerar/sätter penseln som används för att fylla formen på de renderade glyferna. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | Returnerar/sätter typsnittsstorleken i enheter för ritningsytan, uttryckt som ett flyttal i enheter av det effektiva koordinatrymmet. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | Returnerar/anger värdet som indikerar att en glyf är vriden på sidan, där ursprunget definieras som den övre mitten av den icke-vridna glyfen. |
| [set_OriginX](./set_originx/)(float) | Returnerar/anger x-koordinaten för den första glyfen i sekvensen, i enheter av det effektiva koordinatrymmet. |
| [set_OriginY](./set_originy/)(float) | Returnerar/anger y-koordinaten för den första glyfen i sekvensen, i enheter av det effektiva koordinatrymmet. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | Returnerar/anger värdet som specificerar en stil-simulation. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Returnerar/anger textsträngen som renderas av Glyphs-elementet. Texten specificeras som Unicode-kodpunkter. |
## Se även

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
