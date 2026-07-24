---
title: "System::Uri::MakeRelative methode"
linktitle: "MakeRelative"
second_title: "Aspose.Page voor C++"
description: "System::Uri::MakeRelative methode. Bepaalt het verschil tussen twee Uri‑instanties in C++."
type: docs
weight: 3000
url: /nl/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


Bepaalt het verschil tussen twee [Uri](../) instanties.

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| toUri | const SharedPtr\\<Uri\\>\\& | De URI om te vergelijken met de huidige URI |

### ReturnValue

Als de hostnaam en het schema van de URI's die worden vertegenwoordigd door het huidige object en **toUri** hetzelfde zijn, retourneert deze methode een [String](../../string/) die een relatieve [Uri](../) vertegenwoordigt, die, wanneer toegevoegd aan de huidige URI‑instantie, **toUri** oplevert. Als de hostnaam of het schema verschillend is, retourneert deze methode een [String](../../string/) die de **uri**‑parameter vertegenwoordigt.

## Zie ook

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
