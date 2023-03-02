---
title: Projection.TryGetParameterValue
second_title: Aspose.GIS for .NET API リファレンス
description: Projection 方法. このプロジェクションの指定された名前のパラメーターを取得しますそのようなパラメータがない場合  を返しますnull .
type: docs
weight: 60
url: /ja/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

このプロジェクションの指定された名前のパラメーターを取得します。そのようなパラメータがない場合 - を返します`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| name | String | パラメータの名前。 |
| type | ParameterType | パラメータのタイプ。 適用されない単位係数を定義します: タイプがLinearそれから[`LinearParametersUnit`](../linearparametersunit/)適用が解除され、結果はメートル単位になります。Angularそれから[`AngularParametersUnit`](../angularparametersunit/)適用が解除され、結果はラジアンになります。タイプが の場合Otherパラメータ値は「そのまま」返されます. |

### 戻り値

指定された名前のパラメータまたは`null`存在しない場合。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数がヌルです。 |

### 関連項目

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../projection/)
* 組み立て [Aspose.GIS](../../../)


