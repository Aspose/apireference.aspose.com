---
title: "System::BitConverter::ToString metodo"
linktitle: "ToString"
second_title: "Aspose.Font per C++"
description: "Metodo System::BitConverter::ToString. Converte tutti i valori dell'array di byte specificato nella loro rappresentazione stringa esadecimale. Il caso delle lettere da utilizzare nella notazione esadecimale e il separatore inserito tra ogni coppia di byte adiacenti sono specificati tramite gli argomenti corrispondenti in C++."
type: docs
weight: 1200
url: /it/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


Converte tutti i valori dell'array di byte specificato nella loro rappresentazione stringa esadecimale. Il caso delle lettere da utilizzare nella notazione esadecimale e il separatore inserito tra ogni coppia di byte adiacenti sono specificati tramite gli argomenti corrispondenti.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) che contiene byte da convertire |
| maiuscolo | bool | Specifica il caso delle lettere da utilizzare nella rappresentazione esadecimale risultante |
| separatore | const String\& | Una stringa usata come separatore inserita tra ogni coppia di byte adiacenti nella stringa risultante |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## Vedi anche

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


Converte i valori dell'array di byte specificato nella loro rappresentazione stringa esadecimale a partire dall'indice specificato.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) che contiene byte da convertire |
| startIndex | int | Indice nell'array specificato a partire dal quale iniziare la conversione |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Vedi anche

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


Converte un intervallo di valori dell'array di byte specificato nella loro rappresentazione stringa esadecimale.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) che contiene byte da convertire |
| startIndex | int | Indice nell'array specificato in cui inizia l'intervallo degli elementi dell'array di byte da convertire |
| lunghezza | int | La lunghezza dell'intervallo degli elementi dell'array di byte da convertire |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Vedi anche

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
