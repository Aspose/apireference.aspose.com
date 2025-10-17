---
title: create_child_node method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed/node/create_child_node/
is_root: false
---

## create_child_node(self) {#}

Creates a child node


### Returns 


The new child node.


```python

def create_child_node(self):
    ...
```



### Example 


The following code shows how to create a new child node under root node

```python
from aspose.threed import Scene
from aspose.threed.entities import Box

scene = Scene()
node = scene.root_node.create_child_node()
node.entity = Box()
scene.save("output.fbx")

```


## create_child_node(self, node_name) {#System.String}

Create a new child node with given node name


### Returns 


The new child node.


```python

def create_child_node(self, node_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node_name | System.String | The new child node's name |

### Example 


The following code shows how to create a new child node under root node

```python
from aspose.threed import Scene
from aspose.threed.entities import Box

scene = Scene()
node = scene.root_node.create_child_node("new node")
node.entity = Box()
scene.save("output.fbx")

```


## create_child_node(self, entity) {#aspose.threed.Entity}

Create a new child node with given entity attached


### Returns 


The new child node.


```python

def create_child_node(self, entity):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | aspose.threed.Entity | Default entity attached to the node |

### Example 


The following code shows how to create a new child node under root node

```python
from aspose.threed import Scene
from aspose.threed.entities import Box

scene = Scene()
node = scene.root_node.create_child_node(Box())
scene.save("output.fbx")

```


## create_child_node(self, node_name, entity) {#System.String-aspose.threed.Entity}

Create a new child node with given node name


### Returns 


The new child node.


```python

def create_child_node(self, node_name, entity):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node_name | System.String | The new child node's name |
| entity | aspose.threed.Entity | Default entity attached to the node |


## create_child_node(self, node_name, entity, material) {#System.String-aspose.threed.Entity-aspose.threed.shading.Material}

Create a new child node with given node name, and attach specified entity and a material


### Returns 


The new child node.


```python

def create_child_node(self, node_name, entity, material):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node_name | System.String | The new child node's name |
| entity | aspose.threed.Entity | Default entity attached to the node |
| material | aspose.threed.shading.Material | The material attached to the node |



### See Also
* module [`aspose.threed`](../../)
* class [`Node`](/3d/python-net/aspose.threed/node)
