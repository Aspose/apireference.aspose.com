---
title: create_element method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.entities/nurbssurface/create_element/
is_root: false
---

## create_element(self, type) {#aspose.threed.entities.VertexElementType}

Creates a vertex element with specified type and add it to the geometry.


### Returns 


Created element.


```python

def create_element(self, type):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| type | aspose.threed.entities.VertexElementType | Vertex element type |
### Remarks

If type is [`VertexElementType.UV`](/3d/python-net/aspose.threed.entities/vertexelementtype#UV), a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with texture mapping type to [`TextureMapping.DIFFUSE`](/3d/python-net/aspose.threed.entities/texturemapping#DIFFUSE) will be created.

## create_element(self, type, mapping_mode, reference_mode) {#aspose.threed.entities.VertexElementType-aspose.threed.entities.MappingMode-aspose.threed.entities.ReferenceMode}

Creates a vertex element with specified type and add it to the geometry.


### Returns 


Created element.


```python

def create_element(self, type, mapping_mode, reference_mode):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| type | aspose.threed.entities.VertexElementType | Vertex element type |
| mapping_mode | aspose.threed.entities.MappingMode | Default mapping mode |
| reference_mode | aspose.threed.entities.ReferenceMode | Default reference mode |
### Remarks

If type is [`VertexElementType.UV`](/3d/python-net/aspose.threed.entities/vertexelementtype#UV), a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with texture mapping type to [`TextureMapping.DIFFUSE`](/3d/python-net/aspose.threed.entities/texturemapping#DIFFUSE) will be created.


### See Also
* module [`aspose.threed.entities`](../../)
* class [`NurbsSurface`](/3d/python-net/aspose.threed.entities/nurbssurface)
* class [`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement)
* class [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv)
