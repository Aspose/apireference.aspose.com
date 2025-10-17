---
title: BooleanOperand
second_title: Aspose.3D for Java API Reference
description: This class encapsulates the transformed mesh as Boolean operations operand.
type: docs
weight: 22
url: /java/com.aspose.threed/booleanoperand/
---

**Inheritance:**
java.lang.Object
```
public class BooleanOperand
```

This class encapsulates the transformed mesh as Boolean operation's operand.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOperand()](#getOperand--) | Gets the operand, it can be an instance of [HalfSpace](../../com.aspose.threed/halfspace), [IMeshConvertible](../../com.aspose.threed/imeshconvertible) or [Node](../../com.aspose.threed/node). |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [of(Entity mesh)](#of-com.aspose.threed.Entity-) | Construct a [BooleanOperand](../../com.aspose.threed/booleanoperand) instance from a bare [IMeshConvertible](../../com.aspose.threed/imeshconvertible) instance. |
| [of(Entity mesh, Matrix4 transform)](#of-com.aspose.threed.Entity-com.aspose.threed.Matrix4-) | Construct a [BooleanOperand](../../com.aspose.threed/booleanoperand) instance from a [IMeshConvertible](../../com.aspose.threed/imeshconvertible) instance and specified transform. |
| [of(Node node)](#of-com.aspose.threed.Node-) | Construct a [BooleanOperand](../../com.aspose.threed/booleanoperand) instance from a node, a valid entity implemented [IMeshConvertible](../../com.aspose.threed/imeshconvertible) is required |
| [toString()](#toString--) | Gets the string representation of [BooleanOperand](../../com.aspose.threed/booleanoperand) |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
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


Gets the operand, it can be an instance of [HalfSpace](../../com.aspose.threed/halfspace), [IMeshConvertible](../../com.aspose.threed/imeshconvertible) or [Node](../../com.aspose.threed/node).

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


Construct a [BooleanOperand](../../com.aspose.threed/booleanoperand) instance from a bare [IMeshConvertible](../../com.aspose.threed/imeshconvertible) instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Entity](../../com.aspose.threed/entity) | The mesh used as Boolean operation's operand, it can bean instance of [IMeshConvertible](../../com.aspose.threed/imeshconvertible) or [HalfSpace](../../com.aspose.threed/halfspace) |

**Returns:**
[BooleanOperand](../../com.aspose.threed/booleanoperand) - An instance of [BooleanOperand](../../com.aspose.threed/booleanoperand)
### of(Entity mesh, Matrix4 transform) {#of-com.aspose.threed.Entity-com.aspose.threed.Matrix4-}
```
public static BooleanOperand of(Entity mesh, Matrix4 transform)
```


Construct a [BooleanOperand](../../com.aspose.threed/booleanoperand) instance from a [IMeshConvertible](../../com.aspose.threed/imeshconvertible) instance and specified transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Entity](../../com.aspose.threed/entity) | The mesh used as Boolean operation's operand, it can bean instance of [IMeshConvertible](../../com.aspose.threed/imeshconvertible) or [HalfSpace](../../com.aspose.threed/halfspace) |
| transform | [Matrix4](../../com.aspose.threed/matrix4) | The transform of the mesh object |

**Returns:**
[BooleanOperand](../../com.aspose.threed/booleanoperand) - An instance of [BooleanOperand](../../com.aspose.threed/booleanoperand)
### of(Node node) {#of-com.aspose.threed.Node-}
```
public static BooleanOperand of(Node node)
```


Construct a [BooleanOperand](../../com.aspose.threed/booleanoperand) instance from a node, a valid entity implemented [IMeshConvertible](../../com.aspose.threed/imeshconvertible) is required

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | A [Node](../../com.aspose.threed/node) instance with a valid entity implemented [IMeshConvertible](../../com.aspose.threed/imeshconvertible) |

**Returns:**
[BooleanOperand](../../com.aspose.threed/booleanoperand) - An instance of [BooleanOperand](../../com.aspose.threed/booleanoperand)
### toString() {#toString--}
```
public String toString()
```


Gets the string representation of [BooleanOperand](../../com.aspose.threed/booleanoperand)

**Returns:**
java.lang.String - The string representation of [BooleanOperand](../../com.aspose.threed/booleanoperand)
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

