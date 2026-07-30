---
title: "MultiLanguageString"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt einen mehrsprachigen String dar."
type: docs
weight: 66
url: /de/java/com.aspose.font/multilanguagestring/
---
**Inheritance:**
java.lang.Object
```
public class MultiLanguageString
```

Stellt einen mehrsprachigen String dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [MultiLanguageString()](#MultiLanguageString--) | Erstellt eine leere mehrsprachige Zeichenkette. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addLanguageString(String str, int languageId)](#addLanguageString-java.lang.String-int-) | Fügt eine Zeichenkette einer bestimmten Sprache hinzu. |
| [containsString(String str)](#containsString-java.lang.String-) | Gibt true zurück, wenn die Zeichenkette in allen Sprachzeichenketten enthalten ist. |
| [equals(Object objToCompare)](#equals-java.lang.Object-) | Gibt true zurück, wenn die Objekte als gleich betrachtet werden. |
| [getAllLanguageIds()](#getAllLanguageIds--) | Ermittelt Sprachkennungen für alle Zeichenketten oder ein leeres Array, wenn keine Zeichenketten vorhanden sind. |
| [getAllStrings()](#getAllStrings--) | Gibt alle Zeichenketten aller Sprachen zurück. |
| [getClass()](#getClass--) |  |
| [getEnglishString()](#getEnglishString--) | Gibt die englische Zeichenkette zurück, falls gefunden. |
| [getStringForLanguageId(int languageId)](#getStringForLanguageId-int-) | Gibt die zur übergebenen Sprachkennung gehörende Zeichenkette zurück, falls gefunden. |
| [hashCode()](#hashCode--) | Implementierung von GetHashCode. |
| [isEmpty()](#isEmpty--) | True, wenn MultiLanguageString keine Sprachzeichenketten enthält. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(MultiLanguageString obj1, String obj2)](#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-) | Implementierung des Gleichheitsoperators. |
| [op_Equality(String obj1, MultiLanguageString obj2)](#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-) | Implementierung des Gleichheitsoperators. |
| [op_Inequality(MultiLanguageString obj1, String obj2)](#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-) | Implementierung des Ungleichheitsoperators. |
| [op_Inequality(String obj1, MultiLanguageString obj2)](#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-) | Implementierung des Ungleichheitsoperators. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MultiLanguageString() {#MultiLanguageString--}
```
public MultiLanguageString()
```


Erstellt eine leere mehrsprachige Zeichenkette.

### addLanguageString(String str, int languageId) {#addLanguageString-java.lang.String-int-}
```
public void addLanguageString(String str, int languageId)
```


Fügt eine Zeichenkette einer bestimmten Sprache hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | java.lang.String | Zeichenkette zum Hinzufügen |
| languageId | int | Sprachkennung |

### containsString(String str) {#containsString-java.lang.String-}
```
public boolean containsString(String str)
```


Gibt true zurück, wenn die Zeichenkette in allen Sprachzeichenketten enthalten ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | java.lang.String | Zeichenkette zum Prüfen. |

**Returns:**
boolean - True, wenn die Zeichenkette in allen Sprachzeichenketten enthalten ist.
### equals(Object objToCompare) {#equals-java.lang.Object-}
```
public boolean equals(Object objToCompare)
```


Gibt true zurück, wenn die Objekte als gleich betrachtet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| objToCompare | java.lang.Object | Objekt zum Vergleichen mit |

**Returns:**
boolean - Vergleichsergebnis
### getAllLanguageIds() {#getAllLanguageIds--}
```
public int[] getAllLanguageIds()
```


Ermittelt Sprachkennungen für alle Zeichenketten oder ein leeres Array, wenn keine Zeichenketten vorhanden sind.

**Returns:**
int[] - Array mit Sprachkennungen oder leeres Array, wenn keine Zeichenketten vorhanden sind.
### getAllStrings() {#getAllStrings--}
```
public String[] getAllStrings()
```


Gibt alle Zeichenketten aller Sprachen zurück.

**Returns:**
java.lang.String[] - Array aller Zeichenketten aller Sprachen.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEnglishString() {#getEnglishString--}
```
public String getEnglishString()
```


Gibt die englische Zeichenkette zurück, wenn gefunden. Andernfalls wird die erste nicht-englische Zeichenkette zurückgegeben.

**Returns:**
java.lang.String - Englische Zeichenkette, wenn gefunden, sonst die erste nicht-englische Zeichenkette.
### getStringForLanguageId(int languageId) {#getStringForLanguageId-int-}
```
public String getStringForLanguageId(int languageId)
```


Gibt die zu der übergebenen Sprachkennung gehörende Zeichenkette zurück, falls gefunden. Andernfalls leere Zeichenkette.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| languageId | int | Sprachkennung. |

**Returns:**
java.lang.String - Zeichenkette, die zur übergebenen Sprachkennung gehört, falls gefunden. Andernfalls leere Zeichenkette.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Implementierung von GetHashCode.

**Returns:**
int - Hashcode des Objekts
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


True, wenn MultiLanguageString keine Sprachzeichenketten enthält.

**Returns:**
boolean - Wahr, wenn MultiLanguageString keine Zeichenketten von Sprachen hat.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(MultiLanguageString obj1, String obj2) {#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Equality(MultiLanguageString obj1, String obj2)
```


Implementierung des Gleichheitsoperators.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | erstes Objekt zum Vergleichen |
| obj2 | java.lang.String | zweites Objekt zum Vergleichen |

**Returns:**
boolean - Vergleichsergebnis
### op_Equality(String obj1, MultiLanguageString obj2) {#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Equality(String obj1, MultiLanguageString obj2)
```


Implementierung des Gleichheitsoperators.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj1 | java.lang.String | Zeichenkette zum Vergleichen |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | mehrsprachige Zeichenkette zum Vergleichen |

**Returns:**
boolean - Vergleichsergebnis
### op_Inequality(MultiLanguageString obj1, String obj2) {#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Inequality(MultiLanguageString obj1, String obj2)
```


Implementierung des Ungleichheitsoperators.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Zeichenkette zum Vergleichen |
| obj2 | java.lang.String | mehrsprachige Zeichenkette zum Vergleichen |

**Returns:**
boolean - Vergleichsergebnis
### op_Inequality(String obj1, MultiLanguageString obj2) {#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Inequality(String obj1, MultiLanguageString obj2)
```


Implementierung des Ungleichheitsoperators.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj1 | java.lang.String | Zeichenkette zum Vergleichen |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | mehrsprachige Zeichenkette zum Vergleichen |

**Returns:**
boolean - Vergleichsergebnis
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

