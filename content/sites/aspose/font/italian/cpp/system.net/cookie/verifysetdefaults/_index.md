---
title: "System::Net::Cookie::VerifySetDefaults metodo"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Font per C++"
description: "System::Net::Cookie::VerifySetDefaults metodo. Verifica e imposta i valori dell'attributo'' di default in C++."
type: docs
weight: 4200
url: /it/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Verifica e imposta i valori predefiniti dell'attributo.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| variant | CookieVariant | La specifica del cookie. |
| uri | System::SharedPtr\<Uri\> | L'istanza della classe Uri utilizzata per inizializzare i campi interni. |
| isLocalDomain | bool | Un valore che indica se il cookie è inserito nel dominio locale. |
| localDomain | Stringa | Un nome di dominio locale. |
| setDefault | bool | Un valore che indica se gli attributi del cookie devono essere inizializzati usando i loro valori predefiniti. |
| shouldThrow | bool | Un valore che indica se deve essere lanciata un'eccezione quando i valori specificati non sono validi. |

### ReturnValue

Vero quando tutti i valori sono validi, altrimenti falso.

## Vedi anche

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
