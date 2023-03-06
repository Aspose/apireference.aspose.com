---
title: IGeometry.Touches
second_title: .NET API 참조를 위한 Aspose.GIS
description: IGeometry 방법. 이 기하학과 지정된 기하학이 접촉하는지 결정합니다.
type: docs
weight: 360
url: /ko/net/aspose.gis.geometries/igeometry/touches/
---
## IGeometry.Touches method

이 기하학과 지정된 기하학이 접촉하는지 결정합니다.

```csharp
public bool Touches(IGeometry other)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 기하학. |

### 반환 값

`true` 이 지오메트리가 다른 지오메트리를 "공간적으로 접촉"하는 경우.`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 비고

이 방법은 DE-9IM 교차 행렬 측면에서 형상이 서로 접촉하는지 여부를 테스트합니다. 공통 경계 지점이 하나 이상 있지만 내부 지점이 없는 경우 두 형상이 서로 접촉합니다. 즉: 2[`LineString`](../../linestring/)s는 끝점을 공유하지만 세그먼트를 공유하지 않는 경우 서로 접촉합니다. 두 개의 다각형은 외부 또는 내부 링의 일부를 공유하지만 내부가 겹치지 않는 경우 서로 접촉합니다. 이 방법은 다음과 같습니다. DE-9IM 및 "공간적 접촉" 관계에 대한 자세한 내용은 OpenGIS 단순 기능 사양을 참조하십시오.

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### 또한보십시오

* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)


