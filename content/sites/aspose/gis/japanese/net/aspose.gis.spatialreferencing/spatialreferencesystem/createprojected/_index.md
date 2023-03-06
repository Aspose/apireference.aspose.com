---
title: SpatialReferenceSystem.CreateProjected
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystem 方法. カスタム パラメータから予測 SRS を作成します
type: docs
weight: 380
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

カスタム パラメータから予測 SRS を作成します。

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | 作成元のパラメーター。 |
| identifier | Identifier | SRS に添付される識別子。識別子をアタッチしても、他の SRS パラメータは変更されません. 識別子と SRS パラメータの一貫性を確保するのはあなた次第です. |

### 戻り値

新しい予測 SRS。

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | パラメータのベース SRS は`null`. パラメータの投影法は`null` . |

### 関連項目

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 組み立て [Aspose.GIS](../../../)


