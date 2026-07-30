---
title: "System::Uri::TryCreate metodo"
linktitle: "TryCreate"
second_title: "Aspose.Font per C++"
description: "System::Uri::TryCreate metodo. Costruisce un oggetto Uri a partire dalle URI base e relative specificate in C++."
type: docs
weight: 4400
url: /it/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Costruisce un oggetto [Uri](../) a partire dalla base e dalle URI relative specificate.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | L'URI base |
| relativeUri | const SharedPtr\<Uri\>\& | L'URI relativo che viene aggiunto all'URI base |
| result | SharedPtr\<Uri\>\& | L'argomento di output che, se la costruzione ha successo, punta al nuovo oggetto [Uri](../) appena costruito al ritorno del metodo |

### ReturnValue

Vero se la costruzione è riuscita, altrimenti - falso

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Costruisce un oggetto [Uri](../) a partire dall'oggetto [Uri](../) specificato che rappresenta l'URI base e dalla rappresentazione stringa dell'URI relativo.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | L'URI base |
| relativeUri | const String\& | L'URI relativo che viene aggiunto all'URI base |
| result | SharedPtr\<Uri\>\& | L'argomento di output che, se la costruzione ha successo, punta al nuovo oggetto [Uri](../) appena costruito al ritorno del metodo |

### ReturnValue

Vero se la costruzione è riuscita, altrimenti - falso

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Costruisce un oggetto [Uri](../) che rappresenta l'URI specificato; un argomento specifica il tipo di URI.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| uriString | const String\& | La stringa URI da rappresentare nell'oggetto in costruzione |
| uriKind | UriKind | Specifica il tipo di URI |
| result | SharedPtr\<Uri\>\& | L'argomento di output che, se la costruzione ha successo, punta al nuovo oggetto [Uri](../) appena costruito al ritorno del metodo |

### ReturnValue

Vero se la costruzione è riuscita, altrimenti - falso

## Vedi anche

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
