---
title: "System::IO::StreamWriter::WriteLine methode"
linktitle: "WriteLine"
second_title: "Aspose.Page voor C++"
description: "System::IO::StreamWriter::WriteLine methode. Schrijft regeleinde‑tekens naar de stream in C++."
type: docs
weight: 1100
url: /nl/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


Schrijft regeleinde-tekens naar de stream.

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## Zie ook

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


Schrijft alle tekens van de opgegeven array, gevolgd door de regeleinde-tekens, naar de stream.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | De array die de tekens bevat om te schrijven |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Schrijft het opgegeven subbereik van UTF-16-tekens van de opgegeven tekenarray, gevolgd door de regeleinde-tekens, naar de stream.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
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
## StreamWriter::WriteLine(const char_t *) method


Schrijft de opgegeven c-string, gevolgd door de regeleinde-tekens, naar de stream.

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const char_t * | De c-string om te schrijven |

## Zie ook

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


Schrijft de tekenreeksrepresentatie van het opgegeven object, gevolgd door de regeleinde-tekens, naar de stream.

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
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
## StreamWriter::WriteLine(const String\&) method


Schrijft de opgegeven tekenreeks, gevolgd door de regeleinde-tekens, naar de stream.

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De tekenreeks om te schrijven |

## Zie ook

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


Schrijft de tekenreeksrepresentatie van het opgegeven object, gevolgd door de regeleinde-tekens, naar de stream.

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
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
