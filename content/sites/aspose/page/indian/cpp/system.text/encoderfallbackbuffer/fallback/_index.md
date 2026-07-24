---
title: "System::Text::EncoderFallbackBuffer::Fallback मेथड"
linktitle: "Fallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::EncoderFallbackBuffer::Fallback मेथड। C++ में वास्तविक फॉलबैक प्रक्रिया को लागू करता है।"
type: docs
weight: 100
url: /hi/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


वास्तविक फॉलबैक प्रक्रिया को लागू करता है।

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| charUnknown | char_t | अक्षर एन्कोडर एन्कोड करने में विफल रहता है। |
| सूचकांक | int | त्रुटि उत्पन्न करने वाले अक्षर का सूचकांक। |

### ReturnValue

यदि बफ़र अज्ञात अक्षरों को संसाधित करता है तो सत्य, यदि वह उन्हें अनदेखा करता है तो असत्य।

## संबंधित देखें

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


वास्तविक फॉलबैक प्रक्रिया को लागू करता है।

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| charUnknownHigh | char_t | त्रुटि उत्पन्न करने वाले सरोगेट जोड़ी का उच्च भाग। |
| charUnknownLow | char_t | त्रुटि उत्पन्न करने वाले सरोगेट जोड़ी का निम्न भाग। |
| सूचकांक | int | त्रुटि उत्पन्न करने वाले अक्षर का सूचकांक। |

### ReturnValue

यदि बफ़र अज्ञात अक्षरों को संसाधित करता है तो सत्य, यदि वह उन्हें अनदेखा करता है तो असत्य।

## संबंधित देखें

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
