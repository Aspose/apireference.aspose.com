---
title: SaveTo
second_title: Riferimento API Aspose.GIS per .NET
description: Salva la sequenza delle funzioni nel livello.
type: docs
weight: 50
url: /it/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

Salva la sequenza delle funzioni nel livello.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationPath | String | Percorso del livello di output. |
| destinationDriver | FileDriver | Il driver di formato per il livello di output. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Qualsiasi argomento lo è`null`. |
| [GisException](../../gisexception) | Errore durante la lettura o la scrittura della funzione nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Trasformazione della geometria delle caratteristiche dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non riuscita. |

### Guarda anche

* class [FileDriver](../../filedriver)
* class [FeaturesSequence](../../featuressequence)
* spazio dei nomi [Aspose.Gis](../../featuressequence)
* assemblea [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

Salva la sequenza delle funzioni nel livello.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationPath | AbstractPath | Percorso del livello di output. |
| destinationDriver | FileDriver | Il driver di formato per il livello di output. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [GisException](../../gisexception) | Errore durante la lettura o la scrittura della funzione nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Trasformazione della geometria delle caratteristiche dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non riuscita. |

### Guarda anche

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [FeaturesSequence](../../featuressequence)
* spazio dei nomi [Aspose.Gis](../../featuressequence)
* assemblea [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

Salva la sequenza delle funzioni nel livello.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationPath | String | Percorso del livello di output. |
| destinationDriver | FileDriver | Il driver di formato per il livello di output. |
| options | SavingOptions | Opzioni per la procedura di salvataggio. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [GisException](../../gisexception) | Errore durante la lettura o la scrittura della funzione nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Trasformazione della geometria delle caratteristiche dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non riuscita. |
| NotSupportedException | Sistema di riferimento spaziale specificato in*options*non è supportato da*destinationDriver* . |

### Guarda anche

* class [FileDriver](../../filedriver)
* class [SavingOptions](../../savingoptions)
* class [FeaturesSequence](../../featuressequence)
* spazio dei nomi [Aspose.Gis](../../featuressequence)
* assemblea [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

Salva la sequenza delle funzioni nel livello.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationPath | AbstractPath | Percorso del livello di output. |
| destinationDriver | FileDriver | Il driver di formato per il livello di output. |
| options | SavingOptions | Opzioni per la procedura di salvataggio. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [GisException](../../gisexception) | Errore durante la lettura o la scrittura della funzione nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Trasformazione della geometria delle caratteristiche dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non riuscita. |
| NotSupportedException | Sistema di riferimento spaziale specificato in*options*non è supportato da*destinationDriver* . |

### Guarda anche

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SavingOptions](../../savingoptions)
* class [FeaturesSequence](../../featuressequence)
* spazio dei nomi [Aspose.Gis](../../featuressequence)
* assemblea [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
