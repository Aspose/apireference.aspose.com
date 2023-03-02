---
title: Geometry.SpatiallyContains
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. 이 도형이 지정된 도형을 공간적으로 포함하는지 여부를 결정합니다.
type: docs
weight: 360
url: /ko/net/aspose.gis.geometries/geometry/spatiallycontains/
---
## Geometry.SpatiallyContains method

이 도형이 지정된 도형을 공간적으로 포함하는지 여부를 결정합니다.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 기하학. |

### 반환 값

`true`이 기하학이 다른 기하학을 "공간적으로 포함"하는 경우.`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 비고

이 방법은 DE-9IM 교차 행렬 측면에서 하나의 지오메트리가 다른 지오메트리를 포함하는지 여부를 테스트합니다. 이 방법은 다음과 같습니다.

```csharp
other.Within(this);
```

### 또한보십시오

* method [Within](../../igeometry/within/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


