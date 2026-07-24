---
title: "System::Xml::Xsl::IXsltContextFunction class"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::IXsltContextFunction class। C++ में रनटाइम निष्पादन के दौरान Extensible Stylesheet Language for Transformations (XSLT) स्टाइल शीट में परिभाषित किसी फ़ंक्शन के लिए एक इंटरफ़ेस प्रदान करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


रनटाइम निष्पादन के दौरान Extensible Stylesheet Language for Transformations (XSLT) स्टाइल शीट में परिभाषित किसी दिए गए फ़ंक्शन के लिए इंटरफ़ेस प्रदान करता है।

```cpp
class IXsltContextFunction : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | फ़ंक्शन के आर्ग्यूमेंट लिस्ट के लिए प्रदान किए गए XML Path Language ([XPath](../../system.xml.xpath/)) प्रकार लौटाता है। इस जानकारी का उपयोग फ़ंक्शन के सिग्नेचर को खोजने के लिए किया जा सकता है, जिससे आप ओवरलोडेड फ़ंक्शनों के बीच अंतर कर सकते हैं। |
| virtual [get_Maxargs](./get_maxargs/)() | फ़ंक्शन के लिए अधिकतम आर्ग्यूमेंट्स की संख्या लौटाता है। यह उपयोगकर्ता को ओवरलोडेड फ़ंक्शनों के बीच अंतर करने में सक्षम बनाता है। |
| virtual [get_Minargs](./get_minargs/)() | फ़ंक्शन के लिए न्यूनतम आर्ग्यूमेंट्स की संख्या लौटाता है। यह उपयोगकर्ता को ओवरलोडेड फ़ंक्शनों के बीच अंतर करने में सक्षम बनाता है। |
| virtual [get_ReturnType](./get_returntype/)() | फ़ंक्शन द्वारा लौटाए गए [XPath](../../system.xml.xpath/) प्रकार को दर्शाने वाला XPathResultType लौटाता है। |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | दिए गए संदर्भ में दिए गए आर्ग्यूमेंट्स के साथ फ़ंक्शन को कॉल करने की विधि प्रदान करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
