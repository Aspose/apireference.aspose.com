---
title: SpatialReferenceSystem.CreateProjected
second_title: .NET API 참조를 위한 Aspose.GIS
description: SpatialReferenceSystem 방법. 맞춤형 매개변수에서 예상 SRS를 생성합니다.
type: docs
weight: 380
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

맞춤형 매개변수에서 예상 SRS를 생성합니다.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | 생성할 매개변수입니다. |
| identifier | Identifier | SRS에 첨부될 식별자. 식별자를 첨부해도 다른 SRS 매개변수는 수정되지 않습니다. 식별자와 SRS 매개변수의 일관성을 유지하는 것은 사용자의 책임입니다. |

### 반환 값

새로운 예상 SRS.

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | 매개변수의 기본 SRS는`null` . 매개변수의 투영 방법은`null` . |

### 또한보십시오

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 집회 [Aspose.GIS](../../../)


