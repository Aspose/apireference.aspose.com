---
title: Geometry.Covers
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. 이 기하학이 지정된 기하학을 포함하는지 여부를 결정합니다.
type: docs
weight: 160
url: /ko/net/aspose.gis.geometries/geometry/covers/
---
## Geometry.Covers method

이 기하학이 지정된 기하학을 포함하는지 여부를 결정합니다.

```csharp
public bool Covers(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 기하학. |

### 반환 값

`true` 이 기하학이 다른 기하학을 "공간적으로 덮는" 경우.`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 비고

이 방법은 DE-9IM 교차 행렬 측면에서 하나의 기하학이 다른 기하학을 덮는지 테스트합니다. 기하학이 다른 기하학의 모든 점을 포함하는 경우 한 기하학이 다른 기하학을 덮습니다. 이 방법은[`SpatiallyContains`](../../igeometry/spatiallycontains/) , 그러나 반환`true` 더 자주, 내부와 경계 지점을 구분하지 않기 때문입니다. 따라서 기하 A가 기하 B의 경계에 있으면[`SpatiallyContains`](../../igeometry/spatiallycontains/) 보고`false` , 이 메서드가 반환하는 동안`true`. 이 방법은 다음과 같습니다.

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### 또한보십시오

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


