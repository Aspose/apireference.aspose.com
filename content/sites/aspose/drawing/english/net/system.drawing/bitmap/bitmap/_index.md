---
title: Bitmap
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 10
url: /net/system.drawing/bitmap/bitmap/
---
## Bitmap constructor (1 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class with the specified size.

```csharp
public Bitmap(int width, int height)
```

| Parameter | Type | Description |
| --- | --- | --- |
| width | Int32 | The width, in pixels, of the new Bitmap. |
| height | Int32 | The height, in pixels, of the new Bitmap. |

### Remarks

The only supported internal bitmap format at the moment is equivalent to `PixelFormat.Format32bppPArgb`.

### See Also

* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

---

## Bitmap constructor (2 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class from the specified file.

```csharp
public Bitmap(string filename)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | The name of the bitmap file. |

### See Also

* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

---

## Bitmap constructor (3 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class from the specified file.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | The name of the bitmap file. |
| useIcm | Boolean | true to use color correction for this Bitmap; otherwise, false. |

### See Also

* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

---

## Bitmap constructor (4 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class from the specified data stream.

```csharp
public Bitmap(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The data stream used to load the image. |

### See Also

* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

---

## Bitmap constructor (5 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class from the specified data stream.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The data stream used to load the image. |
| useIcm | Boolean | `true` to use color correction for this Bitmap; otherwise, `false`. |

### See Also

* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

---

## Bitmap constructor (6 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class with the specified size and format.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| width | Int32 | The width, in pixels, of the new Bitmap. |
| height | Int32 | The height, in pixels, of the new Bitmap. |
| format | PixelFormat | The PixelFormat enumeration for the new Bitmap. |

### See Also

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

---

## Bitmap constructor (7 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class with the specified size and pixel data.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Parameter | Type | Description |
| --- | --- | --- |
| width | Int32 | The width, in pixels, of the new Bitmap. |
| height | Int32 | The height, in pixels, of the new Bitmap. |
| stride | Int32 | The byte offset between the beginning of one scan line and the next, must be a multiple of four. |
| format | PixelFormat | The PixelFormat enumeration for the new Bitmap. |
| data | Int32[] | The pixel data. |

### See Also

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

---

## Bitmap constructor (8 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class from the specified existing image.

```csharp
public Bitmap(Image original)
```

| Parameter | Type | Description |
| --- | --- | --- |
| original | Image | The Image from which to create the new Bitmap. |

### See Also

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

---

## Bitmap constructor (9 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class from the specified existing image, scaled to the specified size.

```csharp
public Bitmap(Image original, Size newSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| original | Image | The Image from which to create the new Bitmap |
| newSize | Size | The Size structure that represent the size of the new Bitmap. |

### See Also

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

---

## Bitmap constructor (10 of 10)

Initializes a new instance of the [`Bitmap`](../../bitmap) class from the specified existing image, scaled to the specified size.

```csharp
public Bitmap(Image original, int width, int height)
```

| Parameter | Type | Description |
| --- | --- | --- |
| original | Image | The Image from which to create the new Bitmap. |
| width | Int32 | The width, in pixels, of the new Bitmap. |
| height | Int32 | The height, in pixels, of the new Bitmap. |

### See Also

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* namespace [System.Drawing](../../bitmap)
* assembly [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
