---
title: Cylinder
second_title: Aspose.3D voor .NET API-referentie
description: Geparametriseerde cilinder. Het kan ook worden gebruikt om de kegel weer te geven wanneer een van radiusTop/radiusBottom nul is.
type: docs
weight: 310
url: /nl/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Geparametriseerde cilinder. Het kan ook worden gebruikt om de kegel weer te geven wanneer een van radiusTop/radiusBottom nul is.

```csharp
public class Cylinder : Primitive
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Cylinder](cylinder/#constructor)() | Initialiseert een nieuw exemplaar van het`Cylinder` klasse. |
| [Cylinder](cylinder/#constructor_1)(double, double) | Initialiseert een nieuw exemplaar van het`Cylinder` klasse. |
| [Cylinder](cylinder/#constructor_2)(double, double, double) | Initialiseert een nieuw exemplaar van het`Cylinder` klasse. |
| [Cylinder](cylinder/#constructor_3)(double, double, double, int, int, bool) | Initialiseert een nieuw exemplaar van het`Cylinder` klasse. |
| [Cylinder](cylinder/#constructor_4)(string, double, double, double, int, int, bool, double, double) | Initialiseert een nieuw exemplaar van het`Cylinder` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | Krijgt of stelt in of deze geometrie schaduw kan werpen |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Haalt op of stelt in of deze entiteit moet worden uitgesloten tijdens het exporteren. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder/) { get; set; } | Haalt op of stelt in of de waaiervormige cilinder moet worden gegenereerd wanneer de ThetaLength kleiner is dan 2*PI, anders wordt het model niet geknipt. |
| [Height](../../aspose.threed.entities/cylinder/height/) { get; set; } | Haalt of stelt de hoogte van de cilinder in. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments/) { get; set; } | Haalt of stelt de hoogtesegmenten in. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom/) { get; set; } | Haalt of stelt de vertices transformatie offset van de onderkant in. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop/) { get; set; } | Haalt of stelt de vertices transformatie offset van de bovenkant in. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended/) { get; set; } | Haalt of stelt een waarde in die aangeeft of dit`Cylinder` open einde. De standaardwaarde is false. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Haalt of stelt het eerste bovenliggende knooppunt in. Als het eerste bovenliggende knooppunt wordt ingesteld, wordt deze entiteit losgekoppeld van andere bovenliggende knooppunten. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Haalt alle bovenliggende knooppunten op, een entiteit kan worden gekoppeld aan meerdere bovenliggende knooppunten voor geometrie-instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments/) { get; set; } | Haalt of stelt de radiale segmenten in. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom/) { get; set; } | Haalt of stelt de straal van de bodemdop van de cilinder in. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop/) { get; set; } | Haalt of stelt de straal van de bovenkap van de cilinder in. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | Krijgt of stelt in of deze geometrie schaduw kan ontvangen. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom/) { get; set; } | Haalt of stelt de schuiftransformatie van de onderkant op, vector slaat de (x-as, z-as) afschuifwaarde op die gemeten is in radialen, standaardwaarde is (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop/) { get; set; } | Haalt of stelt de schuiftransformatie van de bovenzijde op, vector slaat de (x-as, z-as) afschuifwaarde op die gemeten is in radialen, standaardwaarde is (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength/) { get; set; } | Haalt de lengte van de theta op of stelt deze in. De standaardwaarde is 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart/) { get; set; } | Haalt of stelt de theta-start in. De standaardwaarde is 0. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Haalt het begrenzingskader op van de huidige entiteit in het coördinatensysteem van de objectruimte. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Haalt de sleutel op van de entiteitsrenderer die is geregistreerd in de renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Verwijdert een dynamische eigenschap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Verwijder de gespecificeerde eigenschap geïdentificeerd door name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Stelt de waarde in van gespecificeerde eigenschap |
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh/)() | Converteer huidig object naar mesh |

### Zie ook

* class [Primitive](../primitive/)
* naamruimte [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
