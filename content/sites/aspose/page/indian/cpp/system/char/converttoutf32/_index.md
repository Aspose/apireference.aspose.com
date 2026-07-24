---
title: "System::Char::ConvertToUtf32 method"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Page C++ के लिए"
description: "System::Char::ConvertToUtf32 method. निर्दिष्ट UTF-16 सरोगेट जोड़ी को C++ में UTF-32 कोड यूनिट में परिवर्तित करता है।"
type: docs
weight: 200
url: /hi/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


निर्दिष्ट UTF-16 सरोगेट पेयर को UTF-32 कोड यूनिट में परिवर्तित करता है।

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| highSurrogate | char_t | परिवर्तित करने के लिए UTF-16 सरोगेट जोड़ी का उच्च सरोगेट |
| lowSurrogate | char_t | परिवर्तित करने के लिए UTF-16 सरोगेट जोड़ी का निम्न सरोगेट |

### ReturnValue

परिवर्तन से प्राप्त एक UTF-32 कोड यूनिट

## संबंधित देखें

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


एक स्ट्रिंग में निर्दिष्ट स्थिति पर UTF-16 एन्कोडेड कैरेक्टर या सरोगेट पेयर का मान UTF-32 कोड यूनिट में परिवर्तित करता है।

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | एक स्ट्रिंग जिसमें एक अक्षर या सरोगेट जोड़ी शामिल है |
| सूचकांक | int | निर्दिष्ट स्ट्रिंग में अक्षर या सरोगेट जोड़ी की इंडेक्स स्थिति |

### ReturnValue

परिवर्तन से प्राप्त एक UTF-32 कोड यूनिट

## संबंधित देखें

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
