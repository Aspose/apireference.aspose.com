---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get विधि"
linktitle: "idx_get"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get विधि। यह C++ में दिए गए नेमस्पेस URI से संबंधित XmlSchema को लौटाता है।"
type: docs
weight: 800
url: /hi/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


दिए गए नेमस्पेस URI से संबंधित [XmlSchema](../../xmlschema/) को लौटाता है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ns | const String\& | स्कीमा को लौटाने के लिए नेमस्पेस URI। यह आमतौर पर स्कीमा का **targetNamespace** होता है। |

### ReturnValue

दिए गए नेमस्पेस URI से संबंधित [XmlSchema](../../xmlschema/); यदि कोई लोड किया गया स्कीमा नहीं है या नेमस्पेस XDR स्कीमा से जुड़ा है तो **nullptr**।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
