---
title: "Metodo System::String::Equals"
linktitle: "Uguale"
second_title: "Aspose.Page per C++"
description: "Metodo System::String::Equals. Confronto di uguaglianza delle stringhe. Utilizza la modalità di confronto System::StringComparison::Ordinal in C++."
type: docs
weight: 1100
url: /it/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const String\& | [String](../) per confrontare con quella corrente. |

### ReturnValue

vero se le stringhe corrispondono, falso altrimenti.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const String\& | [String](../) per confrontare con quella corrente. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) modalità (vedi [System::StringComparison](../../stringcomparison/) per i dettagli). |

### ReturnValue

true se le stringhe corrispondono usando il tipo di confronto selezionato, false altrimenti.

## Vedi anche

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&) method


Confronta due stringhe per uguaglianza usando la modalità di confronto ordinale.

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| strA | const String\& | Prima stringa da confrontare. |
| strB | const String\& | Seconda stringa da confrontare. |

### ReturnValue

vero se le stringhe corrispondono, falso altrimenti.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Confronta due stringhe per uguaglianza.

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| strA | const String\& | Prima stringa da confrontare. |
| strB | const String\& | Seconda stringa da confrontare. |
| comparison_type | System::StringComparison | Modalità [Comparison](../../comparison/). |

### ReturnValue

vero se le stringhe corrispondono, falso altrimenti.

## Vedi anche

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
