---
title: "System::Xml::Schema::XmlSchemaValidator क्लास"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaValidator क्लास। एक XML स्कीमा डिफिनिशन लैंग्वेज (XSD) स्कीमा वैलिडेशन इंजन को दर्शाता है। XmlSchemaValidator क्लास को C++ में विरासत में नहीं लिया जा सकता।"
type: docs
weight: 7000
url: /hi/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) [Schema](../) वैलिडेशन इंजन को दर्शाता है। [XmlSchemaValidator](./) क्लास को विरासत में नहीं लिया जा सकता।

```cpp
class XmlSchemaValidator : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | वैलिडेशन के लिए उपयोग किए जाने वाले स्कीमा सेट में एक XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा जोड़ता है। |
| [EndValidation](./endvalidation/)() | वैलिडेशन समाप्त करता है और पूरे XML दस्तावेज़ के लिए पहचान बाधाओं की जाँच करता है। |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | वैलिडेट किए जा रहे XML नोड के लिए पंक्ति संख्या जानकारी लौटाता है। |
| [get_SourceUri](./get_sourceuri/)() | वैलिडेट किए जा रहे XML नोड के स्रोत URI को लौटाता है। |
| [get_ValidationEventSender](./get_validationeventsender/)() | वैलिडेशन इवेंट के प्रेषक ऑब्जेक्ट के रूप में भेजे गए ऑब्जेक्ट को लौटाता है। |
| [GetExpectedAttributes](./getexpectedattributes/)() | वर्तमान तत्व संदर्भ के लिए अपेक्षित गुणों को लौटाता है। |
| [GetExpectedParticles](./getexpectedparticles/)() | वर्तमान तत्व संदर्भ में अपेक्षित कणों को लौटाता है। |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | डिफ़ॉल्ट गुणों पर पहचान प्रतिबंधों को वैध करता है और किसी भी ऐसे गुणों के लिए, जिनके डिफ़ॉल्ट मान पहले [XmlSchemaValidator::ValidateAttribute](./validateattribute/) मेथड का उपयोग करके तत्व संदर्भ में सत्यापित नहीं किए गए हैं, निर्दिष्ट List को [XmlSchemaAttribute](../xmlschemaattribute/) ऑब्जेक्ट्स से भरता है। |
| [Initialize](./initialize/)() | [XmlSchemaValidator](./) ऑब्जेक्ट की स्थिति को प्रारंभ करता है। |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaValidator](./) ऑब्जेक्ट की स्थिति को प्रारंभ करता है, आंशिक वैधता के लिए निर्दिष्ट [XmlSchemaObject](../xmlschemaobject/) का उपयोग करके। |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | वैलिडेट किए जा रहे XML नोड के लिए लाइन नंबर जानकारी सेट करता है। |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | वैलिडेट किए जा रहे XML नोड के स्रोत URI को सेट करता है। |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | वैलिडेशन इवेंट के प्रेषक ऑब्जेक्ट के रूप में भेजे गए ऑब्जेक्ट को सेट करता है। |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlResolver](../../system.xml/xmlresolver/) ऑब्जेक्ट को सेट करता है, जिसका उपयोग **xs:import** और **xs:include** तत्वों तथा **xsi:schemaLocation** और **xsi:noNamespaceSchemaLocation** गुणों को हल करने के लिए किया जाता है। |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | वर्तमान तत्व सामग्री की वैधता को छोड़ देता है और पैरेंट तत्व के संदर्भ में सामग्री को वैध करने के लिए [XmlSchemaValidator](./) ऑब्जेक्ट को तैयार करता है। |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | वर्तमान तत्व संदर्भ में एट्रिब्यूट नाम, नेमस्पेस URI और मान को वैध करता है। |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | वर्तमान तत्व संदर्भ में एट्रिब्यूट नाम, नेमस्पेस URI और मान को वैध करता है। |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | वर्तमान संदर्भ में तत्व को वैध करता है। |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | वर्तमान संदर्भ में तत्व को वैध करता है, जिसमें निर्दिष्ट **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation**, और **xsi:NoNamespaceSchemaLocation** गुण मान शामिल हैं। |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | सरल सामग्री वाले तत्वों के लिए, तत्व की टेक्स्ट सामग्री उसके डेटा प्रकार के अनुसार वैध है या नहीं, यह सत्यापित करता है, और जटिल सामग्री वाले तत्वों के लिए, वर्तमान तत्व की सामग्री पूर्ण है या नहीं, यह भी सत्यापित करता है। |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | निर्दिष्ट तत्व की टेक्स्ट सामग्री उसके डेटा प्रकार के अनुसार वैध है या नहीं, यह सत्यापित करता है। |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | तत्व संदर्भ में सभी आवश्यक गुण उपस्थित हैं या नहीं, यह सत्यापित करता है और तत्व की चाइल्ड सामग्री को वैध करने के लिए [XmlSchemaValidator](./) ऑब्जेक्ट को तैयार करता है। |
| [ValidateText](./validatetext/)(const String\&) | जाँचता है कि निर्दिष्ट टेक्स्ट **string** वर्तमान तत्व संदर्भ में अनुमति है या नहीं, और यदि वर्तमान तत्व में सरल सामग्री है तो वैधता के लिए टेक्स्ट को संकलित करता है। |
| [ValidateText](./validatetext/)(XmlValueGetter) | जाँचता है कि निर्दिष्ट [XmlValueGetter](../xmlvaluegetter/) ऑब्जेक्ट द्वारा लौटाया गया टेक्स्ट वर्तमान तत्व संदर्भ में अनुमति है या नहीं, और यदि वर्तमान तत्व में सरल सामग्री है तो वैधता के लिए टेक्स्ट को संकलित करता है। |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | जाँचता है कि निर्दिष्ट **string** में सफ़ेद स्थान वर्तमान तत्व संदर्भ में अनुमति है या नहीं, और यदि वर्तमान तत्व में सरल सामग्री है तो वैधता के लिए सफ़ेद स्थान को संकलित करता है। |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | जाँचता है कि निर्दिष्ट [XmlValueGetter](../xmlvaluegetter/) ऑब्जेक्ट द्वारा लौटाया गया सफ़ेद स्थान वर्तमान तत्व संदर्भ में अनुमति है या नहीं, और यदि वर्तमान तत्व में सरल सामग्री है तो वैधता के लिए सफ़ेद स्थान को संकलित करता है। |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | [XmlSchemaValidator](./) क्लास का नया इंस्टेंस प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
