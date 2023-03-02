---
title: Class FeaturesSequence
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.FeaturesSequence classe. FeaturesSequence rappresenta un insieme di elementi vettoriali.
type: docs
weight: 170
url: /it/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` rappresenta un insieme di elementi vettoriali.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | Ottiene la raccolta di attributi personalizzati per le funzionalità in this[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Ottiene il sistema di riferimento spaziale di questa sequenza di feature. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Restituisce un enumeratore che scorre la raccolta. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Ottiene un'estensione spaziale di questo livello. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | Salva la sequenza delle geometrie nel layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | Salva la sequenza delle geometrie nel layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | Salva la sequenza delle geometrie nel layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | Salva la sequenza delle geometrie nel layer. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Dividi feature per tipo di geometria. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Seleziona le feature con un valore di attributo uguale al valore fornito. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Seleziona le feature con un valore di attributo maggiore del valore fornito. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Seleziona le feature con un valore di attributo maggiore o uguale al valore fornito. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | Filtra le funzionalità in base all'estensione. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | Filtra le feature in base all'unione di tutte le geometrie in una sequenza di altre feature. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | Filtra le feature in base alla geometria fornita. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Seleziona le caratteristiche con un valore di attributo diverso dal valore fornito. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Seleziona le feature con attributo diverso da null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Seleziona le feature con attributo uguale a null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Seleziona le funzioni con set di attributi. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Seleziona le funzionalità con un valore di attributo inferiore al valore fornito. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Seleziona le feature con un valore di attributo minore o uguale al valore fornito. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Seleziona le caratteristiche in cui l'attributo specificato non è impostato. |

### Guarda anche

* class [Feature](../feature/)
* spazio dei nomi [Aspose.Gis](../../aspose.gis/)
* assemblea [Aspose.GIS](../../)


