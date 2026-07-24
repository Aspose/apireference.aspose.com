---
title: "XpsGradientStop"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий особенности элемента GradientStop."
type: docs
weight: 27
url: /ru/java/com.aspose.xps/xpsgradientstop/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsGradientStop extends XpsObject
```

Класс, инкапсулирующий свойства элемента GradientStop. Этот элемент используется как элементами LinearGradientBrush, так и RadialGradientBrush для определения положения и диапазона изменения цвета при отрисовке градиента.
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Создаёт копию этого градиентного стопа. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColor()](#getColor--) | Возвращает цвет градиентного стопа. |
| [getOffset()](#getOffset--) | Возвращает смещение градиента. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGradientStop deepClone()
```


Создаёт копию этого градиентного стопа.

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - Clone of this gradient stop.
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
### getColor() {#getColor--}
```
public XpsColor getColor()
```


Возвращает цвет градиентного стопа.

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - The gradient stop color.
### getOffset() {#getOffset--}
```
public float getOffset()
```


Возвращает смещение градиента. Смещение указывает точку вдоль прогрессии градиента, где задан определённый цвет. Цвета между смещениями градиента в прогрессии интерполируются.

**Returns:**
float — Смещение градиента.
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

