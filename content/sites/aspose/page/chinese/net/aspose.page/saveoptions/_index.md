---
title: Class SaveOptions
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.SaveOptions 班级. 此类包含管理转换过程所需的选项
type: docs
weight: 300
url: /zh/net/aspose.page/saveoptions/
---
## SaveOptions class

此类包含管理转换过程所需的选项。

```csharp
public abstract class SaveOptions
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [SaveOptions](saveoptions/#constructor)() | 初始化一个新的实例`SaveOptions`具有默认值 标志的类!:SuppressErrors（真）和[`Debug`](./debug/)（假）. |
| [SaveOptions](saveoptions/#constructor_1)(bool) | 初始化一个新的实例`SaveOptions`具有标志默认值的类[`Debug`](./debug/)（假）. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | 指定转换器应在其中为输入文档查找字体的其他文件夹。 默认文件夹是标准字体文件夹，操作系统在其中查找内部需要的字体。 |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | 指定是否必须将调试信息打印到标准输出流。 |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | 返回抑制的转换错误列表 如果!:SuppressErrors是真的。 |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | 质量类别指定图像的压缩级别。 可用值为 0 到 100。 指定的数字越小，压缩越高，因此图像质量越低。 0 值导致图像质量最低，而 100 导致图像质量最高。 |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | 指定是否必须抑制错误。 如果 true 抑制错误添加到[`Exceptions`](./exceptions/)list. 如果为假，第一个错误将终止程序。 |

### 也可以看看

* 命名空间 [Aspose.Page](../../aspose.page/)
* 部件 [Aspose.Page](../../)


