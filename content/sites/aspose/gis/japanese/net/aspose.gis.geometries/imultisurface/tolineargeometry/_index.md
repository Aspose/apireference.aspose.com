---
title: IMultiSurface.ToLinearGeometry
second_title: Aspose.GIS for .NET API リファレンス
description: IMultiSurface 方法. デフォルトを使用してこのジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します許容範囲 .
type: docs
weight: 20
url: /ja/net/aspose.gis.geometries/imultisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

デフォルトを使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲` .

```csharp
public IMultiPolygon ToLinearGeometry()
```

### 戻り値

A[`IMultiPolygon`](../../imultipolygon/)これに近似または同等[`IMultiSurface`](../). これは`ToLinearGeometry` with デフォルト`許容範囲`.デフォルト`許容範囲` の値は次のものに依存します[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)このジオメトリの : 予測される SRS の許容範囲は 0.001 メートル (SRS 単位)地理的な SRS の許容範囲は`1e-5`度 (SRS 単位)不明な SRS の許容範囲は`1e-5` 適用される変換の詳細については、次を参照してください。`ToLinearGeometry`仕様.

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | このジオメトリは無効であり、操作を完了できません. |

### 関連項目

* interface [IMultiPolygon](../../imultipolygon/)
* interface [IMultiSurface](../)
* 名前空間 [Aspose.Gis.Geometries](../../imultisurface/)
* 組み立て [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

指定された値を使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲`.

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| tolerance | Double | `許容範囲`使用する。結果は以下であることが保証されます`許容範囲`ジオメトリを線形化するために必要なポイントの数が象限ごとの最大値を超えない限り、 曲線ジオメトリから離れて は現在 10000 ポイントに等しい. |

### 戻り値

A[`IMultiPolygon`](../../imultipolygon/)これに近似または同等[`IMultiSurface`](../):  このオブジェクトが[`IMultiPolygon`](../../imultipolygon/)それ自体の結果は、この object と同等です。このオブジェクトがそうでない場合[`IMultiPolygon`](../../imultipolygon/) すべてのサーフェスが線形化され、新しくなりました`IMultiPolygon`作成されました

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | `許容範囲`以下です`0`. |
| InvalidOperationException | このジオメトリは無効であり、操作を完了できません. |

### 関連項目

* interface [IMultiPolygon](../../imultipolygon/)
* interface [IMultiSurface](../)
* 名前空間 [Aspose.Gis.Geometries](../../imultisurface/)
* 組み立て [Aspose.GIS](../../../)


