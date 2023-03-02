---
title: Class Identifier
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.Identifier クラス. 識別子 オブジェクトの外部記述への参照 を表します WKT から SRS を作成する場合Identifier AUTHORITYキーワードに対応
type: docs
weight: 2160
url: /ja/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

識別子 (オブジェクトの外部記述への参照) を表します。 WKT から SRS を作成する場合、`Identifier` 「AUTHORITY」キーワードに対応。

```csharp
public class Identifier : IEquatable<Identifier>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Identifier](identifier/)(string, string) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | 権限の名前。[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/) . |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | 内のオブジェクトを表現するユニークな方法[`AuthorityName`](./authorityname/) . |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | コードで EPSG 識別子を表す新しい識別子を作成します*epsgCode* . |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | 現在のオブジェクトが同じ型の別のオブジェクトと等しいかどうかを示します。 |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | 指定されたオブジェクトが現在のオブジェクトと等しいかどうかを判断します。 |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | このオブジェクトが有効な EPSG 識別子を表している場合 (たとえば、機関名が「EPSG」で、機関の一意の識別子が整数)、- はそれを返します。それ以外の場合 - -1. を返します |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | デフォルトのハッシュ関数として機能します。 |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | 演算子 ==. を実装します |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | 演算子 !=. を実装します |

### 例

WGS 84 空間参照系には EPSG コード 4326 があるため、次の識別子が含まれている可能性があります: WGS 84 楕円体には EPSG コード 7030 があり、次の識別子が含まれている可能性があります:

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### 関連項目

* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


