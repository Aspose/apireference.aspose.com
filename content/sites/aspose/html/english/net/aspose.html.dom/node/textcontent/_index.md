---
title: Node.TextContent
second_title: Aspose.HTML for .NET API Reference
description: Node TextContent property. The textContent property of the Node interface represents the text content of the node and its descendants
type: docs
weight: 160
url: /net/aspose.html.dom/node/textcontent/
---
## Node.TextContent property

The textContent property of the [`Node`](../) interface represents the text content of the node and its descendants.

```csharp
public virtual string TextContent { get; set; }
```

### Property Value

A string, or null. Its value depends on the situation:

If the node is a document or a doctype, textContent returns null.Note: To get all of the text and CDATA data for the whole document, use document.documentElement.textContent.If the node is a CDATA section, a comment, a processing instruction, or a text node, textContent returns, or sets, the text inside the node, i.e., the [`Node.nodeValue`](../nodevalue/).For other node types, textContent returns the concatenation of the textContent of every child node, excluding comments and processing instructions.

## Remarks

Reference:

[DOM Standard](https://dom.spec.whatwg.org/) - defines a platform-neutral model for events, aborting activities, and node trees.[DOM Standard (DOM) # dom-node-textcontent](https://dom.spec.whatwg.org/#dom-node-textcontent).[GitHub](https://github.com/whatwg/dom) - repository hosts the DOM Standard.

### See Also

* class [Node](../)
* namespace [Aspose.Html.Dom](../../../aspose.html.dom/)
* assembly [Aspose.HTML](../../../)
