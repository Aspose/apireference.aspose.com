---
title: FileGdbDriver.CreateDataset
second_title: Riferimento API Aspose.GIS per .NET
description: FileGdbDriver metodo. Crea un set di dati.
type: docs
weight: 50
url: /it/net/aspose.gis.formats.filegdb/filegdbdriver/createdataset/
---
## CreateDataset(string, FileGdbOptions) {#createdataset_5}

Crea un set di dati.

```csharp
public Dataset CreateDataset(string path, FileGdbOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del set di dati. |
| options | FileGdbOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`Dataset`](../../../aspose.gis/dataset/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Errore durante la lettura del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)). |
| InvalidOperationException | Il set di dati esiste già. |

### Guarda anche

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assemblea [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Crea un set di dati.

```csharp
public override Dataset CreateDataset(AbstractPath path, DriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del set di dati. |
| options | DriverOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`Dataset`](../../../aspose.gis/dataset/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Errore durante la lettura del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)). |
| InvalidOperationException | Il set di dati esiste già. |

### Guarda anche

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assemblea [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, FileGdbOptions) {#createdataset_2}

Crea un set di dati.

```csharp
public Dataset CreateDataset(AbstractPath path, FileGdbOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del set di dati. |
| options | FileGdbOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`Dataset`](../../../aspose.gis/dataset/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| ArgumentNullException | Il percorso è`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Errore durante la lettura del set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)). |
| InvalidOperationException | Il set di dati esiste già. |

### Guarda anche

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assemblea [Aspose.GIS](../../../)


