---
title: PageImageableSize
second_title: Aspose.Page for Java API Reference
description: Describes the imaged canvas for layout and rendering.
type: docs
weight: 99
url: /java/com.aspose.xps.metadata/pageimageablesize/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Property](../../com.aspose.xps.metadata/property)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageImageableSize extends Property implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Describes the imaged canvas for layout and rendering. This will be reported based on  PageMediaSize  and  PageOrientation . https://docs.microsoft.com/en-us/windows/win32/printdocs/pageimageablesize
## Constructors

| Constructor | Description |
| --- | --- |
| [PageImageableSize(int width, int height)](#PageImageableSize-int-int-) | Creates a new instance. |
| [PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)](#PageImageableSize-int-int-int-int-int-int-) | Creates a new instance. |
### PageImageableSize(int width, int height) {#PageImageableSize-int-int-}
```
public PageImageableSize(int width, int height)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int | An

```java
ImageableSizeWidth
```

property value. |
| height | int | An

```java
ImageableSizeHeight
```

property value. |

### PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight) {#PageImageableSize-int-int-int-int-int-int-}
```
public PageImageableSize(int width, int height, int originWidth, int originHeight, int extentWidth, int extentHeight)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int | An

```java
ImageableSizeWidth
```

property value. |
| height | int | An

```java
ImageableSizeHeight
```

property value. |
| originWidth | int | An

```java
ImageableArea
```

sub-property's

```java
OriginWidth
```

property value. |
| originHeight | int | An

```java
ImageableArea
```

sub-property's

```java
OriginHeight
```

property value. |
| extentWidth | int | An

```java
ImageableArea
```

sub-property's

```java
ExtentWidth
```

property value. |
| extentHeight | int | An

```java
ImageableArea
```

sub-property's

```java
ExtentHeight
```

property value. |

