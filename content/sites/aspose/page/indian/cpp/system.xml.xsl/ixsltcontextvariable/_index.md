---
title: "System::Xml::Xsl::IXsltContextVariable class"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::IXsltContextVariable class. C++ में रनटाइम निष्पादन के दौरान स्टाइल शीट में परिभाषित एक दिए गए वेरिएबल के लिए इंटरफ़ेस प्रदान करता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


रनटाइम निष्पादन के दौरान स्टाइल शीट में परिभाषित किसी दिए गए वेरिएबल के लिए इंटरफ़ेस प्रदान करता है।

```cpp
class IXsltContextVariable : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | रनटाइम पर वेरिएबल का मूल्यांकन करता है और एक ऑब्जेक्ट लौटाता है जो वेरिएबल के मान का प्रतिनिधित्व करता है। |
| virtual [get_IsLocal](./get_islocal/)() | एक मान लौटाता है जो दर्शाता है कि वेरिएबल स्थानीय है या नहीं। |
| virtual [get_IsParam](./get_isparam/)() | एक मान लौटाता है जो दर्शाता है कि वेरिएबल Extensible Stylesheet Language Transformations (XSLT) पैरामीटर है या नहीं। यह एक स्टाइल शीट या टेम्पलेट का पैरामीटर हो सकता है। |
| virtual [get_VariableType](./get_variabletype/)() | वेरिएबल के XML Path Language ([XPath](../../system.xml.xpath/)) प्रकार को दर्शाने वाला XPathResultType लौटाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
