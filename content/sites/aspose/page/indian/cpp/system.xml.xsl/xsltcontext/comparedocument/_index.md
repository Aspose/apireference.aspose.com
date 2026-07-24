---
title: "System::Xml::Xsl::XsltContext::CompareDocument विधि"
linktitle: "CompareDocument"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XsltContext::CompareDocument विधि। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो दो दस्तावेज़ों के बेस यूनिफॉर्म रिसोर्स आइडेंटिफ़ायर्स (URIs) की तुलना XSLT प्रोसेसर द्वारा दस्तावेज़ों को लोड किए जाने के क्रम के आधार पर करती है (अर्थात, XslTransform वर्ग) C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो दो दस्तावेज़ों के बेस यूनिफॉर्म रिसोर्स आइडेंटिफ़ायर्स (URIs) की तुलना XSLT प्रोसेसर द्वारा दस्तावेज़ों को लोड किए जाने के क्रम के आधार पर करती है (अर्थात, [XslTransform](../../xsltransform/) वर्ग)।

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| baseUri | String | तुलना करने के लिए पहले दस्तावेज़ का बेस URI। |
| nextbaseUri | String | तुलना करने के लिए दूसरे दस्तावेज़ का बेस URI। |

### ReturnValue

दो बेस URIs के सापेक्ष क्रम का वर्णन करने वाला एक पूर्णांक मान: -1 यदि **baseUri** **nextbaseUri** से पहले आता है; 0 यदि दोनों बेस URIs समान हैं; और 1 यदि **baseUri** **nextbaseUri** के बाद आता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
