---
title: XpsPath class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 250
url: /python-net/aspose.page.xps.xpsmodel/xpspath/
---

## XpsPath class

Class incapsulating Path element features.<br/>            This element is the sole means of adding vector graphics and images to a fixed page.<br/>            It defines a single vector graphic to be rendered on a page.

**Inheritance:** `XpsPath` → [`XpsContentElement`](/page/python-net/aspose.page.xps.xpsmodel/xpscontentelement) → [`XpsHyperlinkElement`](/page/python-net/aspose.page.xps.xpsmodel/xpshyperlinkelement) → [`XpsElement`](/page/python-net/aspose.page.xps.xpsmodel/xpselement) → [`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)

The XpsPath type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `count` | Returns number of child elements. |
| `hyperlink_target` | Returns/sets hyperlink target object. |
| `render_transform` | Returns/sets the affine transformation matrix establishing a new coordinate frame<br/>            for all attributes of the element and for all child elements (if any). |
| `clip` | Returns/sets the path geometry instance limiting the rendered region of the element. |
| `opacity` | Returns/sets the value defining the uniform transparency of the element. |
| `opacity_mask` | Returns/sets the brush specifying a mask of alpha values<br/>            that is applied to the element in the same fashion as the Opacity attribute,<br/>            but allowing different alpha values for different areas of the element. |
| `fill` | Returns/sets the brush used to paint the geometry specified<br/>            by the Data property of the path. |
| `data` | Returns/sets the geometry of the path. |
| `stroke` | Returns/sets the brush used to draw the stroke. |
| `stroke_dash_array` | Returns/sets the array specifying the length of dashes and gaps of the outline stroke. |
| `stroke_dash_cap` | Returns/sets the value specifying how the ends of each dash are drawn. |
| `stroke_dash_offset` | Returns/sets the start point for repeating the dash array pattern.<br/>            If this value is omitted, the dash array aligns with the origin of the stroke. |
| `stroke_start_line_cap` | Returns/sets the value defining the shape of the beginning of the first dash in a stroke. |
| `stroke_end_line_cap` | Returns/sets the value defining the shape of the end of the last dash in a stroke. |
| `stroke_line_join` | Returns/sets the value defining the shape of the beginning of the first dash in a stroke. |
| `stroke_miter_limit` | Returns/sets the ratio between the maximum miter length and half of the stroke thickness.<br/>            This value is significant only if the |
| `stroke_thickness` | Returns/sets the thickness of a stroke, in units of<br/>            the effective coordinate space (includes the path's render transform).<br/>            The stroke is drawn on top of the boundary of the geometry specified<br/>            by the Path element’s Data property. Half of the StrokeThickness extends<br/>            outside of the geometry specified by the Data property and the other half<br/>            extends inside of the geometry. |
## Indexer
| Name | Description |
| :- | :- |
| `[index]` | Returns an item at the specified index. |
## Methods
| Name | Description |
| :- | :- |
| `clone()` | Clones this path. |

### See Also

* module [`aspose.page.xps.xpsmodel`](/page/python-net/aspose.page.xps.xpsmodel/)
* package [`aspose.page`](/page/python-net/)

