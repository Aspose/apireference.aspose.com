---
title: "System::Xml::XmlTextReader::MoveToAttribute 메서드"
linktitle: "MoveToAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextReader::MoveToAttribute 메서드. C++에서 지정된 인덱스의 속성으로 이동합니다."
type: docs
weight: 3800
url: /ko/cpp/system.xml/xmltextreader/movetoattribute/
---
## XmlTextReader::MoveToAttribute(int32_t) method


지정된 인덱스를 가진 속성으로 이동합니다.

```cpp
void System::Xml::XmlTextReader::MoveToAttribute(int32_t i) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| i | int32_t | 속성의 인덱스. |

## 또 보기

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::MoveToAttribute(String, String) method


지정된 로컬 이름 및 네임스페이스 URI를 가진 속성으로 이동합니다.

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String localName, String namespaceURI) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 속성의 로컬 이름입니다. |
| namespaceURI | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::MoveToAttribute(String) method


지정된 이름을 가진 속성으로 이동합니다.

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String name) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 정규화된 이름. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
