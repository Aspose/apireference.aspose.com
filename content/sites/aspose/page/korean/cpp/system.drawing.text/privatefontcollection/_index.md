---
title: "System::Drawing::Text::PrivateFontCollection 클래스"
linktitle: "PrivateFontCollection"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Text::PrivateFontCollection 클래스. 클라이언트 애플리케이션에서 제공하는 글꼴 패밀리 컬렉션을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 300
url: /ko/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


클라이언트 애플리케이션에서 제공하는 글꼴 패밀리 컬렉션을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 글꼴을 컬렉션에 추가합니다. |
| [AddFontFile](./addfontfile/)(const String\&) | 지정된 파일에서 글꼴을 가져와 컬렉션에 추가합니다. |
| [get_Families](./get_families/)() override | 현재 객체가 나타내는 글꼴 컬렉션과 연결된 [FontFamily](../../system.drawing/fontfamily/) 객체 배열을 반환합니다. |
## 또 보기

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
