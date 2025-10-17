---
title: decode method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.render/itexturedecoder/decode/
is_root: false
---

## decode(self, stream, reverse_y) {#io.RawIOBase-bool}

Decode texture from stream, return null if failed to decode.


### Returns 


Decoded texture data or null if not supported.


```python

def decode(self, stream, reverse_y):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | Texture data source stream |
| reverse_y | bool | Flip the texture |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed to read data from stream |





### See Also
* module [`aspose.threed.render`](../../)
* class [`ITextureDecoder`](/3d/python-net/aspose.threed.render/itexturedecoder)
* class [`TextureData`](/3d/python-net/aspose.threed.render/texturedata)
