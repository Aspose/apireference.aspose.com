---
title: "MultiLanguageString"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет многоязычную строку."
type: docs
weight: 66
url: /ru/java/com.aspose.font/multilanguagestring/
---
**Inheritance:**
java.lang.Object
```
public class MultiLanguageString
```

Представляет многоязычную строку.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [MultiLanguageString()](#MultiLanguageString--) | Создаёт пустую многоязычную строку. |
## Методы

| Метод | Описание |
| --- | --- |
| [addLanguageString(String str, int languageId)](#addLanguageString-java.lang.String-int-) | Добавляет строку конкретного языка |
| [containsString(String str)](#containsString-java.lang.String-) | Возвращает true, если строка присутствует во всех языковых строках. |
| [equals(Object objToCompare)](#equals-java.lang.Object-) | Возвращает true, если объекты считаются равными. |
| [getAllLanguageIds()](#getAllLanguageIds--) | Получает идентификаторы языков для всех строк или пустой массив, если строки отсутствуют. |
| [getAllStrings()](#getAllStrings--) | Возвращает все строки всех языков. |
| [getClass()](#getClass--) |  |
| [getEnglishString()](#getEnglishString--) | Возвращает английскую строку, если она найдена. |
| [getStringForLanguageId(int languageId)](#getStringForLanguageId-int-) | Возвращает строку, соответствующую переданному идентификатору языка, если она найдена. |
| [hashCode()](#hashCode--) | Реализация GetHashCode. |
| [isEmpty()](#isEmpty--) | True, если MultiLanguageString не содержит строк языков. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(MultiLanguageString obj1, String obj2)](#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-) | Реализация оператора равенства. |
| [op_Equality(String obj1, MultiLanguageString obj2)](#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-) | Реализация оператора равенства. |
| [op_Inequality(MultiLanguageString obj1, String obj2)](#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-) | Реализация оператора неравенства. |
| [op_Inequality(String obj1, MultiLanguageString obj2)](#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-) | Реализация оператора неравенства. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MultiLanguageString() {#MultiLanguageString--}
```
public MultiLanguageString()
```


Создаёт пустую многоязычную строку.

### addLanguageString(String str, int languageId) {#addLanguageString-java.lang.String-int-}
```
public void addLanguageString(String str, int languageId)
```


Добавляет строку конкретного языка

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| str | java.lang.String | Строка для добавления |
| languageId | int | Идентификатор языка |

### containsString(String str) {#containsString-java.lang.String-}
```
public boolean containsString(String str)
```


Возвращает true, если строка присутствует во всех языковых строках.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| str | java.lang.String | Строка для проверки. |

**Returns:**
boolean — True, если строка присутствует во всех языковых строках.
### equals(Object objToCompare) {#equals-java.lang.Object-}
```
public boolean equals(Object objToCompare)
```


Возвращает true, если объекты считаются равными.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| objToCompare | java.lang.Object | объект для сравнения с |

**Returns:**
boolean - результат сравнения
### getAllLanguageIds() {#getAllLanguageIds--}
```
public int[] getAllLanguageIds()
```


Получает идентификаторы языков для всех строк или пустой массив, если строки отсутствуют.

**Returns:**
int[] - Массив с идентификаторами языков или пустой массив, если строки отсутствуют.
### getAllStrings() {#getAllStrings--}
```
public String[] getAllStrings()
```


Возвращает все строки всех языков.

**Returns:**
java.lang.String[] - Массив всех строк всех языков.
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


Возвращает английскую строку, если найдена. В противном случае возвращает первую неанглийскую строку.

**Returns:**
java.lang.String - Английская строка, если найдена, иначе первая неанглийская строка.
### getStringForLanguageId(int languageId) {#getStringForLanguageId-int-}
```
public String getStringForLanguageId(int languageId)
```


Возвращает строку, связанную с переданным идентификатором языка, если найдена. В противном случае пустая строка.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| languageId | int | Идентификатор языка. |

**Returns:**
java.lang.String - Строка, связанная с переданным идентификатором языка, если найдена. Пустая строка в противном случае.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Реализация GetHashCode.

**Returns:**
int - хеш-код объекта
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


True, если MultiLanguageString не содержит строк языков.

**Returns:**
boolean - True, если MultiLanguageString не содержит строк языков.
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


Реализация оператора равенства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | первый объект для сравнения |
| obj2 | java.lang.String | второй объект для сравнения |

**Returns:**
boolean - результат сравнения
### op_Equality(String obj1, MultiLanguageString obj2) {#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Equality(String obj1, MultiLanguageString obj2)
```


Реализация оператора равенства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj1 | java.lang.String | строка для сравнения |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | многоязычная строка для сравнения |

**Returns:**
boolean - результат сравнения
### op_Inequality(MultiLanguageString obj1, String obj2) {#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Inequality(MultiLanguageString obj1, String obj2)
```


Реализация оператора неравенства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | строка для сравнения |
| obj2 | java.lang.String | многоязычная строка для сравнения |

**Returns:**
boolean - результат сравнения
### op_Inequality(String obj1, MultiLanguageString obj2) {#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Inequality(String obj1, MultiLanguageString obj2)
```


Реализация оператора неравенства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj1 | java.lang.String | строка для сравнения |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | многоязычная строка для сравнения |

**Returns:**
boolean - результат сравнения
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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

