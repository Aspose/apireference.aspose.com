---
title: "XpsConverterOptions"
second_title: "Aspose.Page för Java API-referens"
description: "Representerar basklass för alternativ för  plugin."
type: docs
weight: 11
url: /sv/java/com.aspose.xps.plugins/xpsconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class XpsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

Representerar basklass för alternativ för [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) plugin.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Lägger till en ny datakälla i XpsConverter‑pluginens datainsamling. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Lägger till en ny datakälla i XpsConverterOptions‑pluginens datainsamling. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Returnerar XpsConverterOptions‑pluginens datainsamling. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returnerar värdet som specificerar komprimeringsnivån för en bild. |
| [getOperationName()](#getOperationName--) | Returnerar operationens namn. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Hämtar samling av tillagda mål för att spara operationens resultat. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ställer in värdet som specificerar komprimeringsnivån för en bild. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Lägger till en ny datakälla i XpsConverter‑pluginens datainsamling.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datakälla att lägga till. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Lägger till en ny datakälla i XpsConverterOptions‑pluginens datainsamling.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datakälla (fil eller ström) för att spara resultat av operationen. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Returnerar XpsConverterOptions‑pluginens datainsamling.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returnerar värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Returns:**
int – Värdet som specificerar komprimeringsnivån för en bild.
### getOperationName() {#getOperationName--}
```
public String getOperationName()
```


Returnerar operationens namn.

**Returns:**
java.lang.String
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Hämtar samling av tillagda mål för att spara operationens resultat.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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




### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ställer in värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Värdet som specificerar komprimeringsnivån för en bild. |

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

