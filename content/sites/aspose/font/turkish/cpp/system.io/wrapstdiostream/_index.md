---
title: "System::IO::WrapSTDIOStream yöntemi"
linktitle: "WrapSTDIOStream"
second_title: "Aspose.Font için C++"
description: "System::IO::WrapSTDIOStream yöntemi. C++'ta std::basic_iostream benzeri akışlar için sarmalayıcı işlev."
type: docs
weight: 5400
url: /tr/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


std::basic_iostream benzeri akışlar için sarmalayıcı işlev.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | std::basic_iostream\<char_type, traits_type\>\& | std::basic_iostream benzeri akış |
| mod | STDIOStreamWrappingMode | Sarma modu |
| pref_pos | STDIOStreamPositionPreference | Okuma ve yazma konumu farklıysa, tercih edilecek konum |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## Ayrıca Bakınız

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


std::basic_istream benzeri akışlar için sarmalayıcı işlev.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | std::basic_istream\<char_type, traits_type\>\& | std::basic_istream benzeri akış |
| mod | STDIOStreamWrappingMode | Sarma modu |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## Ayrıca Bakınız

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


std::basic_ostream benzeri akışlar için sarmalayıcı işlev.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | std::basic_ostream\<char_type, traits_type\>\& | std::basic_ostream benzeri akış |
| mod | STDIOStreamWrappingMode | Sarma modu |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## Ayrıca Bakınız

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
