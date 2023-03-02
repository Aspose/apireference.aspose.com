---
title: Geometry.Crosses
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. 이 기하학과 지정된 기하학이 교차하는지 결정합니다.
type: docs
weight: 170
url: /ko/net/aspose.gis.geometries/geometry/crosses/
---
## Geometry.Crosses method

이 기하학과 지정된 기하학이 교차하는지 결정합니다.

```csharp
public bool Crosses(IGeometry other)
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
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 비고

이 방법은 기하학이 DE-9IM 교차 행렬의 관점에서 교차하는지 여부를 테스트합니다. 기하학. 즉: 2[`LineString`](../../linestring/) s 십자형, 'X' 문자, LineString 및[`Polygon`](../../polygon/) LineString이 폴리곤의 내부를 통과하는 경우 교차합니다. DE-9IM 및 "공간 교차" 관계에 대한 자세한 내용은 OpenGIS 단순 기능 사양을 참조하세요.

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


