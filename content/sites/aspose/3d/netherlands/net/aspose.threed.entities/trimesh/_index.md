---
title: TriMesh
second_title: Aspose.3D voor .NET API-referentie
description: Een TriMesh bevat onbewerkte gegevens die rechtstreeks door de GPU kunnen worden gebruikt. Deze klasse is een hulpprogramma om te helpen bij het construeren van een mesh die alleen gegevens per hoekpunt bevat.
type: docs
weight: 730
url: /nl/net/aspose.threed.entities/trimesh/
---
## TriMesh class

Een TriMesh bevat onbewerkte gegevens die rechtstreeks door de GPU kunnen worden gebruikt. Deze klasse is een hulpprogramma om te helpen bij het construeren van een mesh die alleen gegevens per hoekpunt bevat.

```csharp
public class TriMesh : Entity, IEnumerable<Vertex>
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [TriMesh](trimesh/)(string, VertexDeclaration) | Initialiseer een instantie van`TriMesh` |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity/) { get; } | De capaciteit van vooraf toegewezen hoekpunten. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Haalt op of stelt in of deze entiteit moet worden uitgesloten tijdens het exporteren. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount/) { get; } | Het aantal indexen hierin`TriMesh` |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Haalt of stelt het eerste bovenliggende knooppunt in. Als het eerste bovenliggende knooppunt wordt ingesteld, wordt deze entiteit losgekoppeld van andere bovenliggende knooppunten. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Haalt alle bovenliggende knooppunten op, een entiteit kan worden gekoppeld aan meerdere bovenliggende knooppunten voor geometrie-instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount/) { get; } | Het aantal niet-samengevoegde hoekpunten dat is gepasseerd[`BeginVertex`](./beginvertex/) En[`EndVertex`](./endvertex/) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration/) { get; } | De vertexlay-out van de`TriMesh` . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount/) { get; } | Het aantal hoekpunten hierin`TriMesh` |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes/) { get; } | De totale grootte van alle hoekpunten in bytes |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [CopyFrom](../../aspose.threed.entities/trimesh/copyfrom/)(TriMesh, VertexDeclaration) | Kopieer het`TriMesh`van invoer met nieuwe vertex layout |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh/#frommesh)(Mesh, bool) | Maak een TriMesh van een bepaald mesh-object, de vertex-declaratie is gebaseerd op de structuur van het ingevoerde mesh. |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh/#frommesh_1)(VertexDeclaration, Mesh) | Maak een TriMesh van een gegeven mesh-object met een gegeven hoekpuntlay-out. |
| static [FromRawData](../../aspose.threed.entities/trimesh/fromrawdata/)(VertexDeclaration, byte[], int[], bool) | Maak TriMesh van onbewerkte gegevens |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex/)() | Begin met het toevoegen van vertex |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex/)() | Einde toevoegen vertex |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Haalt het begrenzingskader op van de huidige entiteit in het coördinatensysteem van de objectruimte. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Haalt de sleutel op van de entiteitsrenderer die is geregistreerd in de renderer |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator/)() | Laat de teller opsommen[`Vertex`](../../aspose.threed.utilities/vertex/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/#indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/#indicestoarray_1)(out ushort[]) |  |
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
| override [ToString](../../aspose.threed.entities/trimesh/tostring/)() | Krijgt de tekenreeksrepresentatie van`TriMesh` |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray/)() | Converteer de gegevens van de hoekpunten naar byte array |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto/)(Stream) | Schrijf de indexgegevens als 16bit integer naar de stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto/)(Stream) | Schrijf de indexgegevens als 32bit integer naar de stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto/)(Stream) | Vertices-gegevens naar de opgegeven stream schrijven |

### Zie ook

* class [Entity](../../aspose.threed/entity/)
* class [Vertex](../../aspose.threed.utilities/vertex/)
* naamruimte [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
