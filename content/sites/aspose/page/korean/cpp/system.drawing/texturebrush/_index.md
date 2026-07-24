---
title: "System::Drawing::TextureBrush 클래스"
linktitle: "TextureBrush"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::TextureBrush 클래스. 이미지를 사용하여 도형 내부를 채우는 브러시를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2800
url: /ko/cpp/system.drawing/texturebrush/
---
## TextureBrush class


이미지를 사용하여 도형 내부를 채우는 브러시를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 현재 객체의 복사본을 생성합니다. |
| [get_Image](./get_image/)() | 현재 [TextureBrush](./) 객체에서 사용되는 이미지를 반환합니다. |
| [get_Transform](./get_transform/)() | 현재 객체가 나타내는 브러시의 기하학적 변환을 지정하는 Matrix 객체의 복사본을 반환합니다. |
| [get_WrapMode](./get_wrapmode/)() | 현재 객체가 나타내는 브러시가 어떻게 타일링되는지를 지정하는 값을 반환합니다. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | 현재 객체의 변환 행렬에 지정된 행렬을 곱합니다. |
| [ResetTransform](./resettransform/)() | 현재 객체의 변환 행렬을 초기화하여 단위 행렬이 되도록 재설정합니다. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 지정된 순서대로 지정된 각도만큼 로컬 기하 변환을 회전시킵니다. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 지정된 순서대로 지정된 배율만큼 로컬 기하 변환을 스케일링합니다. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | 현재 객체가 나타내는 브러시의 기하학적 변환을 지정하는 Matrix 객체를 설정합니다. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | 현재 객체가 나타내는 브러시가 어떻게 타일링되는지를 지정하는 값을 설정합니다. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | 지정된 이미지를 사용하는 [TextureBrush](./) 클래스의 새 인스턴스를 생성합니다. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | 지정된 이미지를 사용하는 [TextureBrush](./) 클래스의 새 인스턴스를 생성합니다. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | 지정된 이미지를 사용하는 [TextureBrush](./) 클래스의 새 인스턴스를 생성합니다. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | 지정된 이미지를 사용하는 [TextureBrush](./) 클래스의 새 인스턴스를 생성합니다. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | 지정된 이미지를 사용하는 [TextureBrush](./) 클래스의 새 인스턴스를 생성합니다. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 지정된 순서대로 지정된 치수만큼 로컬 기하 변환을 평행 이동합니다. |
| virtual [~TextureBrush](./~texturebrush/)() | 소멸자. |
## 또 보기

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
