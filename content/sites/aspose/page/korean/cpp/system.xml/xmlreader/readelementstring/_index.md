---
title: "System::Xml::XmlReader::ReadElementString 메서드"
linktitle: "ReadElementString"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::ReadElementString 메서드. 텍스트 전용 요소를 읽습니다. 그러나 C++에서 이 작업을 보다 간단하게 처리할 수 있는 XmlReader::ReadElementContentAsString 메서드를 대신 사용하는 것이 권장됩니다."
type: docs
weight: 6400
url: /ko/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


텍스트 전용 요소를 읽습니다. 그러나 보다 간단하게 이 작업을 처리할 수 있는 [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) 메서드를 대신 사용하는 것이 권장됩니다.

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

읽은 요소에 포함된 텍스트입니다. 요소가 비어 있으면 빈 문자열이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String, String) method


텍스트 전용 요소를 읽기 전에 찾은 요소의 [XmlReader::get_LocalName](../get_localname/) 및 [XmlReader::get_NamespaceURI](../get_namespaceuri/) 값이 주어진 문자열과 일치하는지 확인합니다. 그러나 보다 간단하게 이 작업을 처리할 수 있는 [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) 메서드를 대신 사용하는 것이 권장됩니다.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localname | String | 확인할 로컬 이름입니다. |
| ns | String | 확인할 네임스페이스 URI. |

### ReturnValue

읽은 요소에 포함된 텍스트입니다. 요소가 비어 있으면 빈 문자열이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String) method


텍스트 전용 요소를 읽기 전에 찾은 요소의 [XmlReader::get_Name](../get_name/) 값이 지정된 문자열과 일치하는지 확인합니다. 그러나 이 작업을 보다 간단하게 처리할 수 있기 때문에 대신 [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) 메서드를 사용하는 것이 권장됩니다.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 확인할 이름. |

### ReturnValue

읽은 요소에 포함된 텍스트입니다. 요소가 비어 있으면 빈 문자열이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
