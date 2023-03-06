---
title: MarkerCluster.FeaturesBasedConfiguration
second_title: Aspose.GIS for .NET API 参考
description: MarkerCluster 财产. 用于在呈现聚类中心之前配置此符号器的回调
type: docs
weight: 20
url: /zh/net/aspose.gis.rendering.symbolizers/markercluster/featuresbasedconfiguration/
---
## MarkerCluster.FeaturesBasedConfiguration property

用于在呈现聚类中心之前配置此符号器的回调。

```csharp
public Action<IEnumerable<Feature>, MarkerCluster> FeaturesBasedConfiguration { get; set; }
```

### 评论

在渲染每个聚类中心之前调用此回调。它接受即将被 渲染的特征和该符号器的克隆。通过更改克隆的属性，可以 根据特征的属性更新符号器的行为。

### 也可以看看

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerCluster](../)
* 命名空间 [Aspose.Gis.Rendering.Symbolizers](../../markercluster/)
* 部件 [Aspose.GIS](../../../)


