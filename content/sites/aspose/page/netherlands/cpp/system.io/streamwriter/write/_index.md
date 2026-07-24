---
title: "System::IO::StreamWriter::Write methode"
linktitle: "Write"
second_title: "Aspose.Page voor C++"
description: "System::IO::StreamWriter::Write methode. Schrijft het opgegeven teken naar de stream in C++."
type: docs
weight: 1000
url: /nl/cpp/system.io/streamwriter/write/
---
## StreamWriter::Write(char_t) method


Schrijft het opgegeven teken naar de stream.

```cpp
void System::IO::StreamWriter::Write(char_t value) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | char_t | Het teken om te schrijven |

## Zie ook

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&) method


Schrijft alle tekens van de opgegeven array naar de stream.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | De array die de tekens bevat om te schrijven |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Schrijft het opgegeven subbereik van UTF-16-tekens van de opgegeven tekenarray naar de stream.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | De array die de tekens bevat om te schrijven |
| index | int32_t | Een 0-gebaseerde index van het element in **buffer** waarop het subbereik om te schrijven begint |
| count | int32_t | Het aantal tekens in het subbereik om te schrijven; -1 geeft aan dat het subbereik eindigt waar de **buffer**‑array eindigt |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const char_t *) method


Schrijft de opgegeven c-string naar de stream.

```cpp
void System::IO::StreamWriter::Write(const char_t *buffer) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const char_t * | De c-string om te schrijven |

## Zie ook

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const SharedPtr\<Object\>\&) method


Schrijft de tekenreeksrepresentatie van het opgegeven object naar de stream.

```cpp
void System::IO::StreamWriter::Write(const SharedPtr<Object> &obj) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | Het object om te schrijven |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const String\&) method


Schrijft de opgegeven tekenreeks naar de stream.

```cpp
void System::IO::StreamWriter::Write(const String &value) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De tekenreeks om te schrijven |

## Zie ook

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const System::SharedPtr\<T\>\&) method


Schrijft de tekenreeksrepresentatie van het opgegeven object naar de stream.

```cpp
template<typename T> void System::IO::StreamWriter::Write(const System::SharedPtr<T> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het object |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | Het object om te schrijven |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
