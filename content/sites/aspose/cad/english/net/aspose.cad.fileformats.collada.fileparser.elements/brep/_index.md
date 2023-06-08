---
title: Class Brep
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.Brep class. The BREP. Describes a boundary representation BREP structure
type: docs
weight: 7150
url: /net/aspose.cad.fileformats.collada.fileparser.elements/brep/
---
## Brep class

The BREP. Describes a boundary representation (BREP) structure.

```csharp
public class Brep : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [Brep](brep/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Curves](../../aspose.cad.fileformats.collada.fileparser.elements/brep/curves/) { get; set; } | Gets or sets the curves. The curves element holds all the curves that are needed for the BREP structure. Here are the curves that describes the kind of an edge, but here are also the curves that are needed to create a extrusion for a surface. This element is needed, if the edges element is present. |
| [Edges](../../aspose.cad.fileformats.collada.fileparser.elements/brep/edges/) { get; set; } | Gets or sets the edges. This element defines all the edges of the BREP structure. |
| [Extra](../../aspose.cad.fileformats.collada.fileparser.elements/brep/extra/) { get; set; } | Gets or sets the extra. |
| [Faces](../../aspose.cad.fileformats.collada.fileparser.elements/brep/faces/) { get; set; } | Gets or sets the faces. This element defines all the faces of the BREP structure. |
| [ParametricCurves](../../aspose.cad.fileformats.collada.fileparser.elements/brep/parametriccurves/) { get; set; } | Gets or sets the parametric curves. |
| [Shells](../../aspose.cad.fileformats.collada.fileparser.elements/brep/shells/) { get; set; } | Gets or sets the shells. This element defines all the shells of the BREP structure. |
| [Solids](../../aspose.cad.fileformats.collada.fileparser.elements/brep/solids/) { get; set; } | Gets or sets the solids. This element defines all the solids of the BREP structure. |
| [Source](../../aspose.cad.fileformats.collada.fileparser.elements/brep/source/) { get; set; } | Gets or sets the source. The source elements define the access of the elements vertices, edges and faces to their geometric entities. At least one source element is needed for the vertices. If there are edges a second source element is needed for accessing the curves in the curve element by an IDREF_array. If there are faces the third source element is needed for accessing the surfaces in the surface element by an IDREF_array. |
| [SurfaceCurves](../../aspose.cad.fileformats.collada.fileparser.elements/brep/surfacecurves/) { get; set; } | Gets or sets the surface curves. Contains all 2D curves used in this B-rep. This includes surfaces that describe the kind of the face. This element is required if the faces element is present. |
| [Surfaces](../../aspose.cad.fileformats.collada.fileparser.elements/brep/surfaces/) { get; set; } | Gets or sets the surfaces. The surfaces element holds all the surfaces that are needed for the BREP structure. Here are the surfaces that describes the kind of a face. This element is needed, if the faces element is present. |
| [Vertices](../../aspose.cad.fileformats.collada.fileparser.elements/brep/vertices/) { get; set; } | Gets or sets the vertices. This element defines all the vertices of an BREP structure. Vertices are the base topological entity for all BREP structures, so this element is ever needed. |
| [Wires](../../aspose.cad.fileformats.collada.fileparser.elements/brep/wires/) { get; set; } | Gets or sets the wires. This element defines all the wires of the BREP structure. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


