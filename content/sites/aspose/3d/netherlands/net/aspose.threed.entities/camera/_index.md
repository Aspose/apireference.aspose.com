---
title: Camera
second_title: Aspose.3D voor .NET API-referentie
description: De camera beschrijft het gezichtspunt van de kijker die naar de scène kijkt.
type: docs
weight: 250
url: /nl/net/aspose.threed.entities/camera/
---
## Camera class

De camera beschrijft het gezichtspunt van de kijker die naar de scène kijkt.

```csharp
public class Camera : Frustum
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Camera](camera/#constructor)() | Initialiseert een nieuw exemplaar van het`Camera` klasse. |
| [Camera](camera/#constructor_1)(ProjectionType) | Initialiseert een nieuw exemplaar van het`Camera` klasse. |
| [Camera](camera/#constructor_2)(string) | Initialiseert een nieuw exemplaar van het`Camera` klasse. |
| [Camera](camera/#constructor_3)(string, ProjectionType) | Initialiseert een nieuw exemplaar van het`Camera` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode/) { get; set; } | Haalt of stelt de diafragmamodus van de camera in |
| [Aspect](../../aspose.threed.entities/frustum/aspect/) { get; set; } | Haalt de beeldverhouding van de afgeknotte kegel op of stelt deze in |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio/) { get; set; } | Haalt of stelt de hoogte-breedteverhouding van het kijkvlak in. |
| [Direction](../../aspose.threed.entities/frustum/direction/) { get; set; } | Bepaalt of bepaalt de richting waarin de camera kijkt. Wijzigingen aan deze eigenschap hebben ook invloed op de[`LookAt`](../frustum/lookat/) En[`Target`](../frustum/target/) . |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Haalt op of stelt in of deze entiteit moet worden uitgesloten tijdens het exporteren. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane/) { get; set; } | Haalt of stelt de afstand in het verre vlak van de afgeknotte kegel in. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview/) { get; set; } | Haalt of stelt het gezichtsveld van de camera in graden in, deze eigenschap wordt alleen gebruikt als ApertureMode isHorizontal ofVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx/) { get; set; } | Haalt of stelt het horizontale gezichtsveld van de camera in graden in. Deze eigenschap wordt alleen gebruikt als ApertureMode isHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy/) { get; set; } | Haalt of stelt het verticale gezichtsveld van de camera in graden in, deze eigenschap wordt alleen gebruikt als ApertureMode isHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height/) { get; set; } | Haalt de hoogte van het kijkvlak op of stelt deze in, gemeten in inches |
| [LookAt](../../aspose.threed.entities/frustum/lookat/) { get; set; } | Haalt of stelt de geïnteresseerde positie in waar de camera naar kijkt. |
| [Magnification](../../aspose.threed.entities/camera/magnification/) { get; set; } | Haalt of stelt de vergroting in die wordt gebruikt in orthografische camera |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane/) { get; set; } | Haalt of stelt de afstand in het vlak van de afgeknotte kegel in. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight/) { get; set; } | Haalt of stelt de hoogte in bij afgeknotte kegel in orthografische projectie. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Haalt of stelt het eerste bovenliggende knooppunt in. Als het eerste bovenliggende knooppunt wordt ingesteld, wordt deze entiteit losgekoppeld van andere bovenliggende knooppunten. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Haalt alle bovenliggende knooppunten op, een entiteit kan worden gekoppeld aan meerdere bovenliggende knooppunten voor geometrie-instancing |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype/) { get; set; } | Hiermee wordt het projectietype van de camera opgehaald of ingesteld. Standaard wordt de perspectiefprojectie gebruikt. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode/) { get; set; } | Haalt of stelt de oriëntatiemodus van de afgeknotte kegel in Deze eigenschap werkt alleen als de[`Target`](../frustum/target/) is null. Als de waarde isFixedTarget , wordt de richting altijd berekend door de eigenschap[`LookAt`](../frustum/lookat/) Anders de[`LookAt`](../frustum/lookat/)wordt altijd berekend door de[`Direction`](../frustum/direction/) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |
| [Target](../../aspose.threed.entities/frustum/target/) { get; set; } | Haalt of stelt het doel in waarnaar de camera kijkt. Als de gebruiker deze eigenschap ondersteunt, moet deze vóór[`LookAt`](../frustum/lookat/) eigendom. |
| [Up](../../aspose.threed.entities/frustum/up/) { get; set; } | Haalt of stelt de opwaartse richting van de camera in |
| [Width](../../aspose.threed.entities/camera/width/) { get; set; } | Haalt de breedte van het kijkvlak op of stelt deze in, gemeten in inches |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Haalt het begrenzingskader op van de huidige entiteit in het coördinatensysteem van de objectruimte. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Haalt de sleutel op van de entiteitsrenderer die is geregistreerd in de renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [MoveForward](../../aspose.threed.entities/camera/moveforward/)(double) | Beweeg de camera naar voren in de richting of het doel. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Verwijdert een dynamische eigenschap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Verwijder de gespecificeerde eigenschap geïdentificeerd door name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Stelt de waarde in van gespecificeerde eigenschap |

### Zie ook

* class [Frustum](../frustum/)
* naamruimte [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
