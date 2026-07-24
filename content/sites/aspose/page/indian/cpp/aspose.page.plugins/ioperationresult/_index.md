---
title: "Aspose::Page::Plugins::IOperationResult क्लास"
linktitle: "IOperationResult"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::Plugins::IOperationResult क्लास। सामान्य ऑपरेशन परिणाम इंटरफ़ेस जो सामान्य मेथड्स को परिभाषित करता है जिन्हें ठोस प्लगइन ऑपरेशन परिणाम को C++ में लागू करना चाहिए।"
type: docs
weight: 700
url: /hi/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


सामान्य ऑपरेशन परिणाम इंटरफ़ेस जो सामान्य मेथड्स को परिभाषित करता है जिन्हें ठोस प्लगइन ऑपरेशन परिणाम को लागू करना चाहिए।

```cpp
class IOperationResult : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_Data](./get_data/)() | कच्चा डेटा प्राप्त करता है। |
| virtual [get_IsByteArray](./get_isbytearray/)() | यह दर्शाता है कि परिणाम बाइट एरे है या नहीं। |
| virtual [get_IsFile](./get_isfile/)() | यह दर्शाता है कि परिणाम आउटपुट फ़ाइल का पथ है या नहीं। |
| virtual [get_IsStream](./get_isstream/)() | यह दर्शाता है कि परिणाम आउटपुट स्ट्रीम है या नहीं। |
| virtual [get_IsString](./get_isstring/)() | यह दर्शाता है कि परिणाम टेक्स्ट स्ट्रिंग है या नहीं। |
| virtual [ToFile](./tofile/)() | परिणाम को फ़ाइल में परिवर्तित करने का प्रयास करता है। |
| virtual [ToStream](./tostream/)() | परिणाम को स्ट्रीम ऑब्जेक्ट में बदलने का प्रयास करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
