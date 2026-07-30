---
title: "TtfNameTable"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет таблицу имён файла шрифта TTF."
type: docs
weight: 105
url: /ru/java/com.aspose.font/ttfnametable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfNameTable extends TtfTableBase
```

Представляет таблицу "name" файла шрифта TTF.
## Методы

| Метод | Описание |
| --- | --- |
| [addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)](#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Извлекает все многоязычные строки из переданного объекта  mlNames  и создает соответствующую структуру NameRecord для каждой извлечённой строки, используя переданные параметры  platformId ,  platformSpecificId  и  nameId . |
| [addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)](#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-) | Добавляет запись в таблицу. |
| [deleteRecords(PlatformId platformId, int platformSpecificId)](#deleteRecords-com.aspose.font.PlatformId-int-) | Удаляет все записи, связанные с указанной платформой. |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Удаляет все записи, связанные с переданными параметрами. |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-) | Удаляет запись(и), связанные с указанными параметрами. |
| [deleteRecordsByNameId(NameId nameId)](#deleteRecordsByNameId-com.aspose.font.NameId-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllNameRecords()](#getAllNameRecords--) | Возвращает все структуры  NameRecord  из таблицы. |
| [getClass()](#getClass--) |  |
| [getMultiLanguageNameById(NameId nameId)](#getMultiLanguageNameById-com.aspose.font.NameId-) | возвращает имя по nameId |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-) | Возвращает имя по nameId, используя переданный идентификатор платформы. |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-) | Возвращает имя в виде объекта типа  MultiLanguageString . |
| [getNameById(NameId nameId)](#getNameById-com.aspose.font.NameId-) | Возвращает имя по nameId, если найдено, иначе null. |
| [getNameRecordsByNameId(NameId nameId)](#getNameRecordsByNameId-com.aspose.font.NameId-) | Возвращает все структуры  NameRecord , у которых поле NameId равно переданному значению  nameId . |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)](#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-) | Обновляет имя в записи(ях), связанных с указанной платформой (комбинация platformId и platformSpecificId), категорией (nameId) и языком (languageId). |
| [updateNamesByNameId(NameId nameId, String newName)](#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-) | Выбирает все записи, связанные с логической категорией строки, указанной параметром nameId, и обновляет поле name (строковые данные) в этих записях. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId) {#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)
```


Извлекает все многоязычные строки из переданного объекта  mlNames  и создает соответствующую структуру NameRecord для каждой извлечённой строки, используя переданные параметры  platformId ,  platformSpecificId  и  nameId . Значение поля languageID извлекается из объекта  mlNames . Новая только что созданная запись добавляется в таблицу. Если будет найдена запись, совпадающая с только что созданной по полям platformID, platformSpecificID, nameID и, langugeId, то новая созданная запись не будет добавлена и только строковые данные будут обновлены для существующей записи.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| mlNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Многоязычная строка |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Идентификатор платформы |
| platformSpecificId | int | Идентификатор кодировки, специфичной для платформы |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор имени, логическая категория строки, указанная перечислением  NameId  |

### addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name) {#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-}
```
public void addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)
```


Добавляет запись в таблицу. Категория строковых данных для добавления указывается параметром  name .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор имени, логическая категория строк, указана перечислением [NameId](../../com.aspose.font/nameid). |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Идентификатор платформы. |
| platformSpecificId | int | Идентификатор кодировки, специфичной для платформы. Пожалуйста, используйте значение из одного из перечислений —  UnicodePlatformSpecificId ,  MacPlatformSpecificId ,  MSPlatformSpecificId . Какое перечисление использовать, определяется контекстом ( параметр  platformId ). |
| languageId | int | Идентификатор языка. Пожалуйста, используйте значение из перечислений  MSLanguageId  или  MacLanguageId , в зависимости от контекста, определяемого параметром  platformId . |
| имя | java.lang.String | Фактические строковые данные. |

### deleteRecords(PlatformId platformId, int platformSpecificId) {#deleteRecords-com.aspose.font.PlatformId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId)
```


Удаляет все записи, связанные с указанной платформой.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Идентификатор платформы |
| platformSpecificId | int | Идентификатор кодировки, специфичной для платформы |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)
```


