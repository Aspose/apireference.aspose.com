---
title: use_scene method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 310
url: /python-net/aspose.cad.fileformats.glb/glbdata/use_scene/
is_root: false
---

## use_scene {#int}

Creates or reuses a [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene) instance
at [`GlbData.logical_scenes`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_scenes).


### Returns 


A [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene) instance.


```python
def use_scene(self, index):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| index | int | The zero-based index of the [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene) in [`GlbData.logical_scenes`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_scenes). |


## use_scene {#str}

Creates or reuses a [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene) instance that has the
same `name` at [`GlbData.logical_scenes`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_scenes).


### Returns 


A [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene) instance.


```python
def use_scene(self, name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| name | str | The name of the instance. |



### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
* class [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene)
