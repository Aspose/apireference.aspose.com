---
title: "System::Uri::TryCreate Methode"
linktitle: "TryCreate"
second_title: "Aspose.Font für C++"
description: "System::Uri::TryCreate Methode. Erstellt ein Uri-Objekt aus den angegebenen Basis- und relativen URIs in C++."
type: docs
weight: 4400
url: /de/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Erstellt ein [Uri](../)-Objekt aus der angegebenen Basis- und relativen URIs.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Die Basis-URI |
| relativeUri | const SharedPtr\<Uri\>\& | Die relative URI, die zur Basis-URI hinzugefügt wird |
| result | SharedPtr\<Uri\>\& | Das Ausgabeargument, das, falls die Erstellung erfolgreich ist, beim Methodenrückkehr auf das neu erstellte [Uri](../)-Objekt verweist |

### ReturnValue

Wahr, wenn die Erstellung erfolgreich war, sonst - falsch

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Erstellt ein [Uri](../)-Objekt aus dem angegebenen [Uri](../)-Objekt, das die Basis-URI darstellt, und der Zeichenkettenrepräsentation der relativen URI.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Die Basis-URI |
| relativeUri | const String\& | Die relative URI, die zur Basis-URI hinzugefügt wird |
| result | SharedPtr\<Uri\>\& | Das Ausgabeargument, das, falls die Erstellung erfolgreich ist, beim Methodenrückkehr auf das neu erstellte [Uri](../)-Objekt verweist |

### ReturnValue

Wahr, wenn die Erstellung erfolgreich war, sonst - falsch

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Erstellt ein [Uri](../)-Objekt, das die angegebene URI darstellt; ein Argument gibt den URI-Typ an.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| uriString | const String\& | Die Zeichenketten-URI, die von dem zu erstellenden Objekt dargestellt werden soll |
| uriKind | UriKind | Gibt den URI-Typ an |
| result | SharedPtr\<Uri\>\& | Das Ausgabeargument, das, falls die Erstellung erfolgreich ist, beim Methodenrückkehr auf das neu erstellte [Uri](../)-Objekt verweist |

### ReturnValue

Wahr, wenn die Erstellung erfolgreich war, sonst - falsch

## Siehe auch

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
