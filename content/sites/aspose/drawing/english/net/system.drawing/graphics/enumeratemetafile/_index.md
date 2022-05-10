---
title: EnumerateMetafile
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 460
url: /net/system.drawing/graphics/enumeratemetafile/
---
## Graphics.EnumerateMetafile method (1 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | PointF | PointF structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (2 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | PointF | PointF structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (3 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | PointF[] | Array of three PointF structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (4 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | Point | Point structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (5 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | Point | Point structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (6 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | Point | Point structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (7 of 36)

Sends the records of the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | RectangleF | RectangleF structure that specifies the location and size of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (8 of 36)

Sends the records of the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | RectangleF | RectangleF structure that specifies the location and size of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (9 of 36)

Sends the records of the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | RectangleF | RectangleF structure that specifies the location and size of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (10 of 36)

Sends the records of the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | Rectangle | Rectangle structure that specifies the location and size of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (11 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | PointF | PointF structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (12 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | PointF[] | Array of three PointF structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (13 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | Point[] | Array of three Point structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (14 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | Point[] | Array of three Point structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (15 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | Point[] | Array of three Point structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | Rectangle | Rectangle structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (16 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | Point[] | Array of three Point structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | Rectangle | Rectangle structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (17 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | Point[] | Array of three Point structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | Rectangle | Rectangle structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (18 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | PointF[] | Array of three PointF structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | RectangleF | RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (19 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | PointF[] | Array of three PointF structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | RectangleF | RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (20 of 36)

Sends the records in a selected rectangle from a S[`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | PointF[] | Array of three PointF structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | RectangleF | RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (21 of 36)

Sends the records of a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | Rectangle | Rectangle structure that specifies the location and size of the drawn metafile. |
| srcRect | Rectangle | Rectangle structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (22 of 36)

Sends the records of a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | Rectangle | Rectangle structure that specifies the location and size of the drawn metafile. |
| srcRect | Rectangle | Rectangle structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (23 of 36)

Sends the records of a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | Rectangle | Rectangle structure that specifies the location and size of the drawn metafile. |
| srcRect | Rectangle | Rectangle structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (24 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | PointF[] | Array of three PointF structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (25 of 36)

Sends the records of a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | RectangleF | RectangleF structure that specifies the location and size of the drawn metafile. |
| srcRect | RectangleF | RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (26 of 36)

Sends the records of a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | RectangleF | RectangleF structure that specifies the location and size of the drawn metafile. |
| srcRect | RectangleF | RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (27 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | Point | Point structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | Rectangle | Rectangle structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (28 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | Point | Point structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | Rectangle | Rectangle structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (29 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | Point | Point structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | Rectangle | Rectangle structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (30 of 36)

Sends the records of the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | Rectangle | RectangleF structure that specifies the location and size of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (31 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | PointF | PointF structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | RectangleF | RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (32 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | PointF | PointF structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | RectangleF | RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (33 of 36)

Sends the records in a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoint | PointF | PointF structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | RectangleF | System.Drawing.RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the[`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (34 of 36)

Sends the records in the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destPoints | Point[] | Array of three Point structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (35 of 36)

Sends the records of a selected rectangle from a [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | RectangleF | RectangleF structure that specifies the location and size of the drawn metafile. |
| srcRect | RectangleF | RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | GraphicsUnit | Member of the [`GraphicsUnit`](../../graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the *srcRect* parameter contains. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.EnumerateMetafile method (36 of 36)

Sends the records of the specified [`Metafile`](../../../system.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) to enumerate. |
| destRect | Rectangle | Rectangle structure that specifies the location and size of the drawn metafile. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegate that specifies the method to which the metafile records are sent. |
| callbackData | IntPtr | Internal pointer that is required, but ignored. You can pass Zero for this parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### See Also

* class [Metafile](../../../system.drawing.imaging/metafile)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
