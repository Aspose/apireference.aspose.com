---
title: "System::Xml::XmlReader::MoveToAttribute 메서드"
linktitle: "MoveToAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::MoveToAttribute 메서드. 파생 클래스에서 재정의될 경우, 지정된 인덱스의 속성으로 이동합니다."
type: docs
weight: 3200
url: /ko/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


파생 클래스에서 재정의될 때, 지정된 인덱스에 해당하는 속성으로 이동합니다.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| i | int32_t | 속성의 인덱스. |

## 또 보기

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


파생 클래스에서 재정의될 경우, 지정된 [XmlReader::get_Name](../get_name/) 값의 속성으로 이동합니다.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 정규화된 이름. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


파생 클래스에서 재정의될 경우, 지정된 [XmlReader::get_LocalName](../get_localname/) 및 [XmlReader::get_NamespaceURI](../get_namespaceuri/) 값의 속성으로 이동합니다.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 로컬 이름입니다. |
| ns | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
