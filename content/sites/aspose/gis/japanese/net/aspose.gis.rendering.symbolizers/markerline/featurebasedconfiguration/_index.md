---
title: MarkerLine.FeatureBasedConfiguration
second_title: Aspose.GIS for .NET API リファレンス
description: MarkerLine 財産. フィーチャをレンダリングする前にこのシンボライザーを構成するために使用されるコールバック
type: docs
weight: 20
url: /ja/net/aspose.gis.rendering.symbolizers/markerline/featurebasedconfiguration/
---
## MarkerLine.FeatureBasedConfiguration property

フィーチャをレンダリングする前に、このシンボライザーを構成するために使用されるコールバック。

```csharp
public Action<Feature, MarkerLine> FeatureBasedConfiguration { get; set; }
```

### 備考

このコールバックは、すべての機能をレンダリングする前に呼び出されます。 be レンダリングされようとしている機能と、このシンボライザーのクローンを受け入れます。クローンのプロパティを変更することで、機能の属性に基づいてシンボライザーの動作を 更新できます.

### 関連項目

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerLine](../)
* 名前空間 [Aspose.Gis.Rendering.Symbolizers](../../markerline/)
* 組み立て [Aspose.GIS](../../../)


