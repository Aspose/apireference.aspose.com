---
title: "System::Xml::XmlAttributeCollection::idx_get 메서드"
linktitle: "idx_get"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlAttributeCollection::idx_get 메서드. 지정된 로컬 이름과 네임스페이스 Uniform Resource Identifier (URI)를 가진 속성을 반환합니다 (C++)."
type: docs
weight: 300
url: /ko/cpp/system.xml/xmlattributecollection/idx_get/
---
## XmlAttributeCollection::idx_get(const String\&, const String\&) method


지정된 로컬 이름 및 네임스페이스 Uniform Resource Identifier (URI)의 속성을 반환합니다.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(const String &localName, const String &namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | const String\& | 속성의 로컬 이름입니다. |
| namespaceURI | const String\& | 속성의 네임스페이스 URI입니다. |

### ReturnValue

지정된 로컬 이름과 네임스페이스 URI를 가진 속성입니다. 속성이 존재하지 않으면 이 메서드는 **nullptr**을 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlAttributeCollection::idx_get(const String\&) method


지정된 이름의 속성을 반환합니다.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(const String &name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | 속성의 정규화된 이름. |

### ReturnValue

지정된 이름을 가진 속성입니다. 속성이 존재하지 않으면 이 메서드는 **nullptr**을 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlAttributeCollection::idx_get(int32_t) method


지정된 인덱스의 속성을 반환합니다.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(int32_t i)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| i | int32_t | 속성의 인덱스. |

### ReturnValue

지정된 인덱스에 있는 속성입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
