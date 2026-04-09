---
title: BooleanOperand
second_title: Aspose.3D für Java API-Referenz
description: Diese Klasse kapselt das transformierte Mesh als Operand für boolesche Operationen.
type: docs
weight: 22
url: /de/java/com.aspose.threed/booleanoperand/
---

**Inheritance:**
java.lang.Object
```
public class BooleanOperand
```

Diese Klasse kapselt das transformierte Mesh als Operand einer Booleschen Operation.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOperand()](#getOperand--) | Gibt den Operand zurück, er kann eine Instanz von [HalfSpace](../../com.aspose.threed/halfspace), [IMeshConvertible](../../com.aspose.threed/imeshconvertible) oder [Node](../../com.aspose.threed/node) sein. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [of(Entity mesh)](#of-com.aspose.threed.Entity-) | Erstelle eine [BooleanOperand](../../com.aspose.threed/booleanoperand)-Instanz aus einer reinen [IMeshConvertible](../../com.aspose.threed/imeshconvertible)-Instanz. |
| [of(Entity mesh, Matrix4 transform)](#of-com.aspose.threed.Entity-com.aspose.threed.Matrix4-) | Erstelle eine [BooleanOperand](../../com.aspose.threed/booleanoperand)-Instanz aus einer [IMeshConvertible](../../com.aspose.threed/imeshconvertible)-Instanz und einer angegebenen Transformation. |
| [of(Node node)](#of-com.aspose.threed.Node-) | Erstelle eine [BooleanOperand](../../com.aspose.threed/booleanoperand)-Instanz aus einem Knoten, eine gültige Entität, die [IMeshConvertible](../../com.aspose.threed/imeshconvertible) implementiert, ist erforderlich |
| [toString()](#toString--) | Gibt die Zeichenkettenrepräsentation von [BooleanOperand](../../com.aspose.threed/booleanoperand) zurück |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
### getOperand() {#getOperand--}
```
public A3DObject getOperand()
```


Gibt den Operand zurück, er kann eine Instanz von [HalfSpace](../../com.aspose.threed/halfspace), [IMeshConvertible](../../com.aspose.threed/imeshconvertible) oder [Node](../../com.aspose.threed/node) sein.

**Returns:**
[A3DObject](../../com.aspose.threed/a3dobject) - the operand, it can be an instance of [HalfSpace](../../com.aspose.threed/halfspace), [IMeshConvertible](../../com.aspose.threed/imeshconvertible) or [Node](../../com.aspose.threed/node).
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




### of(Entity mesh) {#of-com.aspose.threed.Entity-}
```
public static BooleanOperand of(Entity mesh)
```


Erstelle eine [BooleanOperand](../../com.aspose.threed/booleanoperand)-Instanz aus einer reinen [IMeshConvertible](../../com.aspose.threed/imeshconvertible)-Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Entity](../../com.aspose.threed/entity) | Das Mesh, das als Operand einer Booleschen Operation verwendet wird, kann eine Instanz von [IMeshConvertible](../../com.aspose.threed/imeshconvertible) oder [HalfSpace](../../com.aspose.threed/halfspace) sein |

**Returns:**
[BooleanOperand](../../com.aspose.threed/booleanoperand) - An instance of [BooleanOperand](../../com.aspose.threed/booleanoperand)
### of(Entity mesh, Matrix4 transform) {#of-com.aspose.threed.Entity-com.aspose.threed.Matrix4-}
```
public static BooleanOperand of(Entity mesh, Matrix4 transform)
```


Erstelle eine [BooleanOperand](../../com.aspose.threed/booleanoperand)-Instanz aus einer [IMeshConvertible](../../com.aspose.threed/imeshconvertible)-Instanz und einer angegebenen Transformation.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Entity](../../com.aspose.threed/entity) | Das Mesh, das als Operand einer Booleschen Operation verwendet wird, kann eine Instanz von [IMeshConvertible](../../com.aspose.threed/imeshconvertible) oder [HalfSpace](../../com.aspose.threed/halfspace) sein |
| transform | [Matrix4](../../com.aspose.threed/matrix4) | Die Transformation des Mesh-Objekts |

**Returns:**
[BooleanOperand](../../com.aspose.threed/booleanoperand) - An instance of [BooleanOperand](../../com.aspose.threed/booleanoperand)
### of(Node node) {#of-com.aspose.threed.Node-}
```
public static BooleanOperand of(Node node)
```


Erstelle eine [BooleanOperand](../../com.aspose.threed/booleanoperand)-Instanz aus einem Knoten, eine gültige Entität, die [IMeshConvertible](../../com.aspose.threed/imeshconvertible) implementiert, ist erforderlich

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | Eine [Node](../../com.aspose.threed/node)-Instanz mit einer gültigen Entität, die [IMeshConvertible](../../com.aspose.threed/imeshconvertible) implementiert |

**Returns:**
[BooleanOperand](../../com.aspose.threed/booleanoperand) - An instance of [BooleanOperand](../../com.aspose.threed/booleanoperand)
### toString() {#toString--}
```
public String toString()
```


Gibt die Zeichenkettenrepräsentation von [BooleanOperand](../../com.aspose.threed/booleanoperand) zurück

**Returns:**
java.lang.String - Die Zeichenkettenrepräsentation von [BooleanOperand](../../com.aspose.threed/booleanoperand)
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

