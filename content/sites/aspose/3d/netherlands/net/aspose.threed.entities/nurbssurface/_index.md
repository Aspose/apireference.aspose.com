---
title: NurbsSurface
second_title: Aspose.3D voor .NET API-referentie
description: NurbsSurface./nurbssurface/ is een oppervlak vertegenwoordigd doorNURBS nietuniforme rationele basissplinehttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline EenNurbsSurface./nurbssurface/ wordt gedefinieerd door tweeNurbsDirection./nurbsdirection/U./nurbssurface/u/ EnV./nurbssurface/v/ . De wcomponent in het controlepunt wordt gebruikt als het gewicht van het controlepunt ongeacht het richtingstype.TwoDimensional ofThreeDimensional
type: docs
weight: 480
url: /nl/net/aspose.threed.entities/nurbssurface/
---
## NurbsSurface class

`NurbsSurface` is een oppervlak vertegenwoordigd door[NURBS (niet-uniforme rationele basisspline)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), Een`NurbsSurface` wordt gedefinieerd door twee[`NurbsDirection`](../nurbsdirection/)[`U`](./u/) En[`V`](./v/) . De w-component in het controlepunt wordt gebruikt als het gewicht van het controlepunt, ongeacht het richtingstype.TwoDimensional ofThreeDimensional

```csharp
public class NurbsSurface : Geometry, IMeshConvertible
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [NurbsSurface](nurbssurface/#constructor)() | Initialiseert een nieuw exemplaar van het`NurbsSurface` klasse. |
| [NurbsSurface](nurbssurface/#constructor_1)(string) | Initialiseert een nieuw exemplaar van het`NurbsSurface` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Krijgt of stelt in of deze geometrie schaduw kan werpen |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Krijgt alle controlepunten |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Haalt alle deformers op die geassocieerd zijn met deze geometrie. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Haalt op of stelt in of deze entiteit moet worden uitgesloten tijdens het exporteren. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Haalt of stelt het eerste bovenliggende knooppunt in. Als het eerste bovenliggende knooppunt wordt ingesteld, wordt deze entiteit losgekoppeld van andere bovenliggende knooppunten. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Haalt alle bovenliggende knooppunten op, een entiteit kan worden gekoppeld aan meerdere bovenliggende knooppunten voor geometrie-instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Krijgt of stelt in of deze geometrie schaduw kan ontvangen. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |
| [U](../../aspose.threed.entities/nurbssurface/u/) { get; } | Haalt de U-richting van het NURBS-oppervlak op |
| [V](../../aspose.threed.entities/nurbssurface/v/) { get; } | Haalt de V-richting van het NURBS-oppervlak op |
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
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Haalt het begrenzingskader op van de huidige entiteit in het coördinatensysteem van de objectruimte. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Krijgt een vertex-element met opgegeven type |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Haalt de sleutel op van de entiteitsrenderer die is geregistreerd in de renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Krijgt een[`VertexElementUV`](../vertexelementuv/) instantie met gegeven textuurtoewijzing type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Verwijdert een dynamische eigenschap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Verwijder de gespecificeerde eigenschap geïdentificeerd door name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Stelt de waarde in van gespecificeerde eigenschap |
| [ToMesh](../../aspose.threed.entities/nurbssurface/tomesh/)() | Converteer het NURBS-oppervlak naar de mesh |

### Zie ook

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* naamruimte [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
