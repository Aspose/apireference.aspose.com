---
title: "PdfSaveOptions"
second_title: "Aspose.Page voor Java API-referentie"
description: "Deze klasse bevat de opties die nodig zijn voor het beheren van het conversieproces."
type: docs
weight: 11
url: /nl/java/com.aspose.eps.device/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PdfSaveOptions extends SaveOptions
```

Deze klasse bevat de opties die nodig zijn voor het beheren van het conversieproces.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Initialiseer een nieuwe instantie van de PdfSaveOptions‑klasse met standaardwaarden voor de vlaggen suppressErrors (true) en debug (false). |
| [PdfSaveOptions(boolean supressErrors)](#PdfSaveOptions-boolean-) | Initialiseer een nieuwe instantie van de PdfSaveOptions‑klasse met standaardwaarden voor de vlag debug (false). |
| [PdfSaveOptions(Dimension size)](#PdfSaveOptions-java.awt.Dimension-) | Initialiseer een nieuwe instantie van de PdfSaveOptions‑klasse met de paginagrootte. |
| [PdfSaveOptions(boolean supressErrors, Dimension size)](#PdfSaveOptions-boolean-java.awt.Dimension-) | Initialiseer een nieuwe instantie van de PdfSaveOptions‑klasse met standaardwaarden voor de vlag debug (false) en de paginagrootte. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Retourneert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Haalt de vlag op die aangeeft of het nodig is om niet‑TrueType‑lettertypen op te slaan als TTF. |
| [getExceptions()](#getExceptions--) | Retourneert een lijst met niet‑kritieke fouten. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Retourneert de waarde die het compressieniveau voor een afbeelding specificeert. |
| [getSize()](#getSize--) | Haalt een grootte van de pagina of afbeelding op. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Haalt de vlag op die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [isSupressErrors()](#isSupressErrors--) | Retourneert een waarde die aangeeft of fouten worden onderdrukt tijdens conversie. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specificeert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Specificeert of niet‑TrueType‑lettertypen moeten worden opgeslagen als TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specificeert de vlag die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specificeert een grootte van de pagina of afbeelding. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Initialiseer een nieuwe instantie van de PdfSaveOptions‑klasse met standaardwaarden voor de vlaggen suppressErrors (true) en debug (false).

### PdfSaveOptions(boolean supressErrors) {#PdfSaveOptions-boolean-}
```
public PdfSaveOptions(boolean supressErrors)
```


Initialiseer een nieuwe instantie van de PdfSaveOptions‑klasse met standaardwaarden voor de vlag debug (false).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| supressErrors | boolean | Als true wordt de conversie voortgezet ondanks niet‑kritieke fouten. |

### PdfSaveOptions(Dimension size) {#PdfSaveOptions-java.awt.Dimension-}
```
public PdfSaveOptions(Dimension size)
```


Initialiseer een nieuwe instantie van de PdfSaveOptions‑klasse met de paginagrootte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | De grootte van de pagina. |

### PdfSaveOptions(boolean supressErrors, Dimension size) {#PdfSaveOptions-boolean-java.awt.Dimension-}
```
public PdfSaveOptions(boolean supressErrors, Dimension size)
```


Initialiseer een nieuwe instantie van de PdfSaveOptions‑klasse met standaardwaarden voor de vlag debug (false) en de paginagrootte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| supressErrors | boolean | Als true wordt de conversie voortgezet ondanks niet‑kritieke fouten. |
| grootte | java.awt.Dimension | De grootte van de pagina. |

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
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Haalt de vlag op die aangeeft of het nodig is om niet‑TrueType‑lettertypen op te slaan als TTF.

**Returns:**
boolean - De vlagwaarde.
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
### getSize() {#getSize--}
```
public Dimension getSize()
```


Haalt een grootte van de pagina of afbeelding op.

**Returns:**
java.awt.Dimension - Een grootte van de pagina of afbeelding.
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

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Specificeert of niet‑TrueType lettertypen moeten worden opgeslagen als TTF. Het verkleint het volume van het resulterende document bij PS‑naar‑PDF conversie aanzienlijk en verhoogt de conversiesnelheid van PS‑bestanden met een grote hoeveelheid tekst in niet‑TrueType lettertypen naar elk uitvoerformaat. Er is echter een kleine verticale verschuiving van de tekst bij het converteren van een PostSctipt‑bestand naar een afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | boolean | De vlagwaarde. |

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

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specificeert een grootte van de pagina of afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Grootte van de pagina of afbeelding. |

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

