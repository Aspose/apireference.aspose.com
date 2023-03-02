---
title: VectorLayer.Create
second_title: Riferimento API Aspose.GIS per .NET
description: VectorLayer metodo. Crea il layer e lo apre per laggiunta di nuove feature.
type: docs
weight: 10
url: /it/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Crea il layer e lo apre per l'aggiunta di nuove feature.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |
| driver | FileDriver | Driver da usare. |

### Valore di ritorno

Un livello di sola scrittura.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| [GisException](../../gisexception/) | Errore durante la scrittura dell'elemento nel file. |
| IOException | Si è verificato un errore di I/O. |

### Guarda anche

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Crea il layer e lo apre per l'aggiunta di nuove feature.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |
| driver | FileDriver | Driver da usare. |
| options | DriverOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un livello di sola scrittura.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| [GisException](../../gisexception/) | Errore durante la scrittura dell'elemento nel file. |
| IOException | Si è verificato un errore di I/O. |

### Guarda anche

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Crea il layer e lo apre per l'aggiunta di nuove feature.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| driver | FileDriver | Driver da usare. |

### Valore di ritorno

Un livello di sola scrittura.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| [GisException](../../gisexception/) | Errore durante la scrittura dell'elemento nel file. |
| IOException | Si è verificato un errore di I/O. |

### Guarda anche

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Crea il layer e lo apre per l'aggiunta di nuove feature.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| driver | FileDriver | Driver da usare. |
| options | DriverOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un livello di sola scrittura.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| [GisException](../../gisexception/) | Errore durante la scrittura dell'elemento nel file. |
| IOException | Si è verificato un errore di I/O. |

### Guarda anche

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Crea il livello e lo apre per l'aggiunta.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |
| driver | FileDriver | Driver da usare. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura o la scrittura dell'elemento nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il sistema di riferimento spaziale non è supportato dal driver. Utilizzare[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) per verificare se il sistema di riferimento spaziale è supportato. |

### Guarda anche

* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Crea il livello e lo apre per l'aggiunta.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| driver | FileDriver | Driver da usare. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura o la scrittura dell'elemento nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il sistema di riferimento spaziale non è supportato dal driver. Utilizzare[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) per verificare se il sistema di riferimento spaziale è supportato. |

### Guarda anche

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Crea il livello e lo apre per l'aggiunta.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |
| driver | FileDriver | Driver da usare. |
| options | DriverOptions | Opzioni specifiche del conducente. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| [GisException](../../gisexception/) | Errore durante la lettura o la scrittura dell'elemento nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il sistema di riferimento spaziale non è supportato dal driver. Utilizzare[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) per verificare se il sistema di riferimento spaziale è supportato. |

### Guarda anche

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Crea il livello e lo apre per l'aggiunta.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| driver | FileDriver | Driver da usare. |
| options | DriverOptions | Opzioni specifiche del conducente. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| [GisException](../../gisexception/) | Errore durante la lettura o la scrittura dell'elemento nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il sistema di riferimento spaziale non è supportato dal driver. Utilizzare[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) per verificare se il sistema di riferimento spaziale è supportato. |

### Guarda anche

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)


