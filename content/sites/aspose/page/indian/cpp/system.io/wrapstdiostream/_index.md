---
title: "System::IO::WrapSTDIOStream मेथड"
linktitle: "WrapSTDIOStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::WrapSTDIOStream मेथड। C++ में std::basic_iostream-समरूप स्ट्रीम्स के लिए रैपर फ़ंक्शन।"
type: docs
weight: 5400
url: /hi/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


std::basic_iostream जैसी स्ट्रीम्स के लिए रैपर फ़ंक्शन।

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | std::basic_iostream\<char_type, traits_type\>\& | std::basic_iostream जैसी स्ट्रीम |
| mode | STDIOStreamWrappingMode | रैपिंग मोड |
| pref_pos | STDIOStreamPositionPreference | स्थिति जो पढ़ने और लिखने की स्थिति के रूप में प्राथमिकता देगा, यदि वे अलग हों। |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## संबंधित देखें

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


std::basic_istream जैसी स्ट्रीम्स के लिए रैपर फ़ंक्शन।

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | std::basic_istream\<char_type, traits_type\>\& | std::basic_istream जैसी स्ट्रीम |
| mode | STDIOStreamWrappingMode | रैपिंग मोड |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## संबंधित देखें

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


std::basic_ostream जैसी स्ट्रीम्स के लिए रैपर फ़ंक्शन।

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | std::basic_ostream\<char_type, traits_type\>\& | std::basic_ostream जैसी स्ट्रीम |
| mode | STDIOStreamWrappingMode | रैपिंग मोड |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## संबंधित देखें

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
