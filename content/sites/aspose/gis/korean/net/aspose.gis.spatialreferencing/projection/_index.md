---
title: Class Projection
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.Projection 수업. 경도 위도를 x y로 변환하는 매개변수가 있는 프로젝션 방법을 나타냅니다.
type: docs
weight: 2240
url: /ko/net/aspose.gis.spatialreferencing/projection/
---
## Projection class

(경도, 위도)를 (x, y)로 변환하는 매개변수가 있는 프로젝션 방법을 나타냅니다.

```csharp
public class Projection : IdentifiableObject
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | 각도 매개변수에 사용되는 단위. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 이 개체 식별자가 EPSG 식별자이면 해당 코드를 반환합니다. 그렇지 않으면 -1. 를 반환합니다. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 이 식별 가능한 개체의 식별자입니다. |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | 선형 매개변수에 사용되는 단위. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 이 개체의 이름입니다. |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | 이 projection 에 지정된 매개 변수 이름의 열거 가능한 컬렉션을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | 이 프로젝션의 지정된 이름을 가진 매개변수를 가져옵니다. |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | 두 프로젝션이 동일하다고 결정합니다. 동등한 프로젝션은 (경도, 위도)를 (x, y)에 the 같은 방식으로 매핑합니다. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | 이 프로젝션의 지정된 이름을 가진 매개변수를 가져옵니다. 해당 매개변수가 없는 경우 - 반환`null` . |

### 또한보십시오

* class [IdentifiableObject](../identifiableobject/)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


