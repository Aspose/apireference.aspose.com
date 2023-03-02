---
title: GmlOptions.RestoreSchema
second_title: Aspose.GIS for .NET API 参考
description: GmlOptions 财产. 确定是否允许 Aspose.GIS 解析缺少或无法加载 XML 模式的 Gml 文件中的属性 如果设置为true Aspose.GIS 阅读器不要求存在 XML Schema. 默认为false.
type: docs
weight: 40
url: /zh/net/aspose.gis.formats.gml/gmloptions/restoreschema/
---
## GmlOptions.RestoreSchema property

确定是否允许 Aspose.GIS 解析缺少或无法加载 XML 模式的 Gml 文件中的属性。 如果设置为`true` Aspose.GIS 阅读器不要求存在 XML Schema. 默认为`false`.

```csharp
public bool RestoreSchema { get; set; }
```

### 评论

驱动程序尝试通过扫描文件并查找“已知”对象以确定组织来自动解析要素类及其关联的属性 。 虽然这种方法容易出错，但它具有适用于 GML 文件的优势 even 如果关联XML 架构已丢失或无法从 Internet 加载。

### 也可以看看

* class [GmlOptions](../)
* 命名空间 [Aspose.Gis.Formats.Gml](../../gmloptions/)
* 部件 [Aspose.GIS](../../../)


