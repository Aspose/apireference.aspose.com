---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix 클래스"
linktitle: "XpsMatrix"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix 클래스. MatrixTransform 속성 요소 기능을 캡슐화하는 클래스. 이 요소는 C++에서 요소들의 좌표 시스템을 조작하는 데 사용되는 임의의 아핀 행렬 변환을 정의합니다."
type: docs
weight: 2600
url: /ko/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


MatrixTransform 속성 요소 기능을 캡슐화하는 클래스. 이 요소는 요소들의 좌표 시스템을 조작하는 데 사용되는 임의의 어파인 행렬 변환을 정의합니다.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 이 변환 행렬을 복제합니다. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 지정된 [System::Object](../../system/object/)가 이 인스턴스와 같은지 여부를 결정합니다. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | 실제 구현. |
| [get_IsIdentity](./get_isidentity/)() | 이 인스턴스가 단위 행렬인지 여부를 나타내는 값을 가져옵니다. |
| [get_M11](./get_m11/)() | M11 요소를 가져옵니다. |
| [get_M12](./get_m12/)() | M12 요소를 가져옵니다. |
| [get_M21](./get_m21/)() | M21 요소를 가져옵니다. |
| [get_M22](./get_m22/)() | M22 요소를 가져옵니다. |
| [get_M31](./get_m31/)() | M31 요소를 가져옵니다. |
| [get_M32](./get_m32/)() | M32 요소를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | 이 인스턴스에 대한 해시 코드를 반환합니다. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | 이 행렬에 *matrix* 로 지정된 행렬을 *matrixOrder* 로 지정된 순서대로 곱합니다. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 이 매트릭스를 기본 (Prepend) 순서로 *matrix* 로 지정된 매트릭스와 곱합니다. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | 이 행렬에 *matrix* 로 지정된 행렬을 *matrixOrder* 로 지정된 순서대로 곱합니다. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | 이 매트릭스를 기본 (Prepend) 순서로 *matrix* 로 지정된 매트릭스와 곱합니다. |
| [Reset](./reset/)() | 이 매트릭스를 단위 행렬로 재설정합니다. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* 로 지정된 순서로 이 매트릭스에 *angle* 만큼 시계 방향 회전을 적용합니다. |
| [Rotate](./rotate/)(float) | 기본 (Prepend) 순서로 이 매트릭스에 *angle* 만큼 시계 방향 회전을 적용합니다. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* 로 지정된 순서로 이 매트릭스를 *pivot* 를 중심으로 *angle* 만큼 시계 방향 회전시킵니다. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | 기본 (Prepend) 순서로 이 매트릭스를 *pivot* 를 중심으로 *angle* 만큼 시계 방향 회전시킵니다. |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* 로 지정된 순서로 이 매트릭스에 지정된 스케일 벡터 (scaleX 및 scaleY)를 적용합니다. |
| [Scale](./scale/)(float, float) | 기본 (Prepend) 순서로 이 매트릭스에 지정된 스케일 벡터 (scaleX 및 scaleY)를 적용합니다. |
| [Skew](./skew/)(double, double) | 이 매트릭스에 지정된 스큐 변환을 적용합니다. |
| [ToString](./tostring/)() const override | 이 [XpsMatrix](./) 인스턴스의 문자열 표현을 반환합니다. |
| [Transform](./transform/)(System::Drawing::RectangleF) | 이 매트릭스가 나타내는 아핀 변환을 지정된 사각형에 적용합니다. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | 이 매트릭스가 나타내는 아핀 변환을 지정된 점에 적용합니다. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | 이 매트릭스가 나타내는 아핀 변환을 점 배열의 지정된 부분에 적용합니다. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | 이 매트릭스가 나타내는 아핀 변환을 지정된 점 배열에 적용합니다. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* 로 지정된 순서로 이 매트릭스에 지정된 변환 벡터를 적용합니다. |
| [Translate](./translate/)(float, float) | 이 매트릭스에 지정된 변환 벡터를 적용합니다. |
## 또 보기

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
