---
title: Class StringFormat
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.StringFormat 수업. 텍스트 레이아웃 정보예 정렬 방향 및 탭 정지 디스플레이 조작예 줄임표 삽입 및 국가 숫자 대체 및 OpenType 기능을 캡슐화합니다. 이 클래스는 상속될 수 없습니다.
type: docs
weight: 1130
url: /ko/net/system.drawing/stringformat/
---
## StringFormat class

텍스트 레이아웃 정보(예: 정렬, 방향 및 탭 정지) 디스플레이 조작(예: 줄임표 삽입 및 국가 숫자 대체) 및 OpenType 기능을 캡슐화합니다. 이 클래스는 상속될 수 없습니다.

```csharp
public sealed class StringFormat : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [StringFormat](stringformat/#constructor)() | 의 새 인스턴스를 초기화합니다.`StringFormat` 클래스. |
| [StringFormat](stringformat/#constructor_1)(StringFormat) | 의 새 인스턴스를 초기화합니다.`StringFormat` 지정된 기존의 class StringFormat object. |
| [StringFormat](stringformat/#constructor_2)(StringFormatFlags) | 의 새 인스턴스를 초기화합니다.`StringFormat`지정된 가 있는 클래스StringFormatFlags 열거형. |
| [StringFormat](stringformat/#constructor_3)(StringFormatFlags, int) | 의 새 인스턴스를 초기화합니다.`StringFormat` 지정된 클래스[`StringFormatFlags`](../stringformatflags/) 열거 및 언어. |

## 속성

| 이름 | 설명 |
| --- | --- |
| static [GenericDefault](../../system.drawing/stringformat/genericdefault/) { get; } | 일반 기본값을 가져옵니다.StringFormat object. |
| static [GenericTypographic](../../system.drawing/stringformat/generictypographic/) { get; } | 일반 타이포그래피를 가져옵니다.StringFormat object. |
| [Alignment](../../system.drawing/stringformat/alignment/) { get; set; } | 수직면의 텍스트 정렬 정보를 가져오거나 설정합니다. |
| [DigitSubstitutionLanguage](../../system.drawing/stringformat/digitsubstitutionlanguage/) { get; } | 지역 숫자가 서부 숫자로 대체될 때 사용되는 언어를 가져옵니다. |
| [DigitSubstitutionMethod](../../system.drawing/stringformat/digitsubstitutionmethod/) { get; } | 숫자 대체에 사용할 메서드를 가져옵니다. |
| [FormatFlags](../../system.drawing/stringformat/formatflags/) { get; set; } | 가져오거나 설정합니다.StringFormatFlags 서식 정보를 포함하는 열거형. |
| [HotkeyPrefix](../../system.drawing/stringformat/hotkeyprefix/) { get; set; } | 가져오거나 설정합니다.HotkeyPrefix이에 대한 객체StringFormat object. |
| [LineAlignment](../../system.drawing/stringformat/linealignment/) { get; set; } | 수평면의 선 정렬을 가져오거나 설정합니다. |
| [Trimming](../../system.drawing/stringformat/trimming/) { get; set; } | 가져오거나 설정합니다.StringTrimming 이에 대한 열거StringFormat object. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../system.drawing/stringformat/clone/)() | 이것의 정확한 사본을 만듭니다`StringFormat` 물체. |
| [Dispose](../../system.drawing/stringformat/dispose/)() | 이에서 사용하는 모든 리소스를 해제합니다.StringFormat object. |
| [GetTabStops](../../system.drawing/stringformat/gettabstops/)(out float) | 이에 대한 탭 중지를 가져옵니다.StringFormat object. |
| [SetDigitSubstitution](../../system.drawing/stringformat/setdigitsubstitution/)(int, StringDigitSubstitute) | 로컬 숫자가 서부 숫자로 대체될 때 사용할 언어 및 방법을 지정합니다. |
| [SetMeasurableCharacterRanges](../../system.drawing/stringformat/setmeasurablecharacterranges/)(CharacterRange[]) | 배열을 지정합니다.CharacterRange 에 대한 호출로 측정된 문자 범위를 나타내는 구조MeasureCharacterRanges 방법. |
| [SetTabStops](../../system.drawing/stringformat/settabstops/)(float, float[]) | 이에 대한 탭 중지를 설정합니다.StringFormat object. |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


