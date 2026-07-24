---
title: "System::Xml::Schema::XmlSchema::Compile मेथड"
linktitle: "कम्पाइल"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchema::Compile मेथड। XML SchemaObject Model (SOM) को वैधता के लिए स्कीमा जानकारी में कम्पाइल करता है। प्रोग्रामेटिक रूप से निर्मित SOM की सिंटैक्टिक और सेमेंटिक संरचना की जाँच के लिए उपयोग किया जाता है। सेमेंटिक वैधता जाँच कम्पाइलेशन के दौरान C++ में की जाती है।"
type: docs
weight: 200
url: /hi/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


XML [Schema](../../)[Object](../../../system/object/) Model (SOM) को वैधता के लिए स्कीमा जानकारी में कम्पाइल करता है। प्रोग्रामेटिक रूप से निर्मित SOM की सिंटैक्टिक और सेमेंटिक संरचना की जाँच के लिए उपयोग किया जाता है। सेमेंटिक वैधता जाँच कम्पाइलेशन के दौरान की जाती है।

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | वैलिडेशन इवेंट हैंडलर जो XML [Schema](../../) वैधता त्रुटियों के बारे में जानकारी प्राप्त करता है। |

## संबंधित देखें

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


XML [Schema](../../)[Object](../../../system/object/) Model (SOM) को वैधता के लिए स्कीमा जानकारी में कम्पाइल करता है। प्रोग्रामेटिक रूप से निर्मित SOM की सिंटैक्टिक और सेमेंटिक संरचना की जाँच के लिए उपयोग किया जाता है। सेमेंटिक वैधता जाँच कम्पाइलेशन के दौरान की जाती है।

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | वैलिडेशन इवेंट हैंडलर जो XML [Schema](../../) वैधता त्रुटियों के बारे में जानकारी प्राप्त करता है। |
| resolver | const SharedPtr\<XmlResolver\>\& | XML नेमस्पेस को हल करने के लिए उपयोग किया जाने वाला [XmlResolver](../../../system.xml/xmlresolver/) जो **include** और **import** तत्वों में संदर्भित होते हैं। |

## संबंधित देखें

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
