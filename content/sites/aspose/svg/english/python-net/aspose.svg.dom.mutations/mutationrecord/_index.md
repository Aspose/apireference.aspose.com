---
title: MutationRecord class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 30
url: /aspose.svg.dom.mutations/mutationrecord/
is_root: false
---

## MutationRecord class

A MutationRecord represents an individual DOM mutation. It is the object that is passed to [`MutationObserver`](./aspose.svg.dom.mutations/mutationobserver)'s MutationCallback.



**Inheritance:** [`MutationRecord`](./aspose.svg.dom.mutations/mutationrecord) → 
[`DOMObject`](./aspose.svg.dom/domobject)



The MutationRecord type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [type](./aspose.svg.dom.mutations/mutationrecord/type) | Returns "attributes" if it was an attribute mutation, "characterData" if it was a mutation to a CharacterData node and "childList" if it was a mutation to the tree of nodes. |
| [target](./aspose.svg.dom.mutations/mutationrecord/target) | Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed. |
| [added_nodes](./aspose.svg.dom.mutations/mutationrecord/added_nodes) | Return the nodes added. |
| [removed_nodes](./aspose.svg.dom.mutations/mutationrecord/removed_nodes) | Return the nodes removed. |
| [previous_sibling](./aspose.svg.dom.mutations/mutationrecord/previous_sibling) | Returns the previous sibling of the added or removed nodes, or null. |
| [next_sibling](./aspose.svg.dom.mutations/mutationrecord/next_sibling) | Return the next sibling of the added or removed nodes, or null. |
| [attribute_name](./aspose.svg.dom.mutations/mutationrecord/attribute_name) | Returns the local name of the changed attribute, and null otherwise. |
| [attribute_namespace](./aspose.svg.dom.mutations/mutationrecord/attribute_namespace) | Returns the namespace of the changed attribute, and null otherwise. |
| [old_value](./aspose.svg.dom.mutations/mutationrecord/old_value) | The return value depends on type. For "attributes", it is the value of the changed attribute before the change.<br/>For "characterData", it is the data of the changed node before the change.<br/>For "childList", it is null. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](./aspose.svg.dom.mutations/mutationrecord/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |



### See Also
* module [`aspose.svg.dom.mutations`](..)
* class [`DOMObject`](./aspose.svg.dom/domobject)
* class [`MutationObserver`](./aspose.svg.dom.mutations/mutationobserver)
* class [`MutationRecord`](./aspose.svg.dom.mutations/mutationrecord)
