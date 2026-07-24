---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema method"
linktitle: "InferSchema"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema method. C++ में निर्दिष्ट XmlReader ऑब्जेक्ट में सम्मिलित XML दस्तावेज़ से XML स्कीमा डिफिनिशन लैंग्वेज (XSD) स्कीमा का अनुमान लगाता है।"
type: docs
weight: 400
url: /hi/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


निर्दिष्ट [XmlReader](../../../system.xml/xmlreader/) ऑब्जेक्ट में सम्मिलित XML दस्तावेज़ से XML [Schema](../../) डिफिनिशन लैंग्वेज (XSD) स्कीमा का अनुमान लगाता है।

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | एक [XmlReader](../../../system.xml/xmlreader/) ऑब्जेक्ट जिसमें वह XML दस्तावेज़ हो जिससे स्कीमा का अनुमान लगाया जाना है। |

### ReturnValue

एक [XmlSchemaSet](../../xmlschemaset/) ऑब्जेक्ट जिसमें अनुमानित स्कीमा शामिल हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


निर्दिष्ट [XmlReader](../../../system.xml/xmlreader/) ऑब्जेक्ट में सम्मिलित XML दस्तावेज़ से XML [Schema](../../) डिफिनिशन लैंग्वेज (XSD) स्कीमा का अनुमान लगाता है, और समान लक्ष्य नेमस्पेस वाले निर्दिष्ट [XmlSchemaSet](../../xmlschemaset/) ऑब्जेक्ट में मौजूद मौजूदा स्कीमा का उपयोग करके अनुमानित स्कीमा को परिष्कृत करता है।

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | एक [XmlReader](../../../system.xml/xmlreader/) ऑब्जेक्ट जिसमें वह XML दस्तावेज़ हो जिससे स्कीमा का अनुमान लगाया जाना है। |
| schemas | SharedPtr\<XmlSchemaSet\> | एक [XmlSchemaSet](../../xmlschemaset/) ऑब्जेक्ट जिसमें एक मौजूदा स्कीमा शामिल है जिसका उपयोग अनुमानित स्कीमा को परिष्कृत करने के लिए किया जाता है। |

### ReturnValue

एक [XmlSchemaSet](../../xmlschemaset/) ऑब्जेक्ट जिसमें अनुमानित स्कीमा शामिल हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
