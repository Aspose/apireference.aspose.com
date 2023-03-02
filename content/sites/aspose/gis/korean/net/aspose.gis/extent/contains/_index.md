---
title: Extent.Contains
second_title: .NET API 참조를 위한 Aspose.GIS
description: Extent 방법. 이 범위에 인수로 정의된 좌표가 포함되어 있는지 여부를 결정합니다.
type: docs
weight: 120
url: /ko/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

이 범위에 인수로 정의된 좌표가 포함되어 있는지 여부를 결정합니다.

```csharp
public bool Contains(double x, double y)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Double | 좌표의 X. |
| y | Double | 좌표의 Y. |

### 반환 값

좌표가 경계 상자 안에 있는지 여부를 나타내는 값입니다.

### 비고

이 경계에 위치한 좌표[`Extent`](../) are 는 이것에 포함된 것으로 간주됩니다.[`Extent`](../) .

### 또한보십시오

* class [Extent](../)
* 네임스페이스 [Aspose.Gis](../../extent/)
* 집회 [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

이 익스텐트에 인수가 포함되어 있는지 여부를 결정합니다.

```csharp
public bool Contains(Extent extent)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| extent | Extent | 또 다른 범위. |

### 반환 값

이 익스텐트에 인수가 포함되어 있는지 여부를 나타내는 값입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 이 정도와 논거는 둘 다 아니다.`null` 서로 같지 않습니다. |

### 비고

이 경계에 위치한 좌표[`Extent`](../) are 는 이것에 포함된 것으로 간주됩니다.[`Extent`](../) . 이러한 이유로 동일한 익스텐트는 서로를 포함하는 것으로 간주 됩니다.

### 또한보십시오

* class [Extent](../)
* 네임스페이스 [Aspose.Gis](../../extent/)
* 집회 [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

이 익스텐트에 인수가 포함되어 있는지 여부를 결정합니다.

```csharp
public bool Contains(IGeometry geometry)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| geometry | IGeometry | 포함 여부를 테스트할 지오메트리입니다. |

### 반환 값

이 익스텐트에 인수가 포함되어 있는지 여부를 나타내는 값입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 이 정도와 논거는 둘 다 아니다.`null` 서로 같지 않습니다. |

### 비고

이 경계에 위치한 좌표[`Extent`](../) are 는 이것에 포함된 것으로 간주됩니다.[`Extent`](../) .

### 또한보십시오

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* 네임스페이스 [Aspose.Gis](../../extent/)
* 집회 [Aspose.GIS](../../../)


