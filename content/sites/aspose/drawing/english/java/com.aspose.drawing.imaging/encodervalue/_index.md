---
title: EncoderValue
second_title: Aspose.Drawing for Java API Reference
description: Used to specify the parameter value passed to a JPEG or TIFF image encoder when using the MImage.SaveSystem.StringSystem.Drawing.Imaging.ImageCodecInfoSystem.Drawing.Imaging.EncoderParameters or MImage.SaveAddSystem.Drawing.Imaging.EncoderParameters methods.
type: docs
weight: 22
url: /java/com.aspose.drawing.imaging/encodervalue/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.System.Enum
```
public final class EncoderValue extends System.Enum
```

Used to specify the parameter value passed to a JPEG or TIFF image encoder when using the `M:Image.Save(System.String,System.Drawing.Imaging.ImageCodecInfo,System.Drawing.Imaging.EncoderParameters)` or `M:Image.SaveAdd(System.Drawing.Imaging.EncoderParameters)` methods.
## Fields

| Field | Description |
| --- | --- |
| [ColorTypeCMYK](#ColorTypeCMYK) | Not used in GDI+ version 1.0. |
| [ColorTypeYCCK](#ColorTypeYCCK) | Not used in GDI+ version 1.0. |
| [CompressionLZW](#CompressionLZW) | Specifies the LZW compression scheme. |
| [CompressionCCITT3](#CompressionCCITT3) | Specifies the CCITT3 compression scheme. |
| [CompressionCCITT4](#CompressionCCITT4) | Specifies the CCITT4 compression scheme. |
| [CompressionRle](#CompressionRle) | Specifies the RLE compression scheme. |
| [CompressionNone](#CompressionNone) | Specifies no compression. |
| [ScanMethodInterlaced](#ScanMethodInterlaced) | Not used in GDI+ version 1.0. |
| [ScanMethodNonInterlaced](#ScanMethodNonInterlaced) | Not used in GDI+ version 1.0. |
| [VersionGif87](#VersionGif87) | Not used in GDI+ version 1.0. |
| [VersionGif89](#VersionGif89) | Not used in GDI+ version 1.0. |
| [RenderProgressive](#RenderProgressive) | Not used in GDI+ version 1.0. |
| [RenderNonProgressive](#RenderNonProgressive) | Not used in GDI+ version 1.0. |
| [TransformRotate90](#TransformRotate90) | Specifies that the image is to be rotated clockwise 90 degrees about its center. |
| [TransformRotate180](#TransformRotate180) | Specifies that the image is to be rotated 180 degrees about its center. |
| [TransformRotate270](#TransformRotate270) | Specifies that the image is to be rotated clockwise 270 degrees about its center. |
| [TransformFlipHorizontal](#TransformFlipHorizontal) | Specifies that the image is to be flipped horizontally (about the vertical axis). |
| [TransformFlipVertical](#TransformFlipVertical) | Specifies that the image is to be flipped vertically (about the horizontal axis). |
| [MultiFrame](#MultiFrame) | Specifies that the image has more than one frame (page). |
| [LastFrame](#LastFrame) | Specifies the last frame in a multiple-frame image. |
| [Flush](#Flush) | Specifies that a multiple-frame file or stream should be closed. |
| [FrameDimensionTime](#FrameDimensionTime) | Not used in GDI+ version 1.0. |
| [FrameDimensionResolution](#FrameDimensionResolution) | Not used in GDI+ version 1.0. |
| [FrameDimensionPage](#FrameDimensionPage) | Specifies that a frame is to be added to the page dimension of an image. |
### ColorTypeCMYK {#ColorTypeCMYK}
```
public static final int ColorTypeCMYK
```


Not used in GDI+ version 1.0.

### ColorTypeYCCK {#ColorTypeYCCK}
```
public static final int ColorTypeYCCK
```


Not used in GDI+ version 1.0.

### CompressionLZW {#CompressionLZW}
```
public static final int CompressionLZW
```


Specifies the LZW compression scheme. Can be passed to the TIFF encoder as a parameter that belongs to the Compression category.

### CompressionCCITT3 {#CompressionCCITT3}
```
public static final int CompressionCCITT3
```


Specifies the CCITT3 compression scheme. Can be passed to the TIFF encoder as a parameter that belongs to the compression category.

### CompressionCCITT4 {#CompressionCCITT4}
```
public static final int CompressionCCITT4
```


Specifies the CCITT4 compression scheme. Can be passed to the TIFF encoder as a parameter that belongs to the compression category.

### CompressionRle {#CompressionRle}
```
public static final int CompressionRle
```


Specifies the RLE compression scheme. Can be passed to the TIFF encoder as a parameter that belongs to the compression category.

### CompressionNone {#CompressionNone}
```
public static final int CompressionNone
```


Specifies no compression. Can be passed to the TIFF encoder as a parameter that belongs to the compression category.

### ScanMethodInterlaced {#ScanMethodInterlaced}
```
public static final int ScanMethodInterlaced
```


Not used in GDI+ version 1.0.

### ScanMethodNonInterlaced {#ScanMethodNonInterlaced}
```
public static final int ScanMethodNonInterlaced
```


Not used in GDI+ version 1.0.

### VersionGif87 {#VersionGif87}
```
public static final int VersionGif87
```


Not used in GDI+ version 1.0.

### VersionGif89 {#VersionGif89}
```
public static final int VersionGif89
```


Not used in GDI+ version 1.0.

### RenderProgressive {#RenderProgressive}
```
public static final int RenderProgressive
```


Not used in GDI+ version 1.0.

### RenderNonProgressive {#RenderNonProgressive}
```
public static final int RenderNonProgressive
```


Not used in GDI+ version 1.0.

### TransformRotate90 {#TransformRotate90}
```
public static final int TransformRotate90
```


Specifies that the image is to be rotated clockwise 90 degrees about its center. Can be passed to the JPEG encoder as a parameter that belongs to the transformation category.

### TransformRotate180 {#TransformRotate180}
```
public static final int TransformRotate180
```


Specifies that the image is to be rotated 180 degrees about its center. Can be passed to the JPEG encoder as a parameter that belongs to the transformation category.

### TransformRotate270 {#TransformRotate270}
```
public static final int TransformRotate270
```


Specifies that the image is to be rotated clockwise 270 degrees about its center. Can be passed to the JPEG encoder as a parameter that belongs to the transformation category.

### TransformFlipHorizontal {#TransformFlipHorizontal}
```
public static final int TransformFlipHorizontal
```


Specifies that the image is to be flipped horizontally (about the vertical axis). Can be passed to the JPEG encoder as a parameter that belongs to the transformation category.

### TransformFlipVertical {#TransformFlipVertical}
```
public static final int TransformFlipVertical
```


Specifies that the image is to be flipped vertically (about the horizontal axis). Can be passed to the JPEG encoder as a parameter that belongs to the transformation category.

### MultiFrame {#MultiFrame}
```
public static final int MultiFrame
```


Specifies that the image has more than one frame (page). Can be passed to the TIFF encoder as a parameter that belongs to the save flag category.

### LastFrame {#LastFrame}
```
public static final int LastFrame
```


Specifies the last frame in a multiple-frame image. Can be passed to the TIFF encoder as a parameter that belongs to the save flag category.

### Flush {#Flush}
```
public static final int Flush
```


Specifies that a multiple-frame file or stream should be closed. Can be passed to the TIFF encoder as a parameter that belongs to the save flag category.

### FrameDimensionTime {#FrameDimensionTime}
```
public static final int FrameDimensionTime
```


Not used in GDI+ version 1.0.

### FrameDimensionResolution {#FrameDimensionResolution}
```
public static final int FrameDimensionResolution
```


Not used in GDI+ version 1.0.

### FrameDimensionPage {#FrameDimensionPage}
```
public static final int FrameDimensionPage
```


Specifies that a frame is to be added to the page dimension of an image. Can be passed to the TIFF encoder as a parameter that belongs to the save flag category.

