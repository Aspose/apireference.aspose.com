---
title: Bitmap.Bitmap
second_title: Aspose.Page for .NET API Reference
description: Bitmap constructor. Initializes a new instance of the Bitmap class from the specified file
type: docs
weight: 10
url: /net/aspose.page.drawing/bitmap/bitmap/
---
## Bitmap(string) {#constructor_7}

Initializes a new instance of the [`Bitmap`](../) class from the specified file.

```csharp
public Bitmap(string filename)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | The name of the bitmap file. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Bitmap(string, bool) {#constructor_8}

Initializes a new instance of the [`Bitmap`](../) class from the specified file.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | The name of the bitmap file. |
| useIcm | Boolean | true to use color correction for this [`Bitmap`](../); otherwise, false. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Bitmap(Stream) {#constructor_5}

Initializes a new instance of the [`Bitmap`](../) class from the specified data stream.

```csharp
public Bitmap(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The data stream used to load the image. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | *stream* does not contain image data or is null.-or-*stream* contains a PNG image file with a single dimension greater than 65,535 pixels. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Bitmap(Stream, bool) {#constructor_6}

Initializes a new instance of the [`Bitmap`](../) class from the specified data stream.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The data stream used to load the image. |
| useIcm | Boolean | true to use color correction for this [`Bitmap`](../); otherwise, false. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | *stream* does not contain image data or is null.-or-*stream* contains a PNG image file with a single dimension greater than 65,535 pixels. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_4}

Initializes a new instance of the [`Bitmap`](../) class with the specified size and format.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| width | Int32 | The width, in pixels, of the new [`Bitmap`](../). |
| height | Int32 | The height, in pixels, of the new [`Bitmap`](../). |
| format | PixelFormat | The [`PixelFormat`](../../../aspose.page.drawing.imaging/pixelformat/) enumeration for the new [`Bitmap`](../). |

### See Also

* enum [PixelFormat](../../../aspose.page.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Bitmap(int, int) {#constructor_3}

Initializes a new instance of the [`Bitmap`](../) class with the specified size.

```csharp
public Bitmap(int width, int height)
```

| Parameter | Type | Description |
| --- | --- | --- |
| width | Int32 | The width, in pixels, of the new [`Bitmap`](../). |
| height | Int32 | The height, in pixels, of the new [`Bitmap`](../). |

### Exceptions

| exception | condition |
| --- | --- |
| Exception | The operation failed. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Bitmap(Bitmap) {#constructor}

Initializes a new instance of the [`Bitmap`](../) class from the specified existing image.

```csharp
public Bitmap(Bitmap original)
```

| Parameter | Type | Description |
| --- | --- | --- |
| original | Bitmap | The Image from which to create the new [`Bitmap`](../). |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Bitmap(Bitmap, int, int) {#constructor_2}

Initializes a new instance of the [`Bitmap`](../) class from the specified existing image, scaled to the specified size.

```csharp
public Bitmap(Bitmap original, int width, int height)
```

| Parameter | Type | Description |
| --- | --- | --- |
| original | Bitmap | The Image from which to create the new [`Bitmap`](../). |
| width | Int32 | The width, in pixels, of the new [`Bitmap`](../). |
| height | Int32 | The height, in pixels, of the new [`Bitmap`](../). |

### Exceptions

| exception | condition |
| --- | --- |
| Exception | The operation failed. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Bitmap(Bitmap, Size) {#constructor_1}

Initializes a new instance of the [`Bitmap`](../) class from the specified existing image, scaled to the specified size.

```csharp
public Bitmap(Bitmap original, Size newSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| original | Bitmap | The Image from which to create the new [`Bitmap`](../). |
| newSize | Size | The [`Size`](../../size/) structure that represent the size of the new [`Bitmap`](../). |

### Exceptions

| exception | condition |
| --- | --- |
| Exception | The operation failed. |

### See Also

* struct [Size](../../size/)
* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)


