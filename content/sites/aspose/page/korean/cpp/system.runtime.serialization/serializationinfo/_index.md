---
title: "System::Runtime::Serialization::SerializationInfo 클래스"
linktitle: "SerializationInfo"
second_title: "C++용 Aspose.Page"
description: "System::Runtime::Serialization::SerializationInfo 클래스. 직렬화된 객체를 나타내는 이름이 지정된 필드 집합을 보유합니다. 구현되지 않음. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 400
url: /ko/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


직렬화된 객체를 나타내는 명명된 필드 집합을 보유합니다. 구현되지 않았습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 인스턴스를 만들거나 operator new를 사용하지 마세요. 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class SerializationInfo : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | float 값을 설정합니다. 구현되지 않았습니다. |
| [AddValue](./addvalue/)(const System::String\&, short) | short 값을 설정합니다. 구현되지 않았습니다. |
| [AddValue](./addvalue/)(const System::String\&, bool) | boolean 값을 설정합니다. 구현되지 않았습니다. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | object 값을 설정합니다. 구현되지 않았습니다. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 지정된 타입으로 object 값을 설정합니다. 구현되지 않았습니다. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | [SerializationInfo](./) 저장소에서 값을 검색합니다. 구현되지 않았습니다. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI 정보. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
