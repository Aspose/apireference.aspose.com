---
title: "System::Xml::XmlReader::ReadElementContentAs yöntemi"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlReader::ReadElementContentAs yöntemi. C++'ta öğe içeriğini istenen türde okur."
type: docs
weight: 5200
url: /tr/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Eleman içeriğini istenen türde okur.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| returnType | const TypeInfo\& | Döndürülecek değerin türü. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Tip dönüşümüyle ilgili herhangi bir ad alanı önekini çözmek için kullanılan bir [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

İstenen tipte nesneye dönüştürülmüş öğe içeriği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


Belirtilen yerel ad ve ad alanı URI'sinin geçerli elemanınkine eşleştiğini kontrol eder, ardından eleman içeriğini istenen türde okur.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| returnType | const TypeInfo\& | Döndürülecek değerin türü. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Tip dönüşümüyle ilgili herhangi bir ad alanı önekini çözmek için kullanılan bir [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) nesnesi. |
| localName | String | Öğenin yerel adı. |
| namespaceURI | String | Öğenin ad alanı URI'si. |

### ReturnValue

İstenen tipte nesneye dönüştürülmüş öğe içeriği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
