---
title: Camera
second_title: Aspose.3D för .NET API-referens
description: Kameran beskriver ögonpunkten för betraktaren som tittar på scenen.
type: docs
weight: 250
url: /sv/net/aspose.threed.entities/camera/
---
## Camera class

Kameran beskriver ögonpunkten för betraktaren som tittar på scenen.

```csharp
public class Camera : Frustum
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Camera](camera#constructor)() | Initierar en ny instans av[`Camera`](../camera) class. |
| [Camera](camera#constructor_1)(ProjectionType) | Initierar en ny instans av[`Camera`](../camera) class. |
| [Camera](camera#constructor_2)(string) | Initierar en ny instans av[`Camera`](../camera) class. |
| [Camera](camera#constructor_3)(string, ProjectionType) | Initierar en ny instans av[`Camera`](../camera) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode) { get; set; } | Hämtar eller ställer in kamerans bländarläge |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Hämtar eller ställer in bildförhållandet för frustum |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio) { get; set; } | Hämtar eller ställer in bildförhållandet för vyplanet. |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Hämtar eller ställer in riktningen som kameran tittar på. Ändringar på den här egenskapen påverkar också[`LookAt`](../frustum/lookat) och[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Hämtar eller ställer in om den här entiteten ska exkluderas under export. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Får eller ställer in frustums långt avstånd. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview) { get; set; } | Hämtar eller ställer in kamerans synfält i grader, den här egenskapen används endast när ApertureMode ärHorizontal ellerVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx) { get; set; } | Hämtar eller ställer in kamerans horisontella synfält i grader, den här egenskapen används endast när ApertureMode ärHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy) { get; set; } | Hämtar eller ställer in kamerans vertikala synfält i grader, den här egenskapen används endast när ApertureMode ärHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height) { get; set; } | Hämtar eller ställer in vyplanets höjd mätt i tum |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Får eller ställer in den intresserade positionen som kameran tittar på. |
| [Magnification](../../aspose.threed.entities/camera/magnification) { get; set; } | Hämtar eller ställer in förstoringen som används i ortografisk kamera |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Får eller ställer in frustums närplansavstånd. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Hämtar eller ställer in höjden vid stum i ortografisk projektion. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Hämtar eller ställer in den första överordnade noden, om den första överordnade noden ställs in, kommer denna enhet att frikopplas från andra överordnade noder. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Hämtar alla överordnade noder, en enhet kan kopplas till flera överordnade noder för geometriinstansering |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype) { get; set; } | Hämtar eller ställer in kamerans projektionstyp. Som standard används perspektivprojektionen. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Hämtar eller ställer in frustums orienteringsläge Den här egenskapen fungerar bara när[`Target`](../frustum/target) är null. Om värdet ärFixedTarget , riktningen beräknas alltid av fastigheten[`LookAt`](../frustum/lookat) Annars[`LookAt`](../frustum/lookat)beräknas alltid av[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Hämtar scenen som detta objekt tillhör |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Hämtar eller ställer in målet som kameran tittar på. Om användaren stöder den här egenskapen bör det vara före[`LookAt`](../frustum/lookat) egenskap. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Hämtar eller ställer in uppriktningen för kameran |
| [Width](../../aspose.threed.entities/camera/width) { get; set; } | Hämtar eller ställer in vyplanets bredd mätt i tum |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Hittar egenskapen. Det kan vara en dynamisk egenskap (Skapad av CreateDynamicProperty/SetProperty) eller inbyggd egenskap (identifierad med dess namn) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Hämtar begränsningsrutan för nuvarande entitet i dess objektrymds koordinatsystem. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Hämtar nyckeln till entitetsrenderaren registrerad i renderaren |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Få värdet av specificerad egenskap |
| [MoveForward](../../aspose.threed.entities/camera/moveforward)(double) | Flytta kameran framåt mot dess riktning eller mål. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Tar bort en dynamisk egenskap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Ta bort den angivna egenskapen identifierad av name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Anger värdet för specificerad egenskap |

### Se även

* class [Frustum](../frustum)
* namnutrymme [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
