---
title: "System::Xml::XmlValidatingReader::GetAttribute 메서드"
linktitle: "GetAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlValidatingReader::GetAttribute 메서드. 지정된 인덱스의 속성 값을 반환합니다 C++에서."
type: docs
weight: 3200
url: /ko/cpp/system.xml/xmlvalidatingreader/getattribute/
---
## XmlValidatingReader::GetAttribute(int32_t) method


지정된 인덱스를 가진 속성의 값을 반환합니다.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(int32_t i) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| i | int32_t | 속성의 인덱스. 인덱스는 0부터 시작합니다. (첫 번째 속성의 인덱스는 0입니다.) |

### ReturnValue

지정된 속성의 값.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String, String) method


지정된 로컬 이름 및 네임스페이스 Uniform Resource Identifier (URI)를 가진 속성의 값을 반환합니다.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String localName, String namespaceURI) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 속성의 로컬 이름입니다. |
| namespaceURI | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

지정된 속성의 값입니다. 속성을 찾을 수 없으면 **nullptr**가 반환됩니다. 이 메서드는 리더를 이동하지 않습니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String) method


지정된 이름을 가진 속성의 값을 반환합니다.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String name) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 정규화된 이름. |

### ReturnValue

지정된 속성의 값. 속성을 찾을 수 없으면 **nullptr**가 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
