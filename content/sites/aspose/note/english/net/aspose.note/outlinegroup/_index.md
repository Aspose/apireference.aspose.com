---
title: Class OutlineGroup
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.OutlineGroup class. Represents a OutlineGroup
type: docs
weight: 540
url: /net/aspose.note/outlinegroup/
---
## OutlineGroup class

Represents a OutlineGroup.

```csharp
public sealed class OutlineGroup : IndentatedNode<IOutlineChildNode>, IOutlineChildNode, 
    IOutlineElementChildNode
```

## Constructors

| Name | Description |
| --- | --- |
| [OutlineGroup](outlinegroup/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Document](../../aspose.note/node/document/) { get; } | Gets the document of the node. |
| [FirstChild](../../aspose.note/compositenode-1/firstchild/) { get; } |  |
| [IndentPosition](../../aspose.note/indentatednode-1/indentposition/) { get; set; } |  |
| [IsComposite](../../aspose.note/compositenode-1/iscomposite/) { get; } |  |
| [LastChild](../../aspose.note/compositenode-1/lastchild/) { get; } |  |
| [NextSibling](../../aspose.note/node/nextsibling/) { get; } | Gets the next node at the same node tree level. |
| [NodeType](../../aspose.note/node/nodetype/) { get; } | Gets the node type. |
| [ParentNode](../../aspose.note/node/parentnode/) { get; } | Gets the parent node. |
| [PreviousSibling](../../aspose.note/node/previoussibling/) { get; } | Gets the previous node at the same node tree level. |

## Methods

| Name | Description |
| --- | --- |
| override [Accept](../../aspose.note/outlinegroup/accept/)(DocumentVisitor) | Accepts the visitor of the node. |
| virtual [AppendChildFirst&lt;T1&gt;](../../aspose.note/compositenode-1/appendchildfirst/)(T1) |  |
| virtual [AppendChildLast&lt;T1&gt;](../../aspose.note/compositenode-1/appendchildlast/)(T1) |  |
| override [GetChildNodes&lt;T1&gt;](../../aspose.note/compositenode-1/getchildnodes/)() |  |
| [GetEnumerator](../../aspose.note/compositenode-1/getenumerator/)() |  |
| virtual [InsertChild&lt;T1&gt;](../../aspose.note/compositenode-1/insertchild/)(int, T1) |  |
| [InsertChildrenRange](../../aspose.note/compositenode-1/insertchildrenrange/)(int, IEnumerable&lt;IOutlineChildNode&gt;) |  |
| [InsertChildrenRange](../../aspose.note/compositenode-1/insertchildrenrange/)(int, params IOutlineChildNode[]) |  |
| [RemoveChild&lt;T1&gt;](../../aspose.note/compositenode-1/removechild/)(T1) |  |

### See Also

* class [IndentatedNode&lt;T&gt;](../indentatednode-1/)
* interface [IOutlineChildNode](../ioutlinechildnode/)
* interface [IOutlineElementChildNode](../ioutlineelementchildnode/)
* namespace [Aspose.Note](../../aspose.note/)
* assembly [Aspose.Note](../../)


