---
title: Class License
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.License 班级. 提供许可组件的方法
type: docs
weight: 1270
url: /zh/net/aspose.gis/license/
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

## 方法

| 姓名 | 描述 |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | 许可组件。 |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | 许可组件。 |

### 例子

在此示例中，将尝试在包含 组件的文件夹、包含调用程序集的文件夹、 入口程序集的文件夹中，然后在调用程序集的嵌入资源.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### 也可以看看

* 命名空间 [Aspose.Gis](../../aspose.gis/)
* 部件 [Aspose.GIS](../../)


