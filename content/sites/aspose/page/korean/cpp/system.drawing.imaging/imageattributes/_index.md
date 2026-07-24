---
title: "System::Drawing::Imaging::ImageAttributes 클래스"
linktitle: "ImageAttributes"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::ImageAttributes 클래스. 렌더링 중 이미지 색상이 어떻게 조작되는지에 대한 정보를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 900
url: /ko/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


렌더링 중 이미지 색상이 어떻게 조작되는지에 대한 정보를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class ImageAttributes : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | 구현되지 않음. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | 구현되지 않음. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | 구현되지 않음. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | 구현되지 않음. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | 구현되지 않음. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | 구현되지 않음. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | 구현되지 않음. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | 구현되지 않음. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | 구현되지 않음. |
| [Clone](./clone/)() | 현재 객체의 복사본을 생성합니다. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 모든 운영 체제 리소스를 해제합니다. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | 구현되지 않음. |
| [ImageAttributes](./imageattributes/)() | 기본 생성자. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | 구현되지 않음. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | 구현되지 않음. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | 구현되지 않음. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | 색상 보정 행렬을 설정합니다. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | 구현되지 않음. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | 구현되지 않음. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | 구현되지 않음. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | 구현되지 않음. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | 구현되지 않음. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | 구현되지 않음. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | 텍스처를 도형 전체에 타일링하거나 도형 경계에서 어떻게 배치할지 결정하는 데 사용되는 랩 모드와 색상을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
