---
title: Geometry.GetDistanceTo
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. 이 기하학과 지정된 기하학 사이의 최소 거리를 계산합니다.
type: docs
weight: 240
url: /ko/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

이 기하학과 지정된 기하학 사이의 최소 거리를 계산합니다.

```csharp
public double GetDistanceTo(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 거리를 찾을 지오메트리입니다. |

### 반환 값

두 도형이 모두[`IsEmpty`](../isempty/) - 도형의 가장 가까운 지점 사이의 거리. 하나 이상의 도형이 비어 있으면 -1이 반환됩니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


