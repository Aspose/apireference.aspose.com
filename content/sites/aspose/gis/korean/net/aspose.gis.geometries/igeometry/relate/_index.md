---
title: IGeometry.Relate
second_title: .NET API 참조를 위한 Aspose.GIS
description: IGeometry 방법. 이 기하학과 지정된 기하학의 DE9IM 교차 행렬이 제공된 패턴과 일치하는지 결정합니다.
type: docs
weight: 290
url: /ko/net/aspose.gis.geometries/igeometry/relate/
---
## IGeometry.Relate method

이 기하학과 지정된 기하학의 DE-9IM 교차 행렬이 제공된 패턴과 일치하는지 결정합니다.

```csharp
public bool Relate(IGeometry other, string intersectionPatternMatrix)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| other | IGeometry | 기하학. |
| intersectionPatternMatrix | String | 일치할 패턴입니다. 길이가 9인 문자열이어야 합니다. 문자열의 각 문자는 교차점의 예상 치수를 나타냅니다. 문자 0 - 도형 내부 사이.문자 1 - 이 기하학의 내부와 다른 기하학의 경계 사이.문자 2 - 이 기하학의 내부와 다른 기하학의 외부 사이.캐릭터 3 - 이 지오메트리의 경계와 다른 지오메트리의 내부 사이.문자 4 - 기하학의 경계 사이.문자 5 - 이 지오메트리의 경계와 다른 지오메트리의 외부 사이.문자 6 - 이 기하학의 외부와 다른 기하학의 내부 사이.문자 7 - 이 기하학의 외부와 다른 기하학의 경계 사이.문자 8 - 기하학의 외부 사이. 각 문자의 가능한 값은 다음과 같습니다. * - 모든 값;F - 교차로 없음;T - 모든 교차로;0 - 점 교차점(예: 공유 점);1 - 선 교차점(예: 선의 공유 세그먼트);2 - 영역 교차점(예: 다각형의 공유 부분); 예를 들어, 교차 패턴 "F0*******"는 도형 내부 와 도형 경계 간의 교차가 점이어야 한다는 것을 의미합니다. 교차 행렬에 대한 자세한 내용은 OpenGIS 단순 기능 사양을 참조하세요. 패턴. |

### 반환 값

`true` 이 교차 행렬이 패턴과 일치하면;`false` 그렇지 않으면.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | *other* ~이다`null`. |
| ArgumentException | 지오메트리 중 하나가 유효하지 않아 작업을 완료할 수 없습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 도형의 수는 동일하지 않습니다. 다음을 사용할 수 있습니다.[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) 형상을 동일한 공간 참조 시스템으로 변환하기 위해. |

### 비고

이 방법은 DE-9IM 교차 행렬을 만들고 패턴 와 일치시킵니다. DE-9IM 교차 행렬에 대한 자세한 내용은 OpenGIS 단순 기능 사양을 참조하십시오.

### 예

다음 코드:  는 도형이 공간적으로 동일한지 감지합니다.

```csharp
geometry.Relate(other, "T*F**FFF*");
```

### 또한보십시오

* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)


