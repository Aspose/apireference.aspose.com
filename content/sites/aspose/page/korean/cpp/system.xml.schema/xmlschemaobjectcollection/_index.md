---
title: "System::Xml::Schema::XmlSchemaObjectCollection 클래스"
linktitle: "XmlSchemaObjectCollection"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaObjectCollection 클래스. C++에서 XmlSchemaObject의 컬렉션입니다."
type: docs
weight: 5100
url: /ko/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


XmlSchemaObjects 컬렉션입니다.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/)을(를) [XmlSchemaObjectCollection](./)에 추가합니다. |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | 지정된 [XmlSchemaObject](../xmlschemaobject/)이(가) [XmlSchemaObjectCollection](./)에 포함되어 있는지 나타냅니다. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | 컬렉션의 모든 XmlSchemaObject를 지정된 인덱스부터 주어진 배열에 복사합니다. |
| [GetEnumerator](./getenumerator/)() override | [XmlSchemaObjectCollection](./)에 포함된 XmlSchemaObject를 반복하기 위한 열거자를 반환합니다. |
| virtual [idx_get](./idx_get/)(int32_t) | 지정된 인덱스에 있는 [XmlSchemaObject](../xmlschemaobject/)을 반환합니다. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | 지정된 인덱스에 있는 [XmlSchemaObject](../xmlschemaobject/)을 설정합니다. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | 지정된 [XmlSchemaObject](../xmlschemaobject/)에 해당하는 컬렉션 인덱스를 반환합니다. |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/)을(를) [XmlSchemaObjectCollection](./)에 삽입합니다. |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/)을(를) [XmlSchemaObjectCollection](./)에서 제거합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | 새로운 [XmlSchemaObjectCollection](./) 클래스 인스턴스를 초기화합니다. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/)을(를) 매개변수로 받는 새로운 [XmlSchemaObjectCollection](./) 클래스 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
