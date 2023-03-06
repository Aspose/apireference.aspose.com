---
title: ProjectedSpatialReferenceSystemParameters.AddProjectionParameter
second_title: .NET API 참조를 위한 Aspose.GIS
description: ProjectedSpatialReferenceSystemParameters 방법. 이 SRS에 투영 매개변수를 추가합니다. 해당 이름의 매개변수가 이미 추가된 경우  업데이트하십시오.
type: docs
weight: 100
url: /ko/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/
---
## ProjectedSpatialReferenceSystemParameters.AddProjectionParameter method

이 SRS에 투영 매개변수를 추가합니다. 해당 이름의 매개변수가 이미 추가된 경우 - 업데이트하십시오.

```csharp
public void AddProjectionParameter(string parameterName, double value)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| parameterName | String | 투영 매개변수의 이름입니다. |
| value | Double | 매개변수 값. 값의 단위는 다음과 같아야 합니다.[`LinearUnit`](../linearunit/) 또는[`AngularUnit`](../../geographicspatialreferencesystem/angularunit/) ~의[`Base`](../base/) . |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | *parameterName* null입니다. |

### 또한보십시오

* class [ProjectedSpatialReferenceSystemParameters](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../projectedspatialreferencesystemparameters/)
* 집회 [Aspose.GIS](../../../)


