---
title: "System::Data::Common::DbProviderFactory 클래스"
linktitle: "DbProviderFactory"
second_title: "C++용 Aspose.Page"
description: "System::Data::Common::DbProviderFactory 클래스. 데이터베이스에 접근하기 위한 제공자. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 600
url: /ko/cpp/system.data.common/dbproviderfactory/
---
## DbProviderFactory class


데이터베이스에 접근하기 위한 제공자. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class DbProviderFactory : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [CreateCommand](./createcommand/)() | RTTI 정보. |
| virtual [CreateConnection](./createconnection/)() | 데이터베이스 연결을 생성합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
