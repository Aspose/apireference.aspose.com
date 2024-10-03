---
title: Aspose::Page::Font::DrFont class
linktitle: DrFont
second_title: Aspose.Page for C++
description: 'Aspose::Page::Font::DrFont class. Use this class instead of GDI+ Font in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.font/drfont/
---
## DrFont class


Use this class instead of GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determines whether the specified [System::Object](../../system/object/), is equal to this instance. |
| [get_AscentLis](./get_ascentlis/)() | Cell ascent of this font (lis). This is a vertical distance from cell top to cell baseline. |
| [get_AscentPoints](./get_ascentpoints/)() | Returns the cell ascent in points. |
| [get_CellHeightLis](./get_cellheightlis/)() | Returns cell height of this font (lis). This is a shortcut for [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Shortcut for [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Cell descent of this font (lis). This is a vertical distance from cell bottom to cell baseline. |
| [get_DescentPoints](./get_descentpoints/)() | Returns the cell descent in points. |
| [get_FamilyName](./get_familyname/)() | Gets name of this font. |
| [get_IsBold](./get_isbold/)() | Gets a value indicating whether this instance is bold. |
| [get_IsItalic](./get_isitalic/)() | Gets a value indicating whether this instance is italic. |
| [get_LeadingLis](./get_leadinglis/)() | Returns leading of this font (lis). This is a shortcut for [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Returns leading of this font (lis). This is a shortcut for [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Returns cell spacing of this font (lis). This is a vertical distance between baselines of the two glyphs. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Returns cell spacing of this font (points). This is a vertical distance between baselines of the two glyphs. |
| [get_SizePoints](./get_sizepoints/)() | Gets size of this font (points). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Gets the font capitals. |
| [get_Style](./get_style/)() | Gets the true type font. |
| [get_StyleEx](./get_styleex/)() | This property contains additional information about font's style. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Gets the char width lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Returns width of the character (points). |
| [GetHashCode](./gethashcode/)() const override | Returns a hash code for this instance. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Returns measurement text box of the text in points. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Gets the text width lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Gets the text width points. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Gets the text width points. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Returns True for "Microsoft Sans Serif" font. This one is poorly rendered by GDI+. See Test286 and Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Replace font content. |
| [set_SizePoints](./set_sizepoints/)(float) | Gets size of this font (points). |
| [set_StyleEx](./set_styleex/)(int16_t) | This property contains additional information about font's style. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
