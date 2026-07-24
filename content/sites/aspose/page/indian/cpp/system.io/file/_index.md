---
title: "System::IO::File class"
linktitle: "File"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::File class. फ़ाइलों को संभालने के लिए विधियाँ प्रदान करता है। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको C++ में किसी भी तरीके से इसके इंस्टेंस कभी नहीं बनाना चाहिए।"
type: docs
weight: 1300
url: /hi/cpp/system.io/file/
---
## File class


फ़ाइलों को संशोधित करने के लिए मेथड्स प्रदान करता है। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको इसे किसी भी तरह से इंस्टेंस नहीं बनाना चाहिए।

```cpp
class File
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | निर्दिष्ट एन्कोडिंग का उपयोग करके निर्दिष्ट स्ट्रिंग संग्रह से स्ट्रिंग्स को नई पंक्ति में लिखते हुए निर्दिष्ट फ़ाइल में जोड़ता है। यदि निर्दिष्ट फ़ाइल मौजूद नहीं है, तो इसे बनाया जाता है। सभी स्ट्रिंग्स लिखने के बाद फ़ाइल बंद कर दी जाती है। |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | निर्दिष्ट एन्कोडिंग का उपयोग करके निर्दिष्ट स्ट्रिंग को निर्दिष्ट फ़ाइल में जोड़ता है। |
| static [AppendText](./appendtext/)(const String\&) | एक [StreamWriter](../streamwriter/) ऑब्जेक्ट बनाता है जो UTF-8 एन्कोडिंग का उपयोग करके निर्दिष्ट फ़ाइल में टेक्स्ट जोड़ता है। यदि निर्दिष्ट फ़ाइल मौजूद नहीं है, तो इसे बनाया जाता है। |
| static [Copy](./copy/)(const String\&, const String\&, bool) | निर्दिष्ट फ़ाइल को निर्दिष्ट स्थान पर कॉपी करता है। यदि गंतव्य फ़ाइल पहले से मौजूद है, तो एक पैरामीटर यह निर्धारित करता है कि इसे अधिलेखित किया जाए या नहीं। |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | निर्दिष्ट बफ़र आकार और विकल्पों का उपयोग करके एक नई फ़ाइल (या मौजूदा को अधिलेखित) बनाता है और उसे पढ़ने व लिखने के लिए खोलता है। |
| static [CreateText](./createtext/)(const String\&) | UTF-8 एन्कोडेड टेक्स्ट लिखने के लिए नई फ़ाइल बनाता है या मौजूदा फ़ाइल खोलता है। |
| static [Decrypt](./decrypt/)(const String\&) | लागू नहीं किया गया। |
| static [Delete](./delete/)(const String\&) | निर्दिष्ट फ़ाइल या निर्देशिका को हटाता है। |
| static [Encrypt](./encrypt/)(const String\&) | लागू नहीं किया गया। |
| static [Exists](./exists/)(const String\&) | निर्धारित करता है कि निर्दिष्ट पथ किसी मौजूदा फ़ाइल को संदर्भित करता है या नहीं। |
| static [GetAttributes](./getattributes/)(const String\&) | निर्दिष्ट इकाई के गुण लौटाता है। |
| static [GetCreationTime](./getcreationtime/)(const String\&) | निर्दिष्ट इकाई का निर्माण समय स्थानीय समय के रूप में लौटाता है। |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | निर्दिष्ट इकाई का निर्माण समय UTC समय के रूप में लौटाता है। |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | निर्दिष्ट इकाई का अंतिम पहुँच समय स्थानीय समय के रूप में लौटाता है। |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | निर्दिष्ट इकाई का अंतिम पहुँच समय UTC समय के रूप में लौटाता है। |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | निर्दिष्ट इकाई का अंतिम लेखन समय स्थानीय समय के रूप में लौटाता है। |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | निर्दिष्ट इकाई का अंतिम लेखन समय UTC समय के रूप में लौटाता है। |
| static [Move](./move/)(const String\&, const String\&) | निर्दिष्ट फ़ाइल को नई स्थान पर ले जाता है। |
| static [Open](./open/)(const String\&, FileMode) | निर्दिष्ट फ़ाइल को निर्दिष्ट मोड में पढ़ने और लिखने के लिए खोलता है और बिना साझा किए। |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | निर्दिष्ट फ़ाइल को निर्दिष्ट मोड में, निर्दिष्ट पहुँच प्रकार और साझा विकल्प के साथ खोलता है। |
| static [OpenRead](./openread/)(const String\&) | केवल पढ़ने के लिए, 'Open' मोड में, पढ़ने के लिए साझा पहुँच के साथ, निर्दिष्ट फ़ाइल खोलता है। |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | UTF-8 एन्कोडिंग का उपयोग करके पाठ पढ़ने के लिए, बिना साझा किए, निर्दिष्ट मौजूदा फ़ाइल खोलता है। |
| static [OpenWrite](./openwrite/)(const String\&) | केवल लिखने के लिए, 'OpenOrCreate' मोड में, बिना साझा किए, निर्दिष्ट फ़ाइल खोलता है। |
| static [ReadAllBytes](./readallbytes/)(const String\&) | निर्दिष्ट बाइनरी फ़ाइल की सामग्री को बाइट ऐरे में पढ़ता है। |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | निर्दिष्ट अक्षर एन्कोडिंग का उपयोग करके, निर्दिष्ट पाठ फ़ाइल की सामग्री को पंक्ति दर पंक्ति स्ट्रिंग्स की ऐरे में पढ़ता है। |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | निर्दिष्ट अक्षर एन्कोडिंग का उपयोग करके, निर्दिष्ट पाठ फ़ाइल की सामग्री को एकल [String](../../system/string/) वस्तु में पढ़ता है। |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | निर्दिष्ट अक्षर एन्कोडिंग का उपयोग करके, निर्दिष्ट पाठ फ़ाइल की सामग्री को पंक्ति दर पंक्ति पढ़ता है और स्ट्रिंग्स का एक enumerable संग्रह लौटाता है, जिसमें प्रत्येक फ़ाइल की सामग्री की एकल पंक्ति का प्रतिनिधित्व करता है। |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | एक फ़ाइल की सामग्री को दूसरी से बदलता है और बदली गई फ़ाइल का बैकअप बनाता है। |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | निर्दिष्ट फ़ाइल पर निर्दिष्ट गुण सेट करता है। |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | लागू नहीं किया गया। |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | लागू नहीं किया गया। |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | लागू नहीं किया गया। |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | लागू नहीं किया गया। |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | निर्दिष्ट इकाई का अंतिम लेखन समय स्थानीय समय के रूप में सेट करता है। |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | निर्दिष्ट इकाई का अंतिम लेखन समय UTC समय के रूप में सेट करता है। |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | निर्दिष्ट बाइनरी फ़ाइल को ओवरराइट करता है और निर्दिष्ट बाइट्स उसमें लिखता है। |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | निर्दिष्ट एन्कोडिंग का उपयोग करके, एक नया पाठ फ़ाइल बनाता है या मौजूदा को ओवरराइट करता है और निर्दिष्ट enumerable स्ट्रिंग्स संग्रह से सभी स्ट्रिंग्स को नई पंक्तियों में लिखता है। |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | निर्दिष्ट एन्कोडिंग का उपयोग करके, एक नया पाठ फ़ाइल बनाता है या मौजूदा को ओवरराइट करता है और निर्दिष्ट स्ट्रिंग्स की ऐरे से सभी स्ट्रिंग्स को नई पंक्तियों में लिखता है। |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | निर्दिष्ट एन्कोडिंग का उपयोग करके, एक नया पाठ फ़ाइल बनाता है या मौजूदा को ओवरराइट करता है और निर्दिष्ट स्ट्रिंग की सामग्री को उसमें लिखता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | फ़ाइल से पढ़ते और लिखते समय बफ़र किए जाने वाले बाइट्स की संख्या का डिफ़ॉल्ट मान। |
## संबंधित देखें

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
