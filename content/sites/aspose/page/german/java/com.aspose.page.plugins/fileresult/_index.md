---
title: "FileResult"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt das Operationsergebnis in Form eines Zeichenkettenpfads zur Datei dar."
type: docs
weight: 14
url: /de/java/com.aspose.page.plugins/fileresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class FileResult implements IOperationResult
```

Stellt das Operationsergebnis in Form eines Zeichenkettenpfads zur Datei dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FileResult(String path)](#FileResult-java.lang.String-) | Initialisiert eine neue Instanz mit dem angegebenen Pfad zu einer Ausgabedatei. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Liefert Rohdaten. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Gibt an, ob das Ergebnis ein Byte-Array ist. |
| [isFile()](#isFile--) | Gibt an, ob das Ergebnis ein Pfad zu einer Ausgabedatei ist. |
| [isStream()](#isStream--) | Gibt an, ob das Ergebnis ein Ausgabestream ist. |
| [isString()](#isString--) | Gibt an, ob das Ergebnis eine Textzeichenkette ist. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Versucht, das Ergebnis in eine Datei zu konvertieren. |
| [toStream()](#toStream--) | Versucht, das Ergebnis in ein Stream-Objekt zu konvertieren. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileResult(String path) {#FileResult-java.lang.String-}
```
public FileResult(String path)
```


Initialisiert eine neue Instanz mit dem angegebenen Pfad zu einer Ausgabedatei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | java.lang.String | Pfad zu einer Datei. |

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
### getData() {#getData--}
```
public final Object getData()
```


Liefert Rohdaten.

**Returns:**
java.lang.Object - Ein Objekt, das Ausgabedaten darstellt.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Gibt an, ob das Ergebnis ein Byte-Array ist.

**Returns:**
boolean - true, wenn das Ergebnis ein Byte-Array ist; andernfalls false.
### isFile() {#isFile--}
```
public final boolean isFile()
```


Gibt an, ob das Ergebnis ein Pfad zu einer Ausgabedatei ist.

**Returns:**
boolean - true, wenn das Ergebnis eine Datei ist; andernfalls false.
### isStream() {#isStream--}
```
public final boolean isStream()
```


Gibt an, ob das Ergebnis ein Ausgabestream ist.

**Returns:**
boolean - true, wenn das Ergebnis ein Stream-Objekt ist; andernfalls false.
### isString() {#isString--}
```
public final boolean isString()
```


Gibt an, ob das Ergebnis eine Textzeichenkette ist.

**Returns:**
boolean - true, wenn das Ergebnis ein String ist; andernfalls false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


Versucht, das Ergebnis in eine Datei zu konvertieren.

**Returns:**
java.lang.String - Ein String, der den Pfad zur Ausgabedatei darstellt, wenn das Ergebnis eine Datei ist; andernfalls null.
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Versucht, das Ergebnis in ein Stream-Objekt zu konvertieren.

**Returns:**
java.io.OutputStream - Ein Stream-Objekt, das die Ausgabedaten darstellt, wenn das Ergebnis ein Stream ist; andernfalls null.
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

