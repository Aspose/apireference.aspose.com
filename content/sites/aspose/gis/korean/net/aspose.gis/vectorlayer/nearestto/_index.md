---
title: VectorLayer.NearestTo
second_title: .NET API 참조를 위한 Aspose.GIS
description: VectorLayer 방법. 제공된 좌표에 가장 가까운 기능을 가져옵니다.
type: docs
weight: 150
url: /ko/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

제공된 좌표에 가장 가까운 기능을 가져옵니다.

```csharp
public Feature NearestTo(double x, double y)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Double | 좌표의 X. |
| y | Double | 좌표의 Y. |

### 반환 값

제공된 좌표에 가장 가까운 피처입니다.

### 또한보십시오

* class [Feature](../../feature/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

제공된 점에 가장 가까운 기능을 가져옵니다.

```csharp
public Feature NearestTo(IPoint point)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| point | IPoint | 요점. |

### 반환 값

제공된 점에 가장 가까운 지형지물입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 포인트는`null`. |
| ArgumentException | 포인트가 비어 있거나 유효하지 않습니다. |

### 또한보십시오

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)


