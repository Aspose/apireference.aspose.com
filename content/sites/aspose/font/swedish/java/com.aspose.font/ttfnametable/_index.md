---
title: "TtfNameTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar namntabellen för TTF-typsnittsfilen."
type: docs
weight: 105
url: /sv/java/com.aspose.font/ttfnametable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfNameTable extends TtfTableBase
```

Representerar "name"-tabellen i TTF-typsnittsfilen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)](#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Extraherar alla flerspråkiga strängar från det passerade mlNames-objektet och skapar motsvarande NameRecord-struktur för varje extraherad sträng med hjälp av de passerade parametrarna platformId, platformSpecificId och nameId. |
| [addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)](#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-) | Lägger till en post i tabellen. |
| [deleteRecords(PlatformId platformId, int platformSpecificId)](#deleteRecords-com.aspose.font.PlatformId-int-) | Tar bort alla poster som är relaterade till den angivna plattformen. |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Tar bort alla poster som är relaterade till de passerade parametrarna. |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-) | Tar bort post(er) som är relaterade till angivna parametrar. |
| [deleteRecordsByNameId(NameId nameId)](#deleteRecordsByNameId-com.aspose.font.NameId-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllNameRecords()](#getAllNameRecords--) | Returnerar alla NameRecord-strukturer från tabellen. |
| [getClass()](#getClass--) |  |
| [getMultiLanguageNameById(NameId nameId)](#getMultiLanguageNameById-com.aspose.font.NameId-) | returnerar ett namn efter nameId |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-) | Returnerar ett namn efter nameId med den passerade plattformsidentifieraren. |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-) | Returnerar ett namn som objekt av typen MultiLanguageString. |
| [getNameById(NameId nameId)](#getNameById-com.aspose.font.NameId-) | Returnerar ett namn efter nameId om det hittas, annars null. |
| [getNameRecordsByNameId(NameId nameId)](#getNameRecordsByNameId-com.aspose.font.NameId-) | Returnerar alla NameRecord-strukturer där NameId-fältet är lika med det passerade nameId-värdet. |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)](#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-) | Uppdaterar namn i post(er) som är relaterade till angiven plattform (kombination av platformId och platformSpecificId), kategori (nameId) och språk (languageId). |
| [updateNamesByNameId(NameId nameId, String newName)](#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-) | Väljer alla poster som är relaterade till den logiska strängkategorin, specificerad av parametern nameId, och uppdaterar namnfältet (strängdata) i dessa poster. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId) {#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)
```


Extraherar alla flerspråkiga strängar från det passerade mlNames-objektet och skapar motsvarande NameRecord-struktur för varje extraherad sträng med hjälp av de passerade parametrarna platformId, platformSpecificId och nameId. Värdet för fältet languageID extraheras från mlNames-objektet. Den nyss skapade posten läggs till i tabellen. Om en post som matchar den nyss skapade enligt fälten platformID, platformSpecificID, nameID och languageId hittas, kommer den nyss skapade posten inte att läggas till och endast strängdata kommer att uppdateras för den befintliga posten.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| mlNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Flerspråkig sträng |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattformsidentifierare |
| platformSpecificId | int | Plattformspecifik kodningsidentifierare |
| nameId | [NameId](../../com.aspose.font/nameid) | Namnsidentifierare, logisk strängkategori, specificerad av NameId‑enumerationen |

### addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name) {#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-}
```
public void addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)
```


Lägger till en post i tabellen. Strängdatakategori som ska läggas till anges av parametern name.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Namnidentifierare, logisk strängkategori, specificerad av [NameId](../../com.aspose.font/nameid)-enumerationen. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattformsidentifierare. |
| platformSpecificId | int | Plattformspecifik kodningsidentifierare. Använd ett värde från någon av dessa uppräkningar – UnicodePlatformSpecificId, MacPlatformSpecificId, MSPlatformSpecificId. Vilken uppräkning som ska användas definieras av sammanhanget (parametern platformId). |
| languageId | int | Språkidentifierare. Använd ett värde från uppräkningarna MSLanguageId eller MacLanguageId beroende på sammanhanget, definierat av parametern platformId. |
| namn | java.lang.String | Faktisk strängdata. |

### deleteRecords(PlatformId platformId, int platformSpecificId) {#deleteRecords-com.aspose.font.PlatformId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId)
```


Tar bort alla poster som är relaterade till den angivna plattformen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattformsidentifierare |
| platformSpecificId | int | Plattformspecifik kodningsidentifierare |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)
```


