---
title: Class SVGPoint
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.DataTypes.SVGPoint klas. Veel van de SVG DOMinterfaces verwijzen naar objecten van de klasse SVGPoint. Een SVGPoint is een x y coördinatenpaar. Bij gebruik in matrixbewerkingen wordt een SVGPoint behandeld als een vector van de vorm x y 1 Als een SVGRectobject is aangewezen als alleenlezen zal een poging om een van zijn attributen toe te wijzen resulteert in een uitzondering die wordt gegenereerd.
type: docs
weight: 270
url: /nl/net/aspose.svg.datatypes/svgpoint/
---
## SVGPoint class

Veel van de SVG DOM-interfaces verwijzen naar objecten van de klasse SVGPoint. Een SVGPoint is een (x, y) coördinatenpaar. Bij gebruik in matrixbewerkingen wordt een SVGPoint behandeld als een vector van de vorm: [x] [y] [1] Als een SVGRect-object is aangewezen als alleen-lezen, zal een poging om een van zijn attributen toe te wijzen resulteert in een uitzondering die wordt gegenereerd.

```csharp
public class SVGPoint : SVGValueType
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [X](../../aspose.svg.datatypes/svgpoint/x/) { get; set; } | De X-coördinaat. |
| [Y](../../aspose.svg.datatypes/svgpoint/y/) { get; set; } | De Y-coördinaat. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Geeft onbeheerde en - optioneel - beheerde bronnen vrij. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Deze methode wordt gebruikt om het ECMAScript-object op te halenType . |
| [MatrixTransform](../../aspose.svg.datatypes/svgpoint/matrixtransform/)(SVGMatrix) | Past een 2x3 matrixtransformatie toe op dit SVGPoint-object en retourneert een nieuw, getransformeerd SVGPoint-object: newpoint = matrix* thispoint |
| override [ToString](../../aspose.svg.datatypes/svgpoint/tostring/)() | Geeft als resultaat eenString die deze instantie vertegenwoordigt. |

### Zie ook

* class [SVGValueType](../svgvaluetype/)
* naamruimte [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* montage [Aspose.SVG](../../)


