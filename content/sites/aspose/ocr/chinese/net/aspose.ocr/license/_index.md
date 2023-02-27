---
title: Class License
second_title: Aspose.OCR for .NET API 参考
description: Aspose.OCR.License 班级. 提供许可组件的方法
type: docs
weight: 120
url: /zh/net/aspose.ocr/license/
---
## License class

提供许可组件的方法。

```csharp
public class License
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [License](license/)() | 默认构造函数。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | 获取指示产品是否已获得许可的值。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | 许可组件。 |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | 许可组件。 |

### 例子

在此示例中，将尝试在包含 组件的文件夹中、在包含调用程序集的文件夹中、在入口程序集的文件夹中查找名为 的许可证文件，然后在调用程序集的嵌入资源.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### 也可以看看

* 命名空间 [Aspose.OCR](../../aspose.ocr/)
* 部件 [Aspose.OCR](../../)