Tar bort alla poster som är relaterade till de passerade parametrarna.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattformsidentifierare |
| platformSpecificId | int | Plattformspecifik kodningsidentifierare |
| nameId | [NameId](../../com.aspose.font/nameid) | Namnsidentifierare, logisk strängkategori, specificerad av NameId‑enumerationen |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)
```


Tar bort post(er) som är relaterade till angivna parametrar.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattformsidentifierare |
| platformSpecificId | int | Plattformspecifik kodningsidentifierare |
| nameId | [NameId](../../com.aspose.font/nameid) | Namnsidentifierare, logisk strängkategori, specificerad av NameId‑enumerationen |
| languageId | int | Språkidentifierare |

### deleteRecordsByNameId(NameId nameId) {#deleteRecordsByNameId-com.aspose.font.NameId-}
```
public void deleteRecordsByNameId(NameId nameId)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) |  |

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
### getAllNameRecords() {#getAllNameRecords--}
```
public NameRecord[] getAllNameRecords()
```


Returnerar alla NameRecord-strukturer från tabellen.

**Returns:**
com.aspose.font.NameRecord[] – Alla NameRecord-strukturer från tabellen.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMultiLanguageNameById(NameId nameId) {#getMultiLanguageNameById-com.aspose.font.NameId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId)
```


returnerar ett namn efter nameId

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | name Id. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - name
### getMultiLanguageNameById(NameId nameId, PlatformId platformId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId)
```


Returnerar ett namn efter nameId med den passerade plattformsidentifieraren.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name Id. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattforms-ID. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)
```


Returnerar ett namn som objekt av typen MultiLanguageString. Metoden samlar alla NameRecord-strukturer som överensstämmer med de överförda parametrarna nameId, platformId och platformSpecificId och bygger sedan ett resulterande objekt baserat på denna strukturlista.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name Id. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattforms-ID. |
| platformSpecificId | int | Plattformspecifik Id. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getNameById(NameId nameId) {#getNameById-com.aspose.font.NameId-}
```
public String getNameById(NameId nameId)
```


Returnerar ett namn efter nameId om det hittas, annars null.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | name identifierare |

**Returns:**
java.lang.String – name
### getNameRecordsByNameId(NameId nameId) {#getNameRecordsByNameId-com.aspose.font.NameId-}
```
public NameRecord[] getNameRecordsByNameId(NameId nameId)
```


Returnerar alla NameRecord-strukturer där NameId-fältet är lika med det överförda nameId‑värdet. Om inga poster hittas returneras en tom array.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | name identifierare |

**Returns:**
com.aspose.font.NameRecord[] – Array av NameRecord-strukturer
### getOffset() {#getOffset--}
```
public long getOffset()
```


Hämtar förskjutning från början av sfnt.

**Returns:**
long - Förskjutning från början av sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Hämtar tabellens tagg.

**Returns:**
java.lang.String - Tabellens tagg.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referens till TTF-tabellarkivet.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
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




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName) {#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-}
```
public void updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)
```


Uppdaterar namn i post(er) som är relaterade till angiven plattform (kombination av platformId och platformSpecificId), kategori (nameId) och språk (languageId).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattformsidentifierare |
| platformSpecificId | int | Plattformspecifik kodningsidentifierare |
| nameId | [NameId](../../com.aspose.font/nameid) | Namnsidentifierare, logisk strängkategori, specificerad av NameId‑enumerationen |
| languageId | int | Språkidentifierare |
| newName | java.lang.String | Nytt namn eller ny strängdata |

### updateNamesByNameId(NameId nameId, String newName) {#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-}
```
public void updateNamesByNameId(NameId nameId, String newName)
```


Väljer alla poster som är relaterade till den logiska strängkategorin, specificerad av parametern nameId, och uppdaterar namn‑fältet (strängdata) i dessa poster. Fält som är relaterade till plattform (platformID, Platform-specific encoding ID) och språk (Language ID) påverkas inte av denna metod. Endast namn‑strängdata ersätts med ett nytt namn. Använd metoden med försiktighet, eftersom den kommer att ersätta de ursprungliga namnen för alla plattformar och språk som är kopplade till nameId. Det kan skapa konflikter i fall där de ursprungliga namnen hade olika värden, eftersom ersättningsoperationen ändrar alla dessa värden till ett nytt gemensamt. Och detta nya värde kan ha en logisk inkonsekvens med vissa plattformar och språk. Metoden är användbar i situationer där det ursprungliga namnet har en enda representation för alla plattformar och språk, till exempel när namn‑strängdata är på engelska.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Namnsidentifierare, logisk strängkategori, specificerad av NameId‑enumerationen |
| newName | java.lang.String | Nytt namn eller ny strängdata |

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

