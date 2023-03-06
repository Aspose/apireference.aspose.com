---
title: Class VectorLayer
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.VectorLayer classe. Rappresenta un livello vettoriale. Un livello vettoriale è una raccolta di caratteristiche geografiche memorizzate in un file.
type: docs
weight: 2320
url: /it/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Rappresenta un livello vettoriale. Un livello vettoriale è una raccolta di caratteristiche geografiche, memorizzate in un file.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | Ottiene la raccolta di attributi personalizzati per le funzionalità in this`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | Ottiene il numero di elementi in questo layer. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | Ottiene il[`Driver`](./driver/) che ha istanziato questo livello. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | Ottiene il tipo di geometria per il layer. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | Ottiene il[`Feature`](../feature/) all'indice specificato. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Ottiene il sistema di riferimento spaziale di questa sequenza di feature. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | Crea il layer e lo apre per l'aggiunta di nuove feature. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | Crea il layer e lo apre per l'aggiunta di nuove feature. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Crea il layer e lo apre per l'aggiunta di nuove feature. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Crea il livello e lo apre per l'aggiunta. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | Crea il layer e lo apre per l'aggiunta di nuove feature. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | Crea il livello e lo apre per l'aggiunta. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Crea il livello e lo apre per l'aggiunta. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Crea il livello e lo apre per l'aggiunta. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | Apri il livello per la lettura. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | Apri il livello per la lettura. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Apri il livello per la lettura. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | Apri il livello per la lettura. |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | Aggiunge una nuova feature al layer, se supportata da`VectorLayer` S[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | Aggiunge una nuova geometria con lo stile specificato al layer, se supportato da`VectorLayer` S[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | Crea un layer clon come formato InMemory. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | Crea (ma non aggiunge al layer) una nuova feature con attributi corrispondenti alla raccolta di attributi di questo layer. Al termine dell'impostazione dei dati per la feature, utilizzare[`Add`](./add/) per aggiungere l'elemento al layer. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | Copia gli attributi di altri`VectorLayer` a questo. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Copia gli attributi di altri`VectorLayer` a questo. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | Rilascia le risorse utilizzate da`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | Determina se l'oggetto specificato è uguale all'oggetto corrente. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Restituisce un enumeratore che scorre la raccolta. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Ottiene un'estensione spaziale di questo livello. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | Unisce un livello al livello corrente. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | Ottiene la feature più vicina al punto fornito. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | Ottiene l'elemento più vicino alla coordinata fornita. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | Rimuovi il[`Feature`](../feature/) all'indice specificato. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | Sostituisci il[`Feature`](../feature/) all'indice specificato. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | Salva la sequenza delle geometrie nel layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | Salva la sequenza delle geometrie nel layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | Salva la sequenza delle geometrie nel layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | Salva la sequenza delle geometrie nel layer. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Dividi feature per tipo di geometria. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | Carica l'indice degli attributi per velocizzare il filtraggio in base al valore degli attributi nei metodi di filtro come[`WhereGreater`](../featuressequence/wheregreater/). Se l'indice non esiste, lo crea prima. Utilizzo*forceRebuild* per forzare la ricreazione dell'indice. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | Carica l'indice degli attributi per velocizzare il filtraggio in base al valore degli attributi nei metodi di filtro come[`WhereGreater`](../featuressequence/wheregreater/). Se l'indice non esiste, lo crea prima. Utilizzo*forceRebuild* per forzare la ricreazione dell'indice. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | Carica l'indice spaziale per velocizzare il filtraggio in base al valore degli attributi nei metodi di filtro come[`WhereIntersects`](../featuressequence/whereintersects/) e[`NearestTo`](./nearestto/). Se l'indice non esiste, lo crea prima. Utilizzo*forceRebuild* per forzare la ricreazione dell'indice. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | Carica l'indice spaziale per velocizzare il filtraggio in base al valore degli attributi nei metodi di filtro come[`WhereIntersects`](../featuressequence/whereintersects/) e[`NearestTo`](./nearestto/). Se l'indice non esiste, lo crea prima. Utilizzo*forceRebuild* per forzare la ricreazione dell'indice. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Seleziona le feature con un valore di attributo uguale al valore fornito. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Seleziona le feature con un valore di attributo maggiore del valore fornito. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Seleziona le feature con un valore di attributo maggiore o uguale al valore fornito. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | Filtra le funzionalità in base all'estensione. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | Filtra le feature in base all'unione di tutte le geometrie in una sequenza di altre feature. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | Filtra le feature in base alla geometria fornita. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Seleziona le caratteristiche con un valore di attributo diverso dal valore fornito. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Seleziona le feature con attributo diverso da null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Seleziona le feature con attributo uguale a null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Seleziona le funzioni con set di attributi. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Seleziona le funzionalità con un valore di attributo inferiore al valore fornito. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Seleziona le feature con un valore di attributo minore o uguale al valore fornito. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Seleziona le caratteristiche in cui l'attributo specificato non è impostato. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Converti un livello in un formato diverso. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | Converti un livello in un formato diverso. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Converti un livello in un formato diverso. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Converti un livello in un formato diverso. |

### Guarda anche

* class [FeaturesSequence](../featuressequence/)
* spazio dei nomi [Aspose.Gis](../../aspose.gis/)
* assemblea [Aspose.GIS](../../)


