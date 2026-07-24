---
title: "System::Xml::XmlReader::ReadContentAs 메서드"
linktitle: "ReadContentAs"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::ReadContentAs 메서드. C++에서 지정된 유형의 객체로 내용을 읽습니다."
type: docs
weight: 3900
url: /ko/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


지정된 유형의 객체로 내용을 읽습니다.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 반환될 값의 형식입니다. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 형식 변환과 관련된 네임스페이스 접두사를 해결하는 데 사용되는 [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) 객체입니다. 예를 들어, 이 객체는 [XmlQualifiedName](../../xmlqualifiedname/) 객체를 **xs:string**으로 변환할 때 사용할 수 있습니다. 이 값은 **nullptr**일 수 있습니다. |

### ReturnValue

요청된 유형으로 변환된 연결된 텍스트 내용 또는 속성 값입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
