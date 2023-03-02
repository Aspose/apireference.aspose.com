---
title: GeographicDatum.GeographicDatum
second_title: .NET API 참조를 위한 Aspose.GIS
description: GeographicDatum 건설자. 새 인스턴스를 만듭니다.
type: docs
weight: 10
url: /ko/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

새 인스턴스를 만듭니다.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| name | String | 이 데이텀의 이름입니다. |
| ellipsoid | Ellipsoid | 이 데이텀의 타원체. null일 수 없습니다. |
| toWgs84Parameters | BursaWolfParameters | 이 데이텀의 좌표를 WGS84 데이텀의 좌표로 변환하기 위해 부르사 울프 공식에 지정할 수 있는 매개변수. 이 데이텀이 WGS84에 가깝고 변환이 필요하지 않은 경우 모든 값이 0으로 설정된 부르사 울프 매개변수를 전달합니다. If null, ToWgs84는 다음으로 설정됩니다.[`IsNull`](../../bursawolfparameters/isnull/) 매개변수. |
| identifier | Identifier | 이 데이텀의 식별자입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | ellipsoid null입니다. |

### 또한보십시오

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* 집회 [Aspose.GIS](../../../)


