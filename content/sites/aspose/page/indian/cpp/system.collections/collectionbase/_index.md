---
title: "System::Collections::CollectionBase क्लास"
linktitle: "CollectionBase"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::CollectionBase क्लास। C++ में एक सशक्त टाइप्ड संग्रह के लिए एक सारभूत बेस क्लास प्रदान करता है।"
type: docs
weight: 300
url: /hi/cpp/system.collections/collectionbase/
---
## CollectionBase class


एक सशक्त टाइप्ड संग्रह के लिए एक एब्स्ट्रैक्ट बेस क्लास प्रदान करता है।

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | संग्रह के तत्वों का प्रकार |
## Nested classes

* Class [ListImpl](./listimpl/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clear](./clear/)() | संग्रह इंस्टेंस से सभी ऑब्जेक्ट हटाता है। यह मेथड ओवरराइड नहीं किया जा सकता। |
| [get_Capacity](./get_capacity/)() | संग्रह में सम्मिलित किए जा सकने वाले तत्वों की संख्या लौटाता है। |
| [get_Count](./get_count/)() | संग्रह इंस्टेंस में मौजूद तत्वों की संख्या लौटाता है। यह मेथड ओवरराइड नहीं किया जा सकता। |
| [GetEnumerator](./getenumerator/)() override | संग्रह इंस्टेंस के माध्यम से इटररेट करने वाला एनेमरेटर लौटाता है। |
| [RemoveAt](./removeat/)(int32_t) | संग्रह इंस्टेंस के निर्दिष्ट इंडेक्स पर तत्व हटाता है। यह मेथड ओवरराइड नहीं किया जा सकता। |
| [set_Capacity](./set_capacity/)(int32_t) | संग्रह में सम्मिलित किए जा सकने वाले तत्वों की संख्या सेट करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  n'th टेम्पलेट आर्ग्युमेंट को एक weak पॉइंटर सेट करें (shared के बजाय)। कंटेनरों में पॉइंटर्स को weak मोड में स्विच करने की अनुमति देता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |

## संबंधित देखें

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
