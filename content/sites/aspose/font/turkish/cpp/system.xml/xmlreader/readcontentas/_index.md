---
title: "System::Xml::XmlReader::ReadContentAs metodu"
linktitle: "ReadContentAs"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::ReadContentAs metodu. İçeriği C++'ta belirtilen türde bir nesne olarak okur."
type: docs
weight: 3900
url: /tr/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


İçeriği belirtilen türde bir nesne olarak okur.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| returnType | const TypeInfo\& | Döndürülecek değerin türü. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Bir [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) nesnesi, tür dönüşümüyle ilgili ad alanı öneklerini çözmek için kullanılır. Örneğin, bu, bir [XmlQualifiedName](../../xmlqualifiedname/) nesnesini **xs:string**'e dönüştürürken kullanılabilir. Bu değer **nullptr** olabilir. |

### ReturnValue

İstenen türe dönüştürülmüş birleştirilmiş metin içeriği veya öznitelik değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
