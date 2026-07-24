---
title: "System::Uri-klasse"
linktitle: "Uri"
second_title: "Aspose.Page voor C++"
description: "System::Uri-klasse. Uniforme resource‑identifier. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 6700
url: /nl/cpp/system/uri/
---
## Uri class


Uniforme resource‑identifier. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../makeobject/)-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Uri : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | Bepaalt het type van de opgegeven hostnaam. |
| static [CheckSchemeName](./checkschemename/)(const String\&) | Bepaalt of het opgegeven schema geldig is. |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | Vergelijkt de opgegeven [Uri](./)-objecten met behulp van de opgegeven vergelijkingsregels. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Bepaalt of de URI's die door het huidige en opgegeven object worden vertegenwoordigd gelijk zijn. |
| static [EscapeDataString](./escapedatastring/)(const String\&) | Converteert een string naar zijn escaped representatie. |
| static [EscapeUriString](./escapeuristring/)(const String\&) | Converteert een URI-string naar zijn escaped representatie. |
| static [FromHex](./fromhex/)(char16_t) | Haalt de decimale waarde van een hexadecimale digit op. |
| [get_AbsolutePath](./get_absolutepath/)() const | Retourneert het absolute pad van de URI. |
| [get_AbsoluteUri](./get_absoluteuri/)() const | Retourneert de absolute URI. |
| [get_Authority](./get_authority/)() const | Retourneert de hostnaam en het poortnummer voor een server. |
| [get_DnsSafeHost](./get_dnssafehost/)() const | Retourneert een unescaped hostnaam. |
| [get_Fragment](./get_fragment/)() const | Retourneert het escaped URI-fragment. |
| [get_Host](./get_host/)() const | Retourneert de hostnaam. |
| [get_HostNameType](./get_hostnametype/)() const | Retourneert het type hostnaam. |
| [get_IdnHost](./get_idnhost/)() const | Retourneert een International Domain Name van de host. |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | Bepaalt of de URI die door het huidige object wordt weergegeven absoluut is. |
| [get_IsDefaultPort](./get_isdefaultport/)() const | Bepaalt of de URI die door het huidige object wordt weergegeven een standaardpoort heeft voor het schema van de URI. |
| [get_IsFile](./get_isfile/)() const | Bepaalt of de URI die door het huidige object wordt weergegeven een bestand is. |
| [get_IsLoopback](./get_isloopback/)() const | Bepaalt of de URI die door het huidige object wordt weergegeven een lokale host referereert. |
| [get_IsUnc](./get_isunc/)() const | Bepaalt of de URI die door het huidige object wordt weergegeven een UNC-pad is. |
| [get_LocalPath](./get_localpath/)() const | Retourneert de besturingssysteemrepresentatie van de bestandsnaam waarnaar verwezen wordt door de URI die door het huidige object wordt weergegeven. |
| [get_OriginalString](./get_originalstring/)() const | Retourneert de URI-string die aan de constructor werd doorgegeven toen het huidige object werd geconstrueerd. |
| [get_PathAndQuery](./get_pathandquery/)() const | Retourneert het absolute pad en de query‑componenten van de URI die door het huidige object wordt weergegeven, gescheiden door een vraagteken (?). |
| [get_Port](./get_port/)() const | Retourneert het poortnummer van de URI die door het huidige object wordt weergegeven. |
| [get_Query](./get_query/)() const | Retourneert de query‑informatie die is opgenomen in de URI die door het huidige object wordt weergegeven. |
| [get_Scheme](./get_scheme/)() const | Retourneert het schema van de URI die door het huidige object wordt weergegeven. |
| [get_Segments](./get_segments/)() const | Retourneert een array van strings die de padsegmenten van de URI die door het huidige object wordt weergegeven bevatten. |
| [get_UserEscaped](./get_userescaped/)() const | Bepaalt of de URI-string die aan de constructor van het huidige object werd doorgegeven volledig escaped was. |
| [get_UserInfo](./get_userinfo/)() const | Retourneert een gebruikersnaam, wachtwoord en andere gebruikersinformatie die gekoppeld is aan de URI die door het huidige object wordt weergegeven. |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | Retourneert de opgegeven componenten van de URI die door het huidige object wordt weergegeven met de opgegeven escaping. |
| [GetHashCode](./gethashcode/)() const override | Haalt de hashcode op voor de URI. |
| [GetLeftPart](./getleftpart/)(UriPartial) | Retourneert het opgegeven gedeelte van de URI die door het huidige object wordt weergegeven. |
| static [HexEscape](./hexescape/)(char16_t) | Retourneert een hexadecimale weergave van het opgegeven teken. |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | Converteert de opgegeven hexadecimale weergave van een teken naar een teken. |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | Bepaalt of de URI die door het huidige [Uri](./) object wordt weergegeven een basis-URI is van de URI die door het opgegeven [Uri](./) object wordt weergegeven. |
| static [IsHexDigit](./ishexdigit/)(char16_t) | Bepaalt of het opgegeven teken een geldig hexadecimaal cijfer vertegenwoordigt. |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | Bepaalt of een teken in de opgegeven string op de opgegeven positie hexadecimaal gecodeerd is. |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | Geeft aan of de string die is gebruikt om deze [Uri](./) te construeren goed gevormd was en niet verder geëscaped hoeft te worden. |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | Bepaalt of de opgegeven string een goed gevormde URI is. |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | Bepaalt het verschil tussen twee [Uri](./) instanties. |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | Bepaalt het verschil tussen de URI's die door het huidige en het opgegeven [Uri](./) object worden weergegeven. |
| [ToString](./tostring/)() const override | Retourneert de stringrepresentatie van de URI die door het huidige object wordt weergegeven. |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | Construeert een [Uri](./) object dat de opgegeven URI weergeeft; een argument geeft het type URI aan. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | Construeert een [Uri](./) object van het opgegeven [Uri](./) object dat de basis-URI weergeeft en de stringrepresentatie van de relatieve URI. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | Construeert een [Uri](./) object van de opgegeven basis- en relatieve URI's. |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | Ontschakelt de opgegeven ge-escaped string. |
| [Uri](./uri/)(const String\&) | Construeert een [Uri](./) object dat de opgegeven URI weergeeft. |
| [Uri](./uri/)(const String\&, bool) | Construeert een [Uri](./) object dat de opgegeven URI weergeeft; een argument geeft aan of de URI ge-escaped moet worden. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | Construeert een [Uri](./) object van het opgegeven [Uri](./) object dat de basis-URI weergeeft en de stringrepresentatie van de relatieve URI; een argument geeft aan of de URI ge-escaped moet worden. |
| [Uri](./uri/)(const String\&, UriKind) | Construeert een [Uri](./) object dat de opgegeven URI weergeeft; een argument geeft het type URI aan. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | Construeert een [Uri](./) object van de opgegeven basis- en relatieve URI's. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | Construeert een [Uri](./) object van de opgegeven basis- en relatieve URI's. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | Specificeert de tekens die het communicatieschema scheiden van het adresgedeelte van de [Uri](./). |
| static [UriSchemeFile](./urischemefile/) | Specificeert dat de [Uri](./) een verwijzing naar een bestand is. |
| static [UriSchemeFtp](./urischemeftp/) | Specificeert dat de [Uri](./) wordt benaderd via het File Transfer Protocol. |
| static [UriSchemeGopher](./urischemegopher/) | Specificeert dat de [Uri](./) wordt benaderd via het Gopher-protocol. |
| static [UriSchemeHttp](./urischemehttp/) | Specificeert dat de [Uri](./) wordt benaderd via het Hypertext Transfer Protocol. |
| static [UriSchemeHttps](./urischemehttps/) | Geeft aan dat de [Uri](./) wordt benaderd via het Secure Hypertext Transfer Protocol. |
| static [UriSchemeMailto](./urischememailto/) | Geeft aan dat de [Uri](./) een e-mailadres is en wordt benaderd via het Simple Mail Transport Protocol. |
| static [UriSchemeNetPipe](./urischemenetpipe/) | Geeft aan dat de [Uri](./) wordt benaderd via het NetPipe‑schema dat wordt gebruikt door [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNetTcp](./urischemenettcp/) | Geeft aan dat de [Uri](./) wordt benaderd via het NetTcp‑schema dat wordt gebruikt door [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNews](./urischemenews/) | Geeft aan dat de [Uri](./) een Internet-nieuwsgroep is en wordt benaderd via het Network News Transport Protocol. |
| static [UriSchemeNntp](./urischemenntp/) | Geeft aan dat de [Uri](./) een Internet-nieuwsgroep is en wordt benaderd via het Network News Transport Protocol. |
## Opmerkingen



