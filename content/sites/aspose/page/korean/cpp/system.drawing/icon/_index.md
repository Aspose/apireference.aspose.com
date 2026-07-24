---
title: "System::Drawing::Icon 클래스"
linktitle: "아이콘"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Icon 클래스. Windows 아이콘을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달할 때 사용하십시오."
type: docs
weight: 1100
url: /ko/cpp/system.drawing/icon/
---
## Icon class


Represents a [Windows](../../system.windows/) icon. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Icon : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Height](./get_height/)() const | 아이콘의 높이를 반환합니다. |
| [get_Width](./get_width/)() const | 아이콘의 너비를 반환합니다. |
| [Icon](./icon/)(const String\&) | 지정된 파일에서 아이콘을 나타내는 새로운 [Icon](./) 클래스 인스턴스를 생성합니다. |
| [ToBitmap](./tobitmap/)() | 현재 객체를 [Bitmap](../bitmap/) 객체로 변환합니다. |
| virtual [~Icon](./~icon/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
