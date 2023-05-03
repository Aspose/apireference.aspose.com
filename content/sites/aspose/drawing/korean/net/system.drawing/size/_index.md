---
title: Struct Size
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Size 구조체. 일반적으로 사각형의 너비와 높이인 정수의 정렬된 쌍을 저장합니다.
type: docs
weight: 1080
url: /ko/net/system.drawing/size/
---
## Size structure

일반적으로 사각형의 너비와 높이인 정수의 정렬된 쌍을 저장합니다.

```csharp
public struct Size : IEquatable<Size>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Size](size/#constructor_1)(Point) | 의 새 인스턴스를 초기화합니다.`Size` 지정된 구조체Point . |
| [Size](size/#constructor)(int, int) | 의 새 인스턴스를 초기화합니다.`Size` 지정된 차원의 구조체. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Height](../../system.drawing/size/height/) { get; set; } | 이 항목의 수직 구성 요소를 가져오거나 설정합니다.Size . |
| [IsEmpty](../../system.drawing/size/isempty/) { get; } | 이 여부를 나타내는 값을 가져옵니다.Size 너비와 높이는 0. 입니다. |
| [Width](../../system.drawing/size/width/) { get; set; } | 이것의 수평 구성 요소를 가져오거나 설정합니다.Size . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Add](../../system.drawing/size/add/)(Size, Size) | 너비와 높이를 하나 더합니다.Size 의 너비와 높이에 대한 구조Size 구조. |
| static [Ceiling](../../system.drawing/size/ceiling/)(SizeF) | 지정된SizeF 에 구조Size values 를 반올림하여 구조Size 구조를 다음으로 높은 정수 값으로 바꿉니다. |
| static [Round](../../system.drawing/size/round/)(SizeF) | 지정된SizeF 에 구조Sizestructure 값을 반올림하여SizeF 구조를 가장 가까운 정수 값으로 변환합니다. |
| static [Subtract](../../system.drawing/size/subtract/)(Size, Size) | 너비와 높이를 뺍니다.Size 다른 너비와 높이의 구조Size 구조. |
| static [Truncate](../../system.drawing/size/truncate/)(SizeF) | 지정된SizeF 에 구조Size structure 의 값을 잘라서SizeF 구조를 다음으로 낮은 정수 값으로 바꿉니다. |
| override [Equals](../../system.drawing/size/equals/#equals_1)(object) | 지정된 개체가Size 이것과 같은 dimension 를 가진Size . |
| [Equals](../../system.drawing/size/equals/#equals)(Size) | 다른 여부를 테스트합니다.`Size` 구조는 이것과 같은 크기를 가집니다.`Size` 구조. |
| override [GetHashCode](../../system.drawing/size/gethashcode/)() | 이에 대한 해시 코드를 반환합니다.Size 구조. |
| override [ToString](../../system.drawing/size/tostring/)() | 이것의 속성을 변환합니다.`Size` 사람이 읽을 수 있는 string. |
| [operator +](../../system.drawing/size/op_addition/) | 너비와 높이를 하나 더합니다.Size 의 너비와 높이에 대한 구조Size 구조. |
| [operator /](../../system.drawing/size/op_division/#op_division) | 나누기`Size` 의해Int32 생산`Size` . (2 operators) |
| [operator ==](../../system.drawing/size/op_equality/) | 두Size 구조가 동일합니다. |
| [explicit operator](../../system.drawing/size/op_explicit/) | 지정된Size ~에게Point . |
| [implicit operator](../../system.drawing/size/op_implicit/) | 지정된Size ~에게SizeF . |
| [operator !=](../../system.drawing/size/op_inequality/) | 두Size 구조가 다릅니다. |
| [operator *](../../system.drawing/size/op_multiply/#op_multiply) | 곱하기`Size` 의해Int32 생산`Size` . (4 operators) |
| [operator -](../../system.drawing/size/op_subtraction/) | 너비와 높이를 뺍니다.Size 다른 너비와 높이의 구조Size 구조. |

## 필드

| 이름 | 설명 |
| --- | --- |
| static readonly [Empty](../../system.drawing/size/empty/) | 가져오기Size 를 가지고 있는 구조Height 그리고Width 0. 의 값 |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


