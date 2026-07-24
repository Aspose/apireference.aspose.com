---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs 클래스"
linktitle: "XpsGlyphs"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs 클래스. Glyphs 요소 기능을 캡슐화하는 클래스. 이 요소는 단일 글꼴에서 균일하게 형식이 지정된 텍스트 구간을 나타냅니다. 정확한 렌더링에 필요한 정보를 제공하고 C++에서 뷰어가 검색 및 선택 기능을 지원합니다."
type: docs
weight: 1500
url: /ko/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Glyphs 요소 기능을 캡슐화하는 클래스. 이 요소는 단일 글꼴에서 균일하게 서식이 지정된 텍스트 실행을 나타냅니다. 정확한 렌더링에 필요한 정보를 제공하고 뷰어에서 검색 및 선택 기능을 지원합니다.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 이 글리프들을 복제합니다. |
| [get_BidiLevel](./get_bidilevel/)() const | Unicode 알고리즘 양방향 중첩 수준을 지정하는 값을 반환/설정합니다. 짝수 값은 왼쪽에서 오른쪽 레이아웃을 의미하고, 홀수 값은 오른쪽에서 왼쪽 레이아웃을 의미합니다. 오른쪽에서 왼쪽 레이아웃은 첫 번째 글리프의 오른쪽에 실행 시작점을 두며, 양의 전진 폭(왼쪽으로 이동을 나타냄)을 사용하여 이후 글리프를 이전 글리프의 왼쪽에 배치합니다. |
| [get_Fill](./get_fill/)() | 렌더링된 글리프의 형태를 채우는 데 사용되는 브러시를 반환/설정합니다. |
| [get_Font](./get_font/)() | 요소 텍스트를 조판하는 데 사용되는 **TrueType** 글꼴의 폰트 리소스를 반환합니다. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | 그리기 표면 단위로 폰트 크기를 반환/설정합니다. 이는 유효 좌표 공간 단위의 부동 소수점 값으로 표현됩니다. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | 글리프가 옆으로 회전했음을 나타내는 값을 반환/설정합니다. 원점은 회전되지 않은 글리프의 상단 중앙으로 정의됩니다. |
| [get_OriginX](./get_originx/)() const | 런에서 첫 번째 글리프의 x 좌표를 반환/설정합니다. 좌표는 유효 좌표 공간 단위로 표시됩니다. |
| [get_OriginY](./get_originy/)() const | 런에서 첫 번째 글리프의 y 좌표를 반환/설정합니다. 좌표는 유효 좌표 공간 단위로 표시됩니다. |
| [get_StyleSimulations](./get_stylesimulations/)() const | 스타일 시뮬레이션을 지정하는 값을 반환/설정합니다. |
| [get_UnicodeString](./get_unicodestring/)() const | Glyphs 요소에 의해 렌더링된 텍스트 문자열을 반환/설정합니다. 텍스트는 유니코드 코드 포인트로 지정됩니다. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Unicode 알고리즘 양방향 중첩 수준을 지정하는 값을 반환/설정합니다. 짝수 값은 왼쪽에서 오른쪽 레이아웃을 의미하고, 홀수 값은 오른쪽에서 왼쪽 레이아웃을 의미합니다. 오른쪽에서 왼쪽 레이아웃은 첫 번째 글리프의 오른쪽에 실행 시작점을 두며, 양의 전진 폭(왼쪽으로 이동을 나타냄)을 사용하여 이후 글리프를 이전 글리프의 왼쪽에 배치합니다. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | 렌더링된 글리프의 형태를 채우는 데 사용되는 브러시를 반환/설정합니다. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | 그리기 표면 단위로 폰트 크기를 반환/설정합니다. 이는 유효 좌표 공간 단위의 부동 소수점 값으로 표현됩니다. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | 글리프가 옆으로 회전했음을 나타내는 값을 반환/설정합니다. 원점은 회전되지 않은 글리프의 상단 중앙으로 정의됩니다. |
| [set_OriginX](./set_originx/)(float) | 런에서 첫 번째 글리프의 x 좌표를 반환/설정합니다. 좌표는 유효 좌표 공간 단위로 표시됩니다. |
| [set_OriginY](./set_originy/)(float) | 런에서 첫 번째 글리프의 y 좌표를 반환/설정합니다. 좌표는 유효 좌표 공간 단위로 표시됩니다. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | 스타일 시뮬레이션을 지정하는 값을 반환/설정합니다. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Glyphs 요소에 의해 렌더링된 텍스트 문자열을 반환/설정합니다. 텍스트는 유니코드 코드 포인트로 지정됩니다. |
## 또 보기

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
