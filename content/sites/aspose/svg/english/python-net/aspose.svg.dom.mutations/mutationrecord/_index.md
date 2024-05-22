---
title: MutationRecord class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.svg.dom.mutations/mutationrecord/
is_root: false
---

## MutationRecord class

A MutationRecord represents an individual DOM mutation. It is the object that is passed to [`MutationObserver`](/svg/python-net/aspose.svg.dom.mutations/mutationobserver)'s MutationCallback.



**Inheritance:** [`MutationRecord`](/svg/python-net/aspose.svg.dom.mutations/mutationrecord) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The MutationRecord type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [type](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/type) | Returns "attributes" if it was an attribute mutation, "characterData" if it was a mutation to a CharacterData node and "childList" if it was a mutation to the tree of nodes. |
| [target](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/target) | Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed. |
| [added_nodes](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/added_nodes) | Return the nodes added. |
| [removed_nodes](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/removed_nodes) | Return the nodes removed. |
| [previous_sibling](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/previous_sibling) | Returns the previous sibling of the added or removed nodes, or null. |
| [next_sibling](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/next_sibling) | Return the next sibling of the added or removed nodes, or null. |
| [attribute_name](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/attribute_name) | Returns the local name of the changed attribute, and null otherwise. |
| [attribute_namespace](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/attribute_namespace) | Returns the namespace of the changed attribute, and null otherwise. |
| [old_value](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/old_value) | The return value depends on type. For "attributes", it is the value of the changed attribute before the change.<br/>For "characterData", it is the data of the changed node before the change.<br/>For "childList", it is null. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](/svg/python-net/aspose.svg.dom.mutations/mutationrecord/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |



### See Also
* module [`aspose.svg.dom.mutations`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`MutationObserver`](/svg/python-net/aspose.svg.dom.mutations/mutationobserver)
* class [`MutationRecord`](/svg/python-net/aspose.svg.dom.mutations/mutationrecord)
