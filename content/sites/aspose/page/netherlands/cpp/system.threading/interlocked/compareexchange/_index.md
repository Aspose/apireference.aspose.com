---
title: "System::Threading::Interlocked::CompareExchange method"
linktitle: "CompareExchange"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Interlocked::CompareExchange-methode. Vergelijkt en wisselt de waarde op de variabele: controleert of de variabele gelijk is aan een specifieke waarde en slaat de nieuwe waarde alleen op als de opgeslagen waarde overeenkomt met de verwachte in C++."
type: docs
weight: 200
url: /nl/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Vergelijkt en wisselt de waarde op een variabele: controleert of de variabele gelijk is aan een specifieke waarde en slaat de nieuwe waarde alleen op als de opgeslagen waarde overeenkomt met de verwachte.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| location1 | int32_t\& | Variabele-referentie om te wijzigen. |
| value | int32_t | Waarde om op te slaan. |
| comparand | int32_t | Waarde om de waarde van de variabele mee te vergelijken vóór het uitwisselen. |
| geslaagd | bool\& | Referentie naar de variabele die true wordt ingesteld als de uitwisseling plaatsvond en anders false. |

### ReturnValue

Waarde van variabele bij het starten van de bewerking, ongeacht of deze is gewijzigd of niet.

## Zie ook

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Vergelijkt en wisselt de waarde op een variabele: controleert of de variabele gelijk is aan een specifieke waarde en slaat de nieuwe waarde alleen op als de opgeslagen waarde overeenkomt met de verwachte.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Variabeletype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| location1 | T\& | Variabele-referentie om te wijzigen. |
| value | T | Waarde om op te slaan. |
| comparand | T | Waarde om de waarde van de variabele mee te vergelijken vóór het uitwisselen. |

### ReturnValue

Waarde van variabele bij het starten van de bewerking, ongeacht of deze is gewijzigd of niet.

## Zie ook

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Vergelijkt en wisselt de waarde op een variabele: controleert of de variabele gelijk is aan een specifieke waarde en slaat de nieuwe waarde alleen op als de opgeslagen waarde overeenkomt met de verwachte. Niet geïmplementeerd.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Variabeletype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| location1 | T\& | Variabele-referentie om te wijzigen. |
| value | T | Waarde om op te slaan. |
| comparand | T | Waarde om de waarde van de variabele mee te vergelijken vóór het uitwisselen. |

### ReturnValue

Waarde van variabele bij het starten van de bewerking, ongeacht of deze is gewijzigd of niet.

## Zie ook

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
