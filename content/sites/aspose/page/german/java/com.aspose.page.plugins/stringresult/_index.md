---
title: "StringResult"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt das Operationsergebnis in Form einer Zeichenkette dar."
type: docs
weight: 19
url: /de/java/com.aspose.page.plugins/stringresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StringResult implements IOperationResult
```

Stellt das Operationsergebnis in Form einer Zeichenkette dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [StringResult(String result)](#StringResult-java.lang.String-) | Initialisiert eine neue StringResult-Instanz mit einem String. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Liefert Rohdaten. |
| [getText()](#getText--) | Gibt die String-Darstellung des Ergebnisses zurück. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Gibt an, ob das Ergebnis ein Byte-Array ist. |
| [isFile()](#isFile--) | Gibt an, ob das Ergebnis ein Pfad zu einer Ausgabedatei ist. |
| [isStream()](#isStream--) | Gibt an, ob das Ergebnis ein Pfad zu einer Ausgabedatei ist. |
| [isString()](#isString--) | Gibt an, ob das Ergebnis ein String ist. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Versucht, das Ergebnis in eine Datei zu konvertieren. |
| [toStream()](#toStream--) | Versucht, das Ergebnis in ein Stream-Objekt zu konvertieren. |
| [toString()](#toString--) | Versucht, das Ergebnis in einen String zu konvertieren. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringResult(String result) {#StringResult-java.lang.String-}
```
public StringResult(String result)
```


Initialisiert eine neue StringResult-Instanz mit einem String.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Ergebnis | java.lang.String | String, der das Ergebnis darstellt |

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
### getText() {#getText--}
```
public final String getText()
```


Gibt die String-Darstellung des Ergebnisses zurück.

**Returns:**
java.lang.String
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


Gibt an, ob das Ergebnis ein Pfad zu einer Ausgabedatei ist.

**Returns:**
boolean - true, wenn das Ergebnis ein Stream-Objekt ist; andernfalls false.
### isString() {#isString--}
```
public final boolean isString()
```


Gibt an, ob das Ergebnis ein String ist.

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


Versucht, das Ergebnis in einen String zu konvertieren.

**Returns:**
java.lang.String - Eine Zeichenkette, die den Textinhalt darstellt, wenn das Ergebnis eine Zeichenkette ist; andernfalls wird base.ToString() zurückgegeben.
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

