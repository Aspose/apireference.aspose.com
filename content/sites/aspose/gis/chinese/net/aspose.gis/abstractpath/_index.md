---
title: Class AbstractPath
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.AbstractPath 班级. 一个抽象路径是在类似于文件系统的环境中指定唯一位置的类的基类 如本地文件系统远程文件存储或 ZIP 存档等
type: docs
weight: 10
url: /zh/net/aspose.gis/abstractpath/
---
## AbstractPath class

一个`抽象路径`是在类似于文件系统的环境中指定唯一位置的类的基类， 如本地文件系统、远程文件存储或 ZIP 存档等。

```csharp
public abstract class AbstractPath
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | 获取此位置的字符串表示形式`抽象路径`. |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | 获取用于分隔目录级别的分隔符[`Location`](./location/)细绳。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | 创建一个`AbstractPath`表示本地文件系统上的位置。 |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | 创建一个`AbstractPath`从一个Stream. |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | 结合这个`AbstractPath`具有指定路径组件. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | 删除此路径指向的文件。 |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | 返回这个的扩展名`AbstractPath`. |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | 返回此文件的文件名和扩展名`AbstractPath`. |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | 返回此文件的文件名`AbstractPath`没有扩展名. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | 获取一个值，该值指示此路径是否指向可以打开以供阅读的现有文件。 |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | 返回位于此内部的路径`抽象路径` 如果它是一个目录. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | 打开这个`抽象路径`作为文件. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | 返回一个新的`AbstractPath`文件扩展名更改为指定值. |

### 评论

一个`抽象路径`可能指定本地文件系统上的位置、远程文件系统 或外部存储（如 Azure Blob 存储）上的位置，等等。该位置可能指向现有或不存在的 类文件对象、类目录对象，或具有对其所属环境合理的任何其他含义。 例如，一个`抽象路径`表示本地文件系统上某个位置的继承者可以指向现有的 文件、目录或文件系统中尚未创建的位置。 为了使新的类似文件系统的存储可用于`Aspose地理信息系统`，应该继承这个类 并实现它的抽象方法。

### 也可以看看

* 命名空间 [Aspose.Gis](../../aspose.gis/)
* 部件 [Aspose.GIS](../../)


