---
title: "classe System::Net::Cookie"
linktitle: "Cookie"
second_title: "Aspose.Font per C++"
description: "classe System::Net::Cookie. Rappresenta un cookie HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.net/cookie/
---
## Cookie class


Rappresenta un cookie HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Cookie : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Crea una copia dell'istanza corrente. |
| [Cookie](./cookie/)() | Crea una nuova istanza. |
| [Cookie](./cookie/)(String, String) | Crea una nuova istanza. |
| [Cookie](./cookie/)(String, String, String) | Crea una nuova istanza. |
| [Cookie](./cookie/)(String, String, String, String) | Crea una nuova istanza. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() const | Ottiene il valore dell'attributo 'Comment'. |
| [get_CommentUri](./get_commenturi/)() const | Ottiene il valore dell'attributo 'CommentURL'. |
| [get_Discard](./get_discard/)() const | Ottiene il valore dell'attributo 'Discard'. |
| [get_Domain](./get_domain/)() const | Ottiene il valore dell'attributo 'Domain'. |
| [get_DomainImplicit](./get_domainimplicit/)() | Ottiene un valore che indica se il dominio è implicito. |
| [get_DomainKey](./get_domainkey/)() const | Restituisce la chiave del dominio. |
| [get_Expired](./get_expired/)() | Ottiene un valore che indica se il cookie è scaduto. |
| [get_Expires](./get_expires/)() | Ottiene il valore dell'attributo 'Expires'. |
| [get_HttpOnly](./get_httponly/)() const | Ottiene il valore dell'attributo 'HttpOnly'. |
| [get_Name](./get_name/)() const | Ottiene il nome del cookie. |
| [get_Path](./get_path/)() const | Ottiene il valore dell'attributo 'Path'. |
| [get_Plain](./get_plain/)() const | Restituisce un valore che indica se la specifica del cookie è 'Plain'. |
| [get_Port](./get_port/)() const | Ottiene il valore dell'attributo 'Port'. |
| [get_PortList](./get_portlist/)() const | Restituisce la collezione dei valori dell'attributo 'Port'. |
| [get_Secure](./get_secure/)() const | Ottiene il valore dell'attributo 'Secure'. |
| [get_TimeStamp](./get_timestamp/)() const | Restituisce il tempo in cui il cookie è stato creato. |
| [get_Value](./get_value/)() const | Ottiene il valore del cookie. |
| [get_Variant](./get_variant/)() const | Ottiene la specifica del cookie. |
| [get_Version](./get_version/)() const | Ottiene il valore dell'attributo '[Version](../../system/version/)'. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| [InternalSetName](./internalsetname/)(String) | Questo metodo è chiamato da altri metodi per impostare il nome di un metodo. |
| [set_Comment](./set_comment/)(String) | Imposta il valore dell'attributo 'Comment'. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | Imposta il valore dell'attributo 'CommentURL'. |
| [set_Discard](./set_discard/)(bool) | Imposta il valore dell'attributo 'Discard'. |
| [set_Domain](./set_domain/)(String) | Imposta il valore dell'attributo 'Domain'. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | Imposta un valore che indica se il dominio è implicito. |
| [set_Expired](./set_expired/)(bool) | Imposta un valore che indica se il cookie è scaduto. |
| [set_Expires](./set_expires/)(DateTime) | Imposta il valore dell'attributo 'Expires'. |
| [set_HttpOnly](./set_httponly/)(bool) | Imposta il valore dell'attributo 'HttpOnly'. |
| [set_Name](./set_name/)(String) | Imposta il nome del cookie. |
| [set_Path](./set_path/)(String) | Imposta il valore dell'attributo 'Path'. |
| [set_Port](./set_port/)(String) | Imposta il valore dell'attributo 'Port'. |
| [set_Secure](./set_secure/)(bool) | Imposta il valore dell'attributo 'Secure'. |
| [set_Value](./set_value/)(String) | Imposta il valore del cookie. |
| [set_Variant](./set_variant/)(CookieVariant) | Imposta la specifica del cookie. |
| [set_Version](./set_version/)(int32_t) | Imposta il valore dell'attributo '[Version](../../system/version/)'. |
| [ToServerString](./toserverstring/)() | Serializza l'istanza corrente nella rappresentazione stringa. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | Verifica e imposta i valori predefiniti dell'attributo. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | Il nome dell'attributo 'Comment'. |
| static [CommentUrlAttributeName](./commenturlattributename/) | Il nome dell'attributo 'CommentURL'. |
| static [DiscardAttributeName](./discardattributename/) | Il nome dell'attributo 'Discard'. |
| static [DomainAttributeName](./domainattributename/) | Il nome dell'attributo 'Domain'. |
| static [EqualsLiteral](./equalsliteral/) | Il separatore usato per separare il nome e il valore di un attributo. |
| static [ExpiresAttributeName](./expiresattributename/) | Il nome dell'attributo 'Expires'. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | Il nome dell'attributo 'HttpOnly'. |
| static [MaxAgeAttributeName](./maxageattributename/) | Il nome dell'attributo 'Max-Age'. |
| static [MaxSupportedVersion](./maxsupportedversion/) | Informazioni RTTI. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | La rappresentazione stringa della versione massima supportata. |
| static [PathAttributeName](./pathattributename/) | Il nome dell'attributo 'Path'. |
| static [PortAttributeName](./portattributename/) | Il nome dell'attributo 'Port'. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | L'array che contiene i delimitatori per i valori dell'attributo 'Port'. |
| static [QuotesLiteral](./quotesliteral/) | Il simbolo usato per racchiudere le parti dell'attributo. |
| static [ReservedToName](./reservedtoname/) | Un valore riservato per il nome del cookie. |
| static [ReservedToValue](./reservedtovalue/) | Un valore riservato per il valore del cookie. |
| static [SecureAttributeName](./secureattributename/) | Il nome dell'attributo 'Secure'. |
| static [SeparatorLiteral](./separatorliteral/) | Il separatore dell'attributo. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | Il prefisso dei nomi degli attributi speciali. |
| static [VersionAttributeName](./versionattributename/) | Il nome dell'attributo '[Version](../../system/version/)'. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
