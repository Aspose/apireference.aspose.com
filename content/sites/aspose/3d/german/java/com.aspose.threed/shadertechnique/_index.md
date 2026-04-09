---
title: ShaderTechnique
second_title: Aspose.3D für Java API-Referenz
description: Eine Shader-Technik stellt eine konkrete Rendering-Implementierung dar.
type: docs
weight: 169
url: /de/java/com.aspose.threed/shadertechnique/
---

**Inheritance:**
java.lang.Object
```
public class ShaderTechnique
```

Eine Shader-Technik stellt eine konkrete Rendering-Implementierung dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [ShaderTechnique()](#ShaderTechnique--) | Initialisiert eine neue Instanz der [ShaderTechnique](../../com.aspose.threed/shadertechnique)-Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addBinding(String property, String shaderParameter)](#addBinding-java.lang.String-java.lang.String-) | Bindet die dynamische Eigenschaft an den Shader-Parameter |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDescription()](#getDescription--) | Liefert die Beschreibung dieser Technik |
| [getRenderAPI()](#getRenderAPI--) | Liefert die von dieser Technik verwendete Rendering-API |
| [getRenderAPIVersion()](#getRenderAPIVersion--) | Liefert die Version der Rendering-API. |
| [getShaderContent()](#getShaderContent--) | Liefert den Inhalt eines eingebetteten Shader-Skripts. |
| [getShaderEntry()](#getShaderEntry--) | Liefert den Einstiegspunkt des Shaders, einige Shader wie HLSL können benutzerdefinierte Shader-Einträge haben. |
| [getShaderFile()](#getShaderFile--) | Liefert den Dateinamen der externen Shader-Datei. |
| [getShaderLanguage()](#getShaderLanguage--) | Liefert die von dieser Technik verwendete Shader-Sprache. |
| [getShaderParameters()](#getShaderParameters--) | Liefert die Shader-Parameterdefinition. |
| [getShaderVersion()](#getShaderVersion--) | Ermittelt die von dieser Technik verwendete Shader-Version. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setDescription(String value)](#setDescription-java.lang.String-) | Legt die Beschreibung dieser Technik fest. |
| [setRenderAPI(String value)](#setRenderAPI-java.lang.String-) | Legt die von dieser Technik verwendete Rendering-API fest. |
| [setRenderAPIVersion(String value)](#setRenderAPIVersion-java.lang.String-) | Legt die Version der Rendering-API fest. |
| [setShaderContent(byte[] value)](#setShaderContent-byte---) | Legt den Inhalt eines eingebetteten Shader-Skripts fest. |
| [setShaderEntry(String value)](#setShaderEntry-java.lang.String-) | Legt den Einstiegspunkt des Shaders fest, einige Shader wie HLSL können benutzerdefinierte Shader-Einstiegspunkte haben. |
| [setShaderFile(String value)](#setShaderFile-java.lang.String-) | Legt den Dateinamen der externen Shader-Datei fest. |
| [setShaderLanguage(String value)](#setShaderLanguage-java.lang.String-) | Legt die von dieser Technik verwendete Shader-Sprache fest. |
| [setShaderVersion(String value)](#setShaderVersion-java.lang.String-) | Legt die von dieser Technik verwendete Shader-Version fest. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ShaderTechnique() {#ShaderTechnique--}
```
public ShaderTechnique()
```


Initialisiert eine neue Instanz der [ShaderTechnique](../../com.aspose.threed/shadertechnique)-Klasse.

### addBinding(String property, String shaderParameter) {#addBinding-java.lang.String-java.lang.String-}
```
public void addBinding(String property, String shaderParameter)
```


Bindet die dynamische Eigenschaft an den Shader-Parameter

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Der Name der dynamischen Eigenschaft. |
| shaderParameter | java.lang.String | Der Name des Shader-Parameters. |

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
### getDescription() {#getDescription--}
```
public String getDescription()
```


Liefert die Beschreibung dieser Technik

**Returns:**
java.lang.String - die Beschreibung dieser Technik
### getRenderAPI() {#getRenderAPI--}
```
public String getRenderAPI()
```


Liefert die von dieser Technik verwendete Rendering-API

**Returns:**
java.lang.String - die von dieser Technik verwendete Rendering-API
### getRenderAPIVersion() {#getRenderAPIVersion--}
```
public String getRenderAPIVersion()
```


Liefert die Version der Rendering-API.

**Returns:**
java.lang.String - die Version der Rendering-API.
### getShaderContent() {#getShaderContent--}
```
public byte[] getShaderContent()
```


Ermittelt den Inhalt eines eingebetteten Shader-Skripts. Es könnte sich um eine HLSL/GLSL-Shader-Quelldatei handeln.

**Returns:**
byte[] - der Inhalt eines eingebetteten Shader-Skripts. Es könnte sich um eine HLSL/GLSL-Shader-Quelldatei handeln.
### getShaderEntry() {#getShaderEntry--}
```
public String getShaderEntry()
```


Liefert den Einstiegspunkt des Shaders, einige Shader wie HLSL können benutzerdefinierte Shader-Einträge haben.

**Returns:**
java.lang.String - der Einstiegspunkt des Shaders, einige Shader wie HLSL können benutzerdefinierte Shader-Einstiegspunkte haben.
### getShaderFile() {#getShaderFile--}
```
public String getShaderFile()
```


Liefert den Dateinamen der externen Shader-Datei.

**Returns:**
java.lang.String - der Dateiname der externen Shader-Datei.
### getShaderLanguage() {#getShaderLanguage--}
```
public String getShaderLanguage()
```


Liefert die von dieser Technik verwendete Shader-Sprache.

**Returns:**
java.lang.String - die von dieser Technik verwendete Shader-Sprache.
### getShaderParameters() {#getShaderParameters--}
```
public Map<String,String> getShaderParameters()
```


Ermittelt die Shader-Parameterdefinition. Der Schlüssel ist der Name der dynamischen Eigenschaft, und der Wert ist der Name des Shader-Parameters, mit dem die Eigenschaft verbunden ist.

**Returns:**
java.util.Map<java.lang.String,java.lang.String> - die Shader-Parameterdefinition. Der Schlüssel ist der Name der dynamischen Eigenschaft, und der Wert ist der Name des Shader-Parameters, mit dem die Eigenschaft verbunden ist.
### getShaderVersion() {#getShaderVersion--}
```
public String getShaderVersion()
```


Ermittelt die von dieser Technik verwendete Shader-Version.

**Returns:**
java.lang.String - die von dieser Technik verwendete Shader-Version.
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




### setDescription(String value) {#setDescription-java.lang.String-}
```
public void setDescription(String value)
```


Legt die Beschreibung dieser Technik fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setRenderAPI(String value) {#setRenderAPI-java.lang.String-}
```
public void setRenderAPI(String value)
```


Legt die von dieser Technik verwendete Rendering-API fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setRenderAPIVersion(String value) {#setRenderAPIVersion-java.lang.String-}
```
public void setRenderAPIVersion(String value)
```


Legt die Version der Rendering-API fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setShaderContent(byte[] value) {#setShaderContent-byte---}
```
public void setShaderContent(byte[] value)
```


Legt den Inhalt eines eingebetteten Shader-Skripts fest. Es könnte sich um eine HLSL/GLSL-Shader-Quelldatei handeln.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | byte[] | Neuer Wert |

### setShaderEntry(String value) {#setShaderEntry-java.lang.String-}
```
public void setShaderEntry(String value)
```


Legt den Einstiegspunkt des Shaders fest, einige Shader wie HLSL können benutzerdefinierte Shader-Einstiegspunkte haben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setShaderFile(String value) {#setShaderFile-java.lang.String-}
```
public void setShaderFile(String value)
```


Legt den Dateinamen der externen Shader-Datei fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setShaderLanguage(String value) {#setShaderLanguage-java.lang.String-}
```
public void setShaderLanguage(String value)
```


Legt die von dieser Technik verwendete Shader-Sprache fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setShaderVersion(String value) {#setShaderVersion-java.lang.String-}
```
public void setShaderVersion(String value)
```


Legt die von dieser Technik verwendete Shader-Version fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

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

