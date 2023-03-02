---
title: FileDriver.EditLayer
second_title: Riferimento API Aspose.GIS per .NET
description: FileDriver metodo. Apre un livello per la modifica.
type: docs
weight: 70
url: /it/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

Apre un livello per la modifica.

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
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

### Guarda anche

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Apre un livello per la modifica.

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
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
| NotSupportedException | Il driver non può modificare i livelli. |
| IOException | Si è verificato un errore di I/O. |

### Osservazioni

Il conducente crea uno strato interno con tutte le caratteristiche. Ma abbiamo la possibilità di utilizzare lo spazio su disco anziché la RAM. Esistono driver per un uso più ottimale delle risorse (vedere la documentazione specifica del driver). Anche il driver può modificare un livello Se può creare e aprire i livelli.

### Guarda anche

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* spazio dei nomi [Aspose.Gis](../../filedriver/)
* assemblea [Aspose.GIS](../../../)


