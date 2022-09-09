---
title: IInteractiveDevice
second_title: Aspose.Page for Java API Reference
description: The interface defining interactive features processing methods.
type: docs
weight: 20
url: /java/com.aspose.page/iinteractivedevice/
---```
public interface IInteractiveDevice
```

The interface defining interactive features processing methods.
## Methods

| Method | Description |
| --- | --- |
| [setHyperlinkTarget(String targetUri)](#setHyperlinkTarget-java.lang.String-) | Set the hyperlink with an external URI as its target. |
| [setHyperlinkTarget(int targetPageNumber)](#setHyperlinkTarget-int-) | Set the hyperlink with a page number as its target. |
| [addOutline(int outlineLevel, String description)](#addOutline-int-java.lang.String-) | Adds an outline item with the last object as its target. |
| [addOutline(Point2D origin, int outlineLevel, String description)](#addOutline-java.awt.geom.Point2D-int-java.lang.String-) | Adds an outline item with the origin point as its target. |
### setHyperlinkTarget(String targetUri) {#setHyperlinkTarget-java.lang.String-}
```
public abstract void setHyperlinkTarget(String targetUri)
```


Set the hyperlink with an external URI as its target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| targetUri | java.lang.String | The target external URI. |

### setHyperlinkTarget(int targetPageNumber) {#setHyperlinkTarget-int-}
```
public abstract void setHyperlinkTarget(int targetPageNumber)
```


Set the hyperlink with a page number as its target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| targetPageNumber | int | The target page number. |

### addOutline(int outlineLevel, String description) {#addOutline-int-java.lang.String-}
```
public abstract void addOutline(int outlineLevel, String description)
```


Adds an outline item with the last object as its target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| outlineLevel | int | The outline level. |
| description | java.lang.String | The item description. |

### addOutline(Point2D origin, int outlineLevel, String description) {#addOutline-java.awt.geom.Point2D-int-java.lang.String-}
```
public abstract void addOutline(Point2D origin, int outlineLevel, String description)
```


Adds an outline item with the origin point as its target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| origin | java.awt.geom.Point2D | The target origin. |
| outlineLevel | int | The outline level. |
| description | java.lang.String | The item description. |

