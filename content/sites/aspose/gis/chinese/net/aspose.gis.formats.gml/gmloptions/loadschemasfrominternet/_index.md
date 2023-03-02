---
title: GmlOptions.LoadSchemasFromInternet
second_title: Aspose.GIS for .NET API 参考
description: GmlOptions 财产. 确定是否允许 Aspose.GIS 从 Internet 加载 XML 模式 如果设置为false 具有不以file//开头的绝对 URI 的模式将不会被加载 默认为false.
type: docs
weight: 20
url: /zh/net/aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/
---
## GmlOptions.LoadSchemasFromInternet property

确定是否允许 Aspose.GIS 从 Internet 加载 XML 模式。 如果设置为`false` 具有不以“file://”开头的绝对 URI 的模式将不会被加载。 默认为`false`.

```csharp
public bool LoadSchemasFromInternet { get; set; }
```

### 评论

Aspose.GIS 使用 GML 文件的 XML 模式来创建[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/). XML 模式文件可以与 GML 文件一起分发，也可以位于 Internet 上。 在前一种情况下，您需要将此选项设置为`true`允许 Aspose.GIS 加载 XML schema.

### 也可以看看

* class [GmlOptions](../)
* 命名空间 [Aspose.Gis.Formats.Gml](../../gmloptions/)
* 部件 [Aspose.GIS](../../../)


