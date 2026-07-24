---
title: "System::Xml::XmlReader::ReadContentAs methode"
linktitle: "ReadContentAs"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::ReadContentAs methode. Leest de inhoud als een object van het opgegeven type in C++."
type: docs
weight: 3900
url: /nl/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


Leest de inhoud als een object van het opgegeven type.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| returnType | const TypeInfo\& | Het type van de waarde die moet worden geretourneerd. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Een [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) object dat wordt gebruikt om alle namespace‑prefixes gerelateerd aan typeconversie op te lossen. Bijvoorbeeld, dit kan worden gebruikt bij het converteren van een [XmlQualifiedName](../../xmlqualifiedname/) object naar een **xs:string**. Deze waarde kan **nullptr** zijn. |

### ReturnValue

De samengevoegde tekstinhoud of attribuutwaarde geconverteerd naar het aangevraagde type.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
