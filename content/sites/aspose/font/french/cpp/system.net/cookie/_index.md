---
title: "System::Net::Cookie classe"
linktitle: "Cookie"
second_title: "Aspose.Font pour C++"
description: "System::Net::Cookie classe. Représente un cookie HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() fonction. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.net/cookie/
---
## Cookie class


Représente un cookie HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Cookie : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Crée une copie de l'instance actuelle. |
| [Cookie](./cookie/)() | Construit une nouvelle instance. |
| [Cookie](./cookie/)(String, String) | Construit une nouvelle instance. |
| [Cookie](./cookie/)(String, String, String) | Construit une nouvelle instance. |
| [Cookie](./cookie/)(String, String, String, String) | Construit une nouvelle instance. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() const | Obtient la valeur de l'attribut 'Comment'. |
| [get_CommentUri](./get_commenturi/)() const | Obtient la valeur de l'attribut 'CommentURL'. |
| [get_Discard](./get_discard/)() const | Obtient la valeur de l'attribut 'Discard'. |
| [get_Domain](./get_domain/)() const | Obtient la valeur de l'attribut 'Domain'. |
| [get_DomainImplicit](./get_domainimplicit/)() | Obtient une valeur indiquant si le domaine est implicite. |
| [get_DomainKey](./get_domainkey/)() const | Renvoie la clé du domaine. |
| [get_Expired](./get_expired/)() | Obtient une valeur indiquant si le cookie a expiré. |
| [get_Expires](./get_expires/)() | Obtient la valeur de l'attribut 'Expires'. |
| [get_HttpOnly](./get_httponly/)() const | Obtient la valeur de l'attribut 'HttpOnly'. |
| [get_Name](./get_name/)() const | Obtient le nom du cookie. |
| [get_Path](./get_path/)() const | Obtient la valeur de l'attribut 'Path'. |
| [get_Plain](./get_plain/)() const | Renvoie une valeur indiquant si la spécification du cookie est 'Plain'. |
| [get_Port](./get_port/)() const | Obtient la valeur de l'attribut 'Port'. |
| [get_PortList](./get_portlist/)() const | Renvoie la collection des valeurs de l'attribut 'Port'. |
| [get_Secure](./get_secure/)() const | Obtient la valeur de l'attribut 'Secure'. |
| [get_TimeStamp](./get_timestamp/)() const | Renvoie l'heure à laquelle le cookie a été créé. |
| [get_Value](./get_value/)() const | Obtient la valeur du cookie. |
| [get_Variant](./get_variant/)() const | Obtient la spécification du cookie. |
| [get_Version](./get_version/)() const | Obtient la valeur de l'attribut '[Version](../../system/version/)'. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| [InternalSetName](./internalsetname/)(String) | Cette méthode est appelée par d'autres méthodes pour définir un nom de méthode. |
| [set_Comment](./set_comment/)(String) | Définit la valeur de l'attribut 'Comment'. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | Définit la valeur de l'attribut 'CommentURL'. |
| [set_Discard](./set_discard/)(bool) | Définit la valeur de l'attribut 'Discard'. |
| [set_Domain](./set_domain/)(String) | Définit la valeur de l'attribut 'Domain'. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | Définit une valeur qui indique si le domaine est implicite. |
| [set_Expired](./set_expired/)(bool) | Définit une valeur qui indique si le cookie a expiré. |
| [set_Expires](./set_expires/)(DateTime) | Définit la valeur de l'attribut 'Expires'. |
| [set_HttpOnly](./set_httponly/)(bool) | Définit la valeur de l'attribut 'HttpOnly'. |
| [set_Name](./set_name/)(String) | Définit le nom du cookie. |
| [set_Path](./set_path/)(String) | Définit la valeur de l'attribut 'Path'. |
| [set_Port](./set_port/)(String) | Définit la valeur de l'attribut 'Port'. |
| [set_Secure](./set_secure/)(bool) | Définit la valeur de l'attribut 'Secure'. |
| [set_Value](./set_value/)(String) | Définit la valeur du cookie. |
| [set_Variant](./set_variant/)(CookieVariant) | Définit la spécification du cookie. |
| [set_Version](./set_version/)(int32_t) | Définit la valeur de l'attribut '[Version](../../system/version/)'. |
| [ToServerString](./toserverstring/)() | Sérialise l'instance actuelle en représentation sous forme de chaîne. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | Vérifie et définit les valeurs par défaut de l'attribut. |
## Champs

| Champ | Description |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | Le nom de l'attribut 'Comment'. |
| static [CommentUrlAttributeName](./commenturlattributename/) | Le nom de l'attribut 'CommentURL'. |
| static [DiscardAttributeName](./discardattributename/) | Le nom de l'attribut 'Discard'. |
| static [DomainAttributeName](./domainattributename/) | Le nom de l'attribut 'Domain'. |
| static [EqualsLiteral](./equalsliteral/) | Le séparateur utilisé pour séparer le nom et la valeur d'un attribut. |
| static [ExpiresAttributeName](./expiresattributename/) | Le nom de l'attribut 'Expires'. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | Le nom de l'attribut 'HttpOnly'. |
| static [MaxAgeAttributeName](./maxageattributename/) | Le nom de l'attribut 'Max-Age'. |
| static [MaxSupportedVersion](./maxsupportedversion/) | Informations RTTI. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | La représentation sous forme de chaîne de la version maximale prise en charge. |
| static [PathAttributeName](./pathattributename/) | Le nom de l'attribut 'Path'. |
| static [PortAttributeName](./portattributename/) | Le nom de l'attribut 'Port'. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | Le tableau qui contient les délimiteurs pour les valeurs de l'attribut 'Port'. |
| static [QuotesLiteral](./quotesliteral/) | Le symbole utilisé pour entourer les parties de l'attribut. |
| static [ReservedToName](./reservedtoname/) | Une valeur réservée au nom du cookie. |
| static [ReservedToValue](./reservedtovalue/) | Une valeur réservée à la valeur du cookie. |
| static [SecureAttributeName](./secureattributename/) | Le nom de l'attribut 'Secure'. |
| static [SeparatorLiteral](./separatorliteral/) | Le séparateur d'attribut. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | Le préfixe des noms des attributs spéciaux. |
| static [VersionAttributeName](./versionattributename/) | Le nom de l'attribut '[Version](../../system/version/)' |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
