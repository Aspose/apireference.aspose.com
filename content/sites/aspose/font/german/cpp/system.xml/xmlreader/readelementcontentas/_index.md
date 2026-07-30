---
title: "System::Xml::XmlReader::ReadElementContentAs-Methode"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::ReadElementContentAs-Methode. Liest den Elementinhalt als den angeforderten Typ in C++."
type: docs
weight: 5200
url: /de/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Liest den Elementinhalt als den angeforderten Typ.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| returnType | const TypeInfo\& | Der Typ des zurückzugebenden Werts. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Ein [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)-Objekt, das verwendet wird, um alle Namespace-Präfixe im Zusammenhang mit der Typkonvertierung aufzulösen. |

### ReturnValue

Der Elementinhalt, konvertiert in das angeforderte typisierte Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend den Elementinhalt als den angeforderten Typ.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| returnType | const TypeInfo\& | Der Typ des zurückzugebenden Werts. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Ein [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)-Objekt, das verwendet wird, um alle Namespace-Präfixe im Zusammenhang mit der Typkonvertierung aufzulösen. |
| localName | String | Der lokale Name des Elements. |
| namespaceURI | String | Die Namespace-URI des Elements. |

### ReturnValue

Der Elementinhalt, konvertiert in das angeforderte typisierte Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
