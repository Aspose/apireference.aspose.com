---
title: IGeometry.GetBuffer
second_title: .NET API 참조를 위한 Aspose.GIS
description: IGeometry 방법. 이 기하학 주변의 버퍼 영역을 계산합니다.
type: docs
weight: 200
url: /ko/net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

이 기하학 주변의 버퍼 영역을 계산합니다.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| distance | Double | 버퍼 영역 너비(공간 참조 단위)입니다. |
| quadrantSegments | Int32 | 90도의 곡률을 근사화하는 데 사용되는 세그먼트 수. 이 숫자가 클수록 더 나은 곡선 근사치가 생성됩니다. 기본값은 30입니다. |

### 반환 값

이 도형에서 지정된 거리 내에 있는 모든 포인트를 나타내는 도형입니다. 결과 유형은 다음 중 하나입니다.[`Null`](../../geometry/null/) ,[`IPolygon`](../../ipolygon/) 또는[`IMultiPolygon`](../../imultipolygon/) .

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | 이 지오메트리는 작업을 완료할 수 없는 방식으로 유효하지 않습니다. |
| ArgumentOutOfRangeException | 사분면 세그먼트가 0. 보다 작거나 같습니다. |

### 또한보십시오

* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)


