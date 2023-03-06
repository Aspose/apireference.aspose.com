---
title: Geometry.FromBinary
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. WellKnown Binary 表現からジオメトリを作成します
type: docs
weight: 460
url: /ja/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

Well-Known Binary 表現からジオメトリを作成します。

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| wkb | Byte[] | ジオメトリの既知のバイナリ表現。 |

### 戻り値

引数で表されるジオメトリ。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数がヌルです。 |
| NotSupportedException | 引数は、サポートされていないタイプのジオメトリを表しています。 |
| FormatException | 引数は有効な Well-Known Binary ではありません。 |

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

Well-Known Binary 表現からジオメトリを作成します。

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| wkb | Byte[] | ジオメトリの既知のバイナリ表現。 |
| spatialReferenceSystem | SpatialReferenceSystem | ジオメトリに割り当てられる空間参照系。 |

### 戻り値

引数で表されるジオメトリ。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数がヌルです。 |
| NotSupportedException | 引数は、サポートされていないタイプのジオメトリを表しています。 |
| FormatException | 引数は有効な Well-Known Binary ではありません。 |

### 備考

ジオメトリの後に余分なバイトがある場合FormatException例外がスローされます.

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


