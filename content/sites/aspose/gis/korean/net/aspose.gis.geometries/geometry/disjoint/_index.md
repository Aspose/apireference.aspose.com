---
title: Geometry.Disjoint
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. 이 도형이 지정된 도형과 분리되어 있는지 확인합니다.
type: docs
weight: 190
url: /ko/net/aspose.gis.geometries/geometry/disjoint/
---
## Geometry.Disjoint method

이 도형이 지정된 도형과 분리되어 있는지 확인합니다.

```csharp
public bool Disjoint(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 기하학. |

### 반환 값

`true` 이 기하학이 다른 기하학과 "공간적으로 분리"된 경우.`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 비고

이 방법은 DE-9IM 교차 행렬 측면에서 기하학이 분리되어 있는지 테스트합니다. 기본적으로 두 기하학이 공통점이 없는지 테스트합니다. 이 방법은 다음과 같습니다. DE-9IM에 대한 자세한 내용은 OpenGIS 단순 기능 사양을 참조하십시오.

```csharp
this.Relate(other, "FF*FF****");
```

### 또한보십시오

* method [Intersects](../../igeometry/intersects/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


