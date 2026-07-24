---
title: "System::Drawing::Drawing2D::PathGradientBrush 클래스"
linktitle: "PathGradientBrush"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Drawing2D::PathGradientBrush 클래스. 그래디언트로 GraphicsPath 객체의 내부를 채우는 브러시를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오."
type: docs
weight: 1200
url: /ko/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


[GraphicsPath](../graphicspath/) 객체의 내부를 그래디언트로 채우는 브러시를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 현재 객체의 복사본을 생성합니다. |
| [get_Blend](./get_blend/)() const | 구현되지 않음. |
| [get_CenterColor](./get_centercolor/)() const | 현재 객체가 채운 경로의 중심에 있는 색상을 반환합니다. |
| [get_CenterPoint](./get_centerpoint/)() const | 그래디언트의 중심점을 가져옵니다. |
| [get_FocusScales](./get_focusscales/)() const | 그래디언트 감소를 위한 포커스 포인트를 가져옵니다. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | 다중 색상의 선형 그래디언트를 정의하는 값을 반환합니다. |
| [get_Rectangle](./get_rectangle/)() | 구현되지 않음. |
| [get_SurroundColors](./get_surroundcolors/)() const | 이 [PathGradientBrush](./)가 채우는 경로의 점에 해당하는 색상을 반환합니다. |
| [get_Transform](./get_transform/)() const | 현재 객체가 나타내는 브러시의 기하학적 변환을 지정하는 [Matrix](../matrix/) 객체의 복사본을 반환합니다. |
| [get_WrapMode](./get_wrapmode/)() const | 래핑 모드를 반환합니다. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | 현재 객체의 변환 행렬에 지정된 행렬을 곱합니다. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | RTTI 정보. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | [PathGradientBrush](./) 클래스의 새 인스턴스를 생성합니다. |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | [PathGradientBrush](./) 클래스의 새 인스턴스를 생성합니다. |
| [ResetTransform](./resettransform/)() | 현재 객체의 변환 행렬을 초기화하여 단위 행렬이 되도록 재설정합니다. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 지정된 순서대로 지정된 각도만큼 로컬 기하 변환을 회전시킵니다. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 지정된 순서대로 지정된 배율만큼 로컬 기하 변환을 스케일링합니다. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | 이 브러시의 기본 색상의 계수와 위치를 지정하는 블렌드를 설정합니다. |
| [set_CenterColor](./set_centercolor/)(Color) | 현재 객체가 채운 경로의 중심에 있는 색상을 설정합니다. |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | 그래디언트의 중심점을 설정합니다. |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | 그래디언트 감소를 위한 포커스 포인트를 설정합니다. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | 다중 색상의 선형 그래디언트를 정의하는 값을 설정합니다. |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | 이 [PathGradientBrush](./)가 채우는 경로의 점에 해당하는 색상을 설정합니다. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | 현재 객체가 나타내는 브러시의 기하학적 변환을 지정하는 [Matrix](../matrix/) 객체를 설정합니다. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | 래핑 모드를 설정합니다. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | 구현되지 않음. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | 구현되지 않음. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 지정된 순서대로 지정된 치수만큼 로컬 기하 변환을 평행 이동합니다. |
## 또 보기

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
