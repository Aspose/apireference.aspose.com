---
title: "System::Xml::Schema::XmlSchemaCollection::Contains मेथड"
linktitle: "Contains"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaCollection::Contains मेथड. C++ में यह दर्शाने वाला मान लौटाता है कि निर्दिष्ट XmlSchema का targetNamespace संग्रह में है या नहीं।"
type: docs
weight: 300
url: /hi/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


यह दर्शाने वाला मान लौटाता है कि निर्दिष्ट [XmlSchema](../../xmlschema/) का **targetNamespace** संग्रह में है या नहीं।

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) ऑब्जेक्ट। |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


एक मान लौटाता है जो दर्शाता है कि निर्दिष्ट नेमस्पेस वाला स्कीमा संग्रह में है या नहीं।

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ns | const String\& | स्कीमा से जुड़ा नेमस्पेस URI। XML स्कीमा के लिए, यह सामान्यतः target namespace होता है। |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
