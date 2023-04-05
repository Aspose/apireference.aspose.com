---
title: Class PsSaveOptions
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.EPS.Device.PsSaveOptions 班级. 此类包含管理将文档转换为 PostScript PS 或封装 PostScript EPS 文件的过程所需的选项
type: docs
weight: 80
url: /zh/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

此类包含管理将文档转换为 PostScript (PS) 或封装 PostScript (EPS) 文件的过程所需的选项。

```csharp
public class PsSaveOptions : SaveOptions
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | 初始化一个新的实例`PsSaveOptions`具有默认值 标志的类!:SuppressErrors（真）和!:Debug（假）. |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | 初始化一个新的实例`PsSaveOptions`具有标志默认值的类!:Debug（假）. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | 指定转换器应在其中为输入文档查找字体的其他文件夹。 默认文件夹是标准字体文件夹，操作系统在其中查找内部需要的字体。 |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | 背景颜色. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | 指定是否必须将调试信息打印到标准输出流。 |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | 表示是否在PS文档中嵌入使用过的字体。 |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | 一种字体，用于在 PS 文档中嵌入字体。 |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | 返回抑制的转换错误列表 如果!:SuppressErrors是真的。 |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | 质量类别指定图像的压缩级别。 可用值为 0 到 100。 指定的数字越小，压缩越高，因此图像质量越低。 0 值导致图像质量最低，而 100 导致图像质量最高。 |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | 页边距。 |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | 页面的大小。 |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | 结果文件的保存格式. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | 指定是否必须抑制错误。 如果 true 抑制错误添加到[`Exceptions`](../../aspose.page/saveoptions/exceptions/)list. 如果为假，第一个错误将终止程序。 |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | 指示背景是否透明。 |

### 也可以看看

* class [SaveOptions](../../aspose.page/saveoptions/)
* 命名空间 [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* 部件 [Aspose.Page](../../)


