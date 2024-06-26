---
title: Enum DibBitCount
second_title: Aspose.Imaging for .NET API Reference
description: Aspose.Imaging.ApsBuilder.Dib.DibBitCount enum. The BitCount Enumeration specifies the number of bits that define each pixel and the maximum number of colors in a deviceindependent bitmap DIB
type: docs
weight: 30
url: /net/aspose.imaging.apsbuilder.dib/dibbitcount/
---
## DibBitCount enumeration

The BitCount Enumeration specifies the number of bits that define each pixel and the maximum number of colors in a device-independent bitmap (DIB).

```csharp
public enum DibBitCount : short
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Bitcount0 | `0` | The number of bits per pixel is undefined. The image SHOULD be in either JPEG or PNG format. Neither of these formats includes a color table, so this value specifies that no color table is present. See [JFIF] and [RFC2083] for more information concerning JPEG and PNG compression formats. |
| Bitcount1 | `1` | The image is specified with two colors.Each pixel in the bitmap is represented by a single bit. If the bit is clear, the pixel is displayed with the color of the first entry in the color table; if the bit is set, the pixel has the color of the second entry in the table. |
| Bitcount2 | `4` | The image is specified with a maximum of 16 colors. Each pixel in the bitmap is represented by a 4-bit index into the color table, and each byte contains 2 pixels. |
| Bitcount3 | `8` | The image is specified with a maximum of 256 colors. Each pixel in the bitmap is represented by an 8-bit index into the color table, and each byte contains 1 pixel. |
| Bitcount4 | `16` | The image is specified with a maximum of 2^16 colors. Each pixel in the bitmap is represented by a 16-bit value |
| Bitcount5 | `24` | The bitmap has a maximum of 2^24 colors, and the Colors field of DIB is NULL. Each 3-byte triplet in the bitmap array represents the relative intensities of blue, green, and red, respectively, for a pixel. The Colors color table is used for optimizing colors used on palette-based devices, and MUST contain the number of entries specified by the ColorUsed field of the BitmapInfoHeader Object |
| Bitcount6 | `32` | The bitmap has a maximum of 2^24 colors |

### See Also

* namespace [Aspose.Imaging.ApsBuilder.Dib](../../aspose.imaging.apsbuilder.dib/)
* assembly [Aspose.Imaging](../../)


