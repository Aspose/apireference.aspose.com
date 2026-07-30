---
title: "TtfStatTable"
second_title: "Aspose.Font för Java API-referens"
description: 
type: docs
weight: 109
url: /sv/java/com.aspose.font/ttfstattable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfStatTable extends TtfTableBase
```
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [addAxisRecord(AxisRecord axisRecord)](#addAxisRecord-com.aspose.font.AxisRecord-) | Lägger till en Axis Record‑struktur i tabellen. |
| [addAxisValueTable(AxisValueTableBase axisValueTable)](#addAxisValueTable-com.aspose.font.AxisValueTableBase-) | Lägger till en Axis Value Table‑struktur i tabellen. |
| [clearAxisRecords()](#clearAxisRecords--) | Tar bort alla axis‑poster från tabellen. |
| [clearAxisValueTables()](#clearAxisValueTables--) | Tar bort alla axis‑värdetabeller från tabellen. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisRecords()](#getAxisRecords--) | Returnerar designaxlar‑arrayen. |
| [getAxisValueCount()](#getAxisValueCount--) | Returnerar antalet axis‑värdetabeller. |
| [getAxisValueTables()](#getAxisValueTables--) | Returnerar en array av Axis Value Tables. |
| [getClass()](#getClass--) |  |
| [getDesignAxisCount()](#getDesignAxisCount--) | Returnerar antalet axis‑poster. |
| [getElidedFallbackName()](#getElidedFallbackName--) | Spec: Namn som används som reserv när projektion av namn till en viss teckensnittmodell ger ett underfamiljenamn som endast innehåller utelämningsbara element. |
| [getElidedFallbackNameId()](#getElidedFallbackNameId--) | Spec: Namn‑ID som används som reserv när projektion av namn till en viss teckensnittmodell ger ett underfamiljenamn som endast innehåller utelämningsbara element. |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
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


Lägger till en Axis Record‑struktur i tabellen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| axisRecord | [AxisRecord](../../com.aspose.font/axisrecord) | AxisRecord‑struktur |

### addAxisValueTable(AxisValueTableBase axisValueTable) {#addAxisValueTable-com.aspose.font.AxisValueTableBase-}
```
public void addAxisValueTable(AxisValueTableBase axisValueTable)
```


Lägger till en Axis Value Table‑struktur i tabellen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| axisValueTable | [AxisValueTableBase](../../com.aspose.font/axisvaluetablebase) | Axis value table‑struktur |

### clearAxisRecords() {#clearAxisRecords--}
```
public void clearAxisRecords()
```


Tar bort alla axis‑poster från tabellen.

### clearAxisValueTables() {#clearAxisValueTables--}
```
public void clearAxisValueTables()
```


Tar bort alla axis‑värdetabeller från tabellen.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAxisRecords() {#getAxisRecords--}
```
public AxisRecord[] getAxisRecords()
```


Returnerar designaxlar‑arrayen. Axlar‑arrayen är en array av strukturer av typen Axis Record. Spec: axis‑posten ger information om en enskild designaxel.

**Returns:**
com.aspose.font.AxisRecord[] - Designaxlar‑arrayen.
### getAxisValueCount() {#getAxisValueCount--}
```
public int getAxisValueCount()
```


Returnerar antalet axis‑värdetabeller.

**Returns:**
int - Antalet axis‑värdetabeller.
### getAxisValueTables() {#getAxisValueTables--}
```
public AxisValueTableBase[] getAxisValueTables()
```


Returnerar en array av Axis Value Tables. Spec: Axis Value Tables ger detaljer om ett specifikt stilattributvärde på någon specifik axel av designvariation, eller en kombination av designvariationsaxelvärden, samt förhållandet mellan dessa värden och etiketter som används som element i underfamiljenamn.

**Returns:**
com.aspose.font.AxisValueTableBase[] - Arrayen av Axis Value Tables.
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


Returnerar antalet axelposter. Spec: i ett teckensnitt med en 'fvar'-tabell måste detta värde vara större än eller lika med axisCount‑värdet i 'fvar'-tabellen. I alla teckensnitt måste det vara större än noll om axisValueCount är större än noll.

**Returns:**
int - Antalet axelposter.
### getElidedFallbackName() {#getElidedFallbackName--}
```
public String getElidedFallbackName()
```


Spec: Namn som används som reserv när projektion av namn till en viss teckensnittmodell ger ett underfamiljenamn som endast innehåller utelämningsbara element.

**Returns:**
java.lang.String - Namnet som används som reserv när projektion av namn till en viss teckensnittmodell ger ett underfamiljenamn som endast innehåller eliderbara element.
### getElidedFallbackNameId() {#getElidedFallbackNameId--}
```
public int getElidedFallbackNameId()
```


Spec: Namn‑ID som används som reserv när projektion av namn till en viss teckensnittmodell ger ett underfamiljenamn som endast innehåller utelämningsbara element.

**Returns:**
int - Namn‑ID.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Hämtar förskjutning från början av sfnt.

**Returns:**
long - Förskjutning från början av sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Hämtar tabellens tagg.

**Returns:**
java.lang.String - Tabellens tagg.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referens till TTF-tabellarkivet.

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