```cpp
#include "system/smart_ptr.h"
#include "system/uri.h"
#include <iostream>

int main()
{
  const auto uri = System::MakeObject<System::Uri>(u"https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/");

std::cout <<
  "AbsolutePath: " << uri->get_AbsolutePath() << std::endl <<
  "AbsoluteUri: " << uri->get_AbsoluteUri() << std::endl <<
  "Authority: " << uri->get_Authority() << std::endl <<
  "DnsSafeHost: " << uri->get_DnsSafeHost() << std::endl <<
  "Fragment: " << uri->get_Fragment() << std::endl <<
  "Host: " << uri->get_Host() << std::endl <<
  "IdnHost: " << uri->get_IdnHost() << std::endl <<
  "LocalPath: " << uri->get_LocalPath() << std::endl <<
  "OriginalString: " << uri->get_OriginalString() << std::endl <<
  "PathAndQuery: " << uri->get_PathAndQuery() << std::endl <<
  "Port: " << uri->get_Port() << std::endl <<
  "Query: " << uri->get_Query() << std::endl <<
  "Scheme: " << uri->get_Scheme() << std::endl;

  return 0;
}
/*
This code example produces the following output:
AbsolutePath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
AbsoluteUri: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Authority: docs.codeporting.com
DnsSafeHost: docs.codeporting.com
Fragment:
Host: docs.codeporting.com
IdnHost: docs.codeporting.com
LocalPath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
OriginalString: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
PathAndQuery: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Port: 443
Query:
Scheme: https
*/
```

## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
