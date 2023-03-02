---
title: Class FeaturesSequence
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.FeaturesSequence klas. FeaturesSequence stellt eine Reihe von Vektormerkmalen dar.
type: docs
weight: 170
url: /de/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` stellt eine Reihe von Vektormerkmalen dar.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | Ruft die Sammlung von benutzerdefinierten Attributen für Features in this ab[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Ruft das räumliche Bezugssystem dieser Feature-Sequenz ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Gibt einen Enumerator zurück, der die Sammlung durchläuft. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Ruft eine räumliche Ausdehnung dieser Ebene ab. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | Speichert die Feature-Sequenz im Layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | Speichert die Feature-Sequenz im Layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | Speichert die Feature-Sequenz im Layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | Speichert die Feature-Sequenz im Layer. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Teilen Sie Features nach Geometrietyp. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Wählt Features aus, deren Attributwert gleich dem angegebenen Wert ist. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Wählt Features aus, deren Attributwert größer als der angegebene Wert ist. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Wählt Features aus, deren Attributwert größer oder gleich dem angegebenen Wert ist. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | Filtert Features basierend auf der Ausdehnung. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | Filtert Features basierend auf der Vereinigung aller Geometrien in einer anderen Feature-Sequenz. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | Filtert Features basierend auf der bereitgestellten Geometrie. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Wählt Features aus, deren Attributwert nicht dem angegebenen Wert entspricht. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Wählt Features mit Attribut ungleich null aus. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Wählt Features mit einem Attribut gleich null aus. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Wählt Features mit festgelegtem Attribut aus. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Wählt Features aus, deren Attributwert kleiner als der angegebene Wert ist. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Wählt Features aus, deren Attributwert kleiner oder gleich dem angegebenen Wert ist. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Wählt Features aus, bei denen das angegebene Attribut nicht festgelegt ist. |

### Siehe auch

* class [Feature](../feature/)
* namensraum [Aspose.Gis](../../aspose.gis/)
* Montage [Aspose.GIS](../../)


