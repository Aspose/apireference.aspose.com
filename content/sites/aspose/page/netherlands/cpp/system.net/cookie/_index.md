---
title: "System::Net::Cookie klasse"
linktitle: "Cookie"
second_title: "Aspose.Page voor C++"
description: "System::Net::Cookie class. Vertegenwoordigt een HTTP-cookie. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.net/cookie/
---
## Cookie class


Vertegenwoordigt een HTTP-cookie. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Cookie : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Maakt een kopie van de huidige instantie. |
| [Cookie](./cookie/)() | Construeert een nieuw exemplaar. |
| [Cookie](./cookie/)(String, String) | Construeert een nieuw exemplaar. |
| [Cookie](./cookie/)(String, String, String) | Construeert een nieuw exemplaar. |
| [Cookie](./cookie/)(String, String, String, String) | Construeert een nieuw exemplaar. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Comment](./get_comment/)() const | Haalt de waarde van het 'Comment'-attribuut op. |
| [get_CommentUri](./get_commenturi/)() const | Haalt de waarde van het 'CommentURL'-attribuut op. |
| [get_Discard](./get_discard/)() const | Haalt de waarde van het 'Discard'-attribuut op. |
| [get_Domain](./get_domain/)() const | Haalt de waarde van het 'Domain'-attribuut op. |
| [get_DomainImplicit](./get_domainimplicit/)() | Haalt een waarde op die aangeeft of het domein impliciet is. |
| [get_DomainKey](./get_domainkey/)() const | Retourneert de domeinsleutel. |
| [get_Expired](./get_expired/)() | Haalt een waarde op die aangeeft of de cookie is verlopen. |
| [get_Expires](./get_expires/)() | Haalt de waarde van het 'Expires'-attribuut op. |
| [get_HttpOnly](./get_httponly/)() const | Haalt de waarde van het 'HttpOnly'-attribuut op. |
| [get_Name](./get_name/)() const | Haalt de naam van de cookie op. |
| [get_Path](./get_path/)() const | Haalt de waarde van het 'Path'-attribuut op. |
| [get_Plain](./get_plain/)() const | Retourneert een waarde die aangeeft of de cookie-specificatie 'Plain' is. |
| [get_Port](./get_port/)() const | Haalt de waarde van het 'Port'-attribuut op. |
| [get_PortList](./get_portlist/)() const | Retourneert de verzameling van de waarden van het 'Port'-attribuut. |
| [get_Secure](./get_secure/)() const | Haalt de waarde van het 'Secure'-attribuut op. |
| [get_TimeStamp](./get_timestamp/)() const | Retourneert de tijd waarop de cookie is gemaakt. |
| [get_Value](./get_value/)() const | Haalt de waarde van de cookie op. |
| [get_Variant](./get_variant/)() const | Haalt de specificatie van de cookie op. |
| [get_Version](./get_version/)() const | Haalt de waarde van het '[Version](../../system/version/)' attribuut op. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| [InternalSetName](./internalsetname/)(String) | Deze methode wordt door andere methoden aangeroepen om een methodenaam in te stellen. |
| [set_Comment](./set_comment/)(String) | Stelt de waarde van het 'Comment'-attribuut in. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | Stelt de waarde van het 'CommentURL'-attribuut in. |
| [set_Discard](./set_discard/)(bool) | Stelt de waarde van het 'Discard'-attribuut in. |
| [set_Domain](./set_domain/)(String) | Stelt de waarde van het 'Domain'-attribuut in. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | Stelt een waarde in die aangeeft of het domein impliciet is. |
| [set_Expired](./set_expired/)(bool) | Stelt een waarde in die aangeeft of de cookie is verlopen. |
| [set_Expires](./set_expires/)(DateTime) | Stelt de waarde van het 'Expires'-attribuut in. |
| [set_HttpOnly](./set_httponly/)(bool) | Stelt de waarde van het 'HttpOnly'-attribuut in. |
| [set_Name](./set_name/)(String) | Stelt de naam van de cookie in. |
| [set_Path](./set_path/)(String) | Stelt de waarde van het 'Path'-attribuut in. |
| [set_Port](./set_port/)(String) | Stelt de waarde van het 'Port'-attribuut in. |
| [set_Secure](./set_secure/)(bool) | Stelt de waarde van het 'Secure'-attribuut in. |
| [set_Value](./set_value/)(String) | Stelt de waarde van de cookie in. |
| [set_Variant](./set_variant/)(CookieVariant) | Stelt de specificatie van de cookie in. |
| [set_Version](./set_version/)(int32_t) | Stelt de waarde van het '[Version](../../system/version/)' attribuut in. |
| [ToServerString](./toserverstring/)() | Serialiseert de huidige instantie naar de tekenreeksrepresentatie. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | Verifieert en stelt de standaardwaarden van het attribuut in. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | De naam van het attribuut 'Comment'. |
| static [CommentUrlAttributeName](./commenturlattributename/) | De naam van het attribuut 'CommentURL'. |
| static [DiscardAttributeName](./discardattributename/) | De naam van het attribuut 'Discard'. |
| static [DomainAttributeName](./domainattributename/) | De naam van het attribuut 'Domain'. |
| static [EqualsLiteral](./equalsliteral/) | Het scheidingsteken dat wordt gebruikt om de naam en waarde van een attribuut te scheiden. |
| static [ExpiresAttributeName](./expiresattributename/) | De naam van het attribuut 'Expires'. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | De naam van het attribuut 'HttpOnly'. |
| static [MaxAgeAttributeName](./maxageattributename/) | De naam van het attribuut 'Max-Age'. |
| static [MaxSupportedVersion](./maxsupportedversion/) | RTTI-informatie. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | De tekenreeksrepresentatie van de maximaal ondersteunde versie. |
| static [PathAttributeName](./pathattributename/) | De naam van het attribuut 'Path'. |
| static [PortAttributeName](./portattributename/) | De naam van het attribuut 'Port'. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | De array die scheidingstekens bevat voor de waarden van het attribuut 'Port'. |
| static [QuotesLiteral](./quotesliteral/) | Het symbool dat wordt gebruikt om de delen van het attribuut te omhullen. |
| static [ReservedToName](./reservedtoname/) | Een waarde die gereserveerd is voor de cookie-naam. |
| static [ReservedToValue](./reservedtovalue/) | Een waarde die gereserveerd is voor de cookie-waarde. |
| static [SecureAttributeName](./secureattributename/) | De naam van het attribuut 'Secure'. |
| static [SeparatorLiteral](./separatorliteral/) | Het scheidingsteken voor attributen. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | Het voorvoegsel van de namen van speciale attributen. |
| static [VersionAttributeName](./versionattributename/) | De naam van het attribuut '[Version](../../system/version/)'. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
