---
title: "System::Net::Http::Headers::AuthenticationHeaderValue classe"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue classe. Représente les valeurs des en-têtes ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'' et ''Proxy-Authenticate''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


Représente les valeurs des en-têtes 'Authorization', 'ProxyAuthorization', 'WWW-Authenticate' et 'Proxy-Authenticate'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | Constructeur. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | Constructeur. |
| [Clone](./clone/)() override | Informations RTTI. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Parameter](./get_parameter/)() | Obtient les informations d'identification contenant les informations d'authentification. |
| [get_Scheme](./get_scheme/)() | Informations RTTI. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Analyse la chaîne spécifiée et renvoie le dernier indice de la représentation de la chaîne. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [AuthenticationHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | Tentative de conversion d'une chaîne passée en une instance de la classe [AuthenticationHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
