---
title: MutationObserverInit Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.Mutations.MutationObserverInit class. This class represents an options collection which is used to configure MutationObserver
type: docs
weight: 1940
url: /net/aspose.svg.dom.mutations/mutationobserverinit/
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
| [AttributeFilter](../../aspose.svg.dom.mutations/mutationobserverinit/attributefilter/) { get; set; } | Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted. |
| [AttributeOldValue](../../aspose.svg.dom.mutations/mutationobserverinit/attributeoldvalue/) { get; set; } | Set to true if attributes is true or omitted and target’s attribute value before the mutation needs to be recorded. |
| [Attributes](../../aspose.svg.dom.mutations/mutationobserverinit/attributes/) { get; set; } | Set to true if mutations to target’s attributes are to be observed. Can be omitted if attributeOldValue and/or attributeFilter is specified. |
| [CharacterData](../../aspose.svg.dom.mutations/mutationobserverinit/characterdata/) { get; set; } | Set to true if mutations to target’s data are to be observed. Can be omitted if characterDataOldValue is specified |
| [CharacterDataOldValue](../../aspose.svg.dom.mutations/mutationobserverinit/characterdataoldvalue/) { get; set; } | Set to true if characterData is set to true or omitted and target’s data before the mutation needs to be recorded. |
| [ChildList](../../aspose.svg.dom.mutations/mutationobserverinit/childlist/) { get; set; } | Set to true if mutations to target’s children are to be observed. |
| [Count](../../aspose.svg.dom.mutations/mutationobserverinit/count/) { get; } | Gets the number of key/value pairs contained in the `MutationObserverInit` collection. |
| [IsReadOnly](../../aspose.svg.dom.mutations/mutationobserverinit/isreadonly/) { get; } | Determines whether the `MutationObserverInit` collection is mutable. |
| [Item](../../aspose.svg.dom.mutations/mutationobserverinit/item/) { get; set; } | Gets or sets the element with the specified key. |
| [Keys](../../aspose.svg.dom.mutations/mutationobserverinit/keys/) { get; } | Gets a collection containing the keys in the `MutationObserverInit` collection. |
| [Subtree](../../aspose.svg.dom.mutations/mutationobserverinit/subtree/) { get; set; } | Set to true if mutations to not just target, but also target’s descendants are to be observed |
| [Values](../../aspose.svg.dom.mutations/mutationobserverinit/values/) { get; } | Gets a collection containing the values in the `MutationObserverInit` collection. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.svg.dom.mutations/mutationobserverinit/add/#add)(KeyValuePair&lt;string, object&gt;) | Adds an element to the `MutationObserverInit` collection. |
| [Add](../../aspose.svg.dom.mutations/mutationobserverinit/add/#add_1)(string, object) | Adds the specified key and value to the `MutationObserverInit` collection. |
| [Clear](../../aspose.svg.dom.mutations/mutationobserverinit/clear/)() | Removes all the elements from the `MutationObserverInit` collection. |
| [Contains](../../aspose.svg.dom.mutations/mutationobserverinit/contains/)(KeyValuePair&lt;string, object&gt;) | Determines whether the `MutationObserverInit` contain the specified key/value pair. |
| [ContainsKey](../../aspose.svg.dom.mutations/mutationobserverinit/containskey/)(string) | Determines whether the `MutationObserverInit` collection contain a specified key. |
| [CopyTo](../../aspose.svg.dom.mutations/mutationobserverinit/copyto/)(KeyValuePair&lt;string, object&gt;[], int) | Copies the `MutationObserverInit` elements to an existing one-dimensional array, starting at the specified array index. |
| [GetEnumerator](../../aspose.svg.dom.mutations/mutationobserverinit/getenumerator/)() | Returns an enumerator that iterates through the `MutationObserverInit` elements. |
| [Remove](../../aspose.svg.dom.mutations/mutationobserverinit/remove/#remove)(KeyValuePair&lt;string, object&gt;) | Removes the specified key/value pair from the `MutationObserverInit` collection. |
| [Remove](../../aspose.svg.dom.mutations/mutationobserverinit/remove/#remove_1)(string) | Removes the value associated with the specified key from the `MutationObserverInit` collection. |
| [TryGetValue](../../aspose.svg.dom.mutations/mutationobserverinit/trygetvalue/)(string, out object) | Gets the value associated with the specified key. |

### See Also

* namespace [Aspose.Svg.Dom.Mutations](../../aspose.svg.dom.mutations/)
* assembly [Aspose.SVG](../../)
