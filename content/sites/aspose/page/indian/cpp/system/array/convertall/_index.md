---
title: "System::Array::ConvertAll मेथड"
linktitle: "ConvertAll"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::ConvertAll मेथड। निर्दिष्ट एरे के तत्वों को OutputType प्रकार में परिवर्तित करने वाले निर्दिष्ट कन्वर्टर डेलीगेट का उपयोग करके एक नया Array ऑब्जेक्ट बनाता है और उसे भरता है C++ में।"
type: docs
weight: 4800
url: /hi/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


निर्दिष्ट एरे के तत्वों को **OutputType** प्रकार में परिवर्तित करने वाले निर्दिष्ट कन्वर्टर डेलीगेट का उपयोग करके एक नया [Array](../) ऑब्जेक्ट बनाता है और उसे भरता है।

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| पैरामीटर | विवरण |
| --- | --- |
| InputType | इनपुट एरे के तत्वों का प्रकार |
| OutputType | परिणामी एरे के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | एक [Array](../) ऑब्जेक्ट |
| converter | Converter\<InputType, OutputType\> | एक [Converter](../../converter/) ऑब्जेक्ट जो इनपुट एरे के प्रत्येक तत्व को **OutputType** प्रकार के समतुल्य मानों में परिवर्तित करने के लिए उपयोग किया जाता है |

### ReturnValue

एक नया एरे जिसमें **OutputType** प्रकार के मान होते हैं जो **input_array** के मानों के समतुल्य होते हैं

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


निर्दिष्ट एरे के तत्वों को **OutputType** प्रकार में परिवर्तित करने वाले निर्दिष्ट कन्वर्टर फ़ंक्शन ऑब्जेक्ट का उपयोग करके एक नया [Array](../) ऑब्जेक्ट बनाता है और उसे भरता है।

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| पैरामीटर | विवरण |
| --- | --- |
| InputType | इनपुट एरे के तत्वों का प्रकार |
| OutputType | परिणामी एरे के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | एक [Array](../) ऑब्जेक्ट |
| कन्वर्टर | std::function\<OutputType(InputType)> | एक फ़ंक्शन ऑब्जेक्ट जिसका उपयोग इनपुट एरे के प्रत्येक तत्व को **OutputType** प्रकार के समतुल्य मानों में परिवर्तित करने के लिए किया जाता है |

### ReturnValue

एक नया एरे जिसमें **OutputType** प्रकार के मान होते हैं जो **input_array** के मानों के समतुल्य होते हैं

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
