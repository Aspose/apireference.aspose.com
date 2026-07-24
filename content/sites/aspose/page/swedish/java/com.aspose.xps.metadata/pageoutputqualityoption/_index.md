---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "Aspose.Page för Java API-referens"
description: "Definierar alternativ för PageOutputQuality‑funktionen."
type: docs
weight: 10
url: /sv/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

Definierar  PageOutputQuality  funktionsalternativ.
## Fält

| Fält | Beskrivning |
| --- | --- |
| [Automatic](#Automatic) | Anger avsikten för automatisk utskrift (tillåter klienten att automatiskt välja de bästa inställningarna). |
| [Draft](#Draft) | Anger avsikten för utkastutskrift (balanserad för utkastkvalitet på text och grafik). |
| [Fax](#Fax) | Anger avsikten för faxutskrift (balanserad för standard fax‑kvalitet). |
| [High](#High) | Anger avsikten för högkvalitativ utskrift (balanserad för högkvalitativ text och grafik). |
| [Normal](#Normal) | Anger avsikten för normal utskrift (balanserad för god kvalitet på text och grafik). |
| [Photographic](#Photographic) | Anger avsikten för fotografisk utskrift (bilder bör ha högsta kvalitet). |
| [Text](#Text) | Anger avsikten för endast textutskrift (grafik kan skrivas ut dåligt eller inte alls). |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Lägger till en lista med objekt i slutet av detta alternativs objektlista. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Hämtar elementets namn. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


Anger avsikten för automatisk utskrift (tillåter klienten att automatiskt välja de bästa inställningarna).

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


Anger avsikten för utkastutskrift (balanserad för utkastkvalitet på text och grafik).

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


Anger avsikten för faxutskrift (balanserad för standard fax‑kvalitet).

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


Anger avsikten för högkvalitativ utskrift (balanserad för högkvalitativ text och grafik).

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


Anger avsikten för normal utskrift (balanserad för god kvalitet på text och grafik).

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


Anger avsikten för fotografisk utskrift (bilder bör ha högsta kvalitet).

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


Anger avsikten för endast textutskrift (grafik kan skrivas ut dåligt eller inte alls).

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Lägger till en lista med objekt i slutet av detta alternativs objektlista. Varje objekt måste vara en  ScoredProperty  eller en  Property  -instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista med objekt att lägga till. |

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


Hämtar elementets namn.

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

