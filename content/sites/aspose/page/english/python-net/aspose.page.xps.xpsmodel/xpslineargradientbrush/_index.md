---
title: XpsLinearGradientBrush class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 200
url: /python-net/aspose.page.xps.xpsmodel/xpslineargradientbrush/
---

## XpsLinearGradientBrush class

Class incapsulating LinearGradientBrush property element features.<br/>            This element is used to specify a linear gradient brush along a vector.

**Inheritance:** `XpsLinearGradientBrush` → [`XpsGradientBrush`](/page/python-net/aspose.page.xps.xpsmodel/xpsgradientbrush) → [`XpsTransformableBrush`](/page/python-net/aspose.page.xps.xpsmodel/xpstransformablebrush) → [`XpsBrush`](/page/python-net/aspose.page.xps.xpsmodel/xpsbrush) → [`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)

The XpsLinearGradientBrush type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `opacity` | Returns/sets value defining the uniform transparency of the brush fill. |
| `transform` | Returns/sets the matrix transformation applied to the coordinate space of the brush.<br/>            The Transform property is concatenated with the current effective render transform<br/>            to yield an effective render transform local to the brush. The viewport for the brush<br/>            is transformed using the local effective render transform. |
| `gradient_stops` | Returns/sets list of gradient stops that comprise the gradient. |
| `color_interpolation_mode` | Returns/sets value specifying the gamma function for color interpolation. The gamma adjustment<br/>            should not be applied to the alpha component, if specified. |
| `spread_method` | Returns/sets value describing how the brush should fill the content area outside of the primary,<br/>            initial gradient area. |
| `start_point` | Returns/sets the starting point of the linear gradient. |
| `end_point` | Returns/sets the end point of the linear gradient. |
## Methods
| Name | Description |
| :- | :- |
| `clone()` | Clones this linear gradient brush. |

### See Also

* module [`aspose.page.xps.xpsmodel`](/page/python-net/aspose.page.xps.xpsmodel/)
* package [`aspose.page`](/page/python-net/)

