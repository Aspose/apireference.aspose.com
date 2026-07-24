---
title: "BeforeSavingEventArgs"
second_title: "Справочник API Aspose.Page для Java"
description: "Определяет базовый класс аргументов различных событий перед сохранением."
type: docs
weight: 11
url: /ru/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Определяет базовый класс аргументов различных событий перед сохранением.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Возвращает текущий абсолютный номер страницы во всех документах XPS‑пакета. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Возвращает текущий номер документа в XPS‑пакете. |
| [getElementAPI()](#getElementAPI--) | Возвращает API модификации элемента, который собирается быть сохранённым. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Возвращает текущий номер вывода. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Возвращает текущий номер страницы относительно текущего документа в XPS‑пакете. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Возвращает текущий абсолютный номер страницы во всех документах XPS‑пакета.

**Returns:**
int - Текущий абсолютный номер страницы во всех документах XPS‑пакета.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


Возвращает текущий номер документа в XPS‑пакете.

**Returns:**
int - Текущий номер документа в XPS‑пакете.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Возвращает API модификации элемента, который собирается быть сохранённым.

**Returns:**
T - API модификации элемента, который собирается быть сохранённым.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Возвращает текущий номер вывода. Он отличается от **AbsolutePageNumber**, если указана опция сохранения **PageNumbers**.

**Returns:**
int - Текущий номер вывода.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Возвращает текущий номер страницы относительно текущего документа в XPS‑пакете.

**Returns:**
int - Текущий номер страницы относительно текущего документа в XPS‑пакете.
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

