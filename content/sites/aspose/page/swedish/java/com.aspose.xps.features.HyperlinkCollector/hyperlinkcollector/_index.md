---
title: "HyperlinkCollector"
second_title: "Aspose.Page för Java API-referens"
description: "Klassen möjliggör insamling av hyperlänkade XPS‑element från den aktuella sidan i ett XPS‑dokument."
type: docs
weight: 10
url: /sv/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

Klassen möjliggör insamling av hyperlänkade XPS‑element från den aktuella sidan i ett XPS‑dokument.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Samlar XPS-element med hyperlänkar av en viss typ. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Samlar XPS-element med hyperlänkar av alla typer. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>collectHyperlinks(XpsDocument document, Class<T> cls) {#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--}
```
public static Collection<XpsHyperlinkElement> <T>collectHyperlinks(XpsDocument document, Class<T> cls)
```


Samlar XPS-element med hyperlänkar av en viss typ.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS-dokumentet. |
| cls | java.lang.Class<T> | Klassobjektet som motsvarar hyperlänkmåls-typen att filtrera bort. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Samlingen som innehåller hyperlänkade XPS-element.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Samlar XPS-element med hyperlänkar av alla typer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS-dokumentet. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Samlingen som innehåller hyperlänkade XPS-element.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

