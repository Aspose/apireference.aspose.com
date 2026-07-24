---
title: "System::Xml::XmlParserContext::XmlParserContext कंस्ट्रक्टर"
linktitle: "XmlParserContext"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlParserContext::XmlParserContext कंस्ट्रक्टर। C++ में निर्दिष्ट XmlNameTable, XmlNamespaceManager, बेस URI, xml:lang, xml:space, और डॉक्यूमेंट टाइप मानों के साथ XmlParserContext क्लास का नया इंस्टेंस इनिशियलाइज़ करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


[XmlParserContext](../) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है, जिसमें निर्दिष्ट [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), बेस URI, **xml:lang**, **xml:space**, और डॉक्यूमेंट टाइप मान शामिल हैं।

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | यह [XmlNameTable](../../xmlnametable/) स्ट्रिंग्स को एटॉमाइज़ करने के लिए उपयोग किया जाता है। यदि यह **nullptr** है, तो **nsMgr** बनाने के लिए उपयोग की गई नाम तालिका इसके बजाय उपयोग की जाती है। एटॉमाइज़्ड स्ट्रिंग्स के बारे में अधिक जानकारी के लिए, देखें [XmlNameTable](../../xmlnametable/)। |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | यह [XmlNamespaceManager](../../xmlnamespacemanager/) नेमस्पेस जानकारी खोजने के लिए उपयोग किया जाता है, या **nullptr**। |
| docTypeName | const String\& | दस्तावेज़ प्रकार घोषणा का नाम। |
| pubId | const String\& | सार्वजनिक पहचानकर्ता। |
| sysId | const String\& | सिस्टम पहचानकर्ता। |
| internalSubset | const String\& | आंतरिक DTD उपसमुच्चय। DTD उपसमुच्चय इकाई समाधान के लिए उपयोग किया जाता है, दस्तावेज़ सत्यापन के लिए नहीं। |
| baseURI | const String\& | XML अंश के लिए आधार URI (जिस स्थान से अंश लोड किया गया था)। |
| xmlLang | const String\& | यह **xml:lang** स्कोप। |
| xmlSpace | System::Xml::XmlSpace | एक [XmlSpace](../../xmlspace/) मान जो **xml:space** स्कोप को दर्शाता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


निर्दिष्ट [XmlParserContext](../) वर्ग की नई इंस्टेंस को निर्दिष्ट [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), आधार URI, **xml:lang**, **xml:space**, एन्कोडिंग, और दस्तावेज़ प्रकार मानों के साथ प्रारंभ करता है।

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | यह [XmlNameTable](../../xmlnametable/) स्ट्रिंग्स को एटॉमाइज़ करने के लिए उपयोग किया जाता है। यदि यह **nullptr** है, तो **nsMgr** बनाने के लिए उपयोग की गई नाम तालिका इसके बजाय उपयोग की जाती है। एटॉमाइज़्ड स्ट्रिंग्स के बारे में अधिक जानकारी के लिए, देखें [XmlNameTable](../../xmlnametable/)। |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | यह [XmlNamespaceManager](../../xmlnamespacemanager/) नेमस्पेस जानकारी खोजने के लिए उपयोग किया जाता है, या **nullptr**। |
| docTypeName | const String\& | दस्तावेज़ प्रकार घोषणा का नाम। |
| pubId | const String\& | सार्वजनिक पहचानकर्ता। |
| sysId | const String\& | सिस्टम पहचानकर्ता। |
| internalSubset | const String\& | आंतरिक DTD उपसमुच्चय। DTD इकाई समाधान के लिए उपयोग किया जाता है, दस्तावेज़ सत्यापन के लिए नहीं। |
| baseURI | const String\& | XML अंश के लिए आधार URI (जिस स्थान से अंश लोड किया गया था)। |
| xmlLang | const String\& | यह **xml:lang** स्कोप। |
| xmlSpace | System::Xml::XmlSpace | एक [XmlSpace](../../xmlspace/) मान जो **xml:space** स्कोप को दर्शाता है। |
| enc | const SharedPtr\<System::Text::Encoding\>\& | एन्कोडिंग सेटिंग दर्शाने वाला Encoding ऑब्जेक्ट। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


निर्दिष्ट [XmlParserContext](../) वर्ग की नई इंस्टेंस को निर्दिष्ट [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, और **xml:space** मानों के साथ प्रारंभ करता है।

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | यह [XmlNameTable](../../xmlnametable/) स्ट्रिंग्स को एटॉमाइज़ करने के लिए उपयोग किया जाता है। यदि यह **nullptr** है, तो **nsMgr** बनाने के लिए उपयोग की गई नाम तालिका इसके बजाय उपयोग की जाती है। एटॉमाइज़्ड स्ट्रिंग्स के बारे में अधिक जानकारी के लिए, देखें [XmlNameTable](../../xmlnametable/)। |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | यह [XmlNamespaceManager](../../xmlnamespacemanager/) नेमस्पेस जानकारी खोजने के लिए उपयोग किया जाता है, या **nullptr**। |
| xmlLang | const String\& | यह **xml:lang** स्कोप। |
| xmlSpace | System::Xml::XmlSpace | एक [XmlSpace](../../xmlspace/) मान जो **xml:space** स्कोप को दर्शाता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


निर्दिष्ट [XmlParserContext](../) वर्ग की नई इंस्टेंस को निर्दिष्ट [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space**, और एन्कोडिंग के साथ प्रारंभ करता है।

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) का उपयोग स्ट्रिंग्स को एटॉमाइज़ करने के लिए किया जाता है। यदि यह **nullptr** है, तो **nsMgr** बनाने के लिए उपयोग की गई नाम तालिका इसके बजाय उपयोग की जाती है। एटॉमाइज़्ड स्ट्रिंग्स के बारे में अधिक जानकारी के लिए, देखें [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | यह [XmlNamespaceManager](../../xmlnamespacemanager/) नेमस्पेस जानकारी खोजने के लिए उपयोग किया जाता है, या **nullptr**। |
| xmlLang | const String\& | यह **xml:lang** स्कोप। |
| xmlSpace | System::Xml::XmlSpace | एक [XmlSpace](../../xmlspace/) मान जो **xml:space** स्कोप को दर्शाता है। |
| enc | const SharedPtr\<System::Text::Encoding\>\& | एन्कोडिंग सेटिंग दर्शाने वाला Encoding ऑब्जेक्ट। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
