---
title: "System::Xml::XmlReader::ReadContentAs yöntemi"
linktitle: "ReadContentAs"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlReader::ReadContentAs yöntemi. İçeriği C++'da belirtilen türde bir nesne olarak okur."
type: docs
weight: 3900
url: /tr/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


İçeriği belirtilen türde bir nesne olarak okur.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| returnType | const TypeInfo\& | Döndürülecek değerin türü. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Herhangi bir ad alanı önekini tür dönüşümüyle ilgili çözmek için kullanılan bir [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) nesnesi. Örneğin, bu, bir [XmlQualifiedName](../../xmlqualifiedname/) nesnesini **xs:string**'e dönüştürürken kullanılabilir. Bu değer **nullptr** olabilir. |

### ReturnValue

İstenen türe dönüştürülmüş birleştirilmiş metin içeriği veya öznitelik değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
