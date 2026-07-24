---
title: "PageImageableSize"
second_title: "Aspose.Page for Java API リファレンス"
description: "レイアウトとレンダリングのためのイメージ化されたキャンバスを説明します。"
type: docs
weight: 99
url: /ja/java/com.aspose.xps.metadata/pageimageablesize/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Property](../../com.aspose.xps.metadata/property)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageImageableSize extends Property implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

レイアウトとレンダリングのためのイメージ化されたキャンバスを説明します。これは PageMediaSize と PageOrientation に基づいて報告されます。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageimageablesize
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PageImageableSize(int width, int height)](#PageImageableSize-int-int-) | 新しいインスタンスを作成します。 |
| [PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)](#PageImageableSize-int-int-int-int-int-int-) | 新しいインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 要素名を取得します。 |
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


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
|  | width | int | ある |

```
ImageableSizeWidth
```

プロパティ値。 |
|  | height | int | ある |

```
ImageableSizeHeight
```

プロパティ値。 |

### PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight) {#PageImageableSize-int-int-int-int-int-int-}
```
public PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
|  | width | int | ある |

```
ImageableSizeWidth
```

プロパティ値。 |
|  | height | int | ある |

```
ImageableSizeHeight
```

プロパティ値。 |
|  | originWidth | int | ある |

```
ImageableArea
```

サブプロパティの

```
OriginWidth
```

プロパティ値。 |
|  | originHeight | int | ある |

```
ImageableArea
```

サブプロパティの

```
OriginHeight
```

プロパティ値。 |
|  | extentWidth | int | ある |

```
ImageableArea
```

サブプロパティの

```
ExtentWidth
```

プロパティ値。 |
|  | extentHeight | int | ある |

```
ImageableArea
```

サブプロパティの

```
ExtentHeight
```

プロパティ値。 |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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


要素名を取得します。

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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

