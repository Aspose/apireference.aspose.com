---
title: IGeometry.Intersects
second_title: .NET API 참조를 위한 Aspose.GIS
description: IGeometry 방법. 이 기하학이 지정된 범위와 교차하는지 여부를 결정합니다.
type: docs
weight: 270
url: /ko/net/aspose.gis.geometries/igeometry/intersects/
---
## Intersects(Extent) {#intersects}

이 기하학이 지정된 범위와 교차하는지 여부를 결정합니다.

```csharp
public bool Intersects(Extent extent)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| extent | Extent | 정도. |

### 반환 값

`true` 이 지오메트리가 범위와 교차하는 경우;`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |

### 또한보십시오

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

이 기하학과 지정된 기하학이 교차하는지 결정합니다.

```csharp
public bool Intersects(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 기하학. |

### 반환 값

`true` 이 기하학이 다른 기하학을 "공간적으로 교차"하는 경우.`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 비고

이 방법은 다음과 같습니다. 이것은 다음의 부정입니다.[`Disjoint`](../disjoint/) . 보다[`Disjoint`](../disjoint/) 자세한 내용은.

```csharp
!this.Disjoint(other);
```

### 또한보십시오

* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)


