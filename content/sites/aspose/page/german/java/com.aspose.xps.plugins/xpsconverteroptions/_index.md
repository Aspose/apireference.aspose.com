---
title: "XpsConverterOptions"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt die Basisklasse von Optionen für das Plugin dar."
type: docs
weight: 11
url: /de/java/com.aspose.xps.plugins/xpsconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class XpsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

Stellt die Basisklasse von Optionen für das Plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Fügt der Datensammlung des XpsConverter-Plugins eine neue Datenquelle hinzu. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Fügt der Datensammlung des XpsConverterOptions-Plugins eine neue Datenquelle hinzu. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Gibt die Datensammlung des XpsConverterOptions-Plugins zurück. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. |
| [getOperationName()](#getOperationName--) | Gibt den Namen der Operation zurück. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Ruft die Sammlung der hinzugefügten Ziele für das Speichern von Operationsergebnissen ab. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Fügt der Datensammlung des XpsConverter-Plugins eine neue Datenquelle hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datenquelle zum Hinzufügen. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Fügt der Datensammlung des XpsConverterOptions-Plugins eine neue Datenquelle hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datenquelle (Datei oder Stream) zum Speichern von Operationsergebnissen. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Gibt die Datensammlung des XpsConverterOptions-Plugins zurück.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Returns:**
int - Der Wert, der das Kompressionsniveau für ein Bild angibt.
### getOperationName() {#getOperationName--}
```
public String getOperationName()
```


Gibt den Namen der Operation zurück.

**Returns:**
java.lang.String
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Ruft die Sammlung der hinzugefügten Ziele für das Speichern von Operationsergebnissen ab.

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


Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Der Wert, der das Kompressionsniveau für ein Bild angibt. |

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

