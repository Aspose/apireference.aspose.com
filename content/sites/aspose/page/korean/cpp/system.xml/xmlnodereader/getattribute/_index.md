---
title: "System::Xml::XmlNodeReader::GetAttribute 메서드"
linktitle: "GetAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeReader::GetAttribute 메서드. C++에서 지정된 인덱스의 속성 값을 반환합니다."
type: docs
weight: 2400
url: /ko/cpp/system.xml/xmlnodereader/getattribute/
---
## XmlNodeReader::GetAttribute(int32_t) method


지정된 인덱스를 가진 속성의 값을 반환합니다.

```cpp
String System::Xml::XmlNodeReader::GetAttribute(int32_t attributeIndex) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| attributeIndex | int32_t | 속성의 인덱스. 인덱스는 0부터 시작합니다. (첫 번째 속성의 인덱스는 0입니다.) |

### ReturnValue

지정된 속성의 값.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::GetAttribute(String) method


지정된 이름을 가진 속성의 값을 반환합니다.

```cpp
String System::Xml::XmlNodeReader::GetAttribute(String name) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 정규화된 이름. |

### ReturnValue

지정된 속성의 값. 속성을 찾을 수 없으면 **nullptr**가 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::GetAttribute(String, String) method


지정된 로컬 이름 및 네임스페이스 URI를 가진 속성의 값을 반환합니다.

```cpp
String System::Xml::XmlNodeReader::GetAttribute(String name, String namespaceURI) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 로컬 이름입니다. |
| namespaceURI | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

지정된 속성의 값. 속성을 찾을 수 없으면 **nullptr**가 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
