---
title: Node.SelectSingleObject
second_title: Aspose.3D for .NET API Reference
description: Node method. Select single object under current node using XPathlike query syntax
type: docs
weight: 240
url: /net/aspose.threed/node/selectsingleobject/
---
## Node.SelectSingleObject method

Select single object under current node using XPath-like query syntax.

```csharp
public object SelectSingleObject(string path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | The XPath-like query |

### Return Value

Object located by the XPath-like query.

### Exceptions

| exception | condition |
| --- | --- |
| [ParseException](../../../aspose.threed.utilities/parseexception/) | ParseException will be thrown if the path contains malformed query. |

## Examples

Select a single node using XPath-like expression

```csharp
//Create a scene for testing
Scene s = new Scene();
var a = s.RootNode.CreateChildNode("a");
a.CreateChildNode("a1");
a.CreateChildNode("a2");
s.RootNode.CreateChildNode("b");
var c = s.RootNode.CreateChildNode("c");
c.CreateChildNode("c1").AddEntity(new Camera("cam"));
c.CreateChildNode("c2").AddEntity(new Light("light"));
//Select single camera object under the child nodes of node named 'c' under the root node
var c1 = s.RootNode.SelectSingleObject("/c/*/<Camera>");
// Select node named 'a1' under the root node, even if the 'a1' is not a directly child node of the
var obj = s.RootNode.SelectSingleObject("a1");
//Select the node itself, since the '/' is selected directly on the root node, so the root node is selected.
obj = s.RootNode.SelectSingleObject("/");
```

### See Also

* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)


