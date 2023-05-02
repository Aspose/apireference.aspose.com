---
title: Struct SizeF
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.SizeF 구조체. 일반적으로 직사각형의 너비와 높이인 부동 소수점 숫자의 정렬된 쌍을 저장합니다.
type: docs
weight: 1090
url: /ko/net/system.drawing/sizef/
---
## SizeF structure

일반적으로 직사각형의 너비와 높이인 부동 소수점 숫자의 정렬된 쌍을 저장합니다.

```csharp
public struct SizeF : IEquatable<SizeF>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [SizeF](sizef/#constructor_1)(PointF) | 의 새 인스턴스를 초기화합니다.`SizeF` 구조체. |
| [SizeF](sizef/#constructor_2)(SizeF) | 의 새 인스턴스를 초기화합니다.`SizeF` 구조체. |
| [SizeF](sizef/#constructor)(float, float) | 지정된 차원에서 SizeF 구조의 새 인스턴스를 초기화합니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Height](../../system.drawing/sizef/height/) { get; set; } | 이 SizeF 구조의 세로 구성 요소를 가져오거나 설정합니다. |
| [IsEmpty](../../system.drawing/sizef/isempty/) { get; } | 이 여부를 나타내는 값을 가져옵니다.SizeF 구조체의 너비와 높이가 0입니다. |
| [Width](../../system.drawing/sizef/width/) { get; set; } | 이 SizeF 구조의 가로 구성 요소를 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Add](../../system.drawing/sizef/add/)(SizeF, SizeF) | 너비와 높이를 하나 더합니다.SizeF 구조를 다른 너비와 높이로SizeF 구조. |
| static [Subtract](../../system.drawing/sizef/subtract/)(SizeF, SizeF) | 너비와 높이를 뺍니다.SizeF 다른 너비와 높이의 구조SizeF 구조. |
| override [Equals](../../system.drawing/sizef/equals/#equals_1)(object) | 지정된 개체가SizeF 이와 같은 치수의 구조SizeF 구조. |
| [Equals](../../system.drawing/sizef/equals/#equals)(SizeF) | 다른 여부를 테스트합니다.`SizeF` 구조는 이것과 같은 크기를 가집니다.`SizeF` 구조. |
| override [GetHashCode](../../system.drawing/sizef/gethashcode/)() | 이에 대한 해시 코드를 반환합니다.SizeF 구조. |
| [ToPointF](../../system.drawing/sizef/topointf/)() | 변환SizeF 에 구조PointF 구조. |
| [ToSize](../../system.drawing/sizef/tosize/)() | 변환SizeF 에 구조Size 구조. |
| override [ToString](../../system.drawing/sizef/tostring/)() | 이것의 속성을 변환합니다.`SizeF` 사람이 읽을 수 있는 string. |
| [operator +](../../system.drawing/sizef/op_addition/) | 너비와 높이를 하나 더합니다.SizeF 구조를 다른 너비와 높이로SizeF 구조. |
| [operator /](../../system.drawing/sizef/op_division/) | 나누기`SizeF` 에 의해Single 생산`SizeF` . |
| [operator ==](../../system.drawing/sizef/op_equality/) | 두SizeF 구조가 동일합니다. |
| [explicit operator](../../system.drawing/sizef/op_explicit/) | 지정된`SizeF` ~에게[`PointF`](../pointf/) . |
| [operator !=](../../system.drawing/sizef/op_inequality/) | 두SizeF 구조가 다릅니다. |
| [operator *](../../system.drawing/sizef/op_multiply/#op_multiply) | 곱하기`SizeF` 에 의해Single 생산`SizeF` . (2 operators) |
| [operator -](../../system.drawing/sizef/op_subtraction/) | 너비와 높이를 뺍니다.SizeF 다른 너비와 높이의 구조SizeF 구조. |

## 필드

| 이름 | 설명 |
| --- | --- |
| static readonly [Empty](../../system.drawing/sizef/empty/) | 가져오기SizeF 를 가지고 있는 구조Height 및Width 0. 의 값 |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


