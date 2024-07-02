---
title: bind method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.render/descriptorsetupdater/bind/
is_root: false
---

## bind {#aspose.threed.render.IBuffer}

Bind the entire buffer to current descriptor


### Returns 


Return current instance for chaining operation


```python
def bind(self, buffer):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| buffer | [`IBuffer`](/3d/python-net/aspose.threed.render/ibuffer) |  |


## bind {#aspose.threed.render.ITextureUnit}

Bind the texture unit to current descriptor set


### Returns 


Return current instance for chaining operation


```python
def bind(self, texture):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| texture | [`ITextureUnit`](/3d/python-net/aspose.threed.render/itextureunit) | The texture unit to bind |


## bind {#int-aspose.threed.render.IBuffer}

Bind the buffer to current descriptor set at specified binding location.


### Returns 


Return current instance for chaining operation


```python
def bind(self, binding, buffer):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| binding | int | Binding location |
| buffer | [`IBuffer`](/3d/python-net/aspose.threed.render/ibuffer) | The entire buffer to bind |


## bind {#int-aspose.threed.render.ITextureUnit}

Bind the texture unit to current descriptor set


### Returns 


Return current instance for chaining operation


```python
def bind(self, binding, texture):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| binding | int | The binding location |
| texture | [`ITextureUnit`](/3d/python-net/aspose.threed.render/itextureunit) | The texture unit to bind |


## bind {#aspose.threed.render.IBuffer-int-int}

Bind the buffer to current descriptor set


### Returns 


Return current instance for chaining operation


```python
def bind(self, buffer, offset, size):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| buffer | [`IBuffer`](/3d/python-net/aspose.threed.render/ibuffer) | Which buffer to bind |
| offset | int | Offset of the buffer to bind |
| size | int | Size of the buffer to bind |


## bind {#int-aspose.threed.render.IBuffer-int-int}

Bind the buffer to current descriptor set at specified binding location.


### Returns 


Return current instance for chaining operation


```python
def bind(self, binding, buffer, offset, size):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| binding | int | Binding location |
| buffer | [`IBuffer`](/3d/python-net/aspose.threed.render/ibuffer) | The buffer to bind |
| offset | int | Offset of the buffer to bind |
| size | int | Size of the buffer to bind |



### See Also
* module [`aspose.threed.render`](../../)
* class [`DescriptorSetUpdater`](/3d/python-net/aspose.threed.render/descriptorsetupdater)
