---
title: "TtfNameTable"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la tabella dei nomi del file di font TTF."
type: docs
weight: 105
url: /it/java/com.aspose.font/ttfnametable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfNameTable extends TtfTableBase
```

Rappresenta la tabella "name" del file di font TTF.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)](#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Estrae tutte le stringhe multilingue dall'oggetto mlNames passato e crea la struttura NameRecord corrispondente per ogni stringa estratta utilizzando i parametri passati platformId, platformSpecificId e nameId. |
| [addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)](#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-) | Aggiunge una voce nella tabella. |
| [deleteRecords(PlatformId platformId, int platformSpecificId)](#deleteRecords-com.aspose.font.PlatformId-int-) | Elimina tutti i record relativi alla piattaforma specificata |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Elimina tutti i record relativi ai parametri passati |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-) | Elimina i record relativi ai parametri specificati |
| [deleteRecordsByNameId(NameId nameId)](#deleteRecordsByNameId-com.aspose.font.NameId-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllNameRecords()](#getAllNameRecords--) | Restituisce tutte le strutture NameRecord dalla tabella. |
| [getClass()](#getClass--) |  |
| [getMultiLanguageNameById(NameId nameId)](#getMultiLanguageNameById-com.aspose.font.NameId-) | restituisce un nome per nameId |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-) | Restituisce un nome per nameId utilizzando l'identificatore di piattaforma passato. |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-) | Restituisce un nome come oggetto di tipo MultiLanguageString. |
| [getNameById(NameId nameId)](#getNameById-com.aspose.font.NameId-) | Restituisce un nome per nameId se trovato, null altrimenti. |
| [getNameRecordsByNameId(NameId nameId)](#getNameRecordsByNameId-com.aspose.font.NameId-) | Restituisce tutte le strutture NameRecord il cui campo NameId è uguale al valore nameId passato. |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getTag()](#getTag--) | Ottiene l'etichetta della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)](#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-) | Aggiorna il nome nei record relativi alla piattaforma specificata (combinazione di platformId e platformSpecificId), categoria (nameId) e lingua (languageId). |
| [updateNamesByNameId(NameId nameId, String newName)](#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-) | Seleziona tutti i record relativi alla categoria logica della stringa, specificata dal parametro nameId, e aggiorna il campo nome (dati della stringa) in questi record. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId) {#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)
```


Estrae tutte le stringhe multilingue dall'oggetto mlNames passato e crea la struttura NameRecord corrispondente per ogni stringa estratta utilizzando i parametri passati platformId, platformSpecificId e nameId. Il valore per il campo languageID è estratto dall'oggetto mlNames. Il nuovo record appena creato viene aggiunto alla tabella. Se viene trovato un record che coincide con quello appena creato per i campi platformID, platformSpecificID, nameID e languageId, il nuovo record non verrà aggiunto e solo i dati della stringa verranno aggiornati per il record esistente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| mlNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Stringa multilingue |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificatore di piattaforma |
| platformSpecificId | int | Identificatore di codifica specifico per la piattaforma |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificatore di nome, categoria logica della stringa, specificato dall'enumerazione NameId |

### addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name) {#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-}
```
public void addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)
```


Aggiunge una voce nella tabella. La categoria dei dati stringa da aggiungere è specificata dal parametro  name .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificatore del nome, categoria logica della stringa, specificata dall'enumerazione [NameId](../../com.aspose.font/nameid). |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificatore della piattaforma. |
| platformSpecificId | int | Identificatore della codifica specifica della piattaforma. Per favore, utilizza un valore da una di queste enumerazioni -  UnicodePlatformSpecificId ,  MacPlatformSpecificId ,  MSPlatformSpecificId . L'enumerazione da utilizzare è definita dal contesto ( parametro  platformId ). |
| languageId | int | Identificatore della lingua. Per favore, utilizza un valore dalle enumerazioni  MSLanguageId  o  MacLanguageId  a seconda del contesto, definito dal parametro  platformId . |
| nome | java.lang.String | Dati stringa effettivi. |

### deleteRecords(PlatformId platformId, int platformSpecificId) {#deleteRecords-com.aspose.font.PlatformId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId)
```


Elimina tutti i record relativi alla piattaforma specificata

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificatore di piattaforma |
| platformSpecificId | int | Identificatore di codifica specifico per la piattaforma |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)
```


