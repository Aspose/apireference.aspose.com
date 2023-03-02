---
title: Geometry.Difference
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. 이 기하학에서 지정된 기하학을 뺍니다.
type: docs
weight: 180
url: /ko/net/aspose.gis.geometries/geometry/difference/
---
## Geometry.Difference method

이 기하학에서 지정된 기하학을 뺍니다.

```csharp
public IGeometry Difference(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 뺄 형상입니다. |

### 반환 값

이 지오메트리와 인수의 차이를 나타내는 지오메트리입니다. 결과 지오메트리는 이 지오메트리에는 있지만 인수에는 없는 포인트 세트를 포함합니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | *other* ~이다`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


