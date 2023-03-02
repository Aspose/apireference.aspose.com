---
title: RasterLayer.GetStatistics
second_title: .NET API 참조를 위한 Aspose.GIS
description: RasterLayer 방법. 개수 합계 평균 최소값 최대값으로 구성된 요약 통계를 계산합니다.
type: docs
weight: 160
url: /ko/net/aspose.gis.raster/rasterlayer/getstatistics/
---
## RasterLayer.GetStatistics method

개수, 합계, 평균, 최소값, 최대값으로 구성된 요약 통계를 계산합니다.

```csharp
public RasterStatistics GetStatistics(int bandIndex = 0, bool excludeNodataValue = true)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| bandIndex | Int32 | 밴드의 인덱스입니다. 번호 매기기는 0부터 시작합니다. |
| excludeNodataValue | Boolean | 'nodata' 값을 제외할 수 있습니다. 'excludeNodataValue'가 false로 설정되면 모든 픽셀이 고려됩니다. |

### 반환 값

요약 통계입니다.

### 또한보십시오

* class [RasterStatistics](../../rasterstatistics/)
* class [RasterLayer](../)
* 네임스페이스 [Aspose.Gis.Raster](../../rasterlayer/)
* 집회 [Aspose.GIS](../../../)


