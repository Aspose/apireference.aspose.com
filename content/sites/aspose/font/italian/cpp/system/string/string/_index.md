---
title: "Costruttore System::String::String"
linktitle: "Stringa"
second_title: "Aspose.Font per C++"
description: "Costruttore System::String::String. Costruttore predefinito. Crea un oggetto stringa considerato nullo in C++."
type: docs
weight: 100
url: /it/cpp/system/string/string/
---
## String::String() constructor


Costruttore predefinito. Crea un oggetto stringa considerato nullo.

```cpp
System::String::String()
```

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


Costruttore di spostamento.

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString da avvolgere in [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


Converte l'intero array di caratteri in una stringa.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) da convertire in stringa. |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


Converte un sottointervallo di un array di caratteri in una stringa. Se i parametri sono fuori dai limiti dell'array, viene costruita una stringa vuota.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | Array di caratteri. |
| offset | int | Indice di inizio del sottoarray. |
| len | int | Lunghezza del sottoarray. |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char *, int) constructor


Costruisce una stringa da un puntatore a stringa di caratteri e una lunghezza esplicita.

```cpp
System::String::String(const char *str, int length)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const char * | Puntatore [String](../) ai dati UTF8, può essere letterale o array. |
| lunghezza | int | Lunghezza esplicita della stringa |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t *, int) constructor


Costruisce una stringa da un puntatore a stringa di caratteri e una lunghezza esplicita.

```cpp
System::String::String(const char16_t *str, int length)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const char16_t * | Puntatore [String](../), può essere letterale o array. |
| lunghezza | int | Lunghezza esplicita della stringa |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t *, int, int) constructor


Costruisce una stringa da un puntatore a stringa di caratteri a partire da una posizione iniziale usando la lunghezza.

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const char16_t * | Puntatore [String](../), può essere letterale o array. |
| start | int | Posizione iniziale. |
| length | int | Lunghezza [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t, int) constructor


Costruttore di riempimento.

```cpp
System::String::String(const char16_t ch, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ch | const char16_t | Carattere di riempimento. |
| count | int | Lunghezza target. |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


Avvolge UnicodeString in [String](../).

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString da avvolgere in [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::string\&) constructor


Crea [String](../) da una stringa std::string presentata nel formato UTF-8.

```cpp
System::String::String(const std::string &utf8str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| utf8str | const std::string\& | Stringa std::string da convertire in [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::u16string\&) constructor


Crea [String](../) da una stringa utf16.

```cpp
System::String::String(const std::u16string &str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const std::u16string\& | Stringa Utf16 da convertire in [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::u32string\&) constructor


Crea [String](../) da una stringa std::u32string.

```cpp
System::String::String(const std::u32string &u32str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| u32str | const std::u32string\& | Stringa std::u32string da convertire in [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::wstring\&) constructor


Crea [String](../) da una widestring.

```cpp
System::String::String(const std::wstring &str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const std::wstring\& | Widestring da convertire in [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const String\&) constructor


Costruttore di copia.

```cpp
System::String::String(const String &str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const String\& | [String](../) da copiare. |

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


Costruisce una stringa basata su un puntatore a stringa di caratteri. Tratta la stringa puntata come terminata da null in UTF‑8, calcola la lunghezza della stringa di destinazione in base al carattere null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const T\& | Puntatore a stringa di caratteri. |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


Costruisce una stringa basata su un puntatore a stringa di caratteri. Tratta la stringa puntata come terminata da null, calcola la lunghezza della stringa di destinazione in base al carattere null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const T\& | Puntatore a stringa di caratteri. |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


Costruisce una stringa basata su un puntatore a stringa widecharacter. Tratta la stringa puntata come terminata da null, calcola la lunghezza della stringa di destinazione in base al carattere null. La conversione da wchar_t richiede molto tempo su alcune piattaforme, quindi non sono consentite conversioni implicite.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const T\& | Puntatore a stringa di caratteri. |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


Costruttore nullptr. Dichiarato come modello per risolvere le priorità con altri costruttori modello.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| Parametro | Descrizione |
| --- | --- |
| T | Dovrebbe essere nullptr_t |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const T\& | nullptr |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const wchar_t *, int) constructor


Costruisce una stringa da un puntatore a stringa widecharacter e una lunghezza esplicita. La conversione da wchar_t richiede molto tempo su alcune piattaforme, quindi non sono consentite conversioni implicite.

```cpp
System::String::String(const wchar_t *str, int length)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const wchar_t * | Puntatore [String](../), può essere letterale o array. |
| lunghezza | int | Lunghezza esplicita della stringa |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const wchar_t, int) constructor


Costruttore di riempimento. La conversione da wchar_t richiede molto tempo su alcune piattaforme, quindi non sono consentite conversioni implicite.

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ch | const wchar_t | Carattere di riempimento. |
| count | int | Lunghezza target. |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(String\&&) constructor


Costruttore di spostamento.

```cpp
System::String::String(String &&str) noexcept
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | String\&& | [String](../) da cui spostare i dati. |

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


Costruisce una stringa basata su un letterale di stringa. Considera il letterale una stringa terminata da null in UTF‑8, calcola la lunghezza della stringa di destinazione in base alla dimensione del letterale.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | T\& | Puntatore letterale [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


Costruisce una stringa basata su un letterale di stringa. Considera il letterale una stringa terminata da null, calcola la lunghezza della stringa di destinazione in base alla dimensione del letterale.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | T\& | Puntatore letterale [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


Costruisce una stringa basata su un letterale widestring. Considera il letterale una stringa terminata da null, calcola la lunghezza della stringa di destinazione in base alla dimensione del letterale. La conversione da wchar_t richiede molto tempo su alcune piattaforme, quindi non sono consentite conversioni implicite.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | T\& | Puntatore letterale [String](../). |

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
