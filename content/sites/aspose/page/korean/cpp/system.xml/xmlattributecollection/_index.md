---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlAttributeCollection 클래스. C++에서 이름이나 인덱스로 접근할 수 있는 속성 컬렉션을 나타냅니다."
type: docs
weight: 700
url: /ko/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


이름이나 인덱스로 접근할 수 있는 속성 컬렉션을 나타냅니다.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | 지정된 속성을 컬렉션의 마지막 노드로 삽입합니다. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | 이 컬렉션의 모든 [XmlAttribute](../xmlattribute/) 객체를 지정된 배열로 복사합니다. |
| [idx_get](./idx_get/)(int32_t) | 지정된 인덱스의 속성을 반환합니다. |
| [idx_get](./idx_get/)(const String\&) | 지정된 이름의 속성을 반환합니다. |
| [idx_get](./idx_get/)(const String\&, const String\&) | 지정된 로컬 이름 및 네임스페이스 Uniform Resource Identifier (URI)의 속성을 반환합니다. |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | 지정된 속성을 지정된 기준 속성 바로 뒤에 삽입합니다. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | 지정된 속성을 지정된 기준 속성 바로 앞에 삽입합니다. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | 지정된 속성을 컬렉션의 첫 번째 노드로 삽입합니다. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | 컬렉션에서 지정된 속성을 제거합니다. |
| [RemoveAll](./removeall/)() | 컬렉션에서 모든 속성을 제거합니다. |
| [RemoveAt](./removeat/)(int32_t) | 컬렉션에서 지정된 인덱스에 해당하는 속성을 제거합니다. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | 그 [XmlNode::get_Name](../xmlnode/get_name/) 결과를 사용하여 [XmlNode](../xmlnode/)를 추가합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
