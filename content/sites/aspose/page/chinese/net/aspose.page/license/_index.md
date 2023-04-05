---
title: Class License
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.License 班级. 提供许可组件的方法
type: docs
weight: 270
url: /zh/net/aspose.page/license/
---
## License class

提供许可组件的方法。

```csharp
public class License
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [License](license/)() | 初始化此类的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Embedded](../../aspose.page/license/embedded/) { get; set; } | 许可证号已添加为嵌入式资源。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense)(Stream) | 许可组件。 |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense_1)(string) | 许可组件。 |

### 例子

在此示例中，将尝试在包含 的文件夹中查找名为 MyLicense.lic 的许可证文件 组件，在包含调用程序集的文件夹中， 在入口程序集的文件夹中，然后在调用程序集的嵌入资源中。

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

组件 jar 文件：

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### 也可以看看

* 命名空间 [Aspose.Page](../../aspose.page/)
* 部件 [Aspose.Page](../../)


