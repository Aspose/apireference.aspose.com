---
title: "TtfNameTable"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Namens­tabelle der TTF‑Schriftdatei dar."
type: docs
weight: 105
url: /de/java/com.aspose.font/ttfnametable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfNameTable extends TtfTableBase
```

Stellt die "name"-Tabelle der TTF-Schriftdatei dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)](#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Extrahiert alle mehrsprachigen Zeichenketten aus dem übergebenen  mlNames‑Objekt und erstellt für jede extrahierte Zeichenkette eine entsprechende NameRecord‑Struktur unter Verwendung der übergebenen Parameter  platformId ,  platformSpecificId  und  nameId . |
| [addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)](#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-) | Fügt einen Eintrag in die Tabelle ein. |
| [deleteRecords(PlatformId platformId, int platformSpecificId)](#deleteRecords-com.aspose.font.PlatformId-int-) | Löscht alle Datensätze, die zur angegebenen Plattform gehören. |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Löscht alle Datensätze, die zu den übergebenen Parametern gehören. |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-) | Löscht Datensatz(e), die zu den angegebenen Parametern gehören. |
| [deleteRecordsByNameId(NameId nameId)](#deleteRecordsByNameId-com.aspose.font.NameId-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllNameRecords()](#getAllNameRecords--) | Gibt alle  NameRecord‑Strukturen aus der Tabelle zurück. |
| [getClass()](#getClass--) |  |
| [getMultiLanguageNameById(NameId nameId)](#getMultiLanguageNameById-com.aspose.font.NameId-) | Gibt einen Namen anhand von nameId zurück. |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-) | Gibt einen Namen anhand von nameId zurück, wobei der übergebene Plattform‑Bezeichner verwendet wird. |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-) | Gibt einen Namen als Objekt des Typs  MultiLanguageString  zurück. |
| [getNameById(NameId nameId)](#getNameById-com.aspose.font.NameId-) | Gibt einen Namen anhand von nameId zurück, falls gefunden, sonst null. |
| [getNameRecordsByNameId(NameId nameId)](#getNameRecordsByNameId-com.aspose.font.NameId-) | Gibt alle  NameRecord‑Strukturen zurück, deren NameId‑Feld dem übergebenen  nameId‑Wert entspricht. |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getTag()](#getTag--) | Liest das Tabellen-Tag. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)](#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-) | Aktualisiert den Namen in Datensatz(en), die zur angegebenen Plattform (Kombination aus platformId und platformSpecificId), Kategorie (nameId) und Sprache (languageId) gehören. |
| [updateNamesByNameId(NameId nameId, String newName)](#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-) | Wählt alle Datensätze aus, die zur logischen Zeichenkettenkategorie, angegeben durch den Parameter nameId, gehören, und aktualisiert das Namensfeld (Zeichenkettendaten) in diesen Datensätzen. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId) {#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)
```


Extrahiert alle mehrsprachigen Zeichenketten aus dem übergebenen  mlNames‑Objekt und erstellt für jede extrahierte Zeichenkette eine entsprechende NameRecord‑Struktur unter Verwendung der übergebenen Parameter  platformId ,  platformSpecificId  und  nameId . Der Wert für das Feld languageID wird aus dem  mlNames‑Objekt extrahiert. Der neu erstellte Datensatz wird der Tabelle hinzugefügt. Wird ein Datensatz gefunden, der mit den gerade erstellten Feldern platformID, platformSpecificID, nameID und languageId übereinstimmt, wird der neue Datensatz nicht hinzugefügt und nur die Zeichenkettendaten des bestehenden Datensatzes werden aktualisiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mlNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Mehrsprachige Zeichenkette |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattform‑Bezeichner |
| platformSpecificId | int | Plattform‑spezifischer Kodierungsbezeichner |
| nameId | [NameId](../../com.aspose.font/nameid) | Namensbezeichner, logische Zeichenkettenkategorie, angegeben durch die  NameId‑Aufzählung |

### addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name) {#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-}
```
public void addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)
```


Fügt einen Eintrag in die Tabelle ein. Die String-Datenkategorie, die hinzuzufügen ist, wird durch den Parameter name angegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Namenskennzeichen, logische String-Kategorie, angegeben durch die Aufzählung [NameId](../../com.aspose.font/nameid). |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattformkennzeichen. |
| platformSpecificId | int | Plattform-spezifischer Kodierungsbezeichner. Bitte verwenden Sie einen Wert aus einer der folgenden Aufzählungen – UnicodePlatformSpecificId, MacPlatformSpecificId, MSPlatformSpecificId. Welche Aufzählung zu verwenden ist, wird durch den Kontext (Parameter platformId) definiert. |
| languageId | int | Sprachkennzeichen. Bitte verwenden Sie einen Wert aus den Aufzählungen MSLanguageId oder MacLanguageId, abhängig vom Kontext, definiert durch den Parameter platformId. |
| Name | java.lang.String | Tatsächliche String-Daten. |

### deleteRecords(PlatformId platformId, int platformSpecificId) {#deleteRecords-com.aspose.font.PlatformId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId)
```


Löscht alle Datensätze, die zur angegebenen Plattform gehören.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattform‑Bezeichner |
| platformSpecificId | int | Plattform‑spezifischer Kodierungsbezeichner |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)
```


