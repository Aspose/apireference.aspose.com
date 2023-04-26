---
title: Class PdfSaveOptions
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.Presentation.Pdf.PdfSaveOptions 班级. XPSasPDF 保存选项的类
type: docs
weight: 450
url: /zh/net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class

XPS-as-PDF 保存选项的类。

```csharp
public class PdfSaveOptions : SaveOptions
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | 创建选项的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | 指定转换器应在其中为输入文档查找字体的其他文件夹。 默认文件夹是标准字体文件夹，操作系统在其中查找内部需要的字体。 |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | 指定是否必须将调试信息打印到标准输出流。 |
| [EncryptionDetails](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/encryptiondetails/) { get; set; } | 获取或设置加密详细信息。如果未设置，则不会执行任何加密。 |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | 返回抑制的转换错误列表 如果!:SuppressErrors是真的。 |
| [ImageCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/imagecompression/) { get; set; } | 指定用于文档中所有图像的压缩类型。 默认为Auto. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | 质量类别指定图像的压缩级别。 可用值为 0 到 100。 指定的数字越小，压缩越高，因此图像质量越低。 0 值导致图像质量最低，而 100 导致图像质量最高。 |
| [OutlineTreeExpansionLevel](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeexpansionlevel/) { get; set; } | 指定在查看器中打开 PDF 文件时文档大纲应扩展到什么级别。 1 - 仅显示第一级大纲项目， 2 - 仅显示第一和第二级大纲项目， 和依此类推。 默认为 1. |
| [OutlineTreeHeight](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeheight/) { get; set; } | 指定要保存的文档大纲树的高度。 0 - 不转换大纲树， 1 - 仅转换第一级大纲项目， ans 依此类推。 默认为 10. |
| [PageNumbers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/pagenumbers/) { get; set; } | 获取/设置要转换的页数数组。 |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | 指定是否必须抑制错误。 如果 true 抑制错误添加到[`Exceptions`](../../aspose.page/saveoptions/exceptions/)list. 如果为假，第一个错误将终止程序。 |
| [TextCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/textcompression/) { get; set; } | 指定用于除图像之外的所有内容流的压缩类型。 默认为Flate. |

### 也可以看看

* class [SaveOptions](../../aspose.page/saveoptions/)
* 命名空间 [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* 部件 [Aspose.Page](../../)


