---
title: Extent.Intersects
second_title: .NET API 참조를 위한 Aspose.GIS
description: Extent 방법. 이 범위가 인수와 교차하는지 여부를 결정합니다.
type: docs
weight: 190
url: /ko/net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

이 범위가 인수와 교차하는지 여부를 결정합니다.

```csharp
public bool Intersects(Extent extent)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| extent | Extent | 또 다른 범위. |

### 반환 값

이 범위가 인수와 교차하는지 여부를 나타내는 값입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 이 정도와 논거는 둘 다 아니다.`null` 서로 같지 않습니다. |

### 또한보십시오

* class [Extent](../)
* 네임스페이스 [Aspose.Gis](../../extent/)
* 집회 [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

이 범위가 인수와 교차하는지 여부를 결정합니다.

```csharp
public bool Intersects(IGeometry geometry)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| geometry | IGeometry | 교차를 테스트할 지오메트리 |

### 반환 값

이 범위가 인수와 교차하는지 여부를 나타내는 값입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 이 정도와 논거는 둘 다 아니다.`null` 서로 같지 않습니다. |

### 또한보십시오

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* 네임스페이스 [Aspose.Gis](../../extent/)
* 집회 [Aspose.GIS](../../../)


