---
title: "InputBin.InputBinOption"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive le opzioni delle funzionalità JobInputBin, DocumentInputBin e PageInputBin."
type: docs
weight: 14
url: /it/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

Descrive le opzioni delle funzionalità  JobInputBin ,  DocumentInputBin  e  PageInputBin .
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Crea una nuova istanza. |
## Campi

| Campo | Descrizione |
| --- | --- |
| [AutoSelect](#AutoSelect) | Il dispositivo sceglierà automaticamente l'opzione migliore in base alla configurazione. |
| [AutoSheetFeeder](#AutoSheetFeeder) | Vassoio di ingresso del dispositivo per stampanti a getto d'inchiostro. |
| [Cassette](#Cassette) | Specifica che il vassoio di alimentazione è una cassetta. |
| [Manual](#Manual) | Specifica il vassoio di alimentazione manuale predefinito. |
| [Tractor](#Tractor) | Specifica che il vassoio di alimentazione è un trascinatore. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Aggiunge un array di istanze IInputBinOptionItem all'opzione. |
| [clone()](#clone--) | Clona questa istanza dell'opzione. |
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
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


Crea una nuova istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| optionName | java.lang.String | Un nome dell'opzione. |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Un array arbitrario di istanze IInputBinOptionItem. |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


Il dispositivo sceglierà automaticamente l'opzione migliore in base alla configurazione.

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


Vassoio di ingresso del dispositivo per stampanti a getto d'inchiostro.

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


Specifica che il vassoio di alimentazione è una cassetta.

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


Specifica il vassoio di alimentazione manuale predefinito.

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


Specifica che il vassoio di alimentazione è un trascinatore.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. Ognuno deve essere un'istanza di  ScoredProperty  o di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Elenco di elementi da aggiungere. |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


Aggiunge un array di istanze IInputBinOptionItem all'opzione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Un array arbitrario di istanze IInputBinOptionItem. |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


Clona questa istanza dell'opzione.

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
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

