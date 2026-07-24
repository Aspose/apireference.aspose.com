---
title: "OutputBin.OutputBinOption"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt die Funktionen und Optionen von JobOutputBin, DocumentOutputBin und PageOutputBin."
type: docs
weight: 12
url: /de/java/com.aspose.xps.metadata/outputbin.outputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.OutputBin.IOutputBinItem](../../com.aspose.xps.metadata/ioutputbinitem)
```
public static final class OutputBin.OutputBinOption extends Option implements OutputBin.IOutputBinItem
```

Beschreibt die Optionen der Funktionen  JobOutputBin ,  DocumentOutputBin  und  PageOutputBin .
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [OutputBinOption(OutputBin.IOutputBinOptionItem[] items)](#OutputBinOption-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-) | Erstellt eine neue Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. |
| [add(OutputBin.IOutputBinOptionItem[] items)](#add-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-) | Fügt dem Feature ein Array von IOutputBinOptionItem-Instanzen hinzu. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ermittelt den Elementnamen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### OutputBinOption(OutputBin.IOutputBinOptionItem[] items) {#OutputBinOption-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-}
```
public OutputBinOption(OutputBin.IOutputBinOptionItem[] items)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOutputBinOptionItem\[\]](../../com.aspose.xps.metadata/ioutputbinoptionitem) | Ein beliebiges Array von IOutputBinOptionItem-Instanzen. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. Jedes muss eine Instanz von  ScoredProperty  oder  Property  sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste der hinzuzufügenden Elemente. |

### add(OutputBin.IOutputBinOptionItem[] items) {#add-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-}
```
public OutputBin.OutputBinOption add(OutputBin.IOutputBinOptionItem[] items)
```


Fügt dem Feature ein Array von IOutputBinOptionItem-Instanzen hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOutputBinOptionItem\[\]](../../com.aspose.xps.metadata/ioutputbinoptionitem) | Ein beliebiges Array von IOutputBinOptionItem-Instanzen. |

**Returns:**
[OutputBinOption](../../com.aspose.xps.metadata/outputbinoption) - This options instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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


Ermittelt den Elementnamen.

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

