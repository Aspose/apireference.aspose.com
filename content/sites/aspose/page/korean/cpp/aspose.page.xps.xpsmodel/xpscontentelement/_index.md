---
title: "Aspose::Page::XPS::XpsModel::XpsContentElement 클래스"
linktitle: "XpsContentElement"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsContentElement 클래스. C++에서 XPS 콘텐츠 요소인 Canvas, Path 및 Glyphs의 기능을 캡슐화합니다."
type: docs
weight: 700
url: /ko/cpp/aspose.page.xps.xpsmodel/xpscontentelement/
---
## XpsContentElement class


[XPS](../../aspose.page.xps/) 콘텐츠 요소인 Canvas, Path 및 Glyphs의 기능을 캡슐화합니다.

```cpp
class XpsContentElement : public Aspose::Page::XPS::XpsModel::XpsHyperlinkElement
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Clip](./get_clip/)() | 요소의 렌더링 영역을 제한하는 경로 기하학 인스턴스를 반환/설정합니다. |
| [get_Opacity](./get_opacity/)() const | 요소의 균일한 투명도를 정의하는 값을 반환/설정합니다. |
| [get_OpacityMask](./get_opacitymask/)() | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 반환/설정합니다. 단, 요소의 서로 다른 영역에 대해 다른 알파 값을 허용합니다. |
| [get_RenderTransform](./get_rendertransform/)() | 요소 및 모든 자식 요소(있는 경우)의 모든 속성에 대한 새로운 좌표계를 설정하는 아핀 변환 행렬을 반환/설정합니다. |
| [set_Clip](./set_clip/)(System::SharedPtr\<XpsPathGeometry\>) | 요소의 렌더링 영역을 제한하는 경로 기하학 인스턴스를 반환/설정합니다. |
| [set_Opacity](./set_opacity/)(float) | 요소의 균일한 투명도를 정의하는 값을 반환/설정합니다. |
| [set_OpacityMask](./set_opacitymask/)(System::SharedPtr\<XpsBrush\>) | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 반환/설정합니다. 단, 요소의 서로 다른 영역에 대해 다른 알파 값을 허용합니다. |
| [set_RenderTransform](./set_rendertransform/)(System::SharedPtr\<XpsMatrix\>) | 요소 및 모든 자식 요소(있는 경우)의 모든 속성에 대한 새로운 좌표계를 설정하는 아핀 변환 행렬을 반환/설정합니다. |
## 또 보기

* Class [XpsHyperlinkElement](../xpshyperlinkelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
