---
title: "System::Xml::XmlReader::idx_get 메서드"
linktitle: "idx_get"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::idx_get 메서드. 파생 클래스에서 재정의될 경우, 지정된 인덱스의 속성 값을 C++에서 가져옵니다."
type: docs
weight: 2900
url: /ko/cpp/system.xml/xmlreader/idx_get/
---
## XmlReader::idx_get(int32_t) method


파생 클래스에서 재정의될 때, 지정된 인덱스에 해당하는 속성의 값을 가져옵니다.

```cpp
virtual String System::Xml::XmlReader::idx_get(int32_t i)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| i | int32_t | 속성의 인덱스. |

### ReturnValue

지정된 속성의 값.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::idx_get(String) method


파생 클래스에서 재정의될 경우, 지정된 [XmlReader::get_Name](../get_name/) 값의 속성 값을 가져옵니다.

```cpp
virtual String System::Xml::XmlReader::idx_get(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 정규화된 이름. |

### ReturnValue

지정된 속성의 값. 속성을 찾을 수 없으면 **nullptr**가 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::idx_get(String, String) method


파생 클래스에서 재정의될 경우, 지정된 [XmlReader::get_LocalName](../get_localname/) 및 [XmlReader::get_NamespaceURI](../get_namespaceuri/) 값의 속성 값을 가져옵니다.

```cpp
virtual String System::Xml::XmlReader::idx_get(String name, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성의 로컬 이름입니다. |
| namespaceURI | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

지정된 속성의 값. 속성을 찾을 수 없으면 **nullptr**가 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
