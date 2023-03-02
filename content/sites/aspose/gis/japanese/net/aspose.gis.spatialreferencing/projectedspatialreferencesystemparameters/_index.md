---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters クラス. 投影された SRS を作成するためのパラメーター一部のパラメータにはデフォルトがあります. 一部のパラメータには適切なデフォルトが設定されているためそれらだけを割り当てる必要はありません. nullこれらのパラメータに対してはデフォルト値が使用されます. ProjectionMethodNameとBaseデフォルトはありません  非を割り当てる必要がありますnullこのプロパティの値.
type: docs
weight: 2230
url: /ja/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

投影された SRS を作成するためのパラメーター。一部のパラメータにはデフォルトがあります. 一部のパラメータには適切なデフォルトが設定されているため、それらだけを割り当てる必要はありません. `null`これらのパラメータに対しては、デフォルト値が使用されます. [`ProjectionMethodName`](./projectionmethodname/)と[`Base`](./base/)デフォルトはありません - 非を割り当てる必要があります`null`このプロパティの値.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | デフォルトのコンストラクター。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | 軸の順序。デフォルトはXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | ベースの地理的 SRS (投影が適用される SRS). このプロパティを設定しないようにする必要があります`null`有効な SRS を作成するための値, このプロパティにはデフォルトはありません. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | この SRS で使用される単位。デフォルトは[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | 投影された SRS の名前。デフォルトは「無名」です. |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | 投影法の識別子。デフォルト値はありません。このパラメータを設定しないでください。`null`投影に識別子を付ける場合は、値, 。そうする場合 - 一貫した射影 method name の識別子を確保するのはあなた次第です (このプロパティを設定しても射影法名は変更されません). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | 投影法の名前。デフォルトはありません。このパラメータを設定しないでください。`null`値, since プロジェクション名のないプロジェクション SRS は役に立たない. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | X (水平) 次元を表す軸。デフォルトは東方向の軸です。 |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Y (垂直) 寸法を表す軸。デフォルトは北方向の軸です。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | この SRS に射影パラメータを追加します。そのような名前のパラメータがすでに追加されている場合は、更新してください. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | 指定した名前の投影パラメーターを取得します。 |

### 関連項目

* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


