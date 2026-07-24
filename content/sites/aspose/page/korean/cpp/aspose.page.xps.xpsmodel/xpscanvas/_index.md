---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas 클래스"
linktitle: "XpsCanvas"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas 클래스. 캔버스 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 요소들을 함께 그룹화합니다. 예를 들어, Glyphs와 Path 요소를 캔버스에 그룹화하여 단위(하이퍼링크 대상)로 식별하거나, C++에서 각 자식 및 상위 요소에 복합 속성 값을 적용할 수 있습니다."
type: docs
weight: 500
url: /ko/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Canvas 요소 기능을 캡슐화하는 클래스. 이 요소는 요소들을 함께 그룹화합니다. 예를 들어, Glyphs와 Path 요소를 캔버스에 그룹화하여 단위(하이퍼링크 대상)로 식별하거나 각 자식 및 상위 요소에 복합 속성 값을 적용할 수 있습니다.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(T) | 이 캔버스의 자식 목록에 요소를 추가합니다. |
| [AddCanvas](./addcanvas/)() | 이 캔버스의 자식 목록에 새 캔버스를 추가합니다. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 이 캔버스의 자식 목록에 새 글리프를 추가합니다. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | 이 캔버스의 자식 목록에 새 경로를 추가합니다. |
| [Clone](./clone/)() | 이 캔버스를 복제합니다. |
| [get_EdgeMode](./get_edgemode/)() const | 캔버스 내 경로 가장자리의 렌더링 방식을 제어하는 값을 반환/설정합니다. |
| [Insert](./insert/)(int32_t, T) | 이 캔버스의 자식 목록에 *index* 위치에 요소를 삽입합니다. |
| [InsertCanvas](./insertcanvas/)(int32_t) | 이 캔버스의 자식 목록에 *index* 위치에 새 캔버스를 삽입합니다. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | 이 캔버스의 자식 목록에 *index* 위치에 새 글리프를 삽입합니다. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | 이 캔버스의 자식 목록에 *index* 위치에 새 경로를 삽입합니다. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | 캔버스 내 경로 가장자리의 렌더링 방식을 제어하는 값을 반환/설정합니다. |
## 또 보기

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
