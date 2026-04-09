---
title: RelativeRectangle
second_title: Aspose.3D für Java API-Referenz
description: Relatives Rechteck  Die Formel zwischen relativem Bauteil und absolutem Wert ist  Scale  Reference Width  offset  Wenn wir also einen absoluten Wert darstellen wollen, lassen Sie alle Skalierungsfelder auf Null und verwenden stattdessen Offset-Felder.
type: docs
weight: 147
url: /de/java/com.aspose.threed/relativerectangle/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class RelativeRectangle implements Struct<RelativeRectangle>, Serializable
```

Relatives Rechteck Die Formel zwischen relativer Komponente und absolutem Wert lautet: Scale \* (Reference Width) + offset. Wenn wir möchten, dass es einen absoluten Wert darstellt, lassen Sie alle Skalierungsfelder auf Null und verwenden stattdessen Offset-Felder.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [RelativeRectangle(int left, int top, int width, int height)](#RelativeRectangle-int-int-int-int-) | Erstelle ein [RelativeRectangle](../../com.aspose.threed/relativerectangle) |
| [RelativeRectangle()](#RelativeRectangle--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clone()](#clone--) |  |
| [copyFrom(RelativeRectangle src)](#copyFrom-com.aspose.threed.RelativeRectangle-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [fromScale(float scaleX, float scaleY, float scaleWidth, float scaleHeight)](#fromScale-float-float-float-float-) | Erstelle ein [RelativeRectangle](../../com.aspose.threed/relativerectangle) mit allen Offset-Feldern auf Null und Skalierungsfeldern aus den angegebenen Parametern. |
| [getClass()](#getClass--) |  |
| [getOffsetHeight()](#getOffsetHeight--) | Liefert den Offset für die Höhe |
| [getOffsetWidth()](#getOffsetWidth--) | Liefert den Offset für die Breite |
| [getOffsetX()](#getOffsetX--) | Liefert den Offset für die X‑Koordinate |
| [getOffsetY()](#getOffsetY--) | Liefert den Offset für die Y‑Koordinate |
| [getScaleHeight()](#getScaleHeight--) | Relative Höhe |
| [getScaleWidth()](#getScaleWidth--) | Relative Breite |
| [getScaleX()](#getScaleX--) | Relative X‑Koordinate |
| [getScaleY()](#getScaleY--) | Relative Y‑Koordinate |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffsetHeight(int value)](#setOffsetHeight-int-) | Setzt den Offset für die Höhe |
| [setOffsetWidth(int value)](#setOffsetWidth-int-) | Setzt den Offset für die Breite |
| [setOffsetX(int value)](#setOffsetX-int-) | Setzt den Offset für die X‑Koordinate |
| [setOffsetY(int value)](#setOffsetY-int-) | Setzt den Offset für die Y‑Koordinate |
| [setScaleHeight(float value)](#setScaleHeight-float-) | Relative Höhe |
| [setScaleWidth(float value)](#setScaleWidth-float-) | Relative Breite |
| [setScaleX(float value)](#setScaleX-float-) | Relative X‑Koordinate |
| [setScaleY(float value)](#setScaleY-float-) | Relative Y‑Koordinate |
| [toAbsolute(int left, int top, int width, int height)](#toAbsolute-int-int-int-int-) | Konvertiere das relative Rechteck in ein absolutes Rechteck |
| [toString()](#toString--) | Konvertiert den Wert dieser Instanz in einen java.lang.String. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### RelativeRectangle(int left, int top, int width, int height) {#RelativeRectangle-int-int-int-int-}
```
public RelativeRectangle(int left, int top, int width, int height)
```


Erstelle ein [RelativeRectangle](../../com.aspose.threed/relativerectangle)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| links | int |  |
| oben | int |  |
| Breite | int |  |
| height | int |  |

### RelativeRectangle() {#RelativeRectangle--}
```
public RelativeRectangle()
```


### clone() {#clone--}
```
public RelativeRectangle clone()
```


Klone aktuelle Instanz

**Returns:**
[RelativeRectangle](../../com.aspose.threed/relativerectangle)
### copyFrom(RelativeRectangle src) {#copyFrom-com.aspose.threed.RelativeRectangle-}
```
public void copyFrom(RelativeRectangle src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [RelativeRectangle](../../com.aspose.threed/relativerectangle) |  |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### fromScale(float scaleX, float scaleY, float scaleWidth, float scaleHeight) {#fromScale-float-float-float-float-}
```
public static RelativeRectangle fromScale(float scaleX, float scaleY, float scaleWidth, float scaleHeight)
```


Erstelle ein [RelativeRectangle](../../com.aspose.threed/relativerectangle) mit allen Offset-Feldern auf Null und Skalierungsfeldern aus den angegebenen Parametern.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scaleX | float |  |
| scaleY | float |  |
| scaleWidth | float |  |
| scaleHeight | float |  |

**Returns:**
[RelativeRectangle](../../com.aspose.threed/relativerectangle)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOffsetHeight() {#getOffsetHeight--}
```
public int getOffsetHeight()
```


Liefert den Offset für die Höhe

**Returns:**
int - der Versatz für die Höhe
### getOffsetWidth() {#getOffsetWidth--}
```
public int getOffsetWidth()
```


Liefert den Offset für die Breite

**Returns:**
int - der Versatz für die Breite
### getOffsetX() {#getOffsetX--}
```
public int getOffsetX()
```


Liefert den Offset für die X‑Koordinate

**Returns:**
int - der Versatz für die Koordinate X
### getOffsetY() {#getOffsetY--}
```
public int getOffsetY()
```


Liefert den Offset für die Y‑Koordinate

**Returns:**
int - der Versatz für die Koordinate Y
### getScaleHeight() {#getScaleHeight--}
```
public float getScaleHeight()
```


Relative Höhe

**Returns:**
float - Relative Höhe
### getScaleWidth() {#getScaleWidth--}
```
public float getScaleWidth()
```


Relative Breite

**Returns:**
float - Relative Breite
### getScaleX() {#getScaleX--}
```
public float getScaleX()
```


Relative X‑Koordinate

**Returns:**
float - Relative Koordinate X
### getScaleY() {#getScaleY--}
```
public float getScaleY()
```


Relative Y‑Koordinate

**Returns:**
float - Relative Koordinate Y
### hashCode() {#hashCode--}
```
public int hashCode()
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




### setOffsetHeight(int value) {#setOffsetHeight-int-}
```
public void setOffsetHeight(int value)
```


Setzt den Offset für die Höhe

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setOffsetWidth(int value) {#setOffsetWidth-int-}
```
public void setOffsetWidth(int value)
```


Setzt den Offset für die Breite

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setOffsetX(int value) {#setOffsetX-int-}
```
public void setOffsetX(int value)
```


Setzt den Offset für die X‑Koordinate

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setOffsetY(int value) {#setOffsetY-int-}
```
public void setOffsetY(int value)
```


Setzt den Offset für die Y‑Koordinate

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setScaleHeight(float value) {#setScaleHeight-float-}
```
public void setScaleHeight(float value)
```


Relative Höhe

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setScaleWidth(float value) {#setScaleWidth-float-}
```
public void setScaleWidth(float value)
```


Relative Breite

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setScaleX(float value) {#setScaleX-float-}
```
public void setScaleX(float value)
```


Relative X‑Koordinate

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setScaleY(float value) {#setScaleY-float-}
```
public void setScaleY(float value)
```


Relative Y‑Koordinate

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### toAbsolute(int left, int top, int width, int height) {#toAbsolute-int-int-int-int-}
```
public Rect toAbsolute(int left, int top, int width, int height)
```


Konvertiere das relative Rechteck in ein absolutes Rechteck

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| links | int | Links des Rechtecks |
| oben | int | Oben des Rechtecks |
| Breite | int | Breite des Rechtecks |
| height | int | Höhe des Rechtecks |

**Returns:**
[Rect](../../com.aspose.threed/rect)
### toString() {#toString--}
```
public String toString()
```


Konvertiert den Wert dieser Instanz in einen java.lang.String.

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

