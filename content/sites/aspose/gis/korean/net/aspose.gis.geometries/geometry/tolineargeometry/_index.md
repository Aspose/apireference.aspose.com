---
title: Geometry.ToLinearGeometry
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. 기본값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.용인 .
type: docs
weight: 400
url: /ko/net/aspose.gis.geometries/geometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

기본값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` .

```csharp
public IGeometry ToLinearGeometry()
```

### 반환 값

커브 도형이 없는 도형입니다. 이는 다음과 같습니다.[`ToLinearGeometry`](../../igeometry/tolineargeometry/) with 기본값`용인` . 기본`용인` 에 의해 정의된다[`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) 이 기하학의 :  예상 SRS 공차는 0.001미터(SRS 단위)입니다. 지리적 SRS 공차의 경우`1e-5` 도(SRS 단위) 알 수 없는 SRS 허용 오차는 다음과 같습니다.`1e-5` 적용되는 변환에 대한 자세한 내용은[`ToLinearGeometry`](../../igeometry/tolineargeometry/) 사양.

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | 이 지오메트리는 유효하지 않으므로 작업을 완료할 수 없습니다. |

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

지정된 값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` .

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| tolerance | Double | `용인`사용. 결과는 다음보다 작음이 보장됩니다.`용인` 기하학을 선형화하는 데 필요한 포인트 수가 현재 10000포인트인 사분면당 최대값 를 초과하지 않는 한 the 곡선형 기하학에서 멀리 떨어져 있습니다. |

### 반환 값

커브 도형이 없는 도형입니다. 다음 변환이 적용됩니다. CircularString s는 선형화 (로 변환됨LineString 지정된 s*tolerance* )CompoundCurve s가 결합됩니다.`유도선` 에스CurvePolygon s로 변환됩니다.Polygon 에스MultiCurve s로 변환됩니다.MultiLineString 에스MultiSurface s로 변환됩니다.MultiPolygon 에스 결과적으로,[`HasCurveGeometry`](../../igeometry/hascurvegeometry/) 출력 기하학의`false` .

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | `용인` 작거나 같음`0` . |
| InvalidOperationException | 이 지오메트리는 유효하지 않으므로 작업을 완료할 수 없습니다. |

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


