---
title: 输入类型
second_title: Aspose.OCR 适用于 .NET API 参考
description: 用于处理/识别的图像/文档类型。
type: docs
weight: 310
url: /zh/net/aspose.ocr/inputtype/
---
## InputType enumeration

用于处理/识别的图像/文档类型。

```csharp
public enum InputType
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| SingleImage | `0` | 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、MemoryStream、字节数组。 |
| PDF | `1` | 从文件或 MemoryStream 扫描的 PDF 文档。 |
| TIFF | `2` | 从文件或 MemoryStream 获取的多页 TIFF、TIF 文档。 |
| DJVU | `3` | 从文件或 MemoryStream 获取的多页 DJVU 文档。 |
| URL | `4` | 图像上的链接。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| Directory | `5` | 目录的路径。不支持嵌套压缩包和文件夹。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。默认处理的图像数量为全部。 |
| Zip | `6` | ZIP 压缩包的完整名称。不支持嵌套压缩包和文件夹。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。默认处理的图像数量为全部。 |
| Base64 | `7` | 包含图像的 base64 字符串或指向包含 base64 内容的 .txt 文件的路径。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |

### 另请参见

* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
