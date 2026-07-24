---
title: "XpsConverterToPdfOptions"
second_title: "Aspose.Page voor Java API-referentie"
description: "Stelt XPS-naar-PDF-converteropties voor de plug-in voor."
type: docs
weight: 13
url: /nl/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

Stelt XPS-naar-PDF-converteropties voor de [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) plug-in voor.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | Initialiseert een nieuw exemplaar van het [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) object. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Voegt een nieuwe gegevensbron toe aan de XpsConverter plug-in gegevensverzameling. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Voegt een nieuwe gegevensbron toe aan de XpsConverterOptions plug-in gegevensverzameling. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Retourneert de XpsConverterOptions plug-in gegevensverzameling. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Retourneert de waarde die het compressieniveau voor een afbeelding specificeert. |
| [getOperationName()](#getOperationName--) | Retourneert de operatienaam. |
| [getPageNumbers()](#getPageNumbers--) | Haalt de array met paginanummers in het XPS-document op die moeten worden geconverteerd. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Haalt de collectie op van toegevoegde doelen voor het opslaan van operationele resultaten. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Stelt de array in met het aantal pagina's in het XPS-document dat moet worden geconverteerd. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


Initialiseert een nieuw exemplaar van het [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) object.

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Voegt een nieuwe gegevensbron toe aan de XpsConverter plug-in gegevensverzameling.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Gegevensbron om toe te voegen. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Voegt een nieuwe gegevensbron toe aan de XpsConverterOptions plug-in gegevensverzameling.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Gegevensbron (bestand of stream) voor het opslaan van operationele resultaten. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Retourneert de XpsConverterOptions plug-in gegevensverzameling.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Retourneert de waarde die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Returns:**
int - De waarde die het compressieniveau voor een afbeelding aangeeft.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Retourneert de operatienaam.

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Haalt de array met paginanummers in het XPS-document op die moeten worden geconverteerd.

**Returns:**
int[] - Een array met het aantal pagina's in het XPS-document.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Haalt de collectie op van toegevoegde doelen voor het opslaan van operationele resultaten.

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


Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De waarde die het compressieniveau voor een afbeelding aangeeft. |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Stelt de array in met het aantal pagina's in het XPS-document dat moet worden geconverteerd. Indien niet ingesteld, worden alle pagina's geconverteerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pageNumbers | int[] | Een array van paginanummers in een XPS-document. |

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

