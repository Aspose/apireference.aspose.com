---
title: "System::IO::WrapSTDIOStream metodo"
linktitle: "WrapSTDIOStream"
second_title: "Aspose.Font per C++"
description: "System::IO::WrapSTDIOStream metodo. Funzione wrapper per stream simili a std::basic_iostream in C++."
type: docs
weight: 5400
url: /it/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


Funzione wrapper per stream simili a std::basic_iostream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | std::basic_iostream\<char_type, traits_type\>\& | stream simile a std::basic_iostream |
| mode | STDIOStreamWrappingMode | Modalità di wrapping |
| pref_pos | STDIOStreamPositionPreference | Posizione che verrà preferita come posizione di lettura e scrittura, se sono diverse |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## Vedi anche

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


Funzione wrapper per flussi simili a std::basic_istream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | std::basic_istream\<char_type, traits_type\>\& | Flusso simile a std::basic_istream |
| mode | STDIOStreamWrappingMode | Modalità di wrapping |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## Vedi anche

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


Funzione wrapper per flussi simili a std::basic_ostream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | std::basic_ostream\<char_type, traits_type\>\& | Flusso simile a std::basic_ostream |
| mode | STDIOStreamWrappingMode | Modalità di wrapping |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## Vedi anche

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
