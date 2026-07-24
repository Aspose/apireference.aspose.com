---
title: "TextRenderingHint"
second_title: "Aspose.Page for Java API-Referenz"
description: "Gibt die Qualität der Textdarstellung an."
type: docs
weight: 25
url: /de/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Gibt die Qualität der Textdarstellung an.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [AntiAlias](#AntiAlias) | Jedes Zeichen wird mit seiner antialiasierten Glyph-Bitmap ohne Hinting gezeichnet. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Jedes Zeichen wird mit seiner antialiasierten Glyph-Bitmap mit Hinting gezeichnet. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Jedes Zeichen wird mit seiner Glyph-ClearType-Bitmap mit Hinting gezeichnet. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Jedes Zeichen wird mit seiner Glyph-Bitmap gezeichnet. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Jedes Zeichen wird mit seiner Glyph-Bitmap gezeichnet. |
| [SystemDefault](#SystemDefault) | Jedes Zeichen wird mit seiner Glyph-Bitmap gezeichnet, mit dem systemstandardmäßigen Rendering-Hint. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


Jedes Zeichen wird mit seiner antialiasierten Glyph-Bitmap ohne Hinting gezeichnet. Bessere Qualität dank Antialiasing. Unterschiede in der Stängelbreite können bemerkbar sein, weil Hinting deaktiviert ist.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Jedes Zeichen wird mit seiner antialiasierten Glyph-Bitmap mit Hinting gezeichnet. Viel bessere Qualität dank Antialiasing, jedoch mit höheren Leistungskosten.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Jedes Zeichen wird mit seiner Glyph-ClearType-Bitmap mit Hinting gezeichnet. Die höchste Qualitätseinstellung. Wird verwendet, um die ClearType-Schriftmerkmale zu nutzen.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Jedes Zeichen wird mit seiner Glyph-Bitmap gezeichnet. Hinting wird nicht verwendet.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Jedes Zeichen wird mit seiner Glyph-Bitmap gezeichnet. Hinting wird verwendet, um das Erscheinungsbild von Zeichen auf Stängeln und Krümmungen zu verbessern.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Jedes Zeichen wird mit seiner Glyph-Bitmap gezeichnet, mit dem systemstandardmäßigen Rendering-Hint. Der Text wird mit den vom Benutzer für das System ausgewählten Schriftglättungseinstellungen gezeichnet.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
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

