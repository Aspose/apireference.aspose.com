---
title: "System::Xml::Xsl::XsltContext::ResolveVariable विधि"
linktitle: "ResolveVariable"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XsltContext::ResolveVariable विधि। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक वेरिएबल रेफ़रेंस को हल करता है और C++ में वेरिएबल का प्रतिनिधित्व करने वाला IXsltContextVariable लौटाता है।"
type: docs
weight: 500
url: /hi/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक वेरिएबल रेफ़रेंस को हल करता है और एक [IXsltContextVariable](../../ixsltcontextvariable/) लौटाता है जो वेरिएबल का प्रतिनिधित्व करता है।

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| prefix | String | वेरिएबल का उपसर्ग जैसा कि [XPath](../../../system.xml.xpath/) अभिव्यक्ति में दिखाई देता है। |
| नाम | String | वेरिएबल का नाम। |

### ReturnValue

रनटाइम पर वेरिएबल का प्रतिनिधित्व करने वाला एक [IXsltContextVariable](../../ixsltcontextvariable/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
