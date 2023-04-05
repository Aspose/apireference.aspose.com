---
title: Class DrFont
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.Font.DrFont klass. Använd den här klassen istället för GDI Font
type: docs
weight: 220
url: /sv/net/aspose.page.font/drfont/
---
## DrFont class

Använd den här klassen istället för GDI+ Font

```csharp
public class DrFont
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AscentLis](../../aspose.page.font/drfont/ascentlis/) { get; } | Celluppstigning för detta teckensnitt (lis). Detta är ett vertikalt avstånd från cellöverkant till cellbaslinje. |
| [AscentPoints](../../aspose.page.font/drfont/ascentpoints/) { get; } | Returnerar cellstigningen i poäng. |
| [CellHeightLis](../../aspose.page.font/drfont/cellheightlis/) { get; } | Returnerar cellhöjden för detta teckensnitt (lis). Detta är en genväg för[`AscentLis`](./ascentlis/) +[`DescentLis`](./descentlis/) . |
| [CellHeightPoints](../../aspose.page.font/drfont/cellheightpoints/) { get; } | Genväg för[`AscentPoints`](./ascentpoints/) +[`DescentPoints`](./descentpoints/) . |
| [DescentLis](../../aspose.page.font/drfont/descentlis/) { get; } | Cellnedstigning för detta teckensnitt (lis). Detta är ett vertikalt avstånd från cellbotten till cellbaslinje. |
| [DescentPoints](../../aspose.page.font/drfont/descentpoints/) { get; } | Returnerar cellnedgången i poäng. |
| [FamilyName](../../aspose.page.font/drfont/familyname/) { get; } | Får namnet på detta teckensnitt. |
| [IsBold](../../aspose.page.font/drfont/isbold/) { get; } | Får ett värde som anger om denna instans är fetstil. |
| [IsItalic](../../aspose.page.font/drfont/isitalic/) { get; } | Får ett värde som anger om denna instans är kursiv. |
| [LeadingLis](../../aspose.page.font/drfont/leadinglis/) { get; } | Returnerar ledande av detta teckensnitt (lis). Detta är en genväg för[`LineSpacingLis`](./linespacinglis/) -[`CellHeightLis`](./cellheightlis/) . |
| [LeadingPoints](../../aspose.page.font/drfont/leadingpoints/) { get; } | Returnerar ledande av detta teckensnitt (lis). Detta är en genväg för[`LineSpacingLis`](./linespacinglis/) -[`CellHeightLis`](./cellheightlis/) . |
| [LineSpacingLis](../../aspose.page.font/drfont/linespacinglis/) { get; } | Returnerar cellavstånd för detta teckensnitt (lis). Detta är ett vertikalt avstånd mellan baslinjerna för de två glyferna. |
| [LineSpacingPoints](../../aspose.page.font/drfont/linespacingpoints/) { get; } | Returnerar cellavstånd för detta teckensnitt (punkter). Detta är ett vertikalt avstånd mellan baslinjerna för de två glyferna. |
| [SizePoints](../../aspose.page.font/drfont/sizepoints/) { get; set; } | Får storleken på detta teckensnitt (poäng). |
| [SmallCapsScaleFactor](../../aspose.page.font/drfont/smallcapsscalefactor/) { get; } | Får skalfaktorn SmallCaps. |
| [Style](../../aspose.page.font/drfont/style/) { get; } | Får stilen på detta teckensnitt. |
| [StyleEx](../../aspose.page.font/drfont/styleex/) { get; set; } | Den här egenskapen innehåller ytterligare information om typsnittets style |

## Metoder

| namn | Beskrivning |
| --- | --- |
| override [Equals](../../aspose.page.font/drfont/equals/)(object) | Bestämmer om den angivnaObject , är lika med denna instans. |
| [GetCharWidthLis](../../aspose.page.font/drfont/getcharwidthlis/)(char) | Hämtar char width lis. |
| [GetCharWidthPoints](../../aspose.page.font/drfont/getcharwidthpoints/)(char) | Returnerar tecknets bredd (punkter). |
| override [GetHashCode](../../aspose.page.font/drfont/gethashcode/)() | Returnerar en hash-kod för denna instans. |
| [GetTextSizePoints](../../aspose.page.font/drfont/gettextsizepoints/)(string) | Returnerar måtttextrutan för texten i poäng. |
| [GetTextWidthLis](../../aspose.page.font/drfont/gettextwidthlis/)(string) | Hämtar textbredden lis. |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints)(string) | Hämtar textbreddpunkterna. |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints_1)(string, int, int) | Hämtar textbreddpunkterna. |
| [Replace](../../aspose.page.font/drfont/replace/)(DrFont) | Ersätt teckensnitt content |
| static [IsPoorlyRenderedByGdiPlus](../../aspose.page.font/drfont/ispoorlyrenderedbygdiplus/)(string) | Returnerar True för "Microsoft Sans Serif"-teckensnitt. Den här är dåligt återgiven av GDI+. Se Test286 och Gemini-6959. |

### Se även

* namnutrymme [Aspose.Page.Font](../../aspose.page.font/)
* hopsättning [Aspose.Page](../../)


