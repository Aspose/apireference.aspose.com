---
title: "System::Net::Cookie::VerifySetDefaults Methode"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Font für C++"
description: "System::Net::Cookie::VerifySetDefaults Methode. Überprüft und setzt die Standardwerte des Attributs in C++."
type: docs
weight: 4200
url: /de/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Überprüft und setzt die Standardwerte des Attributs.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| variant | CookieVariant | Die cookie''s Spezifikation. |
| uri | System::SharedPtr\<Uri\> | Die Uri-Klasseninstanz, die zum Initialisieren der internen Felder verwendet wird. |
| isLocalDomain | bool | Ein Wert, der angibt, ob das Cookie in die lokale Domäne eingefügt wird. |
| localDomain | String | Ein lokaler Domänenname. |
| setDefault | bool | Ein Wert, der angibt, ob die Attribute des Cookies mit ihren Standardwerten initialisiert werden müssen. |
| shouldThrow | bool | Ein Wert, der angibt, ob eine Ausnahme ausgelöst werden soll, wenn die angegebenen Werte ungültig sind. |

### ReturnValue

Wahr, wenn alle Werte gültig sind, sonst falsch.

## Siehe auch

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
