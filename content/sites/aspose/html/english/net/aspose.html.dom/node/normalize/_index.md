---
title: Node.Normalize
second_title: Aspose.HTML for .NET API Reference
description: Node Normalize method. Puts all Text nodes in the full depth of the sub-tree underneath this Node including attribute nodes into a normal form where only structure e.g. elements comments processing instructions CDATA sections and entity references separates Text nodes i.e. there are neither adjacent Text nodes nor empty Text nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded and is useful when operations such as XPointer XPointer lookups that depend on a particular document tree structure are to be used. If the parameter normalize-characters of the DOMConfiguration object attached to the Node.ownerDocument is true this method will also fully normalize the characters of the Text nodes
type: docs
weight: 260
url: /net/aspose.html.dom/node/normalize/
---
## Node.Normalize method

Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text nodes nor empty Text nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded, and is useful when operations (such as XPointer [XPointer] lookups) that depend on a particular document tree structure are to be used. If the parameter "normalize-characters" of the DOMConfiguration object attached to the Node.ownerDocument is true, this method will also fully normalize the characters of the Text nodes.

```csharp
public void Normalize()
```

### See Also

* class [Node](../)
* namespace [Aspose.Html.Dom](../../../aspose.html.dom/)
* assembly [Aspose.HTML](../../../)
