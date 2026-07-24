---
title: "PageImageableSize"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τον καμβά εικόνας για διάταξη και απόδοση."
type: docs
weight: 99
url: /el/java/com.aspose.xps.metadata/pageimageablesize/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Property](../../com.aspose.xps.metadata/property)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageImageableSize extends Property implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Περιγράφει τον καμβά εικόνας για διάταξη και απόδοση. Αυτό θα αναφερθεί με βάση τα PageMediaSize και PageOrientation. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageimageablesize
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PageImageableSize(int width, int height)](#PageImageableSize-int-int-) | Δημιουργεί μια νέα παρουσία. |
| [PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)](#PageImageableSize-int-int-int-int-int-int-) | Δημιουργεί μια νέα παρουσία. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Λαμβάνει το όνομα του στοιχείου. |
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


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
|  | width | int | Ένα |

```
ImageableSizeWidth
```

τιμή ιδιότητας. |
|  | height | int | Ένα |

```
ImageableSizeHeight
```

τιμή ιδιότητας. |

### PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight) {#PageImageableSize-int-int-int-int-int-int-}
```
public PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
|  | width | int | Ένα |

```
ImageableSizeWidth
```

τιμή ιδιότητας. |
|  | height | int | Ένα |

```
ImageableSizeHeight
```

τιμή ιδιότητας. |
|  | originWidth | int | Ένα |

```
ImageableArea
```

της υπο-ιδιότητας

```
OriginWidth
```

τιμή ιδιότητας. |
|  | originHeight | int | Ένα |

```
ImageableArea
```

της υπο-ιδιότητας

```
OriginHeight
```

τιμή ιδιότητας. |
|  | extentWidth | int | Ένα |

```
ImageableArea
```

της υπο-ιδιότητας

```
ExtentWidth
```

τιμή ιδιότητας. |
|  | extentHeight | int | Ένα |

```
ImageableArea
```

της υπο-ιδιότητας

```
ExtentHeight
```

τιμή ιδιότητας. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
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


Λαμβάνει το όνομα του στοιχείου.

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
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

