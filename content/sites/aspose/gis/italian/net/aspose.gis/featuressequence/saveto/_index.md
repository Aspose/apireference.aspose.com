---
title: FeaturesSequence.SaveTo
second_title: Riferimento API Aspose.GIS per .NET
description: FeaturesSequence metodo. Salva la sequenza delle geometrie nel layer.
type: docs
weight: 50
url: /it/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

Salva la sequenza delle geometrie nel layer.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationPath | String | Percorso al livello di output. |
| destinationDriver | FileDriver | Il driver di formato per il livello di output. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Qualsiasi argomento è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura o la scrittura dell'elemento nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La trasformazione della geometria delle feature dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non è riuscita. |

### Guarda anche

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* spazio dei nomi [Aspose.Gis](../../featuressequence/)
* assemblea [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

Salva la sequenza delle geometrie nel layer.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationPath | AbstractPath | Percorso al livello di output. |
| destinationDriver | FileDriver | Il driver di formato per il livello di output. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [GisException](../../gisexception/) | Errore durante la lettura o la scrittura dell'elemento nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La trasformazione della geometria delle feature dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non è riuscita. |

### Guarda anche

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* spazio dei nomi [Aspose.Gis](../../featuressequence/)
* assemblea [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

Salva la sequenza delle geometrie nel layer.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationPath | String | Percorso al livello di output. |
| destinationDriver | FileDriver | Il driver di formato per il livello di output. |
| options | SavingOptions | Opzioni per la procedura di salvataggio. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [GisException](../../gisexception/) | Errore durante la lettura o la scrittura dell'elemento nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La trasformazione della geometria delle feature dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non è riuscita. |
| NotSupportedException | Sistema di riferimento spaziale specificato in*options* non è supportato da*destinationDriver* . |

### Guarda anche

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* spazio dei nomi [Aspose.Gis](../../featuressequence/)
* assemblea [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

Salva la sequenza delle geometrie nel layer.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationPath | AbstractPath | Percorso al livello di output. |
| destinationDriver | FileDriver | Il driver di formato per il livello di output. |
| options | SavingOptions | Opzioni per la procedura di salvataggio. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [GisException](../../gisexception/) | Errore durante la lettura o la scrittura dell'elemento nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La trasformazione della geometria delle feature dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non è riuscita. |
| NotSupportedException | Sistema di riferimento spaziale specificato in*options* non è supportato da*destinationDriver* . |

### Guarda anche

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* spazio dei nomi [Aspose.Gis](../../featuressequence/)
* assemblea [Aspose.GIS](../../../)


