---
title: FileDriver.CreateDataset
second_title: Riferimento API Aspose.GIS per .NET
description: FileDriver metodo. Crea un set di dati.
type: docs
weight: 50
url: /it/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

Crea un set di dati.

```csharp
public Dataset CreateDataset(string path)
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
| [GisException](../../gisexception/) | Errore durante la creazione del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Il set di dati esiste già. |

### Guarda anche

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

Crea un set di dati.

```csharp
public Dataset CreateDataset(AbstractPath path)
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
| [GisException](../../gisexception/) | Errore durante la creazione del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Il set di dati esiste già. |

### Guarda anche

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

Crea un set di dati.

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
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
| [GisException](../../gisexception/) | Errore durante la creazione del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Il set di dati esiste già. |

### Guarda anche

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Crea un set di dati.

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../gisexception/) | Errore durante la creazione del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Il set di dati esiste già. |

### Guarda anche

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)


