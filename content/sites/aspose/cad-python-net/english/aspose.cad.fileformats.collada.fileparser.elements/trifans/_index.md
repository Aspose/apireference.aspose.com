---
title: Trifans class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 1190
url: /aspose.cad.fileformats.collada.fileparser.elements/trifans/
is_root: false
---

## Trifans class

The TRIFANS.
The TRIFANS element provides the information needed to bind vertex attributes together and then organize those vertices into connected triangles.
Each triangle described by the mesh has three vertices.
The first triangle is formed from first, second, and third vertices.
Each subsequent triangle is formed from the current vertex, reusing the first and the previous vertices.



**Inheritance:** [`Trifans`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/trifans) → 
[`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)



The Trifans type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/trifans/__init__/#) | Constructs a new instance of Trifans |


### Properties
| Property | Description |
| :- | :- |
| [input](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/trifans/input) | Gets or sets the input.<br/>The input element may occur any number of times.<br/>This input is a local input with the offset and set attributes |
| [primitives](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/trifans/primitives) | Gets or sets the primitives.<br/>The TRIFANS element may have any number of primitives elements. |
| [extra](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/trifans/extra) | Gets or sets the extra. |
| [name](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/trifans/name) | Gets or sets the name.<br/>The name attribute is the text string name of this element.<br/>Optional attribute. |
| [count](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/trifans/count) | Gets or sets the count.<br/>The count attribute indicates the number of triangle fan primitives.<br/>Required attribute. |
| [material](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/trifans/material) | Gets or sets the material.<br/>The material attribute declares a symbol for a material.<br/>This symbol is bound to a material at the time of instantiation.<br/>If the material attribute is not specified then the lighting and shading results are application defined.<br/>Optional attribute |



### See Also
* module [`aspose.cad.fileformats.collada.fileparser.elements`](..)
* class [`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)
* class [`Trifans`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/trifans)
