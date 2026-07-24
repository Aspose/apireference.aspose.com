---
title: "System::Xml::Schema::XmlSchemaElement क्लास"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaElement क्लास। XML Schema से element तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट किया गया है। यह क्लास सभी particle प्रकारों के लिए बेस क्लास है और C++ में XML दस्तावेज़ में एक तत्व का वर्णन करने के लिए उपयोग की जाती है।"
type: docs
weight: 2600
url: /hi/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


XML [Schema](../) से **element** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट किया गया है। यह क्लास सभी particle प्रकारों के लिए बेस क्लास है और XML दस्तावेज़ में एक तत्व का वर्णन करने के लिए उपयोग की जाती है।

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Block](./get_block/)() | **Block** व्युत्पन्न को लौटाता है। |
| [get_BlockResolved](./get_blockresolved/)() | **Block** मान की पोस्ट-संकलन व्याख्या को लौटाता है। |
| [get_Constraints](./get_constraints/)() | तत्व पर प्रतिबंधों का संग्रह लौटाता है। |
| [get_DefaultValue](./get_defaultvalue/)() | यदि तत्व की सामग्री एक simple type है या तत्व की सामग्री **textOnly** है तो तत्व का डिफ़ॉल्ट मान लौटाता है। |
| [get_ElementSchemaType](./get_elementschematype/)() | तत्व के प्रकार को दर्शाने वाला एक [XmlSchemaType](../xmlschematype/) ऑब्जेक्ट लौटाता है, जो तत्व के [XmlSchemaElement::get_SchemaType](./get_schematype/) या [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) मानों पर आधारित है। |
| [get_ElementType](./get_elementtype/)() | तत्व के [XmlSchemaElement](./) या [XmlSchemaElement](./) पर आधारित एक ऑब्जेक्ट लौटाता है, जो **ElementType** मान की पोस्ट-संकलन व्याख्या रखता है। |
| [get_Final](./get_final/)() | कोई आगे का व्युत्पन्न अनुमति न हो, यह दर्शाने के लिए **Final** मान लौटाता है। |
| [get_FinalResolved](./get_finalresolved/)() | **Final** मान की पोस्ट-संकलन व्याख्या लौटाता है। |
| [get_FixedValue](./get_fixedvalue/)() | स्थिर मान लौटाता है। |
| [get_Form](./get_form/)() | तत्व के रूप को लौटाता है। |
| [get_IsAbstract](./get_isabstract/)() | यह संकेत देने के लिए जानकारी लौटाता है कि क्या तत्व को एक इंस्टेंस दस्तावेज़ में उपयोग किया जा सकता है। |
| [get_IsNillable](./get_isnillable/)() | यह संकेत देने वाली जानकारी लौटाता है कि क्या **xsi:nil** इंस्टेंस डेटा में हो सकता है। यह दर्शाता है कि क्या तत्व को स्पष्ट रूप से nil मान सौंपा जा सकता है। |
| [get_Name](./get_name/)() | तत्व का नाम लौटाता है। |
| [get_QualifiedName](./get_qualifiedname/)() | दिए गए तत्व के वास्तविक योग्य नाम को लौटाता है। |
| [get_RefName](./get_refname/)() | इस स्कीमा (या निर्दिष्ट नेमस्पेस द्वारा संकेतित अन्य स्कीमा) में घोषित तत्व के संदर्भ नाम को लौटाता है। |
| [get_SchemaType](./get_schematype/)() | तत्व का प्रकार लौटाता है। यह या तो एक complex type या एक simple type हो सकता है। |
| [get_SchemaTypeName](./get_schematypename/)() | इस स्कीमा या निर्दिष्ट नेमस्पेस द्वारा संकेतित अन्य स्कीमा में परिभाषित एक बिल्ट-इन डेटा टाइप का नाम लौटाता है। |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | इस तत्व द्वारा प्रतिस्थापित किए जा रहे तत्व का नाम लौटाता है। |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | **Block** डेरिवेशन सेट करता है। |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | यदि तत्व की सामग्री एक सरल प्रकार है या तत्व की सामग्री **textOnly** है तो तत्व का डिफ़ॉल्ट मान सेट करता है। |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | **Final** मान सेट करता है ताकि यह संकेत दे कि आगे कोई डेरिवेशन अनुमति नहीं है। |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | स्थिर मान सेट करता है। |
| [set_Form](./set_form/)(XmlSchemaForm) | तत्व के फ़ॉर्म को सेट करता है। |
| [set_IsAbstract](./set_isabstract/)(bool) | यह संकेत देने के लिए जानकारी सेट करता है कि क्या तत्व को एक उदाहरण दस्तावेज़ में उपयोग किया जा सकता है। |
| [set_IsNillable](./set_isnillable/)(bool) | उदाहरण डेटा में **xsi:nil** हो सकता है या नहीं, यह दर्शाने वाली जानकारी सेट करता है। यह संकेत देता है कि क्या तत्व को स्पष्ट रूप से निल मान सौंपा जा सकता है। |
| [set_Name](./set_name/)(const String\&) | तत्व का नाम सेट करता है। |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | इस स्कीमा (या निर्दिष्ट नेमस्पेस द्वारा संकेतित अन्य स्कीमा) में घोषित तत्व के संदर्भ नाम को सेट करता है। |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | तत्व का प्रकार सेट करता है। यह या तो एक कॉम्प्लेक्स टाइप या एक सरल टाइप हो सकता है। |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | इस स्कीमा या निर्दिष्ट नेमस्पेस द्वारा संकेतित अन्य स्कीमा में परिभाषित बिल्ट‑इन डेटा टाइप का नाम सेट करता है। |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | इस तत्व द्वारा प्रतिस्थापित किए जा रहे तत्व का नाम सेट करता है। |
| [XmlSchemaElement](./xmlschemaelement/)() | [XmlSchemaElement](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
