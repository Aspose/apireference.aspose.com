---
title: Extent.Grow
second_title: .NET API 참조를 위한 Aspose.GIS
description: Extent 방법. 인수를 포함하도록 이 익스텐트를 늘립니다.
type: docs
weight: 160
url: /ko/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

인수를 포함하도록 이 익스텐트를 늘립니다.

```csharp
public void Grow(Extent extent)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| extent | Extent | 기타 정도. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 이 정도와 논거는 둘 다 아니다.`null` 서로 같지 않습니다. |

### 비고

경우[`SpatialReferenceSystem`](../spatialreferencesystem/) 이 SRS의`null` 그런 다음 인수의 SRS로 업데이트됩니다.

### 또한보십시오

* class [Extent](../)
* 네임스페이스 [Aspose.Gis](../../extent/)
* 집회 [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

지정된 점을 포함하도록 이 범위를 늘립니다.

```csharp
public void Grow(double x, double y)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Double | 포함할 X 좌표. |
| y | Double | 포함할 Y 좌표입니다. |

### 또한보십시오

* class [Extent](../)
* 네임스페이스 [Aspose.Gis](../../extent/)
* 집회 [Aspose.GIS](../../../)


