---
title: "System::Drawing::Drawing2D::LinearGradientBrush 클래스"
linktitle: "LinearGradientBrush"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Drawing2D::LinearGradientBrush 클래스. 선형 그라디언트 브러시를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 900
url: /ko/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


선형 그라디언트 브러시를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 현재 객체의 복사본을 생성합니다. |
| [get_Blend](./get_blend/)() const | 이 브러시의 기본 색상의 계수와 위치를 지정하는 블렌드를 반환합니다. |
| [get_GammaCorrection](./get_gammacorrection/)() const | 이 브러시에 감마 보정이 활성화되어 있음을 나타내는 값을 반환합니다. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | [ColorBlend](../colorblend/) 객체를 반환하며, 다중 색상의 선형 그라디언트를 정의합니다. |
| [get_LinearColors](./get_linearcolors/)() const | 이 그라디언트의 시작 색상과 끝 색상을 반환합니다. |
| [get_Rectangle](./get_rectangle/)() | 경계 사각형을 반환합니다. |
| [get_Transform](./get_transform/)() const | 현재 객체가 나타내는 브러시의 기하학적 변환을 지정하는 [Matrix](../matrix/) 객체의 복사본을 반환합니다. |
| [get_WrapMode](./get_wrapmode/)() const | 래핑 모드를 반환합니다. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | RTTI 정보. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | [LinearGradientBrush](./)의 새 인스턴스를 생성합니다. |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | [LinearGradientBrush](./)의 새 인스턴스를 생성합니다. |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | [LinearGradientBrush](./)의 새 인스턴스를 생성합니다. |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | [LinearGradientBrush](./)의 새 인스턴스를 생성합니다. |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | [LinearGradientBrush](./)의 새 인스턴스를 생성합니다. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | 현재 객체의 변환 행렬에 지정된 행렬을 곱합니다. |
| [ResetTransform](./resettransform/)() | 현재 객체의 변환 행렬을 재설정합니다. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | 현재 객체의 변환 행렬을 회전시킵니다. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | 현재 객체의 변환 행렬을 스케일링합니다. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | 이 브러시의 기본 색상의 계수와 위치를 지정하는 블렌드를 설정합니다. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | 이 브러시의 감마 보정 상태를 설정합니다. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | 다중 색상의 선형 그라디언트를 정의하는 [ColorBlend](../colorblend/) 객체를 설정합니다. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | 이 그라디언트의 시작 및 끝 색상을 설정합니다. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | 현재 객체가 나타내는 브러시의 기하학적 변환을 지정하는 [Matrix](../matrix/) 객체를 설정합니다. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | 래핑 모드를 설정합니다. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | 구현되지 않음. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | 구현되지 않음. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 현재 객체의 변환 매트릭스를 평행 이동합니다. |
## 또 보기

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
