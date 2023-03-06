---
title: Projection.TryGetParameterValue
second_title: .NET API 참조를 위한 Aspose.GIS
description: Projection 방법. 이 프로젝션의 지정된 이름을 가진 매개변수를 가져옵니다. 해당 매개변수가 없는 경우  반환null .
type: docs
weight: 60
url: /ko/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

이 프로젝션의 지정된 이름을 가진 매개변수를 가져옵니다. 해당 매개변수가 없는 경우 - 반환`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| name | String | 매개변수의 이름입니다. |
| type | ParameterType | 매개변수 유형. 적용되지 않을 단위 계수 정의: 유형이 다음과 같은 경우Linear 그 다음에[`LinearParametersUnit`](../linearparametersunit/) 적용되지 않으며 결과는 미터 단위입니다. if type isAngular 그 다음에[`AngularParametersUnit`](../angularparametersunit/) 적용되지 않으며 결과는 라디안입니다. 유형이 다음과 같은 경우Other매개변수 값은 '있는 그대로' 반환됩니다. |

### 반환 값

지정된 이름의 매개변수 또는`null` 존재하지 않는 경우.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수가 null입니다. |

### 또한보십시오

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../projection/)
* 집회 [Aspose.GIS](../../../)


