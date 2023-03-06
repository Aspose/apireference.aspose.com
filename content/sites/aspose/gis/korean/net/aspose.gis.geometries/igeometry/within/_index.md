---
title: IGeometry.Within
second_title: .NET API 참조를 위한 Aspose.GIS
description: IGeometry 방법. 이 기하학이 지정된 범위 내에 있는지 여부를 결정합니다.
type: docs
weight: 380
url: /ko/net/aspose.gis.geometries/igeometry/within/
---
## Within(Extent) {#within}

이 기하학이 지정된 범위 내에 있는지 여부를 결정합니다.

```csharp
public bool Within(Extent extent)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| extent | Extent | 정도. |

### 반환 값

`true` 이 지오메트리가 범위 내에 있으면;`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |

### 또한보십시오

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

이 기하학이 지정된 기하학 내에 있는지 여부를 결정합니다.

```csharp
public bool Within(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 기하학. |

### 반환 값

`true` 이 지오메트리가 다른 지오메트리 "내부에 공간적으로" 있는 경우.`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 비고

이 방법은 DE-9IM 교차 행렬의 관점에서 하나의 기하학이 다른 기하학 내에 있는지 여부를 테스트합니다. 이 방법은 다음과 같습니다. DE-9IM 및 "공간적으로" 관계에 대한 자세한 내용은 OpenGIS 단순 기능 사양을 참조하십시오.

```csharp
this.Relate(other, "T*F**F***");
```

### 또한보십시오

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)


