---
title: "System::Xml::XmlReader::get_SchemaInfo yöntemi"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlReader::get_SchemaInfo yöntemi. Şema doğrulaması sonucunda geçerli düğüme atanan şema bilgilerini C++'da döndürür."
type: docs
weight: 2200
url: /tr/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


Şema doğrulaması sonucunda geçerli düğüme atanmış şema bilgilerini döndürür.

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

Geçerli düğüm için şema bilgilerini içeren bir IXmlSchemaInfo nesnesi. [Schema](../../../system.xml.schema/) bilgisi, öğeler, öznitelikler veya null olmayan bir [XmlReader::get_ValueType](../get_valuetype/) değerine sahip metin düğümlerine ayarlanabilir. Geçerli düğüm yukarıdaki düğüm tiplerinden biri değilse veya [XmlReader](../) örneği şema bilgisi raporlamıyorsa, bu yöntem **nullptr** döndürür. Bu yöntem bir [XmlTextReader](../../xmltextreader/) veya bir [XmlValidatingReader](../../xmlvalidatingreader/) nesnesinden çağrılırsa, her zaman **nullptr** döndürür. Bu [XmlReader](../) uygulamaları, get_SchemaInfo yöntemi aracılığıyla şema bilgisi ortaya çıkarmaz.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
