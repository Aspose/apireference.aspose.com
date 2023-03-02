---
title: FileGdbDriver.OpenDataset
second_title: Riferimento API Aspose.GIS per .NET
description: FileGdbDriver metodo. Apre il set di dati.
type: docs
weight: 70
url: /it/net/aspose.gis.formats.filegdb/filegdbdriver/opendataset/
---
## OpenDataset(string, FileGdbOptions) {#opendataset_5}

Apre il set di dati.

```csharp
public Dataset OpenDataset(string path, FileGdbOptions options)
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
| [GisException](../../../aspose.gis/gisexception/) | Errore durante la lettura del livello dal set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |

### Guarda anche

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Apre il set di dati.

```csharp
public override Dataset OpenDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../../aspose.gis/gisexception/) | Errore durante la lettura del livello dal set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |

### Guarda anche

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, FileGdbOptions) {#opendataset_2}

Apre il set di dati.

```csharp
public Dataset OpenDataset(AbstractPath path, FileGdbOptions options)
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
| [GisException](../../../aspose.gis/gisexception/) | Errore durante la lettura del livello dal set di dati. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i set di dati (vedere[`CanOpenDatasets`](../canopendatasets/)). |

### Guarda anche

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assemblea [Aspose.GIS](../../../)


