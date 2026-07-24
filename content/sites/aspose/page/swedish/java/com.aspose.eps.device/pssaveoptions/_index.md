---
title: "PsSaveOptions"
second_title: "Aspose.Page för Java API-referens"
description: "Denna klass innehåller alternativ som behövs för att hantera konverteringsprocessen."
type: docs
weight: 12
url: /sv/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

Denna klass innehåller alternativ som behövs för att hantera konverteringsprocessen.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | Initiera en ny instans av PdfSaveOptions-klassen med standardvärden för flaggorna suppressErrors (true) och debug (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | Initiera en ny instans av PdfSaveOptions-klassen med standardvärde för flaggan debug (false). |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returnerar ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Hämtar flaggan som visar om det är nödvändigt att spara icke-TrueType-teckensnitt till TTF. |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | Returnerar en lista över icke-kritiska fel. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returnerar värdet som specificerar komprimeringsnivån för en bild. |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | Hämtar en storlek på sidan eller bilden. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Hämtar flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [isEmbedFonts()](#isEmbedFonts--) | Indikerar om använda teckensnitt ska bäddas in i PS-dokumentet |
| [isSupressErrors()](#isSupressErrors--) | Returnerar ett värde som indikerar om fel kommer att undertryckas under konverteringen. |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Anger ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Anger om icke-TrueType-teckensnitt ska sparas till TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Anger flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | Anger om använda teckensnitt ska bäddas in i PS-dokumentet |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | Ange teckensnittstyp för inbäddning av teckensnitt i PS-dokumentet |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ställer in värdet som specificerar komprimeringsnivån för en bild. |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | Ange sparformat för den resulterande filen |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Anger en storlek på sidan eller bilden. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen. |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


Initiera en ny instans av PdfSaveOptions-klassen med standardvärden för flaggorna suppressErrors (true) och debug (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


Initiera en ny instans av PdfSaveOptions-klassen med standardvärde för flaggan debug (false).

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
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - bakgrundsfärgen
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
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - en teckensnittstyp för inbäddning av teckensnitt i PS-dokumentet
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
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - sidans marginaler
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - sidans storlek
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
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
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


Indikerar om använda teckensnitt ska bäddas in i PS-dokumentet

**Returns:**
boolean - värdet för embedFonts-flaggan
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Returnerar ett värde som indikerar om fel kommer att undertryckas under konverteringen.

**Returns:**
boolean - booleskt värde
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - Anger om bakgrunden är transparent
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

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| backgroundColor | java.awt.Color | Anger bakgrundsfärg |

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

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


Anger om använda teckensnitt ska bäddas in i PS-dokumentet

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| embedFonts | boolean | embedFonts-flagga |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


Ange teckensnittstyp för inbäddning av teckensnitt i PS-dokumentet

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| embedFontsAs | java.lang.String | Teckensnittstyp |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ställer in värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Värdet som specificerar komprimeringsnivån för en bild. |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| marginaler | java.awt.Insets | Anger sidans marginaler |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Anger sidans storlek |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


Ange sparformat för den resulterande filen

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | Format för den resulterande filen |

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

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| transparent | boolean | Anger om bakgrunden är transparent |

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

