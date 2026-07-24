---
title: "System::Xml::XmlReader::ReadElementContentAs-methode"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::ReadElementContentAs method. Leest de inhoud van het element als het gevraagde type in C++."
type: docs
weight: 5200
url: /nl/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Leest de elementinhoud als het gevraagde type.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| returnType | const TypeInfo\& | Het type van de waarde die moet worden geretourneerd. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Een [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) object dat wordt gebruikt om eventuele namespace‑prefixen met betrekking tot typeconversie op te lossen. |

### ReturnValue

De elementinhoud geconverteerd naar het gevraagde getypeerde object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, en leest vervolgens de elementinhoud als het gevraagde type.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| returnType | const TypeInfo\& | Het type van de waarde die moet worden geretourneerd. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Een [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) object dat wordt gebruikt om eventuele namespace‑prefixen met betrekking tot typeconversie op te lossen. |
| localName | String | De lokale naam van het element. |
| namespaceURI | String | De namespace-URI van het element. |

### ReturnValue

De elementinhoud geconverteerd naar het gevraagde getypeerde object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
