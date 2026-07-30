---
title: "Metodo System::Text::StringBuilder::Append"
linktitle: "Aggiungi"
second_title: "Aspose.Font per C++"
description: "Metodo System::Text::StringBuilder::Append. Aggiunge un carattere al builder in C++."
type: docs
weight: 300
url: /it/cpp/system.text/stringbuilder/append/
---
## StringBuilder::Append(char_t) method


Aggiunge un carattere al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| c | char_t | Valore del carattere. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(char_t, int) method


Aggiunge caratteri al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| c | char_t | Valore del carattere. |
| count | int | Quante volte ripetere il carattere da inserire. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&) method


Aggiunge l'array di caratteri al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Caratteri da aggiungere. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&, int, int) method


Aggiunge una porzione dell'array di caratteri al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr, int startIndex, int charCount)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Caratteri da aggiungere. |
| startIndex | int | Indice iniziale della porzione. |
| charCount | int | Lunghezza della fetta. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const SharedPtr\<StringBuilder\>\&) method


Aggiunge il contenuto del builder al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<StringBuilder> &builder)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| builder | const SharedPtr\<StringBuilder\>\& | Builder da cui aggiungere il contenuto. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const SharedPtr\<T\>\&) method


Aggiunge la rappresentazione stringa dell'oggetto al builder.

```cpp
template<class T> StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<T> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | [Object](../../../system/object/) tipo. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SharedPtr\<T\>\& | [Object](../../../system/object/) da serializzare e aggiungere. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const String\&) method


Aggiunge una stringa al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) da aggiungere. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const String\&, int, int) method


Aggiunge una porzione di stringa al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str, int startIndex, int charCount)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) da aggiungere. |
| startIndex | int | Indice iniziale della porzione. |
| charCount | int | Lunghezza della fetta. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(double) method


Aggiunge un valore a virgola mobile al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(double df)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| df | double | Valore da serializzare e aggiungere. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(E) method


Aggiunge la rappresentazione stringa del valore enum al builder.

```cpp
template<class E> std::enable_if<std::is_enum<E>::value, StringBuilder *>::type System::Text::StringBuilder::Append(E e)
```


| Parametro | Descrizione |
| --- | --- |
| E | [Enum](../../../system/enum/) tipo. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| e | E | Valore da serializzare e aggiungere. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(float) method


Aggiunge un valore a virgola mobile al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(float f)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| f | float | Valore da serializzare e aggiungere. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(int) method


Aggiunge un valore intero al builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(int i)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int | Valore da serializzare e aggiungere. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(T) method


Aggiunge valore aritmetico al builder.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Append(T value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo aritmetico. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | T | Valore da serializzare e aggiungere. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
