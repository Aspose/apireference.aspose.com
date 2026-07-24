---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback विधि"
linktitle: "Fallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback विधि. C++ में एन्कोडिंग विफलता को संभालता है।"
type: docs
weight: 200
url: /hi/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


एन्कोडिंग विफलता को संभालता है।

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| charUnknown | char_t | अज्ञात अक्षर; अनदेखा किया गया। |
| सूचकांक | int | अज्ञात अक्षर स्थिति; अनदेखा किया गया। |

### ReturnValue

सही यदि प्रतिस्थापन स्ट्रिंग प्रदान की गई है और खाली नहीं है, अन्यथा गलत।

## संबंधित देखें

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


एन्कोडिंग विफलता को संभालता है।

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| charUnknownHigh | char_t | त्रुटि उत्पन्न करने वाले सरोगेट जोड़ी का उच्च भाग। |
| charUnknownLow | char_t | त्रुटि उत्पन्न करने वाले सरोगेट जोड़ी का निम्न भाग। |
| सूचकांक | int | अज्ञात अक्षर स्थिति; अनदेखा किया गया। |

### ReturnValue

सही यदि प्रतिस्थापन स्ट्रिंग प्रदान की गई है और खाली नहीं है, अन्यथा गलत।

## संबंधित देखें

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
