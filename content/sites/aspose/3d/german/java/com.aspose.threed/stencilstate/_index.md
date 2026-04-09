---
title: StencilState
second_title: Aspose.3D für Java API-Referenz
description: Stencil-Zustände pro Fläche.
type: docs
weight: 175
url: /de/java/com.aspose.threed/stencilstate/
---

**Inheritance:**
java.lang.Object
```
public class StencilState
```

Stencil-Zustände pro Fläche.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | Gibt einen Wert zurück, der angibt, ob diese Instanz einem angegebenen Objekt gleich ist. |
| [getClass()](#getClass--) |  |
| [getCompare()](#getCompare--) | Liest die Vergleichsfunktion aus, die im Stencil-Test verwendet wird. |
| [getDepthFailAction()](#getDepthFailAction--) | Liest die Stencil-Aktion, wenn der Stencil-Test besteht, aber der Tiefentest fehlschlägt. |
| [getFailAction()](#getFailAction--) | Liest die Stencil-Aktion, wenn der Stencil-Test fehlschlägt. |
| [getPassAction()](#getPassAction--) | Liest die Stencil-Aktion, wenn sowohl der Stencil-Test als auch der Tiefentest bestehen. |
| [hashCode()](#hashCode--) | Gibt den Hashcode für diese Instanz zurück. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCompare(CompareFunction value)](#setCompare-com.aspose.threed.CompareFunction-) | Setzt die Vergleichsfunktion, die im Stencil-Test verwendet wird. |
| [setDepthFailAction(StencilAction value)](#setDepthFailAction-com.aspose.threed.StencilAction-) | Setzt die Stencil-Aktion, wenn der Stencil-Test besteht, aber der Tiefentest fehlschlägt. |
| [setFailAction(StencilAction value)](#setFailAction-com.aspose.threed.StencilAction-) | Setzt die Stencil-Aktion, wenn der Stencil-Test fehlschlägt. |
| [setPassAction(StencilAction value)](#setPassAction-com.aspose.threed.StencilAction-) | Setzt die Stencil-Aktion, wenn sowohl der Stencil-Test als auch der Tiefentest bestehen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Gibt einen Wert zurück, der angibt, ob diese Instanz einem angegebenen Objekt gleich ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCompare() {#getCompare--}
```
public CompareFunction getCompare()
```


Liest die Vergleichsfunktion aus, die im Stencil-Test verwendet wird.

**Returns:**
[CompareFunction](../../com.aspose.threed/comparefunction) - the compare function used in stencil test
### getDepthFailAction() {#getDepthFailAction--}
```
public StencilAction getDepthFailAction()
```


Liest die Stencil-Aktion, wenn der Stencil-Test besteht, aber der Tiefentest fehlschlägt.

**Returns:**
[StencilAction](../../com.aspose.threed/stencilaction) - the stencil action when stencil test pass but depth test fails.
### getFailAction() {#getFailAction--}
```
public StencilAction getFailAction()
```


Liest die Stencil-Aktion, wenn der Stencil-Test fehlschlägt.

**Returns:**
[StencilAction](../../com.aspose.threed/stencilaction) - the stencil action when stencil test fails.
### getPassAction() {#getPassAction--}
```
public StencilAction getPassAction()
```


Liest die Stencil-Aktion, wenn sowohl der Stencil-Test als auch der Tiefentest bestehen.

**Returns:**
[StencilAction](../../com.aspose.threed/stencilaction) - the stencil action when both stencil test and depth test passes.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gibt den Hashcode für diese Instanz zurück.

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




### setCompare(CompareFunction value) {#setCompare-com.aspose.threed.CompareFunction-}
```
public void setCompare(CompareFunction value)
```


Setzt die Vergleichsfunktion, die im Stencil-Test verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [CompareFunction](../../com.aspose.threed/comparefunction) | Neuer Wert |

### setDepthFailAction(StencilAction value) {#setDepthFailAction-com.aspose.threed.StencilAction-}
```
public void setDepthFailAction(StencilAction value)
```


Setzt die Stencil-Aktion, wenn der Stencil-Test besteht, aber der Tiefentest fehlschlägt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [StencilAction](../../com.aspose.threed/stencilaction) | Neuer Wert |

### setFailAction(StencilAction value) {#setFailAction-com.aspose.threed.StencilAction-}
```
public void setFailAction(StencilAction value)
```


Setzt die Stencil-Aktion, wenn der Stencil-Test fehlschlägt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [StencilAction](../../com.aspose.threed/stencilaction) | Neuer Wert |

### setPassAction(StencilAction value) {#setPassAction-com.aspose.threed.StencilAction-}
```
public void setPassAction(StencilAction value)
```


Setzt die Stencil-Aktion, wenn sowohl der Stencil-Test als auch der Tiefentest bestehen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [StencilAction](../../com.aspose.threed/stencilaction) | Neuer Wert |

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
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

