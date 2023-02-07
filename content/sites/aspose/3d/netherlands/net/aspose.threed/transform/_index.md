---
title: Transform
second_title: Aspose.3D voor .NET API-referentie
description: Een transformatie bevat informatie die toegang geeft tot de matrix voor vertalen/schalen/roteren of transformeren van het object tegen minimale kosten Dit wordt gebruikt door lokale transformatie.
type: docs
weight: 2400
url: /nl/net/aspose.threed/transform/
---
## Transform class

Een transformatie bevat informatie die toegang geeft tot de matrix voor vertalen/schalen/roteren of transformeren van het object tegen minimale kosten Dit wordt gebruikt door lokale transformatie.

```csharp
public class Transform : A3DObject
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles/) { get; set; } | Haalt of stelt de rotatie in die wordt weergegeven in Euler-hoeken, gemeten in graden |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation/) { get; set; } | Hiermee wordt de geometrische Euler-rotatie opgehaald of ingesteld (gemeten in graden). Geometrische transformatie is alleen van invloed op de gekoppelde entiteiten en laat de onderliggende knooppunten onaangetast. Het wordt samengevoegd als lokale transformatie wanneer u de geometrische transformatie exporteert naar bestandstypen die dit niet ondersteunen. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling/) { get; set; } | Haalt of stelt de geometrische schaal in. Geometrische transformatie is alleen van invloed op de gekoppelde entiteiten en laat de onderliggende knooppunten onaangetast. Het wordt samengevoegd als lokale transformatie wanneer u de geometrische transformatie exporteert naar bestandstypen die dit niet ondersteunen. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation/) { get; set; } | Haalt de geometrische vertaling op of stelt deze in. Geometrische transformatie is alleen van invloed op de gekoppelde entiteiten en laat de onderliggende knooppunten onaangetast. Het wordt samengevoegd als lokale transformatie wanneer u de geometrische transformatie exporteert naar bestandstypen die dit niet ondersteunen. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [PostRotation](../../aspose.threed/transform/postrotation/) { get; set; } | Krijgt of stelt de post-rotatie weergegeven in graden in |
| [PreRotation](../../aspose.threed/transform/prerotation/) { get; set; } | Haalt of stelt de pre-rotatie in die wordt weergegeven in graden |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [Rotation](../../aspose.threed/transform/rotation/) { get; set; } | Haalt of stelt de rotatie in die wordt weergegeven in quaternion. |
| [Scale](../../aspose.threed/transform/scale/) { get; set; } | Haalt of stelt de schaal in |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix/) { get; set; } | Haalt de transformatiematrix op of stelt deze in. |
| [Translation](../../aspose.threed/transform/translation/) { get; set; } | Haalt of stelt de vertaling in |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Verwijdert een dynamische eigenschap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Verwijder de gespecificeerde eigenschap geïdentificeerd door name |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles/)(double, double, double) | Stelt de Euler-hoeken in graden van stroomtransformatie in. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation/)(double, double, double) | Stelt de geometrische Euler-rotatie in (gemeten in graden). Geometrische transformatie is alleen van invloed op de gekoppelde entiteiten en laat de onderliggende knooppunten onaangetast. Het wordt samengevoegd als lokale transformatie wanneer u de geometrische transformatie exporteert naar bestandstypen die dit niet ondersteunen. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling/)(double, double, double) | Stelt de geometrische schaal in. Geometrische transformatie is alleen van invloed op de gekoppelde entiteiten en laat de onderliggende knooppunten onaangetast. Het wordt samengevoegd als lokale transformatie wanneer u de geometrische transformatie exporteert naar bestandstypen die dit niet ondersteunen. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation/)(double, double, double) | Stelt de geometrische vertaling in. Geometrische transformatie is alleen van invloed op de gekoppelde entiteiten en laat de onderliggende knooppunten onaangetast. Het wordt samengevoegd als lokale transformatie wanneer u de geometrische transformatie exporteert naar bestandstypen die dit niet ondersteunen. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation/)(double, double, double) | Stelt de post-rotatie in die wordt weergegeven in graden |
| [SetPreRotation](../../aspose.threed/transform/setprerotation/)(double, double, double) | Stelt de pre-rotatie in weergegeven in degree |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Stelt de waarde in van gespecificeerde eigenschap |
| [SetRotation](../../aspose.threed/transform/setrotation/)(double, double, double, double) | Stelt de rotatie in (als quaternioncomponenten) van de huidige transformatie. |
| [SetScale](../../aspose.threed/transform/setscale/)(double, double, double) | Stelt de schaal van huidige transformatie in. |
| [SetTranslation](../../aspose.threed/transform/settranslation/)(double, double, double) | Stelt de vertaling in van huidige transformatie. |

### Zie ook

* class [A3DObject](../a3dobject/)
* naamruimte [Aspose.ThreeD](../../aspose.threed/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
