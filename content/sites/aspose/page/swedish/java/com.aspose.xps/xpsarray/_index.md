---
title: "XpsArray"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in gemensamma funktioner för XPS‑modellens array‑objekt."
type: docs
weight: 14
url: /sv/java/com.aspose.xps/xpsarray/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public abstract class XpsArray<T> extends XpsObject
```

Klass som kapslar in gemensamma funktioner för XPS‑modellens array‑objekt.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(T obj)](#add-T-) | Lägger till ett nytt objekt i arrayen. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Tillhandahåller åtkomst till arrayens element via index  i . |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Infogar ett nytt objekt i arrayen på angiven position. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Tar bort ett objekt från arrayen. |
| [removeAt(int index)](#removeAt-int-) | Tar bort ett objekt från arrayen på angiven position. |
| [size()](#size--) | Returnerar antalet element. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Lägger till ett nytt objekt i arrayen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj | T | Objektet att lägga till. |

**Returns:**
T - Tillagt objekt.
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
public T get(int i)
```


Tillhandahåller åtkomst till arrayens element via index  i .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| i | int | Index för elementet. |

**Returns:**
T - Elementet på position i.
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
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Infogar ett nytt objekt i arrayen på angiven position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Positionen där ett objekt ska infogas. |
| obj | T | Objektet som ska infogas. |

**Returns:**
T - Infogat objekt.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Tar bort ett objekt från arrayen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj | T | Objektet som ska tas bort. |

**Returns:**
T - Borttaget objekt.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Tar bort ett objekt från arrayen på angiven position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Positionen där ett objekt ska tas bort. |

**Returns:**
T - Borttaget objekt.
### size() {#size--}
```
public int size()
```


Returnerar antalet element.

**Returns:**
int - Antalet element.
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

