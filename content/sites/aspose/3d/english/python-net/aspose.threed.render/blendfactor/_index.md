---
title: BlendFactor enumeration
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 390
url: /python-net/aspose.threed.render/blendfactor/
is_root: false
---

## BlendFactor enumeration

Blend factor specify pixel arithmetic.



The BlendFactor type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| ZERO | The blend factor is vec4(0) |
| ONE | The blend factor is vec4(1) |
| SRC_COLOR | The blend factor is src.rgba |
| ONE_MINUS_SRC_COLOR | The blend factor is vec4(1) - src.rgba |
| DST_COLOR | The blend factor is dst.rgba |
| ONE_MINUS_DST_COLOR | The blend factor is vec4(1) - dst.rgba |
| SRC_ALPHA | The blend factor is vec4(src.a) |
| ONE_MINUS_SRC_ALPHA | The blend factor is vec4(1 - src.a) |
| DST_ALPHA | The blend factor is vec4(dst.a) |
| ONE_MINUS_DST_ALPHA | The blend factor is vec4(1 - dst.a) |
| CONSTANT_COLOR | The blend factor is c where c is specified in [RenderState.blend_color](/3d/python-net/aspose.threed.render/renderstate#blend_color) |
| ONE_MINUS_CONSTANT_COLOR | The blend factor is vec4(1) - c where c is specified in [RenderState.blend_color](/3d/python-net/aspose.threed.render/renderstate#blend_color) |
| CONSTANT_ALPHA | The blend factor is vec4(c.a) where c is specified in [RenderState.blend_color](/3d/python-net/aspose.threed.render/renderstate#blend_color) |
| ONE_MINUS_CONSTANT_ALPHA | The blend factor is vec4(1 - c.a) where c is specified in [RenderState.blend_color](/3d/python-net/aspose.threed.render/renderstate#blend_color) |
| SRC_ALPHA_SATURATE | The blend factor is min(src.a, 1 - dst.a) |



### See Also
* module [aspose.threed.render](..)
