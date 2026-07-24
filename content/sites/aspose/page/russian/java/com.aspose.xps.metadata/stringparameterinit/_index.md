---
title: "StringParameterInit"
second_title: "Справочник API Aspose.Page для Java"
description: "Базовый класс для всех инициализаторов строковых параметров."
type: docs
weight: 149
url: /ru/java/com.aspose.xps.metadata/stringparameterinit/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit)
```
public abstract class StringParameterInit extends ParameterInit
```

Базовый класс для всех инициализаторов строковых параметров.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [StringParameterInit(String name, String value)](#StringParameterInit-java.lang.String-java.lang.String-) | Создаёт новый экземпляр. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxLength()](#getMaxLength--) | Для строковых значений определяет самую короткую и самую длинную строку. |
| [getMinLength()](#getMinLength--) | Для строковых значений определяет кратчайшую допустимую строку. |
| [getName()](#getName--) | Получает имя элемента. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringParameterInit(String name, String value) {#StringParameterInit-java.lang.String-java.lang.String-}
```
public StringParameterInit(String name, String value)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String | Имя параметра. |
| значение | java.lang.String | Значение параметра. |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


Для строковых значений определяет самую короткую и самую длинную строку.

**Returns:**
int - Наибольшая допустимая строка.
### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


Для строковых значений определяет кратчайшую допустимую строку.

**Returns:**
int - Наименьшая допустимая строка.
### getName() {#getName--}
```
public String getName()
```


Получает имя элемента.

**Returns:**
java.lang.String
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

