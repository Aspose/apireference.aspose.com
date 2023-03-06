---
title: Geometry.AsBinary
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリを WellKnown Binary 表現に変換します
type: docs
weight: 110
url: /ja/net/aspose.gis.geometries/geometry/asbinary/
---
## AsBinary() {#asbinary}

このジオメトリを Well-Known Binary 表現に変換します。

```csharp
public byte[] AsBinary()
```

### 戻り値

このジオメトリの既知のバイナリ表現。

### 備考

このメソッドの出力はIsoWKB バリアント。

### 関連項目

* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

このジオメトリを Well-Known Binary 表現に変換します。

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| variant | WkbVariant | 使用する既知のバイナリ バリアント。 |

### 戻り値

このジオメトリの既知のバイナリ表現。

### 例外

| 例外 | 調子 |
| --- | --- |
| NotSupportedException | 要求された WKB バリアントでジオメトリを表現できません。現在、これは when で発生します[`HasCurveGeometry`](../hascurvegeometry/)ジオメトリの`true`および WKB バリアント is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant*は有効ではありません[`WkbVariant`](../../wkbvariant/). |

### 関連項目

* enum [WkbVariant](../../wkbvariant/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


