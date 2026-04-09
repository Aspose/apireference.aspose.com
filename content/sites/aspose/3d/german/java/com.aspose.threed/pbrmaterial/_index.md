---
title: PbrMaterial
second_title: Aspose.3D für Java API-Referenz
description: Material für physikalisch basiertes Rendering basierend auf Albedo‑Farbe/Metallisch/Rauheit
type: docs
weight: 121
url: /de/java/com.aspose.threed/pbrmaterial/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Material](../../com.aspose.threed/material)
```
public class PbrMaterial extends Material
```

Material für physikalisch basiertes Rendering basierend auf Albedo‑Farbe/Metallisch/Rauheit
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PbrMaterial()](#PbrMaterial--) | Erstelle eine Standard-PBR-Materialinstanz |
| [PbrMaterial(Vector3 albedo)](#PbrMaterial-com.aspose.threed.Vector3-) | Erstelle ein Standard-PBR-Material mit angegebenem Albedo-Farbwert. |
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
| [fromMaterial(Material material)](#fromMaterial-com.aspose.threed.Material-) | Erlaubt das Konvertieren anderer Materialien zu PbrMaterial **Example:** |
| [getAlbedo()](#getAlbedo--) | Liefert die Grundfarbe des Materials |
| [getAlbedoTexture()](#getAlbedoTexture--) | Liefert die Textur für Albedo |
| [getClass()](#getClass--) |  |
| [getEmissiveColor()](#getEmissiveColor--) | Gibt die emittierende Farbe zurück. |
| [getEmissiveTexture()](#getEmissiveTexture--) | Liest die Textur für emittierend |
| [getMetallicFactor()](#getMetallicFactor--) | Liefert die Metallizität des Materials, ein Wert von 1 bedeutet, dass das Material ein Metall ist, und ein Wert von 0 bedeutet, dass das Material ein Dielektrikum ist. |
| [getMetallicRoughness()](#getMetallicRoughness--) | Liefert die Textur für Metallisch (im R-Kanal) und Rauheit (im G-Kanal) |
| [getName()](#getName--) | Liefert den Namen. |
| [getNormalTexture()](#getNormalTexture--) | Liest die Textur der Normalenabbildung |
| [getOcclusionFactor()](#getOcclusionFactor--) | Liefert den Faktor der Umgebungsokklusion |
| [getOcclusionTexture()](#getOcclusionTexture--) | Liefert die Textur für Umgebungsokklusion |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getRoughnessFactor()](#getRoughnessFactor--) | Liefert die Rauheit des Materials, ein Wert von 1 bedeutet, dass das Material vollständig rau ist, und ein Wert von 0 bedeutet, dass das Material vollständig glatt ist. |
| [getSpecularTexture()](#getSpecularTexture--) | Liefert die Textur für spekulare Farbe |
| [getTexture(String slotName)](#getTexture-java.lang.String-) | Gibt die Textur aus dem angegebenen Slot zurück, sie kann der Name einer Materialeigenschaft oder ein Shader-Parametername sein. |
| [getTransparency()](#getTransparency--) | Gibt den Transparenzfaktor zurück. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gibt den Enumerator zurück, um interne Textur‑Slots aufzuzählen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setAlbedo(Vector3 value)](#setAlbedo-com.aspose.threed.Vector3-) | Setzt die Grundfarbe des Materials |
| [setAlbedoTexture(TextureBase value)](#setAlbedoTexture-com.aspose.threed.TextureBase-) | Legt die Textur für Albedo fest |
| [setEmissiveColor(Vector3 value)](#setEmissiveColor-com.aspose.threed.Vector3-) | Setzt die emittierende Farbe. |
| [setEmissiveTexture(TextureBase value)](#setEmissiveTexture-com.aspose.threed.TextureBase-) | Legt die Textur für Emissives fest |
| [setMetallicFactor(double value)](#setMetallicFactor-double-) | Legt die Metallizität des Materials fest, ein Wert von 1 bedeutet, dass das Material ein Metall ist, und ein Wert von 0 bedeutet, dass das Material ein Dielektrikum ist. |
| [setMetallicRoughness(TextureBase value)](#setMetallicRoughness-com.aspose.threed.TextureBase-) | Legt die Textur für Metallic (im R-Kanal) und Rauheit (im G-Kanal) fest |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setNormalTexture(TextureBase value)](#setNormalTexture-com.aspose.threed.TextureBase-) | Legt die Textur des Normal-Mappings fest |
| [setOcclusionFactor(double value)](#setOcclusionFactor-double-) | Legt den Faktor der Umgebungsokklusion fest |
| [setOcclusionTexture(TextureBase value)](#setOcclusionTexture-com.aspose.threed.TextureBase-) | Legt die Textur für Umgebungsokklusion fest |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setRoughnessFactor(double value)](#setRoughnessFactor-double-) | Legt die Rauheit des Materials fest, ein Wert von 1 bedeutet, dass das Material völlig rau ist, und ein Wert von 0 bedeutet, dass das Material völlig glatt ist. |
| [setSpecularTexture(TextureBase value)](#setSpecularTexture-com.aspose.threed.TextureBase-) | Legt die Textur für die spekulare Farbe fest |
| [setTexture(String slotName, TextureBase texture)](#setTexture-java.lang.String-com.aspose.threed.TextureBase-) | Setzt die Textur in den angegebenen Slot. |
| [setTransparency(double value)](#setTransparency-double-) | Setzt den Transparenzfaktor. |
| [toString()](#toString--) | Formatiert das Objekt in einen String |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PbrMaterial() {#PbrMaterial--}
```
public PbrMaterial()
```


Erstelle eine Standard-PBR-Materialinstanz

### PbrMaterial(Vector3 albedo) {#PbrMaterial-com.aspose.threed.Vector3-}
```
public PbrMaterial(Vector3 albedo)
```


Erstelle ein Standard-PBR-Material mit angegebenem Albedo-Farbwert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| albedo | [Vector3](../../com.aspose.threed/vector3) | Der Standardwert für die Albedo-Farbe |

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
### fromMaterial(Material material) {#fromMaterial-com.aspose.threed.Material-}
```
public static PbrMaterial fromMaterial(Material material)
```


Erlaubt das Konvertieren anderer Materialien zu PbrMaterial **Example:**

```
var mat = new LambertMaterial();
     var tex = new Texture();
     tex.setFileName("diffuse.png");
     mat.setTexture(Material.MAP_DIFFUSE, tex);
     mat.setDiffuseColor(new Vector3(0.3, 0.9, 0.4));
     PbrMaterial pbr = PbrMaterial.fromMaterial(mat);
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| material | [Material](../../com.aspose.threed/material) |  |

**Returns:**
[PbrMaterial](../../com.aspose.threed/pbrmaterial)
### getAlbedo() {#getAlbedo--}
```
public Vector3 getAlbedo()
```


Liefert die Grundfarbe des Materials

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the base color of the material
### getAlbedoTexture() {#getAlbedoTexture--}
```
public TextureBase getAlbedoTexture()
```


Liefert die Textur für Albedo

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for albedo
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEmissiveColor() {#getEmissiveColor--}
```
public Vector3 getEmissiveColor()
```


Gibt die emittierende Farbe zurück.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the emissive color
### getEmissiveTexture() {#getEmissiveTexture--}
```
public TextureBase getEmissiveTexture()
```


Liest die Textur für emittierend

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for emissive
### getMetallicFactor() {#getMetallicFactor--}
```
public double getMetallicFactor()
```


Liefert die Metallizität des Materials, ein Wert von 1 bedeutet, dass das Material ein Metall ist, und ein Wert von 0 bedeutet, dass das Material ein Dielektrikum ist.

**Returns:**
double - die Metallizität des Materials, ein Wert von 1 bedeutet, dass das Material ein Metall ist, und ein Wert von 0 bedeutet, dass das Material ein Dielektrikum ist.
### getMetallicRoughness() {#getMetallicRoughness--}
```
public TextureBase getMetallicRoughness()
```


Liefert die Textur für Metallisch (im R-Kanal) und Rauheit (im G-Kanal)

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for metallic(in R channel) and roughness(in G channel)
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
### getOcclusionFactor() {#getOcclusionFactor--}
```
public double getOcclusionFactor()
```


Liefert den Faktor der Umgebungsokklusion

**Returns:**
double - der Faktor der Umgebungsokklusion
### getOcclusionTexture() {#getOcclusionTexture--}
```
public TextureBase getOcclusionTexture()
```


Liefert die Textur für Umgebungsokklusion

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for ambient occlusion
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
### getRoughnessFactor() {#getRoughnessFactor--}
```
public double getRoughnessFactor()
```


Liefert die Rauheit des Materials, ein Wert von 1 bedeutet, dass das Material vollständig rau ist, und ein Wert von 0 bedeutet, dass das Material vollständig glatt ist.

**Returns:**
double - die Rauheit des Materials, ein Wert von 1 bedeutet, dass das Material völlig rau ist, und ein Wert von 0 bedeutet, dass das Material völlig glatt ist.
### getSpecularTexture() {#getSpecularTexture--}
```
public TextureBase getSpecularTexture()
```


Liefert die Textur für spekulare Farbe

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for specular color
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
### setAlbedo(Vector3 value) {#setAlbedo-com.aspose.threed.Vector3-}
```
public void setAlbedo(Vector3 value)
```


Setzt die Grundfarbe des Materials

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setAlbedoTexture(TextureBase value) {#setAlbedoTexture-com.aspose.threed.TextureBase-}
```
public void setAlbedoTexture(TextureBase value)
```


Legt die Textur für Albedo fest

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | Neuer Wert |

### setEmissiveColor(Vector3 value) {#setEmissiveColor-com.aspose.threed.Vector3-}
```
public void setEmissiveColor(Vector3 value)
```


Setzt die emittierende Farbe.

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

### setMetallicFactor(double value) {#setMetallicFactor-double-}
```
public void setMetallicFactor(double value)
```


Legt die Metallizität des Materials fest, ein Wert von 1 bedeutet, dass das Material ein Metall ist, und ein Wert von 0 bedeutet, dass das Material ein Dielektrikum ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setMetallicRoughness(TextureBase value) {#setMetallicRoughness-com.aspose.threed.TextureBase-}
```
public void setMetallicRoughness(TextureBase value)
```


Legt die Textur für Metallic (im R-Kanal) und Rauheit (im G-Kanal) fest

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | Neuer Wert |

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

### setOcclusionFactor(double value) {#setOcclusionFactor-double-}
```
public void setOcclusionFactor(double value)
```


Legt den Faktor der Umgebungsokklusion fest

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setOcclusionTexture(TextureBase value) {#setOcclusionTexture-com.aspose.threed.TextureBase-}
```
public void setOcclusionTexture(TextureBase value)
```


Legt die Textur für Umgebungsokklusion fest

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

### setRoughnessFactor(double value) {#setRoughnessFactor-double-}
```
public void setRoughnessFactor(double value)
```


Legt die Rauheit des Materials fest, ein Wert von 1 bedeutet, dass das Material völlig rau ist, und ein Wert von 0 bedeutet, dass das Material völlig glatt ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setSpecularTexture(TextureBase value) {#setSpecularTexture-com.aspose.threed.TextureBase-}
```
public void setSpecularTexture(TextureBase value)
```


Legt die Textur für die spekulare Farbe fest

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

