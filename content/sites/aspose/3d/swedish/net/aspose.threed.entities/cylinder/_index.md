---
title: Cylinder
second_title: Aspose.3D för .NET API-referens
description: Parameterized Cylinder. Den kan också användas för att representera konen när en av radiusTop/radiusBottom är noll.
type: docs
weight: 310
url: /sv/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Parameterized Cylinder. Den kan också användas för att representera konen när en av radiusTop/radiusBottom är noll.

```csharp
public class Cylinder : Primitive
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Cylinder](cylinder#constructor)() | Initierar en ny instans av[`Cylinder`](../cylinder) class. |
| [Cylinder](cylinder#constructor_1)(double, double) | Initierar en ny instans av[`Cylinder`](../cylinder) class. |
| [Cylinder](cylinder#constructor_2)(double, double, double) | Initierar en ny instans av[`Cylinder`](../cylinder) class. |
| [Cylinder](cylinder#constructor_3)(double, double, double, int, int, bool) | Initierar en ny instans av[`Cylinder`](../cylinder) class. |
| [Cylinder](cylinder#constructor_4)(string, double, double, double, int, int, bool, double, double) | Initierar en ny instans av[`Cylinder`](../cylinder) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows) { get; set; } | Hämtar eller ställer in om denna geometri kan kasta skugga |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Hämtar eller ställer in om den här entiteten ska exkluderas under export. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder) { get; set; } | Hämtar eller ställer in om fläktcylindern ska genereras när ThetaLength är mindre än 2*PI, annars kommer modellen inte att skäras. |
| [Height](../../aspose.threed.entities/cylinder/height) { get; set; } | Hämtar eller ställer in höjden på cylindern. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments) { get; set; } | Hämtar eller ställer in höjdsegmenten. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom) { get; set; } | Hämtar eller ställer in transformationsoffset för vertex på undersidan. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop) { get; set; } | Hämtar eller ställer in transformationsförskjutningen för vertex på översidan. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended) { get; set; } | Hämtar eller ställer in ett värde som indikerar om detta[`Cylinder`](../cylinder) open ended. Standardvärdet är false. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Hämtar eller ställer in den första överordnade noden, om den första överordnade noden ställs in, kommer denna enhet att frikopplas från andra överordnade noder. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Hämtar alla överordnade noder, en enhet kan kopplas till flera överordnade noder för geometriinstansering |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments) { get; set; } | Hämtar eller ställer in de radiella segmenten. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom) { get; set; } | Hämtar eller ställer in radien för cylinderns bottenlock. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop) { get; set; } | Hämtar eller ställer in radien för cylinderns topplock. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows) { get; set; } | Hämtar eller ställer in om denna geometri kan ta emot skugga. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Hämtar scenen som detta objekt tillhör |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom) { get; set; } | Hämtar eller sätter av skjuvtransformeringen av undersidan, vektor lagrar skjuvvärdet (x-axeln, z-axeln) som mäts i radianer, standardvärdet är (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop) { get; set; } | Hämtar eller sätter av skjuvtransformeringen av översidan, vektor lagrar skjuvvärdet (x-axeln, z-axeln) som mäts i radian, standardvärdet är (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength) { get; set; } | Hämtar eller ställer in längden på theta. Standardvärdet är 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart) { get; set; } | Hämtar eller ställer in theta-starten. Standardvärdet är 0. |

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
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh)() | Konvertera aktuellt objekt till mesh |

### Se även

* class [Primitive](../primitive)
* namnutrymme [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
