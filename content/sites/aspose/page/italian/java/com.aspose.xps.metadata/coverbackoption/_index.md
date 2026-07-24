---
title: "JobPrimaryCoverBack.CoverBackOption"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive le opzioni della funzionalità JobPrimaryCoverBack."
type: docs
weight: 10
url: /it/java/com.aspose.xps.metadata/jobprimarycoverback.coverbackoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverBack.CoverBackOption extends Option
```

Descrive le opzioni della funzionalità  JobPrimaryCoverBack  .
## Campi

| Campo | Descrizione |
| --- | --- |
| [BlankCover](#BlankCover) | Specifica che deve essere stampata una copertina vuota. |
| [NoCover](#NoCover) | Specifica che non verrà prodotta alcuna copertina. |
| [PrintBack](#PrintBack) | Specifica che la copertina indicata da "CoverBackSource" deve essere stampata sul lato posteriore del foglio di copertina. |
| [PrintBoth](#PrintBoth) | Specifica che la copertina indicata da "CoverBackSource" può essere stampata su entrambi i lati del foglio di copertina. |
| [PrintFront](#PrintFront) | Specifica che la copertina indicata da "CoverBackSource" deve essere stampata sul lato anteriore del foglio di copertina. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ottiene il nome dell'elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BlankCover {#BlankCover}
```
public static final JobPrimaryCoverBack.CoverBackOption BlankCover
```


Specifica che deve essere stampata una copertina vuota.

### NoCover {#NoCover}
```
public static final JobPrimaryCoverBack.CoverBackOption NoCover
```


Specifica che non verrà prodotta alcuna copertina.

### PrintBack {#PrintBack}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBack
```


Specifica che la copertina indicata da "CoverBackSource" deve essere stampata sul lato posteriore del foglio di copertina. Se un elemento  JobPrimaryCoverBackSource   ParameterInit  non è specificato, questa Opzione dovrebbe essere ignorata.

### PrintBoth {#PrintBoth}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBoth
```


Specifica che la copertina indicata da "CoverBackSource" può essere stampata su entrambi i lati del foglio di copertina. Se un elemento  JobPrimaryCoverBackSource   ParameterInit  non è specificato, questa Opzione dovrebbe essere ignorata.

### PrintFront {#PrintFront}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintFront
```


Specifica che la copertina indicata da "CoverBackSource" deve essere stampata sul lato anteriore del foglio di copertina. Se un elemento  JobPrimaryCoverBackSource   ParameterInit  non è specificato, questa Opzione dovrebbe essere ignorata.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. Ognuno deve essere un'istanza di  ScoredProperty  o di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Elenco di elementi da aggiungere. |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getName() {#getName--}
```
public String getName()
```


Ottiene il nome dell'elemento.

**Returns:**
java.lang.String
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

