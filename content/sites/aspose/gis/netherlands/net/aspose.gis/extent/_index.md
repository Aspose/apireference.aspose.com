---
title: Class Extent
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Extent klas. Een tweedimensionaal ruimtelijk begrenzingskader.
type: docs
weight: 120
url: /nl/net/aspose.gis/extent/
---
## Extent class

Een tweedimensionaal ruimtelijk begrenzingskader.

```csharp
public class Extent : IEquatable<Extent>
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Extent](extent/#constructor)() | Maakt nieuwe instantie aan. |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | Maakt nieuwe instantie aan. |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | Maakt nieuwe instantie aan. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | Centrum van de omvang. |
| [Height](../../aspose.gis/extent/height/) { get; } | Hoogte van de omvang. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | Bepaalt of dit`Extent` is geldig. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) geassocieerd met dit bereik. Kan zijn`null` als[`SpatialReferenceSystem`](./spatialreferencesystem/) is onbekend. Gebruik[`GetTransformed`](./gettransformed/) om de omvang tussen verschillende ruimtelijke referentiesystemen te transformeren. |
| [Width](../../aspose.gis/extent/width/) { get; } | Breedte van de omvang. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | Maximale waarde van de X-coördinaat. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | Minimale waarde van de X-coördinaat. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Maximale waarde van de Y-coördinaat. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Minimale waarde van de Y-coördinaat. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | Kloont deze instantie. |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | Bepaalt of dit bereik het argument bevat. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | Bepaalt of dit bereik het argument bevat. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | Bepaalt of dit bereik een coördinaat bevat dat is gedefinieerd door de argumenten. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | Geeft aan of het huidige object gelijk is aan een ander object van hetzelfde type. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | Bepaalt of het opgegeven object gelijk is aan het huidige object. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | Dient als de standaard hash-functie. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | Retourneert nieuw bereik in gespecificeerd[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) die deze omvang bevat. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | Groeit zo, dus het bevat het argument. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | Groeit zo ver zodat het het gespecificeerde punt bevat. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | Groeit zo lang langs de X-as zodat het de opgegeven waarde bevat. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | Groeit zo lang langs de Y-as zodat het de opgegeven waarde bevat. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | Bepaalt of dit bereik het argument kruist. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | Bepaalt of dit bereik het argument kruist. |
| [Normalize](../../aspose.gis/extent/normalize/)() | Wissels[`XMin`](./xmin/) met[`XMax`](./xmax/) als[`Width`](./width/) is negatief and [`YMin`](./ymin/) met[`YMax`](./ymax/) als[`Height`](./height/) is negatief. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | Converteert dit bereik naar een rechthoekige polygoon die het vertegenwoordigt. |
| override [ToString](../../aspose.gis/extent/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [operator ==](../../aspose.gis/extent/op_equality/) | Implementeert de operator '=='. |
| [operator !=](../../aspose.gis/extent/op_inequality/) | Implementeert de '!=' operator. |

### Zie ook

* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


