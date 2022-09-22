---
title: EnumerateMetafile
second_title: Aspose.Drawing for .NET API 参考
description: 发送指定的记录Metafilesystem.drawing.imaging/metafile一次一个到回调方法 用于使用指定的图像属性在指定点显示
type: docs
weight: 460
url: /zh/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，到回调方法 ，用于使用指定的图像属性在指定点显示。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | PointF | [`PointF`](../../pointf)结构，它指定绘制的图元文件左上角的位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | PointF | [`PointF`](../../pointf)结构，它指定绘制的图元文件左上角的位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | PointF[] | 三个数组[`PointF`](../../pointf)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | Point | [`Point`](../../point)结构，它指定绘制的图元文件左上角的位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | Point | [`Point`](../../point)结构，它指定绘制的图元文件左上角的位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，使用指定图像属性在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | Point | [`Point`](../../point)结构，它指定绘制的图元文件左上角的位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef)指定绘制的图元文件的位置和大小的结构。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef)指定绘制的图元文件的位置和大小的结构。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，用于使用指定的图像属性在指定的矩形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef)指定绘制的图元文件的位置和大小的结构。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle)指定绘制的图元文件的位置和大小的结构。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | PointF | [`PointF`](../../pointf)结构，它指定绘制的图元文件左上角的位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | PointF[] | 三个数组[`PointF`](../../pointf)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | Point[] | 三个数组[`Point`](../../point)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | Point[] | 三个数组[`Point`](../../point)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于使用指定图像属性在指定平行四边形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | Point[] | 三个数组[`Point`](../../point)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| unit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | Point[] | 三个数组[`Point`](../../point)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | Point[] | 三个数组[`Point`](../../point)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于使用指定图像属性在指定平行四边形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | PointF[] | 三个数组[`PointF`](../../pointf)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| unit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | PointF[] | 三个数组[`PointF`](../../pointf)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

从 S 发送选定矩形中的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | PointF[] | 三个数组[`PointF`](../../pointf)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

从[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，用于使用指定的图像属性在指定的矩形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle)指定绘制的图元文件的位置和大小的结构。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| unit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

从[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle)指定绘制的图元文件的位置和大小的结构。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

从[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle)指定绘制的图元文件的位置和大小的结构。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于使用指定图像属性在指定平行四边形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | PointF[] | 三个数组[`PointF`](../../pointf)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

从[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，用于使用指定的图像属性在指定的矩形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef)指定绘制的图元文件的位置和大小的结构。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| unit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

从[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef)指定绘制的图元文件的位置和大小的结构。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，使用指定图像属性在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | Point | [`Point`](../../point)结构，它指定绘制的图元文件左上角的位置。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| unit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | Point | [`Point`](../../point)结构，它指定绘制的图元文件左上角的位置。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | Point | [`Point`](../../point)结构，它指定绘制的图元文件左上角的位置。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | Rectangle | [`RectangleF`](../../rectanglef)指定绘制的图元文件的位置和大小的结构。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，使用指定图像属性在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | PointF | [`PointF`](../../pointf)结构，它指定绘制的图元文件左上角的位置。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| unit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | PointF | [`PointF`](../../pointf)结构，它指定绘制的图元文件左上角的位置。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

从一个选定的矩形中发送记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoint | PointF | [`PointF`](../../pointf)结构，它指定绘制的图元文件左上角的位置。 |
| srcRect | RectangleF | System.Drawing.RectangleF 结构，指定要绘制的元文件相对于其左上角的部分。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于使用指定图像属性在指定平行四边形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destPoints | Point[] | 三个数组[`Point`](../../point)定义平行四边形的结构，该平行四边形确定绘制的图元文件的大小和位置。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

从[`Metafile`](../../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef)指定绘制的图元文件的位置和大小的结构。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef)指定要绘制的相对于其左上角的图元文件部分的结构。 |
| srcUnit | GraphicsUnit | 成员[`GraphicsUnit`](../../graphicsunit)枚举，它指定用于确定元文件部分的度量单位，该部分由*srcRect*参数包含。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

发送指定的记录[`Metafile`](../../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，用于使用指定的图像属性在指定的矩形中显示。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile)列举。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle)指定绘制的图元文件的位置和大小的结构。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc)指定元文件记录发送到的方法的委托。 |
| callbackData | IntPtr | 需要但被忽略的内部指针。你可以通过Zero对于这个参数。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes)指定绘制图像的图像属性信息。 |

### 也可以看看

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
