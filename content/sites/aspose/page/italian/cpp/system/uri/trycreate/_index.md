---
title: "System::Uri::TryCreate metodo"
linktitle: "TryCreate"
second_title: "Aspose.Page per C++"
description: "Metodo System::Uri::TryCreate. Costruisce un oggetto Uri dall'URI di base e dagli URI relativi specificati in C++."
type: docs
weight: 4400
url: /it/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Costruisce un oggetto [Uri](../) dalla base specificata e dagli URI relativi.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | L'URI di base |
| relativeUri | const SharedPtr\<Uri\>\& | L'URI relativo che viene aggiunto all'URI di base |
| result | SharedPtr\<Uri\>\& | L'argomento di output che, se la costruzione ha successo, punta al nuovo oggetto [Uri](../) creato al ritorno del metodo |

### ReturnValue

True se la costruzione è riuscita, altrimenti - false

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Costruisce un oggetto [Uri](../) dall'oggetto [Uri](../) specificato che rappresenta l'URI di base e dalla rappresentazione stringa dell'URI relativo.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | L'URI di base |
| relativeUri | const String\& | L'URI relativo che viene aggiunto all'URI di base |
| result | SharedPtr\<Uri\>\& | L'argomento di output che, se la costruzione ha successo, punta al nuovo oggetto [Uri](../) creato al ritorno del metodo |

### ReturnValue

True se la costruzione è riuscita, altrimenti - false

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Costruisce un oggetto [Uri](../) che rappresenta l'URI specificato; un argomento specifica il tipo di URI.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| uriString | const String\& | La stringa URI da rappresentare nell'oggetto in fase di costruzione |
| uriKind | UriKind | Specifica il tipo di URI |
| result | SharedPtr\<Uri\>\& | L'argomento di output che, se la costruzione ha successo, punta al nuovo oggetto [Uri](../) creato al ritorno del metodo |

### ReturnValue

True se la costruzione è riuscita, altrimenti - false

## Vedi anche

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
