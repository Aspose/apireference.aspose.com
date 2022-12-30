---
title: Scene constructor
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed/scene/__init__/
is_root: false
---

## Scene() {#}

Initializes a new instance of the [Scene](/3d/python-net/aspose.threed/scene) class.



```python
def __init__(self):
    ...
```




## Scene(entity) {#Entity}

Initializes a new instance of the [Scene](/3d/python-net/aspose.threed/scene) class with an entity attached to a new node.



```python
def __init__(self, entity):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | [Entity](/3d/python-net/aspose.threed/entity) | The initial entity that attached to the scene |


## Scene(file_name) {#str}

Initializes a new instance of the [Scene](/3d/python-net/aspose.threed/scene) class and open the file immediately.
This is an obsoleted constructor, please use [Scene.from_file(file_name)](/3d/python-net/aspose.threed/scene/from_file).



```python
def __init__(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File's name to open. |


## Scene(parent_scene, name) {#Scene-str}

Initializes a new instance of the [Scene](/3d/python-net/aspose.threed/scene) class as a sub-scene.



```python
def __init__(self, parent_scene, name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| parent_scene | [Scene](/3d/python-net/aspose.threed/scene) | The parent scene. |
| name | str | Scene's name. |



### See Also
* module [aspose.threed](../../)
* class [Scene](/3d/python-net/aspose.threed/scene)
