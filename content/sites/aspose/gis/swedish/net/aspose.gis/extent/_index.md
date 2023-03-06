---
title: Class Extent
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Extent klass. En tvådimensionell rumslig begränsningslåda.
type: docs
weight: 120
url: /sv/net/aspose.gis/extent/
---
## Extent class

En tvådimensionell rumslig begränsningslåda.

```csharp
public class Extent : IEquatable<Extent>
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Extent](extent/#constructor)() | Skapar ny instans. |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | Skapar ny instans. |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | Skapar ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | Mitten av omfattningen. |
| [Height](../../aspose.gis/extent/height/) { get; } | Omfattningens höjd. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | Avgör om detta`Extent` är giltig. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) förknippas med denna omfattning. Kan vara`null` om[`SpatialReferenceSystem`](./spatialreferencesystem/) är okänd. Använd[`GetTransformed`](./gettransformed/) för att transformera utsträckning mellan rumsliga referenssystem med skillnader. |
| [Width](../../aspose.gis/extent/width/) { get; } | Omfattningens bredd. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | Maximalt värde för X-koordinaten. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | Minimivärdet för X-koordinaten. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Maximalt värde för Y-koordinaten. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Minsta värde för Y-koordinaten. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | Klonar den här instansen. |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | Avgör om denna utsträckning innehåller argumentet. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | Avgör om denna utsträckning innehåller argumentet. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | Bestämmer om denna utsträckning innehåller en koordinat som definieras av argumenten. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | Anger om det aktuella objektet är lika med ett annat objekt av samma typ. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | Bestämmer om det angivna objektet är lika med det aktuella objektet. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | Fungerar som standard hash-funktion. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | Returnerar ny utsträckning i specificerad[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) som innehåller denna utsträckning. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | Ökar denna utsträckning så att det inkluderar argumentet. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | Växer i denna utsträckning så att den inkluderar den angivna punkten. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | Växer denna utsträckning längs X-axeln så att den inkluderar det angivna värdet. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | Växer denna utsträckning längs Y-axeln så att den inkluderar det angivna värdet. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | Bestämmer om denna utsträckning skär med argumentet. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | Bestämmer om denna utsträckning skär med argumentet. |
| [Normalize](../../aspose.gis/extent/normalize/)() | Byten[`XMin`](./xmin/) med[`XMax`](./xmax/) om[`Width`](./width/) är negativ och [`YMin`](./ymin/) med[`YMax`](./ymax/) om[`Height`](./height/) är negativ. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | Konverterar denna utsträckning till en rektangulär polygon som representerar den. |
| override [ToString](../../aspose.gis/extent/tostring/)() | Returnerar en sträng som representerar det aktuella objektet. |
| [operator ==](../../aspose.gis/extent/op_equality/) | Implementerar operatorn '=='. |
| [operator !=](../../aspose.gis/extent/op_inequality/) | Implementerar operatorn '!='. |

### Se även

* namnutrymme [Aspose.Gis](../../aspose.gis/)
* hopsättning [Aspose.GIS](../../)