Löscht alle Datensätze, die zu den übergebenen Parametern gehören.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattform‑Bezeichner |
| platformSpecificId | int | Plattform‑spezifischer Kodierungsbezeichner |
| nameId | [NameId](../../com.aspose.font/nameid) | Namensbezeichner, logische Zeichenkettenkategorie, angegeben durch die  NameId‑Aufzählung |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)
```


Löscht Datensatz(e), die zu den angegebenen Parametern gehören.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattform‑Bezeichner |
| platformSpecificId | int | Plattform‑spezifischer Kodierungsbezeichner |
| nameId | [NameId](../../com.aspose.font/nameid) | Namensbezeichner, logische Zeichenkettenkategorie, angegeben durch die  NameId‑Aufzählung |
| languageId | int | Sprachkennung |

### deleteRecordsByNameId(NameId nameId) {#deleteRecordsByNameId-com.aspose.font.NameId-}
```
public void deleteRecordsByNameId(NameId nameId)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) |  |

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
### getAllNameRecords() {#getAllNameRecords--}
```
public NameRecord[] getAllNameRecords()
```


Gibt alle  NameRecord‑Strukturen aus der Tabelle zurück.

**Returns:**
com.aspose.font.NameRecord[] – Alle NameRecord-Strukturen aus der Tabelle.
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


Gibt einen Namen anhand von nameId zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name-ID. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - name
### getMultiLanguageNameById(NameId nameId, PlatformId platformId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId)
```


Gibt einen Namen anhand von nameId zurück, wobei der übergebene Plattform‑Bezeichner verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name-ID. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattform‑Id. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)
```


Gibt einen Namen als Objekt des Typs MultiLanguageString zurück. Die Methode sammelt alle NameRecord-Strukturen, die mit den übergebenen Parametern nameId, platformId und platformSpecificId übereinstimmen, und erstellt dann ein Ergebnisobjekt basierend auf dieser Strukturliste.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name-ID. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattform‑Id. |
| platformSpecificId | int | Plattform-spezifische ID. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getNameById(NameId nameId) {#getNameById-com.aspose.font.NameId-}
```
public String getNameById(NameId nameId)
```


Gibt einen Namen anhand von nameId zurück, falls gefunden, sonst null.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Namenskennzeichen |

**Returns:**
java.lang.String – name
### getNameRecordsByNameId(NameId nameId) {#getNameRecordsByNameId-com.aspose.font.NameId-}
```
public NameRecord[] getNameRecordsByNameId(NameId nameId)
```


Gibt alle NameRecord-Strukturen zurück, deren NameId-Feld dem übergebenen nameId-Wert entspricht. Wenn keine Datensätze gefunden werden, wird ein leeres Array zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Namenskennzeichen |

**Returns:**
com.aspose.font.NameRecord[] – Array von NameRecord-Strukturen
### getOffset() {#getOffset--}
```
public long getOffset()
```


Liefert den Offset vom Anfang des sfnt.

**Returns:**
long - Offset vom Anfang des sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Liest das Tabellen-Tag.

**Returns:**
java.lang.String - Tabellen‑Tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Verweis auf das TTF-Tabellen-Repository.

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


Aktualisiert den Namen in Datensatz(en), die zur angegebenen Plattform (Kombination aus platformId und platformSpecificId), Kategorie (nameId) und Sprache (languageId) gehören.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Plattform‑Bezeichner |
| platformSpecificId | int | Plattform‑spezifischer Kodierungsbezeichner |
| nameId | [NameId](../../com.aspose.font/nameid) | Namensbezeichner, logische Zeichenkettenkategorie, angegeben durch die  NameId‑Aufzählung |
| languageId | int | Sprachkennung |
| newName | java.lang.String | Neuer Name oder neue String-Daten |

### updateNamesByNameId(NameId nameId, String newName) {#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-}
```
public void updateNamesByNameId(NameId nameId, String newName)
```


Wählt alle Datensätze aus, die mit der logischen String‑Kategorie, angegeben durch den Parameter nameId, zusammenhängen, und aktualisiert das Namensfeld (String‑Daten) in diesen Datensätzen. Felder, die die Plattform (platformID, Plattform‑spezifische Kodierungs‑ID) und die Sprache (Language ID) betreffen, werden von dieser Methode nicht beeinflusst. Nur die String‑Daten des Namens werden durch einen neuen Namen ersetzt. Verwenden Sie diese Methode mit Vorsicht, da sie die ursprünglichen Namen für alle Plattformen und Sprachen, die zu nameId gehören, ersetzt. Es kann zu Konflikten führen, wenn die ursprünglichen Namen unterschiedliche Werte hatten, da der Ersetzungsvorgang all diese Werte durch einen einzigen neuen Wert ändert. Und dieser neue Wert kann eine logische Inkonsistenz mit einigen Plattformen und Sprachen aufweisen. Diese Methode ist nützlich für Fälle, in denen der ursprüngliche Name eine einheitliche Darstellung für alle Plattformen und Sprachen hat, zum Beispiel wenn die String‑Daten des Namens in englischer Sprache vorliegen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Namensbezeichner, logische Zeichenkettenkategorie, angegeben durch die  NameId‑Aufzählung |
| newName | java.lang.String | Neuer Name oder neue String-Daten |

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

