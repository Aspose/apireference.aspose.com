---
title: IGeometry.AsBinary
second_title: .NET API 참조를 위한 Aspose.GIS
description: IGeometry 방법. 이 기하학을 WellKnown Binary 표현으로 변환합니다.
type: docs
weight: 100
url: /ko/net/aspose.gis.geometries/igeometry/asbinary/
---
## AsBinary() {#asbinary}

이 기하학을 Well-Known Binary 표현으로 변환합니다.

```csharp
public byte[] AsBinary()
```

### 반환 값

이 지오메트리의 잘 알려진 이진 표현입니다.

### 비고

이 방법의 출력은Iso WKB 변종.

### 또한보십시오

* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

이 기하학을 Well-Known Binary 표현으로 변환합니다.

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| variant | WkbVariant | 사용할 잘 알려진 바이너리 변형입니다. |

### 반환 값

이 지오메트리의 잘 알려진 이진 표현입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| NotSupportedException | 요청한 WKB 변형에서 형상을 나타낼 수 없습니다. 현재 이것은 일 때 발생합니다.[`HasCurveGeometry`](../hascurvegeometry/) 기하학의`true` 및 WKB 변형 is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* 유효하지 않습니다[`WkbVariant`](../../wkbvariant/). |

### 또한보십시오

* enum [WkbVariant](../../wkbvariant/)
* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)


