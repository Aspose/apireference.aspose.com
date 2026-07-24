---
title: "System::Drawing::Drawing2D::CustomLineCap 클래스"
linktitle: "CustomLineCap"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Drawing2D::CustomLineCap 클래스. 사용자 정의 라인 캡을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 400
url: /ko/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


사용자 정의 라인 캡을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class CustomLineCap : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Clone](./clone/)() | 현재 객체의 복사본을 반환합니다. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | [CustomLineCap](./) 클래스의 새 인스턴스를 생성하여 지정된 속성을 가진 사용자 정의 라인 캡을 나타냅니다. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 모든 운영 체제 리소스를 해제합니다. |
| [get_BaseCap](./get_basecap/)() const | 이 사용자 정의 캡이 생성되는 기본 선 캡을 반환합니다. |
| [get_BaseInset](./get_baseinset/)() const | 선과 캡 사이의 거리를 반환합니다. |
| [get_StrokeJoin](./get_strokejoin/)() const | 이 사용자 정의 캡의 선이 연결되는 방식을 결정하는 [LineJoin](../linejoin/) 값을 반환합니다. |
| [get_WidthScale](./get_widthscale/)() const | 이 사용자 정의 캡의 스케일을 반환합니다. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | 현재 객체가 나타내는 사용자 정의 캡의 시작 및 끝 선 캡을 가져옵니다. |
| [set_BaseCap](./set_basecap/)(LineCap) | 이 사용자 정의 캡의 기본 선 캡 값을 설정합니다. |
| [set_BaseInset](./set_baseinset/)(float) | 선과 캡 사이의 거리를 설정합니다. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | 이 사용자 정의 캡의 선이 연결되는 방식을 결정하는 [LineJoin](../linejoin/) 값을 설정합니다. |
| [set_WidthScale](./set_widthscale/)(float) | 이 사용자 정의 캡의 스케일 값을 설정합니다. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | 현재 객체가 나타내는 사용자 정의 캡의 시작 및 끝 선 캡을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
