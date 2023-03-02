---
title: FeatureAttributeCollection.Item
second_title: Aspose.GIS for .NET API リファレンス
description: FeatureAttributeCollection 財産. を取得または設定しますFeatureAttribute指定されたインデックスで.
type: docs
weight: 30
url: /ja/net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

を取得または設定します[`FeatureAttribute`](../../featureattribute/)指定されたインデックスで.

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| パラメータ | 説明 |
| --- | --- |
| index | 取得または設定する属性のゼロから始まるインデックス。 |

### 戻り値

指定されたインデックスの属性。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | インデックスが範囲外です。 |
| InvalidOperationException | ロックされたコレクションを変更しようとしています。 |

### 関連項目

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* 名前空間 [Aspose.Gis](../../featureattributecollection/)
* 組み立て [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

を取得または設定します[`FeatureAttribute`](../../featureattribute/)指定された名前で.

```csharp
public FeatureAttribute this[string name] { get; }
```

| パラメータ | 説明 |
| --- | --- |
| name | 属性の名前。 |

### 戻り値

指定された名前の属性、または`null`見つからない場合。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 属性名は`null`. |

### 関連項目

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* 名前空間 [Aspose.Gis](../../featureattributecollection/)
* 組み立て [Aspose.GIS](../../../)


