---
title: "Aspose::Page::Font::DrFont klasse"
linktitle: "DrFont"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::Font::DrFont klasse. Gebruik deze klasse in plaats van GDI+ Font in C++."
type: docs
weight: 100
url: /nl/cpp/aspose.page.font/drfont/
---
## DrFont class


Gebruik deze klasse in plaats van GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bepaalt of het opgegeven [System::Object](../../system/object/) gelijk is aan deze instantie. |
| [get_AscentLis](./get_ascentlis/)() | Celstijging van dit lettertype (lis). Dit is een verticale afstand van de celbovenkant tot de celbasislijn. |
| [get_AscentPoints](./get_ascentpoints/)() | Retourneert de celstijging in punten. |
| [get_CellHeightLis](./get_cellheightlis/)() | Retourneert de celhoogte van dit lettertype (lis). Dit is een snelkoppeling voor [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Snelkoppeling voor [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Cel-afloop van dit lettertype (lis). Dit is een verticale afstand van de onderkant van de cel tot de basislijn van de cel. |
| [get_DescentPoints](./get_descentpoints/)() | Retourneert de cel-afloop in punten. |
| [get_FamilyName](./get_familyname/)() | Haalt de naam van dit lettertype op. |
| [get_IsBold](./get_isbold/)() | Haalt een waarde op die aangeeft of deze instantie vetgedrukt is. |
| [get_IsItalic](./get_isitalic/)() | Haalt een waarde op die aangeeft of deze instantie cursief is. |
| [get_LeadingLis](./get_leadinglis/)() | Retourneert de leading van dit lettertype (lis). Dit is een snelkoppeling voor [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Retourneert de leading van dit lettertype (lis). Dit is een snelkoppeling voor [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Retourneert de celafstand van dit lettertype (lis). Dit is een verticale afstand tussen de basislijnen van de twee glyphs. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Retourneert de celafstand van dit lettertype (punten). Dit is een verticale afstand tussen de basislijnen van de twee glyphs. |
| [get_SizePoints](./get_sizepoints/)() | Haalt de grootte van dit lettertype op (punten). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Haalt de hoofdletters van het lettertype op. |
| [get_Style](./get_style/)() | Haalt het TrueType-lettertype op. |
| [get_StyleEx](./get_styleex/)() | Deze eigenschap bevat aanvullende informatie over de stijl van het lettertype. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Haalt de tekenbreedte (lis) op. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Retourneert de breedte van het teken (punten). |
| [GetHashCode](./gethashcode/)() const override | Retourneert een hashcode voor deze instantie. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Retourneert de meettekstvak van de tekst in punten. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Haalt de tekstbreedte (lis) op. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Haalt de tekstbreedte op in punten. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Haalt de tekstbreedte op in punten. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Retourneert True voor het "Microsoft Sans Serif"-lettertype. Deze wordt slecht weergegeven door GDI+. Zie Test286 en Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Vervang de lettertype-inhoud. |
| [set_SizePoints](./set_sizepoints/)(float) | Haalt de grootte van dit lettertype op (punten). |
| [set_StyleEx](./set_styleex/)(int16_t) | Deze eigenschap bevat aanvullende informatie over de stijl van het lettertype. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
