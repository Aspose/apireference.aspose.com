---
title: "System::Net::Http::Headers::HttpHeaders क्लास"
linktitle: "HttpHeaders"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::HttpHeaders क्लास। HTTP हेडर्स का संग्रह। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर को फ़ंक्शन में आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 700
url: /hi/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


HTTP हेडर्स का संग्रह। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर को फ़ंक्शन में आर्ग्यूमेंट के रूप में पास करें।

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | एक नया नाम-मान जोड़ा मान्य करता है और इसे वर्तमान संग्रह में जोड़ता है। |
| [Add](./add/)(String, String) | एक नया नाम-मूल्य जोड़ा को मान्य करता है और इसे वर्तमान संग्रह में जोड़ता है। |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | निर्दिष्ट HttpHeaders-class इंस्टेंस को वर्तमान वाले के साथ जोड़ता है। |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | निर्दिष्ट नाम द्वारा एक हेडर प्राप्त करता है और हेडर में पार्स किया गया मान जोड़ता है। |
| [Clear](./clear/)() | संग्रह से सभी आइटम हटाता है। |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | जाँचता है कि हेडर में निर्दिष्ट मान मौजूद है या नहीं। |
| [GetEnumerator](./getenumerator/)() override | एन्यूमरेटर प्राप्त करता है। |
| [GetHeaderString](./getheaderstring/)(String) | निर्दिष्ट हेडर नाम द्वारा मानों का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | निर्दिष्ट हेडर नाम द्वारा मानों का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [GetHeaderStrings](./getheaderstrings/)() | एक संग्रह लौटाता है जिसमें हेडरों के मानों के स्ट्रिंग प्रतिनिधित्व शामिल होते हैं। |
| [GetParsedValues](./getparsedvalues/)(String) | निर्दिष्ट हेडर नाम द्वारा पार्स किए गए मान लौटाता है। |
| [GetValues](./getvalues/)(String) | निर्दिष्ट नाम द्वारा संबंधित मान लौटाता है। |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | पार्स किए गए मानों को सूची में परिवर्तित करता है। |
| [Remove](./remove/)(String) | निर्दिष्ट नाम द्वारा एक आइटम हटाने का प्रयास करता है। |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | निर्दिष्ट नाम द्वारा एक हेडर प्राप्त करता है और हेडर से पार्स किया गया मान हटाता है। |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | निर्दिष्ट नाम द्वारा एक हेडर प्राप्त करता है और उसका मान सेट या हटाता है। जब 'value' पैरामीटर nullptr होता है तो हेडर मान हटाया जाएगा, अन्यथा एक पार्स किया गया मान सेट किया जाएगा। |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | निर्दिष्ट नाम द्वारा एक हेडर प्राप्त करता है और हेडर में पार्स किया गया मान सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | वर्तमान संग्रह में एक नया नाम-मूल्य जोड़ा जोड़ने का प्रयास करता है। |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | नाम-मूल्य जोड़ों के एक संग्रह को वर्तमान संग्रह में जोड़ता है। |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | निर्दिष्ट नाम द्वारा संबंधित मान प्राप्त करने का प्रयास करता है। |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | निर्दिष्ट मान को पार्स करने और उसे हेडर मानों में जोड़ने का प्रयास करता है। |
## संबंधित देखें

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
