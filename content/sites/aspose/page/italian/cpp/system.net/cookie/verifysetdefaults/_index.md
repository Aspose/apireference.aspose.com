---
title: "System::Net::Cookie::VerifySetDefaults method"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Page per C++"
description: "System::Net::Cookie::VerifySetDefaults metodo. Verifica e imposta i valori predefiniti dell'attributo'' in C++."
type: docs
weight: 4200
url: /it/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Verifica e imposta i valori predefiniti degli attributi.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| variante | CookieVariant | La specifica del cookie. |
| uri | System::SharedPtr\<Uri\> | L'istanza della classe Uri che viene usata per inizializzare i campi interni. |
| isLocalDomain | bool | Un valore che indica se il cookie è inserito nel dominio locale. |
| localDomain | String | Un nome di dominio locale. |
| setDefault | bool | Un valore che indica se gli attributi del cookie devono essere inizializzati usando i loro valori predefiniti. |
| shouldThrow | bool | Un valore che indica se un'eccezione deve essere sollevata quando i valori specificati sono non validi. |

### ReturnValue

True quando tutti i valori sono validi, altrimenti false.

## Vedi anche

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
