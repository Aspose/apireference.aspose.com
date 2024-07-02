---
title: encode method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.formats/dracoformat/encode/
is_root: false
---

## encode {#aspose.threed.Entity-aspose.threed.formats.DracoSaveOptions}

Encode the entity to Draco raw data


### Returns 


The encoded draco data represented in bytes


```python
def encode(self, entity, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | [`Entity`](/3d/python-net/aspose.threed/entity) | The entity to be encoded |
| options | [`DracoSaveOptions`](/3d/python-net/aspose.threed.formats/dracosaveoptions) | Extra options for encoding the point cloud |


## encode {#aspose.threed.Entity-io.RawIOBase-aspose.threed.formats.DracoSaveOptions}

Encode the entity to specified stream



```python
def encode(self, entity, stream, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | [`Entity`](/3d/python-net/aspose.threed/entity) | The entity to be encoded |
| stream | io.RawIOBase | The stream that encoded data will be written to |
| options | [`DracoSaveOptions`](/3d/python-net/aspose.threed.formats/dracosaveoptions) | Extra options for encoding the point cloud |


## encode {#aspose.threed.Entity-str-aspose.threed.formats.DracoSaveOptions}

Encode the entity to specified file



```python
def encode(self, entity, file_name, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | [`Entity`](/3d/python-net/aspose.threed/entity) | The entity to be encoded |
| file_name | str | The file name to be written |
| options | [`DracoSaveOptions`](/3d/python-net/aspose.threed.formats/dracosaveoptions) | Extra options for encoding the point cloud |



### See Also
* module [`aspose.threed.formats`](../../)
* class [`DracoFormat`](/3d/python-net/aspose.threed.formats/dracoformat)
