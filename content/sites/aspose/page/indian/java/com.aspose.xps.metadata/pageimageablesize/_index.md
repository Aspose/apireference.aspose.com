---
title: "PageImageableSize"
second_title: "Aspose.Page for Java API संदर्भ"
description: "लेआउट और रेंडरिंग के लिए इमेज्ड कैनवास का वर्णन करता है।"
type: docs
weight: 99
url: /hi/java/com.aspose.xps.metadata/pageimageablesize/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Property](../../com.aspose.xps.metadata/property)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageImageableSize extends Property implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

लेआउट और रेंडरिंग के लिए इमेज्ड कैनवास का वर्णन करता है। यह PageMediaSize और PageOrientation के आधार पर रिपोर्ट किया जाएगा। https://docs.microsoft.com/en-us/windows/win32/printdocs/pageimageablesize
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PageImageableSize(int width, int height)](#PageImageableSize-int-int-) | एक नया इंस्टेंस बनाता है। |
| [PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)](#PageImageableSize-int-int-int-int-int-int-) | एक नया इंस्टेंस बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | एलिमेंट का नाम प्राप्त करता है। |
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


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
|  | चौड़ाई | int | एक |

```
ImageableSizeWidth
```

प्रॉपर्टी मान। |
|  | ऊँचाई | int | एक |

```
ImageableSizeHeight
```

प्रॉपर्टी मान। |

### PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight) {#PageImageableSize-int-int-int-int-int-int-}
```
public PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
|  | चौड़ाई | int | एक |

```
ImageableSizeWidth
```

प्रॉपर्टी मान। |
|  | ऊँचाई | int | एक |

```
ImageableSizeHeight
```

प्रॉपर्टी मान। |
|  | originWidth | int | एक |

```
ImageableArea
```

सब-प्रॉपर्टी का

```
OriginWidth
```

प्रॉपर्टी मान। |
|  | originHeight | int | एक |

```
ImageableArea
```

सब-प्रॉपर्टी का

```
OriginHeight
```

प्रॉपर्टी मान। |
|  | extentWidth | int | एक |

```
ImageableArea
```

सब-प्रॉपर्टी का

```
ExtentWidth
```

प्रॉपर्टी मान। |
|  | extentHeight | int | एक |

```
ImageableArea
```

सब-प्रॉपर्टी का

```
ExtentHeight
```

प्रॉपर्टी मान। |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
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


एलिमेंट का नाम प्राप्त करता है।

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
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

