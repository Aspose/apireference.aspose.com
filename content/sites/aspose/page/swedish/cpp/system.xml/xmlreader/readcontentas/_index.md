---
title: "System::Xml::XmlReader::ReadContentAs‑metod"
linktitle: "ReadContentAs"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlReader::ReadContentAs metod. Läser innehållet som ett objekt av den typ som specificerats i C++."
type: docs
weight: 3900
url: /sv/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


Läser innehållet som ett objekt av den angivna typen.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| returnType | const TypeInfo\& | Typen på värdet som ska returneras. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Ett [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)-objekt som används för att lösa eventuella namnrymdsprefix som är relaterade till typkonvertering. Till exempel kan detta användas när ett [XmlQualifiedName](../../xmlqualifiedname/)-objekt konverteras till en **xs:string**. Detta värde kan vara **nullptr**. |

### ReturnValue

Den sammanslagna textinnehållet eller attributvärdet konverterat till den begärda typen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
