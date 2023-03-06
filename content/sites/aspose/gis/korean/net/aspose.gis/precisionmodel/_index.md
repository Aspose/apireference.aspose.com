---
title: Class PrecisionModel
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.PrecisionModel 수업. PrecisionModel 좌표의 유효 자릿수를 지정합니다.
type: docs
weight: 1310
url: /ko/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` 좌표의 유효 자릿수를 지정합니다.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## 속성

| 이름 | 설명 |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | 정확한 정밀도 모델을 반환합니다. 정확한 정밀도 모델에 따르면 double 값의 모든 숫자가 중요합니다. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | 이 정밀 모델이 정확한지 여부를 나타내는 값을 가져옵니다. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | 이 정밀도 모델이 반올림되는지 여부를 나타내는 값을 가져옵니다. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | 반올림하는 경우 정밀 모델의 유효 자릿수를 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | 반올림 정밀도 모델을 반환합니다. 반올림 정밀도 모델에 따르면 제한된 자릿수만 중요합니다. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | 현재 개체가 같은 유형의 다른 개체와 같은지 여부를 나타냅니다. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | 현재 개체가 같은 유형의 다른 개체와 같은지 여부를 나타냅니다. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | 기본 해시 함수 역할을 합니다. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | ==. 연산자 구현 |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | 연산자 구현 !=. |

### 비고

PrecisionModel에는 두 가지 유형이 있습니다.  정확한`PrecisionModel` (모든 숫자는 유효함); 반올림`PrecisionModel` (일부 자릿수는 유효합니다). A`PrecisionModel` 로 설정할 수 있습니다[`VectorLayer`](../vectorlayer/) ~을 통해[`DriverOptions`](../driveroptions/) 기하학을 쓰거나 읽을 때 좌표를 반올림하기 위해.

### 또한보십시오

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


