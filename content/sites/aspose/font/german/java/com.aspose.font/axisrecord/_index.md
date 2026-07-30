---
title: "AxisRecord"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Axis‑Record‑Struktur dar."
type: docs
weight: 10
url: /de/java/com.aspose.font/axisrecord/
---
**Inheritance:**
java.lang.Object
```
public class AxisRecord
```

Stellt die Axis Record-Struktur dar. Spec: Der Axis Record liefert Informationen über eine einzelne Design-Achse.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [AxisRecord(String tag, int axisNameId, int axisOrdering)](#AxisRecord-java.lang.String-int-int-) | Konstruktor |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisNameId()](#getAxisNameId--) | Gibt das axisNameID-Feld zurück. |
| [getAxisOrdering()](#getAxisOrdering--) | Gibt das axisOrdering-Feld zurück. |
| [getClass()](#getClass--) |  |
| [getTag()](#getTag--) | Gibt einen Tag zurück, der die Achse der Design-Variation identifiziert. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisRecord(String tag, int axisNameId, int axisOrdering) {#AxisRecord-java.lang.String-int-int-}
```
public AxisRecord(String tag, int axisNameId, int axisOrdering)
```


Konstruktor

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tag | java.lang.String | Tag, spec: Ein Tag, der die Achse der Design-Variation identifiziert |
| axisNameId | int | Die Namens-ID für Einträge in der 'name'-Tabelle, die eine Anzeigestring für diese Achse bereitstellen |
| axisOrdering | int | Der Wert, den Anwendungen verwenden können, um die primäre Sortierung von Schriftartnamen zu bestimmen oder um Labels zu ordnen, wenn Familien- oder Schriftartnamen zusammengesetzt werden. |

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
### getAxisNameId() {#getAxisNameId--}
```
public int getAxisNameId()
```


Gibt das axisNameID-Feld zurück. Spec: Das axisNameID-Feld liefert eine Namens-ID, die verwendet werden kann, um Zeichenketten aus der 'name'-Tabelle zu erhalten, die zur Bezeichnung der Achse in Benutzeroberflächen von Anwendungen genutzt werden können.

**Returns:**
int - Das axisNameID-Feld.
### getAxisOrdering() {#getAxisOrdering--}
```
public int getAxisOrdering()
```


Gibt das axisOrdering-Feld zurück. Spec:A Wert, den Anwendungen verwenden können, um die primäre Sortierung von Schriftartnamen zu bestimmen oder um Labels zu ordnen, wenn Familien- und Schriftartnamen zusammengesetzt werden.

**Returns:**
int - Das axisOrdering-Feld.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTag() {#getTag--}
```
public String getTag()
```


Gibt einen Tag zurück, der die Achse der Design-Variation identifiziert. Spec: Jeder Axis Record hat einen Tag, der die Achse bezeichnet. Tag-Werte müssen den Regeln für Achsen-Tags folgen, die im OpenType Design-Variation Axis Tag Registry beschrieben sind.

**Returns:**
java.lang.String - Ein Tag, der die Achse der Design-Variation identifiziert.
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

