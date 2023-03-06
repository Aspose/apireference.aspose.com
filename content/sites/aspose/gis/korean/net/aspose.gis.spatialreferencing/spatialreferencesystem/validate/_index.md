---
title: SpatialReferenceSystem.Validate
second_title: .NET API 참조를 위한 Aspose.GIS
description: SpatialReferenceSystem 방법. 이 SRS가 유효한지 확인하십시오.
type: docs
weight: 240
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

이 SRS가 유효한지 확인하십시오.

```csharp
public abstract bool Validate(out string errorMessage)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| errorMessage | String& | 메서드가 반환되는 경우`false` 그러면 이것은 무효에 대한 설명입니다. |

### 반환 값

`true` SRS가 유효한 경우,`false` 그렇지 않으면.

### 비고

유효한 SRS에는 유효한 타원체가 있어야 합니다. - 지리적 SRS에는 정확히 하나의 동/서 축, 정확히 하나의 북쪽/남쪽 축 및 선택적 위/아래 axis 가 있어야 합니다(지리적 SRS가 2D 지리적 SRS 및 수직 SRS). - 투영된 SRS에는 정확히 하나의 동/서 축, 정확히 하나의 북쪽/남쪽 축 및 선택적인 위/아래 axis 가 있어야 합니다(투영된 SRS가 2D 지리적 SRS와 수직 SRS의 복합인 경우 선택적 축이 있음). - Geocentric SRS에는 정확히 하나의 동/서 축, 정확히 하나의 북쪽/남쪽 축 및 정확히 하나의 기타 축이 있어야 합니다. - 수직 SRS에는 정확히 하나의 위/아래 축이 있어야 합니다. - 로컬 SRS에는 하나 이상의 축이 있어야 합니다. 축 방향이 측정되지 않습니다. - 복합 SRS는 유효한 지리적/투영 및 유효한 수직 SRS의 조합이어야 합니다.

### 또한보십시오

* class [SpatialReferenceSystem](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 집회 [Aspose.GIS](../../../)


