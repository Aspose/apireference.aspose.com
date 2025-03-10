---
title: IRenderTexture class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.threed.render/irendertexture/
is_root: false
---

## IRenderTexture class

The interface of render texture



The IRenderTexture type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [targets](/3d/python-net/aspose.threed.render/irendertexture/targets) | Color output targets. |
| [depth_texture](/3d/python-net/aspose.threed.render/irendertexture/depth_texture) | Depth buffer texture |
| [size](/3d/python-net/aspose.threed.render/irendertexture/size) | Gets or sets the size of the render target. |
| [viewports](/3d/python-net/aspose.threed.render/irendertexture/viewports) | Gets all viewports that associated with this render target. |


### Methods
| Method | Description |
| :- | :- |
| [`create_viewport(self, camera, background_color, rect)`](/3d/python-net/aspose.threed.render/irendertexture/create_viewport/#aspose.threed.entities.camera-aspose.threed.utilities.vector3-aspose.threed.utilities.relativerectangle) | Create a viewport with specified background color and position/size in specified camera perspective. |
| [`create_viewport(self, camera, rect)`](/3d/python-net/aspose.threed.render/irendertexture/create_viewport/#aspose.threed.entities.camera-aspose.threed.utilities.relativerectangle) | Create a viewport with position/size in specified camera perspective. |
| [`create_viewport(self, camera)`](/3d/python-net/aspose.threed.render/irendertexture/create_viewport/#aspose.threed.entities.camera) | Create a viewport in specified camera perspective. |



### See Also
* module [`aspose.threed.render`](..)
* class [`IRenderTarget`](/3d/python-net/aspose.threed.render/irendertarget)
