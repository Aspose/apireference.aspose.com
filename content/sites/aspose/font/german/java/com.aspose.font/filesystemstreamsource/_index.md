---
title: "FileSystemStreamSource"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt eine Stream-Quelle basierend auf dem Dateisystem dar."
type: docs
weight: 31
url: /de/java/com.aspose.font/filesystemstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class FileSystemStreamSource extends StreamSource
```

Stellt eine Stream-Quelle basierend auf dem Dateisystem dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FileSystemStreamSource(String fileName)](#FileSystemStreamSource-java.lang.String-) | Initialisiert ein neues FileSystemStreamSource-Objekt. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [deepClone()](#deepClone--) | Klont das FileSystemStreamSource-Objekt. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileName()](#getFileName--) | Liefert den Dateinamen. |
| [getFontStream()](#getFontStream--) | Gibt den Font-Dateistream zurück. |
| [getOffset()](#getOffset--) | Liefert den Offset innerhalb der Quelle. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Die Erben können verhindern, dass der Stream geschlossen wird. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setFileName(String value)](#setFileName-java.lang.String-) | Setzt den Dateinamen. |
| [setOffset(long value)](#setOffset-long-) | Setzt den Offset innerhalb der Quelle. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileSystemStreamSource(String fileName) {#FileSystemStreamSource-java.lang.String-}
```
public FileSystemStreamSource(String fileName)
```


Initialisiert ein neues FileSystemStreamSource-Objekt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Klont das FileSystemStreamSource-Objekt.

**Returns:**
java.lang.Object – Kopie des FileSystemStreamSource-Objekts.
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
### getFileName() {#getFileName--}
```
public String getFileName()
```


Liefert den Dateinamen.

**Returns:**
java.lang.String - Dateiname.
### getFontStream() {#getFontStream--}
```
public InputStream getFontStream()
```


Gibt den Font-Dateistream zurück. Vergessen Sie nicht, den Stream nach der Verwendung zu schließen.

**Returns:**
java.io.InputStream - Font-Dateistream.
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




### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Setzt den Dateinamen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Dateiname. |

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

