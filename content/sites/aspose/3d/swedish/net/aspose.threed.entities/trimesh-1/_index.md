---
title: TriMeshT
second_title: Aspose.3D för .NET API-referens
description: Generisk version avTriMesh./trimesh för användarens statiskt definierade vertex type
type: docs
weight: 740
url: /sv/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

Generisk version av[`TriMesh`](../trimesh) för användarens statiskt definierade vertex type

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| Parameter | Beskrivning |
| --- | --- |
| T |  |

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [TriMesh](trimesh)(string) | Initiera en instans av[`TriMesh`](../trimesh) |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | Kapaciteten för förallokerade hörn. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Hämtar eller ställer in om den här entiteten ska exkluderas under export. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | Antalet index i detta[`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Hämtar eller ställer in den första överordnade noden, om den första överordnade noden ställs in, kommer denna enhet att frikopplas från andra överordnade noder. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Hämtar alla överordnade noder, en enhet kan kopplas till flera överordnade noder för geometriinstansering |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Hämtar scenen som detta objekt tillhör |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | Antalet osammanslagna hörn som passerade förbi[`BeginVertex`](../trimesh/beginvertex) och[`EndVertex`](../trimesh/endvertex) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | vertexlayouten för[`TriMesh`](../trimesh) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | Antalet hörn i detta[`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | Den totala storleken på alla hörn i bytes |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh`1/frommesh)(Mesh) | Skapa ett TriMesh från ett givet nätobjekt med automatiskt genererad vertexlayout. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | Börja lägga till vertex |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | Sluta lägga till vertex |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Hittar egenskapen. Det kan vara en dynamisk egenskap (Skapad av CreateDynamicProperty/SetProperty) eller inbyggd egenskap (identifierad med dess namn) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Hämtar begränsningsrutan för nuvarande entitet i dess objektrymds koordinatsystem. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Hämtar nyckeln till entitetsrenderaren registrerad i renderaren |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | Få enumeratorn att räkna upp[`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Få värdet av specificerad egenskap |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | Ladda vertex från byte, längden på byte måste vara en heltalsmultipel av vertexstorlek. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | Läs dubbelfältet |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | Läs flytfältet |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | Läs vektor2-fältet |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | Läs vektor3-fältet |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | Läs vektor4-fältet |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | Läs vektor2-fältet |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | Läs vektor3-fältet |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | Läs vektor4-fältet |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Tar bort en dynamisk egenskap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Ta bort den angivna egenskapen identifierad av name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Anger värdet för specificerad egenskap |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | Hämtar strängrepresentationen av[`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | Konvertera vertices data till byte array |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh`1/verticestotypedarray)() | Konvertera vertices-data till maskinskriven array |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | Skriv indexdata som 16-bitars heltal till stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | Skriv indexdata som 32-bitars heltal till stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | Skriv hörndata till den angivna stream |

### Se även

* class [TriMesh](../trimesh)
* namnutrymme [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
