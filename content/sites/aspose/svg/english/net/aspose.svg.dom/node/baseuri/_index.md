---
title: Node.BaseURI
second_title: Aspose.SVG for .NET API Reference
description: Node BaseURI property. Returns the absolute base URL of the document containing the node
type: docs
weight: 10
url: /net/aspose.svg.dom/node/baseuri/
---
## Node.BaseURI property

Returns the absolute base URL of the document containing the node.

The base URL is used to resolve relative URLs when the browser needs to obtain an absolute URL, for example when processing the HTML img element's src attribute or the xlink:href or href attributes in SVG.

```csharp
public virtual string BaseURI { get; }
```

### Property Value

The baseURI getter returns this’s node document’s document base URL, serialized.

## Remarks

Reference:

[DOM Standard](https://dom.spec.whatwg.org/#dom-node-baseuri).

### See Also

* class [Node](../)
* namespace [Aspose.Svg.Dom](../../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../../)
