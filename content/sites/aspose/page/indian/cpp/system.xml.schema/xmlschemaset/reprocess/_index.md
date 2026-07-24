---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess मेथड"
linktitle: "पुनःप्रक्रिया"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess मेथड। C++ में XmlSchemaSet में पहले से मौजूद XML Schema परिभाषा भाषा (XSD) स्कीमा को पुनःप्रक्रिया करता है।"
type: docs
weight: 1500
url: /hi/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


एक XML [Schema](../../) परिभाषा भाषा (XSD) स्कीमा को पुनःप्रक्रिया करता है जो पहले से [XmlSchemaSet](../) में मौजूद है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्कीमा | SharedPtr\<XmlSchema\> | पुनःप्रक्रिया करने के लिए स्कीमा। |

### ReturnValue

यदि स्कीमा वैध है तो एक [XmlSchema](../../xmlschema/) ऑब्जेक्ट। यदि स्कीमा वैध नहीं है और एक [ValidationEventHandler](../../validationeventhandler/) निर्दिष्ट किया गया है, तो **nullptr** लौटाया जाता है और उपयुक्त वैधता इवेंट उठाया जाता है। अन्यथा, एक [XmlSchemaException](../../xmlschemaexception/) फेंका जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
