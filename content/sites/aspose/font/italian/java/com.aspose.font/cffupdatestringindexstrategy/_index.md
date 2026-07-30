---
title: "CffUpdateStringIndexStrategy"
second_title: "Riferimento API Aspose.Font per Java"
description: "Specifica come aggiungere stringhe allo storage CFF String INDEX."
type: docs
weight: 134
url: /it/java/com.aspose.font/cffupdatestringindexstrategy/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum CffUpdateStringIndexStrategy extends Enum<CffUpdateStringIndexStrategy>
```

Specifica come aggiungere stringhe allo storage CFF String INDEX. Quando proviamo ad aggiungere una stringa nello CFF String INDEX, può verificarsi la situazione che questa stringa sia già presente nello String INDEX. Usando l'opzione SearchForDuplicates possiamo forzare la ricerca nello String INDEX per rilevare se questa stringa è già presente o meno. Questo approccio salva spazio nella struttura String INDEX, ma richiede più tempo per aggiungere la stringa.
## Campi

| Campo | Descrizione |
| --- | --- |
| [AddStringAsIs](#AddStringAsIs) | Specifica che non devono essere eseguiti controlli per duplicati quando si aggiunge una stringa. |
| [SearchForDuplicates](#SearchForDuplicates) | Specifica che la ricerca della stringa da aggiungere deve essere eseguita nella struttura String INDEX per evitare l'aggiunta di duplicati. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AddStringAsIs {#AddStringAsIs}
```
public static final CffUpdateStringIndexStrategy AddStringAsIs
```


Specifica che non devono essere eseguiti controlli per duplicati quando si aggiunge una stringa. Questo approccio è più veloce, ma può comportare un utilizzo inefficiente della memoria per String INDEX.

### SearchForDuplicates {#SearchForDuplicates}
```
public static final CffUpdateStringIndexStrategy SearchForDuplicates
```


Specifica che la ricerca della stringa da aggiungere deve essere eseguita nella struttura String INDEX per evitare l'aggiunta di duplicati.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static CffUpdateStringIndexStrategy valueOf(String name)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | java.lang.String |  |

**Returns:**
[CffUpdateStringIndexStrategy](../../com.aspose.font/cffupdatestringindexstrategy)
### values() {#values--}
```
public static CffUpdateStringIndexStrategy[] values()
```




**Returns:**
com.aspose.font.CffUpdateStringIndexStrategy[]
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

