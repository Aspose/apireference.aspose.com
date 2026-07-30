---
title: "TtfStatTable"
second_title: "Справочник API Aspose.Font for Java"
description: 
type: docs
weight: 109
url: /ru/java/com.aspose.font/ttfstattable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfStatTable extends TtfTableBase
```
## Методы

| Метод | Описание |
| --- | --- |
| [addAxisRecord(AxisRecord axisRecord)](#addAxisRecord-com.aspose.font.AxisRecord-) | Добавляет структуру Axis Record в таблицу. |
| [addAxisValueTable(AxisValueTableBase axisValueTable)](#addAxisValueTable-com.aspose.font.AxisValueTableBase-) | Добавляет структуру Axis Value Table в таблицу. |
| [clearAxisRecords()](#clearAxisRecords--) | Удаляет все записи осей из таблицы. |
| [clearAxisValueTables()](#clearAxisValueTables--) | Удаляет все таблицы значений осей из таблицы. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisRecords()](#getAxisRecords--) | Возвращает массив осей дизайна. |
| [getAxisValueCount()](#getAxisValueCount--) | Возвращает количество таблиц значений осей. |
| [getAxisValueTables()](#getAxisValueTables--) | Возвращает массив таблиц значений осей. |
| [getClass()](#getClass--) |  |
| [getDesignAxisCount()](#getDesignAxisCount--) | Возвращает количество записей осей. |
| [getElidedFallbackName()](#getElidedFallbackName--) | Spec: Имя, используемое в качестве резервного, когда проекция имён в конкретную модель шрифта приводит к подсемейному имени, содержащему только опускаемые элементы. |
| [getElidedFallbackNameId()](#getElidedFallbackNameId--) | Spec: Идентификатор имени, используемый в качестве резервного, когда проекция имён в конкретную модель шрифта приводит к подсемейному имени, содержащему только опускаемые элементы. |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addAxisRecord(AxisRecord axisRecord) {#addAxisRecord-com.aspose.font.AxisRecord-}
```
public void addAxisRecord(AxisRecord axisRecord)
```


Добавляет структуру Axis Record в таблицу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| axisRecord | [AxisRecord](../../com.aspose.font/axisrecord) | структура AxisRecord |

### addAxisValueTable(AxisValueTableBase axisValueTable) {#addAxisValueTable-com.aspose.font.AxisValueTableBase-}
```
public void addAxisValueTable(AxisValueTableBase axisValueTable)
```


Добавляет структуру Axis Value Table в таблицу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| axisValueTable | [AxisValueTableBase](../../com.aspose.font/axisvaluetablebase) | структура таблицы значений оси |

### clearAxisRecords() {#clearAxisRecords--}
```
public void clearAxisRecords()
```


Удаляет все записи осей из таблицы.

### clearAxisValueTables() {#clearAxisValueTables--}
```
public void clearAxisValueTables()
```


Удаляет все таблицы значений осей из таблицы.

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
### getAxisRecords() {#getAxisRecords--}
```
public AxisRecord[] getAxisRecords()
```


Возвращает массив осей дизайна. Массив осей — это массив структур типа Axis Record. Spec: запись оси предоставляет информацию об одной оси дизайна.

**Returns:**
com.aspose.font.AxisRecord[] — массив осей дизайна.
### getAxisValueCount() {#getAxisValueCount--}
```
public int getAxisValueCount()
```


Возвращает количество таблиц значений осей.

**Returns:**
int — количество таблиц значений осей.
### getAxisValueTables() {#getAxisValueTables--}
```
public AxisValueTableBase[] getAxisValueTables()
```


Возвращает массив таблиц значений осей. Spec: Таблицы значений осей предоставляют детали относительно конкретного значения атрибута стиля на определённой оси вариации дизайна, либо комбинации значений осей вариации дизайна, и отношения этих значений к меткам, используемым как элементы в подсемейных именах.

**Returns:**
com.aspose.font.AxisValueTableBase[] - Массив таблиц значений осей.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDesignAxisCount() {#getDesignAxisCount--}
```
public int getDesignAxisCount()
```


Возвращает количество записей осей. Спецификация: в шрифте с таблицей 'fvar' это значение должно быть больше или равно значению axisCount в таблице 'fvar'. Во всех шрифтах должно быть больше нуля, если axisValueCount больше нуля.

**Returns:**
int - Количество записей осей.
### getElidedFallbackName() {#getElidedFallbackName--}
```
public String getElidedFallbackName()
```


Spec: Имя, используемое в качестве резервного, когда проекция имён в конкретную модель шрифта приводит к подсемейному имени, содержащему только опускаемые элементы.

**Returns:**
java.lang.String - Имя, используемое как запасное, когда проекция имён в конкретную модель шрифта приводит к названию подсемейства, содержащему только опускаемые элементы.
### getElidedFallbackNameId() {#getElidedFallbackNameId--}
```
public int getElidedFallbackNameId()
```


Spec: Идентификатор имени, используемый в качестве резервного, когда проекция имён в конкретную модель шрифта приводит к подсемейному имени, содержащему только опускаемые элементы.

**Returns:**
int - Идентификатор имени.
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

