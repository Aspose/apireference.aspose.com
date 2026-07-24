---
title: "System::Xml::XmlReader::ReadElementContentAs 메서드"
linktitle: "ReadElementContentAs"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::ReadElementContentAs 메서드. C++에서 요소 내용을 요청된 형식으로 읽습니다."
type: docs
weight: 5200
url: /ko/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


요청된 유형으로 요소 내용을 읽습니다.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 반환될 값의 형식입니다. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 형식 변환과 관련된 네임스페이스 접두사를 해결하는 데 사용되는 [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) 개체입니다. |

### ReturnValue

요청된 형식 객체로 변환된 요소 내용입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음, 요청된 유형으로 요소 내용을 읽습니다.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 반환될 값의 형식입니다. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 형식 변환과 관련된 네임스페이스 접두사를 해결하는 데 사용되는 [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) 개체입니다. |
| localName | String | 요소의 로컬 이름입니다. |
| namespaceURI | String | 요소의 네임스페이스 URI. |

### ReturnValue

요청된 형식 객체로 변환된 요소 내용입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
