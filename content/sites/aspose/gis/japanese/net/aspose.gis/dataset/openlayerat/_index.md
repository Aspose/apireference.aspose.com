---
title: Dataset.OpenLayerAt
second_title: Aspose.GIS for .NET API リファレンス
description: Dataset 方法. 読み取り用に指定されたインデックスでレイヤーを開きます
type: docs
weight: 120
url: /ja/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

読み取り用に指定されたインデックスでレイヤーを開きます。

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| index | Int32 | 開くレイヤーのインデックス。 |
| options | DriverOptions | オプションを開きます。 |

### 戻り値

レイヤーが読み取り用に開かれました。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | このデータセットのオプション オブジェクトの型が正しくありません。 |
| ArgumentOutOfRangeException | インデックスが範囲外です |
| ArgumentException | このデータセットのオプション オブジェクトの型が正しくありません。 |
| [GisException](../../gisexception/) | レイヤーからのフィーチャの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* 名前空間 [Aspose.Gis](../../dataset/)
* 組み立て [Aspose.GIS](../../../)


