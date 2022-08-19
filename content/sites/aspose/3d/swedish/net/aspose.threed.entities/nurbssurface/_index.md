---
title: NurbsSurface
second_title: Aspose.3D för .NET API-referens
description: NurbsSurface./nurbssurface är en yta representerad avNURBSIckeenhetlig rationell grundsplinehttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline ANurbsSurface./nurbssurface definieras av tvåNurbsDirection./nurbsdirectionU./nurbssurface/u ochV./nurbssurface/v . Wkomponenten i kontrollpunkten används som kontrollpunktens vikt oavsett riktningens typ är enTwoDimensional ellerThreeDimensional
type: docs
weight: 480
url: /sv/net/aspose.threed.entities/nurbssurface/
---
## NurbsSurface class

[`NurbsSurface`](../nurbssurface) är en yta representerad av[NURBS(Icke-enhetlig rationell grundspline)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../nurbssurface) definieras av två[`NurbsDirection`](../nurbsdirection)[`U`](./u) och[`V`](./v) . W-komponenten i kontrollpunkten används som kontrollpunktens vikt oavsett riktningens typ är enTwoDimensional ellerThreeDimensional

```csharp
public class NurbsSurface : Geometry, IMeshConvertible
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [NurbsSurface](nurbssurface#constructor)() | Initierar en ny instans av[`NurbsSurface`](../nurbssurface) class. |
| [NurbsSurface](nurbssurface#constructor_1)(string) | Initierar en ny instans av[`NurbsSurface`](../nurbssurface) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Hämtar eller ställer in om denna geometri kan kasta skugga |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Får alla kontrollpunkter |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Får alla deformerare associerade med denna geometri. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Hämtar eller ställer in om den här entiteten ska exkluderas under export. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Hämtar eller ställer in den första överordnade noden, om den första överordnade noden ställs in, kommer denna enhet att frikopplas från andra överordnade noder. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Hämtar alla överordnade noder, en enhet kan kopplas till flera överordnade noder för geometriinstansering |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Hämtar eller ställer in om denna geometri kan ta emot skugga. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Hämtar scenen som detta objekt tillhör |
| [U](../../aspose.threed.entities/nurbssurface/u) { get; } | Får NURBS-ytans U-riktning |
| [V](../../aspose.threed.entities/nurbssurface/v) { get; } | Hämtar NURBS-ytans V-riktning |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Hämtar alla vertexelement |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Hämtar eller ställer in om geometrin är synlig |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Lägger till ett befintligt vertexelement till aktuell geometri |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Skapar ett vertexelement med angiven typ och lägger till det i geometrin. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Skapar ett vertexelement med angiven typ och lägger till det i geometrin. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Skapar en[`VertexElementUV`](../vertexelementuv) med given texturmappningstyp. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Skapar en[`VertexElementUV`](../vertexelementuv) med given texturmappningstyp. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Hittar egenskapen. Det kan vara en dynamisk egenskap (Skapad av CreateDynamicProperty/SetProperty) eller inbyggd egenskap (identifierad med dess namn) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Hämtar begränsningsrutan för nuvarande entitet i dess objektrymds koordinatsystem. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Får ett vertexelement med specificerad typ |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Hämtar nyckeln till entitetsrenderaren registrerad i renderaren |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Få värdet av specificerad egenskap |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Får en[`VertexElementUV`](../vertexelementuv) instans med given texturmappning type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Tar bort en dynamisk egenskap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Ta bort den angivna egenskapen identifierad av name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Anger värdet för specificerad egenskap |
| [ToMesh](../../aspose.threed.entities/nurbssurface/tomesh)() | Konvertera NURBS-ytan till mesh |

### Se även

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* namnutrymme [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
