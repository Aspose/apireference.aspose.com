---
title: EncoderValue
second_title: Aspose.Drawing for .NET API 参考
description: 用于指定使用 时传递给 JPEG 或 TIFF 图像编码器的参数值EncoderParameters 或EncoderParameters方法.
type: docs
weight: 720
url: /zh/net/system.drawing.imaging/encodervalue/
---
## EncoderValue enumeration

用于指定使用 时传递给 JPEG 或 TIFF 图像编码器的参数值EncoderParameters) 或EncoderParameters)方法.

```csharp
public enum EncoderValue
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| ColorTypeCMYK | `0` | 在 GDI+ 1.0 版中未使用。 |
| ColorTypeYCCK | `1` | 在 GDI+ 1.0 版中未使用。 |
| CompressionLZW | `2` | 指定 LZW 压缩方案。可以作为属于压缩类别的参数传递给 TIFF 编码器。 |
| CompressionCCITT3 | `3` | 指定 CCITT3 压缩方案。可以作为属于压缩类别的参数传递给 TIFF 编码器。 |
| CompressionCCITT4 | `4` | 指定 CCITT4 压缩方案。可以作为属于压缩类别的参数传递给 TIFF 编码器。 |
| CompressionRle | `5` | 指定 RLE 压缩方案。可以作为属于压缩类别的参数传递给 TIFF 编码器。 |
| CompressionNone | `6` | 指定不压缩。可以作为属于压缩类别的参数传递给 TIFF 编码器。 |
| ScanMethodInterlaced | `7` | 在 GDI+ 1.0 版中未使用。 |
| ScanMethodNonInterlaced | `8` | 在 GDI+ 1.0 版中未使用。 |
| VersionGif87 | `9` | 在 GDI+ 1.0 版中未使用。 |
| VersionGif89 | `10` | 在 GDI+ 1.0 版中未使用。 |
| RenderProgressive | `11` | 在 GDI+ 1.0 版中未使用。 |
| RenderNonProgressive | `12` | 在 GDI+ 1.0 版中未使用。 |
| TransformRotate90 | `13` | 指定图像将围绕其中心顺时针旋转 90 度。可以作为属于转换类别的参数传递给 JPEG 编码器。 |
| TransformRotate180 | `14` | 指定图像将围绕其中心旋转 180 度。可以作为属于转换类别的参数传递给 JPEG 编码器。 |
| TransformRotate270 | `15` | 指定图像将围绕其中心顺时针旋转 270 度。可以作为属于转换类别的参数传递给 JPEG 编码器。 |
| TransformFlipHorizontal | `16` | 指定图像将水平翻转（围绕垂直轴）。可以作为属于转换类别的参数传递给 JPEG 编码器。 |
| TransformFlipVertical | `17` | 指定要垂直翻转图像（围绕水平轴）。可以作为属于转换类别的参数传递给 JPEG 编码器。 |
| MultiFrame | `18` | 指定图像具有多个帧（页）。可以作为属于保存标志类别的参数传递给 TIFF 编码器。 |
| LastFrame | `19` | 指定多帧图像中的最后一帧。可以作为属于保存标志类别的参数传递给 TIFF 编码器。 |
| Flush | `20` | 指定应关闭多帧文件或流。可以作为属于保存标志类别的参数传递给 TIFF 编码器。 |
| FrameDimensionTime | `21` | 在 GDI+ 1.0 版中未使用。 |
| FrameDimensionResolution | `22` | 在 GDI+ 1.0 版中未使用。 |
| FrameDimensionPage | `23` | 指定要向图像的页面尺寸添加框架。可以作为属于保存标志类别的参数传递给 TIFF 编码器。 |

### 也可以看看

* 命名空间 [System.Drawing.Imaging](../../system.drawing.imaging)
* 部件 [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
