---
title: "MultiLanguageString"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar flerspråkig sträng."
type: docs
weight: 66
url: /sv/java/com.aspose.font/multilanguagestring/
---
**Inheritance:**
java.lang.Object
```
public class MultiLanguageString
```

Representerar flerspråkig sträng.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [MultiLanguageString()](#MultiLanguageString--) | Skapar en tom flerspråkig sträng. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [addLanguageString(String str, int languageId)](#addLanguageString-java.lang.String-int-) | Lägger till en sträng för ett specifikt språk. |
| [containsString(String str)](#containsString-java.lang.String-) | Returnerar true om strängen finns i alla språksträngar. |
| [equals(Object objToCompare)](#equals-java.lang.Object-) | Returnerar true om objekten anses vara lika. |
| [getAllLanguageIds()](#getAllLanguageIds--) | Hämtar språkidentifierare för alla strängar eller en tom array om inga strängar finns. |
| [getAllStrings()](#getAllStrings--) | Returnerar alla strängar för alla språk. |
| [getClass()](#getClass--) |  |
| [getEnglishString()](#getEnglishString--) | Returnerar engelsk sträng om den hittas. |
| [getStringForLanguageId(int languageId)](#getStringForLanguageId-int-) | Returnerar strängen som motsvarar den angivna språkidentifieraren, om den hittas. |
| [hashCode()](#hashCode--) | GetHashCode-implementation. |
| [isEmpty()](#isEmpty--) | True, om MultiLanguageString inte har några språksträngar. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(MultiLanguageString obj1, String obj2)](#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-) | Implementering av likhetsoperator. |
| [op_Equality(String obj1, MultiLanguageString obj2)](#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-) | Implementering av likhetsoperator. |
| [op_Inequality(MultiLanguageString obj1, String obj2)](#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-) | Implementering av ojämlikhetsoperator. |
| [op_Inequality(String obj1, MultiLanguageString obj2)](#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-) | Implementering av ojämlikhetsoperator. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MultiLanguageString() {#MultiLanguageString--}
```
public MultiLanguageString()
```


Skapar en tom flerspråkig sträng.

### addLanguageString(String str, int languageId) {#addLanguageString-java.lang.String-int-}
```
public void addLanguageString(String str, int languageId)
```


Lägger till en sträng för ett specifikt språk.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| str | java.lang.String | Sträng att lägga till |
| languageId | int | Språkidentifierare |

### containsString(String str) {#containsString-java.lang.String-}
```
public boolean containsString(String str)
```


Returnerar true om strängen finns i alla språksträngar.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| str | java.lang.String | Sträng att kontrollera. |

**Returns:**
boolean - True om strängen finns i alla språksträngar.
### equals(Object objToCompare) {#equals-java.lang.Object-}
```
public boolean equals(Object objToCompare)
```


Returnerar true om objekten anses vara lika.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| objToCompare | java.lang.Object | objekt att jämföra med |

**Returns:**
boolean - jämförelsresultat
### getAllLanguageIds() {#getAllLanguageIds--}
```
public int[] getAllLanguageIds()
```


Hämtar språkidentifierare för alla strängar eller en tom array om inga strängar finns.

**Returns:**
int[] - Array med språkidentifierare eller tom array om inga strängar finns.
### getAllStrings() {#getAllStrings--}
```
public String[] getAllStrings()
```


Returnerar alla strängar för alla språk.

**Returns:**
java.lang.String[] - Array med alla strängar för alla språk.
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


Returnerar engelsk sträng om den finns. Annars returneras den första icke-engelska strängen.

**Returns:**
java.lang.String - Engelsk sträng om den finns, annars den första icke-engelska strängen.
### getStringForLanguageId(int languageId) {#getStringForLanguageId-int-}
```
public String getStringForLanguageId(int languageId)
```


Returnerar sträng relaterad till den angivna språkidentifieraren, om den finns. Tom sträng annars.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| languageId | int | Språkidentifierare. |

**Returns:**
java.lang.String - Sträng relaterad till den angivna språkidentifieraren, om den finns. Tom sträng annars.
### hashCode() {#hashCode--}
```
public int hashCode()
```


GetHashCode-implementation.

**Returns:**
int - hashkod för objektet
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


True, om MultiLanguageString inte har några språksträngar.

**Returns:**
boolean - Sant, om MultiLanguageString inte har strängar för språk.
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


Implementering av likhetsoperator.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | första objektet att jämföra |
| obj2 | java.lang.String | andra objektet att jämföra |

**Returns:**
boolean - jämförelsresultat
### op_Equality(String obj1, MultiLanguageString obj2) {#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Equality(String obj1, MultiLanguageString obj2)
```


Implementering av likhetsoperator.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj1 | java.lang.String | sträng att jämföra |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | flerspråkig sträng att jämföra |

**Returns:**
boolean - jämförelsresultat
### op_Inequality(MultiLanguageString obj1, String obj2) {#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Inequality(MultiLanguageString obj1, String obj2)
```


Implementering av ojämlikhetsoperator.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | sträng att jämföra |
| obj2 | java.lang.String | flerspråkig sträng att jämföra |

**Returns:**
boolean - jämförelsresultat
### op_Inequality(String obj1, MultiLanguageString obj2) {#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Inequality(String obj1, MultiLanguageString obj2)
```


Implementering av ojämlikhetsoperator.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj1 | java.lang.String | sträng att jämföra |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | flerspråkig sträng att jämföra |

**Returns:**
boolean - jämförelsresultat
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

