---
title: "طريقة System::IO::WrapSTDIOStream"
linktitle: "WrapSTDIOStream"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::WrapSTDIOStream. دالة غلاف لتدفقات تشبه std::basic_iostream في C++."
type: docs
weight: 5400
url: /ar/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


دالة غلاف لتدفقات تشبه std::basic_iostream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | std::basic_iostream\<char_type, traits_type\>\& | تدفق يشبه std::basic_iostream |
| mode | STDIOStreamWrappingMode | وضع التغليف |
| pref_pos | STDIOStreamPositionPreference | الموضع الذي سيُفضَّل كموقع قراءة وكتابة إذا كانا مختلفين |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## انظر أيضًا

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


دالة غلاف للتيارات الشبيهة بـ std::basic_istream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | std::basic_istream\<char_type, traits_type\>\& | تيار شبيه بـ std::basic_istream |
| mode | STDIOStreamWrappingMode | وضع التغليف |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## انظر أيضًا

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


دالة غلاف للتيارات الشبيهة بـ std::basic_ostream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | std::basic_ostream\<char_type, traits_type\>\& | تيار شبيه بـ std::basic_ostream |
| mode | STDIOStreamWrappingMode | وضع التغليف |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## انظر أيضًا

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
