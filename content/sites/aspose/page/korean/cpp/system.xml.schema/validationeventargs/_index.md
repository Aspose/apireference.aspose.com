---
title: "System::Xml::Schema::ValidationEventArgs 클래스"
linktitle: "ValidationEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::ValidationEventArgs 클래스. C++에서 ValidationEventHandler와 관련된 자세한 정보를 반환합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


[ValidationEventHandler](../validationeventhandler/)와 관련된 자세한 정보를 반환합니다.

```cpp
class ValidationEventArgs : public System::EventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Exception](./get_exception/)() | 검증 이벤트와 연결된 [XmlSchemaException](../xmlschemaexception/)을 반환합니다. |
| [get_Message](./get_message/)() | 검증 이벤트에 해당하는 텍스트 설명을 반환합니다. |
| [get_Severity](./get_severity/)() | 검증 이벤트의 심각도를 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
