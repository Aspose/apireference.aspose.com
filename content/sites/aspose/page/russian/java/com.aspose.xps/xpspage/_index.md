---
title: "XpsPage"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий свойства элемента FixedPage."
type: docs
weight: 38
url: /ru/java/com.aspose.xps/xpspage/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public final class XpsPage extends XpsElement
```

Класс, инкапсулирующий свойства элемента FixedPage. Этот элемент содержит содержимое страницы и является корневым элементом части FixedPage.
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Клонирует эту страницу. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Обеспечивает доступ к дочерним элементам по индексу i. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Возвращает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [getWidth()](#getWidth--) | Возвращает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [getXmlLang()](#getXmlLang--) | Возвращает значение, указывающее язык по умолчанию, используемый для текущего элемента и для всех дочерних или вложенных элементов. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Реализация интерфейса Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHeight(float value)](#setHeight-float-) | Устанавливает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [setWidth(float value)](#setWidth-float-) | Устанавливает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [setXmlLang(String value)](#setXmlLang-java.lang.String-) | Устанавливает значение, указывающее язык по умолчанию, используемый для текущего элемента и для всех дочерних или вложенных элементов. |
| [size()](#size--) | Возвращает количество дочерних элементов. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPage deepClone()
```


Клонирует эту страницу.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Clone of this page.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Обеспечивает доступ к дочерним элементам по индексу i.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| i | int | Индекс дочернего элемента. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public float getHeight()
```


Возвращает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства.

**Returns:**
float - Высота страницы.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Возвращает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства.

**Returns:**
float - Ширина страницы.
### getXmlLang() {#getXmlLang--}
```
public String getXmlLang()
```


Возвращает значение, указывающее язык по умолчанию, используемый для текущего элемента и для всех дочерних или вложенных элементов.

**Returns:**
java.lang.String — значение, указывающее язык по умолчанию.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Реализация интерфейса Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> — возвращает перечислитель для списка.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Устанавливает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Высота страницы. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Устанавливает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Ширина страницы. |

### setXmlLang(String value) {#setXmlLang-java.lang.String-}
```
public void setXmlLang(String value)
```


Устанавливает значение, указывающее язык по умолчанию, используемый для текущего элемента и для всех дочерних или вложенных элементов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Значение, указывающее язык по умолчанию. |

### size() {#size--}
```
public int size()
```


Возвращает количество дочерних элементов.

**Returns:**
int — количество дочерних элементов.
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

