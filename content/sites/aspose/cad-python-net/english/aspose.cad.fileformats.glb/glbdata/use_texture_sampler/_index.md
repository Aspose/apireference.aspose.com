---
title: use_texture_sampler method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 330
url: /python-net/aspose.cad.fileformats.glb/glbdata/use_texture_sampler/
is_root: false
---

## use_texture_sampler {#aspose.cad.fileformats.glb.TextureWrapMode-aspose.cad.fileformats.glb.TextureWrapMode-aspose.cad.fileformats.glb.TextureMipMapFilter-aspose.cad.fileformats.glb.TextureInterpolationFilter}

Creates or reuses a [`TextureSampler`](/cad/python-net/aspose.cad.fileformats.glb/texturesampler) instance
at [`GlbData.logical_texture_samplers`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_texture_samplers).


### Returns 


A [`TextureSampler`](/cad/python-net/aspose.cad.fileformats.glb/texturesampler) instance, or null if all the arguments are default values.


```python
def use_texture_sampler(self, ws, wt, min, mag):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| ws | [`TextureWrapMode`](/cad/python-net/aspose.cad.fileformats.glb/texturewrapmode) | The [`TextureWrapMode`](/cad/python-net/aspose.cad.fileformats.glb/texturewrapmode) in the S axis. |
| wt | [`TextureWrapMode`](/cad/python-net/aspose.cad.fileformats.glb/texturewrapmode) | The [`TextureWrapMode`](/cad/python-net/aspose.cad.fileformats.glb/texturewrapmode) in the T axis. |
| min | [`TextureMipMapFilter`](/cad/python-net/aspose.cad.fileformats.glb/texturemipmapfilter) | A value of [`TextureMipMapFilter`](/cad/python-net/aspose.cad.fileformats.glb/texturemipmapfilter). |
| mag | [`TextureInterpolationFilter`](/cad/python-net/aspose.cad.fileformats.glb/textureinterpolationfilter) | A value of [`TextureInterpolationFilter`](/cad/python-net/aspose.cad.fileformats.glb/textureinterpolationfilter). |



### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
* class [`TextureInterpolationFilter`](/cad/python-net/aspose.cad.fileformats.glb/textureinterpolationfilter)
* class [`TextureMipMapFilter`](/cad/python-net/aspose.cad.fileformats.glb/texturemipmapfilter)
* class [`TextureSampler`](/cad/python-net/aspose.cad.fileformats.glb/texturesampler)
* class [`TextureWrapMode`](/cad/python-net/aspose.cad.fileformats.glb/texturewrapmode)
