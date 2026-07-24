---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive le opzioni della funzionalità PageDeviceColorSpaceUsage."
type: docs
weight: 10
url: /it/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

Descrive le opzioni della funzionalità  PageDeviceColorSpaceUsage  .
## Campi

| Campo | Descrizione |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | Se il dispositivo determina che il profilo specificato dal parametro PageDeviceColorSpaceProfileURI può essere utilizzato come profilo di spazio colore del dispositivo, tutti gli elementi che utilizzano lo stesso profilo sono trattati come già specificati nello spazio colore del dispositivo. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | Se il profilo specificato dal parametro PageDeviceColorSpaceProfileURI ha un numero di canali corrispondente al numero di primarie del dispositivo, DEVE essere utilizzato al posto della gestione interna del colore del dispositivo per tutti gli elementi. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ottiene il nome dell'elemento. |
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


Se il dispositivo determina che il profilo specificato dal parametro PageDeviceColorSpaceProfileURI può essere utilizzato come profilo di spazio colore del dispositivo, tutti gli elementi che usano lo stesso profilo sono trattati come già specificati nello spazio colore del dispositivo. Tutti gli altri elementi DEVE utilizzare il profilo specificato per quell'elemento. Se il profilo non può essere utilizzato come profilo di spazio colore del dispositivo, gli elementi che usano il profilo DEVE essere gestiti a colori come qualsiasi altro elemento che utilizza il profilo colore.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


Se il profilo specificato dal parametro PageDeviceColorSpaceProfileURI ha un numero di canali corrispondente al numero di primarie del dispositivo, dovrebbe essere utilizzato al posto della gestione interna del colore del dispositivo per tutti gli elementi. Gli elementi che usano questo profilo si presume siano nello spazio colore del dispositivo e non saranno ulteriormente gestiti a colori.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. Ognuno deve essere un'istanza di  ScoredProperty  o di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Elenco di elementi da aggiungere. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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


Ottiene il nome dell'elemento.

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

