---
title: "System::ExceptionWrapper क्लास"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page C++ के लिए"
description: "System::ExceptionWrapper क्लास। यह टेम्पलेट C++ में Exception क्लास से व्युत्पन्न अपवादों के रैपर को दर्शाता है।"
type: docs
weight: 2600
url: /hi/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


टेम्प्लेट जो उन अपवादों के रैपर का प्रतिनिधित्व करता है जो [Exception](../exception/) क्लास से व्युत्पन्न होते हैं।

```cpp
template<typename T>class ExceptionWrapper
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | एक null-इंस्टेंस बनाता है [ExceptionWrapper](./) क्लास का जो किसी भी अपवाद का प्रतिनिधित्व नहीं करता। |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | एक इंस्टेंस बनाता है [ExceptionWrapper](./) क्लास का जो पास किए गए पॉइंटर को शामिल करता है। |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | कॉपी कंस्ट्रक्टर। |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | मूव कंस्ट्रक्टर। |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | कंस्ट्रक्टर जो पैरामीटर को [Exception](../exception/) क्लास के कंस्ट्रक्टर्स तक फॉरवर्ड करता है और एक स्मार्ट पॉइंटर बनाता है जो नई [Exception](../exception/) क्लास की इंस्टेंस को रखता है। |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | इम्प्लिसिट कास्ट ऑपरेटर [SharedPtr<Object>](../sharedptr/) के लिए |
| [operator->](./operator-_/)() const | आपको [Exception](../exception/) ऑब्जेक्ट के सदस्यों तक पहुँचने की अनुमति देता है। |
| [operator=](./operator=/)(const ExceptionWrapper\&) | असाइनमेंट ऑपरेटर। |
| [operator=](./operator=/)(ExceptionWrapper\&&) | मूव असाइनमेंट ऑपरेटर। |
| static [Type](./type/)() | [System::TypeInfo](../typeinfo/) ऑब्जेक्ट को प्राप्त करने का शॉर्टकट [Exception](../exception/) प्रकार के लिए। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ExceptionType](./exceptiontype/) | कास्टिंग फ़ंक्शनों के लिए उपयोग किया जाता है। |
## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
