---
title: XpsImageBrush class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 190
url: /python-net/aspose.page.xps.xpsmodel/xpsimagebrush/
---

## XpsImageBrush class

Class incapsulating ImageBrush property element features.<br/>            This element is used to fill a region with an image.

**Inheritance:** `XpsImageBrush` → [`XpsTilingBrush`](/page/python-net/aspose.page.xps.xpsmodel/xpstilingbrush) → [`XpsTransformableBrush`](/page/python-net/aspose.page.xps.xpsmodel/xpstransformablebrush) → [`XpsBrush`](/page/python-net/aspose.page.xps.xpsmodel/xpsbrush) → [`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)

The XpsImageBrush type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `opacity` | Returns/sets value defining the uniform transparency of the brush fill. |
| `transform` | Returns/sets the matrix transformation applied to the coordinate space of the brush.<br/>            The Transform property is concatenated with the current effective render transform<br/>            to yield an effective render transform local to the brush. The viewport for the brush<br/>            is transformed using the local effective render transform. |
| `viewbox` | Returns/sets the region of the source content of the brush that is to be mapped to the viewport. |
| `viewport` | Returns/sets the position and dimensions of the first brush tile. Subsequent tiles are positioned<br/>            relative to this tile, as specified by the tile mode. |
| `tile_mode` | Returns/sets value specifying how tiling is performed in the filled geometry. |
| `image_source` | Returns the URI of an image resource. |
| `image` | Returns image resource used to for the brush. |
## Methods
| Name | Description |
| :- | :- |
| `clone()` | Clones this image brush. |

### See Also

* module [`aspose.page.xps.xpsmodel`](/page/python-net/aspose.page.xps.xpsmodel/)
* package [`aspose.page`](/page/python-net/)

