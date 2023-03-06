---
title: VectorLayer.Add
second_title: Aspose.GIS for .NET API リファレンス
description: VectorLayer 方法. でサポートされている場合レイヤーに新しいフィーチャを追加しますVectorLayersDriver .
type: docs
weight: 80
url: /ja/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

でサポートされている場合、レイヤーに新しいフィーチャを追加します。[`VectorLayer`](../)s[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| feature | Feature | 追加する機能。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | レイヤーが読み取り専用の場合にスローされます。 |

### 関連項目

* class [Feature](../../feature/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

でサポートされている場合、指定されたスタイルの新しいフィーチャをレイヤーに追加します。[`VectorLayer`](../)s[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| feature | Feature | 追加する機能。 |
| style | IFeatureStyle | フィーチャ スタイル。使用`null`不足しているスタイルを示します。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | レイヤーがスタイルをサポートしていない場合、またはレイヤーが読み取り専用の場合にスローされます。 |
| InvalidOperationException | 編集可能なレイヤーがスタイルをサポートしていない場合にスローされます。 |
| ArgumentException | スタイルがドライバーの型と一致しない場合にスローされます。 |

### 関連項目

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)


