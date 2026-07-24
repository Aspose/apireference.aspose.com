---
title: "System::Data::Common::DbCommand 클래스"
linktitle: "DbCommand"
second_title: "C++용 Aspose.Page"
description: "System::Data::Common::DbCommand 클래스. 데이터베이스 명령. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 100
url: /ko/cpp/system.data.common/dbcommand/
---
## DbCommand class


데이터베이스 명령. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class DbCommand : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | 비쿼리 명령을 실행합니다. |
| virtual [ExecuteReader](./executereader/)() | 쿼리 명령을 실행합니다. |
| virtual [get_CommandText](./get_commandtext/)() const | RTTI 정보. |
| virtual [get_Connection](./get_connection/)() const | 명령과 연결된 데이터베이스 연결을 가져옵니다. |
| virtual [set_CommandText](./set_commandtext/)(String) const | DB 명령 텍스트를 설정합니다. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | 명령과 연결된 데이터베이스 연결을 가져옵니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
