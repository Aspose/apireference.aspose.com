---
title: "System::Uri::MakeRelativeUri Methode"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Font für C++"
description: "System::Uri::MakeRelativeUri Methode. Bestimmt die Differenz zwischen den URIs, die vom aktuellen und dem angegebenen Uri-Objekt in C++ dargestellt werden."
type: docs
weight: 3100
url: /de/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


Bestimmt die Differenz zwischen den URIs, die vom aktuellen und dem angegebenen [Uri](../)-Objekt dargestellt werden.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Der Vergleichswert |

### ReturnValue

Wenn der Hostname und das Schema der URIs, die vom aktuellen Objekt und **toUri** dargestellt werden, identisch sind, gibt diese Methode ein relatives [Uri](../) zurück, das, wenn es an die aktuelle URI‑Instanz angehängt wird, **toUri** ergibt. Ist der Hostname oder das Schema unterschiedlich, gibt diese Methode ein [Uri](../)-Objekt zurück, das den Parameter **uri** darstellt.

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
