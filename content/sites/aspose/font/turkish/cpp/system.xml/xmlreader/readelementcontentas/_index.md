---
title: "System::Xml::XmlReader::ReadElementContentAs yöntemi"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::ReadElementContentAs yöntemi. Elemanın içeriğini istenen türde C++'ta okur."
type: docs
weight: 5200
url: /tr/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Elemanın içeriğini istenen türde okur.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| returnType | const TypeInfo\& | Döndürülecek değerin türü. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Tür dönüşümüyle ilgili ad alanı öneklerini çözmek için kullanılan bir [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

İstenen tipte nesneye dönüştürülmüş eleman içeriği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından öğenin içeriğini istenen türde okur.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| returnType | const TypeInfo\& | Döndürülecek değerin türü. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Tür dönüşümüyle ilgili ad alanı öneklerini çözmek için kullanılan bir [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) nesnesi. |
| localName | Dize | Öğenin yerel adı. |
| namespaceURI | Dize | Öğenin ad alanı URI'si. |

### ReturnValue

İstenen tipte nesneye dönüştürülmüş eleman içeriği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
