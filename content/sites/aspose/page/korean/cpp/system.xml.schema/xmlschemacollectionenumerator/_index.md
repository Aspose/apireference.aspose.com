---
title: "System::Xml::Schema::XmlSchemaCollectionEnumerator 클래스"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollectionEnumerator 클래스. 컬렉션에 대한 간단한 반복을 지원합니다. 이 클래스는 C++에서 상속할 수 없습니다."
type: docs
weight: 1600
url: /ko/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


컬렉션에 대한 간단한 반복을 지원합니다. 이 클래스는 상속될 수 없습니다.

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 현재 반복자를 복제합니다. |
| [Dispose](./dispose/)() override | 아무 작업도 수행하지 않습니다. |
| [get_Current](./get_current/)() const override | 컬렉션에서 현재 [XmlSchema](../xmlschema/)을 반환합니다. |
| [MoveNext](./movenext/)() override | 열거자를 컬렉션의 다음 스키마로 이동시킵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
