---
title: "System::Drawing::Drawing2D::Matrix 클래스"
linktitle: "Matrix"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Drawing2D::Matrix 클래스. 변환 작업을 정의하는 3x3 행렬을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 만들거나 new 연산자를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 이 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


변환 작업을 정의하는 3x3 행렬을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 만들거나 new 연산자를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 이 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class Matrix : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() const | 현재 객체의 복사본을 생성합니다. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 모든 운영 체제 리소스를 해제합니다. |
| [Equals](./equals/)(ptr) override | 지정된 객체가 [Matrix](./)인지 그리고 이 객체와 동일한지 여부를 테스트합니다. |
| [get_Elements](./get_elements/)() const | 행렬의 요소를 다음 순서대로 포함하는 배열을 반환합니다: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | 현재 객체가 나타내는 행렬이 단위 행렬인지 판단합니다. |
| [get_IsInvertible](./get_isinvertible/)() const | 현재 객체가 나타내는 행렬이 가역인지 판단합니다. |
| [get_OffsetX](./get_offsetx/)() const | 현재 객체가 나타내는 행렬의 X 변환 값을 반환합니다. |
| [get_OffsetY](./get_offsety/)() const | 현재 객체가 나타내는 행렬의 Y 변환 값을 반환합니다. |
| [Invert](./invert/)() | 현재 객체가 나타내는 행렬을 역전시킵니다. |
| [Matrix](./matrix/)() | [Matrix](./) 클래스의 새 인스턴스를 생성하여 단위 행렬을 나타냅니다. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | [Matrix](./) 클래스의 새 인스턴스를 생성하고 지정된 값으로 초기화합니다. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | 지정된 사각형 및 점 배열에 의해 정의된 기하학적 변환을 위해 [Matrix](./) 클래스의 새 인스턴스를 생성합니다. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | 지정된 사각형 및 점 배열에 의해 정의된 기하학적 변환을 위해 [Matrix](./) 클래스의 새 인스턴스를 생성합니다. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | 현재 객체가 나타내는 행렬에 지정된 행렬을 곱합니다. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | 현재 객체가 나타내는 행렬에 지정된 행렬을 곱합니다. |
| [Reset](./reset/)() | 현재 객체가 나타내는 행렬을 단위 행렬이 되도록 재설정합니다. |
| [Rotate](./rotate/)(float) | 현재 객체가 나타내는 행렬을 지정된 각도만큼 시계 방향으로 회전시킵니다. |
| [Rotate](./rotate/)(float, MatrixOrder) | 현재 객체가 나타내는 행렬을 원점을 중심으로 지정된 각도만큼 시계 방향으로 회전시킵니다. |
| [RotateAt](./rotateat/)(float, const PointF\&) | 현재 객체가 나타내는 행렬을 지정된 점을 중심으로 지정된 각도만큼 시계 방향으로 회전시킵니다. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | 현재 객체가 나타내는 행렬을 지정된 점을 중심으로 지정된 각도만큼 시계 방향으로 회전시킵니다. |
| [Scale](./scale/)(float, float) | 지정된 스케일 벡터를 현재 객체가 나타내는 행렬에 적용합니다. |
| [Scale](./scale/)(float, float, MatrixOrder) | 지정된 스케일 벡터를 현재 객체가 나타내는 행렬에 적용합니다. |
| [Shear](./shear/)(float, float) | 지정된 전단 벡터를 현재 객체가 나타내는 행렬에 적용합니다. |
| [Shear](./shear/)(float, float, MatrixOrder) | 지정된 전단 벡터를 현재 객체가 나타내는 행렬에 적용합니다. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | 현재 객체가 나타내는 행렬에 의해 정의된 기하학적 변환을 지정된 점에 적용합니다. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | 현재 객체가 나타내는 행렬에 의해 정의된 기하학적 변환을 지정된 점에 적용합니다. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | 현재 객체가 나타내는 행렬에 의해 정의된 기하학적 변환을 지정된 점에 적용합니다. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | 현재 객체가 나타내는 행렬에 의해 정의된 기하학적 변환을 지정된 점에 적용합니다. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | 현재 객체가 나타내는 행렬의 스케일 및 회전 구성 요소만을 지정된 점에 적용합니다. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | 현재 객체가 나타내는 행렬의 스케일 및 회전 구성 요소만을 지정된 점에 적용합니다. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | 현재 객체가 나타내는 행렬의 스케일 및 회전 구성 요소만을 지정된 점에 적용합니다. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | 현재 객체가 나타내는 행렬의 스케일 및 회전 구성 요소만을 지정된 점에 적용합니다. |
| [Translate](./translate/)(float, float) | 지정된 변환 벡터를 현재 객체가 나타내는 행렬에 적용합니다. |
| [Translate](./translate/)(float, float, MatrixOrder) | 지정된 변환 벡터를 현재 객체가 나타내는 행렬에 적용합니다. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | 배열에 있는 각 벡터를 현재 객체가 나타내는 행렬과 곱합니다. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | 배열에 있는 각 벡터를 현재 객체가 나타내는 행렬과 곱합니다. |
| virtual [~Matrix](./~matrix/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
