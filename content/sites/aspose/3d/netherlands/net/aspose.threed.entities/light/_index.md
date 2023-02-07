---
title: Light
second_title: Aspose.3D voor .NET API-referentie
description: Het licht verlicht de scène.
type: docs
weight: 400
url: /nl/net/aspose.threed.entities/light/
---
## Light class

Het licht verlicht de scène.

De formule om de totale lichtverzwakking te berekenen is: `A = Constante demping + (Dist * Lineaire demping) + ((Dist^2) * Kwadratische demping)`

```csharp
public class Light : Frustum
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Light](light/#constructor)() | Initialiseert een nieuw exemplaar van het`Light` klasse. |
| [Light](light/#constructor_1)(string) | Initialiseert een nieuw exemplaar van het`Light` klasse. |
| [Light](light/#constructor_2)(string, LightType) | Initialiseert een nieuw exemplaar van het`Light` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect/) { get; set; } | Haalt de beeldverhouding van de afgeknotte kegel op of stelt deze in |
| [CastLight](../../aspose.threed.entities/light/castlight/) { get; set; } | Krijgt of stelt in of de huidige lichtinstantie andere objecten kan verlichten. |
| [CastShadows](../../aspose.threed.entities/light/castshadows/) { get; set; } | Krijgt of stelt in of het licht schaduwen kan werpen op andere objecten. |
| [Color](../../aspose.threed.entities/light/color/) { get; set; } | Krijgt of stelt de kleur van het licht in |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation/) { get; set; } | Krijgt of stelt de constante demping in om de totale demping van het licht te berekenen |
| [Direction](../../aspose.threed.entities/frustum/direction/) { get; set; } | Bepaalt of bepaalt de richting waarin de camera kijkt. Wijzigingen aan deze eigenschap hebben ook invloed op de[`LookAt`](../frustum/lookat/) En[`Target`](../frustum/target/) . |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Haalt op of stelt in of deze entiteit moet worden uitgesloten tijdens het exporteren. |
| [Falloff](../../aspose.threed.entities/light/falloff/) { get; set; } | Haalt of stelt de hoek van de afvalkegel in (in graden). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane/) { get; set; } | Haalt of stelt de afstand in het verre vlak van de afgeknotte kegel in. |
| [HotSpot](../../aspose.threed.entities/light/hotspot/) { get; set; } | Haalt of stelt de kegelhoek van de hotspot in (in graden). |
| [Intensity](../../aspose.threed.entities/light/intensity/) { get; set; } | Krijgt of stelt de lichtintensiteit in, standaardwaarde is 100 |
| [LightType](../../aspose.threed.entities/light/lighttype/) { get; set; } | Krijgt of stelt het lichttype in |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation/) { get; set; } | Krijgt of stelt de lineaire demping in om de totale demping van het licht te berekenen |
| [LookAt](../../aspose.threed.entities/frustum/lookat/) { get; set; } | Haalt of stelt de geïnteresseerde positie in waar de camera naar kijkt. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane/) { get; set; } | Haalt of stelt de afstand in het vlak van de afgeknotte kegel in. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight/) { get; set; } | Haalt of stelt de hoogte in bij afgeknotte kegel in orthografische projectie. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Haalt of stelt het eerste bovenliggende knooppunt in. Als het eerste bovenliggende knooppunt wordt ingesteld, wordt deze entiteit losgekoppeld van andere bovenliggende knooppunten. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Haalt alle bovenliggende knooppunten op, een entiteit kan worden gekoppeld aan meerdere bovenliggende knooppunten voor geometrie-instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation/) { get; set; } | Haalt of stelt de kwadratische verzwakking in om de totale verzwakking van het licht te berekenen |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode/) { get; set; } | Haalt of stelt de oriëntatiemodus van de afgeknotte kegel in Deze eigenschap werkt alleen als de[`Target`](../frustum/target/) is null. Als de waarde isFixedTarget , wordt de richting altijd berekend door de eigenschap[`LookAt`](../frustum/lookat/) Anders de[`LookAt`](../frustum/lookat/)wordt altijd berekend door de[`Direction`](../frustum/direction/) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor/) { get; set; } | Krijgt of stelt de kleur van de schaduw in. |
| [Target](../../aspose.threed.entities/frustum/target/) { get; set; } | Haalt of stelt het doel in waarnaar de camera kijkt. Als de gebruiker deze eigenschap ondersteunt, moet deze vóór[`LookAt`](../frustum/lookat/) eigendom. |
| [Up](../../aspose.threed.entities/frustum/up/) { get; set; } | Haalt of stelt de opwaartse richting van de camera in |

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

### Zie ook

* class [Frustum](../frustum/)
* naamruimte [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
