---
title: of method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.entities/booleanoperand/of/
is_root: false
---

## of(, node) {#aspose.threed.Node}

Construct a [`BooleanOperand`](/3d/python-net/aspose.threed.entities/booleanoperand) instance from a node, a valid entity implemented [`IMeshConvertible`](/3d/python-net/aspose.threed.entities/imeshconvertible) is required


### Returns 


An instance of [`BooleanOperand`](/3d/python-net/aspose.threed.entities/booleanoperand)


```python

@staticmethod
def of(node):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | aspose.threed.Node | A [`Node`](/3d/python-net/aspose.threed/node) instance with a valid entity implemented [`IMeshConvertible`](/3d/python-net/aspose.threed.entities/imeshconvertible) |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentNullException | Raised when `node` is null. |
| InvalidOperationException | Raised when no entity implemented [`IMeshConvertible`](/3d/python-net/aspose.threed.entities/imeshconvertible) found under this node |




## of(, mesh) {#aspose.threed.Entity}

Construct a [`BooleanOperand`](/3d/python-net/aspose.threed.entities/booleanoperand) instance from a bare [`IMeshConvertible`](/3d/python-net/aspose.threed.entities/imeshconvertible) instance.


### Returns 


An instance of [`BooleanOperand`](/3d/python-net/aspose.threed.entities/booleanoperand)


```python

@staticmethod
def of(mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mesh | aspose.threed.Entity | The mesh used as Boolean operation's operand, it can bean instance of [`IMeshConvertible`](/3d/python-net/aspose.threed.entities/imeshconvertible) or [`HalfSpace`](/3d/python-net/aspose.threed.entities/halfspace) |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentNullException | Raised when `mesh` is null. |




## of(, mesh, transform) {#aspose.threed.Entity-System.Nullable`1[[Aspose.ThreeD.Utilities.Matrix4]]}





```python

@staticmethod
def of(mesh, transform):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mesh | aspose.threed.Entity |  |
| transform | System.Nullable`1[[Aspose.ThreeD.Utilities.Matrix4]] |  |



### See Also
* module [`aspose.threed.entities`](../../)
* class [`BooleanOperand`](/3d/python-net/aspose.threed.entities/booleanoperand)
* class [`HalfSpace`](/3d/python-net/aspose.threed.entities/halfspace)
* class [`IMeshConvertible`](/3d/python-net/aspose.threed.entities/imeshconvertible)
* class [`Node`](/3d/python-net/aspose.threed/node)
