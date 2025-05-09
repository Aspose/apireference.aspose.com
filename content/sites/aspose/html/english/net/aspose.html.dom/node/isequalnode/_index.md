---
title: Node.IsEqualNode
second_title: Aspose.HTML for .NET API Reference
description: Node IsEqualNode method. The isEqualNode method of the Node interface tests whether two nodes are equal. Two nodes are equal when they have the same type defining characteristics for elements this would be their ID number of children and so forth its attributes match and so on. The specific set of data points that must match varies depending on the types of the nodes
type: docs
weight: 220
url: /net/aspose.html.dom/node/isequalnode/
---
## Node.IsEqualNode method

The isEqualNode() method of the [`Node`](../) interface tests whether two nodes are equal. Two nodes are equal when they have the same type, defining characteristics (for elements, this would be their ID, number of children, and so forth), its attributes match, and so on. The specific set of data points that must match varies depending on the types of the nodes.

```csharp
public bool IsEqualNode(Node otherNode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| otherNode | Node | The [`Node`](../) to compare equality with. |

### Return Value

A boolean value that is true if the two nodes are equals, or false if not. If otherNode is null, isEqualNode() always return false.

### See Also

* class [Node](../)
* namespace [Aspose.Html.Dom](../../../aspose.html.dom/)
* assembly [Aspose.HTML](../../../)
