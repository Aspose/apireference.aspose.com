---
title: "XpsPage"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in FixedPage-elementfunktioner."
type: docs
weight: 38
url: /sv/java/com.aspose.xps/xpspage/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public final class XpsPage extends XpsElement
```

Klass som inkapslar FixedPage-elementfunktioner. Detta element innehåller innehållet på en sida och är rot-elementet för en FixedPage-del.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [deepClone()](#deepClone--) | Klonar den här sidan. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Tillhandahåller åtkomst till elementets barn efter index i. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Returnerar sidans höjd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [getWidth()](#getWidth--) | Returnerar sidans bredd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [getXmlLang()](#getXmlLang--) | Returnerar värdet som specificerar standardspråket som används för det aktuella elementet och för eventuella barn- eller efterföljande element. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementering av Iterable‑gränssnittet. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHeight(float value)](#setHeight-float-) | Ställer in sidans höjd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [setWidth(float value)](#setWidth-float-) | Ställer in sidans bredd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [setXmlLang(String value)](#setXmlLang-java.lang.String-) | Ställer in värdet som specificerar standardspråket som används för det aktuella elementet och för eventuella barn- eller efterföljande element. |
| [size()](#size--) | Returnerar antalet barn‑element. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPage deepClone()
```


Klonar den här sidan.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Clone of this page.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Tillhandahåller åtkomst till elementets barn efter index i.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| i | int | Index för barn‑element. |

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


Returnerar sidans höjd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet.

**Returns:**
float - Sidans höjd.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Returnerar sidans bredd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet.

**Returns:**
float - Sidans bredd.
### getXmlLang() {#getXmlLang--}
```
public String getXmlLang()
```


Returnerar värdet som specificerar standardspråket som används för det aktuella elementet och för eventuella barn- eller efterföljande element.

**Returns:**
java.lang.String - Värdet som specificerar standardspråket.
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


Implementering av Iterable‑gränssnittet.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Returnerar en enumerator för listan.
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


Ställer in sidans höjd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Sidans höjd. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Ställer in sidans bredd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Sidans bredd. |

### setXmlLang(String value) {#setXmlLang-java.lang.String-}
```
public void setXmlLang(String value)
```


Ställer in värdet som specificerar standardspråket som används för det aktuella elementet och för eventuella barn- eller efterföljande element.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.lang.String | Värdet som specificerar standardspråket. |

### size() {#size--}
```
public int size()
```


Returnerar antalet barn‑element.

**Returns:**
int - Antalet underordnade element.
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

