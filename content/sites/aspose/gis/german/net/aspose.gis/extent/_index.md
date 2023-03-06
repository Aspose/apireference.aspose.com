---
title: Class Extent
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Extent klas. Ein zweidimensionaler räumlicher Begrenzungsrahmen.
type: docs
weight: 120
url: /de/net/aspose.gis/extent/
---
## Extent class

Ein zweidimensionaler räumlicher Begrenzungsrahmen.

```csharp
public class Extent : IEquatable<Extent>
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Extent](extent/#constructor)() | Erstellt eine neue Instanz. |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | Erstellt eine neue Instanz. |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | Zentrum der Ausdehnung. |
| [Height](../../aspose.gis/extent/height/) { get; } | Höhe des Umfangs. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | Bestimmt, ob dies`Extent` ist gültig. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) mit diesem Umfang verbunden. Kann sein`null` Wenn[`SpatialReferenceSystem`](./spatialreferencesystem/) ist unbekannt. Verwenden[`GetTransformed`](./gettransformed/) um die Ausdehnung zwischen unterschiedlichen Raumbezugssystemen zu transformieren. |
| [Width](../../aspose.gis/extent/width/) { get; } | Breite der Ausdehnung. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | Maximalwert der X-Koordinate. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | Minimalwert der X-Koordinate. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Maximalwert der Y-Koordinate. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Minimalwert der Y-Koordinate. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | Klont diese Instanz. |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | Bestimmt, ob dieser Extent das Argument enthält. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | Bestimmt, ob dieser Extent das Argument enthält. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | Bestimmt, ob diese Ausdehnung eine durch die Argumente definierte Koordinate enthält. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | Gibt an, ob das aktuelle Objekt gleich einem anderen Objekt desselben Typs ist. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | Bestimmt, ob das angegebene Objekt gleich dem aktuellen Objekt ist. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | Dient als Standard-Hash-Funktion. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | Gibt einen neuen Extent in angegeben zurück[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) das diesen Extent enthält. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | Erhöht diese Ausdehnung, sodass es das Argument enthält. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | Vergrößert diese Ausdehnung, sodass sie den angegebenen Punkt enthält. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | Vergrößert diese Ausdehnung entlang der X-Achse, sodass sie den angegebenen Wert enthält. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | Vergrößert diese Ausdehnung entlang der Y-Achse, sodass sie den angegebenen Wert enthält. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | Bestimmt, ob sich diese Ausdehnung mit dem Argument schneidet. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | Bestimmt, ob sich diese Ausdehnung mit dem Argument schneidet. |
| [Normalize](../../aspose.gis/extent/normalize/)() | Tauscht[`XMin`](./xmin/) mit[`XMax`](./xmax/) Wenn[`Width`](./width/) ist negativ und [`YMin`](./ymin/) mit[`YMax`](./ymax/) Wenn[`Height`](./height/) ist negativ. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | Konvertiert diese Ausdehnung in ein rechteckiges Polygon, das sie darstellt. |
| override [ToString](../../aspose.gis/extent/tostring/)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| [operator ==](../../aspose.gis/extent/op_equality/) | Implementiert den '=='-Operator. |
| [operator !=](../../aspose.gis/extent/op_inequality/) | Implementiert den '!='-Operator. |

### Siehe auch

* namensraum [Aspose.Gis](../../aspose.gis/)
* Montage [Aspose.GIS](../../)


