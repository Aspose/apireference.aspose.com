---
title: "System::Xml::Xsl::XsltContext class"
linktitle: "XsltContext"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XsltContext class। Extensible Stylesheet Language for Transformations (XSLT) प्रोसेसर के वर्तमान निष्पादन संदर्भ को संलग्न करता है, जिससे XML Path Language (XPath) C++ में XPath अभिव्यक्तियों के भीतर फ़ंक्शन, पैरामीटर और नेमस्पेस को हल कर सके।"
type: docs
weight: 500
url: /hi/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Extensible Stylesheet Language for Transformations (XSLT) प्रोसेसर के वर्तमान निष्पादन संदर्भ को संलग्न करता है, जिससे XML Path Language ([XPath](../../system.xml.xpath/)) फ़ंक्शन, पैरामीटर और नेमस्पेस को [XPath](../../system.xml.xpath/) अभिव्यक्तियों के भीतर हल कर सके।

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो XSLT प्रोसेसर द्वारा दस्तावेज़ों के लोड किए जाने के क्रम के आधार पर दो दस्तावेज़ों के मूल Uniform Resource Identifiers (URIs) की तुलना करता है (अर्थात, [XslTransform](../xsltransform/) क्लास)। |
| virtual [get_Whitespace](./get_whitespace/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो आउटपुट में व्हाइट स्पेस नोड्स को शामिल करने का संकेत देने वाला मान प्राप्त करता है। |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो दिए गए संदर्भ के लिए व्हाइट स्पेस नोड्स को संरक्षित करने या हटाने का मूल्यांकन करता है। |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो एक फ़ंक्शन रेफ़रेंस को हल करता है और फ़ंक्शन का प्रतिनिधित्व करने वाला [IXsltContextFunction](../ixsltcontextfunction/) लौटाता है। [IXsltContextFunction](../ixsltcontextfunction/) का उपयोग निष्पादन समय पर फ़ंक्शन के रिटर्न वैल्यू को प्राप्त करने के लिए किया जाता है। |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो एक वेरिएबल रेफ़रेंस को हल करता है और वेरिएबल का प्रतिनिधित्व करने वाला [IXsltContextVariable](../ixsltcontextvariable/) लौटाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
