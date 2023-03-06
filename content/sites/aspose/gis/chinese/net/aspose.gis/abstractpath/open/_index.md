---
title: AbstractPath.Open
second_title: Aspose.GIS for .NET API 参考
description: AbstractPath 方法. 打开这个抽象路径作为文件.
type: docs
weight: 120
url: /zh/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

打开这个`抽象路径`作为文件.

```csharp
public abstract Stream Open(FileAccess access)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| access | FileAccess | 指定可以在一个对象上执行的操作的子集Stream. |

### 返回值

AStream用指定的打开FileAccess.

### 评论

如果*access*有国旗Write已设置，但文件不存在， 继承人必须创建它。 一个`抽象路径`可以多次打开`Aspose地理信息系统`.这是使用多个流独立读取 file 所必需的。你不应该缓存结果，而是返回新的Stream每次 调用此方法。

### 也可以看看

* class [AbstractPath](../)
* 命名空间 [Aspose.Gis](../../abstractpath/)
* 部件 [Aspose.GIS](../../../)


