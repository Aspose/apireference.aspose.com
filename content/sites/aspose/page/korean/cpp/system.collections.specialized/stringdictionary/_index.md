---
title: "System::Collections::Specialized::StringDictionary 클래스"
linktitle: "StringDictionary"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Specialized::StringDictionary 클래스. 문자열-문자열 사전. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 500
url: /ko/cpp/system.collections.specialized/stringdictionary/
---
## StringDictionary class


[String](../../system/string/) to string dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class StringDictionary : public System::Collections::Generic::Dictionary<String, String>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const override | 특정 키에 대한 값을 가져옵니다. |
## 또 보기

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
