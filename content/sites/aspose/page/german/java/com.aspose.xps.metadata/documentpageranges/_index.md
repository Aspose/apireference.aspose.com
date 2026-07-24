---
title: "DocumentPageRanges"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt den Ausgabebereich des Dokuments in Seiten."
type: docs
weight: 31
url: /de/java/com.aspose.xps.metadata/documentpageranges/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.StringParameterInit](../../com.aspose.xps.metadata/stringparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentPageRanges extends StringParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Beschreibt den Ausgabebereich des Dokuments in Seiten. Der Parameterwert muss der folgenden Struktur entsprechen: - PageRangeText: "PageRange" oder "PageRange,PageRange" - PageRange: "PageNumber" oder "PageNumber-PageNumber" - PageNumber: 1 bis N, wobei N die Anzahl der Seiten im Dokument ist. Wenn PageNumber > N, dann ist PageNumber = N. Leerzeichen im String sollten ignoriert werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [DocumentPageRanges(String value)](#DocumentPageRanges-java.lang.String-) | Erstellt eine neue Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxLength()](#getMaxLength--) | Für Zeichenkettenwerte definiert die kürzeste längste Zeichenkette. |
| [getMinLength()](#getMinLength--) | Für Zeichenkettenwerte definiert die kürzeste zulässige Zeichenkette. |
| [getName()](#getName--) | Ermittelt den Elementnamen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DocumentPageRanges(String value) {#DocumentPageRanges-java.lang.String-}
```
public DocumentPageRanges(String value)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Der Parameterwert. |

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
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


Für Zeichenkettenwerte definiert die kürzeste längste Zeichenkette.

**Returns:**
int - Die längste zulässige Zeichenkette.
### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


Für Zeichenkettenwerte definiert die kürzeste zulässige Zeichenkette.

**Returns:**
int - Die kürzeste zulässige Zeichenkette.
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

