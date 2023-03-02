---
title: Geometry.FromText
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. WellKnown Text 表現からジオメトリを作成します
type: docs
weight: 470
url: /ja/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

Well-Known Text 表現からジオメトリを作成します。

```csharp
public static IGeometry FromText(string wkt)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| wkt | String | ジオメトリの Well-Known Text 表現。 |

### 戻り値

引数で表されるジオメトリ。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数がヌルです。 |
| NotSupportedException | 引数は、サポートされていないタイプのジオメトリを表しています。 |
| FormatException | 引数は有効な Well-Known Text ではありません。 |

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

Well-Known Text 表現からジオメトリを作成します。

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| wkt | String | ジオメトリの Well-Known Text 表現。 |
| spatialReferenceSystem | SpatialReferenceSystem | ジオメトリに割り当てられる空間参照系。 |

### 戻り値

引数で表されるジオメトリ。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数がヌルです。 |
| NotSupportedException | 引数は、サポートされていないタイプのジオメトリを表しています。 |
| FormatException | 引数は有効な Well-Known Text ではありません。 |

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


