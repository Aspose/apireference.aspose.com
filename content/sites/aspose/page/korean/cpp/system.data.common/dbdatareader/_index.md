---
title: "System::Data::Common::DbDataReader 클래스"
linktitle: "DbDataReader"
second_title: "C++용 Aspose.Page"
description: "System::Data::Common::DbDataReader 클래스. 데이터베이스에서 데이터를 수신하기 위한 API입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하여 사용하십시오. C++에서."
type: docs
weight: 400
url: /ko/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


데이터베이스에서 데이터를 수신하기 위한 API입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하여 사용하십시오.

```cpp
class DbDataReader : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Close](./close/)() | 데이터 검색 채널을 닫습니다. |
| virtual [idx_get](./idx_get/)(String) | 이름이 지정된 항목을 가져옵니다. |
| virtual [idx_get](./idx_get/)(int) | 인덱스로 항목을 가져옵니다. |
| virtual [Read](./read/)() | 데이터베이스에서 다음 레코드를 읽습니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | RTTI 정보. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
