---
title: "System::Security::SecurityElement 클래스"
linktitle: "SecurityElement"
second_title: "C++용 Aspose.Page"
description: "System::Security::SecurityElement 클래스. 보안 객체를 인코딩하기 위한 XML 객체 모델입니다. 구현되지 않았습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 300
url: /ko/cpp/system.security/securityelement/
---
## SecurityElement class


보안 객체를 인코딩하기 위한 XML 객체 모델입니다. 구현되지 않았습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class SecurityElement : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | 태그에 속성을 추가합니다. |
| [AddChild](./addchild/)(SecurityElement) | 자식 태그를 추가합니다. |
| [Attribute](./attribute/)(const String\&) | 속성 값을 가져옵니다. |
| [Copy](./copy/)() | 태그를 복제합니다. |
| [Equal](./equal/)(SecurityElement) | 매개변수 동등성을 확인합니다. |
| static [Escape](./escape/)(const String\&) | XML 문자열의 문자를 이스케이프합니다. |
| static [FromString](./fromstring/)(const String\&) | XML 코드에서 요소를 생성합니다. |
| [get_Attributes](./get_attributes/)() | 태그 속성을 가져옵니다. |
| [get_Children](./get_children/)() | 태그 자식 객체를 가져옵니다. |
| [get_Tag](./get_tag/)() | 태그 이름을 가져옵니다. |
| [get_Text](./get_text/)() | 태그 내부 텍스트를 가져옵니다. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | 속성 이름이 유효한지 확인합니다. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | 속성 값이 유효한지 확인합니다. |
| static [IsValidTag](./isvalidtag/)(const String\&) | 태그가 유효한지 확인합니다. |
| static [IsValidText](./isvalidtext/)(const String\&) | 텍스트가 유효한지 확인합니다. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | 이름으로 자식 태그를 가져옵니다. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | 태그 이름으로 자식 태그의 내부 텍스트를 가져옵니다. |
| [SecurityElement](./securityelement/)(const String\&) | 생성자. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | 생성자. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | 태그 속성을 설정합니다. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | 태그 자식 객체를 설정합니다. |
| [set_Tag](./set_tag/)(const String\&) | 태그 이름을 설정합니다. |
| [set_Text](./set_text/)(const String\&) | 태그 내부 텍스트를 설정합니다. |
| [ToString](./tostring/)() const override | 태그를 문자열로 변환합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
