---
title: "System::Xml::Schema::XmlSchemaComplexType क्लास"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaComplexType क्लास। XML Schema से complexType तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास एक जटिल प्रकार को परिभाषित करती है जो C++ में किसी तत्व के गुणों और सामग्री के सेट को निर्धारित करता है।"
type: docs
weight: 2100
url: /hi/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


XML [Schema](../) से **complexType** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास एक जटिल प्रकार को परिभाषित करती है जो किसी तत्व के गुणों और सामग्री के सेट को निर्धारित करता है।

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | जटिल प्रकार के [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) घटक के लिए मान लौटाता है। |
| [get_Attributes](./get_attributes/)() | जटिल प्रकार के लिए गुणों का संग्रह लौटाता है। |
| [get_AttributeUses](./get_attributeuses/)() | इस जटिल प्रकार और उसके बेस प्रकारों के सभी संकलित गुणों का संग्रह लौटाता है। |
| [get_AttributeWildcard](./get_attributewildcard/)() | इस जटिल प्रकार और उसके बेस प्रकार(ओं) के लिए **anyAttribute** का पोस्ट-संकलन मान लौटाता है। |
| [get_Block](./get_block/)() | **block** गुण लौटाता है। |
| [get_BlockResolved](./get_blockresolved/)() | प्रकार को पोस्ट-स्कीमा-वैधता सूचना सेट (infoset) में संकलित करने के बाद मान लौटाता है। यह मान दर्शाता है कि जब **xsi:type** का उपयोग इंस्टेंस दस्तावेज़ में किया जाता है तो प्रकार कैसे लागू किया जाता है। |
| [get_ContentModel](./get_contentmodel/)() | इस जटिल प्रकार का पोस्ट-संकलन [XmlSchemaContentModel](../xmlschemacontentmodel/) लौटाता है। |
| [get_ContentType](./get_contenttype/)() | जटिल प्रकार का कंटेंट मॉडल लौटाता है जो पोस्ट-संकलन मान को रखता है। |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | [XmlSchemaComplexType::get_ContentType](./get_contenttype/) पार्टिकल लौटाता है जो पोस्ट-संकलन मान को रखता है। |
| [get_IsAbstract](./get_isabstract/)() | **complexType** तत्व को इंस्टेंस दस्तावेज़ में उपयोग किया जा सकता है या नहीं, यह निर्धारित करने वाली जानकारी लौटाता है। |
| [get_IsMixed](./get_ismixed/)() override | जटिल प्रकार के पास मिश्रित कंटेंट मॉडल (सामग्री के भीतर मार्कअप) है या नहीं, यह निर्धारित करने वाली जानकारी लौटाता है। |
| [get_Particle](./get_particle/)() | कॉम्पोजिटर प्रकार को निम्नलिखित में से एक के रूप में लौटाता है: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), या [XmlSchemaSequence](../xmlschemasequence/) क्लासेस। |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | जटिल प्रकार के [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) घटक के लिए मान सेट करता है। |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | **block** गुण सेट करता है। |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | इस जटिल प्रकार का पोस्ट-संकलन [XmlSchemaContentModel](../xmlschemacontentmodel/) सेट करता है। |
| [set_IsAbstract](./set_isabstract/)(bool) | **complexType** तत्व को इंस्टेंस दस्तावेज़ में उपयोग किया जा सकता है या नहीं, यह निर्धारित करने वाली जानकारी सेट करता है। |
| [set_IsMixed](./set_ismixed/)(bool) override | जटिल प्रकार के पास मिश्रित कंटेंट मॉडल (सामग्री के भीतर मार्कअप) है या नहीं, यह निर्धारित करने वाली जानकारी सेट करता है। |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | कॉम्पोजिटर प्रकार को निम्नलिखित में से एक के रूप में सेट करता है: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), या [XmlSchemaSequence](../xmlschemasequence/) क्लासेस। |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | [XmlSchemaComplexType](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
