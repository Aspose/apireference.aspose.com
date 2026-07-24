---
title: "ImageSaveOptions"
second_title: "Aspose.Page för Java API-referens"
description: "Grundläggande klass för XPS-as-image sparalternativ."
type: docs
weight: 11
url: /sv/java/com.aspose.xps.rendering/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public abstract class ImageSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IPipelineOptions, IEventBasedModificationOptions
```

Grundläggande klass för XPS-as-image sparalternativ.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Skapar en ny instans av alternativ. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returnerar ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [getBatchSize()](#getBatchSize--) | Returnerar storleken på en del av sidorna som ska passeras från nod till nod. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Returnerar samlingen av händelsehanterare som utför modifieringar av en XPS-sida precis innan den sparas. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Hämtar flaggan som visar om det är nödvändigt att spara icke-TrueType-teckensnitt till TTF. |
| [getExceptions()](#getExceptions--) | Returnerar en lista över icke-kritiska fel. |
| [getImageSize()](#getImageSize--) | Hämtar storleken på utdatabilderna i pixlar. |
| [getInterpolationMode()](#getInterpolationMode--) | Hämtar interpolationsläget. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returnerar värdet som specificerar komprimeringsnivån för en bild. |
| [getPageNumbers()](#getPageNumbers--) | Hämtar arrayen med siffror för sidor att rendera. |
| [getResolution()](#getResolution--) | Hämtar bildens upplösning. |
| [getSize()](#getSize--) | Hämtar en storlek på sidan eller bilden. |
| [getSmoothingMode()](#getSmoothingMode--) | Hämtar utjämningsläget. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Hämtar hint för textåtergivning. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Hämtar flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [isSupressErrors()](#isSupressErrors--) | Returnerar ett värde som indikerar om fel kommer att undertryckas under konverteringen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Anger ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [setBatchSize(int value)](#setBatchSize-int-) | Ställer in storleken på en del av sidorna som ska passeras från nod till nod. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Anger om icke-TrueType-teckensnitt ska sparas till TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Anger flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Ställer in storleken på utdatabilderna i pixlar. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Ställer in interpolationsläget. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ställer in värdet som specificerar komprimeringsnivån för en bild. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Ställer in arrayen med siffror för sidor att rendera. |
| [setResolution(float value)](#setResolution-float-) | Ställer in bildens upplösning. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Anger en storlek på sidan eller bilden. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Ställer in utjämningsläget. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Ställer in hint för textåtergivning. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Skapar en ny instans av alternativ.

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Returnerar storleken på en del av sidorna som ska passeras från nod till nod.

**Returns:**
int - Storleken på en del av sidorna som ska passeras från nod till nod.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Returnerar samlingen av händelsehanterare som utför modifieringar av en XPS-sida precis innan den sparas.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Hämtar storleken på utdatabilderna i pixlar.

**Returns:**
java.awt.Dimension - Storleken på utdatabilderna i pixlar.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Hämtar interpolationsläget.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returnerar värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Returns:**
int – Värdet som specificerar komprimeringsnivån för en bild.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Hämtar arrayen med siffror för sidor att rendera.

**Returns:**
int[] - Antal sidor.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Hämtar bildens upplösning.

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


Hämtar utjämningsläget.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Hämtar hint för textåtergivning.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Ställer in storleken på en del av sidorna som ska passeras från nod till nod.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Storleken på en del av sidorna som ska överföras från nod till nod. |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Ställer in storleken på utdatabilderna i pixlar.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.awt.Dimension | Storleken på utdata bilderna i pixlar. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Ställer in interpolationsläget.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | Interpolationsläget. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ställer in värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Värdet som specificerar komprimeringsnivån för en bild. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Ställer in arrayen med siffror för sidor att rendera.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int[] | Antal sidor. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Ställer in bildens upplösning.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Bildupplösningen. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Anger en storlek på sidan eller bilden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | Storlek på sidan eller bilden. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Ställer in utjämningsläget.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Utjämningsläget. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| supressErrors | boolean | Booleskt värde. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Ställer in hint för textåtergivning.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | Tips för textåtergivning. |

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

