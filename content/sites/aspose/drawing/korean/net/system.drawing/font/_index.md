---
title: Class Font
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Font 수업. 글꼴 크기 및 스타일 특성을 포함하여 텍스트의 특정 형식을 정의합니다. 이 클래스는 상속될 수 없습니다.
type: docs
weight: 500
url: /ko/net/system.drawing/font/
---
## Font class

글꼴, 크기 및 스타일 특성을 포함하여 텍스트의 특정 형식을 정의합니다. 이 클래스는 상속될 수 없습니다.

```csharp
public sealed class Font : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Font](font/#constructor)(Font, FontStyle) | 의 새 인스턴스를 초기화합니다.`Font` 클래스는 지정된 기존Font 그리고FontStyle 열거형.. |
| [Font](font/#constructor_1)(FontFamily, float) | 의 새 인스턴스를 초기화합니다.`Font` 클래스. |
| [Font](font/#constructor_7)(string, float) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기를 사용하는 클래스. |
| [Font](font/#constructor_2)(FontFamily, float, FontStyle) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기와 스타일을 사용하는 클래스.. |
| [Font](font/#constructor_6)(FontFamily, float, GraphicsUnit) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기와 단위를 사용하는 클래스. 스타일을 다음으로 설정합니다.Regular . |
| [Font](font/#constructor_8)(string, float, FontStyle) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기와 스타일을 사용하는 클래스. |
| [Font](font/#constructor_12)(string, float, GraphicsUnit) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기와 단위를 사용하는 클래스. 스타일은 다음과 같이 설정됩니다.Regular . |
| [Font](font/#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기, 스타일 및 단위를 사용하는 클래스. |
| [Font](font/#constructor_9)(string, float, FontStyle, GraphicsUnit) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기, 스타일 및 단위를 사용하는 클래스. |
| [Font](font/#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기, 스타일, 단위 및 문자 집합을 사용하는 클래스.. |
| [Font](font/#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | 의 새 인스턴스를 초기화합니다.`Font`지정된 크기, 스타일, 단위 및 문자 집합을 사용하는 클래스. |
| [Font](font/#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기, 스타일, 단위 및 문자 집합을 사용하는 클래스.. |
| [Font](font/#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | 의 새 인스턴스를 초기화합니다.`Font` 지정된 크기, 스타일, 단위 및 문자 집합을 사용하는 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Bold](../../system.drawing/font/bold/) { get; } | 이 여부를 나타내는 값을 가져옵니다.Font 굵게. |
| [FontFamily](../../system.drawing/font/fontfamily/) { get; } | 가져오기FontFamily 이와 관련된Font . |
| [GdiCharSet](../../system.drawing/font/gdicharset/) { get; } | GDI 문자 집합을 지정하는 바이트 값을 가져옵니다.Font 사용합니다. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont/) { get; } | 이 여부를 나타내는 값을 가져옵니다.Font GDI 세로 글꼴에서 파생됩니다.. |
| [Height](../../system.drawing/font/height/) { get; } | 이 글꼴의 줄 간격을 가져옵니다. |
| [IsSystemFont](../../system.drawing/font/issystemfont/) { get; } | 글꼴이 의 구성원인지 여부를 나타내는 값을 가져옵니다.SystemFonts . |
| [Italic](../../system.drawing/font/italic/) { get; } | 이 여부를 나타내는 값을 가져옵니다.Font 기울임꼴입니다. |
| [Name](../../system.drawing/font/name/) { get; } | 이것의 얼굴 이름을 얻습니다.Font . |
| [OriginalFontName](../../system.drawing/font/originalfontname/) { get; } | 원래 지정된 글꼴의 이름을 가져옵니다. |
| [Size](../../system.drawing/font/size/) { get; } | 이것의 전각 크기를 얻습니다.Font the 에서 지정한 단위로 측정Unit 속성. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints/) { get; } | 이것의 전각 크기(포인트)를 가져옵니다.Font . |
| [Strikeout](../../system.drawing/font/strikeout/) { get; } | 이 여부를 나타내는 값을 가져옵니다.Font font. 를 통해 수평선을 지정합니다. |
| [Style](../../system.drawing/font/style/) { get; } | 이에 대한 스타일 정보를 가져옵니다.Font . |
| [SystemFontName](../../system.drawing/font/systemfontname/) { get; } | IsSystemFont 속성이 true를 반환하는 경우 시스템 글꼴의 이름을 가져옵니다. |
| [Underline](../../system.drawing/font/underline/) { get; } | 이 여부를 나타내는 값을 가져옵니다.Font 밑줄이 그어져 있습니다. |
| [Unit](../../system.drawing/font/unit/) { get; } | 이에 대한 측정 단위를 가져옵니다.Font . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../system.drawing/font/clone/)() | 이것의 정확한 복사본을 만듭니다.Font . |
| [Dispose](../../system.drawing/font/dispose/)() | 이에서 사용하는 모든 리소스를 해제합니다.Font . |
| override [Equals](../../system.drawing/font/equals/)(object) | 지정된 개체가Font 그리고 같은FontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , 및Unit 이와 같은 속성 값Font . |
| override [GetHashCode](../../system.drawing/font/gethashcode/)() | 이에 대한 해시 코드를 가져옵니다.Font . |
| [GetHeight](../../system.drawing/font/getheight/#getheight)() | 이 글꼴의 줄 간격을 픽셀 단위로 반환합니다. |
| [GetHeight](../../system.drawing/font/getheight/#getheight_1)(float) | 높이를 픽셀 단위로 반환합니다.Font지정된 수직 해상도로 장치에 그려질 때. |
| [GetHeight](../../system.drawing/font/getheight/#getheight_2)(Graphics) | 지정된 문자의 현재 단위로 줄 간격을 반환합니다.Graphics , 이 글꼴의. |
| override [ToString](../../system.drawing/font/tostring/)() | 사람이 읽을 수 있는 문자열 표현을 반환합니다.Font . |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


