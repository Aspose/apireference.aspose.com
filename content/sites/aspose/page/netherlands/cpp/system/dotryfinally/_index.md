---
title: "System::DoTryFinally methode"
linktitle: "DoTryFinally"
second_title: "Aspose.Page voor C++"
description: "System::DoTryFinally methode. De enige functie die het gedrag van C#''s try[-catch]-finally statement emuleert. Tijdens de vertaling van C#''s try[-catch]-finally statement met de optie finally_statement_as_lambda van de vertaler ingesteld op true, wordt de statement vertaald naar een aanroep van deze methode in C++."
type: docs
weight: 16500
url: /nl/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


De enige functie die het gedrag van C#'s try[-catch]-finally statement emuleert. Tijdens de vertaling van C#'s try[-catch]-finally statement met de optie finally_statement_as_lambda van de vertaler ingesteld op true, wordt de statement vertaald naar een aanroep van deze methode.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het functie‑object dat het try[-catch]-gedeelte van het geëmuleerde try[-catch]-finally statement implementeert |
| F | Het type van het functie‑object dat het finally‑gedeelte van de geëmuleerde try[-catch]-finally‑instructie implementeert |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tryBlock | T\&& | Het functie‑object waarvan het lichaam de implementatie van het try[-catch]‑gedeelte van de geëmuleerde try[-catch]-finally‑instructie bevat |
| finallyBlock | F\&& | Het functie‑object waarvan het lichaam de implementatie van het finally‑gedeelte van de geëmuleerde try[-catch]-finally‑instructie bevat |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


De enkele functie die het gedrag van de try[-catch]-finally‑instructie van C# emuleert. Tijdens de vertaling van de try[-catch]-finally‑instructie van C# met de vertaleroptie finally_statement_as_lambda ingesteld op true, wordt de instructie vertaald naar een aanroep van deze methode. Deze overload behandelt het geval waarin de retourwaarde van het functie‑object dat het try[-catch]‑gedeelte van de try[-catch]-finally‑instructie implementeert een bool is.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het functie‑object dat het try[-catch]-gedeelte van het geëmuleerde try[-catch]-finally statement implementeert |
| F | Het type van het functie‑object dat het finally‑gedeelte van de geëmuleerde try[-catch]-finally‑instructie implementeert |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tryBlock | T\&& | Het functie‑object waarvan het lichaam de implementatie van het try[-catch]‑gedeelte van de geëmuleerde try[-catch]-finally‑instructie bevat |
| finallyBlock | F\&& | Het functie‑object waarvan het lichaam de implementatie van het finally‑gedeelte van de geëmuleerde try[-catch]-finally‑instructie bevat |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


De enkele functie die het gedrag van de try[-catch]-finally‑instructie van C# emuleert. Tijdens de vertaling van de try[-catch]-finally‑instructie van C# met de vertaleroptie finally_statement_as_lambda ingesteld op true, wordt de instructie vertaald naar een aanroep van deze methode. Deze overload behandelt het geval waarin de retourwaarde van het functie‑object dat het try[-catch]‑gedeelte van de try[-catch]-finally‑instructie implementeert een bool& is.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het functie‑object dat het try[-catch]-gedeelte van het geëmuleerde try[-catch]-finally statement implementeert |
| F | Het type van het functie‑object dat het finally‑gedeelte van de geëmuleerde try[-catch]-finally‑instructie implementeert |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tryBlock | T\&& | Het functie‑object waarvan het lichaam de implementatie van het try[-catch]‑gedeelte van de geëmuleerde try[-catch]-finally‑instructie bevat |
| finallyBlock | F\&& | Het functie‑object waarvan het lichaam de implementatie van het finally‑gedeelte van de geëmuleerde try[-catch]-finally‑instructie bevat |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
