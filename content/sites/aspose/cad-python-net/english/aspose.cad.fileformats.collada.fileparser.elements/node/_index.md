---
title: Node class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 730
url: /aspose.cad.fileformats.collada.fileparser.elements/node/
is_root: false
---

## Node class

The node.
Nodes embody the hierarchical relationship of elements in the scene.



**Inheritance:** [`Node`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node) → 
[`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)



The Node type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/__init__/#) | Initializes a new instance of the [`Node`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node) class. |


### Properties
| Property | Description |
| :- | :- |
| [asset](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/asset) | Gets or sets the asset.<br/>The node element may contain an asset element. |
| [transform_items](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/transform_items) | Gets or sets the transformation items. |
| [instance_camera](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/instance_camera) | Gets or sets the instance camera.<br/>The node element may instance any number of camera objects. |
| [instance_geometry](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/instance_geometry) | Gets or sets the instance geometry.<br/>The node element may instance any number of geometry objects. |
| [instance_light](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/instance_light) | Gets or sets the instance light.<br/>The node element may instance any number of light objects. |
| [instance_node](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/instance_node) | Gets or sets the instance node.<br/>The node element may instance any number of node elements or hierarchies objects. |
| [nodes](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/nodes) | Gets or sets the nodes.<br/>The node element may be hierarchical and be the parent of any number of other node elements. |
| [extra](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/extra) | Gets or sets the extra.<br/>The extra element may appear any number of times. |
| [id](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/id) | Gets or sets the id.<br/>The id attribute is a text string containing the unique identifier of this element.<br/>This value must be unique within the instance document.<br/>Optional attribute. |
| [name](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/name) | Gets or sets the name.<br/>The name attribute is the text string name of this element.<br/>Optional attribute. |
| [sid](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/sid) | Gets or sets the sid.<br/>The sid attribute is a text string value containing the sub-identifier of this element.<br/>This value must be unique within the scope of the parent element.Optional attribute. |
| [type](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/type) | Gets or sets the node type.<br/>The type attribute indicates the type of the node element.<br/>The default value is "NODE".<br/>Optional attribute. |
| [layer](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node/layer) | Gets or sets the layer.<br/>The layer attribute indicates the names of the layers to which this node belongs.<br/>For example, a value of "foreground glowing" indicates that this node belongs to both the 'foreground' layer and the 'glowing' layer.<br/>The default value is empty, indicating that the node doesn't belong to any layer.<br/>Optional attribute. |



### See Also
* module [`aspose.cad.fileformats.collada.fileparser.elements`](..)
* class [`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)
* class [`Node`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/node)
