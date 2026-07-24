---
title: "PagePhotoPrintingIntent.PagePhotoPrintingIntentOption"
second_title: "Aspose.Page voor Java API-referentie"
description: "Definieert opties voor de PagePhotoPrintingIntent-functie."
type: docs
weight: 10
url: /nl/java/com.aspose.xps.metadata/pagephotoprintingintent.pagephotoprintingintentoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PagePhotoPrintingIntent.PagePhotoPrintingIntentOption extends Option
```

Definieert de functie‑opties voor PagePhotoPrintingIntent.
## Velden

| Veld | Beschrijving |
| --- | --- |
| [None](#None) | Geen fotoprintintentie (Staat de applicatie toe om geen intentie‑resolutie op te geven. |
| [PhotoBest](#PhotoBest) | Beste kwaliteit fotoprinten (Voornamelijk voor marketingdoeleinden geleverd; maakt gebruik van de hoogste mogelijkheden van het apparaat) |
| [PhotoDraft](#PhotoDraft) | Conceptkwaliteit fotoprinten (Snelle afdruk met laag inktverbruik voor proefdoeleinden) |
| [PhotoStandard](#PhotoStandard) | Standaardkwaliteit fotoprinten (OEM‑aanbevolen instellingen voor standaard fotoprinten) |
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
### None {#None}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption None
```


Geen fotoprintintentie (Staat de applicatie toe om geen intentie‑resolutie op te geven. PrintTicket‑instellingen mogen niet worden gewijzigd)

### PhotoBest {#PhotoBest}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoBest
```


Beste kwaliteit fotoprinten (Voornamelijk voor marketingdoeleinden geleverd; maakt gebruik van de hoogste mogelijkheden van het apparaat)

### PhotoDraft {#PhotoDraft}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoDraft
```


Conceptkwaliteit fotoprinten (Snelle afdruk met laag inktverbruik voor proefdoeleinden)

### PhotoStandard {#PhotoStandard}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoStandard
```


Standaardkwaliteit fotoprinten (OEM‑aanbevolen instellingen voor standaard fotoprinten)

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

