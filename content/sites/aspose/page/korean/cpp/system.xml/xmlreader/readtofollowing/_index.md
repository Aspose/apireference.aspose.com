---
title: "System::Xml::XmlReader::ReadToFollowing 메서드"
linktitle: "ReadToFollowing"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::ReadToFollowing 메서드. 지정된 로컬 이름과 네임스페이스 URI를 가진 요소가 C++에서 발견될 때까지 읽습니다."
type: docs
weight: 7200
url: /ko/cpp/system.xml/xmlreader/readtofollowing/
---
## XmlReader::ReadToFollowing(String, String) method


지정된 로컬 이름 및 네임스페이스 URI를 가진 요소가 발견될 때까지 읽습니다.

```cpp
virtual bool System::Xml::XmlReader::ReadToFollowing(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 요소의 로컬 이름입니다. |
| namespaceURI | String | 요소의 네임스페이스 URI. |

### ReturnValue

**true** if a matching element is found; otherwise **false** and the [XmlReader](../) is in an end of file state.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToFollowing(String) method


지정된 한정 이름을 가진 요소가 발견될 때까지 읽습니다.

```cpp
virtual bool System::Xml::XmlReader::ReadToFollowing(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 요소의 정규화된 이름. |

### ReturnValue

**true** if a matching element is found; otherwise **false** and the [XmlReader](../) is in an end of file state.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
