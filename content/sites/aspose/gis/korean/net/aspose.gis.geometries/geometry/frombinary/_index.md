---
title: Geometry.FromBinary
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. WellKnown Binary 표현에서 형상을 생성합니다.
type: docs
weight: 460
url: /ko/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

Well-Known Binary 표현에서 형상을 생성합니다.

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| wkb | Byte[] | 기하학의 Well-Known Binary 표현. |

### 반환 값

인수로 표시되는 기하 도형입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수가 null입니다. |
| NotSupportedException | 인수는 지원되지 않는 유형의 도형을 나타냅니다. |
| FormatException | 인수가 유효한 Well-Known Binary가 아닙니다. |

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

Well-Known Binary 표현에서 형상을 생성합니다.

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| wkb | Byte[] | 기하학의 Well-Known Binary 표현. |
| spatialReferenceSystem | SpatialReferenceSystem | 형상에 할당할 공간 참조 시스템입니다. |

### 반환 값

인수로 표시되는 기하 도형입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수가 null입니다. |
| NotSupportedException | 인수는 지원되지 않는 유형의 도형을 나타냅니다. |
| FormatException | 인수가 유효한 Well-Known Binary가 아닙니다. |

### 비고

지오메트리 뒤에 추가 바이트가 있는 경우 aFormatException 예외가 발생했습니다.

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


