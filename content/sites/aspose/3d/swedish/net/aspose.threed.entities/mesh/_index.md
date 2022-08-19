---
title: Mesh
second_title: Aspose.3D för .NET API-referens
description: Ett nät består av många nsidiga polygoner.
type: docs
weight: 450
url: /sv/net/aspose.threed.entities/mesh/
---
## Mesh class

Ett nät består av många n-sidiga polygoner.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Mesh](mesh#constructor)() | Initierar en ny instans av[`Mesh`](../mesh) class. |
| [Mesh](mesh#constructor_1)(Bitmap) | Konstruera ett nät med specificerad höjdkarta, om höjdkartans pixelformat innehåller flera komponenter, kommer den första (vanligtvis den röda) komponenten att användas som höjdvärde(z) Kontrollpunktens x- och y-komponenter är normaliserade pixelkoordinater . |
| [Mesh](mesh#constructor_4)(string) | Initierar en ny instans av[`Mesh`](../mesh) class. |
| [Mesh](mesh#constructor_2)(Bitmap, Matrix4) | Konstruera ett nät med specificerad höjdkarta, om höjdkartans pixelformat innehåller flera komponenter, kommer den första (vanligtvis den röda) komponenten att användas som höjdvärde(z) Kontrollpunktens x- och y-komponenter är normaliserade pixelkoordinater . |
| [Mesh](mesh#constructor_3)(Bitmap, bool, Matrix4) | Konstruera ett nät med specificerad höjdkarta, om höjdkartans pixelformat innehåller flera komponenter, kommer den första (vanligtvis den röda) komponenten att användas som höjdvärde(z) Kontrollpunktens x- och y-komponenter är normaliserade pixelkoordinater . |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Hämtar eller ställer in om denna geometri kan kasta skugga |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Får alla kontrollpunkter |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Får alla deformerare associerade med denna geometri. |
| [Edges](../../aspose.threed.entities/mesh/edges) { get; } | Får kanterna på nätet. Edge är valfritt i mesh, så den kan vara tom. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Hämtar eller ställer in om den här entiteten ska exkluderas under export. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Hämtar eller ställer in den första överordnade noden, om den första överordnade noden ställs in, kommer denna enhet att frikopplas från andra överordnade noder. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Hämtar alla överordnade noder, en enhet kan kopplas till flera överordnade noder för geometriinstansering |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount) { get; } | Får antalet polygoner |
| [Polygons](../../aspose.threed.entities/mesh/polygons) { get; } | Får polygondefinitionen av nätet |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Hämtar eller ställer in om denna geometri kan ta emot skugga. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Hämtar scenen som detta objekt tillhör |
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
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_2)(int[]) | Skapar en ny polygon med alla hörn definierade i*indices* . För att skapa polygon vertex för vertex, använd[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon)(int, int, int) | Skapa en polygon med 3 hörn(triangel) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_3)(int[], int, int) | Skapar en ny polygon med alla hörn definierade i*indices* . För att skapa polygon vertex för vertex, använd[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_1)(int, int, int, int) | Skapa en polygon med 4 hörn(quad) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Hittar egenskapen. Det kan vara en dynamisk egenskap (Skapad av CreateDynamicProperty/SetProperty) eller inbyggd egenskap (identifierad med dess namn) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Hämtar begränsningsrutan för nuvarande entitet i dess objektrymds koordinatsystem. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Får ett vertexelement med specificerad typ |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Hämtar nyckeln till entitetsrenderaren registrerad i renderaren |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator)() | Hämtar enumerator för varje inre polygon. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize)(int) | Hämtar vertexantalet för den angivna polygonen. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Få värdet av specificerad egenskap |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Får en[`VertexElementUV`](../vertexelementuv) instans med given texturmappning type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Tar bort en dynamisk egenskap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Ta bort den angivna egenskapen identifierad av name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Anger värdet för specificerad egenskap |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh)() | Hämtar Mesh-instansen från nuvarande entitet. |

### Exempel

För att lägga till en polygon i mesh: Res genom alla polygoner i mesh:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    //hantera polygon
}
```

### Se även

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* namnutrymme [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
