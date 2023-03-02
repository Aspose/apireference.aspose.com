---
title: VectorLayer.Item
second_title: Aspose.GIS for .NET API リファレンス
description: VectorLayer 財産. を取得しますFeature指定されたインデックスで.
type: docs
weight: 70
url: /ja/net/aspose.gis/vectorlayer/item/
---
## VectorLayer indexer

を取得します[`Feature`](../../feature/)指定されたインデックスで.

```csharp
public virtual Feature this[int index] { get; }
```

| パラメータ | 説明 |
| --- | --- |
| index | 機能のインデックス。 |

### プロパティ値

[`Feature`](../../feature/) .

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | レイヤーが書き込み専用で開かれた場合にスローされます。 |
| ArgumentOutOfRangeException | インデックスが範囲外です。 |
| [GisException](../../gisexception/) | ファイルからのフィーチャの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [Feature](../../feature/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)


