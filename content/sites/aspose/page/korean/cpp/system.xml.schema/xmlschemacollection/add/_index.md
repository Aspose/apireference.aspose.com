---
title: "System::Xml::Schema::XmlSchemaCollection::Add 메서드"
linktitle: "Add"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollection::Add 메서드. C++에서 XmlSchema를 컬렉션에 추가합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


[XmlSchema](../../xmlschema/)를 컬렉션에 추가합니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | 컬렉션에 추가할 [XmlSchema](../../xmlschema/)입니다. |

### ReturnValue

[XmlSchema](../../xmlschema/) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


[XmlSchema](../../xmlschema/)를 컬렉션에 추가합니다. 지정된 [XmlResolver](../../../system.xml/xmlresolver/)가 외부 참조를 해결하는 데 사용됩니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | 컬렉션에 추가할 [XmlSchema](../../xmlschema/)입니다. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | **include** 및 **import** 요소에서 참조된 네임스페이스를 해결하는 데 사용되는 [XmlResolver](../../../system.xml/xmlresolver/)입니다. 이것이 **nullptr**이면 외부 참조가 해결되지 않습니다. |

### ReturnValue

스키마 컬렉션에 추가된 [XmlSchema](../../xmlschema/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


주어진 컬렉션에 정의된 모든 네임스페이스(연관된 스키마 포함)를 이 컬렉션에 추가합니다.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | 이 컬렉션에 추가하려는 [XmlSchemaCollection](../)입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/)에 포함된 스키마를 스키마 컬렉션에 추가합니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ns | const String\& | 스키마와 연결된 네임스페이스 URI입니다. XML 스키마의 경우 일반적으로 **targetNamespace**가 됩니다. |
| reader | const SharedPtr\<XmlReader\>\& | 추가할 스키마를 포함하는 [XmlReader](../../../system.xml/xmlreader/)입니다. |

### ReturnValue

스키마 컬렉션에 추가된 [XmlSchema](../../xmlschema/); 추가되는 스키마가 XDR 스키마이거나 스키마에 컴파일 오류가 있는 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


스키마 컬렉션에 [XmlReader](../../../system.xml/xmlreader/)에 포함된 스키마를 추가합니다. 지정된 [XmlResolver](../../../system.xml/xmlresolver/)는 외부 리소스를 해결하는 데 사용됩니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ns | const String\& | 스키마와 연결된 네임스페이스 URI입니다. XML 스키마의 경우 일반적으로 **targetNamespace**가 됩니다. |
| reader | const SharedPtr\<XmlReader\>\& | 추가할 스키마를 포함하는 [XmlReader](../../../system.xml/xmlreader/)입니다. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 **include** 및 **import** 요소 또는 **x-schema** 속성에서 참조된 네임스페이스를 해결하는 데 사용됩니다 (XDR 스키마). 이 값이 **nullptr**이면 외부 참조가 해결되지 않습니다. |

### ReturnValue

스키마 컬렉션에 추가된 [XmlSchema](../../xmlschema/); 추가되는 스키마가 XDR 스키마이거나 스키마에 컴파일 오류가 있는 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


지정된 URL로 위치한 스키마를 스키마 컬렉션에 추가합니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ns | const String\& | 스키마와 연결된 네임스페이스 URI입니다. XML 스키마의 경우 일반적으로 **targetNamespace**가 됩니다. |
| uri | const String\& | 로드할 스키마를 지정하는 URL입니다. |

### ReturnValue

스키마 컬렉션에 추가된 [XmlSchema](../../xmlschema/); 추가되는 스키마가 XDR 스키마이거나 스키마에 컴파일 오류가 있는 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
