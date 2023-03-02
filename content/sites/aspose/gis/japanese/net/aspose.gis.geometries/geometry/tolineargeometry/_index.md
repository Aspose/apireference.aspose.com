---
title: Geometry.ToLinearGeometry
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. デフォルトを使用してこのジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します許容範囲 .
type: docs
weight: 400
url: /ja/net/aspose.gis.geometries/geometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

デフォルトを使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲` .

```csharp
public IGeometry ToLinearGeometry()
```

### 戻り値

曲線ジオメトリを持たないジオメトリ。これは[`ToLinearGeometry`](../../igeometry/tolineargeometry/) with デフォルト`許容範囲`.デフォルト`許容範囲`によって定義されます[`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)このジオメトリの : 予測される SRS の許容範囲は 0.001 メートル (SRS 単位)地理的な SRS の許容範囲は`1e-5`度 (SRS 単位)不明な SRS の許容範囲は`1e-5` 適用される変換の詳細については、次を参照してください。[`ToLinearGeometry`](../../igeometry/tolineargeometry/)仕様.

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | このジオメトリは無効であり、操作を完了できません. |

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

指定された値を使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲` .

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| tolerance | Double | `許容範囲`使用する。結果は以下であることが保証されます`許容範囲`ジオメトリを線形化するために必要なポイントの数が、現在 10000 ポイントに等しい象限あたりの最大 を超えない限り、 曲線ジオメトリから離れます。 |

### 戻り値

曲線ジオメトリを持たないジオメトリ。次の変換が適用されます: CircularString は linearized (に変換されます)LineString指定された*tolerance*)CompoundCurveに結合されます`LineString`sCurvePolygonに変換されますPolygonsMultiCurveに変換されますMultiLineStringsMultiSurfaceに変換されますMultiPolygons その結果、[`HasCurveGeometry`](../../igeometry/hascurvegeometry/)出力ジオメトリの`false` .

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | `許容範囲`以下です`0` . |
| InvalidOperationException | このジオメトリは無効であり、操作を完了できません. |

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


