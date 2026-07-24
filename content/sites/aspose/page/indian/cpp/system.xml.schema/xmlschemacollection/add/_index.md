---
title: "System::Xml::Schema::XmlSchemaCollection::Add method"
linktitle: "Add"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaCollection::Add method. C++ में XmlSchema को संग्रह में जोड़ता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


[XmlSchema](../../xmlschema/) को संग्रह में जोड़ता है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | संग्रह में जोड़ने के लिए [XmlSchema](../../xmlschema/)। |

### ReturnValue

[XmlSchema](../../xmlschema/) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


[XmlSchema](../../xmlschema/) को संग्रह में जोड़ता है। निर्दिष्ट [XmlResolver](../../../system.xml/xmlresolver/) का उपयोग किसी भी बाहरी संदर्भ को हल करने के लिए किया जाता है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | संग्रह में जोड़ने के लिए [XmlSchema](../../xmlschema/)। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) का उपयोग **include** और **import** तत्वों में संदर्भित नेमस्पेस को हल करने के लिए किया जाता है। यदि यह **nullptr** है, तो बाहरी संदर्भ हल नहीं किए जाते। |

### ReturnValue

स्कीमा संग्रह में जोड़ा गया [XmlSchema](../../xmlschema/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


दिए गए संग्रह में परिभाषित सभी नेमस्पेस (उनके संबंधित स्कीमा सहित) को इस संग्रह में जोड़ता है।

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | वह [XmlSchemaCollection](../) जिसे आप इस संग्रह में जोड़ना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) में मौजूद स्कीमा को स्कीमा संग्रह में जोड़ता है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ns | const String\& | स्कीमा से जुड़ा नेमस्पेस URI। XML स्कीमा के लिए, यह सामान्यतः **targetNamespace** होगा। |
| reader | const SharedPtr\<XmlReader\>\& | स्कीमा को जोड़ने वाला [XmlReader](../../../system.xml/xmlreader/)। |

### ReturnValue

स्कीमा संग्रह में जोड़ा गया [XmlSchema](../../xmlschema/); यदि जोड़ा जा रहा स्कीमा XDR स्कीमा है या स्कीमा में संकलन त्रुटियाँ हैं तो **nullptr**।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


स्कीमा को जोड़ता है जो [XmlReader](../../../system.xml/xmlreader/) में निहित है स्कीमा संग्रह में। निर्दिष्ट [XmlResolver](../../../system.xml/xmlresolver/) का उपयोग किसी भी बाहरी संसाधनों को हल करने के लिए किया जाता है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ns | const String\& | स्कीमा से जुड़ा नेमस्पेस URI। XML स्कीमा के लिए, यह सामान्यतः **targetNamespace** होगा। |
| reader | const SharedPtr\<XmlReader\>\& | स्कीमा को जोड़ने वाला [XmlReader](../../../system.xml/xmlreader/)। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | स्कीमा संग्रह में **include** और **import** तत्वों या **x-schema** विशेषता (XDR स्कीमा) में संदर्भित नेमस्पेस को हल करने के लिए उपयोग किया जाने वाला [XmlResolver](../../../system.xml/xmlresolver/)। यदि यह **nullptr** है, तो बाहरी संदर्भ हल नहीं किए जाते। |

### ReturnValue

स्कीमा संग्रह में जोड़ा गया [XmlSchema](../../xmlschema/); यदि जोड़ा जा रहा स्कीमा XDR स्कीमा है या स्कीमा में संकलन त्रुटियाँ हैं तो **nullptr**।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


दिए गए URL द्वारा स्थित स्कीमा को स्कीमा संग्रह में जोड़ता है।

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ns | const String\& | स्कीमा से जुड़ा नेमस्पेस URI। XML स्कीमा के लिए, यह सामान्यतः **targetNamespace** होगा। |
| uri | const String\& | स्कीमा लोड करने के लिए निर्दिष्ट करने वाला URL। |

### ReturnValue

स्कीमा संग्रह में जोड़ा गया [XmlSchema](../../xmlschema/); यदि जोड़ा जा रहा स्कीमा XDR स्कीमा है या स्कीमा में संकलन त्रुटियाँ हैं तो **nullptr**।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
