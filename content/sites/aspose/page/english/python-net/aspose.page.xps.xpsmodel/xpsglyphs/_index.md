---
title: XpsGlyphs class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 110
url: /python-net/aspose.page.xps.xpsmodel/xpsglyphs/
---

## XpsGlyphs class

Class incapsulating Glyphs element features.<br/>            This element represents a run of uniformly-formatted text from a single font.<br/>            It provides information necessary for accurate rendering and supports search<br/>            and selection features in viewing consumers.

**Inheritance:** `XpsGlyphs` → [`XpsContentElement`](/page/python-net/aspose.page.xps.xpsmodel/xpscontentelement) → [`XpsHyperlinkElement`](/page/python-net/aspose.page.xps.xpsmodel/xpshyperlinkelement) → [`XpsElement`](/page/python-net/aspose.page.xps.xpsmodel/xpselement) → [`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)

The XpsGlyphs type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `count` | Returns number of child elements. |
| `hyperlink_target` | Returns/sets hyperlink target object. |
| `render_transform` | Returns/sets the affine transformation matrix establishing a new coordinate frame<br/>            for all attributes of the element and for all child elements (if any). |
| `clip` | Returns/sets the path geometry instance limiting the rendered region of the element. |
| `opacity` | Returns/sets the value defining the uniform transparency of the element. |
| `opacity_mask` | Returns/sets the brush specifying a mask of alpha values<br/>            that is applied to the element in the same fashion as the Opacity attribute,<br/>            but allowing different alpha values for different areas of the element. |
| `bidi_level` | Returns/sets the value specifying the Unicode algorithm bidirectional nesting level.<br/>            Even values imply left-to-right layout, odd values imply right-to-left layout.<br/>            Right-to-left layout places the run origin at the right side of the first glyph,<br/>            with positive advance widths (representing advances to the left) placing subsequent<br/>            glyphs to the left of the previous glyph. |
| `fill` | Returns/sets the brush used to fill the shape of the rendered glyphs. |
| `font` | Returns font resource for the TrueType font used to typeset elements text. |
| `font_rendering_em_size` | Returns/sets the font size in drawing surface units, expressed as a float<br/>            in units of the effective coordinate space. |
| `origin_x` | Returns/sets the x coordinate of the first glyph in the run,<br/>            in units of the effective coordinate space. |
| `origin_y` | Returns/sets the y coordinate of the first glyph in the run,<br/>            in units of the effective coordinate space. |
| `is_sideways` | Returns/sets the value indicating that a glyph is turned on its side,<br/>            with the origin being defined as the top center of the unturned glyph. |
| `unicode_string` | Returns/sets the string of text rendered by the Glyphs element.<br/>            The text is specified as Unicode code points. |
| `style_simulations` | Returns/sets the value specifying a style simulation. |
## Indexer
| Name | Description |
| :- | :- |
| `[index]` | Returns an item at the specified index. |
## Methods
| Name | Description |
| :- | :- |
| `clone()` | Clone this glyphs. |

### See Also

* module [`aspose.page.xps.xpsmodel`](/page/python-net/aspose.page.xps.xpsmodel/)
* package [`aspose.page`](/page/python-net/)

