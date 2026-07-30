---
title: "System::IO::StreamWriter::Write metodo"
linktitle: "Write"
second_title: "Aspose.Font per C++"
description: "System::IO::StreamWriter::Write metodo. Scrive il carattere specificato nello stream in C++."
type: docs
weight: 1000
url: /it/cpp/system.io/streamwriter/write/
---
## StreamWriter::Write(char_t) method


Scrive il carattere specificato nello stream.

```cpp
void System::IO::StreamWriter::Write(char_t value) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | char_t | Il carattere da scrivere |

## Vedi anche

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&) method


Scrive tutti i caratteri dell'array specificato nel flusso.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | L'array contenente i caratteri da scrivere |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Scrive l'intervallo specificato di caratteri UTF-16 dall'array di caratteri specificato nel flusso.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | L'array contenente i caratteri da scrivere |
| indice | int32_t | Un indice basato su zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere |
| count | int32_t | Il numero di caratteri nel sottointervallo da scrivere; -1 specifica che il sottointervallo termina dove termina l'array **buffer** |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const char_t *) method


Scrive la c-string specificata nel flusso.

```cpp
void System::IO::StreamWriter::Write(const char_t *buffer) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const char_t * | La c-string da scrivere |

## Vedi anche

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const SharedPtr\<Object\>\&) method


Scrive la rappresentazione stringa dell'oggetto specificato nello stream.

```cpp
void System::IO::StreamWriter::Write(const SharedPtr<Object> &obj) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | L'oggetto da scrivere |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const String\&) method


Scrive la stringa specificata nel flusso.

```cpp
void System::IO::StreamWriter::Write(const String &value) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da scrivere |

## Vedi anche

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const System::SharedPtr\<T\>\&) method


Scrive la rappresentazione stringa dell'oggetto specificato nello stream.

```cpp
template<typename T> void System::IO::StreamWriter::Write(const System::SharedPtr<T> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo dell'oggetto |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | L'oggetto da scrivere |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
