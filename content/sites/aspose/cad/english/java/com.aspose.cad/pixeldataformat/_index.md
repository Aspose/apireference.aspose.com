---
title: "PixelDataFormat"
linktitle: "PixelDataFormat"
second_title: "Aspose.CAD for Java"
description: "The pixel data format."
type: docs
weight: 10
url: /java/com.aspose.cad/pixeldataformat/
---

The pixel data format.

## Methods

| Method | Description |
| --- | --- |
| [getRgb32Bpp()](#getRgb32Bpp) | Gets the PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the alpha, red, green and blue. |
| [getCmyk()](#getCmyk) | Gets the PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the cyan, magenta, yellow and black. |
| [getRgb24Bpp()](#getRgb24Bpp) | Gets the PixelDataFormat defined for 24 bits per pixel with 8 bits for each of the alpha, red, green and blue, alpha is not defined. |
| [getRgb16Bpp555()](#getRgb16Bpp555) | Gets the PixelDataFormat defined for 16 bits per pixel with 5 bits for each of the red, green and blue, alpha is not defined. |
| [getRgbIndexed8Bpp()](#getRgbIndexed8Bpp) | Gets the PixelDataFormat defined for indexed 8 bit per color. The indexed pixel data storage is intended to allow data storage and retrieval everywhere the color palette is used. Use with caution, because may require conversion from one palette to another or from RGBA to indexed color model. |
| [getRgbIndexed4Bpp()](#getRgbIndexed4Bpp) | Gets the PixelDataFormat defined for indexed 4 bit per color. The indexed pixel data storage is intended to allow data storage and retrieval everywhere the color palette is used. Use with caution, because may require conversion from one palette to another or from RGBA to indexed color model. |
| [getRgbIndexed2Bpp()](#getRgbIndexed2Bpp) | Gets the PixelDataFormat defined for indexed 2 bit per color. The indexed pixel data storage is intended to allow data storage and retrieval everywhere the color palette is used. Use with caution, because may require conversion from one palette to another or from RGBA to indexed color model. |
| [getRgbIndexed1Bpp()](#getRgbIndexed1Bpp) | Gets the PixelDataFormat defined for indexed 1 bit per color. The indexed pixel data storage is intended to allow data storage and retrieval everywhere the color palette is used. Use with caution, because may require conversion from one palette to another or from RGBA to indexed color model. |
| [getYCbCr()](#getYCbCr) | Gets the PixelDataFormat defined for 24 bits per pixel with 8 bits for each of the luma, blue-difference and red-difference chroma components. |
| [getGrayscale()](#getGrayscale) | Gets the PixelDataFormat defined for 8 bits per pixel with 8 bits representing grayscale intensity in the 0-255 interval. |
| [getYcck()](#getYcck) | Gets the PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the luma, blue-difference, red-difference and black chroma components. |
| [getRgba32Bpp()](#getRgba32Bpp) | Gets the PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the alpha, red, green and blue. |
| [getRgb24BppPng()](#getRgb24BppPng) | Gets the PixelDataFormat defined for 24 bits per pixel with 8 bits for each of the alpha, red, green and blue, alpha is not defined. |
| [getGrayscaleAlpha()](#getGrayscaleAlpha) | Gets the PixelDataFormat defined for 16 bits per pixel with 8 bits representing grayscale intensity in the 0-255 interval and additional 8 bit alpha component. |
| [getPixelFormat()](#getPixelFormat) | Gets the pixel format. |
| [getBitsPerPixel()](#getBitsPerPixel) | Gets the bits per pixel. |
| [getChannelsCount()](#getChannelsCount) | Gets the channels count. |
| [getChannelBits()](#getChannelBits) | Gets the bits count for each channel. |
| [op_Inequality(PixelDataFormat pixelFormat1, PixelDataFormat pixelFormat2)](#op_Inequality-com.aspose.cad.PixelDataFormat-com.aspose.cad.PixelDataFormat) | Returns result of non-equality for two PixelDataFormat classes. |
| [op_Equality(PixelDataFormat pixelFormat1, PixelDataFormat pixelFormat2)](#op_Equality-com.aspose.cad.PixelDataFormat-com.aspose.cad.PixelDataFormat) | Returns result of equality for two PixelDataFormat classes. |
| [equals(Object obj)](#equals-java.lang.Object) | Determines whether the specified System.Object is equal to this instance. |
| [hashCode()](#hashCode) | Returns a hash code for this instance. |
| [toString()](#toString) | Returns a System.String that represents this instance. |

### getRgb32Bpp() {#getRgb32Bpp}
```java
public static PixelDataFormat getRgb32Bpp()
```

Gets the PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the alpha, red, green and blue.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the alpha, red, green and blue.

### getCmyk() {#getCmyk}
```java
public static PixelDataFormat getCmyk()
```

Gets the PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the cyan, magenta, yellow and black.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the cyan, magenta, yellow and black.

### getRgb24Bpp() {#getRgb24Bpp}
```java
public static PixelDataFormat getRgb24Bpp()
```

Gets the PixelDataFormat defined for 24 bits per pixel with 8 bits for each of the alpha, red, green and blue, alpha is not defined.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 24 bits per pixel with 8 bits for each of the alpha, red, green and blue, alpha is not defined.

### getRgb16Bpp555() {#getRgb16Bpp555}
```java
public static PixelDataFormat getRgb16Bpp555()
```

Gets the PixelDataFormat defined for 16 bits per pixel with 5 bits for each of the red, green and blue, alpha is not defined.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 16 bits per pixel with 5 bits for each of the red, green and blue, alpha is not defined.

### getRgbIndexed8Bpp() {#getRgbIndexed8Bpp}
```java
public static PixelDataFormat getRgbIndexed8Bpp()
```

Gets the PixelDataFormat defined for indexed 8 bit per color. The indexed pixel data storage is intended to allow data storage and retrieval everywhere the color palette is used. Use with caution, because may require conversion from one palette to another or from RGBA to indexed color model.

**Returns:** PixelDataFormat - The PixelDataFormat defined for indexed 8 bit per color.

### getRgbIndexed4Bpp() {#getRgbIndexed4Bpp}
```java
public static PixelDataFormat getRgbIndexed4Bpp()
```

Gets the PixelDataFormat defined for indexed 4 bit per color. The indexed pixel data storage is intended to allow data storage and retrieval everywhere the color palette is used. Use with caution, because may require conversion from one palette to another or from RGBA to indexed color model.

**Returns:** PixelDataFormat - The PixelDataFormat defined for indexed 4 bit per color.

### getRgbIndexed2Bpp() {#getRgbIndexed2Bpp}
```java
public static PixelDataFormat getRgbIndexed2Bpp()
```

Gets the PixelDataFormat defined for indexed 2 bit per color. The indexed pixel data storage is intended to allow data storage and retrieval everywhere the color palette is used. Use with caution, because may require conversion from one palette to another or from RGBA to indexed color model.

**Returns:** PixelDataFormat - The PixelDataFormat defined for indexed 2 bit per color.

### getRgbIndexed1Bpp() {#getRgbIndexed1Bpp}
```java
public static PixelDataFormat getRgbIndexed1Bpp()
```

Gets the PixelDataFormat defined for indexed 1 bit per color. The indexed pixel data storage is intended to allow data storage and retrieval everywhere the color palette is used. Use with caution, because may require conversion from one palette to another or from RGBA to indexed color model.

**Returns:** PixelDataFormat - The PixelDataFormat defined for indexed 1 bit per color.

### getYCbCr() {#getYCbCr}
```java
public static PixelDataFormat getYCbCr()
```

Gets the PixelDataFormat defined for 24 bits per pixel with 8 bits for each of the luma, blue-difference and red-difference chroma components.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 24 bits per pixel with 8 bits for each of the luma, blue-difference and red-difference chroma components.

### getGrayscale() {#getGrayscale}
```java
public static PixelDataFormat getGrayscale()
```

Gets the PixelDataFormat defined for 8 bits per pixel with 8 bits representing grayscale intensity in the 0-255 interval.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 8 bits per pixel with 8 bits representing grayscale intensity in the 0-255 interval.

### getYcck() {#getYcck}
```java
public static PixelDataFormat getYcck()
```

Gets the PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the luma, blue-difference, red-difference and black chroma components.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the luma, blue-difference, red-difference and black chroma components.

### getRgba32Bpp() {#getRgba32Bpp}
```java
public static PixelDataFormat getRgba32Bpp()
```

Gets the PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the alpha, red, green and blue.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 32 bits per pixel with 8 bits for each of the alpha, red, green and blue.

### getRgb24BppPng() {#getRgb24BppPng}
```java
public static PixelDataFormat getRgb24BppPng()
```

Gets the PixelDataFormat defined for 24 bits per pixel with 8 bits for each of the alpha, red, green and blue, alpha is not defined.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 24 bits per pixel with 8 bits for each of the alpha, red, green and blue, alpha is not defined.

### getGrayscaleAlpha() {#getGrayscaleAlpha}
```java
public static PixelDataFormat getGrayscaleAlpha()
```

Gets the PixelDataFormat defined for 16 bits per pixel with 8 bits representing grayscale intensity in the 0-255 interval and additional 8 bit alpha component.

**Returns:** PixelDataFormat - The PixelDataFormat defined for 16 bits per pixel with 8 bits representing grayscale intensity in the 0-255 interval and additional 8 bit alpha component.

### getPixelFormat() {#getPixelFormat}
```java
public long getPixelFormat()
```

Gets the pixel format.

**Returns:** long - The pixel format.

### getBitsPerPixel() {#getBitsPerPixel}
```java
public int getBitsPerPixel()
```

Gets the bits per pixel.

**Returns:** int - The bits per pixel.

### getChannelsCount() {#getChannelsCount}
```java
public int getChannelsCount()
```

Gets the channels count.

**Returns:** int - The channels count.

### getChannelBits() {#getChannelBits}
```java
public int[] getChannelBits()
```

Gets the bits count for each channel.

**Returns:** int[] - The channel bits.

### op_Inequality(PixelDataFormat pixelFormat1, PixelDataFormat pixelFormat2) {#op_Inequality-com.aspose.cad.PixelDataFormat-com.aspose.cad.PixelDataFormat}
```java
public static boolean op_Inequality(PixelDataFormat pixelFormat1, PixelDataFormat pixelFormat2)
```

Returns result of non-equality for two PixelDataFormat classes.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pixelFormat1 | PixelDataFormat | The first PixelDataFormat to compare. |
| pixelFormat2 | PixelDataFormat | The second PixelDataFormat to compare. |

**Returns:** boolean - True if both pixelFormat1 and pixelFormat2 contain non-equal data or one of the parameters is null.

### op_Equality(PixelDataFormat pixelFormat1, PixelDataFormat pixelFormat2) {#op_Equality-com.aspose.cad.PixelDataFormat-com.aspose.cad.PixelDataFormat}
```java
public static boolean op_Equality(PixelDataFormat pixelFormat1, PixelDataFormat pixelFormat2)
```

Returns result of equality for two PixelDataFormat classes.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pixelFormat1 | PixelDataFormat | The first PixelDataFormat to compare. |
| pixelFormat2 | PixelDataFormat | The second PixelDataFormat to compare. |

**Returns:** boolean - True if both pixelFormat1 and pixelFormat2 contain equal data or both parameters are null.

### equals(Object obj) {#equals-java.lang.Object}
```java
public boolean equals(Object obj)
```

Determines whether the specified System.Object is equal to this instance.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| obj | Object | The System.Object to compare with this instance. |

**Returns:** boolean - true if the specified System.Object is equal to this instance; otherwise, false .

### hashCode() {#hashCode}
```java
public int hashCode()
```

Returns a hash code for this instance.

**Returns:** int - A hash code for this instance, suitable for use in hashing algorithms and data structures like a hash table.

### toString() {#toString}
```java
public String toString()
```

Returns a System.String that represents this instance.

**Returns:** String - A System.String that represents this instance.

