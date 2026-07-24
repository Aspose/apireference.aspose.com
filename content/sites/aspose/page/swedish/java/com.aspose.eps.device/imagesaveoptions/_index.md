---
title: "ImageSaveOptions"
second_title: "Aspose.Page för Java API-referens"
description: "Denna klass innehåller alternativ som behövs för att hantera konverteringsprocessen."
type: docs
weight: 10
url: /sv/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

Denna klass innehåller alternativ som behövs för att hantera konverteringsprocessen.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Initiera en ny instans av ImageSaveOptions-klassen med standardvärden för flaggorna suppressErrors (true) och debug (false). |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | Initierar en ny instans av ImageSaveOptions med angivet bildformat. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | Initierar en ny instans av ImageSaveOptions med angiven bildstorlek. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | Initierar en ny instans av ImageSaveOptions med angiven bildstorlek och bildformat. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | Initierar en ny instans av ImageSaveOptions med angivet bildformat och flaggan suppressErrors. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | Initierar en ny instans av ImageSaveOptions med angiven bildstorlek och flaggan suppressErrors. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | Initierar en ny instans av ImageSaveOptions med angiven bildstorlek, bildformat och flaggan suppressErrors. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | Initiera en ny instans av ImageSaveOptions-klassen med standardvärde för flaggan debug (false). |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returnerar ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Hämtar flaggan som visar om det är nödvändigt att spara icke-TrueType-teckensnitt till TTF. |
| [getExceptions()](#getExceptions--) | Returnerar en lista över icke-kritiska fel. |
| [getImageFormat()](#getImageFormat--) | Hämtar ett bildformat för den resulterande bilden. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returnerar värdet som specificerar komprimeringsnivån för en bild. |
| [getResolution()](#getResolution--) | Returnerar upplösningen för den resulterande bilden. |
| [getSize()](#getSize--) | Hämtar en storlek på sidan eller bilden. |
| [getSmoothingMode()](#getSmoothingMode--) | Hämtar utjämningsläge. |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | Indikerar om biblioteket kommer att försöka sammanfoga bildfragment. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Hämtar flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [isSupressErrors()](#isSupressErrors--) | Returnerar ett värde som indikerar om fel kommer att undertryckas under konverteringen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Anger ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Anger om icke-TrueType-teckensnitt ska sparas till TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Anger flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Anger ett bildformat för den resulterande bilden. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ställer in värdet som specificerar komprimeringsnivån för en bild. |
| [setResolution(float resolution)](#setResolution-float-) | Anger upplösning för den resulterande bilden. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Anger en storlek på sidan eller bilden. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Ställer in utjämningsläge. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen. |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | Anger om biblioteket ska försöka sammanfoga bildfragment. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Initiera en ny instans av ImageSaveOptions-klassen med standardvärden för flaggorna suppressErrors (true) och debug (false).

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


Initierar en ny instans av ImageSaveOptions med angivet bildformat.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Formatet på bilden. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


Initierar en ny instans av ImageSaveOptions med angiven bildstorlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | Bildstorlek. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


Initierar en ny instans av ImageSaveOptions med angiven bildstorlek och bildformat.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | Bildstorlek. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Bildens format. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


Initierar en ny instans av ImageSaveOptions med angivet bildformat och flaggan suppressErrors.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Bildens format. |
| supressErrors | boolean | Om true fortsätter konverteringen trots icke-kritiska fel. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


Initierar en ny instans av ImageSaveOptions med angiven bildstorlek och flaggan suppressErrors.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | Bildstorlek. |
| supressErrors | boolean | Om true fortsätter konverteringen trots icke-kritiska fel. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


Initierar en ny instans av ImageSaveOptions med angiven bildstorlek, bildformat och flaggan suppressErrors.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | Bildstorlek. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Bildens format. |
| supressErrors | boolean | Om true fortsätter konverteringen trots icke-kritiska fel. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


Initiera en ny instans av ImageSaveOptions-klassen med standardvärde för flaggan debug (false).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| supressErrors | boolean | Om true fortsätter konverteringen trots icke-kritiska fel. |

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
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Hämtar ett bildformat för den resulterande bilden.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returnerar värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Returns:**
int – Värdet som specificerar komprimeringsnivån för en bild.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Returnerar upplösningen för den resulterande bilden.

**Returns:**
float - Bildens upplösning.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Hämtar en storlek på sidan eller bilden.

**Returns:**
java.awt.Dimension - En storlek på sidan eller bilden.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Hämtar utjämningsläge.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


Anger om biblioteket ska försöka sammanfoga bildfragment. Det används när bilden i en källa PS/EPS-fil är delad i fragment. I så fall lämnas tunna mellanrum mellan fragmenten utan denna flagga.

**Returns:**
boolean - flaggans värde.
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

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Anger ett bildformat för den resulterande bilden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ett bildformat för utdata. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ställer in värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Värdet som specificerar komprimeringsnivån för en bild. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Anger upplösning för den resulterande bilden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| resolution | float | Bildens upplösning. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Anger en storlek på sidan eller bilden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | Storlek på sidan eller bilden. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Ställer in utjämningsläge.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | smoothingMode att ställa in |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| supressErrors | boolean | Booleskt värde. |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


Anger om biblioteket ska försöka sammanfoga bildfragment. Det används när bilden i en källa PS/EPS-fil är delad i fragment. I så fall lämnas tunna mellanrum mellan fragmenten utan denna flagga.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| tryJoinImageFragments | boolean | flaggans värde. |

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

