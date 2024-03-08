---
title: GlobalTransform
second_title: Aspose.3D for Java API Reference
description: Global transform is similar to  but its immutable while it represents the final evaluated transformation.
type: docs
weight: 69
url: /java/com.aspose.threed/globaltransform/
---

**Inheritance:**
java.lang.Object
```
public class GlobalTransform
```

Global transform is similar to [Transform](../../com.aspose.threed/transform) but it's immutable while it represents the final evaluated transformation. Right-hand coordinate system is used while evaluating global transform **Example:** The following code shows how to read node's global transform

```
Scene scene = new Scene();
     var boxNode = scene.getRootNode().createChildNode(new Box());
     //place the box at (10, 0, 0)
     boxNode.getTransform().setTranslation(new Vector3(10, 0, 0));
     var global = boxNode.getGlobalTransform();
     System.out.print("The box's position in world coordinate is %s", global.getTranslation());
```
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEulerAngles()](#getEulerAngles--) | Gets the rotation represented in Euler angles, measured in degree **Example:** |
| [getRotation()](#getRotation--) | Gets the rotation represented in quaternion. |
| [getScale()](#getScale--) | Gets the scale **Example:** |
| [getTransformMatrix()](#getTransformMatrix--) | Gets the transform matrix. |
| [getTranslation()](#getTranslation--) | Gets the translation **Example:** |
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
### getEulerAngles() {#getEulerAngles--}
```
public Vector3 getEulerAngles()
```


Gets the rotation represented in Euler angles, measured in degree **Example:**

```
Scene scene = Scene.fromFile("test.fbx");
     var tr = scene.getRootNode().getGlobalTransform();
     System.out.printf("EulerAngles = %s", tr.getEulerAngles());
```

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getRotation() {#getRotation--}
```
public Quaternion getRotation()
```


Gets the rotation represented in quaternion. **Example:**

```
Scene scene = Scene.fromFile("test.fbx");
     var tr = scene.getRootNode().getGlobalTransform();
     System.out.printf("Rotation = %s", tr.getRotation());
```

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion)
### getScale() {#getScale--}
```
public Vector3 getScale()
```


Gets the scale **Example:**

```
Scene scene = Scene.fromFile("test.fbx");
     var tr = scene.getRootNode().getGlobalTransform();
     System.out.printf("Scale = %s", tr.getScale());
```

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getTransformMatrix() {#getTransformMatrix--}
```
public Matrix4 getTransformMatrix()
```


Gets the transform matrix. **Example:**

```
Scene scene = Scene.fromFile("test.fbx");
     var tr = scene.getRootNode().getGlobalTransform();
     System.out.printf("Matrix = %s", tr.getTransformMatrix());
```

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### getTranslation() {#getTranslation--}
```
public Vector3 getTranslation()
```


Gets the translation **Example:**

```
Scene scene = Scene.fromFile("test.fbx");
     var tr = scene.getRootNode().getGlobalTransform();
     System.out.printf("Translation = %s", tr.getTranslation());
```

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
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

