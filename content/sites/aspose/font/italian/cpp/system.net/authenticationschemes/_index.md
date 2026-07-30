---
title: "System::Net::AuthenticationSchemes enum"
linktitle: "AuthenticationSchemes"
second_title: "Aspose.Font per C++"
description: "System::Net::AuthenticationSchemes enum. Elenca i protocolli di autenticazione in C++."
type: docs
weight: 4100
url: /it/cpp/system.net/authenticationschemes/
---
## AuthenticationSchemes enum


Enumera gli schemi di autenticazione. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza tale puntatore per passarlo alle funzioni come argomento.

```cpp
enum class AuthenticationSchemes
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Non è richiesta alcuna autenticazione. |
| Digest | 1 | Autenticazione di accesso Digest. |
| Negotiate | 2 | Negozia con il client quale protocollo di autenticazione sarà utilizzato (NTML o Kerberos). |
| Ntlm | 4 | Autenticazione NTLM. |
| Basic | 8 | Autenticazione Basic. |
| Anonymous | 32768 | Autenticazione anonima. |
| IntegratedWindowsAuthentication | n/a | Autenticazione [Windows](../../system.windows/). |

## Vedi anche

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
