---
title: ShaderMaterial
second_title: Aspose.3D für Java API-Referenz
description: Ein Shader-Material ermöglicht es, das Material durch eine externe Rendering-Engine oder Shadersprache zu beschreiben.
type: docs
weight: 164
url: /de/java/com.aspose.threed/shadermaterial/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Material](../../com.aspose.threed/material)
```
public class ShaderMaterial extends Material
```

Ein Shader-Material ermöglicht es, das Material über eine externe Rendering-Engine oder Shadersprache zu beschreiben. [ShaderMaterial](../../com.aspose.threed/shadermaterial) verwendet [ShaderTechnique](../../com.aspose.threed/shadertechnique), um die konkreten Rendering-Details zu beschreiben, und das am besten geeignete wird je nach Ziel‑Rendering‑Plattform verwendet. Zum Beispiel kann Ihre [ShaderMaterial](../../com.aspose.threed/shadermaterial)-Instanz zwei Techniken besitzen, eine definiert durch HLSL und eine andere durch GLSL. Auf nicht‑Windows‑Plattformen sollte stattdessen GLSL verwendet werden.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [ShaderMaterial()](#ShaderMaterial--) | Initialisiert eine neue Instanz der Klasse [ShaderMaterial](../../com.aspose.threed/shadermaterial). |
| [ShaderMaterial(String name)](#ShaderMaterial-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [ShaderMaterial](../../com.aspose.threed/shadermaterial). |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [MAP_AMBIENT](#MAP-AMBIENT) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine Umgebungs-Texturzuordnung zuzuweisen. |
| [MAP_DIFFUSE](#MAP-DIFFUSE) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine diffuse Texturzuordnung zuzuweisen. |
| [MAP_EMISSIVE](#MAP-EMISSIVE) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine emittierende Texturzuordnung zuzuweisen. |
| [MAP_NORMAL](#MAP-NORMAL) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine Normalen-Texturzuordnung zuzuweisen. |
| [MAP_SPECULAR](#MAP-SPECULAR) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine spekulare Texturzuordnung zuzuweisen. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Liefert den Namen. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getTechniques()](#getTechniques--) | Ermittelt alle verfügbaren Techniken, die in diesem Material definiert sind. |
| [getTexture(String slotName)](#getTexture-java.lang.String-) | Gibt die Textur aus dem angegebenen Slot zurück, sie kann der Name einer Materialeigenschaft oder ein Shader-Parametername sein. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gibt den Enumerator zurück, um interne Textur‑Slots aufzuzählen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setTexture(String slotName, TextureBase texture)](#setTexture-java.lang.String-com.aspose.threed.TextureBase-) | Setzt die Textur in den angegebenen Slot. |
| [toString()](#toString--) | Formatiert das Objekt in einen String |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ShaderMaterial() {#ShaderMaterial--}
```
public ShaderMaterial()
```


Initialisiert eine neue Instanz der Klasse [ShaderMaterial](../../com.aspose.threed/shadermaterial).

### ShaderMaterial(String name) {#ShaderMaterial-java.lang.String-}
```
public ShaderMaterial(String name)
```


Initialisiert eine neue Instanz der Klasse [ShaderMaterial](../../com.aspose.threed/shadermaterial).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name |

### MAP_AMBIENT {#MAP-AMBIENT}
```
public static final String MAP_AMBIENT
```


Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine Umgebungs-Texturzuordnung zuzuweisen.

### MAP_DIFFUSE {#MAP-DIFFUSE}
```
public static final String MAP_DIFFUSE
```


Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine diffuse Texturzuordnung zuzuweisen.

### MAP_EMISSIVE {#MAP-EMISSIVE}
```
public static final String MAP_EMISSIVE
```


Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine emittierende Texturzuordnung zuzuweisen.

### MAP_NORMAL {#MAP-NORMAL}
```
public static final String MAP_NORMAL
```


Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine Normalen-Texturzuordnung zuzuweisen.

### MAP_SPECULAR {#MAP-SPECULAR}
```
public static final String MAP_SPECULAR
```


Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine spekulare Texturzuordnung zuzuweisen.

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
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Findet die Eigenschaft. Sie kann eine dynamische Eigenschaft sein (erstellt durch CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| propertyName | java.lang.String | Eigenschaftsname. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Liefert die Sammlung aller Eigenschaften.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection) - the collection of all properties.
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Liefere den Wert der angegebenen Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Eigenschaftsname |

**Returns:**
java.lang.Object - Der Wert der gefundenen Eigenschaft
### getTechniques() {#getTechniques--}
```
public List<ShaderTechnique> getTechniques()
```


Ermittelt alle verfügbaren Techniken, die in diesem Material definiert sind.

**Returns:**
java.util.List<com.aspose.threed.ShaderTechnique> - alle verfügbaren Techniken, die in diesem Material definiert sind.
### getTexture(String slotName) {#getTexture-java.lang.String-}
```
public TextureBase getTexture(String slotName)
```


Gibt die Textur aus dem angegebenen Slot zurück, sie kann der Name einer Materialeigenschaft oder ein Shader-Parametername sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| slotName | java.lang.String | Slot-Name. |

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - The texture. **Example:**

```
var mat = new LambertMaterial();
     var tex = new Texture();
     tex.setFileName("diffuse.png");
     mat.setTexture(Material.MAP_DIFFUSE, tex);
     tex = (Texture)mat.getTexture(Material.MAP_DIFFUSE);
```
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<TextureSlot> iterator()
```


Gibt den Enumerator zurück, um interne Textur‑Slots aufzuzählen.

**Returns:**
java.util.Iterator<com.aspose.threed.TextureSlot>
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Entfernt eine dynamische Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Welche Eigenschaft zu entfernen ist |

**Returns:**
boolean - true, wenn die Eigenschaft erfolgreich entfernt wurde
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Welche Eigenschaft zu entfernen ist |

**Returns:**
boolean - true, wenn die Eigenschaft erfolgreich entfernt wurde
### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Setzt den Wert der angegebenen Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Eigenschaftsname |
| Wert | java.lang.Object | Der Wert der Eigenschaft |

### setTexture(String slotName, TextureBase texture) {#setTexture-java.lang.String-com.aspose.threed.TextureBase-}
```
public void setTexture(String slotName, TextureBase texture)
```


Setzt die Textur in den angegebenen Slot.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| slotName | java.lang.String | Slot-Name. |
|  | texture | [TextureBase](../../com.aspose.threed/texturebase) | Textur. **Beispiel:** |

```
var mat = new LambertMaterial();
     var tex = new Texture();
     tex.setFileName("diffuse.png");
     mat.setTexture(Material.MAP_NORMAL, tex);
``` |

### toString() {#toString--}
```
public String toString()
```


Formatiert das Objekt in einen String

**Returns:**
java.lang.String - Objektzeichenkette
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

