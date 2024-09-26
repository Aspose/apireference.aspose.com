---
title: XpsCanvas class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 30
url: /python-net/aspose.page.xps.xpsmodel/xpscanvas/
---

## XpsCanvas class

Class incapsulating Canvas element features.<br/>            This element groups elements together. For example, Glyphs and Path elements<br/>            can be grouped in a canvas in order to be identified as a unit (as a hyperlink destination) or<br/>            to apply a composed property value to each child and ancestor element.

**Inheritance:** `XpsCanvas` → [`XpsContentElement`](/page/python-net/aspose.page.xps.xpsmodel/xpscontentelement) → [`XpsHyperlinkElement`](/page/python-net/aspose.page.xps.xpsmodel/xpshyperlinkelement) → [`XpsElement`](/page/python-net/aspose.page.xps.xpsmodel/xpselement) → [`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)

The XpsCanvas type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `count` | Returns number of child elements. |
| `hyperlink_target` | Returns/sets hyperlink target object. |
| `render_transform` | Returns/sets the affine transformation matrix establishing a new coordinate frame<br/>            for all attributes of the element and for all child elements (if any). |
| `clip` | Returns/sets the path geometry instance limiting the rendered region of the element. |
| `opacity` | Returns/sets the value defining the uniform transparency of the element. |
| `opacity_mask` | Returns/sets the brush specifying a mask of alpha values<br/>            that is applied to the element in the same fashion as the Opacity attribute,<br/>            but allowing different alpha values for different areas of the element. |
| `edge_mode` | Returns/sets the value that controls how edges of paths within the canvas are rendered. |
## Indexer
| Name | Description |
| :- | :- |
| `[index]` | Returns an item at the specified index. |
## Methods
| Name | Description |
| :- | :- |
| `add_canvas()` | Adds a new canvas to this canvas's child list. |
| `insert_canvas(index)` | Inserts a new canvas to this canvas's child list at |
| `add_path(data)` | Adds a new path to this canvas's child list. |
| `insert_path(index, data)` | Inserts a new path to this canvas's child list at |
| `add_glyphs(font_family, font_size, font_style, origin_x, origin_y, unicode_string)` | Adds new glyphs to this canvas's child list. |
| `insert_glyphs(index, font_family, font_size, font_style, origin_x, origin_y, unicode_string)` | Inserts new glyphs to this canvas's child list at |
| `clone()` | Clones this canvas. |

### See Also

* module [`aspose.page.xps.xpsmodel`](/page/python-net/aspose.page.xps.xpsmodel/)
* package [`aspose.page`](/page/python-net/)

