---
title: "System::String::ToByteArray मेथड"
linktitle: "ToByteArray"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::ToByteArray मेथड। C++ में स्ट्रिंग या सबस्ट्रिंग को बाइट्स की एरे में बदलता है।"
type: docs
weight: 4700
url: /hi/cpp/system/string/tobytearray/
---
## String::ToByteArray method


स्ट्रिंग या सबस्ट्रिंग को बाइट्स की एरे में परिवर्तित करता है।

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startIndex | int32_t | उपस्ट्रिंग का प्रारंभिक सूचकांक। |
| length | int32_t | उपस्ट्रिंग की लंबाई। |
| LE | bool | यदि true है, तो लिटिल एंडियन का उपयोग करके कैरेक्टर्स को एन्कोड करें; अन्यथा, बिग एंडियन का उपयोग करें। |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
