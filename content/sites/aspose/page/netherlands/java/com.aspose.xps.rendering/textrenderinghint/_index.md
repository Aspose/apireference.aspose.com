---
title: "TextRenderingHint"
second_title: "Aspose.Page voor Java API-referentie"
description: "Specificeert de kwaliteit van tekstopmaak."
type: docs
weight: 25
url: /nl/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Specificeert de kwaliteit van tekstopmaak.
## Velden

| Veld | Beschrijving |
| --- | --- |
| [AntiAlias](#AntiAlias) | Elk teken wordt getekend met zijn anti‑aliasing glyph-bitmap zonder hinting. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Elk teken wordt getekend met zijn anti‑aliasing glyph-bitmap met hinting. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Elk teken wordt getekend met zijn glyph ClearType-bitmap met hinting. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Elk teken wordt getekend met zijn glyph-bitmap. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Elk teken wordt getekend met zijn glyph-bitmap. |
| [SystemDefault](#SystemDefault) | Elk teken wordt getekend met zijn glyph-bitmap, met de standaard renderhint van het systeem. |
## Methoden

| Methode | Beschrijving |
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


Elk teken wordt getekend met zijn anti‑aliasing glyph-bitmap zonder hinting. Betere kwaliteit door anti‑aliasing. Verschillen in stemplaatsbreedte kunnen merkbaar zijn omdat hinting is uitgeschakeld.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Elk teken wordt getekend met zijn anti‑aliasing glyph-bitmap met hinting. Veel betere kwaliteit door anti‑aliasing, maar tegen een hogere prestatiekost.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Elk teken wordt getekend met zijn glyph ClearType-bitmap met hinting. De hoogste kwaliteitinstelling. Gebruikt om te profiteren van ClearType-lettertype‑functies.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Elk teken wordt getekend met zijn glyph-bitmap. Hinting wordt niet gebruikt.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Elk teken wordt getekend met zijn glyph-bitmap. Hinting wordt gebruikt om het uiterlijk van tekens op stammen en krommingen te verbeteren.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Elk teken wordt getekend met zijn glyph-bitmap, met de standaard renderhint van het systeem. De tekst wordt getekend met de font‑smoothing instellingen die de gebruiker voor het systeem heeft geselecteerd.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| naam | java.lang.String |  |

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

