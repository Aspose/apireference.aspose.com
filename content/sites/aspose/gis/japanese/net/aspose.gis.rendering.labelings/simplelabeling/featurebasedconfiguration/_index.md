---
title: SimpleLabeling.FeatureBasedConfiguration
second_title: Aspose.GIS for .NET API リファレンス
description: SimpleLabeling 財産. 機能を処理する前にこのラベル付けを構成するために使用されるコールバック.
type: docs
weight: 20
url: /ja/net/aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/
---
## SimpleLabeling.FeatureBasedConfiguration property

機能を処理する前に、このラベル付けを構成するために使用されるコールバック.

```csharp
public Action<Feature, SimpleLabeling> FeatureBasedConfiguration { get; set; }
```

### 備考

このコールバックは、すべてのフィーチャにラベルを付ける前に呼び出されます。これは、 ラベルが付けられようとしている機能と、このラベル付けのクローンを受け入れます。クローンのプロパティを変更することで、フィーチャの属性に基づいてラベル付けの動作を 更新できます.

### 関連項目

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLabeling](../)
* 名前空間 [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* 組み立て [Aspose.GIS](../../../)


