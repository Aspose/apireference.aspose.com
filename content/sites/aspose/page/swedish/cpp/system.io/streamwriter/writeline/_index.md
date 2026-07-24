---
title: "System::IO::StreamWriter::WriteLine method"
linktitle: "WriteLine"
second_title: "Aspose.Page för C++"
description: "System::IO::StreamWriter::WriteLine method. Skriver radavslutningstecken till strömmen i C++."
type: docs
weight: 1100
url: /sv/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


Skriver radavslutningstecken till strömmen.

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## Se även

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


Skriver alla tecken från den angivna arrayen följt av radavslutningstecknen till strömmen.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<char_t\>\& | Arrayen som innehåller tecknen att skriva |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Skriver det angivna delintervallet av UTF‑16‑tecken från den angivna teckenarrayen följt av radavslutningstecknen till strömmen.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<char_t\>\& | Arrayen som innehåller tecknen att skriva |
| index | int32_t | Ett 0-baserat index för elementet i **buffer** där delintervallet att skriva börjar |
| count | int32_t | Antalet tecken i delintervallet att skriva; -1 anger att delintervallet slutar där **buffer**-arrayen slutar |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const char_t *) method


Skriver den angivna C‑strängen följt av radavslutningstecknen till strömmen.

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const char_t * | C-strängen att skriva |

## Se även

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


Skriver strängrepresentationen av det angivna objektet följt av radavslutningstecknen till strömmen.

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | Objektet att skriva |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const String\&) method


Skriver den angivna strängen följt av radavslutningstecknen till strömmen.

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const String\& | Strängen att skriva |

## Se även

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


Skriver strängrepresentationen av det angivna objektet följt av radavslutningstecknen till strömmen.

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av objektet |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | Objektet att skriva |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
