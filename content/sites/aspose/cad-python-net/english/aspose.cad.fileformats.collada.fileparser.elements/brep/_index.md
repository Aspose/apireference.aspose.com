---
title: Brep class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 90
url: /aspose.cad.fileformats.collada.fileparser.elements/brep/
is_root: false
---

## Brep class

The BREP.
Describes a boundary representation (BREP) structure.



**Inheritance:** [`Brep`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep) → 
[`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)



The Brep type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/__init__/#) | Constructs a new instance of Brep |


### Properties
| Property | Description |
| :- | :- |
| [curves](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/curves) | Gets or sets the curves.<br/>The curves element holds all the curves that are needed for the BREP structure.<br/>Here are the curves that describes the kind of an edge, but here are also the curves that are needed to create a extrusion for a surface.<br/>This element is needed, if the edges element is present. |
| [surface_curves](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/surface_curves) | Gets or sets the surface curves.<br/>Contains all 2D curves used in this B-rep.<br/>This includes surfaces that describe the kind of the face.<br/>This element is required if the faces element is present. |
| [surfaces](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/surfaces) | Gets or sets the surfaces.<br/>The surfaces element holds all the surfaces that are needed for the BREP structure.<br/>Here are the surfaces that describes the kind of a face.<br/>This element is needed, if the faces element is present. |
| [source](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/source) | Gets or sets the source.<br/>The source elements define the access of the elements vertices, edges and faces to their geometric entities.<br/>At least one source element is needed for the vertices.<br/>If there are edges a second source element is needed for accessing the curves in the curve element by an IDREF_array.<br/>If there are faces the third source element is needed for accessing the surfaces in the surface element by an IDREF_array. |
| [vertices](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/vertices) | Gets or sets the vertices.<br/>This element defines all the vertices of an BREP structure.<br/>Vertices are the base topological entity for all BREP structures, so this element is ever needed. |
| [edges](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/edges) | Gets or sets the edges.<br/>This element defines all the edges of the BREP structure. |
| [wires](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/wires) | Gets or sets the wires.<br/>This element defines all the wires of the BREP structure. |
| [faces](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/faces) | Gets or sets the faces.<br/>This element defines all the faces of the BREP structure. |
| [parametric_curves](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/parametric_curves) | Gets or sets the parametric curves. |
| [shells](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/shells) | Gets or sets the shells.<br/>This element defines all the shells of the BREP structure. |
| [solids](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/solids) | Gets or sets the solids.<br/>This element defines all the solids of the BREP structure. |
| [extra](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep/extra) | Gets or sets the extra. |



### See Also
* module [`aspose.cad.fileformats.collada.fileparser.elements`](..)
* class [`Brep`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep)
* class [`ColladaElement`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/colladaelement)
