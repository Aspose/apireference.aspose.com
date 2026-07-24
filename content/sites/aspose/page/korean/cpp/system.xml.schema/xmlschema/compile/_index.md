---
title: "System::Xml::Schema::XmlSchema::Compile 메서드"
linktitle: "컴파일"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchema::Compile 메서드. XML SchemaObject Model(SOM)을 스키마 정보로 컴파일하여 검증에 사용합니다. 프로그래밍 방식으로 구축된 SOM의 구문 및 의미 구조를 확인하는 데 사용됩니다. 의미 검증은 C++에서 컴파일 중에 수행됩니다."
type: docs
weight: 200
url: /ko/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


XML [Schema](../../)[Object](../../../system/object/) Model(SOM)을 스키마 정보로 컴파일하여 검증에 사용합니다. 프로그래밍 방식으로 구축된 SOM의 구문 및 의미 구조를 확인하는 데 사용됩니다. 의미 검증은 컴파일 중에 수행됩니다.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | XML [Schema](../../) 검증 오류에 대한 정보를 수신하는 검증 이벤트 핸들러입니다. |

## 또 보기

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


XML [Schema](../../)[Object](../../../system/object/) Model(SOM)을 스키마 정보로 컴파일하여 검증에 사용합니다. 프로그래밍 방식으로 구축된 SOM의 구문 및 의미 구조를 확인하는 데 사용됩니다. 의미 검증은 컴파일 중에 수행됩니다.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | XML [Schema](../../) 검증 오류에 대한 정보를 수신하는 검증 이벤트 핸들러입니다. |
| resolver | const SharedPtr\<XmlResolver\>\& | **include** 및 **import** 요소에서 참조된 네임스페이스를 해결하는 데 사용되는 [XmlResolver](../../../system.xml/xmlresolver/)입니다. |

## 또 보기

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
