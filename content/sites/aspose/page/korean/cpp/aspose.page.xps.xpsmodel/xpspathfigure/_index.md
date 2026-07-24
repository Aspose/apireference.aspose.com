---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure 클래스"
linktitle: "XpsPathFigure"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure 클래스. PathFigure 요소 기능을 캡슐화하는 클래스. 이 요소는 C++에서 하나 이상의 직선 또는 곡선 세그먼트 집합으로 구성됩니다."
type: docs
weight: 3100
url: /ko/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


PathFigure 요소 기능을 캡슐화하는 클래스. 이 요소는 하나 이상의 선 또는 곡선 세그먼트 집합으로 구성됩니다.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 이 경로 피겨를 복제합니다. |
| [get_IsClosed](./get_isclosed/)() const | 경로 피겨가 닫혀 있는지 여부를 나타내는 값을 반환/설정합니다. |
| [get_IsFilled](./get_isfilled/)() const | 경로 피겨가 포함된 경로 기하학의 면적을 계산하는 데 사용되는지 여부를 나타내는 값을 반환/설정합니다. |
| [get_Segments](./get_segments/)() | 자식 경로 세그먼트 목록을 반환합니다. |
| [get_StartPoint](./get_startpoint/)() const | 경로 피겨의 첫 번째 세그먼트 시작점을 반환/설정합니다. |
| [set_IsClosed](./set_isclosed/)(bool) | 경로 피겨가 닫혀 있는지 여부를 나타내는 값을 반환/설정합니다. |
| [set_IsFilled](./set_isfilled/)(bool) | 경로 피겨가 포함된 경로 기하학의 면적을 계산하는 데 사용되는지 여부를 나타내는 값을 반환/설정합니다. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | 경로 피겨의 첫 번째 세그먼트 시작점을 반환/설정합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |
## 또 보기

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
