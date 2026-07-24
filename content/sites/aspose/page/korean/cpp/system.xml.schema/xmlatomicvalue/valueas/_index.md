---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method. C++에서 네임스페이스 접두사를 해결하기 위해 지정된 IXmlNamespaceResolver 객체를 사용하여 지정된 유형으로 검증된 XML 요소 또는 속성의 값을 반환합니다."
type: docs
weight: 1300
url: /ko/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


검증된 XML 요소 또는 속성의 값을 네임스페이스 접두사를 해결하기 위해 지정된 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체를 사용하여 지정된 유형으로 반환합니다.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 유형 | const TypeInfo\& | 검증된 XML 요소 또는 속성의 값을 반환할 유형. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 네임스페이스 접두사를 해결하는 데 사용되는 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체. |

### ReturnValue

요청된 유형으로 검증된 XML 요소 또는 속성의 값.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
