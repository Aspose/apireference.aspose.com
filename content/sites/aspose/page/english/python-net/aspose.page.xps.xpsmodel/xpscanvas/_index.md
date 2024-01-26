---
title: XpsCanvas class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.page.xps.xpsmodel/xpscanvas/
is_root: false
---

## XpsCanvas class

Class incapsulating Canvas element features.
This element groups elements together. For example, Glyphs and Path elements
can be grouped in a canvas in order to be identified as a unit (as a hyperlink destination) or
to apply a composed property value to each child and ancestor element.



**Inheritance:** [`XpsCanvas`](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas) → 
[`XpsContentElement`](/page/python-net/aspose.page.xps.xpsmodel/xpscontentelement) → 
[`XpsHyperlinkElement`](/page/python-net/aspose.page.xps.xpsmodel/xpshyperlinkelement) → 
[`XpsElement`](/page/python-net/aspose.page.xps.xpsmodel/xpselement) → 
[`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)



The XpsCanvas type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [count](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/count) | Returns number of child elements. |
| [hyperlink_target](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/hyperlink_target) | Returns/sets hyperlink target object. |
| [render_transform](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/render_transform) | Returns/sets the affine transformation matrix establishing a new coordinate frame<br/>for all attributes of the element and for all child elements (if any). |
| [clip](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/clip) | Returns/sets the path geometry instance limiting the rendered region of the element. |
| [opacity](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/opacity) | Returns/sets the value defining the uniform transparency of the element. |
| [opacity_mask](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/opacity_mask) | Returns/sets the brush specifying a mask of alpha values<br/>that is applied to the element in the same fashion as the Opacity attribute,<br/>but allowing different alpha values for different areas of the element. |
| [edge_mode](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/edge_mode) | Returns/sets the value that controls how edges of paths within the canvas are rendered. |


### Indexer
| Name | Description |
| :- | :- |
| [index] |  |


### Methods
| Method | Description |
| :- | :- |
| [add_canvas](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/add_canvas/#) | Adds a new canvas to this canvas's child list. |
| [insert_canvas](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/insert_canvas/#int) | Inserts a new canvas to this canvas's child list at `index` position. |
| [add_path](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/add_path/#aspose.page.xps.xpsmodel.XpsPathGeometry) | Adds a new path to this canvas's child list. |
| [insert_path](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/insert_path/#int-aspose.page.xps.xpsmodel.XpsPathGeometry) | Inserts a new path to this canvas's child list at `index` position. |
| [add_glyphs](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/add_glyphs/#str-float-aspose.pydrawing.FontStyle-float-float-str) | Adds new glyphs to this canvas's child list. |
| [insert_glyphs](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/insert_glyphs/#int-str-float-aspose.pydrawing.FontStyle-float-float-str) | Inserts new glyphs to this canvas's child list at `index` position. |
| [clone](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas/clone/#) | Clones this canvas. |



### See Also
* module [`aspose.page.xps.xpsmodel`](..)
* class [`XpsCanvas`](/page/python-net/aspose.page.xps.xpsmodel/xpscanvas)
* class [`XpsContentElement`](/page/python-net/aspose.page.xps.xpsmodel/xpscontentelement)
* class [`XpsElement`](/page/python-net/aspose.page.xps.xpsmodel/xpselement)
* class [`XpsHyperlinkElement`](/page/python-net/aspose.page.xps.xpsmodel/xpshyperlinkelement)
* class [`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)
