---
title: Class SVGPoint
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.DataTypes.SVGPoint klas. Viele der SVGDOMSchnittstellen beziehen sich auf Objekte der Klasse SVGPoint. Ein SVGPoint ist ein x yKoordinatenpaar. Bei Verwendung in Matrixoperationen wird ein SVGPoint als Vektor der Form behandelt x y 1 Wenn ein SVGRectObjekt als schreibgeschützt gekennzeichnet ist wird versucht es einem seiner Attribute zuzuweisen führen dazu dass eine Ausnahme ausgelöst wird.
type: docs
weight: 270
url: /de/net/aspose.svg.datatypes/svgpoint/
---
## SVGPoint class

Viele der SVG-DOM-Schnittstellen beziehen sich auf Objekte der Klasse SVGPoint. Ein SVGPoint ist ein (x, y)-Koordinatenpaar. Bei Verwendung in Matrixoperationen wird ein SVGPoint als Vektor der Form behandelt: [x] [y] [1] Wenn ein SVGRect-Objekt als schreibgeschützt gekennzeichnet ist, wird versucht, es einem seiner Attribute zuzuweisen führen dazu, dass eine Ausnahme ausgelöst wird.

```csharp
public class SVGPoint : SVGValueType
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [X](../../aspose.svg.datatypes/svgpoint/x/) { get; set; } | Die X-Koordinate. |
| [Y](../../aspose.svg.datatypes/svgpoint/y/) { get; set; } | Die Y-Koordinate. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Gibt nicht verwaltete und – optional – verwaltete Ressourcen frei. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Diese Methode wird zum Abrufen des ECMAScript-Objekts verwendetType . |
| [MatrixTransform](../../aspose.svg.datatypes/svgpoint/matrixtransform/)(SVGMatrix) | Wendet eine 2x3-Matrixtransformation auf dieses SVGPoint-Objekt an und gibt ein neues, transformiertes SVGPoint-Objekt zurück: newpoint = matrix* thispoint |
| override [ToString](../../aspose.svg.datatypes/svgpoint/tostring/)() | Gibt a zurückString die diese Instanz darstellt. |

### Siehe auch

* class [SVGValueType](../svgvaluetype/)
* namensraum [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* Montage [Aspose.SVG](../../)


