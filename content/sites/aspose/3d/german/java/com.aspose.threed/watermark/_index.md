---
title: Watermark
second_title: Aspose.3D für Java API-Referenz
description: Dienstprogramm zum Kodieren/Dekodieren eines blinden Wasserzeichens zu/von einem Mesh.
type: docs
weight: 230
url: /de/java/com.aspose.threed/watermark/
---

**Inheritance:**
java.lang.Object
```
public class Watermark
```

Dienstprogramm zum Kodieren/Dekodieren eines blinden Wasserzeichens zu/von einem Mesh. **Remarks:** Sowohl [Watermark](../../com.aspose.threed/watermark) als auch [Watermark](../../com.aspose.threed/watermark) führen eine Lizenzprüfung durch. Die Verwendung einer Testversion löst eine Ausnahme aus; Sie können [TrialException.getSuppressTrialException](../../com.aspose.threed/trialexception\\#getSuppressTrialException) verwenden, um die Ausnahme zu unterdrücken, aber dies hebt die Einschränkung hier nicht auf. Eine gültige Lizenz ist erforderlich, um diese Funktionen ohne Einschränkungen zu nutzen. **Example:** Der folgende Code zeigt, wie ein blindes Wasserzeichen in ein Mesh kodiert und wieder dekodiert wird.

```
Mesh mesh = (new Cylinder()).toMesh();
     Mesh encodedMesh = Watermark.encodeWatermark(mesh, "Hello", null);
     String watermark = Watermark.decodeWatermark(encodedMesh, null);
```
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [decodeWatermark(Mesh input)](#decodeWatermark-com.aspose.threed.Mesh-) | Dekodiere das Wasserzeichen aus einem Mesh |
| [decodeWatermark(Mesh input, String password)](#decodeWatermark-com.aspose.threed.Mesh-java.lang.String-) | Dekodiere das Wasserzeichen aus einem Mesh |
| [encodeWatermark(Mesh input, String text)](#encodeWatermark-com.aspose.threed.Mesh-java.lang.String-) | Kodieren Sie einen Text in das blinde Wasserzeichen des Meshes. |
| [encodeWatermark(Mesh input, String text, String password)](#encodeWatermark-com.aspose.threed.Mesh-java.lang.String-java.lang.String-) | Kodieren Sie einen Text in das blinde Wasserzeichen des Meshes. |
| [encodeWatermark(Mesh input, String text, String password, boolean permanent)](#encodeWatermark-com.aspose.threed.Mesh-java.lang.String-java.lang.String-boolean-) | Kodieren Sie einen Text in das blinde Wasserzeichen des Meshes. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeWatermark(Mesh input) {#decodeWatermark-com.aspose.threed.Mesh-}
```
public static String decodeWatermark(Mesh input)
```


Dekodiere das Wasserzeichen aus einem Mesh

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | [Mesh](../../com.aspose.threed/mesh) | Das Mesh zum Extrahieren des Wasserzeichens |

**Returns:**
java.lang.String - Blindes Wasserzeichen oder null, wenn kein Wasserzeichen dekodiert wurde.
### decodeWatermark(Mesh input, String password) {#decodeWatermark-com.aspose.threed.Mesh-java.lang.String-}
```
public static String decodeWatermark(Mesh input, String password)
```


Dekodiere das Wasserzeichen aus einem Mesh

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | [Mesh](../../com.aspose.threed/mesh) | Das Mesh zum Extrahieren des Wasserzeichens |
| Passwort | java.lang.String | Das Passwort zum Entschlüsseln des Wasserzeichens |

**Returns:**
java.lang.String - Blindes Wasserzeichen oder null, wenn kein Wasserzeichen dekodiert wurde.
### encodeWatermark(Mesh input, String text) {#encodeWatermark-com.aspose.threed.Mesh-java.lang.String-}
```
public static Mesh encodeWatermark(Mesh input, String text)
```


Kodieren Sie einen Text in das blinde Wasserzeichen des Meshes.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | [Mesh](../../com.aspose.threed/mesh) | Mesh zum Kodieren eines blinden Wasserzeichens |
| Text | java.lang.String | Text zum Kodieren in das Mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - A new mesh instance with blind watermark encoded **Remarks:** Both [Watermark](../../com.aspose.threed/watermark) and [Watermark](../../com.aspose.threed/watermark) will perform license check Trial usage will throw exception, you can use [TrialException.getSuppressTrialException](../../com.aspose.threed/trialexception\#getSuppressTrialException) to suppress the exception, but it will not lift the restriction here. A valid license is required to use these features without any restrictions. **Example:** The following code shows how to encode a blind watermark into a mesh and save to ply file

```
Mesh mesh = (new Cylinder()).toMesh();
     Mesh encodedMesh = Watermark.encodeWatermark(mesh, "Hello");
     new Scene(encodedMesh).save("test.ply");
```
### encodeWatermark(Mesh input, String text, String password) {#encodeWatermark-com.aspose.threed.Mesh-java.lang.String-java.lang.String-}
```
public static Mesh encodeWatermark(Mesh input, String text, String password)
```


Kodieren Sie einen Text in das blinde Wasserzeichen des Meshes.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | [Mesh](../../com.aspose.threed/mesh) | Mesh zum Kodieren eines blinden Wasserzeichens |
| Text | java.lang.String | Text zum Kodieren in das Mesh |
| Passwort | java.lang.String | Passwort zum Schutz des Wasserzeichens, optional |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - A new mesh instance with blind watermark encoded **Remarks:** Both [Watermark](../../com.aspose.threed/watermark) and [Watermark](../../com.aspose.threed/watermark) will perform license check Trial usage will throw exception, you can use [TrialException.getSuppressTrialException](../../com.aspose.threed/trialexception\#getSuppressTrialException) to suppress the exception, but it will not lift the restriction here. A valid license is required to use these features without any restrictions. **Example:** The following code shows how to encode a blind watermark into a mesh and save to ply file

```
Mesh mesh = (new Cylinder()).toMesh();
     var encodedMesh = Watermark.encodeWatermark(mesh, "Hello", "password");
     new Scene(encodedMesh).save("test.ply");
```
### encodeWatermark(Mesh input, String text, String password, boolean permanent) {#encodeWatermark-com.aspose.threed.Mesh-java.lang.String-java.lang.String-boolean-}
```
public static Mesh encodeWatermark(Mesh input, String text, String password, boolean permanent)
```


Kodieren Sie einen Text in das blinde Wasserzeichen des Meshes.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | [Mesh](../../com.aspose.threed/mesh) | Mesh zum Kodieren eines blinden Wasserzeichens |
| Text | java.lang.String | Text zum Kodieren in das Mesh |
| Passwort | java.lang.String | Passwort zum Schutz des Wasserzeichens, optional |
| permanent | boolean | Das permanente Wasserzeichen wird nicht überschrieben oder entfernt. |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - A new mesh instance with blind watermark encoded **Remarks:** Both [Watermark](../../com.aspose.threed/watermark) and [Watermark](../../com.aspose.threed/watermark) will perform license check Trial usage will throw exception, you can use [TrialException.getSuppressTrialException](../../com.aspose.threed/trialexception\#getSuppressTrialException) to suppress the exception, but it will not lift the restriction here. A valid license is required to use these features without any restrictions. **Example:** The following code shows how to encode a blind watermark into a mesh and save to ply file

```
Mesh mesh = (new Cylinder()).toMesh();
     var encodedMesh = Watermark.encodeWatermark(mesh, "Hello", "password");
     new Scene(encodedMesh).save("test.ply");
```
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

