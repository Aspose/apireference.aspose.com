---
title: "System::Xml::XmlReader::get_SchemaInfo metodu"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::get_SchemaInfo metodu. C++'ta şema doğrulaması sonucunda geçerli düğüme atanmış şema bilgilerini döndürür."
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

Geçerli düğüm için şema bilgilerini içeren bir IXmlSchemaInfo nesnesi. [Schema](../../../system.xml.schema/) bilgisi öğelere, özniteliklere veya null olmayan bir [XmlReader::get_ValueType](../get_valuetype/) değerine sahip metin düğümlerine ayarlanabilir. Geçerli düğüm yukarıdaki düğüm türlerinden biri değilse veya [XmlReader](../) örneği şema bilgisi raporlamıyorsa, bu metod **nullptr** döndürür. Bu metod bir [XmlTextReader](../../xmltextreader/) veya bir [XmlValidatingReader](../../xmlvalidatingreader/) nesnesinden çağrılırsa, bu metod her zaman **nullptr** döndürür. Bu [XmlReader](../) uygulamaları şema bilgilerini get_SchemaInfo metodu aracılığıyla ortaya çıkmaz.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
