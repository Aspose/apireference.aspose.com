---
title: Class NumericFormat
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.NumericFormat 수업. NumericFormat text. 에서 일반적인 숫자 유형의 형식을 지정하는 데 사용됩니다.
type: docs
weight: 1290
url: /ko/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` text. 에서 일반적인 숫자 유형의 형식을 지정하는 데 사용됩니다.

```csharp
public abstract class NumericFormat
```

## 속성

| 이름 | 설명 |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | 문자열이 로 변환된 숫자 값이 동일한 숫자 값으로 다시 구문 분석되도록 변환하고 시도합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | 과학 표기법 없이 숫자를 고정 소수점 텍스트로 변환합니다. |
| static [General](../../aspose.gis/numericformat/general/)(int) | 숫자 유형과 정밀도 지정자가 있는지 여부에 따라 숫자를 고정 소수점 또는 과학적 표기법인 로 변환합니다. 사용을 권장합니다. |

### 비고

세 가지 유형이 있습니다.`NumericFormat` :  일반 - 고정 소수점 또는 과학적 표기법. 일부 자릿수는 중요합니다. RoundTrip - 고정 소수점 또는 과학 표기법. 최대 자릿수가 중요합니다. 플랫 - 고정 소수점 표기법. 일부 자릿수는 중요합니다. A`NumericFormat` 로 설정할 수 있습니다[`IGeometry`](../../aspose.gis.geometries/igeometry/) ~을 통해[`AsText`](../../aspose.gis.geometries/igeometry/astext/) 형상을 WKT(Well-Known Text) 표현으로 변환할 때 숫자 형식을 지정하기 위해.

### 또한보십시오

* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


