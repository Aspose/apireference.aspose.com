---
title: Convert
second_title: Riferimento API Aspose.GIS per .NET
description: Converti un livello in un formato diverso.
type: docs
weight: 180
url: /it/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Converti un livello in un formato diverso.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sourcePath | String | Percorso del livello che verrà convertito. |
| sourceDriver | FileDriver | Il driver di formato per il livello di origine. |
| destinationPath | String | Percorso del livello che verrà creato a seguito della conversione. |
| destinationDriver | FileDriver | Il driver di formato per il livello di destinazione. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Entrambi i percorsi lo sono`null`. |

### Guarda anche

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* spazio dei nomi [Aspose.Gis](../../vectorlayer)
* assemblea [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Converti un livello in un formato diverso.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sourcePath | AbstractPath | Percorso del livello che verrà convertito. |
| sourceDriver | FileDriver | Il driver di formato per il livello di origine. |
| destinationPath | AbstractPath | Percorso del livello che verrà creato a seguito della conversione. |
| destinationDriver | FileDriver | Il driver di formato per il livello di destinazione. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Entrambi i percorsi lo sono`null`. |

### Guarda anche

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* spazio dei nomi [Aspose.Gis](../../vectorlayer)
* assemblea [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Converti un livello in un formato diverso.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sourcePath | String | Percorso del livello che verrà convertito. |
| sourceDriver | FileDriver | Il driver di formato per il livello di origine. |
| destinationPath | String | Percorso del livello che verrà creato a seguito della conversione. |
| destinationDriver | FileDriver | Il driver di formato per il livello di destinazione. |
| options | ConversionOptions | Opzioni per la procedura di conversione. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Entrambi i percorsi lo sono`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo errato per questo driver. |
| [GisException](../../gisexception) | Errore durante la lettura o la scrittura della funzione nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Sistema di riferimento spaziale specificato in*options*non è supportato da*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Trasformazione della geometria delle caratteristiche dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non riuscita. |

### Guarda anche

* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* spazio dei nomi [Aspose.Gis](../../vectorlayer)
* assemblea [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Converti un livello in un formato diverso.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sourcePath | AbstractPath | Percorso del livello che verrà convertito. |
| sourceDriver | FileDriver | Il driver di formato per il livello di origine. |
| destinationPath | AbstractPath | Percorso del livello che verrà creato a seguito della conversione. |
| destinationDriver | FileDriver | Il driver di formato per il livello di destinazione. |
| options | ConversionOptions | Opzioni per la procedura di conversione. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Entrambi i percorsi lo sono`null`. |
| ArgumentException | L'oggetto Opzioni ha un tipo errato per questo driver. |
| [GisException](../../gisexception) | Errore durante la lettura o la scrittura della funzione nel/dal file. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Sistema di riferimento spaziale specificato in*options*non è supportato da*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Trasformazione della geometria delle caratteristiche dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione non riuscita. |

### Guarda anche

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* spazio dei nomi [Aspose.Gis](../../vectorlayer)
* assemblea [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
