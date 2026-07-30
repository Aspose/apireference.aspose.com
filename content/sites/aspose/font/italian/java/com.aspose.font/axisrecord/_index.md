---
title: "AxisRecord"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la struttura del record Axis."
type: docs
weight: 10
url: /it/java/com.aspose.font/axisrecord/
---
**Inheritance:**
java.lang.Object
```
public class AxisRecord
```

Rappresenta la struttura Axis Record. Spec: il record dell'asse fornisce informazioni su un singolo asse di design.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [AxisRecord(String tag, int axisNameId, int axisOrdering)](#AxisRecord-java.lang.String-int-int-) | Costruttore |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisNameId()](#getAxisNameId--) | Restituisce il campo axisNameID. |
| [getAxisOrdering()](#getAxisOrdering--) | Restituisce il campo axisOrdering. |
| [getClass()](#getClass--) |  |
| [getTag()](#getTag--) | Restituisce un tag che identifica l'asse di variazione di design. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisRecord(String tag, int axisNameId, int axisOrdering) {#AxisRecord-java.lang.String-int-int-}
```
public AxisRecord(String tag, int axisNameId, int axisOrdering)
```


Costruttore

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tag | java.lang.String | Tag, spec: Un tag che identifica l'asse di variazione di design |
| axisNameId | int | L'ID nome per le voci nella tabella 'name' che forniscono una stringa visualizzabile per questo asse |
| axisOrdering | int | Il valore che le applicazioni possono utilizzare per determinare l'ordinamento primario dei nomi dei font, o per l'ordinamento delle etichette quando si compongono nomi di famiglia o di font. |

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
### getAxisNameId() {#getAxisNameId--}
```
public int getAxisNameId()
```


Restituisce il campo axisNameID. Spec: Il campo axisNameID fornisce un ID nome che può essere usato per ottenere stringhe dalla tabella 'name' che possono essere utilizzate per riferirsi all'asse nelle interfacce utente dell'applicazione.

**Returns:**
int - Il campo axisNameID.
### getAxisOrdering() {#getAxisOrdering--}
```
public int getAxisOrdering()
```


Restituisce il campo axisOrdering. Spec: Un valore che le applicazioni possono utilizzare per determinare l'ordinamento primario dei nomi dei font, o per l'ordinamento delle etichette quando si compongono nomi di famiglia o di font.

**Returns:**
int - Il campo axisOrdering.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTag() {#getTag--}
```
public String getTag()
```


Restituisce un tag che identifica l'asse di variazione di design. Spec: Ogni record dell'asse ha un tag che designa l'asse. I valori dei tag devono seguire le regole per i tag degli assi descritte nel Registro dei Tag degli Assi di Variazione di Design OpenType.

**Returns:**
java.lang.String - Un tag che identifica l'asse di variazione di design.
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

