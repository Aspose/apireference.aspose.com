---
title: NurbsCurve
second_title: Aspose.3D für .NET-API-Referenz
description: NURBS-Kurvehttps//en.wikipedia.org/wiki/Non-uniform_rational_B-spline ist eine Kurve dargestellt durch NURBS Non-Uniform Rational Basis Spline Eine NURBS-Kurve wird durch ihre definiertOrder./nurbscurve/order  eine Reihe von gewichtetenControlPoints./geometry/controlpoints und einKnotVectors./nurbscurve/knotvectors Die w-Komponente im Kontrollpunkt wird als Gewichtung des Kontrollpunkts verwendet unabhängig davon ob es sich um a handeltTwoDimensional oderThreeDimensional
type: docs
weight: 460
url: /de/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[NURBS-Kurve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) ist eine Kurve, dargestellt durch NURBS (Non-Uniform Rational Basis Spline), Eine NURBS-Kurve wird durch ihre definiert[`Order`](./order) , eine Reihe von gewichteten[`ControlPoints`](../geometry/controlpoints) und ein[`KnotVectors`](./knotvectors) Die w-Komponente im Kontrollpunkt wird als Gewichtung des Kontrollpunkts verwendet, unabhängig davon, ob es sich um a handeltTwoDimensional oderThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [NurbsCurve](nurbscurve#constructor)() | Initialisiert eine neue Instanz von[`NurbsCurve`](../nurbscurve) Klasse. |
| [NurbsCurve](nurbscurve#constructor_1)(string) | Initialisiert eine neue Instanz von[`NurbsCurve`](../nurbscurve) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color) { get; set; } | Liest oder setzt die Farbe der Linie, Standardwert ist weiß(1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints) { get; } | Ruft alle Kontrollpunkte ab |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype) { get; set; } | Holt oder setzt den Typ der Kurve. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension) { get; set; } | Ruft die Dimension der Kurve ab oder legt sie fest. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ruft ab oder legt fest, ob diese Entität während des Exports ausgeschlossen werden soll. |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors) { get; } | Ruft den Knotenvektor ab, es ist eine Folge von Parameterwerten, die bestimmt, wo und wie die Kontrollpunkte die NURBS-Kurve beeinflussen. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity) { get; } | Ruft die Multiplizität ab. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [Order](../../aspose.threed.entities/nurbscurve/order) { get; set; } | Ruft die Reihenfolge einer NURBS-Kurve ab oder legt sie fest. Sie definiert die Anzahl nahegelegener Kontrollpunkte, die einen bestimmten Punkt auf der Kurve beeinflussen. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ruft den ersten übergeordneten Knoten ab oder legt ihn fest. Wenn der erste übergeordnete Knoten festgelegt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ruft alle übergeordneten Knoten ab, eine Entität kann an mehrere übergeordnete Knoten angehängt werden, um Geometrie zu instanziieren |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [Rational](../../aspose.threed.entities/nurbscurve/rational) { get; set; } | Ruft ab oder legt fest, ob es rational ist, dieser Wert gibt an, ob dies der Fall ist[`NurbsCurve`](../nurbscurve) ist rationaler Spline oder nicht-rationaler Spline. Nicht-rationaler B-Spline ist ein Spezialfall von rationalen B-Splines. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate)(int) | NURBS-Kurve auswerten |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat)(double) | Kurvenpunkt an angegebener Position auswerten |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ruft den Begrenzungsrahmen des aktuellen Objekts in seinem Objektraum-Koordinatensystem ab. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey)() | Ruft den Schlüssel des Entity-Renderers ab, der im Renderer registriert ist |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |

### Siehe auch

* class [Curve](../curve)
* namensraum [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
