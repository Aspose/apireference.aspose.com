---
title: "PageImageableSize"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt die bildliche Leinwand für Layout und Rendering."
type: docs
weight: 99
url: /de/java/com.aspose.xps.metadata/pageimageablesize/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Property](../../com.aspose.xps.metadata/property)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageImageableSize extends Property implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Beschreibt die abgebildete Zeichenfläche für Layout und Rendering. Diese wird basierend auf PageMediaSize und PageOrientation gemeldet. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageimageablesize
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PageImageableSize(int width, int height)](#PageImageableSize-int-int-) | Erstellt eine neue Instanz. |
| [PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)](#PageImageableSize-int-int-int-int-int-int-) | Erstellt eine neue Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ermittelt den Elementnamen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageImageableSize(int width, int height) {#PageImageableSize-int-int-}
```
public PageImageableSize(int width, int height)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Breite | int | Ein |

```
ImageableSizeWidth
```

Eigenschaftswert. |
|  | Höhe | int | Ein |

```
ImageableSizeHeight
```

Eigenschaftswert. |

### PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight) {#PageImageableSize-int-int-int-int-int-int-}
```
public PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Breite | int | Ein |

```
ImageableSizeWidth
```

Eigenschaftswert. |
|  | Höhe | int | Ein |

```
ImageableSizeHeight
```

Eigenschaftswert. |
|  | originWidth | int | Ein |

```
ImageableArea
```

Unter‑Propertys

```
OriginWidth
```

Eigenschaftswert. |
|  | originHeight | int | Ein |

```
ImageableArea
```

Unter‑Propertys

```
OriginHeight
```

Eigenschaftswert. |
|  | extentWidth | int | Ein |

```
ImageableArea
```

Unter‑Propertys

```
ExtentWidth
```

Eigenschaftswert. |
|  | extentHeight | int | Ein |

```
ImageableArea
```

Unter‑Propertys

```
ExtentHeight
```

Eigenschaftswert. |

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
### getName() {#getName--}
```
public String getName()
```


Ermittelt den Elementnamen.

**Returns:**
java.lang.String
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

