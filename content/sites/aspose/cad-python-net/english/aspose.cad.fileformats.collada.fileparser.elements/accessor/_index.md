---
title: Accessor class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /aspose.cad.fileformats.collada.fileparser.elements/accessor/
is_root: false
---

## Accessor class

The accessor.
The accessor element declares an access pattern to one of the array elements:
FLOAT_ARRAY, INT_ARRAY, NAME_ARRAY, BOOL_ARRAY, TOKEN_ARRAY, and IDREF_ARRAY.
The accessor element describes access to arrays that are organized in either an interleaved or non-interleaved manner,
depending on the offset and stride attributes.



**Inheritance:** [`Accessor`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/accessor) → 
[`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)



The Accessor type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/accessor/__init__/#) | Initializes a new instance of the [`Accessor`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/accessor) class. |


### Properties
| Property | Description |
| :- | :- |
| [parameter](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/accessor/parameter) | Gets or sets the parameter.<br/>The accessor element may have any number of parameter elements. |
| [count](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/accessor/count) | Gets or sets the count.<br/>The count attribute indicates the number of times the array is accessed.<br/>Required attribute. |
| [offset](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/accessor/offset) | Gets or sets the offset.<br/>The offset attribute indicates the index of the first value to be read from the array.<br/>The default value is 0.<br/>Optional attribute. |
| [source](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/accessor/source) | Gets or sets the source.<br/>The source attribute indicates the location of the array to access using a URL expression.<br/>Required attribute. |
| [stride](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/accessor/stride) | Gets or sets the stride.<br/>The stride attribute indicates number of values to be considered a unit during each access to the array.<br/>The default value is 1, indicating that a single value is accessed.<br/>Optional attribute. |



### See Also
* module [`aspose.cad.fileformats.collada.fileparser.elements`](..)
* class [`Accessor`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/accessor)
* class [`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)
