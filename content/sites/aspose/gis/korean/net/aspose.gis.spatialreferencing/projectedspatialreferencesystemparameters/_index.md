---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters 수업. 예상 SRS를 생성하기 위한 매개변수. 일부 매개변수에는 기본값이 있습니다. 일부 매개변수에는 합리적인 기본값이 있으므로 매개변수만 지정할 필요는 없습니다. null 이러한 매개변수에는 기본값이 사용됩니다. ProjectionMethodName 그리고Base 기본값이 없습니다  null 이 속성에 대한 값입니다.
type: docs
weight: 2230
url: /ko/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

예상 SRS를 생성하기 위한 매개변수. 일부 매개변수에는 기본값이 있습니다. 일부 매개변수에는 합리적인 기본값이 있으므로 매개변수만 지정할 필요는 없습니다. `null` 이러한 매개변수에는 기본값이 사용됩니다. [`ProjectionMethodName`](./projectionmethodname/) 그리고[`Base`](./base/) 기본값이 없습니다 - `null` 이 속성에 대한 값입니다.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | 기본 생성자입니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | 축의 순서. 기본값은XY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | 기본 지리적 SRS(프로젝션이 적용되는 SRS). 이 속성을 not으로 설정해야 합니다.`null` 유효한 SRS를 생성하기 위한 값, 이 속성에는 기본값이 없습니다. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | 이 SRS에서 사용할 단위. 기본값은[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | 예상 SRS의 이름. 기본값은 "이름 없음"입니다. |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | 프로젝션 방법의 식별자. 기본값이 없으므로 이 매개변수를 not으로 설정할 수 있습니다.`null` value, 프로젝션에 식별자를 첨부하려는 경우. 그렇게 하는 경우 - 일관성 있는 프로젝션 메서드 이름의 식별자를 확인하는 것은 사용자의 책임입니다(프로젝션 메서드 이름은 이 속성을 설정할 때 변경되지 않음). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | 투영 방법의 이름입니다. 기본값이 없으며 이 매개변수를 not으로 설정해야 합니다.`null` 값, 이후 프로젝션 이름이 없는 프로젝션된 SRS는 쓸모가 없습니다. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | X(가로) 차원을 설명하는 축. 기본값은 동쪽 방향의 축입니다. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Y(수직) 치수를 나타내는 축. 기본값은 북쪽 방향의 축입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | 이 SRS에 투영 매개변수를 추가합니다. 해당 이름의 매개변수가 이미 추가된 경우 - 업데이트하십시오. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | 지정된 이름의 프로젝션 매개변수를 가져옵니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


