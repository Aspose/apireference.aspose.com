---
title: "ExternalFontCache"
second_title: "Справочник API Aspose.Page для Java"
description: "Используйте этот класс для получения инкапсуляции шрифта в форме, принимаемой Device."
type: docs
weight: 13
url: /ru/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Используйте этот класс для получения инкапсуляции шрифта в форме, принимаемой Device.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Поля

| Поле | Описание |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Размер шрифта по умолчанию. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Стиль шрифта по умолчанию. |
## Методы

| Метод | Описание |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | Получает DrFont по имени семейства шрифтов, размеру по умолчанию (1) и стилю по умолчанию (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | Получает DrFont по имени семейства шрифтов, размеру по умолчанию (1) и стилю. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Получает DrFont по имени семейства шрифтов, размеру и стилю. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Получает DrFont по имени семейства шрифтов, размеру, стилю и заглавным буквам шрифта. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Получает DrFont по имени семейства шрифтов, размеру, стилю и альтернативному имени семейства шрифтов. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Получает DrFont по имени семейства шрифтов, размеру, стилю, заглавным буквам шрифта и альтернативному имени семейства шрифтов. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Получает TTFont по имени семейства шрифтов, стилю и альтернативному имени семейства шрифтов. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Указывает дополнительные папки шрифтов. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final float DEFAULT_SIZE
```


Размер шрифта по умолчанию.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Стиль шрифта по умолчанию.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


Получает DrFont по имени семейства шрифтов, размеру по умолчанию (1) и стилю по умолчанию (PLAIN).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| familyName | java.lang.String | Имя семейства шрифта. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


Получает DrFont по имени семейства шрифтов, размеру по умолчанию (1) и стилю.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| familyName | java.lang.String | Имя семейства шрифта. |
| стиль | int | Стиль шрифта. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Получает DrFont по имени семейства шрифтов, размеру и стилю.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| familyName | java.lang.String | Имя семейства шрифта. |
| sizePoints | float | Размер шрифта в пунктах (один пункт = 1/72 дюйма). |
| стиль | int | Стиль шрифта. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Получает DrFont по имени семейства шрифтов, размеру, стилю и заглавным буквам шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| familyName | java.lang.String | Имя семейства шрифта. |
| sizePoints | float | Размер шрифта в пунктах (один пункт = 1/72 дюйма). |
| стиль | int | Стиль шрифта. |
| fontCapitals | int | Заглавные буквы шрифта. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Получает DrFont по имени семейства шрифтов, размеру, стилю и альтернативному имени семейства шрифтов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| familyName | java.lang.String | Имя семейства шрифта. |
| sizePoints | float | Размер шрифта в пунктах (один пункт = 1/72 дюйма). |
| стиль | int | Стиль шрифта. |
| altFamilyName | java.lang.String | Альтернативное название семейства шрифтов. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Получает DrFont по имени семейства шрифтов, размеру, стилю, заглавным буквам шрифта и альтернативному имени семейства шрифтов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| familyName | java.lang.String | Имя семейства шрифта. |
| sizePoints | float | Размер шрифта в пунктах (один пункт = 1/72 дюйма). |
| стиль | int | Стиль шрифта. |
| altFamilyName | java.lang.String | Альтернативное название семейства шрифтов. |
| fontCapitals | int | Заглавные буквы шрифта. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Получает TTFont по имени семейства шрифтов, стилю и альтернативному имени семейства шрифтов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| familyName | java.lang.String | Имя семейства шрифта. |
| стиль | int | Стиль шрифта. |
| altFamilyName | java.lang.String | Альтернативное название семейства шрифтов. |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
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




### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


Указывает дополнительные папки шрифтов. Папки шрифтов, используемые ОС, по умолчанию используются ExternalFont Cache. Нет необходимости их определять,

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | Массив дополнительных папок шрифтов. |

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

