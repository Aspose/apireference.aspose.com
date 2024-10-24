---
title: Aspose::Page::XPS::XpsModel::XpsGlyphs class
linktitle: XpsGlyphs
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsGlyphs class. Class incapsulating Glyphs element features. This element represents a run of uniformly-formatted text from a single font. It provides information necessary for accurate rendering and supports search and selection features in viewing consumers in C++.'
type: docs
weight: 1500
url: /cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Class incapsulating Glyphs element features. This element represents a run of uniformly-formatted text from a single font. It provides information necessary for accurate rendering and supports search and selection features in viewing consumers.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Methods

| Method | Description |
| --- | --- |
| [Clone](./clone/)() | Clone this glyphs. |
| [get_BidiLevel](./get_bidilevel/)() const | Returns/sets the value specifying the Unicode algorithm bidirectional nesting level. Even values imply left-to-right layout, odd values imply right-to-left layout. Right-to-left layout places the run origin at the right side of the first glyph, with positive advance widths (representing advances to the left) placing subsequent glyphs to the left of the previous glyph. |
| [get_Fill](./get_fill/)() | Returns/sets the brush used to fill the shape of the rendered glyphs. |
| [get_Font](./get_font/)() | Returns font resource for the [TrueType](../../aspose.truetype/) font used to typeset elements text. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | Returns/sets the font size in drawing surface units, expressed as a float in units of the effective coordinate space. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | Returns/sets the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph. |
| [get_OriginX](./get_originx/)() const | Returns/sets the x coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [get_OriginY](./get_originy/)() const | Returns/sets the y coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [get_StyleSimulations](./get_stylesimulations/)() const | Returns/sets the value specifying a style simulation. |
| [get_UnicodeString](./get_unicodestring/)() const | Returns/sets the string of text rendered by the Glyphs element. The text is specified as Unicode code points. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Returns/sets the value specifying the Unicode algorithm bidirectional nesting level. Even values imply left-to-right layout, odd values imply right-to-left layout. Right-to-left layout places the run origin at the right side of the first glyph, with positive advance widths (representing advances to the left) placing subsequent glyphs to the left of the previous glyph. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Returns/sets the brush used to fill the shape of the rendered glyphs. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | Returns/sets the font size in drawing surface units, expressed as a float in units of the effective coordinate space. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | Returns/sets the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph. |
| [set_OriginX](./set_originx/)(float) | Returns/sets the x coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [set_OriginY](./set_originy/)(float) | Returns/sets the y coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | Returns/sets the value specifying a style simulation. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Returns/sets the string of text rendered by the Glyphs element. The text is specified as Unicode code points. |
## See Also

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