Удаляет все записи, связанные с переданными параметрами.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Идентификатор платформы |
| platformSpecificId | int | Идентификатор кодировки, специфичной для платформы |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор имени, логическая категория строки, указанная перечислением  NameId  |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)
```


Удаляет запись(и), связанные с указанными параметрами.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Идентификатор платформы |
| platformSpecificId | int | Идентификатор кодировки, специфичной для платформы |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор имени, логическая категория строки, указанная перечислением  NameId  |
| languageId | int | Идентификатор языка |

### deleteRecordsByNameId(NameId nameId) {#deleteRecordsByNameId-com.aspose.font.NameId-}
```
public void deleteRecordsByNameId(NameId nameId)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) |  |

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
### getAllNameRecords() {#getAllNameRecords--}
```
public NameRecord[] getAllNameRecords()
```


Возвращает все структуры  NameRecord  из таблицы.

**Returns:**
com.aspose.font.NameRecord[] - Все структуры  NameRecord  из таблицы.
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


возвращает имя по nameId

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор name. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - name
### getMultiLanguageNameById(NameId nameId, PlatformId platformId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId)
```


Возвращает имя по nameId, используя переданный идентификатор платформы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор Name. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Идентификатор платформы. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)
```


Возвращает имя в виде объекта типа  MultiLanguageString . Метод собирает все структуры NameRecord, которые совпадают с переданными параметрами nameId, platformId и platformSpecificId, а затем создает результирующий объект на основе этого списка структур.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор Name. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Идентификатор платформы. |
| platformSpecificId | int | Идентификатор, специфичный для платформы. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getNameById(NameId nameId) {#getNameById-com.aspose.font.NameId-}
```
public String getNameById(NameId nameId)
```


Возвращает имя по nameId, если найдено, иначе null.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор name |

**Returns:**
java.lang.String - name
### getNameRecordsByNameId(NameId nameId) {#getNameRecordsByNameId-com.aspose.font.NameId-}
```
public NameRecord[] getNameRecordsByNameId(NameId nameId)
```


Возвращает все структуры  NameRecord , у которых поле NameId равно переданному значению  nameId . Если записи не найдены, будет возвращен пустой массив.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор name |

**Returns:**
com.aspose.font.NameRecord[] - Массив структур  NameRecord 
### getOffset() {#getOffset--}
```
public long getOffset()
```


Получает смещение от начала sfnt.

**Returns:**
long — Смещение от начала sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Получает тег таблицы.

**Returns:**
java.lang.String - Тег таблицы.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Ссылка на репозиторий таблицы TTF.

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


Обновляет имя в записи(ях), связанных с указанной платформой (комбинация platformId и platformSpecificId), категорией (nameId) и языком (languageId).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Идентификатор платформы |
| platformSpecificId | int | Идентификатор кодировки, специфичной для платформы |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор имени, логическая категория строки, указанная перечислением  NameId  |
| languageId | int | Идентификатор языка |
| newName | java.lang.String | Новое имя или новые строковые данные |

### updateNamesByNameId(NameId nameId, String newName) {#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-}
```
public void updateNamesByNameId(NameId nameId, String newName)
```


Выбирает все записи, связанные с логической категорией строк, указанной параметром nameId, и обновляет поле name (строковые данные) в этих записях. Поля, связанные с платформой (platformID, Platform-specific encoding ID) и языком (Language ID), этим методом не затрагиваются. Заменяются только строковые данные name на новое имя. Используйте этот метод с осторожностью, так как он заменит оригинальные имена для всех платформ и языков, связанных с nameId. Это может вызвать конфликты в случаях, когда оригинальные имена имели разные значения, поскольку операция замены меняет все эти значения на одно новое. И новое значение может быть логически несогласованным с некоторыми платформами и языками. Метод полезен в ситуациях, когда оригинальное имя имеет единственное представление для всех платформ и языков, например, когда строковые данные name находятся на английском языке.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Идентификатор имени, логическая категория строки, указанная перечислением  NameId  |
| newName | java.lang.String | Новое имя или новые строковые данные |

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

