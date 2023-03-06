---
title: DatabaseDriver.OpenDataset
second_title: Riferimento API Aspose.GIS per .NET
description: DatabaseDriver metodo. Apre il set di dati.
type: docs
weight: 10
url: /it/net/aspose.gis/databasedriver/opendataset/
---
## DatabaseDriver.OpenDataset method

Apre il set di dati.

```csharp
public abstract Dataset OpenDataset(IDbConnection connection)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| connection | IDbConnection | Connessione aperta al database. |

### Valore di ritorno

Un'istanza di[`Dataset`](../../dataset/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | La connessione è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura del set di dati. |
| IOException | Si è verificato un errore di I/O. |

### Guarda anche

* class [Dataset](../../dataset/)
* class [DatabaseDriver](../)
* spazio dei nomi [Aspose.Gis](../../databasedriver/)
* assemblea [Aspose.GIS](../../../)


