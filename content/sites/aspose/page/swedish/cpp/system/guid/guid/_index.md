---
title: "System::Guid::Guid konstruktor"
linktitle: "Guid"
second_title: "Aspose.Page för C++"
description: "System::Guid::Guid konstruktor. Skapar ett objekt som representerar ett GUID bestående av enbart nollor i C++."
type: docs
weight: 100
url: /sv/cpp/system/guid/guid/
---
## Guid::Guid() constructor


Skapar ett objekt som representerar en GUID bestående av enbart nollor.

```cpp
System::Guid::Guid()
```

## Se även

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const ArrayPtr\<uint8_t\>\&) constructor


Skapar ett objekt som representerar en GUID specificerad som en array av osignerade 8‑bitars heltalsvärden.

```cpp
System::Guid::Guid(const ArrayPtr<uint8_t> &b)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| b | const ArrayPtr\<uint8_t\>\& | En byte-array som innehåller separata byte för GUID-et. |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const Guid\&) constructor


Skapar ett objekt som representerar samma GUID som det specificerade objektet.

```cpp
System::Guid::Guid(const Guid &guid)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| guid | const Guid\& | Det [Guid](../)-objektet att kopiera GUID-värdet från |

## Se även

* Class [Guid](../)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const String\&) constructor


Skapar ett objekt som representerar en GUID specificerad som en sträng.

```cpp
System::Guid::Guid(const String &g)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| g | const String\& | Strängrepresentationen av ett GUID som ska representeras av objektet som konstrueras. |

## Se även

* Class [String](../../string/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const System::Details::ArrayView\<uint8_t\>\&) constructor


Skapar ett objekt som representerar en GUID specificerad som en array‑vy av osignerade 8‑bitars heltalsvärden.

```cpp
System::Guid::Guid(const System::Details::ArrayView<uint8_t> &b)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| b | const System::Details::ArrayView\<uint8_t\>\& | En byte-array som innehåller separata byte för GUID-et. |

## Se även

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) constructor


Skapar en instans av klassen [Guid](../) från de angivna GUID-komponenterna.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const ArrayPtr<uint8_t> &d)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| en | int32_t | Bitar 0-31 i GUID-et |
| b | int16_t | Bitar 32-47 i GUID-et |
| c | int16_t | Bitar 48-63 i GUID-et |
| d | const ArrayPtr\<uint8_t\>\& | En byte-array som innehåller bitarna 64-127 i GUID-et |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) constructor


Skapar en instans av klassen [Guid](../) från de angivna GUID-komponenterna.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const System::Details::ArrayView<uint8_t> &d)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| en | int32_t | Bitar 0-31 i GUID-et |
| b | int16_t | Bitar 32-47 i GUID-et |
| c | int16_t | Bitar 48-63 i GUID-et |
| d | const System::Details::ArrayView\<uint8_t\>\& | En byte-array-vy som innehåller bitarna 64-127 i GUID-et |

## Se även

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


Skapar en instans av klassen [Guid](../) från de angivna osignerade heltalen och byte.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| en | int32_t | Bitar 0-31 i GUID-et |
| b | int16_t | Bitar 32-47 i GUID-et |
| c | int16_t | Bitar 48-63 i GUID-et |
| d | uint8_t | Bitar 64-71 i GUID-et |
| e | uint8_t | Bitar 72-79 i GUID-et |
| f | uint8_t | Bitar 80-87 i GUID-et |
| g | uint8_t | Bitar 88-95 i GUID-et |
| h | uint8_t | Bitar 96-103 i GUID-et |
| i | uint8_t | Bitar 104-111 i GUID-et |
| j | uint8_t | Bitar 112-119 i GUID-et |
| k | uint8_t | Bitar 120-127 i GUID-et |

## Se även

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


Skapar en instans av klassen [Guid](../) från de angivna osignerade heltalen och byte.

```cpp
System::Guid::Guid(uint32_t a, uint16_t b, uint16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| en | uint32_t | Bitar 0-31 i GUID-et |
| b | uint16_t | Bitar 32-47 i GUID-et |
| c | uint16_t | Bitar 48-63 i GUID-et |
| d | uint8_t | Bitar 64-71 i GUID-et |
| e | uint8_t | Bitar 72-79 i GUID-et |
| f | uint8_t | Bitar 80-87 i GUID-et |
| g | uint8_t | Bitar 88-95 i GUID-et |
| h | uint8_t | Bitar 96-103 i GUID-et |
| i | uint8_t | Bitar 104-111 i GUID-et |
| j | uint8_t | Bitar 112-119 i GUID-et |
| k | uint8_t | Bitar 120-127 i GUID-et |

## Se även

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
