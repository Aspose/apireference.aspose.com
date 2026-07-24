---
title: "System::Uri::TryCreate metod"
linktitle: "TryCreate"
second_title: "Aspose.Page för C++"
description: "System::Uri::TryCreate metod. Skapar ett Uri-objekt från den angivna bas- och relativa URI-erna i C++."
type: docs
weight: 4400
url: /sv/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Skapar ett [Uri](../)-objekt från den angivna bas- och relativa URI-erna.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Den bas-URI:n |
| relativeUri | const SharedPtr\<Uri\>\& | Den relativa URI som läggs till den bas-URI:n |
| result | SharedPtr\<Uri\>\& | Utdataargumentet som, om konstruktionen lyckas, pekar på det nykonstruerade [Uri](../)-objektet vid metodretur |

### ReturnValue

Sant om konstruktionen lyckades, annars - falskt

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Skapar ett [Uri](../)-objekt från det angivna [Uri](../)-objektet som representerar bas-URI:n och den strängrepresentation av den relativa URI:n.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Den bas-URI:n |
| relativeUri | const String\& | Den relativa URI som läggs till den bas-URI:n |
| result | SharedPtr\<Uri\>\& | Utdataargumentet som, om konstruktionen lyckas, pekar på det nykonstruerade [Uri](../)-objektet vid metodretur |

### ReturnValue

Sant om konstruktionen lyckades, annars - falskt

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Skapar ett [Uri](../)-objekt som representerar den angivna URI:n; ett argument specificerar URI-typen.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| uriString | const String\& | Den sträng-URI som ska representeras av det objekt som konstrueras |
| uriKind | UriKind | Specificerar URI-typen |
| result | SharedPtr\<Uri\>\& | Utdataargumentet som, om konstruktionen lyckas, pekar på det nykonstruerade [Uri](../)-objektet vid metodretur |

### ReturnValue

Sant om konstruktionen lyckades, annars - falskt

## Se även

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
