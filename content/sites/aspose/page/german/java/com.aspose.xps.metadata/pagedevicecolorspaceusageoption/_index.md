---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt die Optionen des PageDeviceColorSpaceUsage-Features."
type: docs
weight: 10
url: /de/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

Beschreibt die Optionen der Funktion PageDeviceColorSpaceUsage.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | Wenn das Gerät feststellt, dass das durch den Parameter PageDeviceColorSpaceProfileURI angegebene Profil als Gerätefarbraumprofil verwendet werden kann, werden alle Elemente, die dasselbe Profil verwenden, so behandelt, als ob sie bereits im Gerätefarbraum angegeben wären. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | Wenn das durch den Parameter PageDeviceColorSpaceProfileURI angegebene Profil eine Kanalanzahl hat, die der Anzahl der Primärfarben des Geräts entspricht, sollte es anstelle der internen Farbverwaltung des Geräts für alle Elemente verwendet werden. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. |
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
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


Wenn das Gerät feststellt, dass das durch den Parameter PageDeviceColorSpaceProfileURI angegebene Profil als Gerätefarbraumprofil verwendet werden kann, werden alle Elemente, die dasselbe Profil verwenden, so behandelt, als wären sie bereits im Gerätefarbraum angegeben. Alle anderen Elemente MUST das für dieses Element angegebene Profil verwenden. Wenn das Profil nicht als Gerätefarbraumprofil verwendet werden kann, MUST farbverwaltet werden wie jedes andere Element, das das Farbprofil verwendet.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


Wenn das durch den Parameter PageDeviceColorSpaceProfileURI angegebene Profil eine Kanalanzahl hat, die der Anzahl der Primärfarben des Geräts entspricht, SHOULD es anstelle der internen Farbverwaltung des Geräts für alle Elemente verwendet werden. Es wird angenommen, dass Elemente, die dieses Profil verwenden, sich im Gerätefarbraum befinden und nicht weiter farbverwaltet werden.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. Jedes muss eine Instanz von  ScoredProperty  oder  Property  sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste der hinzuzufügenden Elemente. |

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

