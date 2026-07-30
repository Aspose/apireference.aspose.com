---
title: "StreamSource"
second_title: "Aspose.Font für Java API-Referenz"
description: "Definiert eine Möglichkeit, einen Dateistream zu erhalten, wenn er benötigt wird."
type: docs
weight: 74
url: /de/java/com.aspose.font/streamsource/
---
**Inheritance:**
java.lang.Object
```
public abstract class StreamSource
```

Definiert eine Möglichkeit, einen Dateistream zu erhalten, wenn er benötigt wird.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [StreamSource()](#StreamSource--) | Initialisiert die StreamSource-Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [deepClone()](#deepClone--) | Klont das StreamSource-Objekt. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | Gibt den Font-Stream zurück. |
| [getOffset()](#getOffset--) | Liefert den Offset innerhalb der Quelle. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Die Erben können verhindern, dass der Stream geschlossen wird. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffset(long value)](#setOffset-long-) | Setzt den Offset innerhalb der Quelle. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamSource() {#StreamSource--}
```
public StreamSource()
```


Initialisiert die StreamSource-Instanz.

### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


Klont das StreamSource-Objekt.

**Returns:**
java.lang.Object - Kopie des StreamSource-Objekts.
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
### getFontStream() {#getFontStream--}
```
public abstract InputStream getFontStream()
```


Gibt den Font-Stream zurück.

**Returns:**
java.io.InputStream - Font-Stream.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Liefert den Offset innerhalb der Quelle.

**Returns:**
long - Offset innerhalb der Quelle.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mustCloseAfterUse() {#mustCloseAfterUse--}
```
public boolean mustCloseAfterUse()
```


Die Erben können verhindern, dass der Stream geschlossen wird. Gibt true zurück, wenn die StreamSource den Stream nach der Verwendung schließen möchte. Andernfalls wird false zurückgegeben.

**Returns:**
boolean - true, wenn die StreamSource den Stream nach der Verwendung schließen möchte, sonst false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setOffset(long value) {#setOffset-long-}
```
public void setOffset(long value)
```


Setzt den Offset innerhalb der Quelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | long | Offset innerhalb der Quelle. |

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

