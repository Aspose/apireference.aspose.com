---
title: "System::Xml::XmlNodeList 클래스"
linktitle: "XmlNodeList"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeList 클래스. C++에서 노드의 순서가 지정된 컬렉션을 나타냅니다."
type: docs
weight: 2700
url: /ko/cpp/system.xml/xmlnodelist/
---
## XmlNodeList class


노드의 순서가 지정된 컬렉션을 나타냅니다.

```cpp
class XmlNodeList : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                    public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_Count](./get_count/)() | [XmlNodeList](./)에 있는 노드 수를 반환합니다. |
| virtual [GetEnumerator](./getenumerator/)() | [XmlNodeList](./)의 노드 컬렉션을 반복하는 지원을 제공합니다. |
| virtual [idx_get](./idx_get/)(int32_t) | 주어진 인덱스에 있는 노드를 반환합니다. |
| virtual [Item](./item/)(int32_t) | 주어진 인덱스에 있는 노드를 검색합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
