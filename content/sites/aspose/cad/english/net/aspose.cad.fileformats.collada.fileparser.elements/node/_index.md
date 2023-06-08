---
title: Class Node
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.Node class. The node. Nodes embody the hierarchical relationship of elements in the scene
type: docs
weight: 7900
url: /net/aspose.cad.fileformats.collada.fileparser.elements/node/
---
## Node class

The node. Nodes embody the hierarchical relationship of elements in the scene.

```csharp
public class Node : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [Node](node/)() | Initializes a new instance of the `Node` class. |

## Properties

| Name | Description |
| --- | --- |
| [Asset](../../aspose.cad.fileformats.collada.fileparser.elements/node/asset/) { get; set; } | Gets or sets the asset. The node element may contain an asset element. |
| [Extra](../../aspose.cad.fileformats.collada.fileparser.elements/node/extra/) { get; set; } | Gets or sets the extra. The extra element may appear any number of times. |
| [Id](../../aspose.cad.fileformats.collada.fileparser.elements/node/id/) { get; set; } | Gets or sets the id. The id attribute is a text string containing the unique identifier of this element. This value must be unique within the instance document. Optional attribute. |
| [InstanceCamera](../../aspose.cad.fileformats.collada.fileparser.elements/node/instancecamera/) { get; set; } | Gets or sets the instance camera. The node element may instance any number of camera objects. |
| [InstanceGeometry](../../aspose.cad.fileformats.collada.fileparser.elements/node/instancegeometry/) { get; set; } | Gets or sets the instance geometry. The node element may instance any number of geometry objects. |
| [InstanceLight](../../aspose.cad.fileformats.collada.fileparser.elements/node/instancelight/) { get; set; } | Gets or sets the instance light. The node element may instance any number of light objects. |
| [InstanceNode](../../aspose.cad.fileformats.collada.fileparser.elements/node/instancenode/) { get; set; } | Gets or sets the instance node. The node element may instance any number of node elements or hierarchies objects. |
| [Layer](../../aspose.cad.fileformats.collada.fileparser.elements/node/layer/) { get; set; } | Gets or sets the layer. The layer attribute indicates the names of the layers to which this node belongs. For example, a value of "foreground glowing" indicates that this node belongs to both the 'foreground' layer and the 'glowing' layer. The default value is empty, indicating that the node doesn't belong to any layer. Optional attribute. |
| [Name](../../aspose.cad.fileformats.collada.fileparser.elements/node/name/) { get; set; } | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [Nodes](../../aspose.cad.fileformats.collada.fileparser.elements/node/nodes/) { get; set; } | Gets or sets the nodes. The node element may be hierarchical and be the parent of any number of other node elements. |
| [Sid](../../aspose.cad.fileformats.collada.fileparser.elements/node/sid/) { get; set; } | Gets or sets the sid. The sid attribute is a text string value containing the sub-identifier of this element. This value must be unique within the scope of the parent element.Optional attribute. |
| [TransformItems](../../aspose.cad.fileformats.collada.fileparser.elements/node/transformitems/) { get; set; } | Gets or sets the transformation items. |
| [Type](../../aspose.cad.fileformats.collada.fileparser.elements/node/type/) { get; set; } | Gets or sets the node type. The type attribute indicates the type of the node element. The default value is "NODE". Optional attribute. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


