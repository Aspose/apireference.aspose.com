---
title: "System::Data::IDataRecord 클래스"
linktitle: "IDataRecord"
second_title: "C++용 Aspose.Page"
description: "System::Data::IDataRecord 클래스. 열이 있는 레코드에 대한 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++ 함수에 인수로 전달하십시오."
type: docs
weight: 1300
url: /ko/cpp/system.data/idatarecord/
---
## IDataRecord class


열이 있는 레코드에 대한 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수에 인수로 전달하십시오.

```cpp
class IDataRecord : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | RTTI 정보. |
| virtual [GetName](./getname/)(const int32_t) | 지정된 위치의 필드 이름을 가져옵니다. |
| virtual [idx_get](./idx_get/)(const int32_t) | 지정된 인덱스의 값을 가져옵니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
