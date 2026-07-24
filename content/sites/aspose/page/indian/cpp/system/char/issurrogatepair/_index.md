---
title: "System::Char::IsSurrogatePair मेथड"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page C++ के लिए"
description: "System::Char::IsSurrogatePair मेथड। निर्धारित करता है कि C++ में दो निर्दिष्ट अक्षर UTF-16 सरोगेट पेयर के लिए हैं या नहीं।"
type: docs
weight: 1700
url: /hi/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


निर्धारित करता है कि UTF-16 सरोगेट जोड़ी के लिए दो निर्दिष्ट कैरेक्टर हैं या नहीं।

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| highSurrogate | char_t | एक अक्षर जिसे हाई सरोगेट होने के लिए परीक्षण किया जाता है |
| lowSurrogate | char_t | एक अक्षर जिसे लो सरोगेट होने के लिए परीक्षण किया जाता है |

### ReturnValue

यदि निर्दिष्ट अक्षर सरोगेट पेयर बनाते हैं तो true, अन्यथा - false

## संबंधित देखें

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


निर्धारित करता है कि निर्दिष्ट कैरेक्टर बफ़र में दो क्रमागत कैरेक्टर सरोगेट जोड़ी हैं या नहीं।

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | एक स्ट्रिंग |
| सूचकांक | int | निर्दिष्ट बफ़र में शून्य-आधारित इंडेक्स जहाँ परीक्षण के लिए अक्षर अनुक्रम शुरू होता है |

### ReturnValue

True यदि निर्दिष्ट अक्षर सरोगेट जोड़ी हैं, अन्यथा - false

## संबंधित देखें

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
