---
title: Node.SelectObjects
second_title: Aspose.3D for .NET API Reference
description: Node method. Select multiple objects under current node using XPathlike query syntax
type: docs
weight: 230
url: /net/aspose.threed/node/selectobjects/
---
## Node.SelectObjects method

Select multiple objects under current node using XPath-like query syntax.

```csharp
public List<object> SelectObjects(string path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | The XPath-like query |

### Return Value

Multiple object matches the XPath-like query.

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
//select objects that has type Camera or name is 'light' whatever it's located.
var objects = s.RootNode.SelectObjects("//*[(@Type = 'Camera') or (@Name = 'light')]");
```

### See Also

* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)


