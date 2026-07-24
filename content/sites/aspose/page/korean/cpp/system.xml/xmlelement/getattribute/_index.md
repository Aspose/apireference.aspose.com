---
title: "System::Xml::XmlElement::GetAttribute 메서드"
linktitle: "GetAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlElement::GetAttribute 메서드. C++에서 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성의 값을 반환합니다."
type: docs
weight: 1300
url: /ko/cpp/system.xml/xmlelement/getattribute/
---
## XmlElement::GetAttribute(String, String) method


지정된 로컬 이름 및 네임스페이스 URI를 가진 속성의 값을 반환합니다.

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 검색할 속성의 로컬 이름. |
| namespaceURI | String | 검색할 속성의 네임스페이스 URI. |

### ReturnValue

지정된 속성의 값. 일치하는 속성을 찾지 못했거나 속성에 지정된 값이나 기본값이 없을 경우 빈 문자열이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttribute(String) method


지정된 이름을 가진 속성의 값을 반환합니다.

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 검색할 속성의 이름. 이는 한정된 이름이며, 일치하는 노드의 **get_Name** 값과 비교됩니다. |

### ReturnValue

지정된 속성의 값. 일치하는 속성을 찾지 못했거나 속성에 지정된 값이나 기본값이 없을 경우 빈 문자열이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
