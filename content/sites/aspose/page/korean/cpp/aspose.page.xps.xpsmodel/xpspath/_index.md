---
title: "Aspose::Page::XPS::XpsModel::XpsPath class"
linktitle: "XpsPath"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsPath class. Path 요소의 기능을 캡슐화하는 클래스. 이 요소는 고정 페이지에 벡터 그래픽 및 이미지를 추가하는 유일한 수단이며, C++에서 페이지에 렌더링될 단일 벡터 그래픽을 정의합니다."
type: docs
weight: 3000
url: /ko/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Path 요소 기능을 캡슐화하는 클래스. 이 요소는 고정 페이지에 벡터 그래픽 및 이미지를 추가하는 유일한 방법이며, 페이지에 렌더링될 단일 벡터 그래픽을 정의합니다.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 이 경로를 복제합니다. |
| [get_Data](./get_data/)() | 경로의 기하학을 반환/설정합니다. |
| [get_Fill](./get_fill/)() | 경로의 Data 속성으로 지정된 기하학을 그리는 데 사용되는 브러시를 반환/설정합니다. |
| [get_Stroke](./get_stroke/)() | 스트로크를 그리는 데 사용되는 브러시를 반환/설정합니다. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | 외곽선 스트로크의 대시와 간격 길이를 지정하는 배열을 반환/설정합니다. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | 각 대시의 끝이 그려지는 방식을 지정하는 값을 반환/설정합니다. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | 대시 배열 패턴을 반복하는 시작점을 반환/설정합니다. 이 값을 생략하면 대시 배열이 스트로크의 원점에 맞춰집니다. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | 스트로크에서 마지막 대시의 끝 모양을 정의하는 값을 반환/설정합니다. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환/설정합니다. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | 최대 마이터 길이와 스트로크 두께 절반 사이의 비율을 반환/설정합니다. 이 값은 **StrokeLineJoin** 속성이 **Miter**를 지정할 때만 의미가 있습니다. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환/설정합니다. |
| [get_StrokeThickness](./get_strokethickness/)() const | 스트로크 두께를 유효 좌표 공간 단위(경로의 렌더 변환을 포함)로 반환/설정합니다. 스트로크는 Path 요소의 Data 속성으로 지정된 기하학 경계 위에 그려집니다. StrokeThickness의 절반은 Data 속성으로 지정된 기하학 외부로, 나머지 절반은 내부로 확장됩니다. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | 경로의 기하학을 반환/설정합니다. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | 경로의 Data 속성으로 지정된 기하학을 그리는 데 사용되는 브러시를 반환/설정합니다. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | 스트로크를 그리는 데 사용되는 브러시를 반환/설정합니다. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | 외곽선 스트로크의 대시와 간격 길이를 지정하는 배열을 반환/설정합니다. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | 각 대시의 끝이 그려지는 방식을 지정하는 값을 반환/설정합니다. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | 대시 배열 패턴을 반복하는 시작점을 반환/설정합니다. 이 값을 생략하면 대시 배열이 스트로크의 원점에 맞춰집니다. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | 스트로크에서 마지막 대시의 끝 모양을 정의하는 값을 반환/설정합니다. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환/설정합니다. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | 최대 마이터 길이와 스트로크 두께 절반 사이의 비율을 반환/설정합니다. 이 값은 **StrokeLineJoin** 속성이 **Miter**를 지정할 때만 의미가 있습니다. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환/설정합니다. |
| [set_StrokeThickness](./set_strokethickness/)(float) | 스트로크 두께를 유효 좌표 공간 단위(경로의 렌더 변환을 포함)로 반환/설정합니다. 스트로크는 Path 요소의 Data 속성으로 지정된 기하학 경계 위에 그려집니다. StrokeThickness의 절반은 Data 속성으로 지정된 기하학 외부로, 나머지 절반은 내부로 확장됩니다. |
## 또 보기

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
