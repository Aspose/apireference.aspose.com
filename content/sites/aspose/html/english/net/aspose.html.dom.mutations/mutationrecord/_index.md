---
title: MutationRecord Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Mutations.MutationRecord class. A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObservers MutationCallback
type: docs
weight: 1150
url: /net/aspose.html.dom.mutations/mutationrecord/
---
## MutationRecord class

A MutationRecord represents an individual DOM mutation. It is the object that is passed to [`MutationObserver`](../mutationobserver/)'s [`MutationCallback`](../mutationcallback/).

```csharp
public class MutationRecord : DOMObject
```

## Properties

| Name | Description |
| --- | --- |
| [AddedNodes](../../aspose.html.dom.mutations/mutationrecord/addednodes/) { get; } | Return the nodes added. |
| [AttributeName](../../aspose.html.dom.mutations/mutationrecord/attributename/) { get; } | Returns the local name of the changed attribute, and null otherwise. |
| [AttributeNamespace](../../aspose.html.dom.mutations/mutationrecord/attributenamespace/) { get; } | Returns the namespace of the changed attribute, and null otherwise. |
| [NextSibling](../../aspose.html.dom.mutations/mutationrecord/nextsibling/) { get; } | Return the next sibling of the added or removed nodes, or null. |
| [OldValue](../../aspose.html.dom.mutations/mutationrecord/oldvalue/) { get; } | The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null. |
| [PreviousSibling](../../aspose.html.dom.mutations/mutationrecord/previoussibling/) { get; } | Returns the previous sibling of the added or removed nodes, or null. |
| [RemovedNodes](../../aspose.html.dom.mutations/mutationrecord/removednodes/) { get; } | Return the nodes removed. |
| [Target](../../aspose.html.dom.mutations/mutationrecord/target/) { get; } | Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed. |
| [Type](../../aspose.html.dom.mutations/mutationrecord/type/) { get; } | Returns "attributes" if it was an attribute mutation, "characterData" if it was a mutation to a CharacterData node and "childList" if it was a mutation to the tree of nodes. |

## Methods

| Name | Description |
| --- | --- |
| virtual [GetPlatformType](../../aspose.html.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |

### See Also

* class [DOMObject](../../aspose.html.dom/domobject/)
* namespace [Aspose.Html.Dom.Mutations](../../aspose.html.dom.mutations/)
* assembly [Aspose.HTML](../../)
