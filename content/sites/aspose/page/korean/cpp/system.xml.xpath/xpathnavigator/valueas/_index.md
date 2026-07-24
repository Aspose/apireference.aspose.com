---
title: "System::Xml::XPath::XPathNavigator::ValueAs 메서드"
linktitle: "ValueAs"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::ValueAs 메서드. 현재 노드''의 값을 지정된 Type으로 반환하며, 네임스페이스 접두사를 해결하기 위해 지정된 IXmlNamespaceResolver 객체를 사용합니다 C++에서."
type: docs
weight: 8100
url: /ko/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


지정된 Type으로 현재 노드의 값을 반환하며, 네임스페이스 접두사를 해결하기 위해 지정된 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체를 사용합니다.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 현재 노드의 값을 반환할 Type. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 네임스페이스 접두사를 해결하는 데 사용되는 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체. |

### ReturnValue

요청된 Type으로 현재 노드의 값.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
