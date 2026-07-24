---
title: "XpsConverterToPdfOptions"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt die Optionen des XPS-zu-PDF-Konverters für das Plugin dar."
type: docs
weight: 13
url: /de/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

Stellt die Optionen des XPS-zu-PDF-Konverters für das Plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | Initialisiert eine neue Instanz des Objekts [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions). |
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
| [getPageNumbers()](#getPageNumbers--) | Liefert das Array der Seitenzahlen im XPS-Dokument, das konvertiert werden soll. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Ruft die Sammlung der hinzugefügten Ziele für das Speichern von Operationsergebnissen ab. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Legt das Array der Seitenzahlen im XPS-Dokument fest, das konvertiert werden soll. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


Initialisiert eine neue Instanz des Objekts [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions).

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
public final String getOperationName()
```


Gibt den Namen der Operation zurück.

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Liefert das Array der Seitenzahlen im XPS-Dokument, das konvertiert werden soll.

**Returns:**
int[] - Ein Array von Seitenzahlen im XPS-Dokument.
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

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Legt das Array der Seitenzahlen im XPS-Dokument fest, das konvertiert werden soll. Wenn nicht festgelegt, werden alle Seiten konvertiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pageNumbers | int[] | Ein Array von Seitenzahlen im XPS-Dokument. |

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

