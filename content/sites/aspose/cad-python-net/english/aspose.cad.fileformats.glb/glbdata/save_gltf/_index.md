---
title: save_gltf method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 260
url: /python-net/aspose.cad.fileformats.glb/glbdata/save_gltf/
is_root: false
---

## save_gltf {#str-aspose.cad.fileformats.glb.WriteSettings}

Writes this [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) to a file in GLTF format.



```python
def save_gltf(self, file_path, settings):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | A valid file path to write to. |
| settings | [`WriteSettings`](/cad/python-net/aspose.cad.fileformats.glb/writesettings) | Optional settings. |
### Remarks

Satellite files like buffers and images are also saved with the file name formatted as "FILE_{Index}.EXT".

## save_gltf {#io.RawIOBase-io.RawIOBase-io.RawIOBase-str-aspose.cad.fileformats.glb.WriteSettings}





```python
def save_gltf(self, stream, gltf_stream, bin_stream, name, settings):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase |  |
| gltf_stream | io.RawIOBase |  |
| bin_stream | io.RawIOBase |  |
| name | str |  |
| settings | [`WriteSettings`](/cad/python-net/aspose.cad.fileformats.glb/writesettings) |  |



### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
