---
title: MutationObserverInit Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Mutations.MutationObserverInit class. This class represents an options collection which is used to configure MutationObserver
type: docs
weight: 1140
url: /net/aspose.html.dom.mutations/mutationobserverinit/
---
## MutationObserverInit class

This class represents an options collection which is used to configure [`MutationObserver`](../mutationobserver/).

```csharp
public class MutationObserverInit : IDictionary<string, object>
```

## Constructors

| Name | Description |
| --- | --- |
| [MutationObserverInit](mutationobserverinit/)() | Initializes a new instance of the `MutationObserverInit` class. |

## Properties

| Name | Description |
| --- | --- |
| [AttributeFilter](../../aspose.html.dom.mutations/mutationobserverinit/attributefilter/) { get; set; } | Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted. |
| [AttributeOldValue](../../aspose.html.dom.mutations/mutationobserverinit/attributeoldvalue/) { get; set; } | Set to true if attributes is true or omitted and target’s attribute value before the mutation needs to be recorded. |
| [Attributes](../../aspose.html.dom.mutations/mutationobserverinit/attributes/) { get; set; } | Set to true if mutations to target’s attributes are to be observed. Can be omitted if attributeOldValue and/or attributeFilter is specified. |
| [CharacterData](../../aspose.html.dom.mutations/mutationobserverinit/characterdata/) { get; set; } | Set to true if mutations to target’s data are to be observed. Can be omitted if characterDataOldValue is specified |
| [CharacterDataOldValue](../../aspose.html.dom.mutations/mutationobserverinit/characterdataoldvalue/) { get; set; } | Set to true if characterData is set to true or omitted and target’s data before the mutation needs to be recorded. |
| [ChildList](../../aspose.html.dom.mutations/mutationobserverinit/childlist/) { get; set; } | Set to true if mutations to target’s children are to be observed. |
| [Count](../../aspose.html.dom.mutations/mutationobserverinit/count/) { get; } | Gets the number of key/value pairs contained in the `MutationObserverInit` collection. |
| [IsReadOnly](../../aspose.html.dom.mutations/mutationobserverinit/isreadonly/) { get; } | Determines whether the `MutationObserverInit` collection is mutable. |
| [Item](../../aspose.html.dom.mutations/mutationobserverinit/item/) { get; set; } | Gets or sets the element with the specified key. |
| [Keys](../../aspose.html.dom.mutations/mutationobserverinit/keys/) { get; } | Gets a collection containing the keys in the `MutationObserverInit` collection. |
| [Subtree](../../aspose.html.dom.mutations/mutationobserverinit/subtree/) { get; set; } | Set to true if mutations to not just target, but also target’s descendants are to be observed |
| [Values](../../aspose.html.dom.mutations/mutationobserverinit/values/) { get; } | Gets a collection containing the values in the `MutationObserverInit` collection. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.html.dom.mutations/mutationobserverinit/add/#add)(*KeyValuePair&lt;string, object&gt;*) |  |
| [Add](../../aspose.html.dom.mutations/mutationobserverinit/add/#add_1)(*string, object*) | Adds the specified key and value to the `MutationObserverInit` collection. |
| [Clear](../../aspose.html.dom.mutations/mutationobserverinit/clear/)() | Removes all the elements from the `MutationObserverInit` collection. |
| [Contains](../../aspose.html.dom.mutations/mutationobserverinit/contains/)(*KeyValuePair&lt;string, object&gt;*) |  |
| [ContainsKey](../../aspose.html.dom.mutations/mutationobserverinit/containskey/)(*string*) | Determines whether the `MutationObserverInit` collection contain a specified key. |
| [CopyTo](../../aspose.html.dom.mutations/mutationobserverinit/copyto/)(*KeyValuePair&lt;string, object&gt;[], int*) |  |
| [GetEnumerator](../../aspose.html.dom.mutations/mutationobserverinit/getenumerator/)() | Returns an enumerator that iterates through the `MutationObserverInit` elements. |
| [Remove](../../aspose.html.dom.mutations/mutationobserverinit/remove/#remove)(*KeyValuePair&lt;string, object&gt;*) |  |
| [Remove](../../aspose.html.dom.mutations/mutationobserverinit/remove/#remove_1)(*string*) | Removes the value associated with the specified key from the `MutationObserverInit` collection. |
| [TryGetValue](../../aspose.html.dom.mutations/mutationobserverinit/trygetvalue/)(*string, out object*) | Gets the value associated with the specified key. |

### See Also

* namespace [Aspose.Html.Dom.Mutations](../../aspose.html.dom.mutations/)
* assembly [Aspose.HTML](../../)
