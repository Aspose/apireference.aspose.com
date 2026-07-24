---
title: "System::Collections::Generic::IEnumerable क्लास"
linktitle: "IEnumerable"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::IEnumerable क्लास। C++ में समाहित तत्वों पर एन्यूमरेटर प्रदान करने वाले ऑब्जेक्ट का इंटरफ़ेस।"
type: docs
weight: 2200
url: /hi/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


समाहित तत्वों पर एनेमरेटर प्रदान करने वाले ऑब्जेक्ट का इंटरफ़ेस।

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [begin](./begin/)() | संग्रह के पहले तत्व (यदि कोई हो) की ओर इशारा करने वाला इटररेटर प्राप्त करता है। यह इटररेटर संदर्भित ऑब्जेक्ट को बदलने के लिए उपयोग नहीं किया जा सकता क्योंकि [GetEnumerator()](./getenumerator/) T की एक कॉपी-ऑब्जेक्ट लौटाता है। |
| [begin](./begin/)() const | संग्रह के const-योग्य इंस्टेंस के पहले तत्व (यदि कोई हो) की ओर इशारा करने वाला इटरेटर प्राप्त करता है। |
| [cbegin](./cbegin/)() const | संग्रह के पहले const-योग्य तत्व (यदि कोई हो) की ओर इशारा करने वाला इटरेटर प्राप्त करता है। |
| [cend](./cend/)() const | संग्रह के अंतिम const-योग्य तत्व (यदि कोई हो) के तुरंत बाद की ओर इशारा करने वाला इटरेटर प्राप्त करता है। |
| [end](./end/)() | संग्रह के अंतिम तत्व (यदि कोई हो) के ठीक बाद की ओर इशारा करने वाला इटररेटर प्राप्त करता है। यह इटररेटर संदर्भित ऑब्जेक्ट को बदलने के लिए उपयोग नहीं किया जा सकता क्योंकि [GetEnumerator()](./getenumerator/) T की एक कॉपी-ऑब्जेक्ट लौटाता है। |
| [end](./end/)() const | संग्रह की const-योग्य इंस्टेंस के अंतिम तत्व (यदि कोई हो) के ठीक बाद इटररेटर प्राप्त करता है। |
| virtual [GetEnumerator](./getenumerator/)() | एन्यूमरेटर प्राप्त करता है। |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | एक अनुक्रम पर एग्रीगेटर फ़ंक्शन लागू करता है। |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | निर्धारित करता है कि क्या अनुक्रम के सभी तत्व किसी शर्त को पूरा करते हैं। |
| [LINQ_Any](./linq_any/)() | निर्धारित करता है कि क्या अनुक्रम में कोई तत्व हैं। |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | निर्धारित करता है कि क्या अनुक्रम का कोई तत्व मौजूद है या शर्त को पूरा करता है। |
| [LINQ_Cast](./linq_cast/)() | तत्वों को निर्दिष्ट प्रकार में कास्ट करता है। |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | दो अनुक्रमों को जोड़ता है। |
| [LINQ_Contains](./linq_contains/)(T) | निर्धारित करता है कि क्या अनुक्रम में निर्दिष्ट मान मौजूद है। |
| [LINQ_Count](./linq_count/)() | अनुक्रम में तत्वों की संख्या लौटाता है (सीधे गिनती द्वारा गणना किया गया)। |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | अनुक्रम में उन तत्वों की संख्या लौटाता है जो निर्दिष्ट शर्त को पूरा करते हैं। |
| [LINQ_ElementAt](./linq_elementat/)(int) | अनुक्रम में निर्दिष्ट सूचकांक पर स्थित तत्व लौटाता है। |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | अनुक्रम में निर्दिष्ट सूचकांक पर स्थित तत्व लौटाता है। |
| [LINQ_First](./linq_first/)() | अनुक्रम का पहला तत्व लौटाता है। |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | अनुक्रम का पहला तत्व लौटाता है जो निर्दिष्ट शर्त को पूरा करता है। |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | अनुक्रम का पहला तत्व लौटाता है, या यदि अनुक्रम खाली है तो डिफ़ॉल्ट मान। |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | अनुक्रम का पहला तत्व लौटाता है जो शर्त को पूरा करता है, या यदि ऐसा कोई तत्व नहीं मिला तो डिफ़ॉल्ट मान। |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | अनुक्रम के तत्वों को समूहित करता है। |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_Last](./linq_last/)() | अनुक्रम का अंतिम तत्व लौटाता है। |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | एक अनुक्रम का अंतिम तत्व लौटाता है, या यदि अनुक्रम खाली है तो डिफ़ॉल्ट मान देता है। |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | एक सामान्य अनुक्रम के प्रत्येक तत्व पर ट्रांसफ़ॉर्म फ़ंक्शन को कॉल करता है और अधिकतम परिणामी मान लौटाता है। |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | एक सामान्य अनुक्रम के प्रत्येक तत्व पर ट्रांसफ़ॉर्म फ़ंक्शन को कॉल करता है और न्यूनतम परिणामी मान लौटाता है। |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | निर्दिष्ट प्रकार के आधार पर अनुक्रम के तत्वों को फ़िल्टर करता है। |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | keySelector द्वारा चुनी गई कुंजी मानों के अनुसार अनुक्रम के तत्वों को आरोही क्रम में सॉर्ट करता है। |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | keySelector द्वारा चुनी गई कुंजी मानों के अनुसार अनुक्रम के तत्वों को अवरोही क्रम में सॉर्ट करता है। |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | एक अनुक्रम में तत्वों के क्रम को उलट देता है। |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | एक अनुक्रम के तत्वों को परिवर्तित करता है। |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | एक अनुक्रम के प्रत्येक तत्व को उसके इंडेक्स को शामिल करके नई रूप में परिवर्तित करता है। |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | एक अनुक्रम के प्रत्येक तत्व को प्रोजेक्ट करता है और परिणामी अनुक्रमों को एक ही अनुक्रम में संयोजित करता है। |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | एक अनुक्रम की शुरुआत से निर्दिष्ट संख्या में क्रमिक तत्व लौटाता है। |
| [LINQ_ToArray](./linq_toarray/)() | एक अनुक्रम से एक एरे बनाता है। |
| [LINQ_ToList](./linq_tolist/)() | एक अनुक्रम से एक [List<T>](../list/) बनाता है। |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | निर्दिष्ट प्रेडिकेट के आधार पर एक अनुक्रम को फ़िल्टर करता है। |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [const_iterator](./const_iterator/) | कॉन्स्ट इटररेटर प्रकार। |
| [IEnumeratorType](./ienumeratortype/) | RTTI जानकारी। |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | आंतरिक इटररेटर बेस प्रकार। |
| [virtualized_iterator_element](./virtualized_iterator_element/) | आंतरिक इटररेटर तत्व प्रकार। |

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
