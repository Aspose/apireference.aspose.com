---
title: "System::Xml::XmlReader::GetAttribute 메서드"
linktitle: "GetAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::GetAttribute 메서드. 파생 클래스에서 재정의될 경우, 지정된 인덱스의 속성 값을 가져옵니다 (C++)."
type: docs
weight: 2800
url: /ko/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


파생 클래스에서 재정의될 때, 지정된 인덱스에 해당하는 속성의 값을 가져옵니다.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| i | int32_t | 속성의 인덱스. 인덱스는 0부터 시작합니다. (첫 번째 속성의 인덱스는 0입니다.) |

### ReturnValue

지정된 속성의 값입니다. 이 메서드는 리더를 이동하지 않습니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String) method


파생 클래스에서 재정의될 경우, 지정된 [XmlReader::get_Name](../get_name/) 값의 속성 값을 가져옵니다.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 정규화된 이름. |

### ReturnValue

지정된 속성의 값입니다. 속성을 찾을 수 없거나 값이 [String::Empty](../../../system/string/empty/)인 경우, **nullptr**가 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String, String) method


파생 클래스에서 재정의될 경우, 지정된 [XmlReader::get_LocalName](../get_localname/) 및 [XmlReader::get_NamespaceURI](../get_namespaceuri/) 값의 속성 값을 가져옵니다.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 로컬 이름입니다. |
| namespaceURI | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

지정된 속성의 값입니다. 속성을 찾을 수 없거나 값이 [String::Empty](../../../system/string/empty/)인 경우, **nullptr**가 반환됩니다. 이 메서드는 리더를 이동하지 않습니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
