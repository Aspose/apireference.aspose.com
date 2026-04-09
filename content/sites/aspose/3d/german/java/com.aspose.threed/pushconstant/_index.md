---
title: PushConstant
second_title: Aspose.3D für Java API-Referenz
description: Ein Hilfsprogramm, um Daten über Push-Konstanten an den Shader zu übermitteln.
type: docs
weight: 141
url: /de/java/com.aspose.threed/pushconstant/
---

**Inheritance:**
java.lang.Object
```
public class PushConstant
```

Ein Hilfsprogramm, um Daten über Push-Konstanten an den Shader zu übermitteln.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PushConstant()](#PushConstant--) | Konstruktor von [PushConstant](../../com.aspose.threed/pushconstant) |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [commit(int stage, ICommandList commandList)](#commit-int-com.aspose.threed.ICommandList-) | Übermittelt vorbereitete Daten an die Grafikpipeline. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [write(FMatrix4 mat)](#write-com.aspose.threed.FMatrix4-) | Schreibe die Matrix in die Konstante |
| [write(FVector3 vec)](#write-com.aspose.threed.FVector3-) | Schreibe einen 3‑Komponenten‑Vektor in die Konstante |
| [write(FVector4 vec)](#write-com.aspose.threed.FVector4-) | Schreibe einen 4‑Komponenten‑Vektor in die Konstante |
| [write(float f)](#write-float-) | Schreibe einen Float‑Wert in die Konstante |
| [write(float x, float y, float z, float w)](#write-float-float-float-float-) | Schreibe einen 4‑Komponenten‑Vektor in die Konstante |
| [write(int n)](#write-int-) | Schreibe einen Int‑Wert in die Konstante |
### PushConstant() {#PushConstant--}
```
public PushConstant()
```


Konstruktor von [PushConstant](../../com.aspose.threed/pushconstant)

### commit(int stage, ICommandList commandList) {#commit-int-com.aspose.threed.ICommandList-}
```
public PushConstant commit(int stage, ICommandList commandList)
```


Übermittelt vorbereitete Daten an die Grafikpipeline.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stufe | int |  |
| commandList | [ICommandList](../../com.aspose.threed/icommandlist) |  |

**Returns:**
[PushConstant](../../com.aspose.threed/pushconstant)
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

### write(FMatrix4 mat) {#write-com.aspose.threed.FMatrix4-}
```
public PushConstant write(FMatrix4 mat)
```


Schreibe die Matrix in die Konstante

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mat | [FMatrix4](../../com.aspose.threed/fmatrix4) | Die zu schreibende Matrix |

**Returns:**
[PushConstant](../../com.aspose.threed/pushconstant)
### write(FVector3 vec) {#write-com.aspose.threed.FVector3-}
```
public PushConstant write(FVector3 vec)
```


Schreibe einen 3‑Komponenten‑Vektor in die Konstante

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [FVector3](../../com.aspose.threed/fvector3) |  |

**Returns:**
[PushConstant](../../com.aspose.threed/pushconstant)
### write(FVector4 vec) {#write-com.aspose.threed.FVector4-}
```
public PushConstant write(FVector4 vec)
```


Schreibe einen 4‑Komponenten‑Vektor in die Konstante

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [FVector4](../../com.aspose.threed/fvector4) |  |

**Returns:**
[PushConstant](../../com.aspose.threed/pushconstant)
### write(float f) {#write-float-}
```
public PushConstant write(float f)
```


Schreibe einen Float‑Wert in die Konstante

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| f | float |  |

**Returns:**
[PushConstant](../../com.aspose.threed/pushconstant)
### write(float x, float y, float z, float w) {#write-float-float-float-float-}
```
public PushConstant write(float x, float y, float z, float w)
```


Schreibe einen 4‑Komponenten‑Vektor in die Konstante

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float |  |
| y | float |  |
| z | float |  |
| w | float |  |

**Returns:**
[PushConstant](../../com.aspose.threed/pushconstant)
### write(int n) {#write-int-}
```
public PushConstant write(int n)
```


Schreibe einen Int‑Wert in die Konstante

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| n | int |  |

**Returns:**
[PushConstant](../../com.aspose.threed/pushconstant)
