---
title: "System::IO::StreamWriter::Write metod"
linktitle: "Write"
second_title: "Aspose.Page för C++"
description: "System::IO::StreamWriter::Write metod. Skriver det angivna tecknet till strömmen i C++."
type: docs
weight: 1000
url: /sv/cpp/system.io/streamwriter/write/
---
## StreamWriter::Write(char_t) method


Skriver det angivna tecknet till strömmen.

```cpp
void System::IO::StreamWriter::Write(char_t value) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | char_t | Tecknet att skriva |

## Se även

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&) method


Skriver alla tecken från den angivna arrayen till strömmen.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<char_t\>\& | Arrayen som innehåller tecknen att skriva |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Skriver det angivna delintervallet av UTF-16-tecken från den angivna teckenarrayen till strömmen.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
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
## StreamWriter::Write(const char_t *) method


Skriver den angivna c-strängen till strömmen.

```cpp
void System::IO::StreamWriter::Write(const char_t *buffer) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const char_t * | C-strängen att skriva |

## Se även

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const SharedPtr\<Object\>\&) method


Skriver strängrepresentationen av det angivna objektet till strömmen.

```cpp
void System::IO::StreamWriter::Write(const SharedPtr<Object> &obj) override
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
## StreamWriter::Write(const String\&) method


Skriver den angivna strängen till strömmen.

```cpp
void System::IO::StreamWriter::Write(const String &value) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const String\& | Strängen att skriva |

## Se även

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const System::SharedPtr\<T\>\&) method


Skriver strängrepresentationen av det angivna objektet till strömmen.

```cpp
template<typename T> void System::IO::StreamWriter::Write(const System::SharedPtr<T> &obj)
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
