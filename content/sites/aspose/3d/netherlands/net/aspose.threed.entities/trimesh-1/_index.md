---
title: TriMeshT
second_title: Aspose.3D voor .NET API-referentie
description: Algemene versie vanTriMesh./trimesh/ voor het statisch gedefinieerde hoekpunt van de gebruiker type
type: docs
weight: 740
url: /nl/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

Algemene versie van[`TriMesh`](../trimesh/) voor het statisch gedefinieerde hoekpunt van de gebruiker type

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| Parameter | Beschrijving |
| --- | --- |
| T |  |

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [TriMesh](trimesh/)(string) | Initialiseer een instantie van[`TriMesh`](../trimesh/) |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity/) { get; } | De capaciteit van vooraf toegewezen hoekpunten. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Haalt op of stelt in of deze entiteit moet worden uitgesloten tijdens het exporteren. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount/) { get; } | Het aantal indexen hierin[`TriMesh`](../trimesh/) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Haalt of stelt het eerste bovenliggende knooppunt in. Als het eerste bovenliggende knooppunt wordt ingesteld, wordt deze entiteit losgekoppeld van andere bovenliggende knooppunten. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Haalt alle bovenliggende knooppunten op, een entiteit kan worden gekoppeld aan meerdere bovenliggende knooppunten voor geometrie-instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount/) { get; } | Het aantal niet-samengevoegde hoekpunten dat is gepasseerd[`BeginVertex`](../trimesh/beginvertex/) En[`EndVertex`](../trimesh/endvertex/) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration/) { get; } | De vertexlay-out van de[`TriMesh`](../trimesh/) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount/) { get; } | Het aantal hoekpunten hierin[`TriMesh`](../trimesh/) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes/) { get; } | De totale grootte van alle hoekpunten in bytes |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh-1/frommesh/)(Mesh) | Maak een TriMesh van een gegeven mesh-object met automatisch gegenereerde vertexlay-out. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex/)() | Begin met het toevoegen van vertex |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex/)() | Einde toevoegen vertex |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Haalt het begrenzingskader op van de huidige entiteit in het coördinatensysteem van de objectruimte. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Haalt de sleutel op van de entiteitsrenderer die is geregistreerd in de renderer |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator/)() | Laat de teller opsommen[`Vertex`](../../aspose.threed.utilities/vertex/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes/)(byte[]) | Laad hoekpunten uit bytes, de lengte van bytes moet een geheel veelvoud zijn van de hoekpuntgrootte. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble/)(int, VertexField) | Lees het dubbele veld |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat/)(int, VertexField) | Lees het zwevende veld |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2/)(int, VertexField) | Lees het veld vector2 |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3/)(int, VertexField) | Lees het vector3-veld |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4/)(int, VertexField) | Lees het veld vector4 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2/)(int, VertexField) | Lees het veld vector2 |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3/)(int, VertexField) | Lees het vector3-veld |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4/)(int, VertexField) | Lees het veld vector4 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Verwijdert een dynamische eigenschap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Verwijder de gespecificeerde eigenschap geïdentificeerd door name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Stelt de waarde in van gespecificeerde eigenschap |
| override [ToString](../../aspose.threed.entities/trimesh/tostring/)() | Krijgt de tekenreeksrepresentatie van[`TriMesh`](../trimesh/) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray/)() | Converteer de gegevens van de hoekpunten naar byte array |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh-1/verticestotypedarray/)() | Converteer de hoekpuntgegevens naar getypte array |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto/)(Stream) | Schrijf de indexgegevens als 16bit integer naar de stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto/)(Stream) | Schrijf de indexgegevens als 32bit integer naar de stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto/)(Stream) | Vertices-gegevens naar de opgegeven stream schrijven |

### Zie ook

* class [TriMesh](../trimesh/)
* naamruimte [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
