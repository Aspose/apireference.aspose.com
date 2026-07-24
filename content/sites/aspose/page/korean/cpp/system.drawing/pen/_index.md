---
title: "System::Drawing::Pen class"
linktitle: "Pen"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Pen 클래스. 그려지는 선과 곡선의 색상, 너비 등과 같은 속성을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 1500
url: /ko/cpp/system.drawing/pen/
---
## Pen class


그려지는 선과 곡선의 색상, 너비 등과 같은 속성을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 이 포인터를 함수 인수로 전달하십시오.

```cpp
class Pen : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 현재 객체의 복사본을 반환합니다. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 모든 운영 리소스를 해제합니다. |
| [get_Alignment](./get_alignment/)() const | 현재 [Pen](./) 객체의 정렬을 나타내는 값을 반환합니다. |
| [get_Brush](./get_brush/)() | 이 펜의 [Brush](../brush/) 객체를 반환합니다. |
| [get_Color](./get_color/)() const | 이 펜의 색상을 반환합니다. |
| [get_CompoundArray](./get_compoundarray/)() const | 복합 펜을 지정하는 값 배열을 반환합니다. |
| [get_DashCap](./get_dashcap/)() const | 점선의 양쪽 끝에 사용되는 캡을 나타내는 값을 반환합니다. |
| [get_DashOffset](./get_dashoffset/)() const | 선의 시작점부터 대시 패턴 시작점까지의 거리를 반환합니다. |
| [get_DashPattern](./get_dashpattern/)() const | 점선에서 사용자 정의 대시 패턴을 나타내는 배열을 반환합니다. |
| [get_DashStyle](./get_dashstyle/)() const | 현재 [Pen](./) 객체의 대시 스타일을 나타내는 값을 반환합니다. |
| [get_EndCap](./get_endcap/)() const | 현재 [Pen](./) 객체의 끝 라인 캡을 나타내는 값을 반환합니다. |
| [get_LineJoin](./get_linejoin/)() const | 이 [Pen](./) 객체가 그린 선들이 어떻게 연결되는지를 나타내는 값을 반환합니다. |
| [get_MiterLimit](./get_miterlimit/)() const | 각진 모서리에서 연결부의 두께 제한을 반환합니다. |
| [get_PenType](./get_pentype/)() const | 구현되지 않음. |
| [get_StartCap](./get_startcap/)() const | 현재 [Pen](./) 객체의 시작 라인 캡을 나타내는 값을 반환합니다. |
| [get_Transform](./get_transform/)() | 현재 객체가 나타내는 펜에 대한 기하학적 변환을 지정하는 Matrix 객체의 복사본을 반환합니다. |
| [get_Width](./get_width/)() const | 현재 [Pen](./) 객체의 너비를 반환합니다. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | 현재 객체의 변환 행렬에 지정된 행렬을 곱합니다. |
| [Pen](./pen/)(const Color\&) | 지정된 색상을 나타내는 새로운 [Pen](./) 객체를 생성합니다. |
| [Pen](./pen/)(const Color\&, float) | 지정된 색상과 너비를 나타내는 새로운 [Pen](./) 객체를 생성합니다. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | 새로운 [Pen](./) 객체를 생성하고 지정된 [Brush](../brush/) 객체로 초기화합니다. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | 새로운 [Pen](./) 객체를 생성하고 지정된 [Brush](../brush/) 객체로 초기화합니다. |
| [ResetTransform](./resettransform/)() | 현재 객체의 변환 행렬을 초기화하여 단위 행렬이 되도록 재설정합니다. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 지정된 순서대로 지정된 각도만큼 로컬 기하 변환을 회전시킵니다. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 지정된 순서대로 지정된 배율만큼 로컬 기하 변환을 스케일링합니다. |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | 현재 [Pen](./) 객체의 정렬을 설정합니다. |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | 이 펜의 [Brush](../brush/) 객체를 설정합니다. |
| [set_Color](./set_color/)(const Color\&) | 이 펜의 색상을 설정합니다. |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | 복합 펜을 지정하는 값 배열을 설정합니다. |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | 사용자 정의 끝 라인 캡을 설정합니다. |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | 사용자 정의 시작 라인 캡을 설정합니다. |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | 점선의 양쪽 끝에 사용되는 캡을 지정하는 값을 설정합니다. |
| [set_DashOffset](./set_dashoffset/)(float) | 선의 시작점부터 대시 패턴 시작점까지의 거리를 설정합니다. |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | 점선에서 사용자 정의 대시 패턴을 지정하는 배열을 설정합니다. 배열은 교대로 나타나는 대시와 공백의 길이를 지정하는 숫자로 구성됩니다. |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | 현재 [Pen](./) 객체의 대시 스타일을 지정하는 값을 설정합니다. |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | 현재 [Pen](./) 객체의 끝 라인 캡을 설정합니다. |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | 이 [Pen](./) 객체가 그리는 선이 연결되는 방식을 지정하는 값을 설정합니다. |
| [set_MiterLimit](./set_miterlimit/)(float) | 각진 모서리에서 연결부의 두께 제한을 설정합니다. |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | 현재 [Pen](./) 객체의 시작 라인 캡을 설정합니다. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | 현재 객체가 나타내는 펜에 대한 기하 변환을 지정하는 Matrix 객체를 설정합니다. |
| [set_Width](./set_width/)(float) | 현재 [Pen](./) 객체의 너비를 설정합니다. |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | 구현되지 않음. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 지정된 순서대로 지정된 치수만큼 로컬 기하 변환을 평행 이동합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
