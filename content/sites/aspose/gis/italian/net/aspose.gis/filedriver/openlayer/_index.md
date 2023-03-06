---
title: FileDriver.OpenLayer
second_title: Riferimento API Aspose.GIS per .NET
description: FileDriver metodo. Apre il livello per la lettura.
type: docs
weight: 90
url: /it/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

Apre il livello per la lettura.

```csharp
public VectorLayer OpenLayer(string path)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura della funzione dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i layer vettoriali (vedi[`CanOpenLayers`](../canopenlayers/)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Apre il livello per la lettura.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura della funzione dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i layer vettoriali (vedi[`CanOpenLayers`](../canopenlayers/)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

Apre il livello per la lettura.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |
| options | DriverOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura della funzione dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i layer vettoriali (vedi[`CanOpenLayers`](../canopenlayers/)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

Apre il livello per la lettura.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| options | DriverOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../vectorlayer/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura della funzione dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i layer vettoriali (vedi[`CanOpenLayers`](../canopenlayers/)). |

### Guarda anche

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)


