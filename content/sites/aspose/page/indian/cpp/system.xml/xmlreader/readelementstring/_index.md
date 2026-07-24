---
title: "System::Xml::XmlReader::ReadElementString मेथड"
linktitle: "ReadElementString"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadElementString मेथड। केवल‑पाठ तत्व को पढ़ता है। हालांकि, C++ में इस ऑपरेशन को संभालने का अधिक सरल तरीका प्रदान करने के कारण, इसके बजाय XmlReader::ReadElementContentAsString मेथड का उपयोग करने की सलाह दी जाती है।"
type: docs
weight: 6400
url: /hi/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


केवल‑पाठ तत्व को पढ़ता है। हालांकि, यह अधिक सरल तरीका प्रदान करने के कारण, इसके बजाय [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) मेथड का उपयोग करने की सलाह दी जाती है।

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

पढ़े गए तत्व में मौजूद पाठ। यदि तत्व खाली है तो एक खाली स्ट्रिंग।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String, String) method


केवल‑पाठ तत्व को पढ़ने से पहले जाँचता है कि पाए गए तत्व के [XmlReader::get_LocalName](../get_localname/) और [XmlReader::get_NamespaceURI](../get_namespaceuri/) मान दिए गए स्ट्रिंग्स से मेल खाते हैं। हालांकि, यह अधिक सरल तरीका प्रदान करने के कारण, इसके बजाय [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) मेथड का उपयोग करने की सलाह दी जाती है।

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्थानीयनाम | String | जाँचने के लिए स्थानीय नाम। |
| ns | String | जाँचने के लिए नेमस्पेस URI। |

### ReturnValue

पढ़े गए तत्व में मौजूद पाठ। यदि तत्व खाली है तो एक खाली स्ट्रिंग।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String) method


जाँचता है कि पाए गए तत्व का [XmlReader::get_Name](../get_name/) मान दिया गया स्ट्रिंग से मेल खाता है, इससे पहले कि केवल‑पाठ तत्व को पढ़ा जाए। हालांकि, इसके बजाय [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) मेथड का उपयोग करने की सलाह दी जाती है, क्योंकि यह इस ऑपरेशन को संभालने का अधिक सरल तरीका प्रदान करता है।

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | जाँचने के लिए नाम। |

### ReturnValue

पढ़े गए तत्व में मौजूद पाठ। यदि तत्व खाली है तो एक खाली स्ट्रिंग।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
