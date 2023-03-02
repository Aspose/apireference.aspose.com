---
title: Geometry.Overlaps
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. 이 기하학이 지정된 기하학과 겹치는지 여부를 결정합니다.
type: docs
weight: 290
url: /ko/net/aspose.gis.geometries/geometry/overlaps/
---
## Geometry.Overlaps method

이 기하학이 지정된 기하학과 겹치는지 여부를 결정합니다.

```csharp
public bool Overlaps(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 기하학. |

### 반환 값

`true` 이 기하학이 다른 기하학과 "공간적으로 겹치는" 경우.`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 비고

이 방법은 기하학이 DE-9IM 교차 행렬 측면에서 중첩되는지 여부를 테스트합니다. 두 기하학이 공통적인 일부 내부 포인트가 있고 기하학 의 교차가 기하학 자체와 동일한 차원을 갖는 경우 겹칩니다. 2인용Point 기하학 또는 두 가지Surface 기하학 this 메서드는 다음과 같습니다. 2인용Line 기하학 이 방법은 다음과 같습니다: 같지 않은 두 기하학의 경우[`Dimension`](../../igeometry/dimension/) 이 메서드는 항상 반환`false`. DE-9IM 및 "공간적으로 겹치는" 관계에 대한 자세한 내용은 OpenGIS 단순 기능 사양을 참조하십시오.

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


