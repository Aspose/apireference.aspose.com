---
title: RasterLayer.Crop
second_title: Aspose.GIS for .NET API リファレンス
description: RasterLayer 方法. シェイプ フォーム およびバンド マスク を使用してラスター レイヤーをトリミングします
type: docs
weight: 110
url: /ja/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

シェイプ フォーム (およびバンド マスク) を使用してラスター レイヤーをトリミングします。

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| geometry | IGeometry | 形状は形を表していました。 |
| masks | Double[] | クロップレイヤーのマスク |

### 戻り値

トリミングされたラスター レイヤー。交点が見つからない場合は戻ります`null`.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数を null にすることはできません。パラメータ名: ジオメトリ。 |
| NotSupportedException | 引数は、ポリゴンまたはサーフェスと異なるものであってはなりません。パラメータ名: ジオメトリ。 |
| InvalidOperationException | 元のレイヤーを別の CropRasterLayer にすることはできません。 |
| [GisException](../../../aspose.gis/gisexception/) | レイヤーのトリミング中にエラーが発生しました。 |

### 関連項目

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* 名前空間 [Aspose.Gis.Raster](../../rasterlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

バンド マスクを使用してラスター レイヤーをトリミングします。

```csharp
public RasterLayer Crop(double[] masks)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| masks | Double[] | クロップレイヤーのマスク |

### 戻り値

トリミングされたラスター レイヤー。交点が見つからない場合は戻ります`null`.

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException |  |

### 関連項目

* class [RasterLayer](../)
* 名前空間 [Aspose.Gis.Raster](../../rasterlayer/)
* 組み立て [Aspose.GIS](../../../)


