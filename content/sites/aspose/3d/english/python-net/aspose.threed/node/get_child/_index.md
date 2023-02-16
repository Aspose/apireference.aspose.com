---
title: get_child method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.threed/node/get_child/
is_root: false
---

## get_child(index) {#int}

Gets the child node at specified index.


### Returns 


The child.


```python
def get_child(self, index):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Index. |

### Example 


The following code shows how to get a child node at specified index.

```python
from aspose.threed import Scene

scene = Scene.from_file("input.fbx")
node = scene.root_node.get_child(0)
print(f"The first node of the file is {node.name}")

```


## get_child(node_name) {#str}

Gets the child node with the specified name


### Returns 


The child.


```python
def get_child(self, node_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node_name | str | The child name to find. |

### Example 


The following code shows how to get a child node with specified name

```python
from aspose.threed import Scene

scene = Scene.from_file("input.fbx")
node = scene.root_node.get_child("box")
print(f"The box node's translation is {node.transform.translation}")

```



### See Also
* module [`aspose.threed`](../../)
* class [`Node`](/3d/python-net/aspose.threed/node)
