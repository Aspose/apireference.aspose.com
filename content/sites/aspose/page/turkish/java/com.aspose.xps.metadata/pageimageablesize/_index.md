---
title: "PageImageableSize"
second_title: "Java için Aspose.Page API Referansı"
description: "Düzen ve renderleme için görüntülenmiş tuvali açıklar."
type: docs
weight: 99
url: /tr/java/com.aspose.xps.metadata/pageimageablesize/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Property](../../com.aspose.xps.metadata/property)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageImageableSize extends Property implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Düzen ve renderleme için görüntülenmiş tuvali açıklar. Bu, PageMediaSize ve PageOrientation temelinde raporlanacaktır. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageimageablesize
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [PageImageableSize(int width, int height)](#PageImageableSize-int-int-) | Yeni bir örnek oluşturur. |
| [PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)](#PageImageableSize-int-int-int-int-int-int-) | Yeni bir örnek oluşturur. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Elemanın adını alır. |
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


Yeni bir örnek oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
|  | width | int | Bir |

```
ImageableSizeWidth
```

özellik değeri. |
|  | height | int | Bir |

```
ImageableSizeHeight
```

özellik değeri. |

### PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight) {#PageImageableSize-int-int-int-int-int-int-}
```
public PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)
```


Yeni bir örnek oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
|  | width | int | Bir |

```
ImageableSizeWidth
```

özellik değeri. |
|  | height | int | Bir |

```
ImageableSizeHeight
```

özellik değeri. |
|  | originWidth | int | Bir |

```
ImageableArea
```

alt-özelliğin

```
OriginWidth
```

özellik değeri. |
|  | originHeight | int | Bir |

```
ImageableArea
```

alt-özelliğin

```
OriginHeight
```

özellik değeri. |
|  | extentWidth | int | Bir |

```
ImageableArea
```

alt-özelliğin

```
ExtentWidth
```

özellik değeri. |
|  | extentHeight | int | Bir |

```
ImageableArea
```

alt-özelliğin

```
ExtentHeight
```

özellik değeri. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
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


Elemanın adını alır.

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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

