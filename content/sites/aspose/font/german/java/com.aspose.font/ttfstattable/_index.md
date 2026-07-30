---
title: "TtfStatTable"
second_title: "Aspose.Font für Java API-Referenz"
description: 
type: docs
weight: 109
url: /de/java/com.aspose.font/ttfstattable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfStatTable extends TtfTableBase
```
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addAxisRecord(AxisRecord axisRecord)](#addAxisRecord-com.aspose.font.AxisRecord-) | Fügt der Tabelle eine Achsenaufzeichnungsstruktur hinzu. |
| [addAxisValueTable(AxisValueTableBase axisValueTable)](#addAxisValueTable-com.aspose.font.AxisValueTableBase-) | Fügt der Tabelle eine Achsenwerttabellenstruktur hinzu. |
| [clearAxisRecords()](#clearAxisRecords--) | Entfernt alle Achsenaufzeichnungen aus der Tabelle. |
| [clearAxisValueTables()](#clearAxisValueTables--) | Entfernt alle Achsenwerttabellen aus der Tabelle. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisRecords()](#getAxisRecords--) | Gibt das Array der Designachsen zurück. |
| [getAxisValueCount()](#getAxisValueCount--) | Gibt die Anzahl der Achsenwerttabellen zurück. |
| [getAxisValueTables()](#getAxisValueTables--) | Gibt ein Array von Achsenwerttabellen zurück. |
| [getClass()](#getClass--) |  |
| [getDesignAxisCount()](#getDesignAxisCount--) | Gibt die Anzahl der Achsenaufzeichnungen zurück. |
| [getElidedFallbackName()](#getElidedFallbackName--) | Spez.: Name, der als Rückfall verwendet wird, wenn die Projektion von Namen in ein bestimmtes Schriftmodell einen Unterschriftennamen erzeugt, der nur aus entfernbaren Elementen besteht. |
| [getElidedFallbackNameId()](#getElidedFallbackNameId--) | Spez.: Namens-ID, die als Rückfall verwendet wird, wenn die Projektion von Namen in ein bestimmtes Schriftmodell einen Unterschriftennamen erzeugt, der nur aus entfernbaren Elementen besteht. |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getTag()](#getTag--) | Liest das Tabellen-Tag. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addAxisRecord(AxisRecord axisRecord) {#addAxisRecord-com.aspose.font.AxisRecord-}
```
public void addAxisRecord(AxisRecord axisRecord)
```


Fügt der Tabelle eine Achsenaufzeichnungsstruktur hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| axisRecord | [AxisRecord](../../com.aspose.font/axisrecord) | AxisRecord-Struktur |

### addAxisValueTable(AxisValueTableBase axisValueTable) {#addAxisValueTable-com.aspose.font.AxisValueTableBase-}
```
public void addAxisValueTable(AxisValueTableBase axisValueTable)
```


Fügt der Tabelle eine Achsenwerttabellenstruktur hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| axisValueTable | [AxisValueTableBase](../../com.aspose.font/axisvaluetablebase) | Achsenwerttabellenstruktur |

### clearAxisRecords() {#clearAxisRecords--}
```
public void clearAxisRecords()
```


Entfernt alle Achsenaufzeichnungen aus der Tabelle.

### clearAxisValueTables() {#clearAxisValueTables--}
```
public void clearAxisValueTables()
```


Entfernt alle Achsenwerttabellen aus der Tabelle.

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
### getAxisRecords() {#getAxisRecords--}
```
public AxisRecord[] getAxisRecords()
```


Gibt das Array der Designachsen zurück. Das Achsenarray ist ein Array von Strukturen des Typs Axis Record. Spez.: Die Achsenaufzeichnung liefert Informationen über eine einzelne Designachse.

**Returns:**
com.aspose.font.AxisRecord[] - Das Designachsen-Array.
### getAxisValueCount() {#getAxisValueCount--}
```
public int getAxisValueCount()
```


Gibt die Anzahl der Achsenwerttabellen zurück.

**Returns:**
int - Die Anzahl der Achsenwerttabellen.
### getAxisValueTables() {#getAxisValueTables--}
```
public AxisValueTableBase[] getAxisValueTables()
```


Gibt ein Array von Achsenwerttabellen zurück. Spez.: Achsenwerttabellen liefern Details zu einem bestimmten Stil-Attributwert auf einer bestimmten Achse der Designvariation oder einer Kombination von Designvariations-Achsenwerten sowie die Beziehung dieser Werte zu Bezeichnungen, die als Elemente in Unterschriftennamen verwendet werden.

**Returns:**
com.aspose.font.AxisValueTableBase[] - Das Array der Achsenwerttabellen.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDesignAxisCount() {#getDesignAxisCount--}
```
public int getDesignAxisCount()
```


Gibt die Anzahl der Achsen‑Datensätze zurück. Spezifikation: In einer Schrift mit einer 'fvar'-Tabelle muss dieser Wert größer oder gleich dem axisCount‑Wert in der 'fvar'-Tabelle sein. In allen Schriften muss er größer als null sein, wenn axisValueCount größer als null ist.

**Returns:**
int - Die Anzahl der Achsen‑Datensätze.
### getElidedFallbackName() {#getElidedFallbackName--}
```
public String getElidedFallbackName()
```


Spez.: Name, der als Rückfall verwendet wird, wenn die Projektion von Namen in ein bestimmtes Schriftmodell einen Unterschriftennamen erzeugt, der nur aus entfernbaren Elementen besteht.

**Returns:**
java.lang.String - Der Name, der als Rückfall verwendet wird, wenn die Projektion von Namen in ein bestimmtes Schriftmodell einen Unterfamiliennamen erzeugt, der nur entfernbare Elemente enthält.
### getElidedFallbackNameId() {#getElidedFallbackNameId--}
```
public int getElidedFallbackNameId()
```


Spez.: Namens-ID, die als Rückfall verwendet wird, wenn die Projektion von Namen in ein bestimmtes Schriftmodell einen Unterschriftennamen erzeugt, der nur aus entfernbaren Elementen besteht.

**Returns:**
int - Die Namens‑ID.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Liefert den Offset vom Anfang des sfnt.

**Returns:**
long - Offset vom Anfang des sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Liest das Tabellen-Tag.

**Returns:**
java.lang.String - Tabellen‑Tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Verweis auf das TTF-Tabellen-Repository.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
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

