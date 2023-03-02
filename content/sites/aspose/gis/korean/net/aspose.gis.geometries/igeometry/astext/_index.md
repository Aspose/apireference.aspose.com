---
title: IGeometry.AsText
second_title: .NET API 참조를 위한 Aspose.GIS
description: IGeometry 방법. 이 기하학을 WellKnown Text 표현으로 변환합니다.
type: docs
weight: 120
url: /ko/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

이 기하학을 Well-Known Text 표현으로 변환합니다.

```csharp
public string AsText()
```

### 반환 값

이 지오메트리의 Well-Known Text 표현입니다.

### 비고

이 방법의 출력은Iso WKT 변종.

### 또한보십시오

* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

이 기하학을 Well-Known Text 표현으로 변환합니다.

```csharp
public string AsText(WktVariant variant)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| variant | WktVariant | 사용할 잘 알려진 텍스트 변형입니다. |

### 반환 값

이 지오메트리의 Well-Known Text 표현입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| NotSupportedException | 요청된 WKT 변형에서 지오메트리가 지원되지 않습니다. 다음 지오메트리는 다음 지오메트리에서만 지원됩니다.IsoWKT 변형: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) 다른 모든 형상은 모든 WKT 변형에서 지원됩니다. |
| ArgumentOutOfRangeException | *variant* 유효하지 않습니다[`WktVariant`](../../wktvariant/). |

### 또한보십시오

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

이 기하학을 Well-Known Text 표현으로 변환합니다.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| variant | WktVariant | 사용할 잘 알려진 텍스트 변형입니다. |
| format | NumericFormat | 문자열로 변환하기 위한 좌표 형식입니다. 참조[`NumericFormat`](../../../aspose.gis/numericformat/) 그것을 얻기 위해. |

### 반환 값

이 지오메트리의 Well-Known Text 표현입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| NotSupportedException | 요청한 WKT 변형에서 기하학을 표현할 수 없습니다. 현재 이것은 when 에 발생합니다.[`HasCurveGeometry`](../hascurvegeometry/) 기하학의`true` WKT 변형 is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* 유효하지 않습니다[`WktVariant`](../../wktvariant/). |

### 또한보십시오

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)


