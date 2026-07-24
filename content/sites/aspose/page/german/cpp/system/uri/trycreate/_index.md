---
title: "System::Uri::TryCreate Methode"
linktitle: "TryCreate"
second_title: "Aspose.Page für C++"
description: "System::Uri::TryCreate-Methode. Erstellt ein Uri-Objekt aus den angegebenen Basis- und relativen URIs in C++."
type: docs
weight: 4400
url: /de/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Erstellt ein [Uri](../)-Objekt aus den angegebenen Basis- und relativen URIs.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Der Basis-URI |
| relativeUri | const SharedPtr\<Uri\>\& | Der relative URI, der zum Basis-URI hinzugefügt wird |
| result | SharedPtr\<Uri\>\& | Das Ausgabe-Argument, das bei erfolgreicher Erstellung beim Methodenrücklauf auf das neu erstellte [Uri](../)-Objekt verweist |

### ReturnValue

Wahr, wenn die Erstellung erfolgreich war, sonst – falsch

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Erstellt ein [Uri](../)-Objekt aus dem angegebenen [Uri](../)-Objekt, das den Basis-URI darstellt, und der Zeichenkettenrepräsentation des relativen URI.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Der Basis-URI |
| relativeUri | const String\& | Der relative URI, der zum Basis-URI hinzugefügt wird |
| result | SharedPtr\<Uri\>\& | Das Ausgabe-Argument, das bei erfolgreicher Erstellung beim Methodenrücklauf auf das neu erstellte [Uri](../)-Objekt verweist |

### ReturnValue

Wahr, wenn die Erstellung erfolgreich war, sonst – falsch

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Erstellt ein [Uri](../)-Objekt, das den angegebenen URI darstellt; ein Argument gibt die Art des URI an.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| uriString | const String\& | Der Zeichenketten-URI, der durch das zu erstellende Objekt dargestellt wird |
| uriKind | UriKind | Gibt die Art des URI an |
| result | SharedPtr\<Uri\>\& | Das Ausgabe-Argument, das bei erfolgreicher Erstellung beim Methodenrücklauf auf das neu erstellte [Uri](../)-Objekt verweist |

### ReturnValue

Wahr, wenn die Erstellung erfolgreich war, sonst – falsch

## Siehe auch

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
