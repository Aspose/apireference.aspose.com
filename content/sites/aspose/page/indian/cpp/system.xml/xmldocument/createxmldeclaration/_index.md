---
title: "System::Xml::XmlDocument::CreateXmlDeclaration मेथड"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocument::CreateXmlDeclaration मेथड। C++ में निर्दिष्ट मानों के साथ एक XmlDeclaration नोड बनाता है।"
type: docs
weight: 1600
url: /hi/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


निर्दिष्ट मानों के साथ एक [XmlDeclaration](../../xmldeclaration/) नोड बनाता है।

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| संस्करण | const String\& | संस्करण "1.0" होना चाहिए। |
| encoding | const String\& | encoding attribute का मान। यह वह एन्कोडिंग है जो आप [XmlDocument](../) को फ़ाइल या स्ट्रीम में सहेजते समय उपयोग करते हैं; इसलिए, इसे [Text::Encoding](../../../system.text/encoding/) क्लास द्वारा समर्थित स्ट्रिंग पर सेट किया जाना चाहिए, अन्यथा "XmlDocument::Save(String)" विफल हो जाता है। यदि यह **nullptr** या [String::Empty](../../../system/string/empty/) है, तो [XmlDocument::Save](../save/) मेथड XML घोषणा पर encoding attribute नहीं लिखता और इसलिए डिफ़ॉल्ट एन्कोडिंग, UTF-8, उपयोग की जाती है। |
| standalone | const String\& | मान "yes" या "no" में से कोई एक होना चाहिए। यदि यह **nullptr** या [String::Empty](../../../system/string/empty/) है, तो [XmlDocument::Save](../save/) मेथड XML घोषणा पर standalone attribute नहीं लिखता। |

### ReturnValue

नया [XmlDeclaration](../../xmldeclaration/) नोड।
## टिप्पणियाँ



ध्यान दें: यदि [XmlDocument](../) को TextWriter या [XmlTextWriter](../../xmltextwriter/) में से किसी एक में सहेजा जाता है, तो यह एन्कोडिंग मान त्याग दिया जाता है। इसके बजाय, TextWriter या [XmlTextWriter](../../xmltextwriter/) की एन्कोडिंग उपयोग की जाती है। यह सुनिश्चित करता है कि लिखा गया XML सही एन्कोडिंग के साथ पुनः पढ़ा जा सके।
## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
