---
title: "PageImageableSize"
second_title: "Aspose.Page용 Java API 참조"
description: "레이아웃 및 렌더링을 위한 이미지 캔버스를 설명합니다."
type: docs
weight: 99
url: /ko/java/com.aspose.xps.metadata/pageimageablesize/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Property](../../com.aspose.xps.metadata/property)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageImageableSize extends Property implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

레이아웃 및 렌더링을 위한 이미지 캔버스를 설명합니다. 이는  PageMediaSize  및  PageOrientation  에 따라 보고됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageimageablesize
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [PageImageableSize(int width, int height)](#PageImageableSize-int-int-) | 새 인스턴스를 생성합니다. |
| [PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)](#PageImageableSize-int-int-int-int-int-int-) | 새 인스턴스를 생성합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 요소 이름을 가져옵니다. |
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


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
|  | 너비 | int | 하나 |

```
ImageableSizeWidth
```

속성 값. |
|  | 높이 | int | 하나 |

```
ImageableSizeHeight
```

속성 값. |

### PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight) {#PageImageableSize-int-int-int-int-int-int-}
```
public PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
|  | 너비 | int | 하나 |

```
ImageableSizeWidth
```

속성 값. |
|  | 높이 | int | 하나 |

```
ImageableSizeHeight
```

속성 값. |
|  | originWidth | int | 하나 |

```
ImageableArea
```

하위 속성의

```
OriginWidth
```

속성 값. |
|  | originHeight | int | 하나 |

```
ImageableArea
```

하위 속성의

```
OriginHeight
```

속성 값. |
|  | extentWidth | int | 하나 |

```
ImageableArea
```

하위 속성의

```
ExtentWidth
```

속성 값. |
|  | extentHeight | int | 하나 |

```
ImageableArea
```

하위 속성의

```
ExtentHeight
```

속성 값. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
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


요소 이름을 가져옵니다.

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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

