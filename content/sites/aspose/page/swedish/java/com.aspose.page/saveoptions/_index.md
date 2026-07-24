---
title: "SaveOptions"
second_title: "Aspose.Page för Java API-referens"
description: "Denna klass innehåller alternativ som behövs för att hantera konverteringsprocessen."
type: docs
weight: 16
url: /sv/java/com.aspose.page/saveoptions/
---
**Inheritance:**
java.lang.Object
```
public class SaveOptions
```

Denna klass innehåller alternativ som behövs för att hantera konverteringsprocessen.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [SaveOptions()](#SaveOptions--) | Initiera en ny SaveOptions-instans med standardvärden för flaggorna  suppressErrors  (true) och  debug  (false). |
| [SaveOptions(boolean supressErrors)](#SaveOptions-boolean-) | Initiera en ny SaveOptions-instans med standardvärde för flaggan  debug  (false). |
| [SaveOptions(Dimension size)](#SaveOptions-java.awt.Dimension-) | Initierar en ny instans av  SaveOptions  med angiven storlek. |
| [SaveOptions(boolean supressErrors, Dimension size)](#SaveOptions-boolean-java.awt.Dimension-) | Initiera en ny SaveOptions-instans med standardvärde för flaggan  debug  (false) och med angiven storlek. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returnerar ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Hämtar flaggan som visar om det är nödvändigt att spara icke-TrueType-teckensnitt till TTF. |
| [getExceptions()](#getExceptions--) | Returnerar en lista över icke-kritiska fel. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returnerar värdet som specificerar komprimeringsnivån för en bild. |
| [getSize()](#getSize--) | Hämtar en storlek på sidan eller bilden. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Hämtar flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [isSupressErrors()](#isSupressErrors--) | Returnerar ett värde som indikerar om fel kommer att undertryckas under konverteringen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Anger ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Anger om icke-TrueType-teckensnitt ska sparas till TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Anger flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ställer in värdet som specificerar komprimeringsnivån för en bild. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Anger en storlek på sidan eller bilden. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### SaveOptions() {#SaveOptions--}
```
public SaveOptions()
```


Initiera en ny SaveOptions-instans med standardvärden för flaggorna  suppressErrors  (true) och  debug  (false).

### SaveOptions(boolean supressErrors) {#SaveOptions-boolean-}
```
public SaveOptions(boolean supressErrors)
```


Initiera en ny SaveOptions-instans med standardvärde för flaggan  debug  (false).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| supressErrors | boolean | Om true fortsätter konverteringen trots icke-kritiska fel. |

### SaveOptions(Dimension size) {#SaveOptions-java.awt.Dimension-}
```
public SaveOptions(Dimension size)
```


Initierar en ny instans av  SaveOptions  med angiven storlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | Storleken. |

### SaveOptions(boolean supressErrors, Dimension size) {#SaveOptions-boolean-java.awt.Dimension-}
```
public SaveOptions(boolean supressErrors, Dimension size)
```


Initiera en ny SaveOptions-instans med standardvärde för flaggan  debug  (false) och med angiven storlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| supressErrors | boolean | Om true fortsätter konverteringen trots icke-kritiska fel. |
| size | java.awt.Dimension | Storleken. |

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Returnerar ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. Standardmappen är den vanliga teckensnittsmappen där OS hittar teckensnitt för interna behov.

**Returns:**
java.lang.String[] - En array av teckensnittsmappar.
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


Hämtar flaggan som visar om det är nödvändigt att spara icke-TrueType-teckensnitt till TTF.

**Returns:**
boolean - Flaggvärdet.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Returnerar en lista över icke-kritiska fel.

**Returns:**
java.util.List<java.lang.Exception> - Undantagslista
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returnerar värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Returns:**
int – Värdet som specificerar komprimeringsnivån för en bild.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Hämtar en storlek på sidan eller bilden.

**Returns:**
java.awt.Dimension - En storlek på sidan eller bilden.
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


Hämtar flaggan som tillåter utskrift av varningar och meddelanden under konverteringen.

**Returns:**
boolean - felsökningsvärde.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Returnerar ett värde som indikerar om fel kommer att undertryckas under konverteringen.

**Returns:**
boolean - booleskt värde
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


Anger ytterligare teckensnittsmappar där konverteraren ska hitta teckensnitt för inmatningsdokumentet. Standardmappen är den vanliga teckensnittsmappen där OS hittar teckensnitt för interna behov.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | En array av teckensnittsmappar. |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Anger om icke-TrueType-teckensnitt ska sparas som TTF. Det minskar avsevärt volymen på det resulterande dokumentet vid PS till PDF-konvertering och ökar hastigheten för konvertering av PS-filer med en stor mängd text i icke-TrueType-teckensnitt till vilket format som helst. Det finns dock en liten vertikal förskjutning av texten när en PostSctipt-fil konverteras till bild.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | boolean | Flaggvärdet. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Anger flaggan som tillåter utskrift av varningar och meddelanden under konverteringen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| debug | boolean | Booleskt värde. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ställer in värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Värdet som specificerar komprimeringsnivån för en bild. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Anger en storlek på sidan eller bilden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | Storlek på sidan eller bilden. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| supressErrors | boolean | Booleskt värde. |

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

