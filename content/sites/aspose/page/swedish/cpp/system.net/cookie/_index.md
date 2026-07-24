---
title: "System::Net::Cookie-klass"
linktitle: "Cookie"
second_title: "Aspose.Page för C++"
description: "System::Net::Cookie-klass. Representerar en HTTP-cookie. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Wrapa alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 100
url: /sv/cpp/system.net/cookie/
---
## Cookie class


Representerar en HTTP-cookie. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Wrapa alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class Cookie : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() | Skapar en kopia av den aktuella instansen. |
| [Cookie](./cookie/)() | Skapar en ny instans. |
| [Cookie](./cookie/)(String, String) | Skapar en ny instans. |
| [Cookie](./cookie/)(String, String, String) | Skapar en ny instans. |
| [Cookie](./cookie/)(String, String, String, String) | Skapar en ny instans. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Jämför objekt med C# [Object.Equals](../../system/object/equals/) semantik. |
| [get_Comment](./get_comment/)() const | Hämtar värdet för attributet 'Comment'. |
| [get_CommentUri](./get_commenturi/)() const | Hämtar värdet för attributet 'CommentURL'. |
| [get_Discard](./get_discard/)() const | Hämtar värdet för attributet 'Discard'. |
| [get_Domain](./get_domain/)() const | Hämtar värdet för attributet 'Domain'. |
| [get_DomainImplicit](./get_domainimplicit/)() | Hämtar ett värde som indikerar om domänen är implicit. |
| [get_DomainKey](./get_domainkey/)() const | Returnerar domännyckeln. |
| [get_Expired](./get_expired/)() | Hämtar ett värde som indikerar om cookien har gått ut. |
| [get_Expires](./get_expires/)() | Hämtar värdet för attributet 'Expires'. |
| [get_HttpOnly](./get_httponly/)() const | Hämtar värdet för attributet 'HttpOnly'. |
| [get_Name](./get_name/)() const | Hämtar cookiens namn. |
| [get_Path](./get_path/)() const | Hämtar värdet för attributet 'Path'. |
| [get_Plain](./get_plain/)() const | Returnerar ett värde som indikerar om cookie-specifikationen är 'Plain'. |
| [get_Port](./get_port/)() const | Hämtar värdet för attributet 'Port'. |
| [get_PortList](./get_portlist/)() const | Returnerar samlingen av värdena för attributet 'Port'. |
| [get_Secure](./get_secure/)() const | Hämtar värdet för attributet 'Secure'. |
| [get_TimeStamp](./get_timestamp/)() const | Returnerar tiden då cookien skapades. |
| [get_Value](./get_value/)() const | Hämtar cookie's värde. |
| [get_Variant](./get_variant/)() const | Hämtar cookie's specifikation. |
| [get_Version](./get_version/)() const | Hämtar '[Version](../../system/version/)' attributets värde. |
| [GetHashCode](./gethashcode/)() const override | Analog till C# [Object.GetHashCode()](../../system/object/gethashcode/)-metoden. Möjliggör hashning av anpassade objekt. |
| [InternalSetName](./internalsetname/)(String) | Denna metod anropas av andra metoder för att sätta ett metodnamn. |
| [set_Comment](./set_comment/)(String) | Sätter 'Comment' attributets värde. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | Sätter 'CommentURL' attributets värde. |
| [set_Discard](./set_discard/)(bool) | Sätter 'Discard' attributets värde. |
| [set_Domain](./set_domain/)(String) | Sätter 'Domain' attributets värde. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | Sätter ett värde som indikerar om domänen är implicit. |
| [set_Expired](./set_expired/)(bool) | Sätter ett värde som indikerar om cookien har gått ut. |
| [set_Expires](./set_expires/)(DateTime) | Sätter 'Expires' attributets värde. |
| [set_HttpOnly](./set_httponly/)(bool) | Sätter 'HttpOnly' attributets värde. |
| [set_Name](./set_name/)(String) | Sätter cookie's namn. |
| [set_Path](./set_path/)(String) | Sätter 'Path' attributets värde. |
| [set_Port](./set_port/)(String) | Sätter 'Port' attributets värde. |
| [set_Secure](./set_secure/)(bool) | Sätter 'Secure' attributets värde. |
| [set_Value](./set_value/)(String) | Sätter cookie's värde. |
| [set_Variant](./set_variant/)(CookieVariant) | Sätter cookie's specifikation. |
| [set_Version](./set_version/)(int32_t) | Sätter '[Version](../../system/version/)' attributets värde. |
| [ToServerString](./toserverstring/)() | Serialiserar den aktuella instansen till strängrepresentationen. |
| [ToString](./tostring/)() const override | Analog till C# [Object.ToString()](../../system/object/tostring/) metod. Gör det möjligt att konvertera anpassade objekt till sträng. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | Verifierar och sätter standardattributens värden. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | Det 'Comment' attributets namn. |
| static [CommentUrlAttributeName](./commenturlattributename/) | Det 'CommentURL' attributets namn. |
| static [DiscardAttributeName](./discardattributename/) | Det 'Discard' attributets namn. |
| static [DomainAttributeName](./domainattributename/) | Det 'Domain' attributets namn. |
| static [EqualsLiteral](./equalsliteral/) | Separatorn som används för att separera namn och värde för ett attribut. |
| static [ExpiresAttributeName](./expiresattributename/) | Namnet på attributet 'Expires'. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | Namnet på attributet 'HttpOnly'. |
| static [MaxAgeAttributeName](./maxageattributename/) | Namnet på attributet 'Max-Age'. |
| static [MaxSupportedVersion](./maxsupportedversion/) | RTTI-information. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | Strängrepresentationen av den maximalt stödda versionen. |
| static [PathAttributeName](./pathattributename/) | Namnet på attributet 'Path'. |
| static [PortAttributeName](./portattributename/) | Namnet på attributet 'Port'. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | Arrayen som innehåller avgränsare för värdena i attributet 'Port'. |
| static [QuotesLiteral](./quotesliteral/) | Symbolen som används för att omsluta attributets delar. |
| static [ReservedToName](./reservedtoname/) | Ett värde som är reserverat för kakans namn. |
| static [ReservedToValue](./reservedtovalue/) | Ett värde som är reserverat för kakans värde. |
| static [SecureAttributeName](./secureattributename/) | Namnet på attributet 'Secure'. |
| static [SeparatorLiteral](./separatorliteral/) | Attributseparatorn. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | Prefixet för de speciella attributens namn. |
| static [VersionAttributeName](./versionattributename/) | Namnet på attributet '[Version](../../system/version/)'. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
