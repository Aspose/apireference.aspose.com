---
title: Class Feature
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Feature klas. Een geografisch kenmerk dat bestaat uit een geometrie en door de gebruiker gedefinieerde attributen.
type: docs
weight: 130
url: /nl/net/aspose.gis/feature/
---
## Feature class

Een geografisch kenmerk dat bestaat uit een geometrie en door de gebruiker gedefinieerde attributen.

```csharp
public class Feature
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | Haalt of stelt de geometrie van het object in. Kan niet`null` , gebruik[`Null`](../../aspose.gis.geometries/geometry/null/) om ontbrekende geometrie aan te geven. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | Kopieert waarden van attributen van een ander object. |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | Krijgt de waarde van een attribuut. |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | Krijgt de waarde van een attribuut. |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | Krijgt de waarde van een attribuut, of[`DefaultValue`](../featureattribute/defaultvalue/) als de waarde niet is ingesteld of`nul` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | Krijgt de waarde van een attribuut, of[`DefaultValue`](../featureattribute/defaultvalue/) als de waarde niet is ingesteld of`nul` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | Krijgt de waarde van een attribuut, of[`DefaultValue`](../featureattribute/defaultvalue/) als de waarde niet is ingesteld of`nul` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | Retourneert de waarden voor alle attributen in een array. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | Retourneert de waarden voor alle attributen in een array. Overweeg om te gebruiken[`GetValues`](./getvalues/) methode om extra geheugentoewijzing te vermijden. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | Haalt de waarden van een attributenreeks op als een lijst. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | Bepaalt of het opgegeven kenmerk expliciet is ingesteld op`nul` waarde. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | Controleert of de attribuutwaarde is ingesteld in deze feature. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | Stelt een nieuwe waarde van een attribuut in. |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | Stelt de waarde van het attribuut in op`nul` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | Stelt nieuwe waarden in voor alle attributen. Overweeg ook om[`CopyValues`](./copyvalues/) methode om instellingswaarden in één oproep te stroomlijnen. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | Verwijdert de attribuutwaarde van dit object. |

### Zie ook

* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


