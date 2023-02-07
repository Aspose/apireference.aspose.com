---
title: Mesh
second_title: Aspose.3D voor .NET API-referentie
description: Een mesh is gemaakt van vele nzijdige polygonen.
type: docs
weight: 450
url: /nl/net/aspose.threed.entities/mesh/
---
## Mesh class

Een mesh is gemaakt van vele n-zijdige polygonen.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Mesh](mesh/#constructor)() | Initialiseert een nieuw exemplaar van het`Mesh` klasse. |
| [Mesh](mesh/#constructor_1)(Bitmap) | Construeer een mesh met behulp van een gespecificeerde hoogtekaart, als het pixelformaat van de hoogtekaart meerdere componenten bevat, wordt de eerste (meestal de rode) component gebruikt als de hoogtewaarde(z) De x- en y-componenten van het controlepunt zijn genormaliseerde pixelcoördinaten . |
| [Mesh](mesh/#constructor_4)(string) | Initialiseert een nieuw exemplaar van het`Mesh` klasse. |
| [Mesh](mesh/#constructor_2)(Bitmap, Matrix4) | Construeer een mesh met behulp van een gespecificeerde hoogtekaart, als het pixelformaat van de hoogtekaart meerdere componenten bevat, wordt de eerste (meestal de rode) component gebruikt als de hoogtewaarde(z) De x- en y-componenten van het controlepunt zijn genormaliseerde pixelcoördinaten . |
| [Mesh](mesh/#constructor_3)(Bitmap, bool, Matrix4) | Construeer een mesh met behulp van een gespecificeerde hoogtekaart, als het pixelformaat van de hoogtekaart meerdere componenten bevat, wordt de eerste (meestal de rode) component gebruikt als de hoogtewaarde(z) De x- en y-componenten van het controlepunt zijn genormaliseerde pixelcoördinaten . |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Krijgt of stelt in of deze geometrie schaduw kan werpen |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Krijgt alle controlepunten |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Haalt alle deformers op die geassocieerd zijn met deze geometrie. |
| [Edges](../../aspose.threed.entities/mesh/edges/) { get; } | Haalt de randen van de mesh op. Edge is optioneel in mesh, dus het kan leeg zijn. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Haalt op of stelt in of deze entiteit moet worden uitgesloten tijdens het exporteren. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Haalt of stelt het eerste bovenliggende knooppunt in. Als het eerste bovenliggende knooppunt wordt ingesteld, wordt deze entiteit losgekoppeld van andere bovenliggende knooppunten. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Haalt alle bovenliggende knooppunten op, een entiteit kan worden gekoppeld aan meerdere bovenliggende knooppunten voor geometrie-instancing |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount/) { get; } | Haalt het aantal polygonen op |
| [Polygons](../../aspose.threed.entities/mesh/polygons/) { get; } | Krijgt de polygonendefinitie van de mesh |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Krijgt of stelt in of deze geometrie schaduw kan ontvangen. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | Krijgt alle vertex-elementen |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | Krijgt of stelt in als de geometrie zichtbaar is |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | Voegt een bestaand vertex-element toe aan de huidige geometrie |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType) | Creëert een vertex-element met gespecificeerd type en voegt het toe aan de geometrie. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType, MappingMode, ReferenceMode) | Creëert een vertex-element met gespecificeerd type en voegt het toe aan de geometrie. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping) | Creëert een[`VertexElementUV`](../vertexelementuv/) met het gegeven textuurtoewijzingstype. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping, MappingMode, ReferenceMode) | Creëert een[`VertexElementUV`](../vertexelementuv/) met het gegeven textuurtoewijzingstype. |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_2)(int[]) | Creëert een nieuwe polygoon met alle hoekpunten gedefinieerd in*indices* . Gebruik a.u.b. om polygoon hoekpunt voor hoekpunt te creëren[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon)(int, int, int) | Maak een polygoon met 3 hoekpunten (driehoek) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_3)(int[], int, int) | Creëert een nieuwe polygoon met alle hoekpunten gedefinieerd in*indices* . Gebruik a.u.b. om polygoon hoekpunt voor hoekpunt te creëren[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_1)(int, int, int, int) | Maak een polygoon met 4 hoekpunten(quad) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Haalt het begrenzingskader op van de huidige entiteit in het coördinatensysteem van de objectruimte. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Krijgt een vertex-element met opgegeven type |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Haalt de sleutel op van de entiteitsrenderer die is geregistreerd in de renderer |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator/)() | Haalt de teller op voor elke binnenste polygonen. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize/)(int) | Haalt het aantal hoekpunten op van de gespecificeerde polygoon. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Krijgt een[`VertexElementUV`](../vertexelementuv/) instantie met gegeven textuurtoewijzing type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Verwijdert een dynamische eigenschap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Verwijder de gespecificeerde eigenschap geïdentificeerd door name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Stelt de waarde in van gespecificeerde eigenschap |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh/)() | Haalt de Mesh-instantie op van de huidige entiteit. |

### Voorbeelden

Om een veelhoek in mesh toe te voegen: Reis door alle polygonen in mesh:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    // omgaan met polygoon
}
```

### Zie ook

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* naamruimte [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
