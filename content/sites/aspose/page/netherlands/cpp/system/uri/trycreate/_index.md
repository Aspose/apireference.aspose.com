---
title: "System::Uri::TryCreate methode"
linktitle: "TryCreate"
second_title: "Aspose.Page voor C++"
description: "System::Uri::TryCreate methode. Construeert een Uri‑object van de opgegeven basis‑ en relatieve URI’s in C++."
type: docs
weight: 4400
url: /nl/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Construeert een [Uri](../) object van de opgegeven basis‑ en relatieve URI’s.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| baseUri | const SharedPtr\\<Uri\\>\\& | De basis‑URI |
| relativeUri | const SharedPtr\\<Uri\\>\\& | De relatieve URI die wordt toegevoegd aan de basis‑URI |
| result | SharedPtr\<Uri\>\& | Het uitvoerargument dat, als de constructie slaagt, wijst naar het nieuw geconstrueerde [Uri](../) object bij het retourneren van de methode |

### ReturnValue

Waar als de constructie geslaagd is, anders - onwaar

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Construeert een [Uri](../) object van het opgegeven [Uri](../) object dat de basis‑URI vertegenwoordigt en de tekenreeksrepresentatie van de relatieve URI.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| baseUri | const SharedPtr\\<Uri\\>\\& | De basis‑URI |
| relativeUri | const String\& | De relatieve URI die wordt toegevoegd aan de basis‑URI |
| result | SharedPtr\<Uri\>\& | Het uitvoerargument dat, als de constructie slaagt, wijst naar het nieuw geconstrueerde [Uri](../) object bij het retourneren van de methode |

### ReturnValue

Waar als de constructie geslaagd is, anders - onwaar

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Construeert een [Uri](../) object dat de opgegeven URI vertegenwoordigt; een argument specificeert het type URI.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| uriString | const String\& | De tekenreeks‑URI die moet worden weergegeven door het te construeren object |
| uriKind | UriKind | Specificeert het type URI |
| result | SharedPtr\<Uri\>\& | Het uitvoerargument dat, als de constructie slaagt, wijst naar het nieuw geconstrueerde [Uri](../) object bij het retourneren van de methode |

### ReturnValue

Waar als de constructie geslaagd is, anders - onwaar

## Zie ook

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
