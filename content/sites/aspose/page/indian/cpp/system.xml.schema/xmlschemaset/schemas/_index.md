---
title: "System::Xml::Schema::XmlSchemaSet::Schemas मेथड"
linktitle: "Schemas"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSet::Schemas मेथड। सभी XML Schema परिभाषा भाषा (XSD) स्कीमाओं का संग्रह XmlSchemaSet में C++ में लौटाता है।"
type: docs
weight: 1600
url: /hi/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


सभी XML [Schema](../../) परिभाषा भाषा (XSD) स्कीमाओं का संग्रह [XmlSchemaSet](../) में लौटाता है।

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

एक IList ऑब्जेक्ट जिसमें सभी स्कीमाएँ शामिल हैं जो [XmlSchemaSet](../) में जोड़ी गई हैं। यदि कोई स्कीमा [XmlSchemaSet](../) में नहीं जोड़ी गई है, तो एक खाली संग्रह लौटाया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


दिए गए नेमस्पेस से संबंधित सभी XML [Schema](../../) परिभाषा भाषा (XSD) स्कीमाओं का संग्रह [XmlSchemaSet](../) में लौटाता है।

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| targetNamespace | String | स्कीमा **targetNamespace** प्रॉपर्टी। |

### ReturnValue

एक IList ऑब्जेक्ट जिसमें सभी स्कीमाएँ शामिल हैं जो दिए गए नेमस्पेस से संबंधित [XmlSchemaSet](../) में जोड़ी गई हैं। यदि कोई स्कीमा [XmlSchemaSet](../) में नहीं जोड़ी गई है, तो एक खाली संग्रह लौटाया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
