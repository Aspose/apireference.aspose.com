---
title: Class Ellipsoid
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.Ellipsoid 수업. 타원체는 지구에 가까운 타원체를 나타냅니다.
type: docs
weight: 2070
url: /ko/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

타원체는 지구에 가까운 타원체를 나타냅니다.

```csharp
public class Ellipsoid : IdentifiableObject
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | 새 타원체를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | 에어리 타원체. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 타원체. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 타원체. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 타원체. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 이 개체 식별자가 EPSG 식별자이면 해당 코드를 반환합니다. 그렇지 않으면 -1. 를 반환합니다. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 이 식별 가능한 개체의 식별자입니다. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | 타원체의 역 평탄화. 이것이 구형인 경우 0입니다. |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | 이 타원체가 구인지 감지합니다. |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | 타원체가 유효한지 여부를 감지합니다. 반 장축이 0보다 크고 역 편평화가 양수이거나 0과 같습니다. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 이 개체의 이름입니다. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | 타원체의 반 장축. |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | 타원체의 반 단축. 구형인 경우 반 장축과 같습니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | 두 개의 타원체가 동일한지 확인합니다. 타원체 A가 타원체 B와 동일한 경우 반 장축과 역 편평이 동일합니다. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | 두 개의 타원체가 동일한지 확인합니다. 타원체 A가 타원체 B와 동일한 경우 반 장축과 역 편평이 동일합니다. |

### 또한보십시오

* class [IdentifiableObject](../identifiableobject/)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


