---
title: CreateLayer
second_title: Riferimento API Aspose.GIS per .NET
description: Crea il livello e lo apre per aggiungerlo.
type: docs
weight: 60
url: /it/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Crea il livello e lo apre per aggiungerlo.

```csharp
public VectorLayer CreateLayer(string path)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception) | Errore durante la scrittura della funzione nel file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può creare livelli vettoriali (vedi[`CanCreateLayers`](../cancreatelayers)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer)
* class [FileDriver](../../filedriver)
* spazio dei nomi [Aspose.Gis](../../filedriver)
* assemblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Crea il livello e lo apre per aggiungerlo.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception) | Errore durante la scrittura della funzione nel file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può creare livelli vettoriali (vedi[`CanCreateLayers`](../cancreatelayers)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* spazio dei nomi [Aspose.Gis](../../filedriver)
* assemblea [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Crea il livello e lo apre per aggiungerlo.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |
| options | DriverOptions | Opzioni specifiche del driver. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo errato per questo driver. |
| [GisException](../../gisexception) | Errore durante la scrittura della funzione nel file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può creare livelli vettoriali (vedi[`CanCreateLayers`](../cancreatelayers)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* spazio dei nomi [Aspose.Gis](../../filedriver)
* assemblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Crea il livello e lo apre per aggiungerlo.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| options | DriverOptions | Opzioni specifiche del driver. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo errato per questo driver. |
| [GisException](../../gisexception) | Errore durante la scrittura della funzione nel file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può creare livelli vettoriali (vedi[`CanCreateLayers`](../cancreatelayers)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* spazio dei nomi [Aspose.Gis](../../filedriver)
* assemblea [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Crea il livello e lo apre per aggiungerlo.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception) | Errore durante la scrittura della funzione nel file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il sistema di riferimento spaziale non è supportato dal driver. Utilizzare[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) per verificare se il sistema di riferimento spaziale è supportato. |

### Guarda anche

* class [VectorLayer](../../vectorlayer)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* spazio dei nomi [Aspose.Gis](../../filedriver)
* assemblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Crea il livello e lo apre per aggiungerlo.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception) | Errore durante la scrittura della funzione nel file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il sistema di riferimento spaziale non è supportato dal driver. Utilizzare[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) per verificare se il sistema di riferimento spaziale è supportato. |

### Guarda anche

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* spazio dei nomi [Aspose.Gis](../../filedriver)
* assemblea [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Crea il livello e lo apre per aggiungerlo.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |
| options | DriverOptions | Opzioni specifiche del driver. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo errato per questo driver. |
| [GisException](../../gisexception) | Errore durante la scrittura della funzione nel file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il sistema di riferimento spaziale non è supportato dal driver. Utilizzare[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) per verificare se il sistema di riferimento spaziale è supportato. |
| NotSupportedException | Il driver non può creare livelli vettoriali (vedi[`CanCreateLayers`](../cancreatelayers)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* spazio dei nomi [Aspose.Gis](../../filedriver)
* assemblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Crea il livello e lo apre per aggiungerlo.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| options | DriverOptions | Opzioni specifiche del driver. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo errato per questo driver. |
| [GisException](../../gisexception) | Errore durante la scrittura della funzione nel file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il sistema di riferimento spaziale non è supportato dal driver. Utilizzare[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) per verificare se il sistema di riferimento spaziale è supportato. |
| NotSupportedException | Il driver non può creare livelli vettoriali (vedi[`CanCreateLayers`](../cancreatelayers)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* spazio dei nomi [Aspose.Gis](../../filedriver)
* assemblea [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
