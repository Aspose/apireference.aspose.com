---
title: InputLocalOffset class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 460
url: /aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/
is_root: false
---

## InputLocalOffset class

The input local offset.
The input_local_offset_type element is used to represent indexed inputs that can only reference resources declared in the same document.



**Inheritance:** [`InputLocalOffset`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset) → 
[`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)



The InputLocalOffset type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/__init__/#) | Constructs a new instance of InputLocalOffset |


### Properties
| Property | Description |
| :- | :- |
| [offset](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/offset) | Gets or sets the offset.<br/>The offset attribute represents the offset into the list of indices.<br/>If two input elements share the same offset, they will be indexed the same.<br/>This works as a simple form of compression for the list of indices as well as defining the order the inputs should be used in.<br/>Required attribute. |
| [semantic](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/semantic) | Gets or sets the semantic.<br/>The semantic attribute is the user-defined meaning of the input connection.<br/>Required attribute. |
| [source](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/source) | Gets or sets the source.<br/>The source attribute indicates the location of the data source.<br/>Required attribute. |
| [single_set](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/single_set) | Gets or sets the single set.<br/>The set attribute indicates which inputs should be grouped together as a single set.<br/>This is helpful when multiple inputs share the same semantics. |
| [set_specified](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/set_specified) | Gets or sets a value indicating whether set specified. |



### See Also
* module [`aspose.cad.fileformats.collada.fileparser.elements`](..)
* class [`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)
* class [`InputLocalOffset`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset)
