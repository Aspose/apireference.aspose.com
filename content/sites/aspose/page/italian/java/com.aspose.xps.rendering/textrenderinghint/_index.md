---
title: "TextRenderingHint"
second_title: "Aspose.Page per Java API Reference"
description: "Specifica la qualità del rendering del testo."
type: docs
weight: 25
url: /it/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Specifica la qualità del rendering del testo.
## Campi

| Campo | Descrizione |
| --- | --- |
| [AntiAlias](#AntiAlias) | Ogni carattere è disegnato usando il suo bitmap di glifo antialiasing senza hinting. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Ogni carattere è disegnato usando il suo bitmap di glifo antialiasing con hinting. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Ogni carattere è disegnato usando il suo bitmap di glifo ClearType con hinting. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Ogni carattere è disegnato usando il suo bitmap di glifo. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Ogni carattere è disegnato usando il suo bitmap di glifo. |
| [SystemDefault](#SystemDefault) | Ogni carattere è disegnato usando il suo bitmap di glifo, con il suggerimento di rendering predefinito del sistema. |
## Metodi

| Metodo | Descrizione |
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


Ogni carattere è disegnato usando il suo bitmap di glifo antialiasing senza hinting. Qualità migliore grazie all'antialiasing. Le differenze di larghezza del tratto possono essere evidenti perché il hinting è disattivato.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Ogni carattere è disegnato usando il suo bitmap di glifo antialiasing con hinting. Qualità molto migliore grazie all'antialiasing, ma a un costo di prestazioni più elevato.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Ogni carattere è disegnato usando il suo bitmap di glifo ClearType con hinting. L'impostazione di qualità più alta. Utilizzata per sfruttare le funzionalità dei caratteri ClearType.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Ogni carattere è disegnato usando il suo bitmap di glifo. Il hinting non è usato.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Ogni carattere è disegnato usando il suo bitmap di glifo. Il hinting è usato per migliorare l'aspetto dei caratteri su tratti e curvature.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Ogni carattere è disegnato usando il suo bitmap di glifo, con il suggerimento di rendering predefinito del sistema. Il testo sarà disegnato usando le impostazioni di smoothing dei font selezionate dall'utente per il sistema.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | java.lang.String |  |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

