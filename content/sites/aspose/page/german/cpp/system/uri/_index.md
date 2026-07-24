---
title: "Klasse System::Uri"
linktitle: "Uri"
second_title: "Aspose.Page für C++"
description: "Klasse System::Uri. Einheitlicher Ressourcenbezeichner. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 6700
url: /de/cpp/system/uri/
---
## Uri class


Einheitlicher Ressourcenbezeichner. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class Uri : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | Bestimmt den Typ des angegebenen Hostnamens. |
| static [CheckSchemeName](./checkschemename/)(const String\&) | Bestimmt, ob das angegebene Schema gültig ist. |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | Vergleicht die angegebenen [Uri](./)-Objekte anhand der angegebenen Vergleichsregeln. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Bestimmt, ob die von dem aktuellen und dem angegebenen Objekt dargestellten URIs gleich sind. |
| static [EscapeDataString](./escapedatastring/)(const String\&) | Konvertiert einen String in seine escaped Darstellung. |
| static [EscapeUriString](./escapeuristring/)(const String\&) | Konvertiert einen URI-String in seine escaped Darstellung. |
| static [FromHex](./fromhex/)(char16_t) | Ermittelt den Dezimalwert einer hexadezimalen Ziffer. |
| [get_AbsolutePath](./get_absolutepath/)() const | Gibt den absoluten Pfad der URI zurück. |
| [get_AbsoluteUri](./get_absoluteuri/)() const | Gibt die absolute URI zurück. |
| [get_Authority](./get_authority/)() const | Gibt den Hostnamen und die Portnummer eines Servers zurück. |
| [get_DnsSafeHost](./get_dnssafehost/)() const | Gibt einen nicht-escaped Hostnamen zurück. |
| [get_Fragment](./get_fragment/)() const | Gibt das escaped URI-Fragment zurück. |
| [get_Host](./get_host/)() const | Gibt den Hostnamen zurück. |
| [get_HostNameType](./get_hostnametype/)() const | Gibt den Hostnamentyp zurück. |
| [get_IdnHost](./get_idnhost/)() const | Gibt einen Internationalen Domainnamen des Hosts zurück. |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | Bestimmt, ob die vom aktuellen Objekt dargestellte URI absolut ist. |
| [get_IsDefaultPort](./get_isdefaultport/)() const | Bestimmt, ob die vom aktuellen Objekt dargestellte URI den Standardport für das Schema der URI hat. |
| [get_IsFile](./get_isfile/)() const | Bestimmt, ob die vom aktuellen Objekt dargestellte URI eine Datei ist. |
| [get_IsLoopback](./get_isloopback/)() const | Bestimmt, ob die vom aktuellen Objekt dargestellte URI einen lokalen Host referenziert. |
| [get_IsUnc](./get_isunc/)() const | Bestimmt, ob die vom aktuellen Objekt dargestellte URI ein UNC-Pfad ist. |
| [get_LocalPath](./get_localpath/)() const | Gibt die Betriebssystemdarstellung des Dateinamens zurück, auf den die vom aktuellen Objekt dargestellte URI verweist. |
| [get_OriginalString](./get_originalstring/)() const | Gibt die URI-Zeichenkette zurück, die dem Konstruktor übergeben wurde, als das aktuelle Objekt erstellt wurde. |
| [get_PathAndQuery](./get_pathandquery/)() const | Gibt den absoluten Pfad und die Abfragekomponenten der vom aktuellen Objekt dargestellten URI zurück, getrennt durch ein Fragezeichen (?). |
| [get_Port](./get_port/)() const | Gibt die Portnummer der vom aktuellen Objekt dargestellten URI zurück. |
| [get_Query](./get_query/)() const | Gibt die in der vom aktuellen Objekt dargestellten URI enthaltenen Abfrageinformationen zurück. |
| [get_Scheme](./get_scheme/)() const | Gibt das Schema der vom aktuellen Objekt dargestellten URI zurück. |
| [get_Segments](./get_segments/)() const | Gibt ein Array von Zeichenketten zurück, das die Pfadsegmente der vom aktuellen Objekt dargestellten URI enthält. |
| [get_UserEscaped](./get_userescaped/)() const | Bestimmt, ob die dem Konstruktor des aktuellen Objekts übergebene URI-Zeichenkette vollständig escaped war. |
| [get_UserInfo](./get_userinfo/)() const | Gibt einen Benutzernamen, ein Passwort und weitere Benutzerinformationen zurück, die mit der vom aktuellen Objekt dargestellten URI verknüpft sind. |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | Gibt die angegebenen Komponenten der vom aktuellen Objekt dargestellten URI zurück, wobei das angegebene Escaping verwendet wird. |
| [GetHashCode](./gethashcode/)() const override | Ermittelt den Hashcode für die URI. |
| [GetLeftPart](./getleftpart/)(UriPartial) | Gibt den angegebenen Teil der vom aktuellen Objekt dargestellten URI zurück. |
| static [HexEscape](./hexescape/)(char16_t) | Gibt das hexadezimale Äquivalent des angegebenen Zeichens zurück. |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | Konvertiert die angegebene hexadezimale Darstellung eines Zeichens in ein Zeichen. |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | Bestimmt, ob die vom aktuellen [Uri](./)-Objekt dargestellte URI die Basis der vom angegebenen [Uri](./)-Objekt dargestellten URI ist. |
| static [IsHexDigit](./ishexdigit/)(char16_t) | Bestimmt, ob das angegebene Zeichen eine gültige hexadezimale Ziffer darstellt. |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | Bestimmt, ob ein Zeichen in der angegebenen Zeichenkette an der angegebenen Position hexadezimal codiert ist. |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | Gibt an, ob die zum Erstellen dieses [Uri](./) verwendete Zeichenfolge wohlgeformt war und nicht weiter escaped werden muss. |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | Bestimmt, ob die angegebene Zeichenfolge ein wohlgeformter URI ist. |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | Bestimmt die Differenz zwischen zwei [Uri](./)-Instanzen. |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | Bestimmt die Differenz zwischen den URIs, die von dem aktuellen und dem angegebenen [Uri](./)-Objekt dargestellt werden. |
| [ToString](./tostring/)() const override | Gibt die Zeichenkettenrepräsentation des von dem aktuellen Objekt dargestellten URI zurück. |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | Erstellt ein [Uri](./)-Objekt, das den angegebenen URI darstellt; ein Argument gibt die Art des URI an. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | Erstellt ein [Uri](./)-Objekt aus dem angegebenen [Uri](./)-Objekt, das den Basis-URI darstellt, und der Zeichenkettenrepräsentation des relativen URI. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | Erstellt ein [Uri](./)-Objekt aus den angegebenen Basis- und relativen URIs. |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | Entschlüsselt die angegebene escaped Zeichenfolge. |
| [Uri](./uri/)(const String\&) | Erstellt ein [Uri](./)-Objekt, das den angegebenen URI darstellt. |
| [Uri](./uri/)(const String\&, bool) | Erstellt ein [Uri](./)-Objekt, das den angegebenen URI darstellt; ein Argument gibt an, ob der URI escaped werden soll. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | Erstellt ein [Uri](./)-Objekt aus dem angegebenen [Uri](./)-Objekt, das den Basis-URI darstellt, und der Zeichenkettenrepräsentation des relativen URI; ein Argument gibt an, ob der URI escaped werden soll. |
| [Uri](./uri/)(const String\&, UriKind) | Erstellt ein [Uri](./)-Objekt, das den angegebenen URI darstellt; ein Argument gibt die Art des URI an. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | Erstellt ein [Uri](./)-Objekt aus den angegebenen Basis- und relativen URIs. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | Erstellt ein [Uri](./)-Objekt aus den angegebenen Basis- und relativen URIs. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | Gibt die Zeichen an, die das Kommunikationsprotokollschema vom Adressteil des [Uri](./) trennen. |
| static [UriSchemeFile](./urischemefile/) | Gibt an, dass das [Uri](./) ein Zeiger auf eine Datei ist. |
| static [UriSchemeFtp](./urischemeftp/) | Gibt an, dass das [Uri](./) über das File Transfer Protocol (FTP) zugegriffen wird. |
| static [UriSchemeGopher](./urischemegopher/) | Gibt an, dass das [Uri](./) über das Gopher-Protokoll zugegriffen wird. |
| static [UriSchemeHttp](./urischemehttp/) | Gibt an, dass das [Uri](./) über das Hypertext Transfer Protocol (HTTP) zugegriffen wird. |
| static [UriSchemeHttps](./urischemehttps/) | Gibt an, dass das [Uri](./) über das Secure Hypertext Transfer Protocol (HTTPS) zugegriffen wird. |
| static [UriSchemeMailto](./urischememailto/) | Gibt an, dass das [Uri](./) eine E-Mail-Adresse ist und über das Simple Mail Transfer Protocol (SMTP) zugegriffen wird. |
| static [UriSchemeNetPipe](./urischemenetpipe/) | Gibt an, dass das [Uri](./) über das NetPipe-Schema, das von [Windows](../../system.windows/) Communication Foundation verwendet wird, zugegriffen wird. |
| static [UriSchemeNetTcp](./urischemenettcp/) | Gibt an, dass das [Uri](./) über das NetTcp-Schema, das von [Windows](../../system.windows/) Communication Foundation verwendet wird, zugegriffen wird. |
| static [UriSchemeNews](./urischemenews/) | Gibt an, dass das [Uri](./) eine Internet-Newsgroup ist und über das Network News Transport Protocol (NNTP) zugegriffen wird. |
| static [UriSchemeNntp](./urischemenntp/) | Gibt an, dass das [Uri](./) eine Internet-Newsgroup ist und über das Network News Transport Protocol (NNTP) zugegriffen wird. |
## Hinweise



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

## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
