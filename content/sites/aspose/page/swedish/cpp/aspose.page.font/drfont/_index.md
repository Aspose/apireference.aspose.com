---
title: "Aspose::Page::Font::DrFont klass"
linktitle: "DrFont"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::Font::DrFont klass. Använd denna klass istället för GDI+ Font i C++."
type: docs
weight: 100
url: /sv/cpp/aspose.page.font/drfont/
---
## DrFont class


Använd denna klass istället för GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestämmer om det angivna [System::Object](../../system/object/) är lika med den här instansen. |
| [get_AscentLis](./get_ascentlis/)() | Cellhöjning för detta teckensnitt (lis). Detta är ett vertikalt avstånd från cellens topp till cellens baslinje. |
| [get_AscentPoints](./get_ascentpoints/)() | Returnerar cellens uppstigning i punkter. |
| [get_CellHeightLis](./get_cellheightlis/)() | Returnerar cellhöjden för detta teckensnitt (lis). Detta är en genväg för [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Genväg för [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Cellnedstigning för detta teckensnitt (lis). Detta är ett vertikalt avstånd från cellens botten till cellens baslinje. |
| [get_DescentPoints](./get_descentpoints/)() | Returnerar cellnedstigningen i punkter. |
| [get_FamilyName](./get_familyname/)() | Hämtar namnet på detta teckensnitt. |
| [get_IsBold](./get_isbold/)() | Hämtar ett värde som indikerar om detta objekt är fetstil. |
| [get_IsItalic](./get_isitalic/)() | Hämtar ett värde som indikerar om detta objekt är kursiv. |
| [get_LeadingLis](./get_leadinglis/)() | Returnerar ledning för detta teckensnitt (lis). Detta är en genväg för [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Returnerar ledning för detta teckensnitt (lis). Detta är en genväg för [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Returnerar cellavståndet för detta teckensnitt (lis). Detta är ett vertikalt avstånd mellan baslinjerna för de två glyferna. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Returnerar cellavståndet för detta teckensnitt (punkter). Detta är ett vertikalt avstånd mellan baslinjerna för de två glyferna. |
| [get_SizePoints](./get_sizepoints/)() | Hämtar storleken på detta teckensnitt (punkter). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Hämtar teckensnittets versaler. |
| [get_Style](./get_style/)() | Hämtar TrueType-teckensnittet. |
| [get_StyleEx](./get_styleex/)() | Denna egenskap innehåller ytterligare information om teckensnittets stil. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Hämtar teckenbredden lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Returnerar bredden på tecknet (punkter). |
| [GetHashCode](./gethashcode/)() const override | Returnerar en hash‑kod för denna instans. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Returnerar mätning av textrutan för texten i punkter. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Hämtar textbredden lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Hämtar textbredden i punkter. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Hämtar textbredden i punkter. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Returnerar True för teckensnittet "Microsoft Sans Serif". Detta renderas dåligt av GDI+. Se Test286 och Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Ersätt teckensnittsinhållet. |
| [set_SizePoints](./set_sizepoints/)(float) | Hämtar storleken på detta teckensnitt (punkter). |
| [set_StyleEx](./set_styleex/)(int16_t) | Denna egenskap innehåller ytterligare information om teckensnittets stil. |
## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
