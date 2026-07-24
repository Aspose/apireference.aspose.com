---
title: "System::Xml::Schema::XmlSchemaSet::Add मेथड"
linktitle: "Add"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSet::Add मेथड। दिए गए XmlSchema को XmlSchemaSet में C++ में जोड़ता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


दिए गए [XmlSchema](../../xmlschema/) को [XmlSchemaSet](../) में जोड़ता है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchemaSet](../) में जोड़ने के लिए [XmlSchema](../../xmlschema/) ऑब्जेक्ट। |

### ReturnValue

यदि स्कीमा वैध है तो एक [XmlSchema](../../xmlschema/) ऑब्जेक्ट। यदि स्कीमा वैध नहीं है और एक [ValidationEventHandler](../../validationeventhandler/) निर्दिष्ट किया गया है, तो **nullptr** लौटाया जाता है और उपयुक्त वैधता इवेंट उठाया जाता है। अन्यथा, एक [XmlSchemaException](../../xmlschemaexception/) फेंका जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


दिए गए [XmlSchemaSet](../) में सभी XML [Schema](../../) डिफिनिशन लैंग्वेज (XSD) स्कीमा को [XmlSchemaSet](../) में जोड़ता है।

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | [XmlSchemaSet](../) ऑब्जेक्ट। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) में मौजूद XML [Schema](../../) डिफिनिशन लैंग्वेज (XSD) स्कीमा को [XmlSchemaSet](../) में जोड़ता है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| targetNamespace | String | स्कीमा का **targetNamespace** मान, या **nullptr** ताकि स्कीमा में निर्दिष्ट **targetNamespace** उपयोग किया जाए। |
| schemaDocument | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) ऑब्जेक्ट। |

### ReturnValue

यदि स्कीमा वैध है तो एक [XmlSchema](../../xmlschema/) ऑब्जेक्ट। यदि स्कीमा वैध नहीं है और एक [ValidationEventHandler](../../validationeventhandler/) निर्दिष्ट किया गया है, तो **nullptr** लौटाया जाता है और उपयुक्त वैधता इवेंट उठाया जाता है। अन्यथा, एक [XmlSchemaException](../../xmlschemaexception/) फेंका जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


निर्दिष्ट URL पर स्थित XML [Schema](../../) डिफिनिशन लैंग्वेज (XSD) स्कीमा को [XmlSchemaSet](../) में जोड़ता है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| targetNamespace | String | स्कीमा का **targetNamespace** मान, या **nullptr** ताकि स्कीमा में निर्दिष्ट **targetNamespace** उपयोग किया जाए। |
| schemaUri | const String\& | स्कीमा लोड करने के लिए निर्दिष्ट करने वाला URL। |

### ReturnValue

यदि स्कीमा वैध है तो एक [XmlSchema](../../xmlschema/) ऑब्जेक्ट। यदि स्कीमा वैध नहीं है और एक [ValidationEventHandler](../../validationeventhandler/) निर्दिष्ट किया गया है, तो **nullptr** लौटाया जाता है और उपयुक्त वैधता इवेंट उठाया जाता है। अन्यथा, एक [XmlSchemaException](../../xmlschemaexception/) फेंका जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
