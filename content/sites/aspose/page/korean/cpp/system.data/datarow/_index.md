---
title: "System::Data::DataRow 클래스"
linktitle: "DataRow"
second_title: "C++용 Aspose.Page"
description: "System::Data::DataRow 클래스. 데이터 집합의 행. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 500
url: /ko/cpp/system.data/datarow/
---
## DataRow class


데이터 집합의 행. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class DataRow : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Table](./get_table/)() | 테이블 행이 속한 테이블을 가져옵니다. |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | 지정된 관계를 통해 자식으로 간주되는 행들을 가져옵니다. |
| [idx_get](./idx_get/)(const int32_t) | RTTI 정보. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
