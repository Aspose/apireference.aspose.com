---
title: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush 클래스"
linktitle: "XpsTransformableBrush"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush 클래스. 변형 가능한 브러시 요소( SolidColorBrush 제외)의 공통 기능을 캡슐화하는 클래스입니다."
type: docs
weight: 4300
url: /ko/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


변형 가능한 브러시 요소( SolidColorBrush 제외)의 공통 기능을 캡슐화하는 클래스.

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Transform](./get_transform/)() override | 브러시의 좌표 공간에 적용되는 행렬 변환을 반환/설정합니다. Transform 속성은 현재 유효한 렌더 변환과 연결되어 브러시 로컬의 유효한 렌더 변환을 생성합니다. 브러시의 뷰포트는 로컬 유효 렌더 변환을 사용하여 변환됩니다. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | 브러시의 좌표 공간에 적용되는 행렬 변환을 반환/설정합니다. Transform 속성은 현재 유효한 렌더 변환과 연결되어 브러시 로컬의 유효한 렌더 변환을 생성합니다. 브러시의 뷰포트는 로컬 유효 렌더 변환을 사용하여 변환됩니다. |
## 또 보기

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
