---
title: Geometry.FromText
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. WellKnown Text 표현에서 기하학을 생성합니다.
type: docs
weight: 470
url: /ko/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

Well-Known Text 표현에서 기하학을 생성합니다.

```csharp
public static IGeometry FromText(string wkt)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| wkt | String | 기하학의 Well-Known Text 표현. |

### 반환 값

인수로 표시되는 기하 도형입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수가 null입니다. |
| NotSupportedException | 인수는 지원되지 않는 유형의 도형을 나타냅니다. |
| FormatException | 인수가 유효한 Well-Known Text가 아닙니다. |

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

Well-Known Text 표현에서 기하학을 생성합니다.

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| wkt | String | 기하학의 Well-Known Text 표현. |
| spatialReferenceSystem | SpatialReferenceSystem | 형상에 할당할 공간 참조 시스템입니다. |

### 반환 값

인수로 표시되는 기하 도형입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수가 null입니다. |
| NotSupportedException | 인수는 지원되지 않는 유형의 도형을 나타냅니다. |
| FormatException | 인수가 유효한 Well-Known Text가 아닙니다. |

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


