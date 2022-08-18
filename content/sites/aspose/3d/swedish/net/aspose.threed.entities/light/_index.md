---
title: Light
second_title: Aspose.3D för .NET API-referens
description: Ljuset lyser upp scenen.
type: docs
weight: 400
url: /sv/net/aspose.threed.entities/light/
---
## Light class

Ljuset lyser upp scenen.

Formeln för att beräkna den totala ljusdämpningen är: `A = konstant dämpning + (avstånd * linjär dämpning) + ((avstånd^2) * kvadratisk dämpning)`

```csharp
public class Light : Frustum
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Light](light#constructor)() | Initierar en ny instans av[`Light`](../light) class. |
| [Light](light#constructor_1)(string) | Initierar en ny instans av[`Light`](../light) class. |
| [Light](light#constructor_2)(string, LightType) | Initierar en ny instans av[`Light`](../light) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Hämtar eller ställer in bildförhållandet för frustum |
| [CastLight](../../aspose.threed.entities/light/castlight) { get; set; } | Hämtar eller ställer in om den aktuella ljusinstansen kan belysa andra objekt. |
| [CastShadows](../../aspose.threed.entities/light/castshadows) { get; set; } | Får eller sätter om ljuset kan kasta skuggor på andra objekt. |
| [Color](../../aspose.threed.entities/light/color) { get; set; } | Får eller ställer in ljusets färg |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation) { get; set; } | Får eller ställer in den konstanta dämpningen för att beräkna den totala dämpningen av light |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Hämtar eller ställer in riktningen som kameran tittar på. Ändringar på den här egenskapen påverkar också[`LookAt`](../frustum/lookat) och[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Hämtar eller ställer in om den här entiteten ska exkluderas under export. |
| [Falloff](../../aspose.threed.entities/light/falloff) { get; set; } | Hämtar eller ställer in fallkonens vinkel (i grader). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Får eller ställer in frustums långt avstånd. |
| [HotSpot](../../aspose.threed.entities/light/hotspot) { get; set; } | Hämtar eller ställer in hotspot-konvinkeln (i grader). |
| [Intensity](../../aspose.threed.entities/light/intensity) { get; set; } | Hämtar eller ställer in ljusets intensitet, standardvärde är 100 |
| [LightType](../../aspose.threed.entities/light/lighttype) { get; set; } | Hämtar eller ställer in ljusets typ |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation) { get; set; } | Hämtar eller ställer in den linjära dämpningen för att beräkna den totala dämpningen av light |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Får eller ställer in den intresserade positionen som kameran tittar på. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Får eller ställer in frustums närplansavstånd. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Hämtar eller ställer in höjden vid stum i ortografisk projektion. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Hämtar eller ställer in den första överordnade noden, om den första överordnade noden ställs in, kommer denna enhet att frikopplas från andra överordnade noder. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Hämtar alla överordnade noder, en enhet kan kopplas till flera överordnade noder för geometriinstansering |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation) { get; set; } | Hämtar eller ställer in den kvadratiska dämpningen för att beräkna den totala dämpningen av light |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Hämtar eller ställer in frustums orienteringsläge Den här egenskapen fungerar bara när[`Target`](../frustum/target) är null. Om värdet ärFixedTarget , riktningen beräknas alltid av fastigheten[`LookAt`](../frustum/lookat) Annars[`LookAt`](../frustum/lookat)beräknas alltid av[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Hämtar scenen som detta objekt tillhör |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor) { get; set; } | Hämtar eller ställer in skuggans färg. |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Hämtar eller ställer in målet som kameran tittar på. Om användaren stöder den här egenskapen bör det vara före[`LookAt`](../frustum/lookat) egenskap. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Hämtar eller ställer in uppriktningen för kameran |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Hittar egenskapen. Det kan vara en dynamisk egenskap (Skapad av CreateDynamicProperty/SetProperty) eller inbyggd egenskap (identifierad med dess namn) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Hämtar begränsningsrutan för nuvarande entitet i dess objektrymds koordinatsystem. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Hämtar nyckeln till entitetsrenderaren registrerad i renderaren |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Få värdet av specificerad egenskap |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Tar bort en dynamisk egenskap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Ta bort den angivna egenskapen identifierad av name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Anger värdet för specificerad egenskap |

### Se även

* class [Frustum](../frustum)
* namnutrymme [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
