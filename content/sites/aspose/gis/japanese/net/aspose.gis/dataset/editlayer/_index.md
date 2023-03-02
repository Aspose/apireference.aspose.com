---
title: Dataset.EditLayer
second_title: Aspose.GIS for .NET API リファレンス
description: Dataset 方法. 指定した名前のレイヤーを編集用に開きます
type: docs
weight: 90
url: /ja/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

指定した名前のレイヤーを編集用に開きます。

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| name | String | 編集するレイヤーの名前。 |
| options | DriverOptions | オプションを開きます。 |
| spatialReferenceSystem | SpatialReferenceSystem | 新しいジオメトリの空間参照系。 |

### 戻り値

レイヤーが編集用に開かれました。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | 指定された名前のレイヤーが存在しません。 このデータセットのオプション オブジェクトの型が正しくありません。 |
| ArgumentException | このデータセットのオプション オブジェクトの型が正しくありません。 |
| ArgumentNullException | 名前は`null`. |
| [GisException](../../gisexception/) | レイヤーからのフィーチャの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* 名前空間 [Aspose.Gis](../../dataset/)
* 組み立て [Aspose.GIS](../../../)


