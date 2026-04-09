---
title: ShaderSet
second_title: Aspose.3D für Java API-Referenz
description: Shader-Programme für jede Art von Materialien
type: docs
weight: 166
url: /de/java/com.aspose.threed/shaderset/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public class ShaderSet implements Closeable
```

Shader-Programme für jede Art von Materialien
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [ShaderSet()](#ShaderSet--) | Erstelle die Instanz von [ShaderSet](../../com.aspose.threed/shaderset) |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [close()](#close--) | Gib diese Instanz frei und löse alle Shader-Programme. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFallback()](#getFallback--) | Liefert den Ersatz-Shader, wenn der benötigte Shader nicht verfügbar ist. |
| [getLambert()](#getLambert--) | Liefert den Shader, der zum Rendern des Lambert-Materials verwendet wird. |
| [getPbr()](#getPbr--) | Liefert den Shader, der zum Rendern des PBR-Materials verwendet wird. |
| [getPhong()](#getPhong--) | Liefert den Shader, der zum Rendern des Phong-Materials verwendet wird. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setFallback(ShaderProgram value)](#setFallback-com.aspose.threed.ShaderProgram-) | Setzt den Ersatz-Shader, wenn der benötigte Shader nicht verfügbar ist. |
| [setLambert(ShaderProgram value)](#setLambert-com.aspose.threed.ShaderProgram-) | Setzt den Shader, der zum Rendern des Lambert-Materials verwendet wird. |
| [setPbr(ShaderProgram value)](#setPbr-com.aspose.threed.ShaderProgram-) | Setzt den Shader, der zum Rendern des PBR-Materials verwendet wird. |
| [setPhong(ShaderProgram value)](#setPhong-com.aspose.threed.ShaderProgram-) | Setzt den Shader, der zum Rendern des Phong-Materials verwendet wird. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ShaderSet() {#ShaderSet--}
```
public ShaderSet()
```


Erstelle die Instanz von [ShaderSet](../../com.aspose.threed/shaderset)

### close() {#close--}
```
public void close()
```


Gib diese Instanz frei und löse alle Shader-Programme.

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
### getFallback() {#getFallback--}
```
public ShaderProgram getFallback()
```


Liefert den Ersatz-Shader, wenn der benötigte Shader nicht verfügbar ist.

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram) - the fallback shader when required shader is unavailable
### getLambert() {#getLambert--}
```
public ShaderProgram getLambert()
```


Liefert den Shader, der zum Rendern des Lambert-Materials verwendet wird.

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram) - the shader that used to render the lambert material
### getPbr() {#getPbr--}
```
public ShaderProgram getPbr()
```


Liefert den Shader, der zum Rendern des PBR-Materials verwendet wird.

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram) - the shader that used to render the PBR material
### getPhong() {#getPhong--}
```
public ShaderProgram getPhong()
```


Liefert den Shader, der zum Rendern des Phong-Materials verwendet wird.

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram) - the shader that used to render the phong material
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




### setFallback(ShaderProgram value) {#setFallback-com.aspose.threed.ShaderProgram-}
```
public void setFallback(ShaderProgram value)
```


Setzt den Ersatz-Shader, wenn der benötigte Shader nicht verfügbar ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | Neuer Wert |

### setLambert(ShaderProgram value) {#setLambert-com.aspose.threed.ShaderProgram-}
```
public void setLambert(ShaderProgram value)
```


Setzt den Shader, der zum Rendern des Lambert-Materials verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | Neuer Wert |

### setPbr(ShaderProgram value) {#setPbr-com.aspose.threed.ShaderProgram-}
```
public void setPbr(ShaderProgram value)
```


Setzt den Shader, der zum Rendern des PBR-Materials verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | Neuer Wert |

### setPhong(ShaderProgram value) {#setPhong-com.aspose.threed.ShaderProgram-}
```
public void setPhong(ShaderProgram value)
```


Setzt den Shader, der zum Rendern des Phong-Materials verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | Neuer Wert |

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

