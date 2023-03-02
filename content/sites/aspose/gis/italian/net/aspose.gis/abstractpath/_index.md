---
title: Class AbstractPath
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.AbstractPath classe. AnAbstractPath è una classe base per classi che specificano una posizione univoca in un ambiente simile a un filesystem come un filesystem locale un archivio file remoto o un archivio ZIP tra gli altri.
type: docs
weight: 10
url: /it/net/aspose.gis/abstractpath/
---
## AbstractPath class

An`AbstractPath` è una classe base per classi che specificano una posizione univoca in un ambiente simile a un filesystem, come un filesystem locale, un archivio file remoto o un archivio ZIP, tra gli altri.

```csharp
public abstract class AbstractPath
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Ottiene una rappresentazione di stringa della posizione di this`AbstractPath` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Ottiene un carattere separatore utilizzato per separare i livelli di directory di[`Location`](./location/) corda. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | Crea un file`AbstractPath` che rappresenta una posizione nel filesystem locale. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | Crea un file`AbstractPath` da unStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Combina questo`AbstractPath` con componenti di percorso specificati. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Elimina un file indicato da questo percorso. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Restituisce l'estensione di this`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Restituisce il nome del file e l'estensione di this`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Restituisce il nome del file di this`AbstractPath` senza l'estensione. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Ottiene un valore che indica se questo percorso punta a un file esistente che può essere aperto per la lettura. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Restituisce i percorsi situati all'interno di questo`AbstractPath` , se si tratta di una directory. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Apre questo`AbstractPath`come file. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Restituisce un nuovo`AbstractPath` con l'estensione del file modificata nel valore specificato. |

### Osservazioni

An`AbstractPath` potrebbe specificare un percorso in un file system locale, un percorso in un file system remoto o un'archiviazione esterna come l'archiviazione BLOB di Azure e così via. La posizione potrebbe puntare a oggetti simili a file esistenti o non esistenti , oggetti simili a directory o avere qualsiasi altro significato ragionevole per l'ambiente a cui appartiene. Ad esempio, an`AbstractPath` l'erede che rappresenta una posizione nel filesystem locale può puntare a un file, una directory esistente oa una posizione nel filesystem che non è stata ancora creata. Per rendere disponibile un nuovo spazio di archiviazione simile a un filesystem`Aspose.GIS` si dovrebbe ereditare questa classe e implementare i suoi metodi astratti.

### Guarda anche

* spazio dei nomi [Aspose.Gis](../../aspose.gis/)
* assemblea [Aspose.GIS](../../)


