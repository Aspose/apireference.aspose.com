---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page voor Java API-referentie"
description: "Beschrijft de PageDeviceColorSpaceUsage-functieopties."
type: docs
weight: 10
url: /nl/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

Beschrijft de opties voor de functie  PageDeviceColorSpaceUsage .
## Velden

| Veld | Beschrijving |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | Als het apparaat bepaalt dat het profiel dat is opgegeven door de PageDeviceColorSpaceProfileURI-parameter kan worden gebruikt als een apparaat‑kleurruimteprofiel, worden alle elementen die hetzelfde profiel gebruiken behandeld alsof ze al zijn gespecificeerd in de apparaat‑kleurruimte. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | Als het door de PageDeviceColorSpaceProfileURI-parameter opgegeven profiel een aantal kanalen heeft dat overeenkomt met het aantal primaire kleuren van het apparaat, MOET het worden gebruikt in plaats van het interne kleurbeheer van het apparaat voor alle elementen. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Haalt de elementnaam op. |
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


Als het apparaat bepaalt dat het profiel dat is opgegeven door de  PageDeviceColorSpaceProfileURI  parameter kan worden gebruikt als een apparaatkleurprofiel, worden alle elementen die hetzelfde profiel gebruiken behandeld alsof ze al zijn gespecificeerd in apparaatkleur. Alle andere elementen MUST gebruiken het voor dat element gespecificeerde profiel. Als het profiel niet kan worden gebruikt als een apparaatkleurprofiel, moeten elementen die het profiel gebruiken kleurbeheerd worden zoals elk ander element dat het kleurprofiel gebruikt.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


Als het profiel dat is opgegeven door de PageDeviceColorSpaceProfileURI parameter een aantal kanalen heeft dat overeenkomt met het aantal primaire kleuren van het apparaat, SHOULD het in plaats van het interne kleurbeheer van het apparaat voor alle elementen worden gebruikt. Elementen die dit profiel gebruiken, worden verondersteld zich in apparaatkleur te bevinden en zullen niet verder kleurbeheerd worden.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. Elk item moet een  ScoredProperty  of een  Property  instantie zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lijst met toe te voegen items. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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


Haalt de elementnaam op.

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

