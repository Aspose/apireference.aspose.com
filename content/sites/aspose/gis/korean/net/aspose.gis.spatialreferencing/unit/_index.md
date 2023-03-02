---
title: Class Unit
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.Unit 수업. 측정 단위를 나타냅니다.
type: docs
weight: 2290
url: /ko/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

측정 단위를 나타냅니다.

```csharp
public class Unit : IdentifiableObject
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | 각도를 나타내는 단위를 가져옵니다. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | 미터를 나타내는 단위를 가져옵니다. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | 라디안을 나타내는 단위를 가져옵니다. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 이 개체 식별자가 EPSG 식별자이면 해당 코드를 반환합니다. 그렇지 않으면 -1. 를 반환합니다. |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | 길이 단위인 경우 미터 계수, 각도 단위인 경우 라디안 계수. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 이 식별 가능한 개체의 식별자입니다. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 이 개체의 이름입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | 인수를 이 인스턴스에서 설명하는 단위로 변환합니다. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | 이 인스턴스에서 설명하는 단위의 인수를 라디안 또는 미터로 변환합니다. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |

### 또한보십시오

* class [IdentifiableObject](../identifiableobject/)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


