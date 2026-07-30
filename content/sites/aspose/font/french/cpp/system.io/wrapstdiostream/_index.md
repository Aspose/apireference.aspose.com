---
title: "Méthode System::IO::WrapSTDIOStream"
linktitle: "WrapSTDIOStream"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::WrapSTDIOStream. Fonction d'enveloppe pour les flux de type std::basic_iostream en C++."
type: docs
weight: 5400
url: /fr/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


Fonction d'enveloppe pour les flux de type std::basic_iostream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | std::basic_iostream\<char_type, traits_type\>\& | Flux de type std::basic_iostream |
| mode | STDIOStreamWrappingMode | Mode d'enveloppement |
| pref_pos | STDIOStreamPositionPreference | Position qui sera préférée comme position de lecture et d'écriture, si elles sont différentes. |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## Voir aussi

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


Fonction d'enveloppe pour les flux de type std::basic_istream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | std::basic_istream\<char_type, traits_type\>\& | Flux de type std::basic_istream |
| mode | STDIOStreamWrappingMode | Mode d'enveloppement |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## Voir aussi

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


Fonction d'enveloppe pour les flux de type std::basic_ostream.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | std::basic_ostream\<char_type, traits_type\>\& | Flux de type std::basic_ostream |
| mode | STDIOStreamWrappingMode | Mode d'enveloppement |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## Voir aussi

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
