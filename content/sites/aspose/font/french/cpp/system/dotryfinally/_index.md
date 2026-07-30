---
title: "Méthode System::DoTryFinally"
linktitle: "DoTryFinally"
second_title: "Aspose.Font pour C++"
description: "Méthode System::DoTryFinally. La fonction unique qui émule le comportement de l'instruction try[-catch]-finally de C#'s. Lors de la traduction de l'instruction try[-catch]-finally de C#'s avec l'option finally_statement_as_lambda du traducteur définie sur true, l'instruction est traduite en appel de cette méthode en C++."
type: docs
weight: 16600
url: /fr/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


La fonction unique qui émule le comportement de l'instruction try[-catch]-finally de C#'s. Lors de la traduction de l'instruction try[-catch]-finally de C#'s avec l'option finally_statement_as_lambda du traducteur définie sur true, l'instruction est traduite en appel de cette méthode.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Paramètre | Description |
| --- | --- |
| T | Le type de l'objet fonction qui implémente la partie try[-catch] de l'instruction try[-catch]-finally en cours d'émulation. |
| F | Le type de l'objet fonction qui implémente la partie finally de l'instruction try[-catch]-finally en cours d'émulation. |

| Paramètre | Type | Description |
| --- | --- | --- |
| tryBlock | T\\&& | L'objet fonction dont le corps contient l'implémentation de la partie try[-catch] de l'instruction try[-catch]-finally en cours d'émulation. |
| finallyBlock | F\\&& | L'objet fonction dont le corps contient l'implémentation de la partie finally de l'instruction try[-catch]-finally en cours d'émulation. |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


La fonction unique qui émule le comportement de l'instruction try[-catch]-finally de C#'s. Lors de la traduction de l'instruction try[-catch]-finally de C#'s avec l'option finally_statement_as_lambda du traducteur définie sur true, l'instruction est traduite en appel de cette méthode. Cette surcharge gère le cas où la valeur de retour de l'objet fonction qui implémente la partie try[-catch] de l'instruction try[-catch]-finally est bool.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Paramètre | Description |
| --- | --- |
| T | Le type de l'objet fonction qui implémente la partie try[-catch] de l'instruction try[-catch]-finally en cours d'émulation. |
| F | Le type de l'objet fonction qui implémente la partie finally de l'instruction try[-catch]-finally en cours d'émulation. |

| Paramètre | Type | Description |
| --- | --- | --- |
| tryBlock | T\\&& | L'objet fonction dont le corps contient l'implémentation de la partie try[-catch] de l'instruction try[-catch]-finally en cours d'émulation. |
| finallyBlock | F\\&& | L'objet fonction dont le corps contient l'implémentation de la partie finally de l'instruction try[-catch]-finally en cours d'émulation. |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


La fonction unique qui émule le comportement de l'instruction try[-catch]-finally de C#'s. Lors de la traduction de l'instruction try[-catch]-finally de C#'s avec l'option finally_statement_as_lambda du traducteur définie sur true, l'instruction est traduite en appel de cette méthode. Cette surcharge gère le cas où la valeur de retour de l'objet fonction qui implémente la partie try[-catch] de l'instruction try[-catch]-finally est bool&.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Paramètre | Description |
| --- | --- |
| T | Le type de l'objet fonction qui implémente la partie try[-catch] de l'instruction try[-catch]-finally en cours d'émulation. |
| F | Le type de l'objet fonction qui implémente la partie finally de l'instruction try[-catch]-finally en cours d'émulation. |

| Paramètre | Type | Description |
| --- | --- | --- |
| tryBlock | T\\&& | L'objet fonction dont le corps contient l'implémentation de la partie try[-catch] de l'instruction try[-catch]-finally en cours d'émulation. |
| finallyBlock | F\\&& | L'objet fonction dont le corps contient l'implémentation de la partie finally de l'instruction try[-catch]-finally en cours d'émulation. |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
