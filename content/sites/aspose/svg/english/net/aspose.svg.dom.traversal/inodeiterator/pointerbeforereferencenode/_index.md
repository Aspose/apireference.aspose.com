---
title: INodeIterator.PointerBeforeReferenceNode
second_title: Aspose.SVG for .NET API Reference
description: INodeIterator PointerBeforeReferenceNode property. The value of this flag determines whether the children of entity reference nodes are visible to the iterator. If false they and their descendants will be rejected. Note that this rejection takes precedence over whatToShow and the filter. Also note that this is currently the only situation where NodeIterators may reject a complete subtree rather than skipping individual nodes. To produce a view of the document that has entity references expanded and does not expose the entity reference node itself use the whatToShow flags to hide the entity reference node and set expandEntityReferences to true when creating the iterator. To produce a view of the document that has entity reference nodes but no entity expansion use the whatToShow flags to show the entity reference node and set expandEntityReferences to false
type: docs
weight: 10
url: /net/aspose.svg.dom.traversal/inodeiterator/pointerbeforereferencenode/
---
## INodeIterator.PointerBeforeReferenceNode property

The value of this flag determines whether the children of entity reference nodes are visible to the iterator. If false, they and their descendants will be rejected. Note that this rejection takes precedence over whatToShow and the filter. Also note that this is currently the only situation where NodeIterators may reject a complete subtree rather than skipping individual nodes. To produce a view of the document that has entity references expanded and does not expose the entity reference node itself, use the whatToShow flags to hide the entity reference node and set expandEntityReferences to true when creating the iterator. To produce a view of the document that has entity reference nodes but no entity expansion, use the whatToShow flags to show the entity reference node and set expandEntityReferences to false.

```csharp
public bool PointerBeforeReferenceNode { get; }
```

### Property Value

`true` if [expand entity references]; otherwise, `false`.

### See Also

* interface [INodeIterator](../)
* namespace [Aspose.Svg.Dom.Traversal](../../../aspose.svg.dom.traversal/)
* assembly [Aspose.SVG](../../../)
