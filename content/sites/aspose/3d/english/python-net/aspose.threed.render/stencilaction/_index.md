---
title: StencilAction enumeration
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 530
url: /python-net/aspose.threed.render/stencilaction/
is_root: false
---

## StencilAction enumeration

The stencil test actions



The StencilAction type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| KEEP | Keep the current value |
| ZERO | Sets the stencil buffer value to 0 |
| REPLACE | Sets the stencil buffer to ref where defined in [`RenderState.stencil_reference`](/3d/python-net/aspose.threed.render/renderstate#stencil_reference) |
| INCREMENT | Increments the current stencil buffer value, clamps to maximum value. |
| INCREMENT_WRAP | Increments the current stencil buffer value and wrap it to zero when it reaches maximum value. |
| DECREMENT | Increments the current stencil buffer value, clamps to 0. |
| DECREMENT_WRAP | Decrements the current stencil buffer value and wrap it to maximum value when it reaches zero. |
| INVERT | Bit-wise inverts the current stencil buffer value. |



### See Also
* module [`aspose.threed.render`](..)
