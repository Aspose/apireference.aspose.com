---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace विधि"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace विधि। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो दिए गए संदर्भ के लिए व्हाइटस्पेस नोड्स को संरक्षित करना है या हटाना है, इसका मूल्यांकन करता है C++ में।"
type: docs
weight: 300
url: /hi/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो दिए गए संदर्भ के लिए व्हाइट स्पेस नोड्स को संरक्षित करने या हटाने का मूल्यांकन करता है।

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नोड | SharedPtr\<System::Xml::XPath::XPathNavigator\> | वर्तमान संदर्भ में जिसे संरक्षित या हटाया जाना है वह व्हाइटस्पेस नोड। |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
