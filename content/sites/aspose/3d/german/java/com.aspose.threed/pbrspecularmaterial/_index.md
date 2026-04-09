---
title: PbrSpecularMaterial
second_title: Aspose.3D für Java API-Referenz
description: Material für physikalisch basiertes Rendering basierend auf Diffusfarbe/Specular/Glanz
type: docs
weight: 122
url: /de/java/com.aspose.threed/pbrspecularmaterial/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Material](../../com.aspose.threed/material)
```
public class PbrSpecularMaterial extends Material
```

Material für physikalisch basiertes Rendering basierend auf Diffusfarbe/Specular/Glanz
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PbrSpecularMaterial()](#PbrSpecularMaterial--) | Konstruktor von [PbrSpecularMaterial](../../com.aspose.threed/pbrspecularmaterial) |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [MAP_AMBIENT](#MAP-AMBIENT) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine Umgebungs-Texturzuordnung zuzuweisen. |
| [MAP_DIFFUSE](#MAP-DIFFUSE) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine diffuse Texturzuordnung zuzuweisen. |
| [MAP_EMISSIVE](#MAP-EMISSIVE) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine emittierende Texturzuordnung zuzuweisen. |
| [MAP_NORMAL](#MAP-NORMAL) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine Normalen-Texturzuordnung zuzuweisen. |
| [MAP_SPECULAR](#MAP-SPECULAR) | Wird in [setTexture](../../com.aspose.threed/material\#setTexture) verwendet, um eine spekulare Texturzuordnung zuzuweisen. |
| [MAP_SPECULAR_GLOSSINESS](#MAP-SPECULAR-GLOSSINESS) | Die Texturkarte für spekulare Glanzlichter |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getClass()](#getClass--) |  |
| [getDiffuse()](#getDiffuse--) | Liest die diffuse Farbe des Materials, Standardwert ist (1, 1, 1) |
| [getDiffuseTexture()](#getDiffuseTexture--) | Liest die Textur für diffuse |
| [getEmissiveColor()](#getEmissiveColor--) | Liest die emittierende Farbe, Standardwert ist (0, 0, 0) |
| [getEmissiveTexture()](#getEmissiveTexture--) | Liest die Textur für emittierend |
| [getGlossinessFactor()](#getGlossinessFactor--) | Liest den Glanz (Glätte) des Materials, 1 bedeutet vollkommen glatt und 0 bedeutet vollkommen rau, Standardwert ist 1, Bereich ist [0, 1] |
| [getName()](#getName--) | Liefert den Namen. |
| [getNormalTexture()](#getNormalTexture--) | Liest die Textur der Normalenabbildung |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getSpecular()](#getSpecular--) | Liest die spekulare Farbe des Materials, Standardwert ist (1, 1, 1). |
| [getSpecularGlossinessTexture()](#getSpecularGlossinessTexture--) | Liest die Textur für spekulare Farbe, der RGB‑Kanal speichert die spekulare Farbe und der A‑Kanal speichert den Glanz. |
| [getTexture(String slotName)](#getTexture-java.lang.String-) | Gibt die Textur aus dem angegebenen Slot zurück, sie kann der Name einer Materialeigenschaft oder ein Shader-Parametername sein. |
| [getTransparency()](#getTransparency--) | Gibt den Transparenzfaktor zurück. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gibt den Enumerator zurück, um interne Textur‑Slots aufzuzählen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setDiffuse(Vector3 value)](#setDiffuse-com.aspose.threed.Vector3-) | Setzt die diffuse Farbe des Materials, Standardwert ist (1, 1, 1) |
| [setDiffuseTexture(TextureBase value)](#setDiffuseTexture-com.aspose.threed.TextureBase-) | Setzt die Textur für diffuse |
| [setEmissiveColor(Vector3 value)](#setEmissiveColor-com.aspose.threed.Vector3-) | Setzt die emittierende Farbe, Standardwert ist (0, 0, 0) |
| [setEmissiveTexture(TextureBase value)](#setEmissiveTexture-com.aspose.threed.TextureBase-) | Legt die Textur für Emissives fest |
| [setGlossinessFactor(double value)](#setGlossinessFactor-double-) | Legt die Glanz (Glätte) des Materials fest, 1 bedeutet vollkommen glatt und 0 bedeutet vollkommen rau, Standardwert ist 1, Bereich ist [0, 1] |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setNormalTexture(TextureBase value)](#setNormalTexture-com.aspose.threed.TextureBase-) | Legt die Textur des Normal-Mappings fest |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setSpecular(Vector3 value)](#setSpecular-com.aspose.threed.Vector3-) | Legt die spekulare Farbe des Materials fest, Standardwert ist (1, 1, 1). |
| [setSpecularGlossinessTexture(TextureBase value)](#setSpecularGlossinessTexture-com.aspose.threed.TextureBase-) | Legt die Textur für die spekulare Farbe fest, der RGB-Kanal speichert die spekulare Farbe und der A-Kanal speichert den Glanz. |
| [setTexture(String slotName, TextureBase texture)](#setTexture-java.lang.String-com.aspose.threed.TextureBase-) | Setzt die Textur in den angegebenen Slot. |
| [setTransparency(double value)](#setTransparency-double-) | Setzt den Transparenzfaktor. |
| [toString()](#toString--) | Formatiert das Objekt in einen String |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PbrSpecularMaterial() {#PbrSpecularMaterial--}
```
public PbrSpecularMaterial()
```


Konstruktor von [PbrSpecularMaterial](../../com.aspose.threed/pbrspecularmaterial)

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

### MAP_SPECULAR_GLOSSINESS {#MAP-SPECULAR-GLOSSINESS}
```
public static final String MAP_SPECULAR_GLOSSINESS
```


Die Texturkarte für spekulare Glanzlichter

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
### getDiffuse() {#getDiffuse--}
```
public Vector3 getDiffuse()
```


Liest die diffuse Farbe des Materials, Standardwert ist (1, 1, 1)

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the diffuse color of the material, default value is (1, 1, 1)
### getDiffuseTexture() {#getDiffuseTexture--}
```
public TextureBase getDiffuseTexture()
```


Liest die Textur für diffuse

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for diffuse
### getEmissiveColor() {#getEmissiveColor--}
```
public Vector3 getEmissiveColor()
```


Liest die emittierende Farbe, Standardwert ist (0, 0, 0)

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the emissive color, default value is (0, 0, 0)
### getEmissiveTexture() {#getEmissiveTexture--}
```
public TextureBase getEmissiveTexture()
```


Liest die Textur für emittierend

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for emissive
### getGlossinessFactor() {#getGlossinessFactor--}
```
public double getGlossinessFactor()
```


Liest den Glanz (Glätte) des Materials, 1 bedeutet vollkommen glatt und 0 bedeutet vollkommen rau, Standardwert ist 1, Bereich ist [0, 1]

**Returns:**
double - der Glanz (Glätte) des Materials, 1 bedeutet vollkommen glatt und 0 bedeutet vollkommen rau, Standardwert ist 1, Bereich ist [0, 1]
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getNormalTexture() {#getNormalTexture--}
```
public TextureBase getNormalTexture()
```


Liest die Textur der Normalenabbildung

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture of normal mapping
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
### getSpecular() {#getSpecular--}
```
public Vector3 getSpecular()
```


Liest die spekulare Farbe des Materials, Standardwert ist (1, 1, 1).

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the specular color of the material, default value is (1, 1, 1).
### getSpecularGlossinessTexture() {#getSpecularGlossinessTexture--}
```
public TextureBase getSpecularGlossinessTexture()
```


Liest die Textur für spekulare Farbe, der RGB‑Kanal speichert die spekulare Farbe und der A‑Kanal speichert den Glanz.

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for specular color, channel RGB stores the specular color and channel A stores the glossiness.
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
### getTransparency() {#getTransparency--}
```
public double getTransparency()
```


Liefert den Transparenzfaktor. Der Faktor sollte im Bereich zwischen 0 (0 %, vollständig undurchsichtig) und 1 (100 %, vollständig transparent) liegen. Jeder ungültige Faktorwert wird geklemmt.

**Returns:**
double – der Transparenzfaktor. Der Faktor sollte im Bereich zwischen 0 (0 %, vollständig undurchsichtig) und 1 (100 %, vollständig transparent) liegen. Jeder ungültige Faktorwert wird geklemmt.
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
### setDiffuse(Vector3 value) {#setDiffuse-com.aspose.threed.Vector3-}
```
public void setDiffuse(Vector3 value)
```


Setzt die diffuse Farbe des Materials, Standardwert ist (1, 1, 1)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setDiffuseTexture(TextureBase value) {#setDiffuseTexture-com.aspose.threed.TextureBase-}
```
public void setDiffuseTexture(TextureBase value)
```


Setzt die Textur für diffuse

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | Neuer Wert |

### setEmissiveColor(Vector3 value) {#setEmissiveColor-com.aspose.threed.Vector3-}
```
public void setEmissiveColor(Vector3 value)
```


Setzt die emittierende Farbe, Standardwert ist (0, 0, 0)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setEmissiveTexture(TextureBase value) {#setEmissiveTexture-com.aspose.threed.TextureBase-}
```
public void setEmissiveTexture(TextureBase value)
```


Legt die Textur für Emissives fest

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | Neuer Wert |

### setGlossinessFactor(double value) {#setGlossinessFactor-double-}
```
public void setGlossinessFactor(double value)
```


Legt die Glanz (Glätte) des Materials fest, 1 bedeutet vollkommen glatt und 0 bedeutet vollkommen rau, Standardwert ist 1, Bereich ist [0, 1]

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setNormalTexture(TextureBase value) {#setNormalTexture-com.aspose.threed.TextureBase-}
```
public void setNormalTexture(TextureBase value)
```


Legt die Textur des Normal-Mappings fest

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | Neuer Wert |

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

### setSpecular(Vector3 value) {#setSpecular-com.aspose.threed.Vector3-}
```
public void setSpecular(Vector3 value)
```


Legt die spekulare Farbe des Materials fest, Standardwert ist (1, 1, 1).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setSpecularGlossinessTexture(TextureBase value) {#setSpecularGlossinessTexture-com.aspose.threed.TextureBase-}
```
public void setSpecularGlossinessTexture(TextureBase value)
```


Legt die Textur für die spekulare Farbe fest, der RGB-Kanal speichert die spekulare Farbe und der A-Kanal speichert den Glanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | Neuer Wert |

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

### setTransparency(double value) {#setTransparency-double-}
```
public void setTransparency(double value)
```


Setzt den Transparenzfaktor. Der Faktor sollte im Bereich zwischen 0 (0 %, vollständig undurchsichtig) und 1 (100 %, vollständig transparent) liegen. Jeder ungültige Faktorwert wird geklemmt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

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

