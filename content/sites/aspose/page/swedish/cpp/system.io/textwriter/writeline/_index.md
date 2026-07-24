---
title: "System::IO::TextWriter::WriteLine metod"
linktitle: "WriteLine"
second_title: "Aspose.Page för C++"
description: "System::IO::TextWriter::WriteLine metod. Skriver radavslutningstecken till strömmen i C++."
type: docs
weight: 1000
url: /sv/cpp/system.io/textwriter/writeline/
---
## TextWriter::WriteLine() method


Skriver radavslutningstecken till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine()
```

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(bool) method


Skriver strängrepresentationen av det angivna booleska värdet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(bool value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | bool | Värdet att skriva |

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(char_t) method


Skriver det angivna tecknet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(char_t value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | char_t | Värdet att skriva |

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


Skriver alla tecken från den angivna arrayen följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<char_t\>\& | Arrayen som innehåller tecknen att skriva |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Skriver det angivna delintervallet av UTF‑16‑tecken från den angivna teckenarrayen följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<char_t\>\& | Arrayen som innehåller tecknen att skriva |
| index | int32_t | Ett 0-baserat index för elementet i **buffer** där delintervallet att skriva börjar |
| count | int32_t | Antalet tecken i delintervallet att skriva; -1 anger att delintervallet slutar där **buffer**-arrayen slutar |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const char_t *) method


Skriver den angivna C‑strängen följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(const char_t *value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const char_t * | C-strängen att skriva |

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const SharedPtr\<Object\>\&) method


Skriver strängrepresentationen av det angivna objektet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(const SharedPtr<Object> &value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const SharedPtr\<Object\>\& | Objektet att skriva |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const String\&, const TArgs\&...) method


Skriver de angivna värdena formaterade enligt det angivna formatet följt av tecknen till strömmen.

```cpp
template<class...> void System::IO::TextWriter::WriteLine(const String &format, const TArgs &... args)
```


| Parameter | Beskrivning |
| --- | --- |
| TArgs | Listan över typer av värden att skriva |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| format | const String\& | Strängformatet |
| args | const TArgs\&... | Värdena att skriva |

## Se även

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const String\&) method


Skriver den angivna strängen följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(const String &value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const String\& | Strängen att skriva |

## Se även

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const TypeInfo\&) method


Skriver strängrepresentationen av det angivna [TypeInfo](../../../system/typeinfo/)‑objektet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(const TypeInfo &value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const TypeInfo\& | Objektet att skriva |

## Se även

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(Decimal) method


Skriver strängrepresentationen av det angivna [Decimal](../../../system/decimal/)‑objektet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(Decimal value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | Decimal | Objektet att skriva |

## Se även

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(double) method


Skriver strängrepresentationen av det angivna dubbelprecision flyttalvärdet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(double value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | double | Värdet att skriva |

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(float) method


Skriver strängrepresentationen av det angivna enkelprecision flyttalvärdet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(float value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | float | Värdet att skriva |

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int) method


Skriver strängrepresentationen av det angivna 32-bit heltalsvärdet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(int value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | int | Värdet att skriva |

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int64_t) method


Skriver strängrepresentationen av det angivna 64-bit heltalsvärdet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(int64_t value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | int64_t | Värdet att skriva |

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint32_t) method


Skriver strängrepresentationen av det angivna osignerade 32‑bit heltalsvärdet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(uint32_t value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | uint32_t | Värdet att skriva |

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint64_t) method


Skriver strängrepresentationen av det angivna osignerade 64‑bit heltalsvärdet följt av radavslutningstecknen till strömmen.

```cpp
virtual void System::IO::TextWriter::WriteLine(uint64_t value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | uint64_t | Värdet att skriva |

## Se även

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
