---
title: Textur
second_title: Aspose.3D für Java API-Referenz
description: Diese Klasse definiert die Textur aus einer externen Datei.
type: docs
weight: 184
url: /de/java/com.aspose.threed/texture/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.TextureBase](../../com.aspose.threed/texturebase)
```
public class Texture extends TextureBase
```

Diese Klasse definiert die Textur aus einer externen Datei.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Texture()](#Texture--) | Initialisiert eine neue Instanz der Klasse [Texture](../../com.aspose.threed/texture). |
| [Texture(String name)](#Texture-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [Texture](../../com.aspose.threed/texture). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getAlpha()](#getAlpha--) | Ermittelt den Standard-Alpha-Wert der Textur. Dies ist gültig, wenn die [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) ist. Der Standardwert ist 1,0, der gültige Wertebereich liegt zwischen 0 und 1. |
| [getAlphaSource()](#getAlphaSource--) | Ermittelt, ob die Textur den Alpha-Kanal definiert. |
| [getClass()](#getClass--) |  |
| [getContent()](#getContent--) | Ermittelt den Binärinhalt der Textur. |
| [getEnableMipMap()](#getEnableMipMap--) | Ermittelt, ob das Mipmap für diese Textur aktiviert ist. |
| [getFileName()](#getFileName--) | Ermittelt die zugehörige Texturdatei. |
| [getMagFilter()](#getMagFilter--) | Ermittelt den Filter für Vergrößerung. |
| [getMinFilter()](#getMinFilter--) | Ermittelt den Filter für Verkleinerung. |
| [getMipFilter()](#getMipFilter--) | Ermittelt den Filter für Mip-Level-Abtastung. |
| [getName()](#getName--) | Liefert den Namen. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getUVRotation()](#getUVRotation--) | Ermittelt die Drehung der Textur. |
| [getUVScale()](#getUVScale--) | Ermittelt die UV-Skalierung. |
| [getUVTranslation()](#getUVTranslation--) | Ermittelt die UV-Translation. |
| [getWrapModeU()](#getWrapModeU--) | Ermittelt die Textur-Wrap-Modi in U. |
| [getWrapModeV()](#getWrapModeV--) | Ermittelt die Textur-Wrap-Modi in V. |
| [getWrapModeW()](#getWrapModeW--) | Ermittelt die Textur-Wrap-Modi in W. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setAlpha(double value)](#setAlpha-double-) | Legt den Standard-Alpha-Wert der Textur fest. Dies ist gültig, wenn die [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) ist. Der Standardwert ist 1,0, der gültige Wertebereich liegt zwischen 0 und 1. |
| [setAlphaSource(AlphaSource value)](#setAlphaSource-com.aspose.threed.AlphaSource-) | Legt fest, ob die Textur den Alpha-Kanal definiert. |
| [setContent(byte[] value)](#setContent-byte---) | Legt den Binärinhalt der Textur fest. |
| [setEnableMipMap(boolean value)](#setEnableMipMap-boolean-) | Legt fest, ob das Mipmap für diese Textur aktiviert ist |
| [setFileName(String value)](#setFileName-java.lang.String-) | Legt die zugehörige Texturdatei fest. |
| [setMagFilter(TextureFilter value)](#setMagFilter-com.aspose.threed.TextureFilter-) | Legt den Filter für Vergrößerung fest. |
| [setMinFilter(TextureFilter value)](#setMinFilter-com.aspose.threed.TextureFilter-) | Legt den Filter für Verkleinerung fest. |
| [setMipFilter(TextureFilter value)](#setMipFilter-com.aspose.threed.TextureFilter-) | Legt den Filter für Mipmap‑Ebene‑Abtastung fest. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setRotation(double u, double v)](#setRotation-double-double-) | Legt die UV‑Rotation fest. |
| [setScale(double u, double v)](#setScale-double-double-) | Legt die UV‑Skalierung fest. |
| [setTranslation(double u, double v)](#setTranslation-double-double-) | Legt die UV‑Translation fest. |
| [setUVRotation(Vector3 value)](#setUVRotation-com.aspose.threed.Vector3-) | Legt die Rotation der Textur fest |
| [setUVScale(Vector2 value)](#setUVScale-com.aspose.threed.Vector2-) | Legt die UV‑Skalierung fest. |
| [setUVTranslation(Vector2 value)](#setUVTranslation-com.aspose.threed.Vector2-) | Legt die UV‑Translation fest. |
| [setWrapModeU(WrapMode value)](#setWrapModeU-com.aspose.threed.WrapMode-) | Legt die Textur-Wrap‑Modi in U fest. |
| [setWrapModeV(WrapMode value)](#setWrapModeV-com.aspose.threed.WrapMode-) | Legt die Textur-Wrap‑Modi in V fest. |
| [setWrapModeW(WrapMode value)](#setWrapModeW-com.aspose.threed.WrapMode-) | Legt die Textur-Wrap‑Modi in W fest. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Texture() {#Texture--}
```
public Texture()
```


Initialisiert eine neue Instanz der Klasse [Texture](../../com.aspose.threed/texture).

### Texture(String name) {#Texture-java.lang.String-}
```
public Texture(String name)
```


Initialisiert eine neue Instanz der Klasse [Texture](../../com.aspose.threed/texture).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name |

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
### getAlpha() {#getAlpha--}
```
public double getAlpha()
```


Ermittelt den Standard-Alpha-Wert der Textur. Dies ist gültig, wenn die [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) ist. Der Standardwert ist 1,0, der gültige Wertebereich liegt zwischen 0 und 1.

**Returns:**
double - der Standard‑Alpha‑Wert der Textur. Dies ist gültig, wenn [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) ist. Standardwert ist 1.0, gültiger Wertebereich liegt zwischen 0 und 1
### getAlphaSource() {#getAlphaSource--}
```
public AlphaSource getAlphaSource()
```


Ermittelt, ob die Textur den Alpha‑Kanal definiert. Standardwert ist [AlphaSource.NONE](../../com.aspose.threed/alphasource\#NONE)

**Returns:**
[AlphaSource](../../com.aspose.threed/alphasource) - whether the texture defines the alpha channel. Default value is [AlphaSource.NONE](../../com.aspose.threed/alphasource\#NONE)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getContent() {#getContent--}
```
public byte[] getContent()
```


Ermittelt den Binärinhalt der Textur. Der eingebettete Texturinhalt ist optional, der Benutzer sollte die Textur aus einer externen Datei laden, falls dieser fehlt.

**Returns:**
byte[] - der Binärinhalt der Textur. Der eingebettete Texturinhalt ist optional, der Benutzer sollte die Textur aus einer externen Datei laden, falls dieser fehlt.
### getEnableMipMap() {#getEnableMipMap--}
```
public boolean getEnableMipMap()
```


Ermittelt, ob das Mipmap für diese Textur aktiviert ist.

**Returns:**
boolean - ob das Mipmap für diese Textur aktiviert ist
### getFileName() {#getFileName--}
```
public String getFileName()
```


Ermittelt die zugehörige Texturdatei.

**Returns:**
java.lang.String - die zugehörige Texturdatei.
### getMagFilter() {#getMagFilter--}
```
public TextureFilter getMagFilter()
```


Ermittelt den Filter für Vergrößerung.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter) - the filter for magnification.
### getMinFilter() {#getMinFilter--}
```
public TextureFilter getMinFilter()
```


Ermittelt den Filter für Verkleinerung.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter) - the filter for minification.
### getMipFilter() {#getMipFilter--}
```
public TextureFilter getMipFilter()
```


Ermittelt den Filter für Mip-Level-Abtastung.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter) - the filter for mip-level sampling.
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
### getUVRotation() {#getUVRotation--}
```
public Vector3 getUVRotation()
```


Ermittelt die Drehung der Textur.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the rotation of the texture
### getUVScale() {#getUVScale--}
```
public Vector2 getUVScale()
```


Ermittelt die UV-Skalierung.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the UV scale.
### getUVTranslation() {#getUVTranslation--}
```
public Vector2 getUVTranslation()
```


Ermittelt die UV-Translation.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the UV translation.
### getWrapModeU() {#getWrapModeU--}
```
public WrapMode getWrapModeU()
```


Ermittelt die Textur-Wrap-Modi in U.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode) - the texture wrap modes in U.
### getWrapModeV() {#getWrapModeV--}
```
public WrapMode getWrapModeV()
```


Ermittelt die Textur-Wrap-Modi in V.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode) - the texture wrap modes in V.
### getWrapModeW() {#getWrapModeW--}
```
public WrapMode getWrapModeW()
```


Ermittelt die Textur-Wrap-Modi in W.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode) - the texture wrap modes in W.
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
### setAlpha(double value) {#setAlpha-double-}
```
public void setAlpha(double value)
```


Legt den Standard-Alpha-Wert der Textur fest. Dies ist gültig, wenn die [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) ist. Der Standardwert ist 1,0, der gültige Wertebereich liegt zwischen 0 und 1.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setAlphaSource(AlphaSource value) {#setAlphaSource-com.aspose.threed.AlphaSource-}
```
public void setAlphaSource(AlphaSource value)
```


Legt fest, ob die Textur den Alpha‑Kanal definiert. Standardwert ist [AlphaSource.NONE](../../com.aspose.threed/alphasource\#NONE)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [AlphaSource](../../com.aspose.threed/alphasource) | Neuer Wert |

### setContent(byte[] value) {#setContent-byte---}
```
public void setContent(byte[] value)
```


Legt den Binärinhalt der Textur fest. Der eingebettete Texturinhalt ist optional, der Benutzer sollte die Textur aus einer externen Datei laden, falls dieser fehlt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | byte[] | Neuer Wert |

### setEnableMipMap(boolean value) {#setEnableMipMap-boolean-}
```
public void setEnableMipMap(boolean value)
```


Legt fest, ob das Mipmap für diese Textur aktiviert ist

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Legt die zugehörige Texturdatei fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setMagFilter(TextureFilter value) {#setMagFilter-com.aspose.threed.TextureFilter-}
```
public void setMagFilter(TextureFilter value)
```


Legt den Filter für Vergrößerung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | Neuer Wert |

### setMinFilter(TextureFilter value) {#setMinFilter-com.aspose.threed.TextureFilter-}
```
public void setMinFilter(TextureFilter value)
```


Legt den Filter für Verkleinerung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | Neuer Wert |

### setMipFilter(TextureFilter value) {#setMipFilter-com.aspose.threed.TextureFilter-}
```
public void setMipFilter(TextureFilter value)
```


Legt den Filter für Mipmap‑Ebene‑Abtastung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | Neuer Wert |

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

### setRotation(double u, double v) {#setRotation-double-double-}
```
public void setRotation(double u, double v)
```


Legt die UV‑Rotation fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| u | double | U. |
| v | double | V. |

### setScale(double u, double v) {#setScale-double-double-}
```
public void setScale(double u, double v)
```


Legt die UV‑Skalierung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| u | double | U. |
| v | double | V. |

### setTranslation(double u, double v) {#setTranslation-double-double-}
```
public void setTranslation(double u, double v)
```


Legt die UV‑Translation fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| u | double | U. |
| v | double | V. |

### setUVRotation(Vector3 value) {#setUVRotation-com.aspose.threed.Vector3-}
```
public void setUVRotation(Vector3 value)
```


Legt die Rotation der Textur fest

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setUVScale(Vector2 value) {#setUVScale-com.aspose.threed.Vector2-}
```
public void setUVScale(Vector2 value)
```


Legt die UV‑Skalierung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setUVTranslation(Vector2 value) {#setUVTranslation-com.aspose.threed.Vector2-}
```
public void setUVTranslation(Vector2 value)
```


Legt die UV‑Translation fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setWrapModeU(WrapMode value) {#setWrapModeU-com.aspose.threed.WrapMode-}
```
public void setWrapModeU(WrapMode value)
```


Legt die Textur-Wrap‑Modi in U fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | Neuer Wert |

### setWrapModeV(WrapMode value) {#setWrapModeV-com.aspose.threed.WrapMode-}
```
public void setWrapModeV(WrapMode value)
```


Legt die Textur-Wrap‑Modi in V fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | Neuer Wert |

### setWrapModeW(WrapMode value) {#setWrapModeW-com.aspose.threed.WrapMode-}
```
public void setWrapModeW(WrapMode value)
```


Legt die Textur-Wrap‑Modi in W fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | Neuer Wert |

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

