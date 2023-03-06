---
title: Class FeaturesSequence
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.FeaturesSequence klas. FeaturesSequence vertegenwoordigt een reeks vectorkenmerken.
type: docs
weight: 170
url: /nl/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` vertegenwoordigt een reeks vectorkenmerken.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | Haalt de verzameling aangepaste attributen op voor objecten hierin[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Krijgt een ruimtelijk referentiesysteem van deze kenmerkenreeks. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Retourneert een enumerator die de verzameling herhaalt. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Krijgt een ruimtelijke omvang van deze laag. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | Slaat de volgorde van objecten op naar laag. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | Slaat de volgorde van objecten op naar laag. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | Slaat de volgorde van objecten op naar laag. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | Slaat de volgorde van objecten op naar laag. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Objecten splitsen op type geometrie. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Selecteert objecten met een attribuutwaarde die gelijk is aan de opgegeven waarde. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Selecteert objecten met een attribuutwaarde die groter is dan de opgegeven waarde. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Selecteert objecten met een attribuutwaarde die groter of gelijk is aan de opgegeven waarde. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | Filtert functies op basis van de omvang. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | Filtert objecten op basis van de vereniging van alle geometrieën in andere volgorde van objecten. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | Filtert objecten op basis van de geleverde geometrie. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Selecteert objecten met een attribuutwaarde die niet gelijk is aan de opgegeven waarde. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Selecteert objecten met attribuut niet gelijk aan null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Selecteert objecten met attribuut gelijk aan null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Selecteert objecten met attribuutset. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Selecteert objecten met een attribuutwaarde die kleiner is dan de opgegeven waarde. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Selecteert objecten met een attribuutwaarde die kleiner of gelijk is aan de opgegeven waarde. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Selecteert objecten waar het gespecificeerde attribuut niet is ingesteld. |

### Zie ook

* class [Feature](../feature/)
* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


