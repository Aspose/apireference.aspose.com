---
title: IGeometry.Intersection
second_title: .NET API 참조를 위한 Aspose.GIS
description: IGeometry 방법. 이 기하학과 지정된 기하학 사이의 교차점을 만듭니다.
type: docs
weight: 260
url: /ko/net/aspose.gis.geometries/igeometry/intersection/
---
## IGeometry.Intersection method

이 기하학과 지정된 기하학 사이의 교차점을 만듭니다.

```csharp
public IGeometry Intersection(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 교차점을 계산할 지오메트리입니다. |

### 반환 값

이 기하학과 인수의 교집합을 나타내는 기하학. 이 지오메트리와 인수 모두에 존재하는 결과 지오메트리 contains 포인트 세트.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | *other* ~이다`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 또한보십시오

* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)


