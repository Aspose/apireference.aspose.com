---
title: "JobPrimaryBannerSheet"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt das Bannerblatt, das für den Auftrag ausgegeben wird."
type: docs
weight: 64
url: /de/java/com.aspose.xps.metadata/jobprimarybannersheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobPrimaryBannerSheet extends Feature implements IJobPrintTicketItem
```

Beschreibt das Bannerblatt, das für den Auftrag ausgegeben werden soll. Das Bannerblatt sollte auf der Standard-PageMediaSize und mit dem Standard-PageMediaType ausgegeben werden. Das Bannerblatt sollte vom Rest des Auftrags isoliert sein. Das bedeutet, dass keine Abschluss- oder Verarbeitungsoptionen (wie JobDuplexAllDocumentsContiguously, JobStapleAllDocuments oder JobBindAllDocuments) das Bannerblatt einschließen sollten. Das Bannerblatt sollte als erstes Blatt des Auftrags erscheinen.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options)](#JobPrimaryBannerSheet-com.aspose.xps.metadata.JobPrimaryBannerSheet.BannerSheetOption...-) | Erstellt eine neue Instanz. |
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
### JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options) {#JobPrimaryBannerSheet-com.aspose.xps.metadata.JobPrimaryBannerSheet.BannerSheetOption...-}
```
public JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [BannerSheetOption\[\]](../../com.aspose.xps.metadata/bannersheetoption) | Ein Array von Optionen, das spezifisch für das Feature ist. |

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

