---
title: SimpleLine.FeatureBasedConfiguration
second_title: Aspose.GIS for .NET API 参考
description: SimpleLine 财产. 用于在呈现特征之前配置此符号器的回调
type: docs
weight: 60
url: /zh/net/aspose.gis.rendering.symbolizers/simpleline/featurebasedconfiguration/
---
## SimpleLine.FeatureBasedConfiguration property

用于在呈现特征之前配置此符号器的回调。

```csharp
public Action<Feature, SimpleLine> FeatureBasedConfiguration { get; set; }
```

### 评论

在渲染每个功能之前调用此回调。它接受一个即将被 渲染的特征和这个符号器的一个克隆。通过更改克隆的属性，可以根据特征的属性 更新符号器的行为。

### 也可以看看

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLine](../)
* 命名空间 [Aspose.Gis.Rendering.Symbolizers](../../simpleline/)
* 部件 [Aspose.GIS](../../../)