Elimina tutti i record relativi ai parametri passati

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificatore di piattaforma |
| platformSpecificId | int | Identificatore di codifica specifico per la piattaforma |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificatore di nome, categoria logica della stringa, specificato dall'enumerazione NameId |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)
```


Elimina i record relativi ai parametri specificati

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificatore di piattaforma |
| platformSpecificId | int | Identificatore di codifica specifico per la piattaforma |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificatore di nome, categoria logica della stringa, specificato dall'enumerazione NameId |
| languageId | int | Identificatore della lingua |

### deleteRecordsByNameId(NameId nameId) {#deleteRecordsByNameId-com.aspose.font.NameId-}
```
public void deleteRecordsByNameId(NameId nameId)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) |  |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAllNameRecords() {#getAllNameRecords--}
```
public NameRecord[] getAllNameRecords()
```


Restituisce tutte le strutture NameRecord dalla tabella.

**Returns:**
com.aspose.font.NameRecord[] - Tutte le strutture  NameRecord  dalla tabella.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMultiLanguageNameById(NameId nameId) {#getMultiLanguageNameById-com.aspose.font.NameId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId)
```


restituisce un nome per nameId

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Id nome. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - name
### getMultiLanguageNameById(NameId nameId, PlatformId platformId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId)
```


Restituisce un nome per nameId utilizzando l'identificatore di piattaforma passato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Id Nome. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | ID piattaforma. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)
```


Restituisce un nome come oggetto di tipo  MultiLanguageString . Il metodo raccoglie tutte le strutture NameRecord che coincidono con i parametri passati nameId, platformId e platformSpecificId e quindi costruisce l'oggetto risultante basandosi su questa lista di strutture.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Id Nome. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | ID piattaforma. |
| platformSpecificId | int | Id specifico della piattaforma. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getNameById(NameId nameId) {#getNameById-com.aspose.font.NameId-}
```
public String getNameById(NameId nameId)
```


Restituisce un nome per nameId se trovato, null altrimenti.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | identificatore del nome |

**Returns:**
java.lang.String - nome
### getNameRecordsByNameId(NameId nameId) {#getNameRecordsByNameId-com.aspose.font.NameId-}
```
public NameRecord[] getNameRecordsByNameId(NameId nameId)
```


Restituisce tutte le strutture  NameRecord  il cui campo NameId è uguale al valore  nameId  passato. Se non vengono trovati record, verrà restituito un array vuoto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | identificatore del nome |

**Returns:**
com.aspose.font.NameRecord[] - Array di strutture  NameRecord 
### getOffset() {#getOffset--}
```
public long getOffset()
```


Ottiene l'offset dall'inizio di sfnt.

**Returns:**
long - Offset dall'inizio di sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Ottiene l'etichetta della tabella.

**Returns:**
java.lang.String - Etichetta della tabella.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Riferimento al repository della tabella TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName) {#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-}
```
public void updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)
```


Aggiorna il nome nei record relativi alla piattaforma specificata (combinazione di platformId e platformSpecificId), categoria (nameId) e lingua (languageId).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificatore di piattaforma |
| platformSpecificId | int | Identificatore di codifica specifico per la piattaforma |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificatore di nome, categoria logica della stringa, specificato dall'enumerazione NameId |
| languageId | int | Identificatore della lingua |
| newName | java.lang.String | Nuovo nome o nuovi dati stringa |

### updateNamesByNameId(NameId nameId, String newName) {#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-}
```
public void updateNamesByNameId(NameId nameId, String newName)
```


Seleziona tutti i record relativi alla categoria logica della stringa, specificata dal parametro nameId, e aggiorna il campo name (dati stringa) in questi record. I campi relativi alla piattaforma (platformID, Platform-specific encoding ID) e alla lingua (Language ID) non sono influenzati da questo metodo. Solo i dati stringa del nome vengono sostituiti con un nuovo nome. Usa questo metodo con cautela, poiché sostituirà i nomi originali per tutte le piattaforme e lingue correlate a nameId. Può creare conflitti nei casi in cui i nomi originali avevano valori diversi, poiché l'operazione di sostituzione cambia tutti questi valori con un unico nuovo valore. E questo nuovo valore può presentare un'incoerenza logica con alcune piattaforme e lingue. Questo metodo è utile nei casi in cui il nome originale ha una rappresentazione unica per tutte le piattaforme e lingue, ad esempio quando i dati stringa del nome sono in lingua inglese.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificatore di nome, categoria logica della stringa, specificato dall'enumerazione NameId |
| newName | java.lang.String | Nuovo nome o nuovi dati stringa |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

