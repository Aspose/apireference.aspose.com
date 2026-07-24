---
title: "JobOutputBin"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt das installierte Ausgabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät."
type: docs
weight: 61
url: /de/java/com.aspose.xps.metadata/joboutputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.OutputBin](../../com.aspose.xps.metadata/outputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobOutputBin extends OutputBin implements IJobPrintTicketItem
```

Beschreibt das installierte Ausgabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Die Schlüsselwörter  JobOutputBin ,  DocumentOutputBin  und  PageOutputBin  schließen sich gegenseitig aus; es sollte nur eines in einem PrintTicket‑ oder Print‑Capabilities‑Dokument angegeben werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [JobOutputBin(OutputBin.IOutputBinItem[] items)](#JobOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-) | Erstellt eine neue Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieses Features hinzu. |
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
### JobOutputBin(OutputBin.IOutputBinItem[] items) {#JobOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-}
```
public JobOutputBin(OutputBin.IOutputBinItem[] items)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOutputBinItem\[\]](../../com.aspose.xps.metadata/ioutputbinitem) | Ein Array von Elementen, die spezifisch für die Funktion sind. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieses Features hinzu. Jedes muss eine Feature-, eine Option- oder eine Property-Instanz sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Liste der hinzuzufügenden Elemente. |

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

