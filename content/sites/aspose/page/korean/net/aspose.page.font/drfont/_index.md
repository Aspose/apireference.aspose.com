---
title: Class DrFont
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.Font.DrFont 수업. GDI Font 대신 이 클래스를 사용하십시오.
type: docs
weight: 220
url: /ko/net/aspose.page.font/drfont/
---
## DrFont class

GDI+ Font 대신 이 클래스를 사용하십시오.

```csharp
public class DrFont
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [AscentLis](../../aspose.page.font/drfont/ascentlis/) { get; } | 이 글꼴의 셀 어센트(lis). 셀 상단에서 셀 기준선까지의 수직 거리입니다. |
| [AscentPoints](../../aspose.page.font/drfont/ascentpoints/) { get; } | 셀 상승을 포인트 단위로 반환합니다. |
| [CellHeightLis](../../aspose.page.font/drfont/cellheightlis/) { get; } | 이 글꼴(lis)의 셀 높이를 반환합니다. 이것은[`AscentLis`](./ascentlis/) +[`DescentLis`](./descentlis/) . |
| [CellHeightPoints](../../aspose.page.font/drfont/cellheightpoints/) { get; } | 바로가기[`AscentPoints`](./ascentpoints/) +[`DescentPoints`](./descentpoints/) . |
| [DescentLis](../../aspose.page.font/drfont/descentlis/) { get; } | 이 글꼴의 셀 디센트(lis). 셀 하단에서 셀 기준선까지의 수직 거리입니다. |
| [DescentPoints](../../aspose.page.font/drfont/descentpoints/) { get; } | 셀 하강을 포인트 단위로 반환합니다. |
| [FamilyName](../../aspose.page.font/drfont/familyname/) { get; } | 이 글꼴의 이름을 가져옵니다. |
| [IsBold](../../aspose.page.font/drfont/isbold/) { get; } | 이 인스턴스가 굵게 표시되는지 여부를 나타내는 값을 가져옵니다. |
| [IsItalic](../../aspose.page.font/drfont/isitalic/) { get; } | 이 인스턴스가 기울임꼴인지 나타내는 값을 가져옵니다. |
| [LeadingLis](../../aspose.page.font/drfont/leadinglis/) { get; } | 이 글꼴(lis)의 선행을 반환합니다. 이것은[`LineSpacingLis`](./linespacinglis/) -[`CellHeightLis`](./cellheightlis/) . |
| [LeadingPoints](../../aspose.page.font/drfont/leadingpoints/) { get; } | 이 글꼴(lis)의 선행을 반환합니다. 이것은[`LineSpacingLis`](./linespacinglis/) -[`CellHeightLis`](./cellheightlis/) . |
| [LineSpacingLis](../../aspose.page.font/drfont/linespacinglis/) { get; } | 이 글꼴(lis)의 셀 간격을 반환합니다. 두 글리프의 기준선 사이의 수직 거리입니다. |
| [LineSpacingPoints](../../aspose.page.font/drfont/linespacingpoints/) { get; } | 이 글꼴의 셀 간격(포인트)을 반환합니다. 두 글리프의 기준선 사이의 수직 거리입니다. |
| [SizePoints](../../aspose.page.font/drfont/sizepoints/) { get; set; } | 이 글꼴의 크기를 가져옵니다(포인트). |
| [SmallCapsScaleFactor](../../aspose.page.font/drfont/smallcapsscalefactor/) { get; } | SmallCaps 배율 인수를 가져옵니다. |
| [Style](../../aspose.page.font/drfont/style/) { get; } | 이 글꼴의 스타일을 가져옵니다. |
| [StyleEx](../../aspose.page.font/drfont/styleex/) { get; set; } | 이 속성은 글꼴의 style 에 대한 추가 정보를 포함합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| override [Equals](../../aspose.page.font/drfont/equals/)(object) | 지정된Object , 이 인스턴스와 같습니다. |
| [GetCharWidthLis](../../aspose.page.font/drfont/getcharwidthlis/)(char) | 문자 너비 lis를 가져옵니다. |
| [GetCharWidthPoints](../../aspose.page.font/drfont/getcharwidthpoints/)(char) | 문자(포인트)의 너비를 반환합니다. |
| override [GetHashCode](../../aspose.page.font/drfont/gethashcode/)() | 이 인스턴스에 대한 해시 코드를 반환합니다. |
| [GetTextSizePoints](../../aspose.page.font/drfont/gettextsizepoints/)(string) | 텍스트의 측정 텍스트 상자를 포인트 단위로 반환합니다. |
| [GetTextWidthLis](../../aspose.page.font/drfont/gettextwidthlis/)(string) | 텍스트 너비 lis를 가져옵니다. |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints)(string) | 텍스트 너비 포인트를 가져옵니다. |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints_1)(string, int, int) | 텍스트 너비 포인트를 가져옵니다. |
| [Replace](../../aspose.page.font/drfont/replace/)(DrFont) | 글꼴 내용 바꾸기 |
| static [IsPoorlyRenderedByGdiPlus](../../aspose.page.font/drfont/ispoorlyrenderedbygdiplus/)(string) | "Microsoft Sans Serif" 글꼴에 대해 True를 반환합니다. 이것은 GDI+에 의해 제대로 렌더링되지 않습니다. Test286 및 Gemini-6959. 를 참조하십시오. |

### 또한보십시오

* 네임스페이스 [Aspose.Page.Font](../../aspose.page.font/)
* 집회 [Aspose.Page](../../)


