---
title: "System::Runtime::Serialization नामस्थान"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Runtime::Serialization नामस्थान का उपयोग कैसे करें।"
type: docs
weight: 5300
url: /hi/cpp/system.runtime.serialization/
---



## क्लासेस

| क्लास | विवरण |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/) इंटरफ़ेस का बेस कार्यान्वयन दर्शाता है। |
| [IFormatterConverter](./iformatterconverter/) | एक [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) उदाहरण और फ़ॉर्मैटर द्वारा प्रदान की गई क्लास के बीच कनेक्शन प्रदान करता है, जो [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) के भीतर डेटा को पार्स करने के लिए सबसे उपयुक्त है। |
| [ISerializable](./iserializable/) | सीरियलाइज़ किए जा सकने वाले ऑब्जेक्ट का इंटरफ़ेस। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या एसेर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में तर्क के रूप में पास करने के लिए करें। |
| [SerializationInfo](./serializationinfo/) | सीरियलाइज़्ड ऑब्जेक्ट का प्रतिनिधित्व करने वाले नामित फ़ील्ड्स का सेट रखता है। लागू नहीं किया गया है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या एसेर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में तर्क के रूप में पास करने के लिए करें। |
| [StreamingContext](./streamingcontext/) | StreamingContext-उपयोग करने वाली अनुवादित कक्षाओं को संकलित करने के लिए डमी क्लास। इस वर्ग के उदाहरणों को [SmartPtr](../system/smartptr/) द्वारा प्रबंधित न करें, इन्हें केवल स्टैक पर ही आवंटित किया जाना चाहिए। |
