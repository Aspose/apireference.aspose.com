---
title: "System::IConvertible::ToType method"
linktitle: "ToType"
second_title: "Aspose.Page C++ के लिए"
description: "System::IConvertible::ToType मेथड। इस इंस्टेंस के मान को निर्दिष्ट System::Type के System::Object में परिवर्तित करता है, जो समान मान रखता है, निर्दिष्ट संस्कृति-विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करते हुए C++ में।"
type: docs
weight: 1400
url: /hi/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


इस इंस्टेंस के मान को निर्दिष्ट System::Type के [System::Object](../../object/) में परिवर्तित करता है, जिसका मान समान है, निर्दिष्ट संस्कृति-विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करते हुए।

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| conversionType | const TypeInfo\& | System::Type जिससे इस इंस्टेंस का मान परिवर्तित किया जाता है। |
| provider | System::SharedPtr\<System::IFormatProvider\> | [System::IFormatProvider](../../iformatprovider/) इंटरफ़ेस कार्यान्वयन जो संस्कृति-विशिष्ट फ़ॉर्मेटिंग जानकारी प्रदान करता है। |

### ReturnValue

type conversionType का एक [System::Object](../../object/) इंस्टेंस जिसका मान इस इंस्टेंस के मान के समान है।

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
