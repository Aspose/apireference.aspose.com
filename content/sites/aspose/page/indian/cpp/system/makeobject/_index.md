---
title: "System::MakeObject मेथड"
linktitle: "MakeObject"
second_title: "Aspose.Page C++ के लिए"
description: "System::MakeObject मेथड। C++ में हीप पर ऑब्जेक्ट बनाता है और उसका साझा पॉइंटर लौटाता है।"
type: docs
weight: 24500
url: /hi/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


हीप पर ऑब्जेक्ट बनाता है और उसका साझा पॉइंटर लौटाता है।

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | इंस्टैंशिएट करने के लिए क्लास। |
| आर्ग्युमेंट्स | कंस्ट्रक्टर आर्ग्यूमेंट्स के प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| args | Args\&&... | कंस्ट्रक्टर आर्ग्यूमेंट्स। |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


हीप पर ऑब्जेक्ट बनाता है और उसका साझा पॉइंटर लौटाता है।

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [SmartPtr](../smartptr/) को इंस्टैंशिएट करने के लिए क्लास। |
| आर्ग्युमेंट्स | कंस्ट्रक्टर आर्ग्यूमेंट्स के प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| args | Args\&&... | कंस्ट्रक्टर आर्ग्यूमेंट्स। |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
