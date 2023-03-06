---
title: ProjectedSpatialReferenceSystemParameters.AddProjectionParameter
second_title: Aspose.GIS for .NET API リファレンス
description: ProjectedSpatialReferenceSystemParameters 方法. この SRS に射影パラメータを追加しますそのような名前のパラメータがすでに追加されている場合は更新してください.
type: docs
weight: 100
url: /ja/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/
---
## ProjectedSpatialReferenceSystemParameters.AddProjectionParameter method

この SRS に射影パラメータを追加します。そのような名前のパラメータがすでに追加されている場合は、更新してください.

```csharp
public void AddProjectionParameter(string parameterName, double value)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| parameterName | String | 投影パラメータの名前。 |
| value | Double | パラメータの値。値の単位は[`LinearUnit`](../linearunit/) または[`AngularUnit`](../../geographicspatialreferencesystem/angularunit/)の[`Base`](../base/) . |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | *parameterName*無効である。 |

### 関連項目

* class [ProjectedSpatialReferenceSystemParameters](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../projectedspatialreferencesystemparameters/)
* 組み立て [Aspose.GIS](../../../)


