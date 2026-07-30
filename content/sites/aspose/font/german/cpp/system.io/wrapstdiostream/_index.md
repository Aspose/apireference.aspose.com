---
title: "System::IO::WrapSTDIOStream Methode"
linktitle: "WrapSTDIOStream"
second_title: "Aspose.Font für C++"
description: "System::IO::WrapSTDIOStream Methode. Wrapper‑Funktion für std::basic_iostream‑ähnliche Streams in C++."
type: docs
weight: 5400
url: /de/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


Wrapper‑Funktion für std::basic_iostream‑ähnliche Streams.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | std::basic_iostream\<char_type, traits_type\>\& | std::basic_iostream‑ähnlicher Stream |
| mode | STDIOStreamWrappingMode | Wrap‑Modus |
| pref_pos | STDIOStreamPositionPreference | Position, die als Lese- und Schreibposition bevorzugt wird, wenn sie unterschiedlich sind |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## Siehe auch

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


Wrapper-Funktion für std::basic_istream-ähnliche Streams.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | std::basic_istream\<char_type, traits_type\>\& | std::basic_istream-ähnlicher Stream |
| mode | STDIOStreamWrappingMode | Wrap‑Modus |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## Siehe auch

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


Wrapper-Funktion für std::basic_ostream-ähnliche Streams.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | std::basic_ostream\<char_type, traits_type\>\& | std::basic_ostream-ähnlicher Stream |
| mode | STDIOStreamWrappingMode | Wrap‑Modus |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## Siehe auch

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
