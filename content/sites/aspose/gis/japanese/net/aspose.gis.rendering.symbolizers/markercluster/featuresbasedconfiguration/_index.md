---
title: MarkerCluster.FeaturesBasedConfiguration
second_title: Aspose.GIS for .NET API リファレンス
description: MarkerCluster 財産. クラスターの中心をレンダリングする前にこのシンボライザーを構成するために使用されるコールバック
type: docs
weight: 20
url: /ja/net/aspose.gis.rendering.symbolizers/markercluster/featuresbasedconfiguration/
---
## MarkerCluster.FeaturesBasedConfiguration property

クラスターの中心をレンダリングする前に、このシンボライザーを構成するために使用されるコールバック。

```csharp
public Action<IEnumerable<Feature>, MarkerCluster> FeaturesBasedConfiguration { get; set; }
```

### 備考

このコールバックは、すべてのクラスタ センターをレンダリングする前に呼び出されます。 レンダリングされようとしている機能と、このシンボライザーのクローンを受け入れます。クローンのプロパティを変更することで、フィーチャの属性に基づいてシンボライザーの動作を 更新することができます.

### 関連項目

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerCluster](../)
* 名前空間 [Aspose.Gis.Rendering.Symbolizers](../../markercluster/)
* 組み立て [Aspose.GIS](../../../)


