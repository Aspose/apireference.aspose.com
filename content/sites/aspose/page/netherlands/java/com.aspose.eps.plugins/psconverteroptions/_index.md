---
title: "PsConverterOptions"
second_title: "Aspose.Page voor Java API-referentie"
description: "Stelt de basisklasse van opties voor de plug-in voor."
type: docs
weight: 11
url: /nl/java/com.aspose.eps.plugins/psconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class PsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

Stelt de basisklasse van opties voor de [PsConverter](../../com.aspose.eps.plugins/psconverter) plug-in voor.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de PsConverter-plug-in. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de PsConverterOptions-plug-in. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Retourneert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Retourneert de gegevensverzameling van de PsConverterOptions-plug-in. |
| [getExceptions()](#getExceptions--) | Retourneert een lijst met niet‑kritieke fouten. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Retourneert de waarde die het compressieniveau voor een afbeelding specificeert. |
| [getOperationName()](#getOperationName--) | Retourneert de operatienaam. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Haalt de collectie op van toegevoegde doelen voor het opslaan van operationele resultaten. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Haalt de vlag op die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [isSupressErrors()](#isSupressErrors--) | Retourneert een waarde die aangeeft of fouten worden onderdrukt tijdens conversie. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specificeert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specificeert de vlag die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de PsConverter-plug-in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Gegevensbron om toe te voegen. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de PsConverterOptions-plug-in.

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Retourneert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. Standaardmap is de standaard lettertype‑map waar het OS lettertypen voor interne behoeften vindt.

**Returns:**
java.lang.String[] - Een array van lettertype‑mappen.
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


Retourneert de gegevensverzameling van de PsConverterOptions-plug-in.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Retourneert een lijst met niet‑kritieke fouten.

**Returns:**
java.util.List<java.lang.Exception> - Lijst met uitzonderingen
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Retourneert de waarde die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Returns:**
int - De waarde die het compressieniveau voor een afbeelding aangeeft.
### getOperationName() {#getOperationName--}
```
public String getOperationName()
```


Retourneert de operatienaam.

**Returns:**
java.lang.String
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
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Haalt de vlag op die uitvoer van waarschuwingen en berichten tijdens conversie toestaat.

**Returns:**
boolean - debugwaarde.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Retourneert een waarde die aangeeft of fouten worden onderdrukt tijdens conversie.

**Returns:**
boolean - booleaanse waarde
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Specificeert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. Standaardmap is de standaard lettertype‑map waar het OS lettertypen voor interne behoeften vindt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Een array van lettertype‑mappen. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Specificeert de vlag die uitvoer van waarschuwingen en berichten tijdens conversie toestaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| debug | boolean | Booleaanse waarde. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De waarde die het compressieniveau voor een afbeelding aangeeft. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| supressErrors | boolean | Booleaanse waarde. |

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

