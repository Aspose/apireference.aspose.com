---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry 클래스"
linktitle: "XpsPathGeometry"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry 클래스. PathGeometry 속성 요소 기능을 캡슐화하는 클래스. 이 요소는 C++에서 Figures 속성이나 하위 PathFigure 요소로 지정된 경로 도형 집합을 포함합니다."
type: docs
weight: 3200
url: /ko/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


PathGeometry 속성 요소 기능을 캡슐화하는 클래스. 이 요소는 Figures 속성이나 자식 PathFigure 요소로 지정된 경로 피겨 집합을 포함합니다.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | 마지막 경로 도형의 하위 세그먼트 목록에 경로 세그먼트를 추가합니다. |
| [Clone](./clone/)() | 이 경로 기하학을 복제합니다. |
| [get_FillRule](./get_fillrule/)() const | 기하학적 도형의 교차 영역을 결합하여 영역을 형성하는 방식을 지정하는 값을 반환/설정합니다. |
| [get_PathFigures](./get_pathfigures/)() | 하위 경로 도형 목록을 반환합니다. |
| [get_Transform](./get_transform/)() override | 채우기, 클리핑 또는 스트로크에 사용되기 전에 경로 기하학의 모든 하위 및 후손 요소에 적용되는 로컬 행렬 변환을 설정하는 어파인 변환 행렬을 반환/설정합니다. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | *index* 위치에서 마지막 경로 도형의 하위 세그먼트 목록에 경로 세그먼트를 삽입합니다. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | 마지막 경로 도형의 하위 세그먼트 목록에서 경로 세그먼트를 제거합니다. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | *index* 위치에서 마지막 경로 도형의 하위 세그먼트 목록에서 경로 세그먼트를 제거합니다. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | 기하학적 도형의 교차 영역을 결합하여 영역을 형성하는 방식을 지정하는 값을 반환/설정합니다. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | 채우기, 클리핑 또는 스트로크에 사용되기 전에 경로 기하학의 모든 하위 및 후손 요소에 적용되는 로컬 행렬 변환을 설정하는 어파인 변환 행렬을 반환/설정합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |
## 또 보기

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
