---
title: "PdfSaveOptions"
second_title: "Aspose.Page för Java API-referens"
description: "Klass för XPS‑som‑PDF‑sparalternativ."
type: docs
weight: 14
url: /sv/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Klass för XPS‑som‑PDF‑sparalternativ.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Skapar en ny instans av alternativ. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returnerar ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [getBatchSize()](#getBatchSize--) | Returnerar storleken på en del av sidorna som ska passeras från nod till nod. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Returnerar samlingen av händelsehanterare som utför modifieringar av en XPS-sida precis innan den sparas. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Hämtar flaggan som visar om det är nödvändigt att spara icke-TrueType-teckensnitt till TTF. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Returnerar krypteringsdetaljerna. |
| [getExceptions()](#getExceptions--) | Returnerar en lista över icke-kritiska fel. |
| [getImageCompression()](#getImageCompression--) | Returnerar komprimeringstypen som ska användas för alla bilder i dokumentet. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returnerar värdet som specificerar komprimeringsnivån för en bild. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Hämtar upp till vilken nivå dokumentets innehållsförteckning ska expandera när PDF-filen öppnas i en visare. 1 – endast objekt på första nivån visas, 2 – endast objekt på första och andra nivån visas, och så vidare. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Hämtar höjden på dokumentets innehållsförteckningsträd som ska sparas. 0 – trädstrukturen konverteras inte, 1 – endast objekt på första nivån konverteras, och så vidare. |
| [getPageNumbers()](#getPageNumbers--) | Hämtar arrayen med siffror för sidor att rendera. |
| [getSize()](#getSize--) | Hämtar en storlek på sidan eller bilden. |
| [getTextCompression()](#getTextCompression--) | Returnerar komprimeringstypen som ska användas för alla innehållsströmmar förutom bilder. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Hämtar flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [isSupressErrors()](#isSupressErrors--) | Returnerar ett värde som indikerar om fel kommer att undertryckas under konverteringen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | I XPS kan vissa textelement innehålla referenser till alternativa glyfformer som inte motsvarar någon teckenkod i teckensnittet. |
| [preserveText(boolean value)](#preserveText-boolean-) | I XPS kan vissa textelement innehålla referenser till alternativa glyfformer som inte motsvarar någon teckenkod i teckensnittet. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Anger ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [setBatchSize(int value)](#setBatchSize-int-) | Ställer in storleken på en del av sidorna som ska passeras från nod till nod. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Anger om icke-TrueType-teckensnitt ska sparas till TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Anger flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Ställer in krypteringsdetaljerna. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Ställer in komprimeringstypen som ska användas för alla bilder i dokumentet. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ställer in värdet som specificerar komprimeringsnivån för en bild. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Ställer in upp till vilken nivå dokumentets innehållsförteckning ska expandera när PDF-filen öppnas i en visare. 1 – endast objekt på första nivån visas, 2 – endast objekt på första och andra nivån visas, och så vidare. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Ställer in höjden på dokumentets innehållsförteckningsträd som ska sparas. 0 – trädstrukturen konverteras inte, 1 – endast objekt på första nivån konverteras, och så vidare. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Ställer in arrayen med siffror för sidor att rendera. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Anger en storlek på sidan eller bilden. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Ställer in komprimeringstypen som ska användas för alla innehållsströmmar förutom bilder. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - Samlingen av händelsehanterare som utför modifieringar av en XPS-sida precis innan den sparas.
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Returnerar krypteringsdetaljerna. Om den inte är inställd kommer ingen kryptering att utföras.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Returnerar en lista över icke-kritiska fel.

**Returns:**
java.util.List<java.lang.Exception> - Undantagslista
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Returnerar komprimeringstypen som ska användas för alla bilder i dokumentet. Standard är PdfImageCompression.Auto.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returnerar värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Returns:**
int – Värdet som specificerar komprimeringsnivån för en bild.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Hämtar upp till vilken nivå dokumentets innehållsförteckning ska expandera när PDF-filen öppnas i en visare. 1 – endast objekt på första nivån visas, 2 – endast objekt på första och andra nivån visas, och så vidare.

**Returns:**
int – Nivån för expansion av innehållsförteckningsträdet.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Hämtar höjden på dokumentets innehållsförteckningsträd som ska sparas. 0 – trädstrukturen konverteras inte, 1 – endast objekt på första nivån konverteras, och så vidare. Standard är 10.

**Returns:**
int - Höjden på konturträdet.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Hämtar arrayen med siffror för sidor att rendera.

**Returns:**
int[] - Antal sidor.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Hämtar en storlek på sidan eller bilden.

**Returns:**
java.awt.Dimension - En storlek på sidan eller bilden.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Returnerar komprimeringstypen som ska användas för alla innehållsströmmar förutom bilder. Standard är  PdfTextCompression.Flate .

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


I XPS kan vissa textelement innehålla referenser till alternativa glyfformer som inte motsvarar någon teckenkod i teckensnittet. Om denna flagga är satt till true konverteras texten från sådana XPS‑element till grafiska former. Då visas själva texten transparent ovanpå. Detta gör att texten i sådana element kan markeras. Men en bieffekt är att utdatafilen kan bli mycket större än originalet. Om flaggan är satt till false ersätts tecknen som skulle visas som alternativa former med andra tecken som mappas till de alternativa glyfformerna. Därför kommer texten, även om den fortfarande kan markeras, att modifieras och sannolikt bli oläslig.

**Returns:**
boolean - Flaggvärdet.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


I XPS kan vissa textelement innehålla referenser till alternativa glyfformer som inte motsvarar någon teckenkod i teckensnittet. Om denna flagga är satt till true konverteras texten från sådana XPS‑element till grafiska former. Då visas själva texten transparent ovanpå. Detta gör att texten i sådana element kan markeras. Men en bieffekt är att utdatafilen kan bli mycket större än originalet. Om flaggan är satt till false ersätts tecknen som skulle visas som alternativa former med andra tecken som mappas till de alternativa glyfformerna. Därför kommer texten, även om den fortfarande kan markeras, att modifieras och sannolikt bli oläslig.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | boolean | Flaggvärdet. |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Ställer in krypteringsdetaljerna. Om den inte är angiven utförs ingen kryptering.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | Krypteringsdetaljerna. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Ställer in komprimeringstypen som ska användas för alla bilder i dokumentet. Standard är  PdfImageCompression.Auto .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | Komprimeringstypen. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ställer in värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Värdet som specificerar komprimeringsnivån för en bild. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Ställer in upp till vilken nivå dokumentets innehållsförteckning ska expandera när PDF-filen öppnas i en visare. 1 – endast objekt på första nivån visas, 2 – endast objekt på första och andra nivån visas, och så vidare.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Utvidgningsnivån för konturträdet. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Ställer in höjden på dokumentets innehållsförteckningsträd som ska sparas. 0 – trädstrukturen konverteras inte, 1 – endast objekt på första nivån konverteras, och så vidare.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Konturträdets höjd. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Ställer in arrayen med siffror för sidor att rendera.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int[] | Antal sidor. |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Ställer in komprimeringstypen som ska användas för alla innehållsströmmar förutom bilder. Standard är  PdfTextCompression.Flate .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | Komprimeringstypen. |

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

