---
title: "Μέθοδος System::IO::WrapSTDIOStream"
linktitle: "WrapSTDIOStream"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::IO::WrapSTDIOStream. Συνάρτηση περιτύλιξης για ροές τύπου std::basic_iostream σε C++."
type: docs
weight: 5400
url: /el/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


Συνάρτηση περιτύλιξης για ροές τύπου std::basic_iostream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | std::basic_iostream\<char_type, traits_type\>\& | Ροή τύπου std::basic_iostream |
| mode | STDIOStreamWrappingMode | Λειτουργία περιτύλιξης |
| pref_pos | STDIOStreamPositionPreference | Θέση που θα προτιμάται ως θέση ανάγνωσης και εγγραφής, εάν είναι διαφορετικές. |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## Δείτε επίσης

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


Συνάρτηση περιτύλιξης για ροές τύπου std::basic_istream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | std::basic_istream\<char_type, traits_type\>\& | Ροή τύπου std::basic_istream |
| mode | STDIOStreamWrappingMode | Λειτουργία περιτύλιξης |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## Δείτε επίσης

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


Συνάρτηση περιτύλιξης για ροές τύπου std::basic_ostream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | std::basic_ostream\<char_type, traits_type\>\& | Ροή τύπου std::basic_ostream |
| mode | STDIOStreamWrappingMode | Λειτουργία περιτύλιξης |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## Δείτε επίσης

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
