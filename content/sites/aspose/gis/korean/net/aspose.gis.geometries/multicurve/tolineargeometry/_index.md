---
title: MultiCurve.ToLinearGeometry
second_title: .NET API 참조를 위한 Aspose.GIS
description: MultiCurve 방법. 지정된 값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.용인 .
type: docs
weight: 70
url: /ko/net/aspose.gis.geometries/multicurve/tolineargeometry/
---
## ToLinearGeometry(double) {#tolineargeometry_5}

지정된 값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` .

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| tolerance | Double | `용인`사용. 결과는 다음보다 작음이 보장됩니다.`용인` 형상을 선형화하는 데 필요한 포인트 수가 사분면당 최대값을 초과하지 않는 한, 현재 10000포인트에 해당하는 _곡선 형상에서 멀리 떨어져 있습니다. |

### 반환 값

A[`IMultiLineString`](../../imultilinestring/) 이것에 가깝거나 이에 상응하는[`IMultiCurve`](../../imulticurve/) :  이 개체가[`IMultiLineString`](../../imultilinestring/) 그 자체로 결과는 이 object 와 동일합니다.[`IMultiLineString`](../../imultilinestring/) - 모든 곡선이 선형화되고 새로운`IMultiLineString` is created

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | `용인` 작거나 같음`0` . |
| InvalidOperationException | 이 지오메트리는 유효하지 않으므로 작업을 완료할 수 없습니다. |

### 또한보십시오

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../multicurve/)
* 집회 [Aspose.GIS](../../../)

---

## ToLinearGeometry() {#tolineargeometry_4}

기본값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` .

```csharp
public IMultiLineString ToLinearGeometry()
```

### 반환 값

A[`IMultiLineString`](../../imultilinestring/) 이것에 가깝거나 이에 상응하는[`IMultiCurve`](../../imulticurve/). 이것은 다음과 같습니다.[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) with 기본값`용인` . 기본`용인` s 값은 다음에 따라 다릅니다.[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) 이 기하학의 :  예상 SRS 공차는 0.001미터(SRS 단위)입니다. 지리적 SRS 공차의 경우`1e-5` 도(SRS 단위) 알 수 없는 SRS 허용 오차는 다음과 같습니다.`1e-5` 적용되는 변환에 대한 자세한 내용은[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) 사양.

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | 이 지오메트리는 유효하지 않으므로 작업을 완료할 수 없습니다. |

### 또한보십시오

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../multicurve/)
* 집회 [Aspose.GIS](../../../)


