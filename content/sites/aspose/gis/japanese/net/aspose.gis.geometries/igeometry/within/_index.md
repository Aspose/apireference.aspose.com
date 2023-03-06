---
title: IGeometry.Within
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリが指定された範囲内にあるかどうかを判断します.
type: docs
weight: 380
url: /ja/net/aspose.gis.geometries/igeometry/within/
---
## Within(Extent) {#within}

このジオメトリが指定された範囲内にあるかどうかを判断します.

```csharp
public bool Within(Extent extent)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| extent | Extent | 程度。 |

### 戻り値

`true`このジオメトリが範囲内にある場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |

### 関連項目

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

このジオメトリが指定されたジオメトリ内にあるかどうかを判断します.

```csharp
public bool Within(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが別のジオメトリの「空間内」にある場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、DE-9IM 交差行列に関して、あるジオメトリが別のジオメトリ内にあるかどうかをテストします。 このメソッドは、 と同等です。 DE-9IM および「空間内」関係の詳細については、OpenGIS Simple Features Specification を参照してください。

```csharp
this.Relate(other, "T*F**F***");
```

### 関連項目

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)


