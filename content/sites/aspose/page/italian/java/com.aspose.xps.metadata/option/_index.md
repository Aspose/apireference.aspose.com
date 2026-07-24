---
title: "Option"
second_title: "Aspose.Page per Java API Reference"
description: "La classe che implementa una comune PrintTicket Option."
type: docs
weight: 76
url: /it/java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

La classe che implementa una comune PrintTicket  Option . La classe base per tutte le opzioni definite dallo schema. Un elemento Option contiene tutti gli elementi  Property  e  ScoredProperty  associati a questa opzione. https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | Crea una nuova istanza di PrintTicket option. |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | Crea una nuova istanza di PrintTicket option. |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | Crea un'istanza di clone option. |
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
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


Crea una nuova istanza di PrintTicket option.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | java.lang.String | Un nome di opzione arbitrario. |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Un array arbitrario di istanze  IOptionItem . Ognuno deve essere un  ScoredProperty  o un'istanza di  Property . |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


Crea una nuova istanza di PrintTicket option.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Un array arbitrario di istanze  IOptionItem . Ognuno deve essere un  ScoredProperty  o un'istanza di  Property . |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


Crea un'istanza di clone option.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | Un'istanza di Option da clonare. |

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

