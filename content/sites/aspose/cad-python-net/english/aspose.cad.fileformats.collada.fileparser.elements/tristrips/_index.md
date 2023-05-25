---
title: Tristrips class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 1200
url: /aspose.cad.fileformats.collada.fileparser.elements/tristrips/
is_root: false
---

## Tristrips class

The TRISTRIPS.
The TRISTRIPS element provides the information needed to bind vertex attributes together and then organize those vertices into connected triangles.
Each triangle described by the mesh has three vertices.
The first triangle is formed from first, second, and third vertices.Each subsequent triangle is formed from the current vertex, reusing the previous two vertices.



**Inheritance:** [`Tristrips`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/tristrips) → 
[`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)



The Tristrips type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/tristrips/__init__/#) | Constructs a new instance of Tristrips |


### Properties
| Property | Description |
| :- | :- |
| [input](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/tristrips/input) | Gets or sets the input.<br/>The input element may occur any number of times.<br/>This input is a local input with the offset and set attributes. |
| [primitives](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/tristrips/primitives) | Gets or sets the primitives.<br/>The TRISTRIPS element may have any number of p elements. |
| [extra](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/tristrips/extra) | Gets or sets the extra. |
| [name](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/tristrips/name) | Gets or sets the name.<br/>The name attribute is the text string name of this element.<br/>Optional attribute. |
| [count](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/tristrips/count) | Gets or sets the count.<br/>The count attribute indicates the number of triangle strip primitives.<br/>Required attribute. |
| [material](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/tristrips/material) | Gets or sets the material.<br/>The material attribute declares a symbol for a material.<br/>This symbol is bound to a material at the time of instantiation.<br/>If the material attribute is not specified then the lighting and shading results are application defined.<br/>Optional attribute. |



### See Also
* module [`aspose.cad.fileformats.collada.fileparser.elements`](..)
* class [`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)
* class [`Tristrips`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/tristrips)
