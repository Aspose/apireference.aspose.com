---
title: Patch
second_title: Aspose.3D för .NET API-referens
description: APatch./patch är en parametrisk modelleringsyta liknandeNurbsSurface./nurbssurface  det definieras också av två PatchDirection./patchdirection  denU./patch/u ochV./patch/v . Men skillnad mellanPatch./patch ochNurbsSurface./nurbssurface är detPatchDirection./patchdirection kurvan kan vara en avBezier QuadraticBezier BasisSpline CardinalSpline ochLinear
type: docs
weight: 500
url: /sv/net/aspose.threed.entities/patch/
---
## Patch class

A[`Patch`](../patch) är en parametrisk modelleringsyta, liknande[`NurbsSurface`](../nurbssurface) , det definieras också av två [`PatchDirection`](../patchdirection) , den[`U`](./u) och[`V`](./v) . Men skillnad mellan[`Patch`](../patch) och[`NurbsSurface`](../nurbssurface) är det[`PatchDirection`](../patchdirection) kurvan kan vara en avBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline ochLinear

```csharp
public class Patch : Geometry
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Patch](patch#constructor)() | Initierar en ny instans av[`Patch`](../patch) class. |
| [Patch](patch#constructor_1)(string) | Initierar en ny instans av[`Patch`](../patch) class. |

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
| [U](../../aspose.threed.entities/patch/u) { get; } | Får u-riktningen. |
| [V](../../aspose.threed.entities/patch/v) { get; } | Får v-riktningen. |
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

### Se även

* class [Geometry](../geometry)
* namnutrymme [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
