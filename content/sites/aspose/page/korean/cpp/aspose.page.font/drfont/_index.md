---
title: "Aspose::Page::Font::DrFont 클래스"
linktitle: "DrFont"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::Font::DrFont 클래스. C++에서 GDI+ Font 대신 이 클래스를 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/aspose.page.font/drfont/
---
## DrFont class


GDI+ [Font](../) 대신 이 클래스를 사용하십시오.

```cpp
class DrFont : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 지정된 [System::Object](../../system/object/)가 이 인스턴스와 같은지 여부를 결정합니다. |
| [get_AscentLis](./get_ascentlis/)() | 이 글꼴의 셀 상승(lis). 셀 상단에서 셀 기준선까지의 수직 거리입니다. |
| [get_AscentPoints](./get_ascentpoints/)() | 포인트 단위로 셀 상승 값을 반환합니다. |
| [get_CellHeightLis](./get_cellheightlis/)() | 이 글꼴의 셀 높이(lis)를 반환합니다. 이는 [AscentLis](../) + [DescentLis](../)의 단축키입니다. |
| [get_CellHeightPoints](./get_cellheightpoints/)() | [AscentPoints](../) + [DescentPoints](../)에 대한 단축키입니다. |
| [get_DescentLis](./get_descentlis/)() | 이 글꼴의 셀 하강(lis)입니다. 이는 셀 하단에서 셀 기준선까지의 수직 거리입니다. |
| [get_DescentPoints](./get_descentpoints/)() | 포인트 단위로 셀 하강 값을 반환합니다. |
| [get_FamilyName](./get_familyname/)() | 이 글꼴의 이름을 가져옵니다. |
| [get_IsBold](./get_isbold/)() | 이 인스턴스가 굵게 표시되는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsItalic](./get_isitalic/)() | 이 인스턴스가 이탤릭인지 여부를 나타내는 값을 가져옵니다. |
| [get_LeadingLis](./get_leadinglis/)() | 이 글꼴의 리딩(lis)을 반환합니다. 이는 [LineSpacingLis](../) - [CellHeightLis](../)의 단축키입니다. |
| [get_LeadingPoints](./get_leadingpoints/)() | 이 글꼴의 리딩(lis)을 반환합니다. 이는 [LineSpacingLis](../) - [CellHeightLis](../)의 단축키입니다. |
| [get_LineSpacingLis](./get_linespacinglis/)() | 이 글꼴의 셀 간격(lis)을 반환합니다. 이는 두 글리프의 기준선 사이의 수직 거리입니다. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | 이 글꼴의 셀 간격(포인트)을 반환합니다. 이는 두 글리프의 기준선 사이의 수직 거리입니다. |
| [get_SizePoints](./get_sizepoints/)() | 이 글꼴의 크기(포인트)를 가져옵니다. |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | 글꼴 대문자를 가져옵니다. |
| [get_Style](./get_style/)() | TrueType 글꼴을 가져옵니다. |
| [get_StyleEx](./get_styleex/)() | 이 속성은 글꼴 스타일에 대한 추가 정보를 포함합니다. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | 문자 너비(lis)를 가져옵니다. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | 문자의 너비(포인트)를 반환합니다. |
| [GetHashCode](./gethashcode/)() const override | 이 인스턴스에 대한 해시 코드를 반환합니다. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | 텍스트의 측정 텍스트 박스를 포인트 단위로 반환합니다. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | 텍스트 너비(lis)를 가져옵니다. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | 텍스트 너비(포인트)를 가져옵니다. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | 텍스트 너비(포인트)를 가져옵니다. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | "Microsoft Sans Serif" 글꼴에 대해 True를 반환합니다. 이 글꼴은 GDI+에서 제대로 렌더링되지 않습니다. Test286 및 Gemini-6959를 참조하십시오. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | 글꼴 내용을 교체합니다. |
| [set_SizePoints](./set_sizepoints/)(float) | 이 글꼴의 크기(포인트)를 가져옵니다. |
| [set_StyleEx](./set_styleex/)(int16_t) | 이 속성은 글꼴 스타일에 대한 추가 정보를 포함합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
