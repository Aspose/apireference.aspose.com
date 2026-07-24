---
title: "System::Xml::XmlDocument::CreateDocumentType मेथड"
linktitle: "CreateDocumentType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocument::CreateDocumentType मेथड। C++ में एक नया XmlDocumentType ऑब्जेक्ट लौटाता है।"
type: docs
weight: 700
url: /hi/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


एक नया [XmlDocumentType](../../xmldocumenttype/) ऑब्जेक्ट लौटाता है।

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | const String\& | दस्तावेज़ प्रकार का नाम। |
| publicId | const String\& | दस्तावेज़ प्रकार का सार्वजनिक पहचानकर्ता या **nullptr**। आप एक सार्वजनिक URI और साथ ही एक सिस्टम पहचानकर्ता निर्दिष्ट कर सकते हैं ताकि बाहरी DTD उपसमुच्चय के स्थान की पहचान की जा सके। |
| systemId | const String\& | दस्तावेज़ प्रकार का सिस्टम पहचानकर्ता या **nullptr**। बाहरी DTD उपसमुच्चय के फ़ाइल स्थान के URL को निर्दिष्ट करता है। |
| internalSubset | const String\& | दस्तावेज़ प्रकार का DTD आंतरिक उपसमुच्चय या **nullptr**। |

### ReturnValue

नया [XmlDocumentType](../../xmldocumenttype/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
