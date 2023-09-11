---
title: Bitmap.Bitmap
second_title: Aspose.Drawing for .NET API Reference
description: Bitmap constructor. Initializes a new instance of the Bitmap class with the specified size
type: docs
weight: 10
url: /net/aspose.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor_3}

Initializes a new instance of the [`Bitmap`](../) class with the specified size.

```csharp
public Bitmap(int width, int height)
```

| Parameter | Type | Description |
| --- | --- | --- |
| width | Int32 | The width, in pixels, of the new Bitmap. |
| height | Int32 | The height, in pixels, of the new Bitmap. |

## Remarks

The only supported internal bitmap format at the moment is equivalent to `PixelFormat.Format32bppPArgb`.

### See Also

* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Bitmap(string) {#constructor_8}

Initializes a new instance of the [`Bitmap`](../) class from the specified file.

```csharp
public Bitmap(string filename)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | The name of the bitmap file. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Initializes a new instance of the [`Bitmap`](../) class from the specified file.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | The name of the bitmap file. |
| useIcm | Boolean | true to use color correction for this Bitmap; otherwise, false. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Bitmap(Stream) {#constructor_6}

Initializes a new instance of the [`Bitmap`](../) class from the specified data stream.

```csharp
public Bitmap(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The data stream used to load the image. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Initializes a new instance of the [`Bitmap`](../) class from the specified data stream.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The data stream used to load the image. |
| useIcm | Boolean | `true` to use color correction for this Bitmap; otherwise, `false`. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_4}

Initializes a new instance of the [`Bitmap`](../) class with the specified size and format.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| width | Int32 | The width, in pixels, of the new Bitmap. |
| height | Int32 | The height, in pixels, of the new Bitmap. |
| format | PixelFormat | The PixelFormat enumeration for the new Bitmap. |

### See Also

* enum [PixelFormat](../../../aspose.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_5}

Initializes a new instance of the [`Bitmap`](../) class with the specified size and pixel data.

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

* enum [PixelFormat](../../../aspose.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Bitmap(Image) {#constructor}

Initializes a new instance of the [`Bitmap`](../) class from the specified existing image.

```csharp
public Bitmap(Image original)
```

| Parameter | Type | Description |
| --- | --- | --- |
| original | Image | The Image from which to create the new Bitmap. |

### See Also

* class [Image](../../image/)
* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Bitmap(Image, Size) {#constructor_1}

Initializes a new instance of the [`Bitmap`](../) class from the specified existing image, scaled to the specified size.

```csharp
public Bitmap(Image original, Size newSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| original | Image | The Image from which to create the new Bitmap |
| newSize | Size | The Size structure that represent the size of the new Bitmap. |

### See Also

* class [Image](../../image/)
* struct [Size](../../size/)
* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Bitmap(Image, int, int) {#constructor_2}

Initializes a new instance of the [`Bitmap`](../) class from the specified existing image, scaled to the specified size.

```csharp
public Bitmap(Image original, int width, int height)
```

| Parameter | Type | Description |
| --- | --- | --- |
| original | Image | The Image from which to create the new Bitmap. |
| width | Int32 | The width, in pixels, of the new Bitmap. |
| height | Int32 | The height, in pixels, of the new Bitmap. |

### See Also

* class [Image](../../image/)
* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)


