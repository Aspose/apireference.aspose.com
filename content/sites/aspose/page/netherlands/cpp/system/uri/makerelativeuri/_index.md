---
title: "System::Uri::MakeRelativeUri methode"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Page voor C++"
description: "System::Uri::MakeRelativeUri methode. Bepaalt het verschil tussen URI's die worden weergegeven door het huidige en de opgegeven Uri-objecten in C++."
type: docs
weight: 3100
url: /nl/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


Bepaalt het verschil tussen URI's die worden weergegeven door het huidige en de opgegeven [Uri](../) objecten.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| uri | const SharedPtr\\<Uri\\>\\& | De te vergelijken waarde |

### ReturnValue

Als de hostnaam en het schema van de URI's die worden weergegeven door het huidige object en **toUri** hetzelfde zijn, retourneert deze methode een relatieve [Uri](../) die, wanneer toegevoegd aan de huidige URI-instantie, **toUri** oplevert. Als de hostnaam of het schema verschillend is, retourneert deze methode een [Uri](../) object dat de **uri** parameter vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
