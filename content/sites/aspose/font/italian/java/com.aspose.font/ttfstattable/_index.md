---
title: "TtfStatTable"
second_title: "Riferimento API Aspose.Font per Java"
description: 
type: docs
weight: 109
url: /it/java/com.aspose.font/ttfstattable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfStatTable extends TtfTableBase
```
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [addAxisRecord(AxisRecord axisRecord)](#addAxisRecord-com.aspose.font.AxisRecord-) | Aggiunge una struttura Axis Record alla tabella. |
| [addAxisValueTable(AxisValueTableBase axisValueTable)](#addAxisValueTable-com.aspose.font.AxisValueTableBase-) | Aggiunge una struttura Axis Value Table alla tabella. |
| [clearAxisRecords()](#clearAxisRecords--) | Rimuove tutti i record degli assi dalla tabella. |
| [clearAxisValueTables()](#clearAxisValueTables--) | Rimuove tutte le tabelle dei valori degli assi dalla tabella. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisRecords()](#getAxisRecords--) | Restituisce l'array degli assi di design. |
| [getAxisValueCount()](#getAxisValueCount--) | Restituisce il numero di tabelle dei valori degli assi. |
| [getAxisValueTables()](#getAxisValueTables--) | Restituisce l'array di Axis Value Tables. |
| [getClass()](#getClass--) |  |
| [getDesignAxisCount()](#getDesignAxisCount--) | Restituisce il numero di record degli assi. |
| [getElidedFallbackName()](#getElidedFallbackName--) | Spec: Nome usato come fallback quando la proiezione dei nomi in un modello di font particolare produce un nome di sottoclasse contenente solo elementi elidibili. |
| [getElidedFallbackNameId()](#getElidedFallbackNameId--) | Spec: ID nome usato come fallback quando la proiezione dei nomi in un modello di font particolare produce un nome di sottoclasse contenente solo elementi elidibili. |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getTag()](#getTag--) | Ottiene l'etichetta della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addAxisRecord(AxisRecord axisRecord) {#addAxisRecord-com.aspose.font.AxisRecord-}
```
public void addAxisRecord(AxisRecord axisRecord)
```


Aggiunge una struttura Axis Record alla tabella.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| axisRecord | [AxisRecord](../../com.aspose.font/axisrecord) | Struttura AxisRecord |

### addAxisValueTable(AxisValueTableBase axisValueTable) {#addAxisValueTable-com.aspose.font.AxisValueTableBase-}
```
public void addAxisValueTable(AxisValueTableBase axisValueTable)
```


Aggiunge una struttura Axis Value Table alla tabella.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| axisValueTable | [AxisValueTableBase](../../com.aspose.font/axisvaluetablebase) | Struttura della tabella dei valori dell'asse |

### clearAxisRecords() {#clearAxisRecords--}
```
public void clearAxisRecords()
```


Rimuove tutti i record degli assi dalla tabella.

### clearAxisValueTables() {#clearAxisValueTables--}
```
public void clearAxisValueTables()
```


Rimuove tutte le tabelle dei valori degli assi dalla tabella.

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
### getAxisRecords() {#getAxisRecords--}
```
public AxisRecord[] getAxisRecords()
```


Restituisce l'array degli assi di design. L'array degli assi è un array di strutture di tipo Axis Record. Spec: il record dell'asse fornisce informazioni su un singolo asse di design.

**Returns:**
com.aspose.font.AxisRecord[] - L'array degli assi di design.
### getAxisValueCount() {#getAxisValueCount--}
```
public int getAxisValueCount()
```


Restituisce il numero di tabelle dei valori degli assi.

**Returns:**
int - Il numero di tabelle dei valori degli assi.
### getAxisValueTables() {#getAxisValueTables--}
```
public AxisValueTableBase[] getAxisValueTables()
```


Restituisce l'array di Axis Value Tables. Spec: le Axis Value Tables forniscono dettagli riguardo a un valore di attributo di stile specifico su un asse specifico di variazione di design, o una combinazione di valori di assi di variazione di design, e la relazione di tali valori con le etichette usate come elementi nei nomi di sottoclasse.

**Returns:**
com.aspose.font.AxisValueTableBase[] - L'array di tabelle dei valori dell'asse.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDesignAxisCount() {#getDesignAxisCount--}
```
public int getDesignAxisCount()
```


Restituisce il numero di record dell'asse. Specifica: in un font con una tabella 'fvar', questo valore deve essere maggiore o uguale al valore axisCount nella tabella 'fvar'. In tutti i font, deve essere maggiore di zero se axisValueCount è maggiore di zero.

**Returns:**
int - Il numero di record dell'asse.
### getElidedFallbackName() {#getElidedFallbackName--}
```
public String getElidedFallbackName()
```


Spec: Nome usato come fallback quando la proiezione dei nomi in un modello di font particolare produce un nome di sottoclasse contenente solo elementi elidibili.

**Returns:**
java.lang.String - Il nome usato come fallback quando la proiezione dei nomi in un modello di font particolare produce un nome di sottogruppo contenente solo elementi elidibili.
### getElidedFallbackNameId() {#getElidedFallbackNameId--}
```
public int getElidedFallbackNameId()
```


Spec: ID nome usato come fallback quando la proiezione dei nomi in un modello di font particolare produce un nome di sottoclasse contenente solo elementi elidibili.

**Returns:**
int - L'ID del nome.
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

