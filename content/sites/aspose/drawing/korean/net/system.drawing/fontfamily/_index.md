---
title: Class FontFamily
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.FontFamily 수업. 비슷한 기본 디자인과 스타일의 특정 변형이 있는 서체 그룹을 정의합니다. 이 클래스는 상속될 수 없습니다.
type: docs
weight: 510
url: /ko/net/system.drawing/fontfamily/
---
## FontFamily class

비슷한 기본 디자인과 스타일의 특정 변형이 있는 서체 그룹을 정의합니다. 이 클래스는 상속될 수 없습니다.

```csharp
public sealed class FontFamily : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [FontFamily](fontfamily/#constructor)(string) | 의 새 인스턴스를 초기화합니다.`FontFamily` 지정된 이름의 클래스. |
| [FontFamily](fontfamily/#constructor_1)(string, FontCollection) | 의 새 인스턴스를 초기화합니다.`FontFamily` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| static [GenericMonospace](../../system.drawing/fontfamily/genericmonospace/) { get; } | 일반 모노스페이스를 가져옵니다.FontFamily . |
| static [GenericSansSerif](../../system.drawing/fontfamily/genericsansserif/) { get; } | 일반 산세리프체 가져오기FontFamily object. |
| static [GenericSerif](../../system.drawing/fontfamily/genericserif/) { get; } | 일반 세리프 가져오기FontFamily . |
| [Name](../../system.drawing/fontfamily/name/) { get; } | 이 이름을 가져옵니다.FontFamily . |
| static [Families](../../system.drawing/fontfamily/families/) { get; } | 모든 것을 포함하는 배열을 가져옵니다.FontFamily 현재 그래픽 컨텍스트와 관련된 개체. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Dispose](../../system.drawing/fontfamily/dispose/)() | 이에서 사용하는 모든 리소스를 해제합니다.FontFamily . |
| override [Equals](../../system.drawing/fontfamily/equals/)(object) | 지정된 개체가FontFamily 그리고 이것과 동일하다FontFamily . |
| [GetCellAscent](../../system.drawing/fontfamily/getcellascent/)(FontStyle) | 디자인 단위의 셀 상승을 반환합니다.FontFamily 지정된 style. |
| [GetCellDescent](../../system.drawing/fontfamily/getcelldescent/)(FontStyle) | 의 셀 디센트를 디자인 단위로 반환합니다.FontFamily 지정된 style. |
| [GetEmHeight](../../system.drawing/fontfamily/getemheight/)(FontStyle) | 지정된 스타일에 대한 EM 사각형의 글꼴 디자인 단위로 높이를 가져옵니다. |
| override [GetHashCode](../../system.drawing/fontfamily/gethashcode/)() | 이에 대한 해시 코드를 가져옵니다.FontFamily . |
| [GetLineSpacing](../../system.drawing/fontfamily/getlinespacing/)(FontStyle) | 디자인 단위의 줄 간격을 반환합니다.FontFamily 지정된 스타일의. 줄 간격은 텍스트의 두 연속 줄 기준선 사이의 수직 거리입니다. |
| [GetName](../../system.drawing/fontfamily/getname/)(int) | 지정된 언어로 이 이름을 반환합니다.FontFamily . |
| [IsStyleAvailable](../../system.drawing/fontfamily/isstyleavailable/)(FontStyle) | 지정된FontStyle 열거형을 사용할 수 있습니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


