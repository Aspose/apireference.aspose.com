---
title: "MultiLanguageString"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta una stringa multilingua."
type: docs
weight: 66
url: /it/java/com.aspose.font/multilanguagestring/
---
**Inheritance:**
java.lang.Object
```
public class MultiLanguageString
```

Rappresenta una stringa multilingua.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [MultiLanguageString()](#MultiLanguageString--) | Crea una stringa multilingue vuota. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [addLanguageString(String str, int languageId)](#addLanguageString-java.lang.String-int-) | Aggiunge una stringa di una lingua specifica |
| [containsString(String str)](#containsString-java.lang.String-) | Restituisce true se la stringa è presente in tutte le stringhe delle lingue. |
| [equals(Object objToCompare)](#equals-java.lang.Object-) | Restituisce true se gli oggetti sono considerati uguali. |
| [getAllLanguageIds()](#getAllLanguageIds--) | Ottiene gli identificatori di lingua per tutte le stringhe o un array vuoto se non sono presenti stringhe. |
| [getAllStrings()](#getAllStrings--) | Restituisce tutte le stringhe di tutte le lingue. |
| [getClass()](#getClass--) |  |
| [getEnglishString()](#getEnglishString--) | Restituisce la stringa inglese se trovata. |
| [getStringForLanguageId(int languageId)](#getStringForLanguageId-int-) | Restituisce la stringa relativa all'identificatore di lingua fornito, se trovata. |
| [hashCode()](#hashCode--) | Implementazione di GetHashCode. |
| [isEmpty()](#isEmpty--) | True, se MultiLanguageString non ha stringhe di lingue. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(MultiLanguageString obj1, String obj2)](#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-) | Implementazione dell'operatore di uguaglianza. |
| [op_Equality(String obj1, MultiLanguageString obj2)](#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-) | Implementazione dell'operatore di uguaglianza. |
| [op_Inequality(MultiLanguageString obj1, String obj2)](#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-) | Implementazione dell'operatore di disuguaglianza. |
| [op_Inequality(String obj1, MultiLanguageString obj2)](#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-) | Implementazione dell'operatore di disuguaglianza. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MultiLanguageString() {#MultiLanguageString--}
```
public MultiLanguageString()
```


Crea una stringa multilingue vuota.

### addLanguageString(String str, int languageId) {#addLanguageString-java.lang.String-int-}
```
public void addLanguageString(String str, int languageId)
```


Aggiunge una stringa di una lingua specifica

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | java.lang.String | Stringa da aggiungere |
| languageId | int | Identificatore della lingua |

### containsString(String str) {#containsString-java.lang.String-}
```
public boolean containsString(String str)
```


Restituisce true se la stringa è presente in tutte le stringhe delle lingue.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | java.lang.String | Stringa da verificare. |

**Returns:**
boolean - True se la stringa è presente in tutte le stringhe delle lingue.
### equals(Object objToCompare) {#equals-java.lang.Object-}
```
public boolean equals(Object objToCompare)
```


Restituisce true se gli oggetti sono considerati uguali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| objToCompare | java.lang.Object | oggetto da confrontare con |

**Returns:**
boolean - risultato del confronto
### getAllLanguageIds() {#getAllLanguageIds--}
```
public int[] getAllLanguageIds()
```


Ottiene gli identificatori di lingua per tutte le stringhe o un array vuoto se non sono presenti stringhe.

**Returns:**
int[] - Array con identificatori di lingua o array vuoto se non sono presenti stringhe.
### getAllStrings() {#getAllStrings--}
```
public String[] getAllStrings()
```


Restituisce tutte le stringhe di tutte le lingue.

**Returns:**
java.lang.String[] - Array di tutte le stringhe di tutte le lingue.
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


Restituisce la stringa inglese se trovata. Altrimenti restituisce la prima stringa non inglese.

**Returns:**
java.lang.String - Stringa inglese se trovata, altrimenti la prima stringa non inglese.
### getStringForLanguageId(int languageId) {#getStringForLanguageId-int-}
```
public String getStringForLanguageId(int languageId)
```


Restituisce la stringa relativa all'identificatore di lingua fornito, se trovata. Stringa vuota altrimenti.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| languageId | int | Identificatore di lingua. |

**Returns:**
java.lang.String - Stringa relativa all'identificatore di lingua fornito, se trovata. Stringa vuota altrimenti.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Implementazione di GetHashCode.

**Returns:**
int - codice hash dell'oggetto
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


True, se MultiLanguageString non ha stringhe di lingue.

**Returns:**
boolean - True, se MultiLanguageString non ha stringhe di lingue.
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


Implementazione dell'operatore di uguaglianza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | primo oggetto da confrontare |
| obj2 | java.lang.String | secondo oggetto da confrontare |

**Returns:**
boolean - risultato del confronto
### op_Equality(String obj1, MultiLanguageString obj2) {#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Equality(String obj1, MultiLanguageString obj2)
```


Implementazione dell'operatore di uguaglianza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj1 | java.lang.String | stringa da confrontare |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | stringa multilingua da confrontare |

**Returns:**
boolean - risultato del confronto
### op_Inequality(MultiLanguageString obj1, String obj2) {#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Inequality(MultiLanguageString obj1, String obj2)
```


Implementazione dell'operatore di disuguaglianza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | stringa da confrontare |
| obj2 | java.lang.String | stringa multilingua da confrontare |

**Returns:**
boolean - risultato del confronto
### op_Inequality(String obj1, MultiLanguageString obj2) {#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Inequality(String obj1, MultiLanguageString obj2)
```


Implementazione dell'operatore di disuguaglianza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj1 | java.lang.String | stringa da confrontare |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | stringa multilingua da confrontare |

**Returns:**
boolean - risultato del confronto
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

