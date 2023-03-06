---
title: FeaturesSequence.WhereIntersects
second_title: Aspose.GIS for .NET API リファレンス
description: FeaturesSequence 方法. 他のフィーチャ シーケンス内のすべてのジオメトリの結合に基づいてフィーチャをフィルタリングします
type: docs
weight: 100
url: /ja/net/aspose.gis/featuressequence/whereintersects/
---
## WhereIntersects(FeaturesSequence) {#whereintersects_1}

他のフィーチャ シーケンス内のすべてのジオメトリの結合に基づいてフィーチャをフィルタリングします。

```csharp
public FeaturesSequence WhereIntersects(FeaturesSequence sequence)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| sequence | FeaturesSequence | その他の機能シーケンス。 |

### 戻り値

他のフィーチャ シーケンス内のすべてのジオメトリの和集合と交差するフィーチャ。

### 関連項目

* class [FeaturesSequence](../)
* 名前空間 [Aspose.Gis](../../featuressequence/)
* 組み立て [Aspose.GIS](../../../)

---

## WhereIntersects(IGeometry) {#whereintersects_2}

指定されたジオメトリに基づいてフィーチャをフィルタリングします。

```csharp
public virtual FeaturesSequence WhereIntersects(IGeometry geometry)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| geometry | IGeometry | ジオメトリをフィルタします。 |

### 戻り値

指定されたジオメトリと交差するフィーチャ。

### 関連項目

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [FeaturesSequence](../)
* 名前空間 [Aspose.Gis](../../featuressequence/)
* 組み立て [Aspose.GIS](../../../)

---

## WhereIntersects(Extent) {#whereintersects}

範囲に基づいてフィーチャをフィルタリングします。

```csharp
public virtual FeaturesSequence WhereIntersects(Extent extent)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| extent | Extent | フィルタ範囲。 |

### 戻り値

指定されたジオメトリと交差するフィーチャ。

### 関連項目

* class [Extent](../../extent/)
* class [FeaturesSequence](../)
* 名前空間 [Aspose.Gis](../../featuressequence/)
* 組み立て [Aspose.GIS](../../../)


