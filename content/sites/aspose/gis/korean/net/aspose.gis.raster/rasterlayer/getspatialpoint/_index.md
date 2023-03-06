---
title: RasterLayer.GetSpatialPoint
second_title: .NET API 참조를 위한 Aspose.GIS
description: RasterLayer 방법. 지정된 열과 행을 공간 좌표로 변환합니다.
type: docs
weight: 150
url: /ko/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

지정된 열과 행을 공간 좌표로 변환합니다.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| cellX | Int32 | 열 값(x 좌표)입니다. 번호 매기기는 0부터 시작합니다. |
| cellY | Int32 | 행의 값(y 좌표)입니다. 번호 매기기는 0부터 시작합니다. |

### 반환 값

열과 행이 주어진 왼쪽 위 모서리의 x 좌표를 반환합니다.

### 비고

매개변수 중 하나가 래스터의 각 차원 범위를 벗어나면 래스터의 그리드가 래스터의 범위 밖에서 적용 가능하다고 가정하고 래스터 외부의 좌표를 반환합니다.

### 또한보십시오

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* 네임스페이스 [Aspose.Gis.Raster](../../rasterlayer/)
* 집회 [Aspose.GIS](../../../)


