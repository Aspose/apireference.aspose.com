---
title: "System::IO::StreamWriter::WriteLine metodo"
linktitle: "WriteLine"
second_title: "Aspose.Font per C++"
description: "System::IO::StreamWriter::WriteLine metodo. Scrive i caratteri di terminazione di riga nello stream in C++."
type: docs
weight: 1100
url: /it/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


Scrive i caratteri di terminazione di riga nel flusso.

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## Vedi anche

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


Scrive tutti i caratteri dall'array specificato, seguiti dai caratteri di terminazione di riga, nel flusso.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | L'array contenente i caratteri da scrivere |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Scrive l'intervallo specificato di caratteri UTF-16 dall'array di caratteri specificato, seguito dai caratteri di terminazione di riga, nel flusso.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
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
## StreamWriter::WriteLine(const char_t *) method


Scrive la c-string specificata, seguita dai caratteri di terminazione di riga, nel flusso.

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const char_t * | La c-string da scrivere |

## Vedi anche

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


Scrive la rappresentazione stringa dell'oggetto specificato seguita dai caratteri di terminazione di riga nel flusso.

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
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
## StreamWriter::WriteLine(const String\&) method


Scrive la stringa specificata seguita dai caratteri di terminazione di riga nel flusso.

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da scrivere |

## Vedi anche

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


Scrive la rappresentazione stringa dell'oggetto specificato seguita dai caratteri di terminazione di riga nel flusso.

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
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
