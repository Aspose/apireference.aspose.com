---
title: Geometry
second_title: Aspose.3D för .NET API-referens
description: Basklassen för alla renderbara geometriska objekt somMesh./mesh NurbsSurface./nurbssurface Patch./patch och etc..
type: docs
weight: 360
url: /sv/net/aspose.threed.entities/geometry/
---
## Geometry class

Basklassen för alla renderbara geometriska objekt (som[`Mesh`](../mesh) ,[`NurbsSurface`](../nurbssurface) ,[`Patch`](../patch) och etc.).

Den[`Geometry`](../geometry) basklass stöder:  **Styrpunktshantering** , kontrollpunkter definierar basen 3D rumslig struktur av geometrin, olika geometriska typer har olika sätt att definiera konkreta 3D-modeller. **Vertex element definition** , vertexelement tillämpar extra information som normaler/uv-koordinater/vertexfärger på geometrin, se[`VertexElement`](../vertexelement) för mer detaljer. **Objekt deformeras** ,[`Deformer`](../../aspose.threed.deformers/deformer) kan bindas för att animera geometrins form.

```csharp
public class Geometry : Entity
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Geometry](geometry)(string) | Initierar en ny instans av[`Geometry`](../geometry) class. |

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
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Hämtar alla vertexelement |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Hämtar eller ställer in om geometrin är synlig |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Lägger till ett befintligt vertexelement till aktuell geometri |
| [CreateElement](../../aspose.threed.entities/geometry/createelement#createelement)(VertexElementType) | Skapar ett vertexelement med angiven typ och lägger till det i geometrin. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement#createelement_1)(VertexElementType, MappingMode, ReferenceMode) | Skapar ett vertexelement med angiven typ och lägger till det i geometrin. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv#createelementuv)(TextureMapping) | Skapar en[`VertexElementUV`](../vertexelementuv) med given texturmappningstyp. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv#createelementuv_1)(TextureMapping, MappingMode, ReferenceMode) | Skapar en[`VertexElementUV`](../vertexelementuv) med given texturmappningstyp. |
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

* class [Entity](../../aspose.threed/entity)
* namnutrymme [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
