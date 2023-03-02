---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystem 方法. これから変換を作成します空間参照システム別の人に空間参照システム .
type: docs
weight: 180
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

これから変換を作成します`空間参照システム`別の人に`空間参照システム` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | 別`空間参照システム`. |

### 戻り値

これからの変身`空間参照システム`別の人に`空間参照システム`.

### 例外

| 例外 | 調子 |
| --- | --- |
| NotSupportedException | この間の変換`空間参照システム`and argument is not supported. これは、プロジェクションの 1 つがサポートされていないか、システムの 1 つがサポートされていないために発生する可能性があります。[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/)or [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | 内部のパラメーターが間違っているため、変換を作成できませんでした`空間参照システム` . |

### 関連項目

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 組み立て [Aspose.GIS](../../../)


