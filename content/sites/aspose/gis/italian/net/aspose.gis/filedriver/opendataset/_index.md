---
title: FileDriver.OpenDataset
second_title: Riferimento API Aspose.GIS per .NET
description: FileDriver metodo. Apre il set di dati.
type: docs
weight: 80
url: /it/net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

Apre il set di dati.

```csharp
public Dataset OpenDataset(string path)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del set di dati. |

### Valore di ritorno

Un'istanza di[`Dataset`](../../dataset/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |

### Guarda anche

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

Apre il set di dati.

```csharp
public Dataset OpenDataset(AbstractPath path)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del set di dati. |

### Valore di ritorno

Un'istanza di[`Dataset`](../../dataset/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |

### Guarda anche

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

Apre il set di dati.

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del set di dati. |
| options | DriverOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`Dataset`](../../dataset/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |

### Guarda anche

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Apre il set di dati.

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del set di dati. |
| options | DriverOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`Dataset`](../../dataset/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |

### Guarda anche

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)


